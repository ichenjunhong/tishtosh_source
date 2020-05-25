package com.bytedance.ies.ugc.p694a;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.bytedance.ies.ugc.a.b */
public final class C11007b {

    /* renamed from: com.bytedance.ies.ugc.a.b$a */
    static final class C11008a<A, B> {

        /* renamed from: a */
        public final A f29550a;

        /* renamed from: b */
        public final B f29551b;

        public final int hashCode() {
            int i;
            int i2 = 0;
            if (this.f29550a == null) {
                i = 0;
            } else {
                i = this.f29550a.hashCode();
            }
            int i3 = (i + 31) * 31;
            if (this.f29551b != null) {
                i2 = this.f29551b.hashCode();
            }
            return i3 + i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C11008a aVar = (C11008a) obj;
            if (this.f29550a == null) {
                if (aVar.f29550a != null) {
                    return false;
                }
            } else if (!this.f29550a.equals(aVar.f29550a)) {
                return false;
            }
            if (this.f29551b == null) {
                if (aVar.f29551b != null) {
                    return false;
                }
            } else if (!this.f29551b.equals(aVar.f29551b)) {
                return false;
            }
            return true;
        }

        C11008a(A a, B b) {
            this.f29550a = a;
            this.f29551b = b;
        }
    }

    /* renamed from: com.bytedance.ies.ugc.a.b$b */
    public static class C11009b extends Exception {
        private static final long serialVersionUID = 1;

        public C11009b(String str) {
            super(str);
        }

