package com.p683ss.android.ugc.aweme.crossplatform.prefetch;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.geckoclient.C10885e;
import com.bytedance.ies.geckoclient.model.C10957d;
import com.bytedance.ies.p675g.p677b.C10805r;
import com.bytedance.ies.p675g.p678c.C10827b;
import com.bytedance.ies.p675g.p678c.C10828c;
import com.bytedance.ies.p675g.p678c.C10829d;
import com.bytedance.ies.p675g.p678c.C10830e;
import com.bytedance.ies.p675g.p678c.C10830e.C10831a;
import com.bytedance.ies.p675g.p678c.C10840i;
import com.bytedance.ies.p675g.p678c.C10863s;
import com.bytedance.ies.p688h.C10968a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.AccountService;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import com.p683ss.android.ugc.aweme.utils.C47731bq;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p683ss.android.ugc.aweme.web.C48380q;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2629a.C52575l;
import p2628d.p2638e.C52647c;
import p2628d.p2638e.C52666o;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2650m.C52808d;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.b */
public final class C27263b {

    /* renamed from: a */
    public static boolean f71932a;

    /* renamed from: b */
    public static C10830e f71933b;

    /* renamed from: c */
    public static final C27263b f71934c = new C27263b();

    /* renamed from: d */
    private static final ExecutorService f71935d = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(1).mo49847a());

    /* renamed from: e */
    private static String f71936e;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.b$a */
    public static final class C27264a implements C10829d {

        /* renamed from: a */
        final /* synthetic */ Keva f71937a;

        C27264a(Keva keva) {
            this.f71937a = keva;
        }

        /* renamed from: a */
        public final String mo10462a(String str) {
            C52711k.m112240b(str, "key");
            return this.f71937a.getString(str, null);
        }

        /* renamed from: b */
        public final Collection<String> mo10465b(String str) {
            C52711k.m112240b(str, "key");
            return this.f71937a.getStringSet(str, null);
        }

        /* renamed from: c */
        public final void mo10466c(String str) {
            C52711k.m112240b(str, "key");
            this.f71937a.erase(str);
        }

        /* renamed from: a */
        public final void mo10463a(String str, String str2) {
            C52711k.m112240b(str, "key");
            C52711k.m112240b(str2, "value");
            this.f71937a.storeString(str, str2);
        }

        /* renamed from: a */
        public final void mo10464a(String str, Collection<String> collection) {
            C52711k.m112240b(str, "key");
            C52711k.m112240b(collection, "collection");
            this.f71937a.storeStringSet(str, (Set) collection);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.b$b */
    public static final class C27265b implements C10828c {

        /* renamed from: a */
        final /* synthetic */ String f71938a;

        /* renamed from: a */
        public final List<String> mo10467a() {
            return C52575l.m112092a(this.f71938a);
        }

        C27265b(String str) {
            this.f71938a = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.b$c */
    public static final class C27266c implements C10840i {
        C27266c() {
        }

        /* renamed from: a */
        public final void mo19618a(int i, String str) {
            C52711k.m112240b(str, "message");
        }

        /* renamed from: a */
        public final void mo19619a(int i, String str, Throwable th) {
            C52711k.m112240b(str, "message");
            C52711k.m112240b(th, "throwable");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.b$d */
    public static final class C27267d implements C10830e {
        C27267d() {
        }

        /* renamed from: a */
        public final void mo10468a(String str, Map<String, String> map, C10831a aVar) {
            C52711k.m112240b(str, "url");
            C52711k.m112240b(map, "headers");
            C52711k.m112240b(aVar, "callback");
            C10830e a = C27263b.f71933b;
            if (a != null) {
                a.mo10468a(str, map, aVar);
            }
        }

        /* renamed from: a */
        public final void mo10469a(String str, Map<String, String> map, String str2, JSONObject jSONObject, C10831a aVar) {
            C52711k.m112240b(str, "url");
            C52711k.m112240b(map, "headers");
            C52711k.m112240b(str2, "mimeType");
            C52711k.m112240b(jSONObject, "body");
            C52711k.m112240b(aVar, "callback");
            C10830e a = C27263b.f71933b;
            if (a != null) {
                a.mo10469a(str, map, str2, jSONObject, aVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.b$e */
    static final class C27268e extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        public static final C27268e f71939a = new C27268e();

        C27268e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            IAccountUserService userService = AccountService.createIAccountServicebyMonsterPlugin().userService();
            C52711k.m112236a((Object) userService, "ServiceManager.get().get…class.java).userService()");
            return Boolean.valueOf(userService.isLogin());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.b$f */
    public static final class C27269f<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C27269f f71940a = new C27269f();

        C27269f() {
        }

        public final /* synthetic */ Object call() {
            boolean z;
            String a = C27263b.f71934c.mo55646a();
            CharSequence charSequence = a;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return "";
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.b$g */
    public static final class C27270g<TTaskResult, TContinuationResult> implements C0011g<String, Void> {

        /* renamed from: a */
        final /* synthetic */ C10805r f71941a;

        /* renamed from: b */
        final /* synthetic */ String f71942b;

        public C27270g(C10805r rVar, String str) {
            this.f71941a = rVar;
            this.f71942b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C0013i<String> iVar) {
            try {
                C27263b bVar = C27263b.f71934c;
                C52711k.m112236a((Object) iVar, "it");
                Object e = iVar.mo34e();
                C52711k.m112236a(e, "it.result");
                bVar.mo55647a((String) e);
                C27263b bVar2 = C27263b.f71934c;
                C27263b.f71933b = C27258a.f71921a;
                C10863s.m22025a(this.f71941a);
                C10863s.f29164b.mo19637a(this.f71942b);
            } catch (Exception e2) {
                C32458a.m75148a((Throwable) e2);
            }
            return null;
        }
    }

    private C27263b() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0017 A[SYNTHETIC, Splitter:B:13:0x0017] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String mo55646a() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = f71936e     // Catch:{ all -> 0x0029 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0010
            int r0 = r0.length()     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x000e
            goto L_0x0010
        L_0x000e:
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = f71936e     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)
            return r0
        L_0x0017:
            boolean r0 = com.p683ss.android.ugc.aweme.utils.C47731bq.m103352f()     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = m65713c()     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)
            return r0
        L_0x0023:
            java.lang.String r0 = m65712b()     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)
            return r0
        L_0x0029:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.prefetch.C27263b.mo55646a():java.lang.String");
    }

    /* renamed from: b */
    private static String m65712b() {
        boolean z;
        boolean z2;
        Closeable bufferedReader;
        Throwable th;
        Throwable th2;
        C10885e e = C47731bq.m103348e();
        if (e != null) {
            C10957d a = e.mo19651a("gecko_hybrid_prefetch_zip");
            if (a != null) {
                CharSequence charSequence = a.f29404d;
                int i = 0;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && !TextUtils.equals(TEVideoRecorder.FACE_BEAUTY_NULL, a.f29404d)) {
                    Context a2 = C11010c.m22280a();
                    String i2 = C11010c.m22288i();
                    String serverDeviceId = AppLog.getServerDeviceId();
                    String[] strArr = new String[1];
                    C48380q e2 = C48380q.m104672e();
                    if (e2 == null) {
                        C52711k.m112234a();
                    }
                    strArr[0] = e2.mo41208b();
                    C10968a a3 = C10968a.m22224a(a2, i2, serverDeviceId, strArr);
                    C52711k.m112236a((Object) a3, "iesOfflineCache");
                    File file = new File(a3.mo19784a(), a.f29404d);
                    if (file.exists()) {
                        File[] listFiles = file.listFiles();
                        C52711k.m112236a((Object) listFiles, "dir.listFiles()");
                        if (listFiles.length == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            File[] listFiles2 = file.listFiles();
                            if (listFiles2 == null) {
                                C52711k.m112234a();
                            }
                            int length = listFiles2.length;
                            while (i < length) {
                                File file2 = listFiles2[i];
                                C52711k.m112236a((Object) file2, "file");
                                if (C52830p.m112406a("prefetch.json", file2.getName(), true)) {
                                    try {
                                        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2.getAbsolutePath()), C52808d.f131043a), VideoCacheReadBuffersizeExperiment.DEFAULT);
                                        try {
                                            String b = C52666o.m112218b((BufferedReader) bufferedReader);
                                            C52647c.m112189a(bufferedReader, null);
                                            f71936e = b;
                                            return b;
                                        } catch (Throwable th3) {
                                            Throwable th4 = th3;
                                            th = r6;
                                            th2 = th4;
                                        }
                                    } catch (Exception e3) {
                                        C32458a.m75148a((Throwable) e3);
                                    }
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                    return null;
                }
            }
            return null;
        }
        return null;
        C52647c.m112189a(bufferedReader, th);
        throw th2;
    }

    /* renamed from: c */
    private static String m65713c() {
        boolean z;
        Closeable bufferedReader;
        Throwable th;
        Throwable th2;
        String d = C47731bq.m103346d(C48380q.m104672e().mo41210d(), "gecko_hybrid_prefetch_zip");
        if (TextUtils.isEmpty(d)) {
            return null;
        }
        File file = new File(d);
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            C52711k.m112236a((Object) listFiles, "dir.listFiles()");
            int i = 0;
            if (listFiles.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                File[] listFiles2 = file.listFiles();
                if (listFiles2 == null) {
                    C52711k.m112234a();
                }
                int length = listFiles2.length;
                while (i < length) {
                    File file2 = listFiles2[i];
                    C52711k.m112236a((Object) file2, "file");
                    if (C52830p.m112406a("prefetch.json", file2.getName(), true)) {
                        try {
                            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2.getAbsolutePath()), C52808d.f131043a), VideoCacheReadBuffersizeExperiment.DEFAULT);
                            try {
                                String b = C52666o.m112218b((BufferedReader) bufferedReader);
                                C52647c.m112189a(bufferedReader, null);
                                f71936e = b;
                                return b;
                            } catch (Throwable th3) {
                                Throwable th4 = th3;
                                th = r6;
                                th2 = th4;
                            }
                        } catch (Exception e) {
                            C32458a.m75148a((Throwable) e);
                        }
                    } else {
                        i++;
                    }
                }
                return null;
            }
        }
        return null;
        C52647c.m112189a(bufferedReader, th);
        throw th2;
    }

    /* renamed from: a */
    public final void mo55647a(String str) {
        C27263b bVar;
        C52711k.m112240b(str, "configProvider");
        Keva repo = Keva.getRepo("KEY_PREFETCH_CACHE");
        C10827b b = C10863s.m22030b();
        b.f29088b = 32;
        C10827b a = b.mo19610a(false).mo19607a((C10829d) new C27264a(repo)).mo19606a((C10828c) new C27265b(str));
        C10840i cVar = new C27266c();
        C52711k.m112240b(cVar, "logger");
        a.f29087a = cVar;
        C10827b a2 = a.mo19608a((C10830e) new C27267d());
        ExecutorService executorService = f71935d;
        C52711k.m112236a((Object) executorService, "workerExecutor");
        C10827b a3 = a2.mo19609a((Executor) executorService);
        String str2 = "login";
        C52670a aVar = C27268e.f71939a;
        C52711k.m112240b(str2, "condition");
        C52711k.m112240b(aVar, "predicate");
        a3.f29089c.put(str2, aVar);
        a3.mo19611a();
        if (!C52830p.m112402a(str)) {
            bVar = this;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            f71932a = true;
        }
    }
}
