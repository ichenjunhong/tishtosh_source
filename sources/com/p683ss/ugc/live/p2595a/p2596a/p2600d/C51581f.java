package com.p683ss.ugc.live.p2595a.p2596a.p2600d;

import com.p683ss.ugc.live.p2595a.p2596a.C51557a;
import com.p683ss.ugc.live.p2595a.p2596a.C51568c;
import com.p683ss.ugc.live.p2595a.p2596a.p2599c.C51569a;

/* renamed from: com.ss.ugc.live.a.a.d.f */
public final class C51581f implements C51557a<String>, C51579d<String> {

    /* renamed from: a */
    private C51579d<String> f128839a;

    /* renamed from: b */
    private C51557a<String> f128840b;

    public C51581f(C51579d dVar) {
        this.f128839a = dVar;
    }

    /* renamed from: a */
    public final void mo13398a(C51568c cVar, C51557a<String> aVar) {
        this.f128840b = aVar;
        this.f128839a.mo13398a(cVar, this);
    }

    /* renamed from: a */
    public final void mo105488a(C51568c cVar, int i) {
        if (this.f128840b != null) {
            this.f128840b.mo105488a(cVar, i);
        }
    }

    /* renamed from: a */
    public final void mo105489a(C51568c cVar, C51569a aVar) {
        if (this.f128840b != null) {
            this.f128840b.mo105489a(cVar, aVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo105490a(com.p683ss.ugc.live.p2595a.p2596a.C51568c r8, java.lang.Object r9) {
        /*
            r7 = this;
            java.lang.String r9 = (java.lang.String) r9
            r0 = 0
            java.lang.String r1 = "/"
            int r1 = r9.lastIndexOf(r1)     // Catch:{ Exception -> 0x00b7 }
            r2 = 0
            java.lang.String r1 = r9.substring(r2, r1)     // Catch:{ Exception -> 0x00b7 }
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x00b5 }
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00b5 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00b5 }
            r4.<init>(r9)     // Catch:{ Exception -> 0x00b5 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x00b5 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x00b5 }
        L_0x001d:
            java.util.zip.ZipEntry r3 = r0.getNextEntry()     // Catch:{ Exception -> 0x00b5 }
            if (r3 == 0) goto L_0x00a0
            java.lang.String r4 = r3.getName()     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r5 = "../"
            boolean r5 = r4.contains(r5)     // Catch:{ Exception -> 0x00b5 }
            if (r5 != 0) goto L_0x001d
            boolean r3 = r3.isDirectory()     // Catch:{ Exception -> 0x00b5 }
            if (r3 == 0) goto L_0x0052
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x00b5 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b5 }
            r5.<init>()     // Catch:{ Exception -> 0x00b5 }
            r5.append(r1)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r6 = java.io.File.separator     // Catch:{ Exception -> 0x00b5 }
            r5.append(r6)     // Catch:{ Exception -> 0x00b5 }
            r5.append(r4)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x00b5 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x00b5 }
            r3.mkdirs()     // Catch:{ Exception -> 0x00b5 }
            goto L_0x001d
        L_0x0052:
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x00b5 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b5 }
            r5.<init>()     // Catch:{ Exception -> 0x00b5 }
            r5.append(r1)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r6 = java.io.File.separator     // Catch:{ Exception -> 0x00b5 }
            r5.append(r6)     // Catch:{ Exception -> 0x00b5 }
            r5.append(r4)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x00b5 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x00b5 }
            boolean r4 = r3.exists()     // Catch:{ Exception -> 0x00b5 }
            if (r4 == 0) goto L_0x0075
            r3.delete()     // Catch:{ Exception -> 0x00b5 }
            goto L_0x007c
        L_0x0075:
            java.io.File r4 = r3.getParentFile()     // Catch:{ Exception -> 0x00b5 }
            r4.mkdirs()     // Catch:{ Exception -> 0x00b5 }
        L_0x007c:
            r3.createNewFile()     // Catch:{ Exception -> 0x00b5 }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00b5 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00b5 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x00b5 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x00b5 }
            r3 = 2048(0x800, float:2.87E-42)
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x00b5 }
        L_0x008d:
            int r5 = r0.read(r3)     // Catch:{ Exception -> 0x00b5 }
            r6 = -1
            if (r5 == r6) goto L_0x0098
            r4.write(r3, r2, r5)     // Catch:{ Exception -> 0x00b5 }
            goto L_0x008d
        L_0x0098:
            r4.flush()     // Catch:{ Exception -> 0x00b5 }
            r4.close()     // Catch:{ Exception -> 0x00b5 }
            goto L_0x001d
        L_0x00a0:
            r0.close()     // Catch:{ Exception -> 0x00b5 }
            com.ss.ugc.live.a.a.a<java.lang.String> r0 = r7.f128840b     // Catch:{ Exception -> 0x00b5 }
            if (r0 == 0) goto L_0x00ac
            com.ss.ugc.live.a.a.a<java.lang.String> r0 = r7.f128840b     // Catch:{ Exception -> 0x00b5 }
            r0.mo105490a(r8, r1)     // Catch:{ Exception -> 0x00b5 }
        L_0x00ac:
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00b5 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x00b5 }
            r0.delete()     // Catch:{ Exception -> 0x00b5 }
            return
        L_0x00b5:
            r9 = move-exception
            goto L_0x00b9
        L_0x00b7:
            r9 = move-exception
            r1 = r0
        L_0x00b9:
            com.ss.ugc.live.a.a.c.d r0 = new com.ss.ugc.live.a.a.c.d
            java.lang.String r2 = "unzip exception"
            r0.<init>(r2, r9, r8)
            r7.mo105489a(r8, r0)
            if (r1 == 0) goto L_0x00cd
            java.io.File r8 = new java.io.File
            r8.<init>(r1)
            com.p683ss.ugc.live.p2595a.p2596a.p2601e.C51586b.m110735a(r8)
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ugc.live.p2595a.p2596a.p2600d.C51581f.mo105490a(com.ss.ugc.live.a.a.c, java.lang.Object):void");
    }
}
