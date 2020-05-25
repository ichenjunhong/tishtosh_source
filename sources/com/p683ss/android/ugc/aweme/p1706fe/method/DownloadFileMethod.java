package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.sdk.account.p849b.p853d.C13032a;
import com.p683ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.p683ss.android.ugc.aweme.p1463br.C23967a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.utils.C47723bk;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.aweme.video.p2394c.C48008f;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.method.DownloadFileMethod */
public final class DownloadFileMethod extends BaseCommonJavaMethod implements IDownloadListener {

    /* renamed from: d */
    public static final C29797a f77806d = new C29797a(null);

    /* renamed from: a */
    String f77807a;

    /* renamed from: b */
    String f77808b;

    /* renamed from: c */
    Integer f77809c;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.DownloadFileMethod$a */
    public static final class C29797a {
        private C29797a() {
        }

        public /* synthetic */ C29797a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.DownloadFileMethod$b */
    static final class C29798b<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ File f77810a;

        /* renamed from: b */
        final /* synthetic */ String f77811b;

        C29798b(File file, String str) {
            this.f77810a = file;
            this.f77811b = str;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(C48016e.m103948c(this.f77810a.getPath(), this.f77811b));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.DownloadFileMethod$c */
    static final class C29799c implements C23364b {

        /* renamed from: a */
        final /* synthetic */ DownloadFileMethod f77812a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f77813b;

        /* renamed from: c */
        final /* synthetic */ C29789a f77814c;

        /* renamed from: d */
        final /* synthetic */ Activity f77815d;

        C29799c(DownloadFileMethod downloadFileMethod, JSONObject jSONObject, C29789a aVar, Activity activity) {
            this.f77812a = downloadFileMethod;
            this.f77813b = jSONObject;
            this.f77814c = aVar;
            this.f77815d = activity;
        }

        /* renamed from: a */
        public final void mo40906a(String[] strArr, int[] iArr) {
            boolean z;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            if (iArr != null) {
                boolean z2 = false;
                if (iArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((!z) && iArr[0] == 0) {
                    DownloadFileMethod downloadFileMethod = this.f77812a;
                    JSONObject jSONObject = this.f77813b;
                    C29789a aVar = this.f77814c;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    Context context = (Context) downloadFileMethod.f77793e.get();
                    if (context != null) {
                        jSONObject2.put("reason", "params insufficient");
                        String str7 = null;
                        if (jSONObject != null) {
                            str = jSONObject.optString("url");
                        } else {
                            str = null;
                        }
                        if (C24678b.m60182a(str)) {
                            if (jSONObject != null) {
                                str6 = jSONObject.optString("suffix");
                            } else {
                                str6 = null;
                            }
                            if (C24678b.m60182a(str6)) {
                                z2 = true;
                            }
                        }
                        if (!z2) {
                            context = null;
                        }
                        if (context != null) {
                            if (jSONObject != null) {
                                str2 = jSONObject.optString("url");
                            } else {
                                str2 = null;
                            }
                            downloadFileMethod.f77807a = str2;
                            if (jSONObject != null) {
                                str3 = jSONObject.optString("type");
                            } else {
                                str3 = null;
                            }
                            downloadFileMethod.f77808b = str3;
                            if (C52711k.m112239a((Object) downloadFileMethod.f77808b, (Object) "image")) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(C13032a.m26205a(downloadFileMethod.f77807a));
                                sb.append(System.currentTimeMillis());
                                str4 = sb.toString();
                            } else {
                                str4 = C13032a.m26205a(downloadFileMethod.f77807a);
                            }
                            if (jSONObject != null) {
                                str7 = jSONObject.optString("suffix");
                            }
                            String str8 = downloadFileMethod.f77808b;
                            if (str8 != null && str8.hashCode() == 100313435 && str8.equals("image")) {
                                StringBuilder sb2 = new StringBuilder();
                                File c = C48016e.m103945c();
                                C52711k.m112236a((Object) c, "FileHelper.getExternalPictureCacheDir()");
                                sb2.append(c.getPath());
                                sb2.append("/downloadMedia/");
                                str5 = sb2.toString();
                            } else {
                                str5 = C48008f.m103863a((Context) downloadFileMethod.f77793e.get());
                                C52711k.m112236a((Object) str5, "VideoDownloadPathUtil.ge…adPath(mContextRef.get())");
                            }
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(str4);
                            sb3.append(str7);
                            String sb4 = sb3.toString();
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(str5);
                            sb5.append(sb4);
                            String sb6 = sb5.toString();
                            if (!C47723bk.m103311a(sb6)) {
                                downloadFileMethod.f77809c = Integer.valueOf(Downloader.with(context).url(downloadFileMethod.f77807a).name(sb4).savePath(str5).subThreadListener(downloadFileMethod).download());
                                jSONObject2.remove("reason");
                                jSONObject2.put("code", 1);
                            } else {
                                jSONObject2.put("reason", "file already exists");
                                jSONObject2.put(LeakCanaryFileProvider.f132050j, sb6);
                            }
                        }
                    }
                    if (aVar != null) {
                        aVar.mo60041a(jSONObject2);
                    }
                    return;
                }
            }
            C10691a.m21551c((Context) this.f77815d, this.f77815d.getString(R.string.kc)).mo19066a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.DownloadFileMethod$d */
    static final class C29800d<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ DownloadFileMethod f77816a;

        /* renamed from: b */
        final /* synthetic */ String f77817b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f77818c;

        /* renamed from: d */
        final /* synthetic */ int f77819d;

        C29800d(DownloadFileMethod downloadFileMethod, String str, JSONObject jSONObject, int i) {
            this.f77816a = downloadFileMethod;
            this.f77817b = str;
            this.f77818c = jSONObject;
            this.f77819d = i;
        }

        public final /* synthetic */ Object call() {
            DownloadFileMethod.super.mo60037b(this.f77817b, this.f77818c, this.f77819d);
            return C52860x.f131107a;
        }
    }

    public DownloadFileMethod() {
        this(null, 1, null);
    }

    public final void onFirstStart(DownloadInfo downloadInfo) {
    }

    public final void onFirstSuccess(DownloadInfo downloadInfo) {
    }

    public final void onPrepare(DownloadInfo downloadInfo) {
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        Integer num = this.f77809c;
        if (num != null) {
            Downloader.getInstance((Context) this.f77793e.get()).cancel(num.intValue());
        }
    }

    public DownloadFileMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final BaseCommonJavaMethod mo60035a(WeakReference<Context> weakReference) {
        if (weakReference != null) {
            Context context = (Context) weakReference.get();
            if (context != null && (context instanceof C0184k)) {
                ((C0184k) context).getLifecycle().mo324a(this);
            }
        }
        BaseCommonJavaMethod a = super.mo60035a(weakReference);
        C52711k.m112236a((Object) a, "super.attach(contextRef)");
        return a;
    }

    public final void onCanceled(DownloadInfo downloadInfo) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "cancel");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("eventName", "download_status_change");
        m69902a("notification", jSONObject, 3);
    }

