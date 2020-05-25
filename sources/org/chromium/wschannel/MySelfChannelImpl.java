package org.chromium.wschannel;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.common.utility.p526f.C9409b;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import com.ttnet.org.chromium.net.CronetEngine;
import com.ttnet.org.chromium.net.TTWebsocketConnection;
import com.ttnet.org.chromium.net.TTWebsocketConnection.Builder;
import com.ttnet.org.chromium.net.TTWebsocketConnection.Callback;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.CronetClient;
import org.json.JSONException;
import org.json.JSONObject;

public class MySelfChannelImpl implements C9382a, IWsChannelClient {
    private static String WSCHANNEL_ACTION_BACK;
    private static String WSCHANNEL_ACTION_FORE;
    private static CronetEngine mCronetEngine;
    private static volatile int sChannelID = -1;
    private static volatile AtomicInteger sFirstConnection = new AtomicInteger(0);
    private C53706a mCallback = new C53706a();
    private Context mContext;
    private TTWebsocketConnection mWebsocketConnection;
    private IWsChannelClient mWsChannelClient;
    private boolean sharedConnection = true;

    /* renamed from: org.chromium.wschannel.MySelfChannelImpl$a */
    class C53706a extends Callback {
        C53706a() {
        }

        public final void onMessageReceived(TTWebsocketConnection tTWebsocketConnection, ByteBuffer byteBuffer) throws Exception {
            byte[] bArr = new byte[byteBuffer.capacity()];
            try {
                byteBuffer.get(bArr);
                MySelfChannelImpl.this.onMessage(bArr);
            } catch (Throwable unused) {
            }
        }

