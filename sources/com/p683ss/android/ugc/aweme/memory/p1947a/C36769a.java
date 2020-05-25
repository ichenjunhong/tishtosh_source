package com.p683ss.android.ugc.aweme.memory.p1947a;

import com.bytedance.keva.Keva;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.antiaddic.lock.api.C22709a;
import com.p683ss.android.ugc.aweme.memory.api.CIBuildApi;
import com.p683ss.android.ugc.aweme.memory.api.CIBuildResponse;
import java.util.regex.Pattern;
import kotlinx.coroutines.C53199ae;
import p2628d.C52860x;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.p2632a.C52601b;
import p2628d.p2631c.p2633b.p2634a.C52618f;
import p2628d.p2631c.p2633b.p2634a.C52624k;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.memory.a.a */
public final class C36769a {

    /* renamed from: a */
    public static final Pattern f93960a = Pattern.compile("(https|http)://.+?/job/(.+?/.+?)/");

    /* renamed from: b */
    public static String f93961b = m82757b();

    /* renamed from: c */
    public static final Keva f93962c = Keva.getRepo("repo_mapping_url");

    /* renamed from: d */
    public static volatile String f93963d = "";

    /* renamed from: e */
    public static final C36769a f93964e = new C36769a();

    @C52618f(mo110254b = "MappingUrlManager.kt", mo110255c = {63}, mo110256d = "invokeSuspend", mo110257e = "com.ss.android.ugc.aweme.memory.automap.MappingUrlManager$startFindMappingUrl$1")
    /* renamed from: com.ss.android.ugc.aweme.memory.a.a$a */
    public static final class C36770a extends C52624k implements C52682m<C53199ae, C52625c<? super C52860x>, Object> {

        /* renamed from: a */
        Object f93965a;

        /* renamed from: b */
        int f93966b;

        /* renamed from: c */
        final /* synthetic */ String f93967c;

        /* renamed from: d */
        private C53199ae f93968d;

        public C36770a(String str, C52625c cVar) {
            this.f93967c = str;
            super(2, cVar);
        }

        public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
            C52711k.m112240b(cVar, "completion");
            C36770a aVar = new C36770a(this.f93967c, cVar);
            aVar.f93968d = (C53199ae) obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C36770a) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
        }

        public final Object invokeSuspend(Object obj) {
            Object a = C52601b.m112157a();
            switch (this.f93966b) {
                case 0:
                    C53199ae aeVar = this.f93968d;
                    try {
                        String str = this.f93967c;
                        C52711k.m112240b(str, "jobIndex");
                        C17832m doGet = CIBuildApi.f93969a.doGet(str);
                        this.f93965a = aeVar;
                        this.f93966b = 1;
                        obj = C22709a.m55931a(doGet, this);
                        if (obj == a) {
                            return a;
                        }
                    } catch (Throwable unused) {
                        break;
                    }
                case 1:
                    String mappingUrl = ((CIBuildResponse) obj).getMappingUrl();
                    C52711k.m112240b(mappingUrl, "<set-?>");
                    C36769a.f93963d = mappingUrl;
                    C36769a aVar = C36769a.f93964e;
                    C36769a.f93962c.storeString("mapping_url", C36769a.m82756a());
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C52860x.f131107a;
        }
    }

    private C36769a() {
    }

    /* renamed from: a */
    public static String m82756a() {
        return f93963d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d A[SYNTHETIC, Splitter:B:16:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0045 A[SYNTHETIC, Splitter:B:23:0x0045] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m82757b() {
        /*
            r0 = 0
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ Throwable -> 0x0041, all -> 0x0037 }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ Throwable -> 0x0041, all -> 0x0037 }
            java.lang.String r2 = "assets-map/aweme.json"
            java.io.InputStream r1 = r1.open(r2)     // Catch:{ Throwable -> 0x0041, all -> 0x0037 }
            int r0 = r1.available()     // Catch:{ Throwable -> 0x0035, all -> 0x0033 }
            byte[] r0 = new byte[r0]     // Catch:{ Throwable -> 0x0035, all -> 0x0033 }
            r1.read(r0)     // Catch:{ Throwable -> 0x0035, all -> 0x0033 }
            r1.close()     // Catch:{ Throwable -> 0x0035, all -> 0x0033 }
            java.lang.String r2 = new java.lang.String     // Catch:{ Throwable -> 0x0035, all -> 0x0033 }
            java.nio.charset.Charset r3 = p2628d.p2650m.C52808d.f131043a     // Catch:{ Throwable -> 0x0035, all -> 0x0033 }
            r2.<init>(r0, r3)     // Catch:{ Throwable -> 0x0035, all -> 0x0033 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0035, all -> 0x0033 }
            r0.<init>(r2)     // Catch:{ Throwable -> 0x0035, all -> 0x0033 }
            java.lang.String r2 = "aweme_build_version"
            java.lang.String r0 = r0.optString(r2)     // Catch:{ Throwable -> 0x0035, all -> 0x0033 }
            if (r1 == 0) goto L_0x0032
            r1.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            return r0
        L_0x0033:
            r0 = move-exception
            goto L_0x003b
        L_0x0035:
            r0 = r1
            goto L_0x0041
        L_0x0037:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x003b:
            if (r1 == 0) goto L_0x0040
            r1.close()     // Catch:{ IOException -> 0x0040 }
        L_0x0040:
            throw r0
        L_0x0041:
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0048
            r0.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.memory.p1947a.C36769a.m82757b():java.lang.String");
    }
}
