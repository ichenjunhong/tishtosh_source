package com.bytedance.android.livesdk.p279af.p280a;

import com.bytedance.android.live.core.p224c.C3831a;
import java.net.InetAddress;

/* renamed from: com.bytedance.android.livesdk.af.a.g */
final class C4557g {

    /* renamed from: a */
    public long f12517a;

    /* renamed from: b */
    public long f12518b;

    /* renamed from: c */
    public long f12519c;

    /* renamed from: com.bytedance.android.livesdk.af.a.g$a */
    static class C4558a extends Exception {
        C4558a(String str) {
            super(str);
        }
    }

    C4557g() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo10373a(String str, int i) {
        try {
            return m10946a(InetAddress.getByName(str), 123, i);
        } catch (Exception e) {
            C3831a.m9716d("SntpClient", e.toString());
            return false;
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v0, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r1v1, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r2v1, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r5v1, types: [byte] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m10945a(byte[] r5, int r6) {
        /*
            byte r0 = r5[r6]
            int r1 = r6 + 1
            byte r1 = r5[r1]
            int r2 = r6 + 2
            byte r2 = r5[r2]
            int r6 = r6 + 3
            byte r5 = r5[r6]
            r6 = r0 & 128(0x80, float:1.794E-43)
            r3 = 128(0x80, float:1.794E-43)
            if (r6 != r3) goto L_0x0018
            r6 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r6 + 128
        L_0x0018:
            r6 = r1 & 128(0x80, float:1.794E-43)
            if (r6 != r3) goto L_0x0020
            r6 = r1 & 127(0x7f, float:1.78E-43)
            int r1 = r6 + 128
        L_0x0020:
            r6 = r2 & 128(0x80, float:1.794E-43)
            if (r6 != r3) goto L_0x0028
            r6 = r2 & 127(0x7f, float:1.78E-43)
            int r2 = r6 + 128
        L_0x0028:
            r6 = r5 & 128(0x80, float:1.794E-43)
            if (r6 != r3) goto L_0x002f
            r5 = r5 & 127(0x7f, float:1.78E-43)
            int r5 = r5 + r3
        L_0x002f:
            long r3 = (long) r0
            r6 = 24
            long r3 = r3 << r6
            long r0 = (long) r1
            r6 = 16
            long r0 = r0 << r6
            long r3 = r3 + r0
            long r0 = (long) r2
            r6 = 8
            long r0 = r0 << r6
            long r3 = r3 + r0
            long r5 = (long) r5
            long r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p279af.p280a.C4557g.m10945a(byte[], int):long");
    }

    /* renamed from: b */
    private long m10947b(byte[] bArr, int i) {
        long a = m10945a(bArr, i);
        long a2 = m10945a(bArr, i + 4);
        if (a == 0 && a2 == 0) {
            return 0;
        }
        return ((a - 2208988800L) * 1000) + ((a2 * 1000) / 4294967296L);
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0169  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m10946a(java.net.InetAddress r23, int r24, int r25) {
        /*
            r22 = this;
            r1 = r22
            r2 = 0
            r3 = 0
            java.net.DatagramSocket r4 = new java.net.DatagramSocket     // Catch:{ Exception -> 0x0153, all -> 0x014f }
            r4.<init>()     // Catch:{ Exception -> 0x0153, all -> 0x014f }
            r0 = r25
            r4.setSoTimeout(r0)     // Catch:{ Exception -> 0x014b, all -> 0x0148 }
            r0 = 48
            byte[] r3 = new byte[r0]     // Catch:{ Exception -> 0x014b, all -> 0x0148 }
            java.net.DatagramPacket r5 = new java.net.DatagramPacket     // Catch:{ Exception -> 0x014b, all -> 0x0148 }
            r6 = 123(0x7b, float:1.72E-43)
            r7 = r23
            r5.<init>(r3, r0, r7, r6)     // Catch:{ Exception -> 0x014b, all -> 0x0148 }
            r6 = 27
            r3[r2] = r6     // Catch:{ Exception -> 0x014b, all -> 0x0148 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x014b, all -> 0x0148 }
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x014b, all -> 0x0148 }
            r10 = 0
            r12 = 24
            r13 = 40
            int r14 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r14 != 0) goto L_0x0035
            java.util.Arrays.fill(r3, r13, r0, r2)     // Catch:{ Exception -> 0x014b, all -> 0x0148 }
            goto L_0x009e
        L_0x0035:
            r14 = 1000(0x3e8, double:4.94E-321)
            long r16 = r6 / r14
            long r18 = r16 * r14
            r20 = 0
            long r18 = r6 - r18
            r20 = 2208988800(0x83aa7e80, double:1.091385478E-314)
            long r16 = r16 + r20
            long r10 = r16 >> r12
            int r10 = (int) r10     // Catch:{ Exception -> 0x014b, all -> 0x0148 }
            byte r10 = (byte) r10     // Catch:{ Exception -> 0x014b, all -> 0x0148 }
            r3[r13] = r10     // Catch:{ Exception -> 0x014b, all -> 0x0148 }
            r10 = 41
            r11 = 16
            long r0 = r16 >> r11
            int r0 = (int) r0
            byte r0 = (byte) r0
            r3[r10] = r0     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            r0 = 42
            r1 = 8
            long r11 = r16 >> r1
            int r10 = (int) r11     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            byte r10 = (byte) r10     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            r3[r0] = r10     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            r0 = 43
            long r10 = r16 >> r2
            int r10 = (int) r10     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            byte r10 = (byte) r10     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            r3[r0] = r10     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            r10 = 4294967296(0x100000000, double:2.121995791E-314)
            long r18 = r18 * r10
            long r18 = r18 / r14
            r0 = 44
            r10 = 24
            long r11 = r18 >> r10
            int r10 = (int) r11     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            byte r10 = (byte) r10     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            r3[r0] = r10     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            r0 = 45
            r10 = 16
            long r10 = r18 >> r10
            int r10 = (int) r10     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            byte r10 = (byte) r10     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            r3[r0] = r10     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            r0 = 46
            long r10 = r18 >> r1
            int r1 = (int) r10     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            byte r1 = (byte) r1     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            r3[r0] = r1     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            r0 = 47
            double r10 = java.lang.Math.random()     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            r14 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r10 = r10 * r14
            int r1 = (int) r10     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            byte r1 = (byte) r1     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            r3[r0] = r1     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
        L_0x009e:
            r4.send(r5)     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            java.net.DatagramPacket r0 = new java.net.DatagramPacket     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            r1 = 48
            r0.<init>(r3, r1)     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            r4.receive(r0)     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            r5 = 0
            long r8 = r0 - r8
            long r6 = r6 + r8
            byte r5 = r3[r2]     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            int r5 = r5 >> 6
            r10 = 3
            r5 = r5 & r10
            byte r5 = (byte) r5     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            byte r11 = r3[r2]     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            r11 = r11 & 7
            byte r11 = (byte) r11     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            r12 = 1
            byte r14 = r3[r12]     // Catch:{ Exception -> 0x0144, all -> 0x0140 }
            r14 = r14 & 255(0xff, float:3.57E-43)
            r2 = 24
            r15 = r22
            long r16 = r15.m10947b(r3, r2)     // Catch:{ Exception -> 0x013e, all -> 0x013c }
            r2 = 32
            long r18 = r15.m10947b(r3, r2)     // Catch:{ Exception -> 0x013e, all -> 0x013c }
            long r2 = r15.m10947b(r3, r13)     // Catch:{ Exception -> 0x013e, all -> 0x013c }
            if (r5 == r10) goto L_0x0134
            r5 = 4
            if (r11 == r5) goto L_0x00f3
            r5 = 5
            if (r11 != r5) goto L_0x00df
            goto L_0x00f3
        L_0x00df:
            com.bytedance.android.livesdk.af.a.g$a r0 = new com.bytedance.android.livesdk.af.a.g$a     // Catch:{ Exception -> 0x013e, all -> 0x013c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013e, all -> 0x013c }
            java.lang.String r2 = "untrusted mode: "
            r1.<init>(r2)     // Catch:{ Exception -> 0x013e, all -> 0x013c }
            r1.append(r11)     // Catch:{ Exception -> 0x013e, all -> 0x013c }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x013e, all -> 0x013c }
            r0.<init>(r1)     // Catch:{ Exception -> 0x013e, all -> 0x013c }
            throw r0     // Catch:{ Exception -> 0x013e, all -> 0x013c }
        L_0x00f3:
            if (r14 == 0) goto L_0x0120
            r5 = 15
            if (r14 > r5) goto L_0x0120
            r10 = 0
            int r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0118
            long r10 = r2 - r18
            long r8 = r8 - r10
            long r18 = r18 - r16
            long r2 = r2 - r6
            long r18 = r18 + r2
            r2 = 2
            long r18 = r18 / r2
            r2 = 0
            long r6 = r6 + r18
            r15.f12517a = r6     // Catch:{ Exception -> 0x013e, all -> 0x013c }
            r15.f12518b = r0     // Catch:{ Exception -> 0x013e, all -> 0x013c }
            r15.f12519c = r8     // Catch:{ Exception -> 0x013e, all -> 0x013c }
            r4.close()
            return r12
        L_0x0118:
            com.bytedance.android.livesdk.af.a.g$a r0 = new com.bytedance.android.livesdk.af.a.g$a     // Catch:{ Exception -> 0x013e, all -> 0x013c }
            java.lang.String r1 = "zero transmitTime"
            r0.<init>(r1)     // Catch:{ Exception -> 0x013e, all -> 0x013c }
            throw r0     // Catch:{ Exception -> 0x013e, all -> 0x013c }
        L_0x0120:
            com.bytedance.android.livesdk.af.a.g$a r0 = new com.bytedance.android.livesdk.af.a.g$a     // Catch:{ Exception -> 0x013e, all -> 0x013c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013e, all -> 0x013c }
            java.lang.String r2 = "untrusted stratum: "
            r1.<init>(r2)     // Catch:{ Exception -> 0x013e, all -> 0x013c }
            r1.append(r14)     // Catch:{ Exception -> 0x013e, all -> 0x013c }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x013e, all -> 0x013c }
            r0.<init>(r1)     // Catch:{ Exception -> 0x013e, all -> 0x013c }
            throw r0     // Catch:{ Exception -> 0x013e, all -> 0x013c }
        L_0x0134:
            com.bytedance.android.livesdk.af.a.g$a r0 = new com.bytedance.android.livesdk.af.a.g$a     // Catch:{ Exception -> 0x013e, all -> 0x013c }
            java.lang.String r1 = "unsynchronized server"
            r0.<init>(r1)     // Catch:{ Exception -> 0x013e, all -> 0x013c }
            throw r0     // Catch:{ Exception -> 0x013e, all -> 0x013c }
        L_0x013c:
            r0 = move-exception
            goto L_0x0167
        L_0x013e:
            r0 = move-exception
            goto L_0x014d
        L_0x0140:
            r0 = move-exception
            r15 = r22
            goto L_0x0167
        L_0x0144:
            r0 = move-exception
            r15 = r22
            goto L_0x014d
        L_0x0148:
            r0 = move-exception
            r15 = r1
            goto L_0x0167
        L_0x014b:
            r0 = move-exception
            r15 = r1
        L_0x014d:
            r3 = r4
            goto L_0x0155
        L_0x014f:
            r0 = move-exception
            r15 = r1
        L_0x0151:
            r4 = r3
            goto L_0x0167
        L_0x0153:
            r0 = move-exception
            r15 = r1
        L_0x0155:
            java.lang.String r1 = "SntpClient"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0165 }
            com.bytedance.android.live.core.p224c.C3831a.m9716d(r1, r0)     // Catch:{ all -> 0x0165 }
            if (r3 == 0) goto L_0x0163
            r3.close()
        L_0x0163:
            r1 = 0
            return r1
        L_0x0165:
            r0 = move-exception
            goto L_0x0151
        L_0x0167:
            if (r4 == 0) goto L_0x016c
            r4.close()
        L_0x016c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p279af.p280a.C4557g.m10946a(java.net.InetAddress, int, int):boolean");
    }
}
