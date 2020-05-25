package com.p683ss.ttvideoengine.fetcher;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p683ss.ttvideoengine.AuthTimer;
import com.p683ss.ttvideoengine.AuthTimer.STSAuth;
import com.p683ss.ttvideoengine.Resolution;
import com.p683ss.ttvideoengine.database.VideoModelDBManager;
import com.p683ss.ttvideoengine.database.VideoModelDBManager.CacheInfo;
import com.p683ss.ttvideoengine.fetcher.AWSV4Auth.Builder;
import com.p683ss.ttvideoengine.model.VideoModel;
import com.p683ss.ttvideoengine.net.NetUtils;
import com.p683ss.ttvideoengine.net.TTHTTPNetwork;
import com.p683ss.ttvideoengine.net.TTVNetClient;
import com.p683ss.ttvideoengine.net.TTVNetClient.CompletionListener;
import com.p683ss.ttvideoengine.utils.EngineThreadPool;
import com.p683ss.ttvideoengine.utils.Error;
import com.p683ss.ttvideoengine.utils.TTHelper;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.fetcher.VideoInfoFetcher */
public class VideoInfoFetcher {
    private String[] EnvParamsStrs = {"device_type", "device_id", "ac", "aid", "device_platform", "ab_version", "app_name", "version_code", "os_version", "menifest_version_code", "update_version_code", "user_id", "web_id", "player_version"};
    private String[] ParamsStrs = {"Action", "Version", "video_id", "codec_type", "base64", "url_type", "format_type", "ptoken", "preload", "cdn_type"};
    private boolean isExternNetClient;
    public String mApiString = "";
    private String mAuth;
    private String mAuthAK;
    private String mAuthExpiredTime;
    private String mAuthSK;
    private String mAuthSessionToken;
    private AuthTimer mAuthTimer;
    public boolean mCancelled;
    private Context mContext;
    private JSONObject mEnvParams;
    private Future mFuture;
    private boolean mGetMethodEnable = true;
    private Handler mHandler;
    private String mHost;
    private String mKeyseed;
    public FetcherListener mListener;
    private TTVNetClient mNetworkSession;
    private JSONObject mParams;
    private int mPlayVersion;
    private String mProjectTag;
    private HashMap<String, Resolution> mResolutionMap;
    private int mRetryIndex;
    private int mType;
    private String mURLWithoutParams;
    private boolean mUseVideoModelCache;
    public String mVID;
    public VideoModel mVideoModel;
    private TreeMap<String, String> queryMap;

    /* renamed from: com.ss.ttvideoengine.fetcher.VideoInfoFetcher$FetcherListener */
    public interface FetcherListener {
        void onCompletion(VideoModel videoModel, Error error);

        void onLog(String str);

        void onRetry(Error error);

        void onStatusException(int i, String str);
    }

    /* renamed from: com.ss.ttvideoengine.fetcher.VideoInfoFetcher$MyHandler */
    static class MyHandler extends Handler {
        private final WeakReference<VideoInfoFetcher> mFetcherRef;

        public void handleMessage(Message message) {
            VideoInfoFetcher videoInfoFetcher = (VideoInfoFetcher) this.mFetcherRef.get();
            if (videoInfoFetcher != null) {
                FetcherListener fetcherListener = videoInfoFetcher.mListener;
                if (fetcherListener != null) {
                    if (videoInfoFetcher.mCancelled) {
                        fetcherListener.onLog("fetcher is cancelled");
                        return;
                    }
                    switch (message.what) {
                        case 0:
                            fetcherListener.onRetry((Error) message.obj);
                            return;
                        case 1:
                            fetcherListener.onCompletion(null, (Error) message.obj);
                            return;
                        case 2:
                            VideoModel videoModel = (VideoModel) message.obj;
                            videoInfoFetcher.mVideoModel = videoModel;
                            fetcherListener.onCompletion(videoModel, null);
                            return;
                        case 3:
                            fetcherListener.onStatusException(message.arg1, (String) message.obj);
                            break;
                    }
                }
            }
        }

        public MyHandler(VideoInfoFetcher videoInfoFetcher, Looper looper) {
            super(looper);
            this.mFetcherRef = new WeakReference<>(videoInfoFetcher);
        }
    }

