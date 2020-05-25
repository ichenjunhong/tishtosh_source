package com.p683ss.android.ugc.aweme.p1706fe.method.upload;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29848a.C29851a;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29858b;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29908n;
import com.p683ss.android.ugc.aweme.p1706fe.method.upload.GetUploadConfigService.UploadConfigService;
import com.p683ss.android.ugc.aweme.p1706fe.method.upload.p1712a.C29939a;
import com.p683ss.android.ugc.aweme.p1706fe.method.upload.p1712a.C29940b;
import com.p683ss.android.ugc.aweme.p1706fe.method.upload.p1713b.C29942a;
import com.p683ss.android.ugc.aweme.p1706fe.method.upload.p1713b.C29943b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39597bg.C39598a;
import com.p683ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p683ss.android.ugc.aweme.utils.permission.C47946e;
import com.p683ss.android.ugc.aweme.views.C48191h;
import com.p683ss.ttuploader.TTVideoInfo;
import com.p683ss.ttuploader.TTVideoUploader;
import com.p683ss.ttuploader.TTVideoUploaderListener;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.concurrent.Executor;
import org.apache.commons.codec.binary.Base64;
import org.json.JSONArray;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2650m.C52808d;

/* renamed from: com.ss.android.ugc.aweme.fe.method.upload.e */
public final class C29960e implements C29938a {

    /* renamed from: f */
    public static final C29961a f78207f = new C29961a(null);

    /* renamed from: a */
    UploadConfigService f78208a = new GetUploadConfigService().f78094a;

    /* renamed from: b */
    public TTVideoUploader f78209b;

    /* renamed from: c */
    public WeakReference<Activity> f78210c;

    /* renamed from: d */
    public C29851a f78211d;

    /* renamed from: e */
    public C29908n f78212e;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.e$a */
    public static final class C29961a {
        private C29961a() {
        }

        public /* synthetic */ C29961a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.e$b */
    final class C29962b implements TTVideoUploaderListener {
        public final String getStringFromExtern(int i) {
            return "";
        }

        public final void onLog(int i, int i2, String str) {
        }

        public final void onUploadVideoStage(int i, long j) {
        }

        public C29962b() {
        }