    public final void onPause(DownloadInfo downloadInfo) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "pause");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("eventName", "download_status_change");
        m69902a("notification", jSONObject, 3);
    }

    public final void onProgress(DownloadInfo downloadInfo) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("progress", downloadInfo);
        jSONObject2.put("type", "progress");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("eventName", "download_status_change");
        m69902a("notification", jSONObject, 3);
    }

    public final void onStart(DownloadInfo downloadInfo) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "start");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("eventName", "download_status_change");
        m69902a("notification", jSONObject, 3);
    }

    public final void onSuccessed(DownloadInfo downloadInfo) {
        if (downloadInfo != null && downloadInfo.getSavePath() != null && downloadInfo.getName() != null) {
            String path = new File(downloadInfo.getSavePath(), downloadInfo.getName()).getPath();
            String str = "notification";
            JSONObject jSONObject = new JSONObject();
            String str2 = "data";
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", "success");
            if (path != null) {
                jSONObject2.put(LeakCanaryFileProvider.f132050j, path);
            }
            jSONObject.put(str2, jSONObject2);
            jSONObject.put("eventName", "download_status_change");
            m69902a(str, jSONObject, 3);
            if (TextUtils.equals(this.f77808b, "image")) {
                C52711k.m112236a((Object) path, LeakCanaryFileProvider.f132050j);
                Context context = (Context) this.f77793e.get();
                if (context != null) {
                    C52711k.m112236a((Object) context, "mContextRef.get() ?: return");
                    File file = new File(path);
                    String path2 = new File(C23967a.m58772a(context), file.getName()).getPath();
                    C0013i.m16a((Callable<TResult>) new C29798b<TResult>(file, path2));
                    C10691a.m21538a(context, context.getString(R.string.hbo), 1).mo19066a();
                    AwemeApplication a = AwemeApplication.m56199a();
                    StringBuilder sb = new StringBuilder("file://");
                    sb.append(path2);
                    a.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse(sb.toString())));
                }
            }
        }
    }

    public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "restart");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("eventName", "download_status_change");
        m69902a("notification", jSONObject, 3);
    }

    public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "restart");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("eventName", "download_status_change");
        m69902a("notification", jSONObject, 3);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        Context context;
        WeakReference weakReference = this.f77793e;
        if (weakReference != null) {
            context = (Context) weakReference.get();
        } else {
            context = null;
        }
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            C23361b.m57419a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C29799c(this, jSONObject, aVar, activity));
        }
    }

    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "error");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("eventName", "download_status_change");
        m69902a("notification", jSONObject, 3);
        if (TextUtils.equals(this.f77808b, "image")) {
            Context context = (Context) this.f77793e.get();
            if (context != null) {
                C10691a.m21538a(context, context.getString(R.string.hbn), 1).mo19066a();
            }
        }
    }

    private /* synthetic */ DownloadFileMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }

    /* renamed from: a */
    private final void m69902a(String str, JSONObject jSONObject, int i) {
        C0013i.m18a((Callable<TResult>) new C29800d<TResult>(this, str, jSONObject, 3), C0013i.f25b);
    }
}