        public final void onConnectionStateChanged(TTWebsocketConnection tTWebsocketConnection, int i, String str) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", 1);
                jSONObject.put("state", MySelfChannelImpl.this.cronetToWsStateAdapter(i));
                jSONObject.put("url", str);
                MySelfChannelImpl.this.onConnection(jSONObject);
            } catch (Throwable unused) {
            }
        }

        public final void onConnectionError(TTWebsocketConnection tTWebsocketConnection, int i, String str, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", 0);
                jSONObject.put("state", MySelfChannelImpl.this.cronetToWsStateAdapter(i));
                jSONObject.put("url", str);
                jSONObject.put("error", str2);
                MySelfChannelImpl.this.onConnection(jSONObject);
            } catch (Throwable unused) {
            }
        }
    }

    public int cronetToWsStateAdapter(int i) {
        switch (i) {
            case -1:
                return 0;
            case 0:
                return 1;
            case 1:
                return 6;
            default:
                return i;
        }
    }

    public void handleMsg(Message message) {
    }

    public void onNetworkStateChanged(int i) {
    }

    public void destroy() {
        if (this.mWebsocketConnection != null) {
            this.mWebsocketConnection.stopConnection();
            this.mWebsocketConnection.destroyConnection();
        }
    }

    public boolean isConnected() {
        if (this.mWebsocketConnection == null) {
            return false;
        }
        return this.mWebsocketConnection.isConnected();
    }

    public void stopConnection() {
        if (this.mWebsocketConnection != null) {
            this.mWebsocketConnection.stopConnection();
            this.mWebsocketConnection.destroyConnection();
        }
    }

    private static void loadCronetKernel() throws Exception {
        Object newInstance = Class.forName("com.bytedance.ttnet.d").newInstance();
        C9409b.m18609a(newInstance).mo17054b("getInitCompletedSem");
        C9409b.m18609a(newInstance).mo17054b("preInitCronetKernel");
    }

    public void onConnection(JSONObject jSONObject) {
        if (this.mWsChannelClient != null) {
            try {
                jSONObject.put("channel_type", 1);
            } catch (JSONException unused) {
            }
            this.mWsChannelClient.onConnection(jSONObject);
        }
    }

    public void onMessage(byte[] bArr) {
        if (this.mWsChannelClient != null) {
            this.mWsChannelClient.onMessage(bArr);
        }
    }

    public boolean sendMessage(byte[] bArr) {
        if (this.mWebsocketConnection == null) {
            return false;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        this.mWebsocketConnection.asyncSendBinary(allocateDirect);
        return true;
    }

    public void onAppStateChanged(int i) {
        Intent intent = new Intent();
        if (i == 1) {
            intent.setAction(WSCHANNEL_ACTION_FORE);
            this.mContext.sendBroadcast(intent);
            return;
        }
        if (i == 2) {
            intent.setAction(WSCHANNEL_ACTION_BACK);
            this.mContext.sendBroadcast(intent);
        }
    }

    public void onParameterChange(Map<String, Object> map, List<String> list) {
        if (this.mWebsocketConnection != null) {
            this.mWebsocketConnection.stopConnection();
            this.mWebsocketConnection.destroyConnection();
        }
        openConnection(map, list);
    }

    public void init(Context context, IWsChannelClient iWsChannelClient) {
        if (sFirstConnection.incrementAndGet() > 1) {
            this.sharedConnection = false;
        }
        this.mContext = context;
        this.mWsChannelClient = iWsChannelClient;
        try {
            loadCronetKernel();
        } catch (Throwable unused) {
        }
        mCronetEngine = CronetClient.getCronetEngine();
        StringBuilder sb = new StringBuilder();
        sb.append(this.mContext.getPackageName());
        sb.append(".wschannel.APP_BACKGROUND");
        WSCHANNEL_ACTION_BACK = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.mContext.getPackageName());
        sb2.append(".wschannel.APP_FOREGROUND");
        WSCHANNEL_ACTION_FORE = sb2.toString();
    }

    public void openConnection(Map<String, Object> map, List<String> list) {
        int i;
        String[] split;
        if (list == null || list.size() <= 0) {
            throw new IllegalArgumentException("urls size <= 0 !!!");
        } else if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("configMap is empty !!!");
        } else {
            Object obj = map.get("channel_id");
            if (obj == null) {
                i = -1;
            } else {
                i = ((Integer) obj).intValue();
            }
            if (sChannelID == -1 && i > 0 && sFirstConnection.get() == 1) {
                sChannelID = i;
            }
            Builder newWebsocketConnectionBuilder = mCronetEngine.newWebsocketConnectionBuilder(this.mCallback, C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(1).mo49847a()));
            try {
                newWebsocketConnectionBuilder.setUrlList(list);
                newWebsocketConnectionBuilder.setAppKey(String.valueOf(map.get("app_key")));
                newWebsocketConnectionBuilder.setFpid(((Integer) map.get("fpid")).intValue());
                newWebsocketConnectionBuilder.setAppVersion(((Integer) map.get("app_version")).intValue());
                newWebsocketConnectionBuilder.setAppId(((Integer) map.get("aid")).intValue());
                newWebsocketConnectionBuilder.setDeviceId(Long.parseLong((String) map.get("device_id")));
                newWebsocketConnectionBuilder.setInstallId(Long.parseLong((String) map.get("iid")));
                if (i > 0 && i == sChannelID) {
                    this.sharedConnection = true;
                }
                newWebsocketConnectionBuilder.setSharedConnection(this.sharedConnection);
                if (map.containsKey("sid")) {
                    newWebsocketConnectionBuilder.setSessionId((String) map.get("sid"));
                }
                String str = (String) map.get("extra");
                HashMap hashMap = new HashMap();
                if (!TextUtils.isEmpty(str)) {
                    for (String str2 : str.split("&")) {
                        if (!TextUtils.isEmpty(str2)) {
                            String[] split2 = str2.split("=");
                            if (split2.length == 2) {
                                hashMap.put(split2[0], split2[1]);
                            }
                        }
                    }
                }
                newWebsocketConnectionBuilder.setCustomizedParams(hashMap);
                this.mWebsocketConnection = newWebsocketConnectionBuilder.build();
                this.mWebsocketConnection.startConnection();
            } catch (Throwable unused) {
                throw new IllegalArgumentException("configMap contain err params !!!");
            }
        }
    }
}
