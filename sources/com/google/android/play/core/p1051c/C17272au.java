package com.google.android.play.core.p1051c;

import android.util.Pair;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.play.core.c.au */
public final class C17272au implements C17252ab {

    /* renamed from: a */
    private final ByteBuffer f48745a;

    private C17272au(ByteBuffer byteBuffer) {
        this.f48745a = byteBuffer.slice();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        return 2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m42296a(int r4) {
        /*
            r0 = 769(0x301, float:1.078E-42)
            if (r4 == r0) goto L_0x002d
            switch(r4) {
                case 257: goto L_0x002d;
                case 258: goto L_0x002b;
                case 259: goto L_0x002d;
                case 260: goto L_0x002b;
                default: goto L_0x0007;
            }
        L_0x0007:
            switch(r4) {
                case 513: goto L_0x002d;
                case 514: goto L_0x002b;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown signature algorithm: 0x"
            long r2 = (long) r4
            java.lang.String r4 = java.lang.Long.toHexString(r2)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r2 = r4.length()
            if (r2 == 0) goto L_0x0022
            java.lang.String r4 = r1.concat(r4)
            goto L_0x0027
        L_0x0022:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1)
        L_0x0027:
            r0.<init>(r4)
            throw r0
        L_0x002b:
            r4 = 2
            return r4
        L_0x002d:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.p1051c.C17272au.m42296a(int):int");
    }

    /* renamed from: a */
    private static long m42297a(ByteBuffer byteBuffer, int i) {
        return ((long) byteBuffer.getInt(i)) & 4294967295L;
    }

    /* renamed from: a */
    private static Pair<ByteBuffer, Long> m42298a(RandomAccessFile randomAccessFile, int i) throws IOException {
        int i2;
        if (i < 0 || i > 65535) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("maxCommentSize: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min((long) i, length - 22)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - ((long) allocate.capacity());
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        m42301a(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i3 = capacity2 - 22;
            int min = Math.min(i3, 65535);
            int i4 = 0;
            while (true) {
                if (i4 >= min) {
                    break;
                }
                i2 = i3 - i4;
                if (allocate.getInt(i2) == 101010256 && (allocate.getShort(i2 + 20) & 65535) == i4) {
                    break;
                }
                i4++;
            }
        }
        i2 = -1;
        if (i2 == -1) {
            return null;
        }
        allocate.position(i2);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + ((long) i2)));
    }

    /* renamed from: a */
    private static ByteBuffer m42299a(ByteBuffer byteBuffer, int i, int i2) {
        if (i2 >= 8) {
            int capacity = byteBuffer.capacity();
            if (i2 <= byteBuffer.capacity()) {
                int limit = byteBuffer.limit();
                int position = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i2);
                    byteBuffer.position(8);
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    return slice;
                } finally {
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                }
            } else {
                StringBuilder sb = new StringBuilder(41);
                sb.append("end > capacity: ");
                sb.append(i2);
                sb.append(" > ");
                sb.append(capacity);
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("end < start: ");
            sb2.append(i2);
            sb2.append(" < 8");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    private static void m42300a(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) i;
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) (i >>> 16);
        bArr[4] = (byte) (i >>> 24);
    }

