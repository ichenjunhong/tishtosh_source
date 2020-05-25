package com.p683ss.android.ugc.aweme.anim;

import android.content.Context;
import android.util.LruCache;
import com.facebook.p982j.p984b.C14430k;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;

/* renamed from: com.ss.android.ugc.aweme.anim.b */
public class C22681b {

    /* renamed from: a */
    public static final String f60871a = "b";

    /* renamed from: b */
    public LruCache<String, C14430k> f60872b;

    /* renamed from: com.ss.android.ugc.aweme.anim.b$a */
    static class C22685a {

        /* renamed from: a */
        public static C22681b f60881a = new C22681b();
    }

    /* renamed from: a */
    public static C22681b m55896a() {
        return C22685a.f60881a;
    }

    private C22681b() {
        this.f60872b = new LruCache<String, C14430k>(5242880) {
            /* access modifiers changed from: protected */
            public final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
                String str = (String) obj;
                C14430k kVar = (C14430k) obj2;
                if (kVar == null || kVar.f37477e == null || kVar.f37477e.length <= 0) {
                    return 1;
                }
                float f = 1.0f;
                for (float f2 : kVar.f37477e) {
                    f += f2;
                }
                return (int) f;
            }
        };
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0030 A[SYNTHETIC, Splitter:B:20:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0037 A[SYNTHETIC, Splitter:B:26:0x0037] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.facebook.p982j.p984b.C14430k m55895a(android.content.Context r2, java.lang.String r3) {
        /*
            r0 = 0
            if (r2 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            java.io.InputStream r2 = r2.open(r3)     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            android.util.JsonReader r3 = new android.util.JsonReader     // Catch:{ IOException -> 0x0024 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0024 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0024 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0024 }
            com.facebook.j.b.k r3 = com.facebook.p982j.p983a.C14391k.m29500a(r3)     // Catch:{ IOException -> 0x0024 }
            if (r2 == 0) goto L_0x0023
            r2.close()     // Catch:{ IOException -> 0x0023 }
        L_0x0023:
            return r3
        L_0x0024:
            r3 = move-exception
            goto L_0x002b
        L_0x0026:
            r3 = move-exception
            r2 = r0
            goto L_0x0035
        L_0x0029:
            r3 = move-exception
            r2 = r0
        L_0x002b:
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75148a(r3)     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x0033
            r2.close()     // Catch:{ IOException -> 0x0033 }
        L_0x0033:
            return r0
        L_0x0034:
            r3 = move-exception
        L_0x0035:
            if (r2 == 0) goto L_0x003a
            r2.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.anim.C22681b.m55895a(android.content.Context, java.lang.String):com.facebook.j.b.k");
    }

    /* renamed from: a */
    public final void mo47056a(Context context, String str, C22686c cVar) {
        if (str != null) {
            C14430k kVar = (C14430k) this.f60872b.get(str);
            if (kVar != null) {
                cVar.mo47060a(kVar, str);
                return;
            }
            final String str2 = str;
            final Context context2 = context;
            final C22686c cVar2 = cVar;
            C226832 r1 = new Runnable(true) {
                public final void run() {
                    final C14430k a = C22681b.m55895a(context2, str2);
                    if (a != null) {
                        if (true) {
                            C22681b.this.f60872b.put(str2, a);
                        }
                        C18842a.m45934b(new Runnable() {
                            public final void run() {
                                cVar2.mo47060a(a, str2);
                            }
                        });
                    }
                }
            };
            C18842a.m45932a(r1);
        }
    }
}