    public void _fetchInfoInternal() {
        if (this.mUseVideoModelCache && (TextUtils.isEmpty(this.mApiString) || !NetUtils.isNetAvailable(this.mContext))) {
            EngineThreadPool.addExecuteTask(new Runnable() {
                public void run() {
                    CacheInfo query = VideoModelDBManager.query(VideoInfoFetcher.this.mVID);
                    if (query != null && !TextUtils.isEmpty(query.videoModelStr)) {
                        try {
                            JSONObject jSONObject = new JSONObject(query.videoModelStr);
                            TTVideoEngineLog.m110647i("VideoInfoFetcher", "using videomodel from DB");
                            VideoInfoFetcher.this._getInfoSuccess(jSONObject, query);
                            return;
                        } catch (Exception e) {
                            TTVideoEngineLog.m110646e("VideoInfoFetcher", e.toString());
                        }
                    }
                    if (TextUtils.isEmpty(VideoInfoFetcher.this.mApiString)) {
                        VideoInfoFetcher.this._notifyError(new Error("kTTVideoErrorDomainFetchingInfo", -9999, "apistring empty and no cache"));
                    } else {
                        VideoInfoFetcher.this._fetchInfoInternal_1();
                    }
                }
            });
        } else if (TextUtils.isEmpty(this.mApiString)) {
            _notifyError(new Error("kTTVideoErrorDomainFetchingInfo", -9999, "apistring empty"));
        } else {
            _fetchInfoInternal_1();
        }
    }

    public void cancel() {
        synchronized (this) {
            this.mHandler.removeCallbacksAndMessages(null);
            if (this.mListener != null) {
                this.mListener.onLog("fetcher cancelled");
                if (!this.mCancelled) {
                    this.mCancelled = true;
                    if (this.mFuture != null) {
                        this.mFuture.cancel(true);
                    }
                    this.mNetworkSession.cancel();
                }
            }
        }
    }