    /* renamed from: a */
    private static void m42301a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    /* renamed from: a */
    private static void m42302a(Map<Integer, byte[]> map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) throws SecurityException {
        long j4 = j;
        if (!map.isEmpty()) {
            C17250a aVar = new C17250a(fileChannel, 0, j);
            C17250a aVar2 = new C17250a(fileChannel, j2, j3 - j2);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            m42301a(duplicate);
            int position = duplicate.position() + 16;
            if (j4 < 0 || j4 > 4294967295L) {
                StringBuilder sb = new StringBuilder(47);
                sb.append("uint32 value of out range: ");
                sb.append(j4);
                throw new IllegalArgumentException(sb.toString());
            }
            duplicate.putInt(duplicate.position() + position, (int) j4);
            C17272au auVar = new C17272au(duplicate);
            int[] iArr = new int[map.size()];
            int i = 0;
            int i2 = 0;
            for (Integer intValue : map.keySet()) {
                iArr[i2] = intValue.intValue();
                i2++;
            }
            try {
                byte[][] a = m42304a(iArr, new C17252ab[]{aVar, aVar2, auVar});
                while (i < iArr.length) {
                    int i3 = iArr[i];
                    Map<Integer, byte[]> map2 = map;
                    if (MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), a[i])) {
                        i++;
                    } else {
                        throw new SecurityException(String.valueOf(m42307b(i3)).concat(" digest of contents did not verify"));
                    }
                }
            } catch (DigestException e) {
                throw new SecurityException("Failed to compute digest(s) of contents", e);
            }
        } else {
            throw new SecurityException("No digests provided");
        }
    }

    /* renamed from: b */
    private static String m42307b(int i) {
        switch (i) {
            case 1:
                return "SHA-256";
            case 2:
                return "SHA-512";
            default:
                StringBuilder sb = new StringBuilder(44);
                sb.append("Unknown content digest algorthm: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    private static ByteBuffer m42308b(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i < 0) {
                throw new IllegalArgumentException("Negative length");
            } else if (i <= byteBuffer.remaining()) {
                return m42309b(byteBuffer, i);
            } else {
                int remaining = byteBuffer.remaining();
                StringBuilder sb = new StringBuilder(BaseNotice.HASHTAG);
                sb.append("Length-prefixed field longer than remaining buffer. Field length: ");
                sb.append(i);
                sb.append(", remaining: ");
                sb.append(remaining);
                throw new IOException(sb.toString());
            }
        } else {
            int remaining2 = byteBuffer.remaining();
            StringBuilder sb2 = new StringBuilder(93);
            sb2.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb2.append(remaining2);
            throw new IOException(sb2.toString());
        }
    }

    /* renamed from: b */
    private static ByteBuffer m42309b(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        if (i >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i2 = i + position;
            if (i2 < position || i2 > limit) {
                throw new BufferUnderflowException();
            }
            byteBuffer.limit(i2);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i2);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        } else {
            StringBuilder sb = new StringBuilder(17);
            sb.append("size: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    private static int m42310c(int i) {
        switch (i) {
            case 1:
                return 32;
            case 2:
                return 64;
            default:
                StringBuilder sb = new StringBuilder(44);
                sb.append("Unknown content digest algorthm: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    private static byte[] m42311c(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        } else if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        } else {
            int remaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(90);
            sb.append("Underflow while reading length-prefixed value. Length: ");
            sb.append(i);
            sb.append(", available: ");
            sb.append(remaining);
            throw new IOException(sb.toString());
        }
    }

    /* renamed from: d */
    private static ByteBuffer m42312d(ByteBuffer byteBuffer) throws C17267ap {
        m42313e(byteBuffer);
        ByteBuffer a = m42299a(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i = 0;
        while (a.hasRemaining()) {
            i++;
            if (a.remaining() >= 8) {
                long j = a.getLong();
                if (j < 4 || j > 2147483647L) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("APK Signing Block entry #");
                    sb.append(i);
                    sb.append(" size out of range: ");
                    sb.append(j);
                    throw new C17267ap(sb.toString());
                }
                int i2 = (int) j;
                int position = a.position() + i2;
                if (i2 > a.remaining()) {
                    int remaining = a.remaining();
                    StringBuilder sb2 = new StringBuilder(91);
                    sb2.append("APK Signing Block entry #");
                    sb2.append(i);
                    sb2.append(" size out of range: ");
                    sb2.append(i2);
                    sb2.append(", available: ");
                    sb2.append(remaining);
                    throw new C17267ap(sb2.toString());
                } else if (a.getInt() == 1896449818) {
                    return m42309b(a, i2 - 4);
                } else {
                    a.position(position);
                }
            } else {
                StringBuilder sb3 = new StringBuilder(70);
                sb3.append("Insufficient data to read size of APK Signing Block entry #");
                sb3.append(i);
                throw new C17267ap(sb3.toString());
            }
        }
        throw new C17267ap("No APK Signature Scheme v2 block in APK Signing Block");
    }

    /* renamed from: e */
    private static void m42313e(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    /* renamed from: a */
    public final long mo33525a() {
        return (long) this.f48745a.capacity();
    }

    /* renamed from: a */
    public final void mo33526a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        ByteBuffer slice;
        synchronized (this.f48745a) {
            int i2 = (int) j;
            this.f48745a.position(i2);
            this.f48745a.limit(i2 + i);
            slice = this.f48745a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A[Catch:{ all -> 0x01ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c4 A[Catch:{ all -> 0x01ee }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.security.cert.X509Certificate[][] m42305a(java.lang.String r15) throws com.google.android.play.core.p1051c.C17267ap, java.lang.SecurityException, java.io.IOException {
        /*
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "r"
            r0.<init>(r15, r1)
            long r1 = r0.length()     // Catch:{ all -> 0x01ee }
            r3 = 22
            r15 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0014
            r1 = 0
            goto L_0x0022
        L_0x0014:
            android.util.Pair r1 = m42298a(r0, r15)     // Catch:{ all -> 0x01ee }
            if (r1 == 0) goto L_0x001b
            goto L_0x0022
        L_0x001b:
            r1 = 65535(0xffff, float:9.1834E-41)
            android.util.Pair r1 = m42298a(r0, r1)     // Catch:{ all -> 0x01ee }
        L_0x0022:
            if (r1 == 0) goto L_0x01cc
            java.lang.Object r2 = r1.first     // Catch:{ all -> 0x01ee }
            r11 = r2
            java.nio.ByteBuffer r11 = (java.nio.ByteBuffer) r11     // Catch:{ all -> 0x01ee }
            java.lang.Object r1 = r1.second     // Catch:{ all -> 0x01ee }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x01ee }
            long r9 = r1.longValue()     // Catch:{ all -> 0x01ee }
            r1 = 20
            long r1 = r9 - r1
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0049
            r0.seek(r1)     // Catch:{ all -> 0x01ee }
            int r1 = r0.readInt()     // Catch:{ all -> 0x01ee }
            r2 = 1347094023(0x504b0607, float:1.36246794E10)
            if (r1 != r2) goto L_0x0049
            r1 = 1
            goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            if (r1 != 0) goto L_0x01c4
            m42301a(r11)     // Catch:{ all -> 0x01ee }
            int r1 = r11.position()     // Catch:{ all -> 0x01ee }
            r2 = 16
            int r1 = r1 + r2
            long r7 = m42297a(r11, r1)     // Catch:{ all -> 0x01ee }
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 >= 0) goto L_0x01a3
            m42301a(r11)     // Catch:{ all -> 0x01ee }
            int r1 = r11.position()     // Catch:{ all -> 0x01ee }
            int r1 = r1 + 12
            long r5 = m42297a(r11, r1)     // Catch:{ all -> 0x01ee }
            r1 = 0
            long r5 = r5 + r7
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x019b
            r5 = 32
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0182
            r1 = 24
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)     // Catch:{ all -> 0x01ee }
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ all -> 0x01ee }
            r1.order(r5)     // Catch:{ all -> 0x01ee }
            int r5 = r1.capacity()     // Catch:{ all -> 0x01ee }
            long r5 = (long) r5     // Catch:{ all -> 0x01ee }
            long r5 = r7 - r5
            r0.seek(r5)     // Catch:{ all -> 0x01ee }
            byte[] r5 = r1.array()     // Catch:{ all -> 0x01ee }
            int r6 = r1.arrayOffset()     // Catch:{ all -> 0x01ee }
            int r12 = r1.capacity()     // Catch:{ all -> 0x01ee }
            r0.readFully(r5, r6, r12)     // Catch:{ all -> 0x01ee }
            r5 = 8
            long r5 = r1.getLong(r5)     // Catch:{ all -> 0x01ee }
            r12 = 2334950737559900225(0x20676953204b5041, double:1.3968830566012645E-152)
            int r14 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x017a
            long r5 = r1.getLong(r2)     // Catch:{ all -> 0x01ee }
            r12 = 3617552046287187010(0x3234206b636f6c42, double:7.465385175170059E-67)
            int r2 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x017a
            long r5 = r1.getLong(r15)     // Catch:{ all -> 0x01ee }
            int r1 = r1.capacity()     // Catch:{ all -> 0x01ee }
            long r1 = (long) r1     // Catch:{ all -> 0x01ee }
            int r12 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r12 < 0) goto L_0x0161
            r1 = 2147483639(0x7ffffff7, double:1.060997891E-314)
            int r12 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0161
            r1 = 8
            long r1 = r1 + r5
            int r1 = (int) r1     // Catch:{ all -> 0x01ee }
            long r12 = (long) r1     // Catch:{ all -> 0x01ee }
            long r12 = r7 - r12
            int r2 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x0148
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)     // Catch:{ all -> 0x01ee }
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ all -> 0x01ee }
            r1.order(r2)     // Catch:{ all -> 0x01ee }
            r0.seek(r12)     // Catch:{ all -> 0x01ee }
            byte[] r2 = r1.array()     // Catch:{ all -> 0x01ee }
            int r3 = r1.arrayOffset()     // Catch:{ all -> 0x01ee }
            int r4 = r1.capacity()     // Catch:{ all -> 0x01ee }
            r0.readFully(r2, r3, r4)     // Catch:{ all -> 0x01ee }
            long r2 = r1.getLong(r15)     // Catch:{ all -> 0x01ee }
            int r15 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r15 != 0) goto L_0x0127
            java.lang.Long r15 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x01ee }
            android.util.Pair r15 = android.util.Pair.create(r1, r15)     // Catch:{ all -> 0x01ee }
            java.lang.Object r1 = r15.first     // Catch:{ all -> 0x01ee }
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1     // Catch:{ all -> 0x01ee }
            java.lang.Object r15 = r15.second     // Catch:{ all -> 0x01ee }
            java.lang.Long r15 = (java.lang.Long) r15     // Catch:{ all -> 0x01ee }
            long r5 = r15.longValue()     // Catch:{ all -> 0x01ee }
            java.nio.ByteBuffer r4 = m42312d(r1)     // Catch:{ all -> 0x01ee }
            com.google.android.play.core.c.aq r15 = new com.google.android.play.core.c.aq     // Catch:{ all -> 0x01ee }
            r12 = 0
            r3 = r15
            r3.<init>(r4, r5, r7, r9, r11, r12)     // Catch:{ all -> 0x01ee }
            java.nio.channels.FileChannel r1 = r0.getChannel()     // Catch:{ all -> 0x01ee }
            java.security.cert.X509Certificate[][] r15 = m42306a(r1, r15)     // Catch:{ all -> 0x01ee }
            r0.close()     // Catch:{ all -> 0x01ee }
            r0.close()     // Catch:{ IOException -> 0x0126 }
        L_0x0126:
            return r15
        L_0x0127:
            com.google.android.play.core.c.ap r15 = new com.google.android.play.core.c.ap     // Catch:{ all -> 0x01ee }
            r1 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ee }
            r4.<init>(r1)     // Catch:{ all -> 0x01ee }
            java.lang.String r1 = "APK Signing Block sizes in header and footer do not match: "
            r4.append(r1)     // Catch:{ all -> 0x01ee }
            r4.append(r2)     // Catch:{ all -> 0x01ee }
            java.lang.String r1 = " vs "
            r4.append(r1)     // Catch:{ all -> 0x01ee }
            r4.append(r5)     // Catch:{ all -> 0x01ee }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x01ee }
            r15.<init>(r1)     // Catch:{ all -> 0x01ee }
            throw r15     // Catch:{ all -> 0x01ee }
        L_0x0148:
            com.google.android.play.core.c.ap r15 = new com.google.android.play.core.c.ap     // Catch:{ all -> 0x01ee }
            r1 = 59
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ee }
            r2.<init>(r1)     // Catch:{ all -> 0x01ee }
            java.lang.String r1 = "APK Signing Block offset out of range: "
            r2.append(r1)     // Catch:{ all -> 0x01ee }
            r2.append(r12)     // Catch:{ all -> 0x01ee }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x01ee }
            r15.<init>(r1)     // Catch:{ all -> 0x01ee }
            throw r15     // Catch:{ all -> 0x01ee }
        L_0x0161:
            com.google.android.play.core.c.ap r15 = new com.google.android.play.core.c.ap     // Catch:{ all -> 0x01ee }
            r1 = 57
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ee }
            r2.<init>(r1)     // Catch:{ all -> 0x01ee }
            java.lang.String r1 = "APK Signing Block size out of range: "
            r2.append(r1)     // Catch:{ all -> 0x01ee }
            r2.append(r5)     // Catch:{ all -> 0x01ee }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x01ee }
            r15.<init>(r1)     // Catch:{ all -> 0x01ee }
            throw r15     // Catch:{ all -> 0x01ee }
        L_0x017a:
            com.google.android.play.core.c.ap r15 = new com.google.android.play.core.c.ap     // Catch:{ all -> 0x01ee }
            java.lang.String r1 = "No APK Signing Block before ZIP Central Directory"
            r15.<init>(r1)     // Catch:{ all -> 0x01ee }
            throw r15     // Catch:{ all -> 0x01ee }
        L_0x0182:
            com.google.android.play.core.c.ap r15 = new com.google.android.play.core.c.ap     // Catch:{ all -> 0x01ee }
            r1 = 87
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ee }
            r2.<init>(r1)     // Catch:{ all -> 0x01ee }
            java.lang.String r1 = "APK too small for APK Signing Block. ZIP Central Directory offset: "
            r2.append(r1)     // Catch:{ all -> 0x01ee }
            r2.append(r7)     // Catch:{ all -> 0x01ee }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x01ee }
            r15.<init>(r1)     // Catch:{ all -> 0x01ee }
            throw r15     // Catch:{ all -> 0x01ee }
        L_0x019b:
            com.google.android.play.core.c.ap r15 = new com.google.android.play.core.c.ap     // Catch:{ all -> 0x01ee }
            java.lang.String r1 = "ZIP Central Directory is not immediately followed by End of Central Directory"
            r15.<init>(r1)     // Catch:{ all -> 0x01ee }
            throw r15     // Catch:{ all -> 0x01ee }
        L_0x01a3:
            com.google.android.play.core.c.ap r15 = new com.google.android.play.core.c.ap     // Catch:{ all -> 0x01ee }
            r1 = 122(0x7a, float:1.71E-43)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ee }
            r2.<init>(r1)     // Catch:{ all -> 0x01ee }
            java.lang.String r1 = "ZIP Central Directory offset out of range: "
            r2.append(r1)     // Catch:{ all -> 0x01ee }
            r2.append(r7)     // Catch:{ all -> 0x01ee }
            java.lang.String r1 = ". ZIP End of Central Directory offset: "
            r2.append(r1)     // Catch:{ all -> 0x01ee }
            r2.append(r9)     // Catch:{ all -> 0x01ee }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x01ee }
            r15.<init>(r1)     // Catch:{ all -> 0x01ee }
            throw r15     // Catch:{ all -> 0x01ee }
        L_0x01c4:
            com.google.android.play.core.c.ap r15 = new com.google.android.play.core.c.ap     // Catch:{ all -> 0x01ee }
            java.lang.String r1 = "ZIP64 APK not supported"
            r15.<init>(r1)     // Catch:{ all -> 0x01ee }
            throw r15     // Catch:{ all -> 0x01ee }
        L_0x01cc:
            com.google.android.play.core.c.ap r15 = new com.google.android.play.core.c.ap     // Catch:{ all -> 0x01ee }
            long r1 = r0.length()     // Catch:{ all -> 0x01ee }
            r3 = 102(0x66, float:1.43E-43)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ee }
            r4.<init>(r3)     // Catch:{ all -> 0x01ee }
            java.lang.String r3 = "Not an APK file: ZIP End of Central Directory record not found in file with "
            r4.append(r3)     // Catch:{ all -> 0x01ee }
            r4.append(r1)     // Catch:{ all -> 0x01ee }
            java.lang.String r1 = " bytes"
            r4.append(r1)     // Catch:{ all -> 0x01ee }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x01ee }
            r15.<init>(r1)     // Catch:{ all -> 0x01ee }
            throw r15     // Catch:{ all -> 0x01ee }
        L_0x01ee:
            r15 = move-exception
            r0.close()     // Catch:{ IOException -> 0x01f2 }
        L_0x01f2:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.p1051c.C17272au.m42305a(java.lang.String):java.security.cert.X509Certificate[][]");
    }

    /* renamed from: a */
    private static X509Certificate[][] m42306a(FileChannel fileChannel, C17268aq aqVar) throws SecurityException {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer b = m42308b(aqVar.f48736a);
                int i = 0;
                while (b.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(m42303a(m42308b(b), (Map<Integer, byte[]>) hashMap, instance));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                } else if (!hashMap.isEmpty()) {
                    m42302a(hashMap, fileChannel, aqVar.f48737b, aqVar.f48738c, aqVar.f48739d, aqVar.f48740e);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } else {
                    throw new SecurityException("No content digests found");
                }
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0178, code lost:
        r4 = android.util.Pair.create(r4, r7);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.security.cert.X509Certificate[] m42303a(java.nio.ByteBuffer r20, java.util.Map<java.lang.Integer, byte[]> r21, java.security.cert.CertificateFactory r22) throws java.lang.SecurityException, java.io.IOException {
        /*
            java.nio.ByteBuffer r0 = m42308b(r20)
            java.nio.ByteBuffer r1 = m42308b(r20)
            byte[] r2 = m42311c(r20)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = -1
            r5 = 0
            r6 = 0
            r9 = r5
            r7 = 0
            r8 = -1
        L_0x0017:
            boolean r10 = r1.hasRemaining()
            r11 = 8
            r12 = 769(0x301, float:1.078E-42)
            r13 = 1
            if (r10 == 0) goto L_0x00d3
            int r7 = r7 + 1
            java.nio.ByteBuffer r10 = m42308b(r1)     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            int r14 = r10.remaining()     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            if (r14 < r11) goto L_0x00b1
            int r11 = r10.getInt()     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            r3.add(r14)     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            if (r11 == r12) goto L_0x0043
            switch(r11) {
                case 257: goto L_0x0043;
                case 258: goto L_0x0043;
                case 259: goto L_0x0043;
                case 260: goto L_0x0043;
                default: goto L_0x003e;
            }     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
        L_0x003e:
            switch(r11) {
                case 513: goto L_0x0043;
                case 514: goto L_0x0043;
                default: goto L_0x0041;
            }     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
        L_0x0041:
            r12 = 0
            goto L_0x0044
        L_0x0043:
            r12 = 1
        L_0x0044:
            if (r12 != 0) goto L_0x0047
            goto L_0x0017
        L_0x0047:
            if (r8 == r4) goto L_0x00a9
            int r12 = m42296a(r11)     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            int r14 = m42296a(r8)     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            r15 = 37
            switch(r12) {
                case 1: goto L_0x0073;
                case 2: goto L_0x0059;
                default: goto L_0x0056;
            }     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
        L_0x0056:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            goto L_0x0094
        L_0x0059:
            switch(r14) {
                case 1: goto L_0x007c;
                case 2: goto L_0x007b;
                default: goto L_0x005c;
            }     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
        L_0x005c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            r1.<init>(r15)     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            java.lang.String r2 = "Unknown digestAlgorithm2: "
            r1.append(r2)     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            r1.append(r14)     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            r0.<init>(r1)     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            throw r0     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
        L_0x0073:
            switch(r14) {
                case 1: goto L_0x007b;
                case 2: goto L_0x0079;
                default: goto L_0x0076;
            }     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
        L_0x0076:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            goto L_0x007f
        L_0x0079:
            r13 = -1
            goto L_0x007c
        L_0x007b:
            r13 = 0
        L_0x007c:
            if (r13 <= 0) goto L_0x0017
            goto L_0x00a9
        L_0x007f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            r1.<init>(r15)     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            java.lang.String r2 = "Unknown digestAlgorithm2: "
            r1.append(r2)     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            r1.append(r14)     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            r0.<init>(r1)     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            throw r0     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
        L_0x0094:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            r1.<init>(r15)     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            java.lang.String r2 = "Unknown digestAlgorithm1: "
            r1.append(r2)     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            r1.append(r12)     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            r0.<init>(r1)     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            throw r0     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
        L_0x00a9:
            byte[] r8 = m42311c(r10)     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            r9 = r8
            r8 = r11
            goto L_0x0017
        L_0x00b1:
            java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            java.lang.String r1 = "Signature record too short"
            r0.<init>(r1)     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
            throw r0     // Catch:{ IOException | BufferUnderflowException -> 0x00b9 }
        L_0x00b9:
            r0 = move-exception
            java.lang.SecurityException r1 = new java.lang.SecurityException
            r2 = 45
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Failed to parse signature record #"
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x00d3:
            if (r8 != r4) goto L_0x00e7
            if (r7 != 0) goto L_0x00df
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "No signatures found"
            r0.<init>(r1)
            throw r0
        L_0x00df:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "No supported signatures found"
            r0.<init>(r1)
            throw r0
        L_0x00e7:
            if (r8 == r12) goto L_0x0117
            switch(r8) {
                case 257: goto L_0x0114;
                case 258: goto L_0x0114;
                case 259: goto L_0x0114;
                case 260: goto L_0x0114;
                default: goto L_0x00ec;
            }
        L_0x00ec:
            switch(r8) {
                case 513: goto L_0x0111;
                case 514: goto L_0x0111;
                default: goto L_0x00ef;
            }
        L_0x00ef:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown signature algorithm: 0x"
            long r2 = (long) r8
            java.lang.String r2 = java.lang.Long.toHexString(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x0107
            java.lang.String r1 = r1.concat(r2)
            goto L_0x010d
        L_0x0107:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        L_0x010d:
            r0.<init>(r1)
            throw r0
        L_0x0111:
            java.lang.String r1 = "EC"
            goto L_0x0119
        L_0x0114:
            java.lang.String r1 = "RSA"
            goto L_0x0119
        L_0x0117:
            java.lang.String r1 = "DSA"
        L_0x0119:
            if (r8 == r12) goto L_0x017d
            switch(r8) {
                case 257: goto L_0x0166;
                case 258: goto L_0x0153;
                case 259: goto L_0x014c;
                case 260: goto L_0x0149;
                default: goto L_0x011e;
            }
        L_0x011e:
            switch(r8) {
                case 513: goto L_0x0146;
                case 514: goto L_0x0143;
                default: goto L_0x0121;
            }
        L_0x0121:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown signature algorithm: 0x"
            long r2 = (long) r8
            java.lang.String r2 = java.lang.Long.toHexString(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x0139
            java.lang.String r1 = r1.concat(r2)
            goto L_0x013f
        L_0x0139:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        L_0x013f:
            r0.<init>(r1)
            throw r0
        L_0x0143:
            java.lang.String r4 = "SHA512withECDSA"
            goto L_0x014e
        L_0x0146:
            java.lang.String r4 = "SHA256withECDSA"
            goto L_0x014e
        L_0x0149:
            java.lang.String r4 = "SHA512withRSA"
            goto L_0x014e
        L_0x014c:
            java.lang.String r4 = "SHA256withRSA"
        L_0x014e:
            android.util.Pair r4 = android.util.Pair.create(r4, r5)
            goto L_0x0180
        L_0x0153:
            java.lang.String r4 = "SHA512withRSA/PSS"
            java.security.spec.PSSParameterSpec r7 = new java.security.spec.PSSParameterSpec
            java.lang.String r15 = "SHA-512"
            java.lang.String r16 = "MGF1"
            java.security.spec.MGF1ParameterSpec r17 = java.security.spec.MGF1ParameterSpec.SHA512
            r18 = 64
            r19 = 1
            r14 = r7
            r14.<init>(r15, r16, r17, r18, r19)
            goto L_0x0178
        L_0x0166:
            java.lang.String r4 = "SHA256withRSA/PSS"
            java.security.spec.PSSParameterSpec r7 = new java.security.spec.PSSParameterSpec
            java.lang.String r15 = "SHA-256"
            java.lang.String r16 = "MGF1"
            java.security.spec.MGF1ParameterSpec r17 = java.security.spec.MGF1ParameterSpec.SHA256
            r18 = 32
            r19 = 1
            r14 = r7
            r14.<init>(r15, r16, r17, r18, r19)
        L_0x0178:
            android.util.Pair r4 = android.util.Pair.create(r4, r7)
            goto L_0x0180
        L_0x017d:
            java.lang.String r4 = "SHA256withDSA"
            goto L_0x014e
        L_0x0180:
            java.lang.Object r7 = r4.first
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r4 = r4.second
            java.security.spec.AlgorithmParameterSpec r4 = (java.security.spec.AlgorithmParameterSpec) r4
            java.security.KeyFactory r1 = java.security.KeyFactory.getInstance(r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x02c4 }
            java.security.spec.X509EncodedKeySpec r10 = new java.security.spec.X509EncodedKeySpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x02c4 }
            r10.<init>(r2)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x02c4 }
            java.security.PublicKey r1 = r1.generatePublic(r10)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x02c4 }
            java.security.Signature r10 = java.security.Signature.getInstance(r7)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x02c4 }
            r10.initVerify(r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x02c4 }
            if (r4 == 0) goto L_0x01a1
            r10.setParameter(r4)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x02c4 }
        L_0x01a1:
            r10.update(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x02c4 }
            boolean r1 = r10.verify(r9)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x02c4 }
            if (r1 == 0) goto L_0x02b4
            r0.clear()
            java.nio.ByteBuffer r1 = m42308b(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r7 = r5
            r5 = 0
        L_0x01b8:
            boolean r9 = r1.hasRemaining()
            if (r9 == 0) goto L_0x01fd
            int r5 = r5 + r13
            java.nio.ByteBuffer r9 = m42308b(r1)     // Catch:{ IOException | BufferUnderflowException -> 0x01e3 }
            int r10 = r9.remaining()     // Catch:{ IOException | BufferUnderflowException -> 0x01e3 }
            if (r10 < r11) goto L_0x01db
            int r10 = r9.getInt()     // Catch:{ IOException | BufferUnderflowException -> 0x01e3 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)     // Catch:{ IOException | BufferUnderflowException -> 0x01e3 }
            r4.add(r12)     // Catch:{ IOException | BufferUnderflowException -> 0x01e3 }
            if (r10 != r8) goto L_0x01b8
            byte[] r7 = m42311c(r9)     // Catch:{ IOException | BufferUnderflowException -> 0x01e3 }
            goto L_0x01b8
        L_0x01db:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException | BufferUnderflowException -> 0x01e3 }
            java.lang.String r1 = "Record too short"
            r0.<init>(r1)     // Catch:{ IOException | BufferUnderflowException -> 0x01e3 }
            throw r0     // Catch:{ IOException | BufferUnderflowException -> 0x01e3 }
        L_0x01e3:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            r2 = 42
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Failed to parse digest record #"
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x01fd:
            boolean r1 = r3.equals(r4)
            if (r1 == 0) goto L_0x02ac
            int r1 = m42296a(r8)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = r21
            java.lang.Object r3 = r4.put(r3, r7)
            byte[] r3 = (byte[]) r3
            if (r3 == 0) goto L_0x0230
            boolean r3 = java.security.MessageDigest.isEqual(r3, r7)
            if (r3 == 0) goto L_0x021c
            goto L_0x0230
        L_0x021c:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = m42307b(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " contents digest does not match the digest specified by a preceding signer"
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
        L_0x0230:
            java.nio.ByteBuffer r0 = m42308b(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = 0
        L_0x023a:
            boolean r4 = r0.hasRemaining()
            if (r4 == 0) goto L_0x0275
            int r3 = r3 + r13
            byte[] r4 = m42311c(r0)
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch:{ CertificateException -> 0x025b }
            r5.<init>(r4)     // Catch:{ CertificateException -> 0x025b }
            r7 = r22
            java.security.cert.Certificate r5 = r7.generateCertificate(r5)     // Catch:{ CertificateException -> 0x025b }
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5     // Catch:{ CertificateException -> 0x025b }
            com.google.android.play.core.c.as r8 = new com.google.android.play.core.c.as
            r8.<init>(r5, r4)
            r1.add(r8)
            goto L_0x023a
        L_0x025b:
            r0 = move-exception
            java.lang.SecurityException r1 = new java.lang.SecurityException
            r2 = 41
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            java.lang.String r2 = "Failed to decode certificate #"
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x0275:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x02a4
            java.lang.Object r0 = r1.get(r6)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            java.security.PublicKey r0 = r0.getPublicKey()
            byte[] r0 = r0.getEncoded()
            boolean r0 = java.util.Arrays.equals(r2, r0)
            if (r0 == 0) goto L_0x029c
            int r0 = r1.size()
            java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.security.cert.X509Certificate[] r0 = (java.security.cert.X509Certificate[]) r0
            return r0
        L_0x029c:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "Public key mismatch between certificate and signature record"
            r0.<init>(r1)
            throw r0
        L_0x02a4:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "No certificates listed"
            r0.<init>(r1)
            throw r0
        L_0x02ac:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "Signature algorithms don't match between digests and signatures records"
            r0.<init>(r1)
            throw r0
        L_0x02b4:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r2 = " signature did not verify"
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
        L_0x02c4:
            r0 = move-exception
            java.lang.SecurityException r1 = new java.lang.SecurityException
            java.lang.String r2 = java.lang.String.valueOf(r7)
            int r2 = r2.length()
            int r2 = r2 + 27
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Failed to verify "
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = " signature"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.p1051c.C17272au.m42303a(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    /* renamed from: a */
    private static byte[][] m42304a(int[] iArr, C17252ab[] abVarArr) throws DigestException {
        int i;
        long j;
        int[] iArr2 = iArr;
        long j2 = 0;
        long j3 = 0;
        int i2 = 0;
        while (true) {
            i = 3;
            j = 1048576;
            if (i2 >= 3) {
                break;
            }
            j3 += ((abVarArr[i2].mo33525a() + 1048576) - 1) / 1048576;
            i2++;
        }
        if (j3 < 2097151) {
            int i3 = (int) j3;
            byte[][] bArr = new byte[iArr2.length][];
            for (int i4 = 0; i4 < iArr2.length; i4++) {
                byte[] bArr2 = new byte[((m42310c(iArr2[i4]) * i3) + 5)];
                bArr2[0] = 90;
                m42300a(i3, bArr2, 1);
                bArr[i4] = bArr2;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[iArr2.length];
            int i5 = 0;
            while (i5 < iArr2.length) {
                String b = m42307b(iArr2[i5]);
                try {
                    messageDigestArr[i5] = MessageDigest.getInstance(b);
                    i5++;
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(String.valueOf(b).concat(" digest not supported"), e);
                }
            }
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i6 < i) {
                C17252ab abVar = abVarArr[i6];
                long j4 = j2;
                long a = abVar.mo33525a();
                while (a > j2) {
                    int min = (int) Math.min(a, j);
                    m42300a(min, bArr3, 1);
                    for (MessageDigest update : messageDigestArr) {
                        update.update(bArr3);
                    }
                    long j5 = j4;
                    try {
                        abVar.mo33526a(messageDigestArr, j5, min);
                        int i9 = 0;
                        while (i9 < iArr2.length) {
                            int i10 = iArr2[i9];
                            byte[] bArr4 = bArr[i9];
                            int c = m42310c(i10);
                            C17252ab abVar2 = abVar;
                            MessageDigest messageDigest = messageDigestArr[i9];
                            byte[] bArr5 = bArr3;
                            int digest = messageDigest.digest(bArr4, (i7 * c) + 5, c);
                            if (digest == c) {
                                i9++;
                                abVar = abVar2;
                                bArr3 = bArr5;
                            } else {
                                String algorithm = messageDigest.getAlgorithm();
                                StringBuilder sb = new StringBuilder(String.valueOf(algorithm).length() + 46);
                                sb.append("Unexpected output size of ");
                                sb.append(algorithm);
                                sb.append(" digest: ");
                                sb.append(digest);
                                throw new RuntimeException(sb.toString());
                            }
                        }
                        C17252ab abVar3 = abVar;
                        byte[] bArr6 = bArr3;
                        long j6 = (long) min;
                        j4 = j5 + j6;
                        a -= j6;
                        i7++;
                        j2 = 0;
                        j = 1048576;
                    } catch (IOException e2) {
                        IOException iOException = e2;
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Failed to digest chunk #");
                        sb2.append(i7);
                        sb2.append(" of section #");
                        sb2.append(i8);
                        throw new DigestException(sb2.toString(), iOException);
                    }
                }
                byte[] bArr7 = bArr3;
                i8++;
                i6++;
                j2 = 0;
                i = 3;
                j = 1048576;
            }
            byte[][] bArr8 = new byte[iArr2.length][];
            int i11 = 0;
            while (i11 < iArr2.length) {
                int i12 = iArr2[i11];
                byte[] bArr9 = bArr[i11];
                String b2 = m42307b(i12);
                try {
                    bArr8[i11] = MessageDigest.getInstance(b2).digest(bArr9);
                    i11++;
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(String.valueOf(b2).concat(" digest not supported"), e3);
                }
            }
            return bArr8;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Too many chunks: ");
        sb3.append(j3);
        throw new DigestException(sb3.toString());
    }
}
