package com.p683ss.ttvideoengine.utils;

import java.net.InetAddress;
import java.util.Arrays;

/* renamed from: com.ss.ttvideoengine.utils.SntpClient */
public class SntpClient {
    private long mNtpTime;
    private long mNtpTimeReference;
    private long mRoundTripTime;

    /* renamed from: com.ss.ttvideoengine.utils.SntpClient$InvalidServerReplyException */
    static class InvalidServerReplyException extends Exception {
        public InvalidServerReplyException(String str) {
            super(str);
        }
    }

    public long getNtpTime() {
        return this.mNtpTime;
    }

    public long getNtpTimeReference() {
        return this.mNtpTimeReference;
    }

    public long getRoundTripTime() {
        return this.mRoundTripTime;
    }

    public boolean requestTime(String str, int i) {
        try {
            return requestTime(InetAddress.getByName(str), 123, i);
        } catch (Exception e) {
            TTVideoEngineLog.m110645d(e);
            return false;
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v0, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r1v1, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r2v1, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r6v1, types: [byte] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long read32(byte[] r6, int r7) {
        /*
            r5 = this;
            byte r0 = r6[r7]
            int r1 = r7 + 1
            byte r1 = r6[r1]
            int r2 = r7 + 2
            byte r2 = r6[r2]
            int r7 = r7 + 3
            byte r6 = r6[r7]
            r7 = r0 & 128(0x80, float:1.794E-43)
            r3 = 128(0x80, float:1.794E-43)
            if (r7 != r3) goto L_0x0018
            r7 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r7 + 128
        L_0x0018:
            r7 = r1 & 128(0x80, float:1.794E-43)
            if (r7 != r3) goto L_0x0020
            r7 = r1 & 127(0x7f, float:1.78E-43)
            int r1 = r7 + 128
        L_0x0020:
            r7 = r2 & 128(0x80, float:1.794E-43)
            if (r7 != r3) goto L_0x0028
            r7 = r2 & 127(0x7f, float:1.78E-43)
            int r2 = r7 + 128
        L_0x0028:
            r7 = r6 & 128(0x80, float:1.794E-43)
            if (r7 != r3) goto L_0x002f
            r6 = r6 & 127(0x7f, float:1.78E-43)
            int r6 = r6 + r3
        L_0x002f:
            long r3 = (long) r0
            r7 = 24
            long r3 = r3 << r7
            long r0 = (long) r1
            r7 = 16
            long r0 = r0 << r7
            long r3 = r3 + r0
            long r0 = (long) r2
            r7 = 8
            long r0 = r0 << r7
            long r3 = r3 + r0
            long r6 = (long) r6
            long r3 = r3 + r6
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.utils.SntpClient.read32(byte[], int):long");
    }

    private long readTimeStamp(byte[] bArr, int i) {
        long read32 = read32(bArr, i);
        long read322 = read32(bArr, i + 4);
        if (read32 == 0 && read322 == 0) {
            return 0;
        }
        return ((read32 - 2208988800L) * 1000) + ((read322 * 1000) / 4294967296L);
    }

    private void writeTimeStamp(byte[] bArr, int i, long j) {
        if (j == 0) {
            Arrays.fill(bArr, i, i + 8, 0);
            return;
        }
        long j2 = j / 1000;
        long j3 = j - (j2 * 1000);
        long j4 = j2 + 2208988800L;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) (j4 >> 24));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) (j4 >> 16));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) (j4 >> 8));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) (j4 >> 0));
        long j5 = (j3 * 4294967296L) / 1000;
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) (j5 >> 24));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) (j5 >> 16));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) (j5 >> 8));
        bArr[i8] = (byte) ((int) (Math.random() * 255.0d));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean requestTime(java.net.InetAddress r22, int r23, int r24) {
        /*
            r21 = this;
            r1 = r21
            r2 = 0
            r3 = 0
            java.net.DatagramSocket r4 = new java.net.DatagramSocket     // Catch:{ Exception -> 0x00a5 }
            r4.<init>()     // Catch:{ Exception -> 0x00a5 }
            r0 = r24
            r4.setSoTimeout(r0)     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r0 = 48
            byte[] r3 = new byte[r0]     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            java.net.DatagramPacket r5 = new java.net.DatagramPacket     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r6 = r22
            r7 = r23
            r5.<init>(r3, r0, r6, r7)     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r6 = 27
            r3[r2] = r6     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r10 = 40
            r1.writeTimeStamp(r3, r10, r6)     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r4.send(r5)     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            java.net.DatagramPacket r5 = new java.net.DatagramPacket     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r5.<init>(r3, r0)     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r4.receive(r5)     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r0 = 0
            long r8 = r11 - r8
            long r6 = r6 + r8
            byte r0 = r3[r2]     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            int r0 = r0 >> 6
            r0 = r0 & 3
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            byte r5 = r3[r2]     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r5 = r5 & 7
            byte r5 = (byte) r5     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r13 = 1
            byte r14 = r3[r13]     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r14 = r14 & 255(0xff, float:3.57E-43)
            r15 = 24
            long r15 = r1.readTimeStamp(r3, r15)     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r2 = 32
            long r17 = r1.readTimeStamp(r3, r2)     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            long r2 = r1.readTimeStamp(r3, r10)     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            checkValidServerReply(r0, r5, r14, r2)     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r0 = 0
            long r19 = r2 - r17
            long r8 = r8 - r19
            long r17 = r17 - r15
            long r2 = r2 - r6
            long r17 = r17 + r2
            r2 = 2
            long r2 = r17 / r2
            java.lang.String r0 = "SntpClient"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            java.lang.String r10 = "requestTime round trip: "
            r5.<init>(r10)     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r5.append(r8)     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            java.lang.String r10 = "ms, clock offset: "
            r5.append(r10)     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r5.append(r2)     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            java.lang.String r10 = "ms"
            r5.append(r10)     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110644d(r0, r5)     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r0 = 0
            long r6 = r6 + r2
            r1.mNtpTime = r6     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r1.mNtpTimeReference = r11     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r1.mRoundTripTime = r8     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r4.close()
            return r13
        L_0x009d:
            r0 = move-exception
            goto L_0x00b0
        L_0x009f:
            r0 = move-exception
            r3 = r4
            goto L_0x00a6
        L_0x00a2:
            r0 = move-exception
            r4 = r3
            goto L_0x00b0
        L_0x00a5:
            r0 = move-exception
        L_0x00a6:
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110645d(r0)     // Catch:{ all -> 0x00a2 }
            if (r3 == 0) goto L_0x00ae
            r3.close()
        L_0x00ae:
            r2 = 0
            return r2
        L_0x00b0:
            if (r4 == 0) goto L_0x00b5
            r4.close()
        L_0x00b5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.utils.SntpClient.requestTime(java.net.InetAddress, int, int):boolean");
    }

    private static void checkValidServerReply(byte b, byte b2, int i, long j) throws InvalidServerReplyException {
        if (b == 3) {
            throw new InvalidServerReplyException("unsynchronized server");
        } else if (b2 != 4 && b2 != 5) {
            StringBuilder sb = new StringBuilder("untrusted mode: ");
            sb.append(b2);
            throw new InvalidServerReplyException(sb.toString());
        } else if (i == 0 || i > 15) {
            StringBuilder sb2 = new StringBuilder("untrusted stratum: ");
            sb2.append(i);
            throw new InvalidServerReplyException(sb2.toString());
        } else if (j == 0) {
            throw new InvalidServerReplyException("zero transmitTime");
        }
    }
}
