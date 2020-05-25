package com.p683ss.android.ugc.effectmanager.common.p2433a;

import com.p683ss.android.ugc.effectmanager.C48901i;
import com.p683ss.android.ugc.effectmanager.common.C48633d;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48606a;
import com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a;
import com.p683ss.android.ugc.effectmanager.model.ExtendedUrlModel;
import com.p683ss.android.ugc.effectmanager.model.ModelInfo;
import java.io.InputStream;
import java.util.Set;
import p2628d.C52775l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.effectmanager.common.a.a */
public final class C48591a extends C48606a implements C48600g {
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b A[SYNTHETIC, Splitter:B:14:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.effectmanager.model.LocalModelInfo mo96144a(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "name"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            java.lang.String r5 = com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.m105182f(r5)
            com.ss.android.ugc.effectmanager.common.b.a.a r0 = r4.f122207e
            r1 = 0
            if (r0 == 0) goto L_0x0037
            java.util.Set r0 = r0.mo96176d()
            if (r0 == 0) goto L_0x0037
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x001a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0032
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = com.p683ss.android.ugc.effectmanager.common.C48633d.m105242a(r3)
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r5)
            if (r3 == 0) goto L_0x001a
            goto L_0x0033
        L_0x0032:
            r2 = r1
        L_0x0033:
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0038
        L_0x0037:
            r5 = r1
        L_0x0038:
            if (r5 != 0) goto L_0x003b
            return r1
        L_0x003b:
            com.ss.android.ugc.effectmanager.common.b.a.a r0 = r4.f122207e     // Catch:{ IOException -> 0x0069, all -> 0x0060 }
            if (r0 == 0) goto L_0x0044
            com.ss.android.ugc.effectmanager.common.b.a.a$c r5 = r0.mo96168a(r5)     // Catch:{ IOException -> 0x0069, all -> 0x0060 }
            goto L_0x0045
        L_0x0044:
            r5 = r1
        L_0x0045:
            if (r5 != 0) goto L_0x0048
            return r1
        L_0x0048:
            r0 = 0
            java.io.File r0 = r5.mo96194b(r0)     // Catch:{ IOException -> 0x006a, all -> 0x005e }
            java.lang.String r2 = "cleanFile"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)     // Catch:{ IOException -> 0x006a, all -> 0x005e }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x006a, all -> 0x005e }
            com.ss.android.ugc.effectmanager.model.LocalModelInfo r0 = com.p683ss.android.ugc.effectmanager.model.LocalModelInfo.fromFile(r0)     // Catch:{ IOException -> 0x006a, all -> 0x005e }
            r5.close()
            return r0
        L_0x005e:
            r0 = move-exception
            goto L_0x0063
        L_0x0060:
            r5 = move-exception
            r0 = r5
            r5 = r1
        L_0x0063:
            if (r5 == 0) goto L_0x0068
            r5.close()
        L_0x0068:
            throw r0
        L_0x0069:
            r5 = r1
        L_0x006a:
            if (r5 == 0) goto L_0x006f
            r5.close()
        L_0x006f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.common.p2433a.C48591a.mo96144a(java.lang.String):com.ss.android.ugc.effectmanager.model.LocalModelInfo");
    }

    public C48591a(String str, String str2) {
        C52711k.m112240b(str, "cacheDir");
        C52711k.m112240b(str2, "effectSdkVersion");
        super(str, str2.hashCode(), 0, Long.MAX_VALUE, null, 20, null);
    }

    /* renamed from: a */
    public final String mo96145a(C48901i iVar, ModelInfo modelInfo, InputStream inputStream) throws RuntimeException {
        C52711k.m112240b(iVar, "modelType");
        C52711k.m112240b(modelInfo, "modelInfo");
        C52711k.m112240b(inputStream, "modelStream");
        String f = C48608a.m105182f(modelInfo.getName());
        C48608a aVar = this.f122207e;
        if (aVar != null) {
            Set<String> d = aVar.mo96176d();
            if (d != null) {
                for (String str : d) {
                    if (C52711k.m112239a((Object) C48633d.m105242a(str), (Object) f)) {
                        C52711k.m112236a((Object) str, "it");
                        mo96153c(str);
                    }
                }
            }
        }
        String f2 = C48608a.m105182f(C48633d.m105241a(modelInfo));
        switch (C48592b.f122162a[iVar.ordinal()]) {
            case 1:
                C52711k.m112236a((Object) f2, "diskLruKey");
                ExtendedUrlModel file_url = modelInfo.getFile_url();
                C52711k.m112236a((Object) file_url, "modelInfo.file_url");
                return (String) mo96166a(f2, inputStream, file_url.getUri(), 0, null).getFirst();
            case 2:
                C52711k.m112236a((Object) f2, "diskLruKey");
                ExtendedUrlModel file_url2 = modelInfo.getFile_url();
                C52711k.m112236a((Object) file_url2, "modelInfo.file_url");
                return (String) mo96165a(f2, inputStream, file_url2.getUri()).getFirst();
            default:
                throw new C52775l();
        }
    }
}