    public void _fetchInfoInternal_1() {
        if (this.mPlayVersion == 3) {
            if (!TextUtils.isEmpty(this.mApiString)) {
                this.mApiString.indexOf(WebKitApi.SCHEME_HTTPS);
            }
            String _parseAPIString = _parseAPIString(this.mApiString);
            if (_parseAPIString != null) {
                _notifyError(new Error("kTTVideoErrorDomainFetchingInfo", -9980, _parseAPIString));
            } else if (this.mGetMethodEnable) {
                _beginToFetch(this.mApiString, null);
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("Env", this.mEnvParams);
                    jSONObject.put("Params", this.mParams);
                    TTVideoEngineLog.m110644d("VideoInfoFetcher", "_fetchInfoInternal no encrypt");
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("EncryptKey", null);
                        jSONObject2.put("CipherText", null);
                        jSONObject2.put("Data", jSONObject);
                        _beginToFetch(this.mURLWithoutParams, jSONObject2);
                    } catch (JSONException e) {
                        _retryIfNeeded(new Error("kTTVideoErrorDomainFetchingInfo", -9979, e.toString()));
                    }
                } catch (JSONException e2) {
                    _retryIfNeeded(new Error("kTTVideoErrorDomainFetchingInfo", -9979, e2.toString()));
                }
            }
        } else {
            _beginToFetch(this.mApiString, null);
        }
    }

    public void setListener(FetcherListener fetcherListener) {
        this.mListener = fetcherListener;
    }

    public void setPlayType(int i) {
        this.mType = i;
    }

    public void setResolutionMap(HashMap<String, Resolution> hashMap) {
        this.mResolutionMap = hashMap;
    }

    public void setVideoID(String str) {
        this.mVID = str;
    }

    private void _notifyShouldRetry(Error error) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(0, error));
    }

    private void _notifySuccess(VideoModel videoModel) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(2, videoModel));
    }

    public void _notifyError(Error error) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1, error));
    }

    public void setUseVideoModelCache(boolean z) {
        this.mUseVideoModelCache = z;
        if (z) {
            VideoModelDBManager.getInstance(this.mContext);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00df, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _retryIfNeeded(com.p683ss.ttvideoengine.utils.Error r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.mCancelled     // Catch:{ all -> 0x00e0 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)     // Catch:{ all -> 0x00e0 }
            return
        L_0x0007:
            r0 = -9994(0xffffffffffffd8f6, float:NaN)
            if (r5 == 0) goto L_0x003b
            java.lang.String r1 = r5.domain     // Catch:{ all -> 0x00e0 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x0026
            int r1 = r5.code     // Catch:{ all -> 0x00e0 }
            r2 = -9979(0xffffffffffffd905, float:NaN)
            if (r1 != r2) goto L_0x0026
            com.ss.ttvideoengine.utils.Error r0 = new com.ss.ttvideoengine.utils.Error     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = "kTTVideoErrorDomainFetchingInfo"
            int r3 = r5.internalCode     // Catch:{ all -> 0x00e0 }
            java.lang.String r5 = r5.description     // Catch:{ all -> 0x00e0 }
            r0.<init>(r1, r2, r3, r5)     // Catch:{ all -> 0x00e0 }
            r5 = r0
            goto L_0x0042
        L_0x0026:
            java.lang.String r1 = r5.domain     // Catch:{ all -> 0x00e0 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x0042
            com.ss.ttvideoengine.utils.Error r1 = new com.ss.ttvideoengine.utils.Error     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = "kTTVideoErrorDomainFetchingInfo"
            int r3 = r5.internalCode     // Catch:{ all -> 0x00e0 }
            java.lang.String r5 = r5.description     // Catch:{ all -> 0x00e0 }
            r1.<init>(r2, r0, r3, r5)     // Catch:{ all -> 0x00e0 }
            r5 = r1
            goto L_0x0042
        L_0x003b:
            com.ss.ttvideoengine.utils.Error r5 = new com.ss.ttvideoengine.utils.Error     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = "kTTVideoErrorDomainFetchingInfo"
            r5.<init>(r1, r0)     // Catch:{ all -> 0x00e0 }
        L_0x0042:
            int r0 = r5.code     // Catch:{ all -> 0x00e0 }
            r1 = -9969(0xffffffffffffd90f, float:NaN)
            if (r0 != r1) goto L_0x00a2
            int r0 = r5.internalCode     // Catch:{ all -> 0x00e0 }
            int r0 = r0 / 10000
            r1 = 10
            r2 = -9970(0xffffffffffffd90e, float:NaN)
            if (r0 == r1) goto L_0x005c
            int r0 = r5.internalCode     // Catch:{ all -> 0x00e0 }
            if (r0 != r2) goto L_0x0057
            goto L_0x005c
        L_0x0057:
            r0 = -9990(0xffffffffffffd8fa, float:NaN)
            r5.code = r0     // Catch:{ all -> 0x00e0 }
            goto L_0x0075
        L_0x005c:
            int r0 = r4.mPlayVersion     // Catch:{ all -> 0x00e0 }
            r1 = 3
            if (r0 != r1) goto L_0x0075
            int r0 = r5.internalCode     // Catch:{ all -> 0x00e0 }
            if (r0 == r2) goto L_0x006e
            r1 = 100009(0x186a9, float:1.40142E-40)
            if (r0 == r1) goto L_0x006e
            switch(r0) {
                case 100012: goto L_0x006e;
                case 100013: goto L_0x006e;
                default: goto L_0x006d;
            }     // Catch:{ all -> 0x00e0 }
        L_0x006d:
            goto L_0x0075
        L_0x006e:
            com.ss.ttvideoengine.AuthTimer r0 = r4.mAuthTimer     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = r4.mProjectTag     // Catch:{ all -> 0x00e0 }
            r0.updateSTS(r1)     // Catch:{ all -> 0x00e0 }
        L_0x0075:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = "<apiStr:"
            r0.<init>(r1)     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = r4.mApiString     // Catch:{ all -> 0x00e0 }
            r0.append(r1)     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = ">"
            r0.append(r1)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00e0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            r1.<init>()     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = r5.description     // Catch:{ all -> 0x00e0 }
            r1.append(r2)     // Catch:{ all -> 0x00e0 }
            r1.append(r0)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00e0 }
            r5.description = r0     // Catch:{ all -> 0x00e0 }
            r4._notifyError(r5)     // Catch:{ all -> 0x00e0 }
            monitor-exit(r4)     // Catch:{ all -> 0x00e0 }
            return
        L_0x00a2:
            int r0 = r4.mRetryIndex     // Catch:{ all -> 0x00e0 }
            if (r0 > 0) goto L_0x00b3
            r4._notifyShouldRetry(r5)     // Catch:{ all -> 0x00e0 }
            int r5 = r4.mRetryIndex     // Catch:{ all -> 0x00e0 }
            int r5 = r5 + 1
            r4.mRetryIndex = r5     // Catch:{ all -> 0x00e0 }
            r4._fetchInfoInternal()     // Catch:{ all -> 0x00e0 }
            goto L_0x00de
        L_0x00b3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = "<apiStr:"
            r0.<init>(r1)     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = r4.mApiString     // Catch:{ all -> 0x00e0 }
            r0.append(r1)     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = ">"
            r0.append(r1)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00e0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            r1.<init>()     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = r5.description     // Catch:{ all -> 0x00e0 }
            r1.append(r2)     // Catch:{ all -> 0x00e0 }
            r1.append(r0)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00e0 }
            r5.description = r0     // Catch:{ all -> 0x00e0 }
            r4._notifyError(r5)     // Catch:{ all -> 0x00e0 }
        L_0x00de:
            monitor-exit(r4)     // Catch:{ all -> 0x00e0 }
            return
        L_0x00e0:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00e0 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.fetcher.VideoInfoFetcher._retryIfNeeded(com.ss.ttvideoengine.utils.Error):void");
    }

    public Map<String, String> getSignature(String str) {
        AWSV4Auth aWSV4Auth;
        STSAuth auth = this.mAuthTimer.getAuth(this.mProjectTag);
        if (auth == null) {
            TTVideoEngineLog.m110644d("VideoInfoFetcher", "AuthTimer getAuth empty");
            return null;
        }
        String str2 = auth.AuthSessionToken;
        String str3 = auth.AuthAK;
        String str4 = auth.AuthSK;
        TreeMap treeMap = new TreeMap();
        treeMap.put("Host", this.mHost);
        treeMap.put("x-amz-date", this.mAuthTimer.getTimeCalibration().getServerTimeStr(AuthTimer.PATTERN_STS_SERVER_TIME));
        treeMap.put("X-Amz-Security-Token", str2);
        TreeMap<String, String> treeMap2 = this.queryMap;
        if (this.mGetMethodEnable) {
            aWSV4Auth = new Builder(str3, str4).regionName("cn-north-1").serviceName("vod").httpMethodName("GET").canonicalURI("/").queryParameters(this.queryMap).awsHeaders(treeMap).payload(str).debug().build();
        } else {
            aWSV4Auth = new Builder(str3, str4).regionName("cn-langfang-1").serviceName("vod").httpMethodName("POST").canonicalURI("/").queryParameters(this.queryMap).awsHeaders(treeMap).payload(str).debug().build();
        }
        return aWSV4Auth.getHeaders();
    }

    private String _parseAPIString(String str) {
        if (TextUtils.isEmpty(str)) {
            return "_parseAPIString:apistring is empty";
        }
        try {
            this.mHost = new URL(str).getHost();
            String[] split = str.split("[?]");
            if (split.length < 2) {
                return "_parseAPIString:apistring param is empty";
            }
            String[] split2 = split[1].split("&");
            StringBuilder sb = new StringBuilder();
            sb.append(split[0]);
            sb.append("?");
            this.mURLWithoutParams = sb.toString();
            this.mEnvParams = new JSONObject();
            this.mParams = new JSONObject();
            this.queryMap = new TreeMap<>();
            for (int i = 0; i < split2.length; i++) {
                if (this.mGetMethodEnable) {
                    String[] split3 = split2[i].split("=");
                    this.queryMap.put(split3[0], split3[1]);
                } else if (split2[i].indexOf("Action") == 0 || split2[i].indexOf("Version") == 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.mURLWithoutParams);
                    sb2.append(split2[i]);
                    this.mURLWithoutParams = sb2.toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.mURLWithoutParams);
                    sb3.append("&");
                    this.mURLWithoutParams = sb3.toString();
                    String[] split4 = split2[i].split("=");
                    this.queryMap.put(split4[0], split4[1]);
                } else {
                    String[] split5 = split2[i].split("=");
                    if (split5.length >= 2) {
                        String str2 = split5[0];
                        String str3 = split5[1];
                        for (int i2 = 2; i2 < split5.length; i2++) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(str3);
                            sb4.append("=");
                            sb4.append(split5[i2]);
                            str3 = sb4.toString();
                        }
                        int i3 = 0;
                        while (i3 < this.EnvParamsStrs.length) {
                            try {
                                if (this.EnvParamsStrs[i3].equals(str2)) {
                                    this.mEnvParams.put(str2, str3);
                                }
                                i3++;
                            } catch (JSONException unused) {
                                return "_parseAPIString:put params error";
                            }
                        }
                        for (String equals : this.ParamsStrs) {
                            if (equals.equals(str2)) {
                                this.mParams.put(str2, str3);
                            }
                        }
                    }
                }
            }
            this.mURLWithoutParams = this.mURLWithoutParams.substring(0, this.mURLWithoutParams.length() - 1);
            return null;
        } catch (Throwable unused2) {
            return "_parseAPIString:apistring to URL error";
        }
    }

    private void _notifyException(int i, String str) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(3, i, 0, str));
    }

    public void fetchInfo(String str, String str2) {
        this.mApiString = str;
        this.mAuth = str2;
        this.mRetryIndex = 0;
        _fetchInfoInternal();
    }

    public VideoInfoFetcher(Context context, TTVNetClient tTVNetClient) {
        TTVNetClient tTVNetClient2 = tTVNetClient;
        this.mContext = context;
        this.mHandler = new MyHandler(this, TTHelper.getLooper());
        this.mAuthTimer = AuthTimer.getInstance();
        if (tTVNetClient2 == null) {
            this.isExternNetClient = false;
            this.mNetworkSession = new TTHTTPNetwork();
        } else {
            this.isExternNetClient = true;
            this.mNetworkSession = tTVNetClient2;
        }
        this.mProjectTag = "";
    }

    private void _beginToFetch(String str, JSONObject jSONObject) {
        Map signature;
        HashMap hashMap = null;
        switch (this.mPlayVersion) {
            case 0:
            case 1:
            case 2:
                if (!TextUtils.isEmpty(this.mAuth)) {
                    hashMap = new HashMap();
                    hashMap.put("Authorization", this.mAuth);
                }
                HashMap hashMap2 = hashMap;
                Method[] declaredMethods = this.mNetworkSession.getClass().getDeclaredMethods();
                boolean z = false;
                if (declaredMethods != null && declaredMethods.length > 0) {
                    int length = declaredMethods.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            Method method = declaredMethods[i];
                            if (method == null || method.getName() == null || !method.getName().equals("startTask") || method.getParameterTypes().length != 5) {
                                i++;
                            } else {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    this.mNetworkSession.startTask(str, hashMap2, new CompletionListener() {
                        public void onCompletion(JSONObject jSONObject, Error error) {
                            if (jSONObject != null || error == null) {
                                VideoInfoFetcher.this._getInfoSuccess(jSONObject, null);
                            } else {
                                VideoInfoFetcher.this._retryIfNeeded(error);
                            }
                        }
                    });
                    break;
                } else {
                    this.mNetworkSession.startTask(str, hashMap2, null, 0, new CompletionListener() {
                        public void onCompletion(JSONObject jSONObject, Error error) {
                            if (jSONObject != null || error == null) {
                                VideoInfoFetcher.this._getInfoSuccess(jSONObject, null);
                            } else {
                                VideoInfoFetcher.this._retryIfNeeded(error);
                            }
                        }
                    });
                    return;
                }
            case 3:
                if (this.mGetMethodEnable) {
                    signature = getSignature(null);
                } else {
                    signature = getSignature(jSONObject.toString());
                }
                Map map = signature;
                if (map == null) {
                    _retryIfNeeded(new Error("kTTVideoErrorDomainFetchingInfo", -9969, -9970, "auth is empty"));
                    return;
                } else if (this.mGetMethodEnable) {
                    this.mNetworkSession.startTask(str, map, null, 0, new CompletionListener() {
                        public void onCompletion(JSONObject jSONObject, Error error) {
                            if (jSONObject != null || error == null) {
                                VideoInfoFetcher.this._getInfoSuccess(jSONObject, null);
                            } else {
                                VideoInfoFetcher.this._retryIfNeeded(error);
                            }
                        }
                    });
                    return;
                } else {
                    this.mNetworkSession.startTask(str, map, jSONObject, 1, new CompletionListener() {
                        public void onCompletion(JSONObject jSONObject, Error error) {
                            if (jSONObject != null || error == null) {
                                VideoInfoFetcher.this._getInfoSuccess(jSONObject, null);
                            } else {
                                VideoInfoFetcher.this._retryIfNeeded(error);
                            }
                        }
                    });
                    return;
                }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x015b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x017e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _getInfoSuccess(org.json.JSONObject r8, com.p683ss.ttvideoengine.database.VideoModelDBManager.CacheInfo r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.mCancelled     // Catch:{ all -> 0x017f }
            if (r0 != 0) goto L_0x017d
            if (r8 != 0) goto L_0x0009
            goto L_0x017d
        L_0x0009:
            com.ss.ttvideoengine.model.VideoModel r0 = new com.ss.ttvideoengine.model.VideoModel     // Catch:{ all -> 0x017f }
            r0.<init>()     // Catch:{ all -> 0x017f }
            java.lang.String r1 = "ResponseMetadata"
            boolean r1 = r8.has(r1)     // Catch:{ all -> 0x017f }
            r2 = 10
            r3 = -9976(0xffffffffffffd908, float:NaN)
            r4 = 4
            if (r1 != 0) goto L_0x008c
            java.lang.String r1 = "Result"
            boolean r1 = r8.has(r1)     // Catch:{ all -> 0x017f }
            if (r1 == 0) goto L_0x0024
            goto L_0x008c
        L_0x0024:
            java.lang.String r1 = r7.mKeyseed     // Catch:{ Throwable -> 0x007b }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x007b }
            if (r1 != 0) goto L_0x0039
            r1 = 219(0xdb, float:3.07E-43)
            r5 = 1
            r0.setVideoRefBool(r1, r5)     // Catch:{ Throwable -> 0x007b }
            r1 = 218(0xda, float:3.05E-43)
            java.lang.String r5 = r7.mKeyseed     // Catch:{ Throwable -> 0x007b }
            r0.setVideoRefStr(r1, r5)     // Catch:{ Throwable -> 0x007b }
        L_0x0039:
            r0.extractFields(r8)     // Catch:{ Throwable -> 0x007b }
            java.lang.String r1 = "code"
            int r1 = r8.optInt(r1)     // Catch:{ all -> 0x017f }
            java.lang.String r3 = "message"
            java.lang.String r3 = r8.optString(r3)     // Catch:{ all -> 0x017f }
            com.ss.ttvideoengine.model.VideoRef r5 = r0.getVideoRef()     // Catch:{ all -> 0x017f }
            if (r5 == 0) goto L_0x0067
            int r5 = r0.getVideoRefInt(r4)     // Catch:{ all -> 0x017f }
            if (r5 == r2) goto L_0x0067
            int r2 = r0.getVideoRefInt(r4)     // Catch:{ all -> 0x017f }
            if (r2 == 0) goto L_0x0067
            int r2 = r7.mType     // Catch:{ all -> 0x017f }
            if (r2 != 0) goto L_0x0067
            int r8 = r0.getVideoRefInt(r4)     // Catch:{ all -> 0x017f }
            r7._notifyException(r8, r3)     // Catch:{ all -> 0x017f }
            monitor-exit(r7)     // Catch:{ all -> 0x017f }
            return
        L_0x0067:
            if (r1 == 0) goto L_0x0122
            com.ss.ttvideoengine.utils.Error r9 = new com.ss.ttvideoengine.utils.Error     // Catch:{ all -> 0x017f }
            java.lang.String r0 = "kTTVideoErrorDomainFetchingInfo"
            r2 = -9990(0xffffffffffffd8fa, float:NaN)
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x017f }
            r9.<init>(r0, r2, r1, r8)     // Catch:{ all -> 0x017f }
            r7._notifyError(r9)     // Catch:{ all -> 0x017f }
            monitor-exit(r7)     // Catch:{ all -> 0x017f }
            return
        L_0x007b:
            r8 = move-exception
            com.ss.ttvideoengine.utils.Error r9 = new com.ss.ttvideoengine.utils.Error     // Catch:{ all -> 0x017f }
            java.lang.String r0 = "kTTVideoErrorDomainFetchingInfo"
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x017f }
            r9.<init>(r0, r3, r8)     // Catch:{ all -> 0x017f }
            r7._retryIfNeeded(r9)     // Catch:{ all -> 0x017f }
            monitor-exit(r7)     // Catch:{ all -> 0x017f }
            return
        L_0x008c:
            java.lang.String r1 = "ResponseMetadata"
            org.json.JSONObject r1 = r8.optJSONObject(r1)     // Catch:{ all -> 0x017f }
            if (r1 != 0) goto L_0x0096
            monitor-exit(r7)     // Catch:{ all -> 0x017f }
            return
        L_0x0096:
            java.lang.String r5 = "Error"
            org.json.JSONObject r5 = r1.optJSONObject(r5)     // Catch:{ all -> 0x017f }
            if (r5 == 0) goto L_0x00d0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x017f }
            r8.<init>()     // Catch:{ all -> 0x017f }
            java.lang.String r9 = r5.toString()     // Catch:{ all -> 0x017f }
            r8.append(r9)     // Catch:{ all -> 0x017f }
            java.lang.String r9 = " RequestId:"
            r8.append(r9)     // Catch:{ all -> 0x017f }
            java.lang.String r9 = "RequestId"
            java.lang.String r9 = r1.optString(r9)     // Catch:{ all -> 0x017f }
            r8.append(r9)     // Catch:{ all -> 0x017f }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x017f }
            java.lang.String r9 = "CodeN"
            int r9 = r5.optInt(r9)     // Catch:{ all -> 0x017f }
            com.ss.ttvideoengine.utils.Error r0 = new com.ss.ttvideoengine.utils.Error     // Catch:{ all -> 0x017f }
            java.lang.String r1 = "kTTVideoErrorDomainFetchingInfo"
            r2 = -9969(0xffffffffffffd90f, float:NaN)
            r0.<init>(r1, r2, r9, r8)     // Catch:{ all -> 0x017f }
            r7._retryIfNeeded(r0)     // Catch:{ all -> 0x017f }
            monitor-exit(r7)     // Catch:{ all -> 0x017f }
            return
        L_0x00d0:
            java.lang.String r1 = "Result"
            org.json.JSONObject r1 = r8.optJSONObject(r1)     // Catch:{ all -> 0x017f }
            r5 = -9997(0xffffffffffffd8f3, float:NaN)
            if (r1 != 0) goto L_0x00e8
            com.ss.ttvideoengine.utils.Error r8 = new com.ss.ttvideoengine.utils.Error     // Catch:{ all -> 0x017f }
            java.lang.String r9 = "kTTVideoErrorDomainFetchingInfo"
            java.lang.String r0 = "fetched info Result is empty"
            r8.<init>(r9, r5, r0)     // Catch:{ all -> 0x017f }
            r7._retryIfNeeded(r8)     // Catch:{ all -> 0x017f }
            monitor-exit(r7)     // Catch:{ all -> 0x017f }
            return
        L_0x00e8:
            java.lang.String r6 = "Data"
            org.json.JSONObject r1 = r1.optJSONObject(r6)     // Catch:{ Throwable -> 0x016a }
            if (r1 != 0) goto L_0x00fe
            com.ss.ttvideoengine.utils.Error r8 = new com.ss.ttvideoengine.utils.Error     // Catch:{ all -> 0x017f }
            java.lang.String r9 = "kTTVideoErrorDomainFetchingInfo"
            java.lang.String r0 = "fetched info Result is empty after decrypt"
            r8.<init>(r9, r5, r0)     // Catch:{ all -> 0x017f }
            r7._retryIfNeeded(r8)     // Catch:{ all -> 0x017f }
            monitor-exit(r7)     // Catch:{ all -> 0x017f }
            return
        L_0x00fe:
            r0.extractFields(r1)     // Catch:{ Throwable -> 0x015c }
            com.ss.ttvideoengine.model.VideoRef r1 = r0.getVideoRef()     // Catch:{ all -> 0x017f }
            if (r1 == 0) goto L_0x0122
            int r1 = r0.getVideoRefInt(r4)     // Catch:{ all -> 0x017f }
            if (r1 == r2) goto L_0x0122
            int r1 = r0.getVideoRefInt(r4)     // Catch:{ all -> 0x017f }
            if (r1 == 0) goto L_0x0122
            int r1 = r7.mType     // Catch:{ all -> 0x017f }
            if (r1 != 0) goto L_0x0122
            int r8 = r0.getVideoRefInt(r4)     // Catch:{ all -> 0x017f }
            java.lang.String r9 = "ver2 server side error,hh"
            r7._notifyException(r8, r9)     // Catch:{ all -> 0x017f }
            monitor-exit(r7)     // Catch:{ all -> 0x017f }
            return
        L_0x0122:
            java.util.HashMap<java.lang.String, com.ss.ttvideoengine.Resolution> r1 = r7.mResolutionMap     // Catch:{ all -> 0x017f }
            r0.setUpResolution(r1)     // Catch:{ all -> 0x017f }
            r7._notifySuccess(r0)     // Catch:{ all -> 0x017f }
            boolean r1 = r7.mUseVideoModelCache     // Catch:{ all -> 0x017f }
            if (r1 == 0) goto L_0x015a
            if (r9 != 0) goto L_0x0145
            java.lang.String r9 = r7.mVID     // Catch:{ all -> 0x017f }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x017f }
            com.p683ss.ttvideoengine.database.VideoModelDBManager.insert(r9, r8)     // Catch:{ all -> 0x017f }
            com.ss.ttvideoengine.VideoModelCache r8 = com.p683ss.ttvideoengine.VideoModelCache.getInstance()     // Catch:{ all -> 0x017f }
            java.lang.String r9 = r7.mVID     // Catch:{ all -> 0x017f }
            java.lang.String r1 = r7.mApiString     // Catch:{ all -> 0x017f }
            r8.put(r9, r1, r0)     // Catch:{ all -> 0x017f }
            goto L_0x015a
        L_0x0145:
            com.ss.ttvideoengine.VideoModelCache$VideoModelCacheInfo r8 = new com.ss.ttvideoengine.VideoModelCache$VideoModelCacheInfo     // Catch:{ all -> 0x017f }
            r8.<init>()     // Catch:{ all -> 0x017f }
            r8.model = r0     // Catch:{ all -> 0x017f }
            long r0 = r9.time     // Catch:{ all -> 0x017f }
            r8.modelGotTime = r0     // Catch:{ all -> 0x017f }
            com.ss.ttvideoengine.VideoModelCache r9 = com.p683ss.ttvideoengine.VideoModelCache.getInstance()     // Catch:{ all -> 0x017f }
            java.lang.String r0 = r7.mVID     // Catch:{ all -> 0x017f }
            r1 = 0
            r9.put(r0, r1, r8)     // Catch:{ all -> 0x017f }
        L_0x015a:
            monitor-exit(r7)     // Catch:{ all -> 0x017f }
            return
        L_0x015c:
            com.ss.ttvideoengine.utils.Error r8 = new com.ss.ttvideoengine.utils.Error     // Catch:{ all -> 0x017f }
            java.lang.String r9 = "kTTVideoErrorDomainFetchingInfo"
            java.lang.String r0 = "fetched info Result is empty after decrypt"
            r8.<init>(r9, r3, r0)     // Catch:{ all -> 0x017f }
            r7._retryIfNeeded(r8)     // Catch:{ all -> 0x017f }
            monitor-exit(r7)     // Catch:{ all -> 0x017f }
            return
        L_0x016a:
            r8 = move-exception
            com.ss.ttvideoengine.utils.Error r9 = new com.ss.ttvideoengine.utils.Error     // Catch:{ all -> 0x017f }
            java.lang.String r0 = "kTTVideoErrorDomainFetchingInfo"
            r1 = -9977(0xffffffffffffd907, float:NaN)
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x017f }
            r9.<init>(r0, r1, r8)     // Catch:{ all -> 0x017f }
            r7._retryIfNeeded(r9)     // Catch:{ all -> 0x017f }
            monitor-exit(r7)     // Catch:{ all -> 0x017f }
            return
        L_0x017d:
            monitor-exit(r7)     // Catch:{ all -> 0x017f }
            return
        L_0x017f:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x017f }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.fetcher.VideoInfoFetcher._getInfoSuccess(org.json.JSONObject, com.ss.ttvideoengine.database.VideoModelDBManager$CacheInfo):void");
    }

    public void fetchInfo(String str, String str2, int i) {
        fetchInfo(str, str2, i, null);
    }

    public VideoInfoFetcher(Context context, TTVNetClient tTVNetClient, String str) {
        TTVNetClient tTVNetClient2 = tTVNetClient;
        this.mContext = context;
        this.mHandler = new MyHandler(this, TTHelper.getLooper());
        this.mAuthTimer = AuthTimer.getInstance();
        if (tTVNetClient2 == null) {
            this.isExternNetClient = false;
            this.mNetworkSession = new TTHTTPNetwork();
        } else {
            this.isExternNetClient = true;
            this.mNetworkSession = tTVNetClient2;
        }
        this.mProjectTag = str;
    }

    public void fetchInfo(String str, String str2, int i, String str3) {
        this.mApiString = str;
        this.mAuth = str2;
        this.mRetryIndex = 0;
        this.mPlayVersion = i;
        this.mKeyseed = str3;
        if (this.mPlayVersion == 3) {
            this.mFuture = EngineThreadPool.addExecuteTask(new Runnable() {
                public void run() {
                    VideoInfoFetcher.this._fetchInfoInternal();
                }
            });
        } else {
            _fetchInfoInternal();
        }
    }
}
