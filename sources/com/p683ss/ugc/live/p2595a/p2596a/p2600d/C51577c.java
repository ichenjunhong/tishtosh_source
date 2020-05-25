package com.p683ss.ugc.live.p2595a.p2596a.p2600d;

import com.p683ss.ugc.live.p2595a.p2596a.C51557a;
import com.p683ss.ugc.live.p2595a.p2596a.C51568c;
import com.p683ss.ugc.live.p2595a.p2596a.p2597a.C51559b;
import com.p683ss.ugc.live.p2595a.p2596a.p2598b.C51561a;
import com.p683ss.ugc.live.p2595a.p2596a.p2598b.C51562b;
import com.p683ss.ugc.live.p2595a.p2596a.p2598b.C51562b.C51563a;
import com.p683ss.ugc.live.p2595a.p2596a.p2599c.C51569a;
import com.p683ss.ugc.live.p2595a.p2596a.p2599c.C51571c;
import com.p683ss.ugc.live.p2595a.p2596a.p2601e.C51585a;
import com.p683ss.ugc.live.p2595a.p2596a.p2601e.C51586b;
import java.io.File;
import java.io.IOException;

/* renamed from: com.ss.ugc.live.a.a.d.c */
public final class C51577c implements C51579d<String> {

    /* renamed from: a */
    public C51557a<String> f128830a;

    /* renamed from: b */
    private C51562b f128831b;

    /* renamed from: c */
    private C51559b f128832c;

    /* renamed from: a */
    public final String mo105505a(C51568c cVar) throws Exception {
        String a = C51586b.m110734a(this.f128832c.mo13424a(cVar));
        File file = new File(a);
        if (file.exists() || file.mkdirs()) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append(C51585a.m110731a(cVar.mo105497a()));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("mkdirs return false, dir=");
        sb2.append(file);
        throw new IOException(sb2.toString());
    }

    public C51577c(C51562b bVar, C51559b bVar2) {
        this.f128831b = bVar;
        this.f128832c = bVar2;
    }

