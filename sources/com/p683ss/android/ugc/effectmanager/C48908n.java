package com.p683ss.android.ugc.effectmanager;

import com.p683ss.android.ugc.effectmanager.common.C48605b;
import com.p683ss.android.ugc.effectmanager.common.p2439f.C48644a;
import com.p683ss.android.ugc.effectmanager.model.ModelInfo;
import com.p683ss.android.ugc.effectmanager.p2432c.C48589b;
import java.io.InputStream;

/* renamed from: com.ss.android.ugc.effectmanager.n */
public final class C48908n implements C48589b {

    /* renamed from: a */
    private C48887f f123056a;

    /* renamed from: b */
    private C48644a f123057b;

    public C48908n(C48887f fVar, C48644a aVar) {
        this.f123056a = fVar;
        this.f123057b = aVar;
    }

    /* renamed from: b */
    private InputStream m105701b(ModelInfo modelInfo, C48901i iVar) {
        String str = (String) modelInfo.getFile_url().getUrl(iVar).get(0);
        try {
            return this.f123057b.mo96221a(new C48605b("GET", str));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("download model: with type ");
            sb.append(iVar);
            sb.append(", with url ");
            sb.append(str);
            sb.append(" failed ");
            sb.append(e.getMessage());
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:33|(2:42|43)|44|45) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00b3 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo96141a(com.p683ss.android.ugc.effectmanager.model.ModelInfo r9, com.p683ss.android.ugc.effectmanager.C48901i r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.ss.android.ugc.effectmanager.model.ExtendedUrlModel r0 = r9.getFile_url()     // Catch:{ all -> 0x00b4 }
            java.util.List r1 = r0.getUrlList()     // Catch:{ all -> 0x00b4 }
            if (r1 == 0) goto L_0x0015
            java.util.List r1 = r0.getUrlList()     // Catch:{ all -> 0x00b4 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00b4 }
            if (r1 == 0) goto L_0x0017
        L_0x0015:
            com.ss.android.ugc.effectmanager.i r10 = com.p683ss.android.ugc.effectmanager.C48901i.ZIP     // Catch:{ all -> 0x00b4 }
        L_0x0017:
            java.util.List r1 = r0.getZipUrlList()     // Catch:{ all -> 0x00b4 }
            if (r1 == 0) goto L_0x0027
            java.util.List r0 = r0.getZipUrlList()     // Catch:{ all -> 0x00b4 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x0029
        L_0x0027:
            com.ss.android.ugc.effectmanager.i r10 = com.p683ss.android.ugc.effectmanager.C48901i.ORIGIN     // Catch:{ all -> 0x00b4 }
        L_0x0029:
            java.lang.String r0 = com.p683ss.android.ugc.effectmanager.common.C48633d.m105241a(r9)     // Catch:{ all -> 0x00b4 }
            java.io.InputStream r1 = r8.m105701b(r9, r10)     // Catch:{ all -> 0x00b4 }
            com.ss.android.ugc.effectmanager.f r2 = r8.f123056a     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = r9.getName()     // Catch:{ all -> 0x00b4 }
            java.util.ArrayList r2 = r2.mo96658b(r3)     // Catch:{ all -> 0x00b4 }
            com.ss.android.ugc.effectmanager.f r3 = r8.f123056a     // Catch:{ NoSuchAlgorithmException -> 0x00a8, RuntimeException -> 0x007f }
            java.lang.String r4 = "MD5"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch:{ NoSuchAlgorithmException -> 0x00a8, RuntimeException -> 0x007f }
            com.ss.android.ugc.effectmanager.model.ExtendedUrlModel r9 = r9.getFile_url()     // Catch:{ NoSuchAlgorithmException -> 0x00a8, RuntimeException -> 0x007f }
            java.lang.String r9 = r9.getUri()     // Catch:{ NoSuchAlgorithmException -> 0x00a8, RuntimeException -> 0x007f }
            int[] r5 = com.p683ss.android.ugc.effectmanager.C48887f.C488881.f122946a     // Catch:{ NoSuchAlgorithmException -> 0x00a8, RuntimeException -> 0x007f }
            int r6 = r10.ordinal()     // Catch:{ NoSuchAlgorithmException -> 0x00a8, RuntimeException -> 0x007f }
            r5 = r5[r6]     // Catch:{ NoSuchAlgorithmException -> 0x00a8, RuntimeException -> 0x007f }
            r6 = 1
            if (r5 == r6) goto L_0x005b
            long r3 = r3.mo96657b(r0, r1, r4, r9)     // Catch:{ NoSuchAlgorithmException -> 0x00a8, RuntimeException -> 0x007f }
            goto L_0x005f
        L_0x005b:
            long r3 = r3.mo96656a(r0, r1, r4, r9)     // Catch:{ NoSuchAlgorithmException -> 0x00a8, RuntimeException -> 0x007f }
        L_0x005f:
            r9 = 0
            int r5 = r2.size()     // Catch:{ NoSuchAlgorithmException -> 0x00a8, RuntimeException -> 0x007f }
        L_0x0064:
            if (r9 >= r5) goto L_0x0076
            java.lang.Object r6 = r2.get(r9)     // Catch:{ NoSuchAlgorithmException -> 0x00a8, RuntimeException -> 0x007f }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NoSuchAlgorithmException -> 0x00a8, RuntimeException -> 0x007f }
            com.ss.android.ugc.effectmanager.f r7 = r8.f123056a     // Catch:{  }
            com.ss.android.ugc.effectmanager.b.a r7 = r7.f122944a     // Catch:{ Exception -> 0x0073 }
            r7.mo96109c(r6)     // Catch:{ Exception -> 0x0073 }
        L_0x0073:
            int r9 = r9 + 1
            goto L_0x0064
        L_0x0076:
            if (r1 == 0) goto L_0x007b
            r1.close()     // Catch:{ IOException -> 0x007b }
        L_0x007b:
            monitor-exit(r8)
            return r3
        L_0x007d:
            r9 = move-exception
            goto L_0x00ae
        L_0x007f:
            r9 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x007d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x007d }
            java.lang.String r4 = "convertStreamToFile: with type: "
            r3.<init>(r4)     // Catch:{ all -> 0x007d }
            r3.append(r10)     // Catch:{ all -> 0x007d }
            java.lang.String r10 = ",with name: "
            r3.append(r10)     // Catch:{ all -> 0x007d }
            r3.append(r0)     // Catch:{ all -> 0x007d }
            java.lang.String r10 = " failed. "
            r3.append(r10)     // Catch:{ all -> 0x007d }
            java.lang.String r10 = r9.getMessage()     // Catch:{ all -> 0x007d }
            r3.append(r10)     // Catch:{ all -> 0x007d }
            java.lang.String r10 = r3.toString()     // Catch:{ all -> 0x007d }
            r2.<init>(r10, r9)     // Catch:{ all -> 0x007d }
            throw r2     // Catch:{ all -> 0x007d }
        L_0x00a8:
            java.lang.AssertionError r9 = new java.lang.AssertionError     // Catch:{ all -> 0x007d }
            r9.<init>()     // Catch:{ all -> 0x007d }
            throw r9     // Catch:{ all -> 0x007d }
        L_0x00ae:
            if (r1 == 0) goto L_0x00b3
            r1.close()     // Catch:{ IOException -> 0x00b3 }
        L_0x00b3:
            throw r9     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.C48908n.mo96141a(com.ss.android.ugc.effectmanager.model.ModelInfo, com.ss.android.ugc.effectmanager.i):long");
    }
}