        public final int videoUploadCheckNetState(int i, int i2) {
            if (C29960e.this.f78210c.get() != null) {
                Object obj = C29960e.this.f78210c.get();
                if (obj != null) {
                    Object systemService = ((Activity) obj).getSystemService("connectivity");
                    if (systemService == null) {
                        throw new C52857u("null cannot be cast to non-null type android.net.ConnectivityManager");
                    } else if (C29969f.m70113a((ConnectivityManager) systemService) != null) {
                        return 1;
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.app.Activity");
                }
            }
            return 0;
        }

        public final void onNotify(int i, long j, TTVideoInfo tTVideoInfo) {
            if (i == 0) {
                try {
                    C29960e eVar = C29960e.this;
                    if (tTVideoInfo == null) {
                        C52711k.m112234a();
                    }
                    String str = tTVideoInfo.mVideoId;
                    C52711k.m112236a((Object) str, "info!!.mVideoId");
                    eVar.mo60141a(str, 3);
                    C29960e.m70104a(C29960e.this).close();
                } catch (Exception unused) {
                }
            } else {
                if (i == 2) {
                    C29960e.this.mo60140a(0, "uploadFailed");
                    try {
                        C29960e.m70104a(C29960e.this).close();
                    } catch (Exception unused2) {
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.e$c */
    static final class C29963c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C29960e f78214a;

        C29963c(C29960e eVar) {
            this.f78214a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C29960e eVar = this.f78214a;
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            Activity activity = (Activity) eVar.f78210c.get();
            if (activity != null) {
                activity.startActivityForResult(intent, 800);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.e$d */
    static final class C29964d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C29960e f78215a;

        C29964d(C29960e eVar) {
            this.f78215a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C29960e eVar = this.f78215a;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("video/*");
            Activity activity = (Activity) eVar.f78210c.get();
            if (activity != null) {
                activity.startActivityForResult(intent, 700);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.e$e */
    public static final class C29965e implements C39598a {

        /* renamed from: a */
        final /* synthetic */ C29960e f78216a;

        /* renamed from: b */
        final /* synthetic */ Intent f78217b;

        public final void onSuccess() {
            String str;
            C29960e eVar = this.f78216a;
            Intent intent = this.f78217b;
            if (intent != null) {
                str = intent.getStringExtra("filePath");
            } else {
                str = null;
            }
            if (str != null) {
                eVar.f78209b = new TTVideoUploader();
                IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin();
                C52711k.m112236a((Object) createIAVServiceProxybyMonsterPlugin, "ServiceManager.get().get…ServiceProxy::class.java)");
                createIAVServiceProxybyMonsterPlugin.getShortVideoPluginService();
                eVar.f78208a.getUploadAuthConfig().mo20a((C0011g<TResult, TContinuationResult>) new C29968h<TResult,TContinuationResult>(eVar, str), C0013i.f25b);
            }
        }

        C29965e(C29960e eVar, Intent intent) {
            this.f78216a = eVar;
            this.f78217b = intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.e$f */
    static final class C29966f<TTaskResult, TContinuationResult> implements C0011g<C29942a, Void> {

        /* renamed from: a */
        final /* synthetic */ C29960e f78218a;

        /* renamed from: b */
        final /* synthetic */ int f78219b;

        /* renamed from: c */
        final /* synthetic */ String f78220c;

        C29966f(C29960e eVar, int i, String str) {
            this.f78218a = eVar;
            this.f78219b = i;
            this.f78220c = str;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            if (iVar != null && !iVar.mo33d() && ((C29942a) iVar.mo34e()).f78138a == 0) {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                C29943b bVar = ((C29942a) iVar.mo34e()).f78140c;
                if (bVar != null) {
                    String str = "mainUrl";
                    String str2 = bVar.f78141a;
                    Charset charset = C52808d.f131043a;
                    if (str2 != null) {
                        byte[] bytes = str2.getBytes(charset);
                        C52711k.m112236a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                        byte[] decodeBase64 = Base64.decodeBase64(bytes);
                        C52711k.m112236a((Object) decodeBase64, "Base64.decodeBase64(uplo…e.videoUrl.toByteArray())");
                        jSONObject.put(str, new String(decodeBase64, C52808d.f131043a));
                        jSONObject.put("posterUrl", bVar.f78143c);
                        String str3 = "backupUrl";
                        String str4 = bVar.f78142b;
                        Charset charset2 = C52808d.f131043a;
                        if (str4 != null) {
                            byte[] bytes2 = str4.getBytes(charset2);
                            C52711k.m112236a((Object) bytes2, "(this as java.lang.String).getBytes(charset)");
                            byte[] decodeBase642 = Base64.decodeBase64(bytes2);
                            C52711k.m112236a((Object) decodeBase642, "Base64.decodeBase64(uplo…oBackupUrl.toByteArray())");
                            jSONObject.put(str3, new String(decodeBase642, C52808d.f131043a));
                            jSONObject.put("mediaType", bVar.f78144d);
                            jSONArray.put(jSONObject);
                            this.f78218a.f78212e.mo49923a(jSONArray);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type java.lang.String");
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.lang.String");
                    }
                }
            } else if (this.f78219b > 0) {
                Thread.sleep(1000);
                this.f78218a.mo60141a(this.f78220c, this.f78219b - 1);
            } else if (iVar == null || iVar.mo33d()) {
                this.f78218a.mo60140a(0, "uploadFailed");
            } else if (((C29942a) iVar.mo34e()).f78138a != 0) {
                this.f78218a.mo60140a(((C29942a) iVar.mo34e()).f78138a, ((C29942a) iVar.mo34e()).f78139b);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.e$g */
    static final class C29967g implements C23364b {

        /* renamed from: a */
        final /* synthetic */ Activity f78221a;

        /* renamed from: b */
        final /* synthetic */ C29960e f78222b;

        /* renamed from: c */
        final /* synthetic */ C52670a f78223c;

        C29967g(Activity activity, C29960e eVar, C52670a aVar) {
            this.f78221a = activity;
            this.f78222b = eVar;
            this.f78223c = aVar;
        }

        /* renamed from: a */
        public final void mo40906a(String[] strArr, int[] iArr) {
            if (iArr[0] == 0 && iArr[1] == 0) {
                this.f78223c.invoke();
                return;
            }
            if (iArr[0] != 0) {
                C10691a.m21552c((Context) this.f78221a, this.f78221a.getString(R.string.co0), 0).mo19066a();
            }
            if (iArr[1] != 0) {
                C10691a.m21552c((Context) this.f78221a, this.f78221a.getString(R.string.cny), 0).mo19066a();
            }
            this.f78222b.f78212e.mo49922a(-1, "uploadFailed");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.e$h */
    static final class C29968h<TTaskResult, TContinuationResult> implements C0011g<C29939a, Void> {

        /* renamed from: a */
        final /* synthetic */ C29960e f78224a;

        /* renamed from: b */
        final /* synthetic */ String f78225b;

        C29968h(C29960e eVar, String str) {
            this.f78224a = eVar;
            this.f78225b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C0013i<C29939a> iVar) {
            if (iVar == null || iVar.mo33d() || ((C29939a) iVar.mo34e()).f78123a != 0) {
                if (iVar == null || iVar.mo33d()) {
                    this.f78224a.mo60140a(0, "uploadFailed");
                } else if (((C29939a) iVar.mo34e()).f78123a != 0) {
                    this.f78224a.mo60140a(((C29939a) iVar.mo34e()).f78123a, ((C29939a) iVar.mo34e()).f78124b);
                }
                try {
                    C29960e.m70104a(this.f78224a).close();
                } catch (Exception unused) {
                }
            } else {
                C29940b bVar = ((C29939a) iVar.mo34e()).f78125c;
                if (bVar != null) {
                    if (new File(this.f78225b).length() > ((long) bVar.f78136k)) {
                        C10691a.m21543b((Context) this.f78224a.f78210c.get(), (int) R.string.fbl, 0).mo19066a();
                        this.f78224a.mo60140a(0, "uploadFailed");
                    } else {
                        TTVideoUploader a = C29960e.m70104a(this.f78224a);
                        try {
                            a.setPathName(this.f78225b);
                            a.setAuthorization(bVar.f78127b);
                            a.setFileRetryCount(bVar.f78134i);
                            a.setUserKey(bVar.f78126a);
                            a.setEnableHttps(bVar.f78137l);
                            a.setSliceTimeout(bVar.f78130e);
                            a.setSliceReTryCount(bVar.f78131f);
                            a.setSliceSize(bVar.f78132g);
                            a.setSocketNum(bVar.f78133h);
                            a.setMaxFailTime(bVar.f78135j);
                            a.setVideoUploadDomain(bVar.f78128c);
                            a.setListener(new C29962b());
                            a.start();
                        } catch (Exception unused2) {
                        }
                        C29851a aVar = this.f78224a.f78211d;
                        Context context = (Context) this.f78224a.f78210c.get();
                        C29938a aVar2 = this.f78224a;
                        aVar.f77931a = new C48191h(context, context.getString(R.string.f8d));
                        aVar.f77932b = new WeakReference<>(aVar2);
                        aVar.f77931a.setOnCancelListener(new C29858b(aVar));
                        aVar.f77931a.show();
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void mo60080a() {
        try {
            TTVideoUploader tTVideoUploader = this.f78209b;
            if (tTVideoUploader == null) {
                C52711k.m112237a("uploader");
            }
            tTVideoUploader.stop();
            TTVideoUploader tTVideoUploader2 = this.f78209b;
            if (tTVideoUploader2 == null) {
                C52711k.m112237a("uploader");
            }
            tTVideoUploader2.close();
            mo60140a(0, "uploadCancel");
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TTVideoUploader m70104a(C29960e eVar) {
        TTVideoUploader tTVideoUploader = eVar.f78209b;
        if (tTVideoUploader == null) {
            C52711k.m112237a("uploader");
        }
        return tTVideoUploader;
    }

    /* renamed from: a */
    private final void m70105a(C52670a<C52860x> aVar) {
        Activity activity = (Activity) this.f78210c.get();
        if (activity != null) {
            Context context = activity;
            if (C47946e.m103734a(context) == 0 && C47946e.m103737c(context) == 0) {
                aVar.invoke();
            } else {
                C23361b.m57419a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA"}, new C29967g(activity, this, aVar));
            }
        }
    }

    /* renamed from: a */
    public final void mo60082a(JSONObject jSONObject) {
        C52711k.m112240b(jSONObject, "params");
        int optInt = jSONObject.optInt("type");
        if (optInt == 700) {
            m70105a((C52670a<C52860x>) new C29964d<C52860x>(this));
        } else if (optInt == 800) {
            m70105a((C52670a<C52860x>) new C29963c<C52860x>(this));
        }
    }

    /* renamed from: a */
    public final void mo60140a(int i, String str) {
        this.f78212e.mo49922a(i, str);
    }

    /* renamed from: a */
    public final void mo60141a(String str, int i) {
        this.f78208a.getUploadPlayUrlResponse(str).mo20a((C0011g<TResult, TContinuationResult>) new C29966f<TResult,TContinuationResult>(this, i, str), (Executor) C0013i.f24a);
    }

    public C29960e(WeakReference<Activity> weakReference, C29851a aVar, C29908n nVar) {
        C52711k.m112240b(weakReference, "contextRef");
        C52711k.m112240b(aVar, "dialog");
        C52711k.m112240b(nVar, "onFileSelected");
        this.f78210c = weakReference;
        this.f78211d = aVar;
        this.f78212e = nVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r6 != 900) goto L_0x00c5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo60083a(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            r0 = 600(0x258, float:8.41E-43)
            r1 = 0
            r2 = 1
            if (r6 == r0) goto L_0x0097
            r3 = 0
            r4 = 700(0x2bc, float:9.81E-43)
            if (r6 == r4) goto L_0x0056
            r0 = 900(0x384, float:1.261E-42)
            r4 = 800(0x320, float:1.121E-42)
            if (r6 == r4) goto L_0x0015
            if (r6 == r0) goto L_0x0097
            goto L_0x00c5
        L_0x0015:
            if (r7 != 0) goto L_0x001d
            java.lang.String r6 = "uploadCancel"
            r5.mo60140a(r1, r6)
            return r2
        L_0x001d:
            java.lang.ref.WeakReference<android.app.Activity> r6 = r5.f78210c
            java.lang.Object r6 = r6.get()
            android.content.Context r6 = (android.content.Context) r6
            if (r8 == 0) goto L_0x002b
            android.net.Uri r3 = r8.getData()
        L_0x002b:
            java.lang.String r6 = com.p683ss.android.newmedia.C19547d.m47839a(r6, r3)
            android.content.Intent r7 = new android.content.Intent
            java.lang.ref.WeakReference<android.app.Activity> r8 = r5.f78210c
            java.lang.Object r8 = r8.get()
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Class<com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity> r1 = com.p683ss.android.ugc.aweme.p1706fe.method.upload.PreviewUploadActivity.class
            r7.<init>(r8, r1)
            java.lang.String r8 = "filePath"
            r7.putExtra(r8, r6)
            java.lang.String r6 = "src"
            r7.putExtra(r6, r4)
            java.lang.ref.WeakReference<android.app.Activity> r6 = r5.f78210c
            java.lang.Object r6 = r6.get()
            android.app.Activity r6 = (android.app.Activity) r6
            if (r6 == 0) goto L_0x00c5
            r6.startActivityForResult(r7, r0)
            goto L_0x00c5
        L_0x0056:
            if (r7 != 0) goto L_0x005e
            java.lang.String r6 = "uploadCancel"
            r5.mo60140a(r1, r6)
            return r2
        L_0x005e:
            java.lang.ref.WeakReference<android.app.Activity> r6 = r5.f78210c
            java.lang.Object r6 = r6.get()
            android.content.Context r6 = (android.content.Context) r6
            if (r8 == 0) goto L_0x006c
            android.net.Uri r3 = r8.getData()
        L_0x006c:
            java.lang.String r6 = com.p683ss.android.newmedia.C19547d.m47839a(r6, r3)
            android.content.Intent r7 = new android.content.Intent
            java.lang.ref.WeakReference<android.app.Activity> r8 = r5.f78210c
            java.lang.Object r8 = r8.get()
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Class<com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity> r1 = com.p683ss.android.ugc.aweme.p1706fe.method.upload.PreviewUploadActivity.class
            r7.<init>(r8, r1)
            java.lang.String r8 = "filePath"
            r7.putExtra(r8, r6)
            java.lang.String r6 = "src"
            r7.putExtra(r6, r4)
            java.lang.ref.WeakReference<android.app.Activity> r6 = r5.f78210c
            java.lang.Object r6 = r6.get()
            android.app.Activity r6 = (android.app.Activity) r6
            if (r6 == 0) goto L_0x00c5
            r6.startActivityForResult(r7, r0)
            goto L_0x00c5
        L_0x0097:
            r6 = -1
            if (r7 != r6) goto L_0x00be
            com.ss.android.ugc.aweme.services.IAVServiceProxy r6 = com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin()
            java.lang.String r7 = "ServiceManager.get().get…ServiceProxy::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            com.ss.android.ugc.aweme.services.IAVServiceProxy r6 = (com.p683ss.android.ugc.aweme.services.IAVServiceProxy) r6
            com.ss.android.ugc.aweme.port.in.bg r6 = r6.getShortVideoPluginService()
            java.lang.ref.WeakReference<android.app.Activity> r7 = r5.f78210c
            java.lang.Object r7 = r7.get()
            android.content.Context r7 = (android.content.Context) r7
            java.lang.String r0 = "ttvideouploader"
            com.ss.android.ugc.aweme.fe.method.upload.e$e r1 = new com.ss.android.ugc.aweme.fe.method.upload.e$e
            r1.<init>(r5, r8)
            com.ss.android.ugc.aweme.port.in.bg$a r1 = (com.p683ss.android.ugc.aweme.port.p2082in.C39597bg.C39598a) r1
            r6.mo80677a(r7, r2, r0, r1)
            goto L_0x00c5
        L_0x00be:
            if (r7 != 0) goto L_0x00c5
            java.lang.String r6 = "uploadCancel"
            r5.mo60140a(r1, r6)
        L_0x00c5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1706fe.method.upload.C29960e.mo60083a(int, int, android.content.Intent):boolean");
    }
}