    /* renamed from: a */
    public final void mo13398a(final C51568c cVar, C51557a<String> aVar) {
        this.f128830a = aVar;
        final C51561a aVar2 = new C51561a(cVar.mo105498b());
        try {
            File b = C51586b.m110736b(mo105505a(cVar));
            if (b.exists()) {
                aVar2.f128811b = b.length();
            }
        } catch (Exception unused) {
        }
        this.f128831b.mo105492a(aVar2, new C51563a() {
            /* renamed from: a */
            public final void mo105494a(Throwable th, int i) {
                if (i == 416) {
                    try {
                        File b = C51586b.m110736b(C51577c.this.mo105505a(cVar));
                        if (b.exists()) {
                            b.delete();
                        }
                    } catch (Exception unused) {
                    }
                }
                C51571c cVar = new C51571c("download failed", th, cVar, i, aVar2);
                C51577c.this.f128830a.mo105489a(cVar, (C51569a) cVar);
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(4:34|(2:40|41)|42|43) */
            /* JADX WARNING: Can't wrap try/catch for region: R(5:25|26|27|28|(2:30|31)(2:32|33)) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0076 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00a8 */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x0081 A[Catch:{ Exception -> 0x00a9 }] */
            /* JADX WARNING: Removed duplicated region for block: B:32:0x008b A[Catch:{ Exception -> 0x00a9 }] */
            /* JADX WARNING: Removed duplicated region for block: B:40:0x00a2 A[SYNTHETIC, Splitter:B:40:0x00a2] */
            /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x0076=Splitter:B:27:0x0076, B:42:0x00a8=Splitter:B:42:0x00a8} */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo105493a(java.io.InputStream r21, long r22) {
                /*
                    r20 = this;
                    r1 = r20
                    com.ss.ugc.live.a.a.d.c r0 = com.p683ss.ugc.live.p2595a.p2596a.p2600d.C51577c.this     // Catch:{ Exception -> 0x00a9 }
                    com.ss.ugc.live.a.a.c r2 = r3     // Catch:{ Exception -> 0x00a9 }
                    java.lang.String r0 = r0.mo105505a(r2)     // Catch:{ Exception -> 0x00a9 }
                    java.io.File r2 = com.p683ss.ugc.live.p2595a.p2596a.p2601e.C51586b.m110736b(r0)     // Catch:{ Exception -> 0x00a9 }
                    com.ss.ugc.live.a.a.d.c r3 = com.p683ss.ugc.live.p2595a.p2596a.p2600d.C51577c.this     // Catch:{ Exception -> 0x00a9 }
                    com.ss.ugc.live.a.a.c r4 = r3     // Catch:{ Exception -> 0x00a9 }
                    r5 = 0
                    java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ all -> 0x009c }
                    java.lang.String r7 = "rw"
                    r6.<init>(r2, r7)     // Catch:{ all -> 0x009c }
                    long r7 = r6.length()     // Catch:{ all -> 0x0098 }
                    r9 = 0
                    int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                    if (r5 <= 0) goto L_0x0027
                    r6.seek(r7)     // Catch:{ all -> 0x0098 }
                L_0x0027:
                    r5 = 2048(0x800, float:2.87E-42)
                    byte[] r5 = new byte[r5]     // Catch:{ all -> 0x0098 }
                    r11 = 0
                    long r11 = r7 + r22
                    r13 = 0
                    r14 = r7
                    r8 = 0
                    r7 = r21
                L_0x0033:
                    int r9 = r7.read(r5)     // Catch:{ all -> 0x0096 }
                    if (r9 < 0) goto L_0x0070
                    r6.write(r5, r13, r9)     // Catch:{ all -> 0x0096 }
                    long r9 = (long) r9     // Catch:{ all -> 0x0096 }
                    long r14 = r14 + r9
                    r9 = 0
                    int r16 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                    if (r16 <= 0) goto L_0x004c
                    r16 = 100
                    long r16 = r16 * r14
                    long r9 = r16 / r11
                    int r9 = (int) r9
                    goto L_0x0067
                L_0x004c:
                    r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                    long r9 = -r14
                    double r9 = (double) r9
                    r18 = 4677104761256804352(0x40e86a0000000000, double:50000.0)
                    java.lang.Double.isNaN(r9)
                    double r9 = r9 / r18
                    double r9 = java.lang.Math.exp(r9)     // Catch:{ all -> 0x0096 }
                    r18 = 0
                    double r16 = r16 - r9
                    r9 = 4636737291354636288(0x4059000000000000, double:100.0)
                    double r9 = r9 * r16
                    int r9 = (int) r9     // Catch:{ all -> 0x0096 }
                L_0x0067:
                    if (r9 == r8) goto L_0x0033
                    com.ss.ugc.live.a.a.a<java.lang.String> r8 = r3.f128830a     // Catch:{ all -> 0x0096 }
                    r8.mo105488a(r4, r9)     // Catch:{ all -> 0x0096 }
                    r8 = r9
                    goto L_0x0033
                L_0x0070:
                    r6.close()     // Catch:{ IOException -> 0x0076 }
                    r21.close()     // Catch:{ IOException -> 0x0076 }
                L_0x0076:
                    java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x00a9 }
                    r3.<init>(r0)     // Catch:{ Exception -> 0x00a9 }
                    boolean r3 = r2.renameTo(r3)     // Catch:{ Exception -> 0x00a9 }
                    if (r3 == 0) goto L_0x008b
                    com.ss.ugc.live.a.a.d.c r2 = com.p683ss.ugc.live.p2595a.p2596a.p2600d.C51577c.this     // Catch:{ Exception -> 0x00a9 }
                    com.ss.ugc.live.a.a.a<java.lang.String> r2 = r2.f128830a     // Catch:{ Exception -> 0x00a9 }
                    com.ss.ugc.live.a.a.c r3 = r3     // Catch:{ Exception -> 0x00a9 }
                    r2.mo105490a(r3, r0)     // Catch:{ Exception -> 0x00a9 }
                    return
                L_0x008b:
                    r2.delete()     // Catch:{ Exception -> 0x00a9 }
                    java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x00a9 }
                    java.lang.String r2 = "rename file failed"
                    r0.<init>(r2)     // Catch:{ Exception -> 0x00a9 }
                    throw r0     // Catch:{ Exception -> 0x00a9 }
                L_0x0096:
                    r0 = move-exception
                    goto L_0x00a0
                L_0x0098:
                    r0 = move-exception
                    r7 = r21
                    goto L_0x00a0
                L_0x009c:
                    r0 = move-exception
                    r7 = r21
                    r6 = r5
                L_0x00a0:
                    if (r6 == 0) goto L_0x00a8
                    r6.close()     // Catch:{ IOException -> 0x00a8 }
                    r21.close()     // Catch:{ IOException -> 0x00a8 }
                L_0x00a8:
                    throw r0     // Catch:{ Exception -> 0x00a9 }
                L_0x00a9:
                    r0 = move-exception
                    com.ss.ugc.live.a.a.c.e r2 = new com.ss.ugc.live.a.a.c.e
                    java.lang.String r3 = "write storage failed."
                    com.ss.ugc.live.a.a.c r4 = r3
                    r2.<init>(r3, r0, r4)
                    com.ss.ugc.live.a.a.d.c r0 = com.p683ss.ugc.live.p2595a.p2596a.p2600d.C51577c.this
                    com.ss.ugc.live.a.a.a<java.lang.String> r0 = r0.f128830a
                    com.ss.ugc.live.a.a.c r3 = r3
                    r0.mo105489a(r3, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ugc.live.p2595a.p2596a.p2600d.C51577c.C515781.mo105493a(java.io.InputStream, long):void");
            }
        });
    }
}