        public C11009b(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: a */
    private static C11008a<ByteBuffer, Long> m22275a(FileChannel fileChannel) throws IOException, C11009b {
        long size = fileChannel.size();
        if (size >= 22) {
            long j = size - 22;
            long min = Math.min(j, 65535);
            int i = 0;
            while (true) {
                long j2 = (long) i;
                if (j2 <= min) {
                    long j3 = j - j2;
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    fileChannel.position(j3);
                    fileChannel.read(allocate);
                    allocate.order(ByteOrder.LITTLE_ENDIAN);
                    if (allocate.getInt(0) == 101010256) {
                        ByteBuffer allocate2 = ByteBuffer.allocate(2);
                        fileChannel.position(j3 + 20);
                        fileChannel.read(allocate2);
                        allocate2.order(ByteOrder.LITTLE_ENDIAN);
                        short s = allocate2.getShort(0);
                        if (s == i) {
                            long j4 = (long) s;
                            ByteBuffer allocate3 = ByteBuffer.allocate(4);
                            allocate3.order(ByteOrder.LITTLE_ENDIAN);
                            fileChannel.position((fileChannel.size() - j4) - 6);
                            fileChannel.read(allocate3);
                            long j5 = (long) allocate3.getInt(0);
                            if (j5 >= 32) {
                                fileChannel.position(j5 - 24);
                                ByteBuffer allocate4 = ByteBuffer.allocate(24);
                                fileChannel.read(allocate4);
                                allocate4.order(ByteOrder.LITTLE_ENDIAN);
                                if (allocate4.getLong(8) == 2334950737559900225L && allocate4.getLong(16) == 3617552046287187010L) {
                                    long j6 = allocate4.getLong(0);
                                    if (j6 < ((long) allocate4.capacity()) || j6 > 2147483639) {
                                        StringBuilder sb = new StringBuilder("APK Signing Block size out of range: ");
                                        sb.append(j6);
                                        throw new C11009b(sb.toString());
                                    }
                                    int i2 = (int) (8 + j6);
                                    long j7 = j5 - ((long) i2);
                                    if (j7 >= 0) {
                                        fileChannel.position(j7);
                                        ByteBuffer allocate5 = ByteBuffer.allocate(i2);
                                        fileChannel.read(allocate5);
                                        allocate5.order(ByteOrder.LITTLE_ENDIAN);
                                        long j8 = allocate5.getLong(0);
                                        if (j8 == j6) {
                                            return new C11008a<>(allocate5, Long.valueOf(j7));
                                        }
                                        StringBuilder sb2 = new StringBuilder("APK Signing Block sizes in header and footer do not match: ");
                                        sb2.append(j8);
                                        sb2.append(" vs ");
                                        sb2.append(j6);
                                        throw new C11009b(sb2.toString());
                                    }
                                    StringBuilder sb3 = new StringBuilder("APK Signing Block offset out of range: ");
                                    sb3.append(j7);
                                    throw new C11009b(sb3.toString());
                                }
                                throw new C11009b("No APK Signing Block before ZIP Central Directory");
                            }
                            StringBuilder sb4 = new StringBuilder("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                            sb4.append(j5);
                            throw new C11009b(sb4.toString());
                        }
                    }
                    i++;
                } else {
                    throw new IOException("ZIP End of Central Directory (EOCD) record not found");
                }
            }
        } else {
            throw new IOException("APK too small for ZIP End of Central Directory (EOCD) record");
        }
    }

    /* renamed from: a */
    private static Map<Integer, ByteBuffer> m22279a(ByteBuffer byteBuffer) throws C11009b {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            ByteBuffer a = m22278a(byteBuffer, 8, byteBuffer.capacity() - 24);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = 0;
            while (a.hasRemaining()) {
                i++;
                if (a.remaining() >= 8) {
                    long j = a.getLong();
                    if (j < 4 || j > 2147483647L) {
                        StringBuilder sb = new StringBuilder("APK Signing Block entry #");
                        sb.append(i);
                        sb.append(" size out of range: ");
                        sb.append(j);
                        throw new C11009b(sb.toString());
                    }
                    int i2 = (int) j;
                    int position = a.position() + i2;
                    if (i2 <= a.remaining()) {
                        linkedHashMap.put(Integer.valueOf(a.getInt()), m22277a(a, i2 - 4));
                        a.position(position);
                    } else {
                        StringBuilder sb2 = new StringBuilder("APK Signing Block entry #");
                        sb2.append(i);
                        sb2.append(" size out of range: ");
                        sb2.append(i2);
                        sb2.append(", available: ");
                        sb2.append(a.remaining());
                        throw new C11009b(sb2.toString());
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder("Insufficient data to read size of APK Signing Block entry #");
                    sb3.append(i);
                    throw new C11009b(sb3.toString());
                }
            }
            return linkedHashMap;
        }
        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (r6 != null) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005f A[SYNTHETIC, Splitter:B:19:0x005f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m22276a(java.lang.String r5, int r6) {
        /*
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            r0 = 0
            if (r6 == 0) goto L_0x0008
            return r0
        L_0x0008:
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ Throwable -> 0x0063, all -> 0x005b }
            java.lang.String r1 = "r"
            r6.<init>(r5, r1)     // Catch:{ Throwable -> 0x0063, all -> 0x005b }
            java.nio.channels.FileChannel r5 = r6.getChannel()     // Catch:{ Throwable -> 0x0064, all -> 0x0059 }
            com.bytedance.ies.ugc.a.b$a r5 = m22275a(r5)     // Catch:{ Throwable -> 0x0064, all -> 0x0059 }
            A r5 = r5.f29550a     // Catch:{ Throwable -> 0x0064, all -> 0x0059 }
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5     // Catch:{ Throwable -> 0x0064, all -> 0x0059 }
            java.util.Map r5 = m22279a(r5)     // Catch:{ Throwable -> 0x0064, all -> 0x0059 }
            r1 = 1903654775(0x71777777, float:1.22539554E30)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ Throwable -> 0x0064, all -> 0x0059 }
            boolean r2 = r5.containsKey(r2)     // Catch:{ Throwable -> 0x0064, all -> 0x0059 }
            if (r2 == 0) goto L_0x0055
            java.lang.String r2 = new java.lang.String     // Catch:{ Throwable -> 0x0064, all -> 0x0059 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Throwable -> 0x0064, all -> 0x0059 }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ Throwable -> 0x0064, all -> 0x0059 }
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5     // Catch:{ Throwable -> 0x0064, all -> 0x0059 }
            byte[] r1 = r5.array()     // Catch:{ Throwable -> 0x0064, all -> 0x0059 }
            int r3 = r5.arrayOffset()     // Catch:{ Throwable -> 0x0064, all -> 0x0059 }
            int r4 = r5.position()     // Catch:{ Throwable -> 0x0064, all -> 0x0059 }
            int r4 = r4 + r3
            int r5 = r5.limit()     // Catch:{ Throwable -> 0x0064, all -> 0x0059 }
            int r3 = r3 + r5
            byte[] r5 = java.util.Arrays.copyOfRange(r1, r4, r3)     // Catch:{ Throwable -> 0x0064, all -> 0x0059 }
            r2.<init>(r5)     // Catch:{ Throwable -> 0x0064, all -> 0x0059 }
            r6.close()     // Catch:{ Throwable -> 0x0054 }
        L_0x0054:
            return r2
        L_0x0055:
            r6.close()     // Catch:{ Throwable -> 0x0067 }
            goto L_0x0067
        L_0x0059:
            r5 = move-exception
            goto L_0x005d
        L_0x005b:
            r5 = move-exception
            r6 = r0
        L_0x005d:
            if (r6 == 0) goto L_0x0062
            r6.close()     // Catch:{ Throwable -> 0x0062 }
        L_0x0062:
            throw r5
        L_0x0063:
            r6 = r0
        L_0x0064:
            if (r6 == 0) goto L_0x0067
            goto L_0x0055
        L_0x0067:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.p694a.C11007b.m22276a(java.lang.String, int):java.lang.String");
    }

    /* renamed from: a */
    private static ByteBuffer m22277a(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
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
            StringBuilder sb = new StringBuilder("size: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private static ByteBuffer m22278a(ByteBuffer byteBuffer, int i, int i2) {
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
                StringBuilder sb = new StringBuilder("end > capacity: ");
                sb.append(i2);
                sb.append(" > ");
                sb.append(capacity);
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder("end < start: ");
            sb2.append(i2);
            sb2.append(" < 8");
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
