package okio;

import com.C2240a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.liko.leakdetector.LeakDetectorInstaller;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52808d;

public final class Buffer implements Cloneable, ByteChannel, BufferedSink, BufferedSource {
    public static final Companion Companion = new Companion(null);
    private static final byte[] DIGITS;
    public Segment head;
    private long size;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    public static final class UnsafeCursor implements Closeable {
        public Buffer buffer;
        public byte[] data;
        public int end = -1;
        public long offset = -1;
        public boolean readWrite;
        private Segment segment;
        public int start = -1;

        public final void close() {
            boolean z;
            if (this.buffer != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.buffer = null;
                this.segment = null;
                this.offset = -1;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final int next() {
            boolean z;
            long j;
            long j2 = this.offset;
            Buffer buffer2 = this.buffer;
            if (buffer2 == null) {
                C52711k.m112234a();
            }
            if (j2 != buffer2.size()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.offset == -1) {
                    j = 0;
                } else {
                    j = this.offset + ((long) (this.end - this.start));
                }
                return seek(j);
            }
            throw new IllegalStateException("no more bytes".toString());
        }

        public final long expandBuffer(int i) {
            boolean z;
            boolean z2 = false;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i <= 8192) {
                    z2 = true;
                }
                if (z2) {
                    Buffer buffer2 = this.buffer;
                    if (buffer2 == null) {
                        throw new IllegalStateException("not attached to a buffer".toString());
                    } else if (this.readWrite) {
                        long size = buffer2.size();
                        Segment writableSegment$jvm = buffer2.writableSegment$jvm(i);
                        int i2 = 8192 - writableSegment$jvm.limit;
                        writableSegment$jvm.limit = VideoCacheReadBuffersizeExperiment.DEFAULT;
                        long j = (long) i2;
                        buffer2.setSize$jvm(size + j);
                        this.segment = writableSegment$jvm;
                        this.offset = size;
                        this.data = writableSegment$jvm.data;
                        this.start = 8192 - i2;
                        this.end = VideoCacheReadBuffersizeExperiment.DEFAULT;
                        return j;
                    } else {
                        throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
                    }
                } else {
                    StringBuilder sb = new StringBuilder("minByteCount > Segment.SIZE: ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            } else {
                StringBuilder sb2 = new StringBuilder("minByteCount <= 0: ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }

        public final long resizeBuffer(long j) {
            boolean z;
            long j2 = j;
            Buffer buffer2 = this.buffer;
            if (buffer2 == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            } else if (this.readWrite) {
                long size = buffer2.size();
                int i = 1;
                if (j2 <= size) {
                    if (j2 >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        long j3 = size - j2;
                        while (true) {
                            if (j3 <= 0) {
                                break;
                            }
                            Segment segment2 = buffer2.head;
                            if (segment2 == null) {
                                C52711k.m112234a();
                            }
                            Segment segment3 = segment2.prev;
                            if (segment3 == null) {
                                C52711k.m112234a();
                            }
                            long j4 = (long) (segment3.limit - segment3.pos);
                            if (j4 > j3) {
                                segment3.limit -= (int) j3;
                                break;
                            }
                            buffer2.head = segment3.pop();
                            SegmentPool.recycle(segment3);
                            j3 -= j4;
                        }
                        this.segment = null;
                        this.offset = j2;
                        this.data = null;
                        this.start = -1;
                        this.end = -1;
                    } else {
                        StringBuilder sb = new StringBuilder("newSize < 0: ");
                        sb.append(j2);
                        throw new IllegalArgumentException(sb.toString().toString());
                    }
                } else if (j2 > size) {
                    long j5 = j2 - size;
                    boolean z2 = true;
                    while (j5 > 0) {
                        Segment writableSegment$jvm = buffer2.writableSegment$jvm(i);
                        int min = (int) Math.min(j5, (long) (8192 - writableSegment$jvm.limit));
                        writableSegment$jvm.limit += min;
                        j5 -= (long) min;
                        if (z2) {
                            this.segment = writableSegment$jvm;
                            this.offset = size;
                            this.data = writableSegment$jvm.data;
                            this.start = writableSegment$jvm.limit - min;
                            this.end = writableSegment$jvm.limit;
                            z2 = false;
                        }
                        i = 1;
                    }
                }
                buffer2.setSize$jvm(j2);
                return size;
            } else {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
        }

        public final int seek(long j) {
            Segment segment2;
            long j2;
            Buffer buffer2 = this.buffer;
            if (buffer2 == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            } else if (j < -1 || j > buffer2.size()) {
                String str = "offset=%s > size=%s";
                String a = C2240a.m6772a(str, Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(buffer2.size())}, 2));
                C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
                throw new ArrayIndexOutOfBoundsException(a);
            } else if (j == -1 || j == buffer2.size()) {
                this.segment = null;
                this.offset = j;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            } else {
                long j3 = 0;
                long size = buffer2.size();
                Segment segment3 = buffer2.head;
                Segment segment4 = buffer2.head;
                if (this.segment != null) {
                    long j4 = this.offset;
                    int i = this.start;
                    Segment segment5 = this.segment;
                    if (segment5 == null) {
                        C52711k.m112234a();
                    }
                    long j5 = j4 - ((long) (i - segment5.pos));
                    if (j5 > j) {
                        segment4 = this.segment;
                        size = j5;
                    } else {
                        segment3 = this.segment;
                        j3 = j5;
                    }
                }
                if (size - j > j - j3) {
                    while (true) {
                        if (segment2 == null) {
                            C52711k.m112234a();
                        }
                        if (j < ((long) (segment2.limit - segment2.pos)) + j2) {
                            break;
                        }
                        j3 = j2 + ((long) (segment2.limit - segment2.pos));
                        segment3 = segment2.next;
                    }
                } else {
                    j2 = size;
                    segment2 = segment4;
                    while (j2 > j) {
                        if (segment2 == null) {
                            C52711k.m112234a();
                        }
                        segment2 = segment2.prev;
                        if (segment2 == null) {
                            C52711k.m112234a();
                        }
                        j2 -= (long) (segment2.limit - segment2.pos);
                    }
                }
                if (this.readWrite) {
                    if (segment2 == null) {
                        C52711k.m112234a();
                    }
                    if (segment2.shared) {
                        Segment unsharedCopy = segment2.unsharedCopy();
                        if (buffer2.head == segment2) {
                            buffer2.head = unsharedCopy;
                        }
                        segment2 = segment2.push(unsharedCopy);
                        Segment segment6 = segment2.prev;
                        if (segment6 == null) {
                            C52711k.m112234a();
                        }
                        segment6.pop();
                    }
                }
                this.segment = segment2;
                this.offset = j;
                if (segment2 == null) {
                    C52711k.m112234a();
                }
                this.data = segment2.data;
                this.start = segment2.pos + ((int) (j - j2));
                this.end = segment2.limit;
                return this.end - this.start;
            }
        }
    }

    /* renamed from: -deprecated_size reason: not valid java name */
    public final long m114630deprecated_size() {
        return this.size;
    }

    public final Buffer buffer() {
        return this;
    }

    public final void close() {
    }

    public final Buffer copyTo(OutputStream outputStream) throws IOException {
        return copyTo$default(this, outputStream, 0, 0, 6, (Object) null);
    }

    public final Buffer copyTo(OutputStream outputStream, long j) throws IOException {
        return copyTo$default(this, outputStream, j, 0, 4, (Object) null);
    }

    public final Buffer emit() {
        return this;
    }

    public final Buffer emitCompleteSegments() {
        return this;
    }

    public final void flush() {
    }

    public final boolean isOpen() {
        return true;
    }

    public final UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe$default(this, null, 1, null);
    }

    public final UnsafeCursor readUnsafe() {
        return readUnsafe$default(this, null, 1, null);
    }

    public final long size() {
        return this.size;
    }

    public final Timeout timeout() {
        return Timeout.NONE;
    }

    public final Buffer writeTo(OutputStream outputStream) throws IOException {
        return writeTo$default(this, outputStream, 0, 2, null);
    }

    public final void clear() {
        skip(this.size);
    }

    public final InputStream inputStream() {
        return new Buffer$inputStream$1(this);
    }

    public final ByteString md5() {
        return digest("MD5");
    }

    public final OutputStream outputStream() {
        return new Buffer$outputStream$1(this);
    }

    public final byte[] readByteArray() {
        return readByteArray(this.size);
    }

    public final ByteString sha1() {
        return digest("SHA-1");
    }

    public final ByteString sha256() {
        return digest("SHA-256");
    }

    public final ByteString sha512() {
        return digest("SHA-512");
    }

    public final boolean exhausted() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    public final ByteString readByteString() {
        return new ByteString(readByteArray());
    }

    public final int readIntLe() throws EOFException {
        return Util.reverseBytes(readInt());
    }

    public final long readLongLe() throws EOFException {
        return Util.reverseBytes(readLong());
    }

    public final short readShortLe() throws EOFException {
        return Util.reverseBytes(readShort());
    }

    public final String readUtf8() {
        return readString(this.size, C52808d.f131043a);
    }

    public final String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    public final String toString() {
        return snapshot().toString();
    }

    static {
        byte[] bytes = "0123456789abcdef".getBytes(C52808d.f131043a);
        C52711k.m112236a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        DIGITS = bytes;
    }

    public final long completeSegmentByteCount() {
        long j = this.size;
        if (j == 0) {
            return 0;
        }
        Segment segment = this.head;
        if (segment == null) {
            C52711k.m112234a();
        }
        Segment segment2 = segment.prev;
        if (segment2 == null) {
            C52711k.m112234a();
        }
        if (segment2.limit < 8192 && segment2.owner) {
            j -= (long) (segment2.limit - segment2.pos);
        }
        return j;
    }

    public final int hashCode() {
        Segment segment = this.head;
        if (segment == null) {
            return 0;
        }
        int i = 1;
        do {
            for (int i2 = segment.pos; i2 < segment.limit; i2++) {
                i = (i * 31) + segment.data[i2];
            }
            segment = segment.next;
            if (segment == null) {
                C52711k.m112234a();
            }
        } while (segment != this.head);
        return i;
    }

    public final byte readByte() throws EOFException {
        if (this.size != 0) {
            Segment segment = this.head;
            if (segment == null) {
                C52711k.m112234a();
            }
            int i = segment.pos;
            int i2 = segment.limit;
            int i3 = i + 1;
            byte b = segment.data[i];
            this.size--;
            if (i3 == i2) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    public final String readUtf8Line() throws EOFException {
        long indexOf = indexOf(10);
        if (indexOf != -1) {
            return readUtf8Line$jvm(indexOf);
        }
        if (this.size != 0) {
            return readUtf8(this.size);
        }
        return null;
    }

    public final ByteString snapshot() {
        boolean z;
        if (this.size <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return snapshot((int) this.size);
        }
        StringBuilder sb = new StringBuilder("size > Integer.MAX_VALUE: ");
        sb.append(this.size);
        throw new IllegalStateException(sb.toString().toString());
    }

    public final Buffer clone() {
        Buffer buffer = new Buffer();
        if (this.size == 0) {
            return buffer;
        }
        Segment segment = this.head;
        if (segment == null) {
            C52711k.m112234a();
        }
        buffer.head = segment.sharedCopy();
        Segment segment2 = buffer.head;
        if (segment2 == null) {
            C52711k.m112234a();
        }
        segment2.prev = buffer.head;
        Segment segment3 = buffer.head;
        if (segment3 == null) {
            C52711k.m112234a();
        }
        Segment segment4 = buffer.head;
        if (segment4 == null) {
            C52711k.m112234a();
        }
        segment3.next = segment4.prev;
        Segment segment5 = this.head;
        if (segment5 == null) {
            C52711k.m112234a();
        }
        while (true) {
            segment5 = segment5.next;
            if (segment5 != this.head) {
                Segment segment6 = buffer.head;
                if (segment6 == null) {
                    C52711k.m112234a();
                }
                Segment segment7 = segment6.prev;
                if (segment7 == null) {
                    C52711k.m112234a();
                }
                if (segment5 == null) {
                    C52711k.m112234a();
                }
                segment7.push(segment5.sharedCopy());
            } else {
                buffer.size = this.size;
                return buffer;
            }
        }
    }

    public final int readInt() throws EOFException {
        if (this.size >= 4) {
            Segment segment = this.head;
            if (segment == null) {
                C52711k.m112234a();
            }
            int i = segment.pos;
            int i2 = segment.limit;
            if (((long) (i2 - i)) < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = segment.data;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            this.size -= 4;
            if (i6 == i2) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i6;
            }
            return b3;
        }
        throw new EOFException();
    }

    public final short readShort() throws EOFException {
        if (this.size >= 2) {
            Segment segment = this.head;
            if (segment == null) {
                C52711k.m112234a();
            }
            int i = segment.pos;
            int i2 = segment.limit;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = segment.data;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.size -= 2;
            if (i4 == i2) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i4;
            }
            return (short) b;
        }
        throw new EOFException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        r2 = new okio.Buffer().writeDecimalLong(r6).writeByte((int) r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r1 != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        r2.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        r3 = new java.lang.StringBuilder("Number too large: ");
        r3.append(r2.readUtf8());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0079, code lost:
        throw new java.lang.NumberFormatException(r3.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long readDecimalLong() throws java.io.EOFException {
        /*
            r19 = this;
            r0 = r19
            long r1 = r0.size
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00d2
            r1 = -7
            r5 = 0
            r6 = r3
            r4 = 0
            r2 = r1
            r1 = 0
        L_0x0011:
            okio.Segment r8 = r0.head
            if (r8 != 0) goto L_0x0018
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0018:
            byte[] r9 = r8.data
            int r10 = r8.pos
            int r11 = r8.limit
        L_0x001e:
            r12 = 1
            if (r10 >= r11) goto L_0x00af
            byte r13 = r9[r10]
            r14 = 48
            if (r13 < r14) goto L_0x007a
            r15 = 57
            if (r13 > r15) goto L_0x007a
            int r14 = r14 - r13
            r15 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r12 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r12 < 0) goto L_0x004e
            int r12 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r12 != 0) goto L_0x0043
            r17 = r8
            r18 = r9
            long r8 = (long) r14
            int r12 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r12 >= 0) goto L_0x0047
            goto L_0x004e
        L_0x0043:
            r17 = r8
            r18 = r9
        L_0x0047:
            r8 = 10
            long r6 = r6 * r8
            long r8 = (long) r14
            long r6 = r6 + r8
            goto L_0x0088
        L_0x004e:
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
            okio.Buffer r2 = r2.writeDecimalLong(r6)
            okio.Buffer r2 = r2.writeByte(r13)
            if (r1 != 0) goto L_0x0060
            r2.readByte()
        L_0x0060:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Number too large: "
            r3.<init>(r4)
            java.lang.String r2 = r2.readUtf8()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L_0x007a:
            r17 = r8
            r18 = r9
            r8 = 45
            if (r13 != r8) goto L_0x0091
            if (r5 != 0) goto L_0x0091
            r8 = 1
            long r2 = r2 - r8
            r1 = 1
        L_0x0088:
            int r10 = r10 + 1
            int r5 = r5 + 1
            r8 = r17
            r9 = r18
            goto L_0x001e
        L_0x0091:
            if (r5 == 0) goto L_0x0095
            r4 = 1
            goto L_0x00b1
        L_0x0095:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.<init>(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r13)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L_0x00af:
            r17 = r8
        L_0x00b1:
            if (r10 != r11) goto L_0x00bd
            okio.Segment r8 = r17.pop()
            r0.head = r8
            okio.SegmentPool.recycle(r17)
            goto L_0x00c1
        L_0x00bd:
            r8 = r17
            r8.pos = r10
        L_0x00c1:
            if (r4 != 0) goto L_0x00c7
            okio.Segment r8 = r0.head
            if (r8 != 0) goto L_0x0011
        L_0x00c7:
            long r2 = r0.size
            long r4 = (long) r5
            long r2 = r2 - r4
            r0.size = r2
            if (r1 == 0) goto L_0x00d0
            return r6
        L_0x00d0:
            long r1 = -r6
            return r1
        L_0x00d2:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.readDecimalLong():long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0095, code lost:
        if (r8 != r9) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
        r15.head = r6.pop();
        okio.SegmentPool.recycle(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a1, code lost:
        r6.pos = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a3, code lost:
        if (r1 != false) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long readHexadecimalUnsignedLong() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.size
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00b0
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000b:
            okio.Segment r6 = r15.head
            if (r6 != 0) goto L_0x0012
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0012:
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L_0x0018:
            if (r8 >= r9) goto L_0x0095
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0027
            r11 = 57
            if (r10 > r11) goto L_0x0027
            int r11 = r10 + -48
            goto L_0x0040
        L_0x0027:
            r11 = 97
            if (r10 < r11) goto L_0x0034
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x0034
            int r11 = r10 + -97
            int r11 = r11 + 10
            goto L_0x0040
        L_0x0034:
            r11 = 65
            if (r10 < r11) goto L_0x0077
            r11 = 70
            if (r10 > r11) goto L_0x0077
            int r11 = r10 + -65
            int r11 = r11 + 10
        L_0x0040:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x0050
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0018
        L_0x0050:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L_0x0077:
            if (r0 == 0) goto L_0x007b
            r1 = 1
            goto L_0x0095
        L_0x007b:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x0095:
            if (r8 != r9) goto L_0x00a1
            okio.Segment r7 = r6.pop()
            r15.head = r7
            okio.SegmentPool.recycle(r6)
            goto L_0x00a3
        L_0x00a1:
            r6.pos = r8
        L_0x00a3:
            if (r1 != 0) goto L_0x00a9
            okio.Segment r6 = r15.head
            if (r6 != 0) goto L_0x000b
        L_0x00a9:
            long r1 = r15.size
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.size = r1
            return r4
        L_0x00b0:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.readHexadecimalUnsignedLong():long");
    }

    public final long readLong() throws EOFException {
        if (this.size >= 8) {
            Segment segment = this.head;
            if (segment == null) {
                C52711k.m112234a();
            }
            int i = segment.pos;
            int i2 = segment.limit;
            if (((long) (i2 - i)) < 8) {
                return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
            }
            byte[] bArr = segment.data;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i3]) & 255) << 48) | ((((long) bArr[i4]) & 255) << 40);
            int i6 = i5 + 1;
            long j2 = ((((long) bArr[i5]) & 255) << 32) | j;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            long j3 = j2 | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16);
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j4 = j3 | ((((long) bArr[i8]) & 255) << 8) | (((long) bArr[i9]) & 255);
            this.size -= 8;
            if (i10 == i2) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i10;
            }
            return j4;
        }
        throw new EOFException();
    }

    public final int readUtf8CodePoint() throws EOFException {
        byte b;
        int i;
        byte b2;
        if (this.size != 0) {
            byte b3 = getByte(0);
            int i2 = 1;
            if ((b3 & 128) == 0) {
                b2 = b3 & Byte.MAX_VALUE;
                i = 1;
                b = 0;
            } else if ((b3 & 224) == 192) {
                b2 = b3 & 31;
                i = 2;
                b = 128;
            } else if ((b3 & 240) == 224) {
                b2 = b3 & 15;
                i = 3;
                b = 2048;
            } else if ((b3 & 248) == 240) {
                b2 = b3 & 7;
                i = 4;
                b = 65536;
            } else {
                skip(1);
                return 65533;
            }
            long j = (long) i;
            if (this.size >= j) {
                while (i2 < i) {
                    long j2 = (long) i2;
                    byte b4 = getByte(j2);
                    if ((b4 & 192) == 128) {
                        b2 = (b2 << 6) | (b4 & 63);
                        i2++;
                    } else {
                        skip(j2);
                        return 65533;
                    }
                }
                skip(j);
                if (b2 > 1114111) {
                    return 65533;
                }
                if ((55296 <= b2 && 57343 >= b2) || b2 < b) {
                    return 65533;
                }
                return b2;
            }
            StringBuilder sb = new StringBuilder("size < ");
            sb.append(i);
            sb.append(": ");
            sb.append(this.size);
            sb.append(" (to read code point prefixed 0x");
            sb.append(Integer.toHexString(b3));
            sb.append(")");
            throw new EOFException(sb.toString());
        }
        throw new EOFException();
    }

    public final void setSize$jvm(long j) {
        this.size = j;
    }

    /* renamed from: -deprecated_getByte reason: not valid java name */
    public final byte m114629deprecated_getByte(long j) {
        return getByte(j);
    }

    public final String readUtf8(long j) throws EOFException {
        return readString(j, C52808d.f131043a);
    }

    public final ByteString hmacSha1(ByteString byteString) {
        C52711k.m112240b(byteString, "key");
        return hmac("HmacSHA1", byteString);
    }

    public final ByteString hmacSha256(ByteString byteString) {
        C52711k.m112240b(byteString, "key");
        return hmac("HmacSHA256", byteString);
    }

    public final ByteString hmacSha512(ByteString byteString) {
        C52711k.m112240b(byteString, "key");
        return hmac("HmacSHA512", byteString);
    }

    public final long indexOf(byte b) {
        return indexOf(b, 0, Long.MAX_VALUE);
    }

    public final long indexOfElement(ByteString byteString) {
        C52711k.m112240b(byteString, "targetBytes");
        return indexOfElement(byteString, 0);
    }

    public final int read(byte[] bArr) {
        C52711k.m112240b(bArr, "sink");
        return read(bArr, 0, bArr.length);
    }

    public final Buffer readFrom(InputStream inputStream) throws IOException {
        C52711k.m112240b(inputStream, "input");
        readFrom(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    public final String readString(Charset charset) {
        C52711k.m112240b(charset, "charset");
        return readString(this.size, charset);
    }

    public final boolean request(long j) {
        if (this.size >= j) {
            return true;
        }
        return false;
    }

    public final void require(long j) throws EOFException {
        if (this.size < j) {
            throw new EOFException();
        }
    }

    public final ByteString snapshot(int i) {
        if (i == 0) {
            return ByteString.EMPTY;
        }
        return new SegmentedByteString(this, i);
    }

    public final Buffer write(ByteString byteString) {
        C52711k.m112240b(byteString, "byteString");
        byteString.write$jvm(this);
        return this;
    }

    public final Buffer writeIntLe(int i) {
        return writeInt(Util.reverseBytes(i));
    }

    public final Buffer writeLongLe(long j) {
        return writeLong(Util.reverseBytes(j));
    }

    public final Buffer writeShortLe(int i) {
        return writeShort((int) Util.reverseBytes((short) i));
    }

    public final Buffer writeUtf8(String str) {
        C52711k.m112240b(str, "string");
        return writeUtf8(str, 0, str.length());
    }

    public final long readAll(Sink sink) throws IOException {
        C52711k.m112240b(sink, "sink");
        long j = this.size;
        if (j > 0) {
            sink.write(this, j);
        }
        return j;
    }

    public final ByteString readByteString(long j) throws EOFException {
        return new ByteString(readByteArray(j));
    }

    public final int select(Options options) {
        C52711k.m112240b(options, "options");
        int selectPrefix$jvm$default = selectPrefix$jvm$default(this, options, false, 2, null);
        if (selectPrefix$jvm$default == -1) {
            return -1;
        }
        skip((long) options.getByteStrings$jvm()[selectPrefix$jvm$default].size());
        return selectPrefix$jvm$default;
    }

    public final Buffer write(byte[] bArr) {
        C52711k.m112240b(bArr, "source");
        return write(bArr, 0, bArr.length);
    }

    public final long writeAll(Source source) throws IOException {
        C52711k.m112240b(source, "source");
        long j = 0;
        while (true) {
            long read = source.read(this, 8192);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    public final Buffer writeByte(int i) {
        Segment writableSegment$jvm = writableSegment$jvm(1);
        byte[] bArr = writableSegment$jvm.data;
        int i2 = writableSegment$jvm.limit;
        writableSegment$jvm.limit = i2 + 1;
        bArr[i2] = (byte) i;
        this.size++;
        return this;
    }

    private final ByteString digest(String str) {
        MessageDigest instance = MessageDigest.getInstance(str);
        Segment segment = this.head;
        if (segment != null) {
            instance.update(segment.data, segment.pos, segment.limit - segment.pos);
            Segment segment2 = segment.next;
            if (segment2 == null) {
                C52711k.m112234a();
            }
            while (segment2 != segment) {
                instance.update(segment2.data, segment2.pos, segment2.limit - segment2.pos);
                segment2 = segment2.next;
                if (segment2 == null) {
                    C52711k.m112234a();
                }
            }
        }
        byte[] digest = instance.digest();
        C52711k.m112236a((Object) digest, "messageDigest.digest()");
        return new ByteString(digest);
    }

    public final long indexOf(ByteString byteString) throws IOException {
        C52711k.m112240b(byteString, "bytes");
        return indexOf(byteString, 0);
    }

    public final int read(ByteBuffer byteBuffer) throws IOException {
        C52711k.m112240b(byteBuffer, "sink");
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), segment.limit - segment.pos);
        byteBuffer.put(segment.data, segment.pos, min);
        segment.pos += min;
        this.size -= (long) min;
        if (segment.pos == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return min;
    }

    public final UnsafeCursor readAndWriteUnsafe(UnsafeCursor unsafeCursor) {
        boolean z;
        C52711k.m112240b(unsafeCursor, "unsafeCursor");
        if (unsafeCursor.buffer == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            unsafeCursor.buffer = this;
            unsafeCursor.readWrite = true;
            return unsafeCursor;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    public final void readFully(byte[] bArr) throws EOFException {
        C52711k.m112240b(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public final UnsafeCursor readUnsafe(UnsafeCursor unsafeCursor) {
        boolean z;
        C52711k.m112240b(unsafeCursor, "unsafeCursor");
        if (unsafeCursor.buffer == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            unsafeCursor.buffer = this;
            unsafeCursor.readWrite = false;
            return unsafeCursor;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    public final String readUtf8Line$jvm(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (getByte(j2) == 13) {
                String readUtf8 = readUtf8(j2);
                skip(2);
                return readUtf8;
            }
        }
        String readUtf82 = readUtf8(j);
        skip(1);
        return readUtf82;
    }

    public final void skip(long j) throws EOFException {
        while (j > 0) {
            Segment segment = this.head;
            if (segment != null) {
                int min = (int) Math.min(j, (long) (segment.limit - segment.pos));
                long j2 = (long) min;
                this.size -= j2;
                j -= j2;
                segment.pos += min;
                if (segment.pos == segment.limit) {
                    this.head = segment.pop();
                    SegmentPool.recycle(segment);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final int write(ByteBuffer byteBuffer) throws IOException {
        C52711k.m112240b(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            Segment writableSegment$jvm = writableSegment$jvm(1);
            int min = Math.min(i, 8192 - writableSegment$jvm.limit);
            byteBuffer.get(writableSegment$jvm.data, writableSegment$jvm.limit, min);
            i -= min;
            writableSegment$jvm.limit += min;
        }
        this.size += (long) remaining;
        return remaining;
    }

    public final Buffer writeInt(int i) {
        Segment writableSegment$jvm = writableSegment$jvm(4);
        byte[] bArr = writableSegment$jvm.data;
        int i2 = writableSegment$jvm.limit;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & NormalGiftView.ALPHA_255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & NormalGiftView.ALPHA_255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & NormalGiftView.ALPHA_255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (i & NormalGiftView.ALPHA_255);
        writableSegment$jvm.limit = i6;
        this.size += 4;
        return this;
    }

    public final Buffer writeShort(int i) {
        Segment writableSegment$jvm = writableSegment$jvm(2);
        byte[] bArr = writableSegment$jvm.data;
        int i2 = writableSegment$jvm.limit;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & NormalGiftView.ALPHA_255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i & NormalGiftView.ALPHA_255);
        writableSegment$jvm.limit = i4;
        this.size += 2;
        return this;
    }

    public final byte getByte(long j) {
        Util.checkOffsetAndCount(this.size, j, 1);
        Segment segment = this.head;
        if (segment == null) {
            C52711k.m112234a();
            return null.data[(int) ((((long) null.pos) + j) - -1)];
        } else if (size() - j < j) {
            long size2 = size();
            while (size2 > j) {
                segment = segment.prev;
                if (segment == null) {
                    C52711k.m112234a();
                }
                size2 -= (long) (segment.limit - segment.pos);
            }
            if (segment == null) {
                C52711k.m112234a();
            }
            return segment.data[(int) ((((long) segment.pos) + j) - size2)];
        } else {
            long j2 = 0;
            while (true) {
                long j3 = ((long) (segment.limit - segment.pos)) + j2;
                if (j3 > j) {
                    break;
                }
                segment = segment.next;
                if (segment == null) {
                    C52711k.m112234a();
                }
                j2 = j3;
            }
            if (segment == null) {
                C52711k.m112234a();
            }
            return segment.data[(int) ((((long) segment.pos) + j) - j2)];
        }
    }

    public final byte[] readByteArray(long j) throws EOFException {
        boolean z;
        if (j < 0 || j > 2147483647L) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder("byteCount: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (this.size >= j) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    public final Segment writableSegment$jvm(int i) {
        boolean z;
        if (i <= 0 || i > 8192) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        } else if (this.head == null) {
            Segment take = SegmentPool.take();
            this.head = take;
            take.prev = take;
            take.next = take;
            return take;
        } else {
            Segment segment = this.head;
            if (segment == null) {
                C52711k.m112234a();
            }
            Segment segment2 = segment.prev;
            if (segment2 == null) {
                C52711k.m112234a();
            }
            if (segment2.limit + i > 8192 || !segment2.owner) {
                segment2 = segment2.push(SegmentPool.take());
            }
            return segment2;
        }
    }

    public final Buffer writeHexadecimalUnsignedLong(long j) {
        if (j == 0) {
            return writeByte(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        Segment writableSegment$jvm = writableSegment$jvm(numberOfTrailingZeros);
        byte[] bArr = writableSegment$jvm.data;
        int i = writableSegment$jvm.limit;
        for (int i2 = (writableSegment$jvm.limit + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = DIGITS[(int) (15 & j)];
            j >>>= 4;
        }
        writableSegment$jvm.limit += numberOfTrailingZeros;
        this.size += (long) numberOfTrailingZeros;
        return this;
    }

    public final Buffer writeLong(long j) {
        Segment writableSegment$jvm = writableSegment$jvm(8);
        byte[] bArr = writableSegment$jvm.data;
        int i = writableSegment$jvm.limit;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 56) & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >>> 48) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((j >>> 40) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) ((j >>> 32) & 255));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) ((j >>> 24) & 255));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) ((j >>> 16) & 255));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) ((j >>> 8) & 255));
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((int) (j & 255));
        writableSegment$jvm.limit = i9;
        this.size += 8;
        return this;
    }

    public final Buffer writeUtf8CodePoint(int i) {
        if (i < 128) {
            writeByte(i);
        } else if (i < 2048) {
            writeByte((i >> 6) | 192);
            writeByte((i & 63) | 128);
        } else if (55296 <= i && 57343 >= i) {
            writeByte(63);
        } else if (i < 65536) {
            writeByte((i >> 12) | 224);
            writeByte(((i >> 6) & 63) | 128);
            writeByte((i & 63) | 128);
        } else if (i <= 1114111) {
            writeByte((i >> 18) | 240);
            writeByte(((i >> 12) & 63) | 128);
            writeByte(((i >> 6) & 63) | 128);
            writeByte((i & 63) | 128);
        } else {
            StringBuilder sb = new StringBuilder("Unexpected code point: ");
            sb.append(Integer.toHexString(i));
            throw new IllegalArgumentException(sb.toString());
        }
        return this;
    }

    public final boolean equals(Object obj) {
        Object obj2 = obj;
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Buffer)) {
            return false;
        }
        Buffer buffer = (Buffer) obj2;
        if (this.size != buffer.size) {
            return false;
        }
        if (this.size == 0) {
            return true;
        }
        Segment segment = this.head;
        if (segment == null) {
            C52711k.m112234a();
        }
        Segment segment2 = buffer.head;
        if (segment2 == null) {
            C52711k.m112234a();
        }
        int i = segment.pos;
        Segment segment3 = segment2;
        int i2 = segment2.pos;
        int i3 = i;
        Segment segment4 = segment;
        long j = 0;
        while (j < this.size) {
            long min = (long) Math.min(segment4.limit - i3, segment3.limit - i2);
            long j2 = 0;
            while (j2 < min) {
                int i4 = i3 + 1;
                int i5 = i2 + 1;
                if (segment4.data[i3] != segment3.data[i2]) {
                    return false;
                }
                j2++;
                i3 = i4;
                i2 = i5;
            }
            if (i3 == segment4.limit) {
                segment4 = segment4.next;
                if (segment4 == null) {
                    C52711k.m112234a();
                }
                i3 = segment4.pos;
            }
            if (i2 == segment3.limit) {
                segment3 = segment3.next;
                if (segment3 == null) {
                    C52711k.m112234a();
                }
                i2 = segment3.pos;
            }
            j += min;
        }
        return true;
    }

    public final String readUtf8LineStrict(long j) throws EOFException {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long indexOf = indexOf(10, 0, j2);
            if (indexOf != -1) {
                return readUtf8Line$jvm(indexOf);
            }
            if (j2 < this.size && getByte(j2 - 1) == 13 && getByte(j2) == 10) {
                return readUtf8Line$jvm(j2);
            }
            Buffer buffer = new Buffer();
            copyTo(buffer, 0, Math.min(32, this.size));
            StringBuilder sb = new StringBuilder("\\n not found: limit=");
            sb.append(Math.min(this.size, j));
            sb.append(" content=");
            sb.append(buffer.readByteString().hex());
            sb.append(8230);
            throw new EOFException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("limit < 0: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public final Buffer writeDecimalLong(long j) {
        if (j == 0) {
            return writeByte(48);
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z = true;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j < 100) {
                    if (j >= 10) {
                        i = 2;
                    }
                } else if (j < 1000) {
                    i = 3;
                } else {
                    i = 4;
                }
            } else if (j < 1000000) {
                if (j < LeakDetectorInstaller.MAX_POLL_TIME) {
                    i = 5;
                } else {
                    i = 6;
                }
            } else if (j < 10000000) {
                i = 7;
            } else {
                i = 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                if (j < 1000000000) {
                    i = 9;
                } else {
                    i = 10;
                }
            } else if (j < 100000000000L) {
                i = 11;
            } else {
                i = 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i = 13;
            } else if (j < 100000000000000L) {
                i = 14;
            } else {
                i = 15;
            }
        } else if (j < 100000000000000000L) {
            if (j < 10000000000000000L) {
                i = 16;
            } else {
                i = 17;
            }
        } else if (j < 1000000000000000000L) {
            i = 18;
        } else {
            i = 19;
        }
        if (z) {
            i++;
        }
        Segment writableSegment$jvm = writableSegment$jvm(i);
        byte[] bArr = writableSegment$jvm.data;
        int i2 = writableSegment$jvm.limit + i;
        while (j != 0) {
            i2--;
            bArr[i2] = DIGITS[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        writableSegment$jvm.limit += i;
        this.size += (long) i;
        return this;
    }

    public final long indexOf(byte b, long j) {
        return indexOf(b, j, Long.MAX_VALUE);
    }

    public final boolean rangeEquals(long j, ByteString byteString) {
        C52711k.m112240b(byteString, "bytes");
        return rangeEquals(j, byteString, 0, byteString.size());
    }

    public final void readFully(Buffer buffer, long j) throws EOFException {
        C52711k.m112240b(buffer, "sink");
        if (this.size >= j) {
            buffer.write(this, j);
        } else {
            buffer.write(this, this.size);
            throw new EOFException();
        }
    }

    public final Buffer writeString(String str, Charset charset) {
        C52711k.m112240b(str, "string");
        C52711k.m112240b(charset, "charset");
        return writeString(str, 0, str.length(), charset);
    }

    private final ByteString hmac(String str, ByteString byteString) {
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(byteString.internalArray$jvm(), str));
            Segment segment = this.head;
            if (segment != null) {
                instance.update(segment.data, segment.pos, segment.limit - segment.pos);
                Segment segment2 = segment.next;
                if (segment2 == null) {
                    C52711k.m112234a();
                }
                while (segment2 != segment) {
                    instance.update(segment2.data, segment2.pos, segment2.limit - segment2.pos);
                    segment2 = segment2.next;
                    if (segment2 == null) {
                        C52711k.m112234a();
                    }
                }
            }
            byte[] doFinal = instance.doFinal();
            C52711k.m112236a((Object) doFinal, "mac.doFinal()");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private final <T> T seek(long j, C52682m<? super Segment, ? super Long, ? extends T> mVar) {
        Segment segment = this.head;
        if (segment == null) {
            return mVar.invoke(null, Long.valueOf(-1));
        }
        if (size() - j < j) {
            long size2 = size();
            while (size2 > j) {
                segment = segment.prev;
                if (segment == null) {
                    C52711k.m112234a();
                }
                size2 -= (long) (segment.limit - segment.pos);
            }
            return mVar.invoke(segment, Long.valueOf(size2));
        }
        long j2 = 0;
        while (true) {
            long j3 = ((long) (segment.limit - segment.pos)) + j2;
            if (j3 > j) {
                return mVar.invoke(segment, Long.valueOf(j2));
            }
            segment = segment.next;
            if (segment == null) {
                C52711k.m112234a();
            }
            j2 = j3;
        }
    }

    public final Buffer readFrom(InputStream inputStream, long j) throws IOException {
        boolean z;
        C52711k.m112240b(inputStream, "input");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            readFrom(inputStream, j, false);
            return this;
        }
        StringBuilder sb = new StringBuilder("byteCount < 0: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final Buffer writeTo(OutputStream outputStream, long j) throws IOException {
        C52711k.m112240b(outputStream, "out");
        Util.checkOffsetAndCount(this.size, 0, j);
        Segment segment = this.head;
        while (j > 0) {
            if (segment == null) {
                C52711k.m112234a();
            }
            int min = (int) Math.min(j, (long) (segment.limit - segment.pos));
            outputStream.write(segment.data, segment.pos, min);
            segment.pos += min;
            long j2 = (long) min;
            this.size -= j2;
            j -= j2;
            if (segment.pos == segment.limit) {
                Segment pop = segment.pop();
                this.head = pop;
                SegmentPool.recycle(segment);
                segment = pop;
            }
        }
        return this;
    }

    public final long read(Buffer buffer, long j) {
        boolean z;
        C52711k.m112240b(buffer, "sink");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (this.size == 0) {
            return -1;
        } else {
            if (j > this.size) {
                j = this.size;
            }
            buffer.write(this, j);
            return j;
        }
    }

    public final String readString(long j, Charset charset) throws EOFException {
        boolean z;
        C52711k.m112240b(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder("byteCount: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (this.size < j) {
            throw new EOFException();
        } else if (j == 0) {
            return "";
        } else {
            Segment segment = this.head;
            if (segment == null) {
                C52711k.m112234a();
            }
            if (((long) segment.pos) + j > ((long) segment.limit)) {
                return new String(readByteArray(j), charset);
            }
            int i = (int) j;
            String str = new String(segment.data, segment.pos, i, charset);
            segment.pos += i;
            this.size -= j;
            if (segment.pos == segment.limit) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            }
            return str;
        }
    }

    public final int selectPrefix$jvm(Options options, boolean z) {
        int i;
        boolean z2;
        C52711k.m112240b(options, "options");
        Segment segment = this.head;
        int i2 = -1;
        if (segment != null) {
            byte[] bArr = segment.data;
            int i3 = segment.pos;
            int i4 = segment.limit;
            int[] trie$jvm = options.getTrie$jvm();
            int i5 = i3;
            int i6 = i4;
            int i7 = -1;
            Segment segment2 = segment;
            byte[] bArr2 = bArr;
            int i8 = 0;
            loop0:
            while (true) {
                int i9 = i8 + 1;
                int i10 = trie$jvm[i8];
                int i11 = i9 + 1;
                int i12 = trie$jvm[i9];
                if (i12 != i2) {
                    i7 = i12;
                }
                if (segment2 == null) {
                    break;
                }
                if (i10 < 0) {
                    int i13 = i11 + (i10 * -1);
                    while (true) {
                        int i14 = i5 + 1;
                        int i15 = i11 + 1;
                        if ((bArr2[i5] & 255) != trie$jvm[i11]) {
                            return i7;
                        }
                        if (i15 == i13) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i14 == i6) {
                            if (segment2 == null) {
                                C52711k.m112234a();
                            }
                            Segment segment3 = segment2.next;
                            if (segment3 == null) {
                                C52711k.m112234a();
                            }
                            int i16 = segment3.pos;
                            bArr2 = segment3.data;
                            i6 = segment3.limit;
                            if (segment3 == segment) {
                                if (!z2) {
                                    break loop0;
                                }
                                i14 = i16;
                                segment2 = null;
                            } else {
                                int i17 = i16;
                                segment2 = segment3;
                                i14 = i17;
                            }
                        }
                        if (z2) {
                            i5 = i14;
                            i = trie$jvm[i15];
                            break;
                        }
                        i11 = i15;
                        i5 = i14;
                    }
                } else {
                    int i18 = i5 + 1;
                    byte b = bArr2[i5] & 255;
                    int i19 = i11 + i10;
                    while (i11 != i19) {
                        if (b == trie$jvm[i11]) {
                            i = trie$jvm[i11 + i10];
                            if (i18 == i6) {
                                Segment segment4 = segment2.next;
                                if (segment4 == null) {
                                    C52711k.m112234a();
                                }
                                int i20 = segment4.pos;
                                bArr2 = segment4.data;
                                int i21 = segment4.limit;
                                if (segment4 == segment) {
                                    i5 = i20;
                                    i6 = i21;
                                    segment2 = null;
                                } else {
                                    i5 = i20;
                                    i6 = i21;
                                    segment2 = segment4;
                                }
                            } else {
                                i5 = i18;
                            }
                        } else {
                            i11++;
                        }
                    }
                    return i7;
                }
                if (i >= 0) {
                    return i;
                }
                i8 = -i;
                i2 = -1;
            }
            if (z) {
                return -2;
            }
            return i7;
        } else if (z) {
            return -2;
        } else {
            return -1;
        }
    }

    public final BufferedSink write(Source source, long j) throws IOException {
        C52711k.m112240b(source, "source");
        while (j > 0) {
            long read = source.read(this, j);
            if (read != -1) {
                j -= read;
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    public final long indexOf(ByteString byteString, long j) throws IOException {
        boolean z;
        int i;
        ByteString byteString2 = byteString;
        long j2 = j;
        C52711k.m112240b(byteString2, "bytes");
        boolean z2 = true;
        if (byteString.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j3 = 0;
            if (j2 < 0) {
                z2 = false;
            }
            if (z2) {
                Segment segment = this.head;
                if (segment == null) {
                    return -1;
                }
                if (size() - j2 < j2) {
                    long size2 = size();
                    while (size2 > j2) {
                        segment = segment.prev;
                        if (segment == null) {
                            C52711k.m112234a();
                        }
                        size2 -= (long) (segment.limit - segment.pos);
                    }
                    if (segment == null) {
                        return -1;
                    }
                    byte b = byteString2.getByte(0);
                    int size3 = byteString.size();
                    long j4 = (this.size - ((long) size3)) + 1;
                    Segment segment2 = segment;
                    long j5 = size2;
                    while (j5 < j4) {
                        byte[] bArr = segment2.data;
                        long j6 = j4;
                        int min = (int) Math.min((long) segment2.limit, (((long) segment2.pos) + j4) - j5);
                        for (int i2 = (int) ((((long) segment2.pos) + j2) - j5); i2 < min; i2++) {
                            if (bArr[i2] == b) {
                                if (rangeEquals(segment2, i2 + 1, byteString.internalArray$jvm(), 1, size3)) {
                                    return ((long) (i2 - segment2.pos)) + j5;
                                }
                            }
                        }
                        j2 = ((long) (segment2.limit - segment2.pos)) + j5;
                        segment2 = segment2.next;
                        if (segment2 == null) {
                            C52711k.m112234a();
                        }
                        j5 = j2;
                        j4 = j6;
                    }
                    return -1;
                }
                while (true) {
                    long j7 = ((long) (segment.limit - segment.pos)) + j3;
                    if (j7 > j2) {
                        break;
                    }
                    segment = segment.next;
                    if (segment == null) {
                        C52711k.m112234a();
                    }
                    j3 = j7;
                }
                if (segment == null) {
                    return -1;
                }
                byte b2 = byteString2.getByte(0);
                int size4 = byteString.size();
                long j8 = 1 + (this.size - ((long) size4));
                Segment segment3 = segment;
                while (j3 < j8) {
                    byte[] bArr2 = segment3.data;
                    int min2 = (int) Math.min((long) segment3.limit, (((long) segment3.pos) + j8) - j3);
                    int i3 = (int) ((((long) segment3.pos) + j2) - j3);
                    while (i3 < min2) {
                        if (bArr2[i3] == b2) {
                            i = i3;
                            if (rangeEquals(segment3, i3 + 1, byteString.internalArray$jvm(), 1, size4)) {
                                return ((long) (i - segment3.pos)) + j3;
                            }
                        } else {
                            i = i3;
                        }
                        i3 = i + 1;
                    }
                    j2 = ((long) (segment3.limit - segment3.pos)) + j3;
                    segment3 = segment3.next;
                    if (segment3 == null) {
                        C52711k.m112234a();
                    }
                    j3 = j2;
                }
                return -1;
            }
            StringBuilder sb = new StringBuilder("fromIndex < 0: ");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    public final long indexOfElement(ByteString byteString, long j) {
        boolean z;
        long j2;
        int i;
        int i2;
        C52711k.m112240b(byteString, "targetBytes");
        long j3 = 0;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Segment segment = this.head;
            if (segment == null) {
                return -1;
            }
            if (size() - j < j) {
                j2 = size();
                while (j2 > j) {
                    segment = segment.prev;
                    if (segment == null) {
                        C52711k.m112234a();
                    }
                    j2 -= (long) (segment.limit - segment.pos);
                }
                if (segment == null) {
                    return -1;
                }
                if (byteString.size() == 2) {
                    byte b = byteString.getByte(0);
                    byte b2 = byteString.getByte(1);
                    while (j2 < this.size) {
                        byte[] bArr = segment.data;
                        i2 = (int) ((((long) segment.pos) + j) - j2);
                        int i3 = segment.limit;
                        while (i2 < i3) {
                            byte b3 = bArr[i2];
                            if (!(b3 == b || b3 == b2)) {
                                i2++;
                            }
                        }
                        j = ((long) (segment.limit - segment.pos)) + j2;
                        segment = segment.next;
                        if (segment == null) {
                            C52711k.m112234a();
                        }
                        j2 = j;
                    }
                } else {
                    byte[] internalArray$jvm = byteString.internalArray$jvm();
                    while (j2 < this.size) {
                        byte[] bArr2 = segment.data;
                        i = (int) ((((long) segment.pos) + j) - j2);
                        int i4 = segment.limit;
                        while (i < i4) {
                            byte b4 = bArr2[i];
                            for (byte b5 : internalArray$jvm) {
                                if (b4 == b5) {
                                    return ((long) (i - segment.pos)) + j2;
                                }
                            }
                            i++;
                        }
                        j = ((long) (segment.limit - segment.pos)) + j2;
                        segment = segment.next;
                        if (segment == null) {
                            C52711k.m112234a();
                        }
                        j2 = j;
                    }
                }
                return -1;
            }
            while (true) {
                long j4 = ((long) (segment.limit - segment.pos)) + j3;
                if (j4 > j) {
                    break;
                }
                segment = segment.next;
                if (segment == null) {
                    C52711k.m112234a();
                }
                j3 = j4;
            }
            if (segment == null) {
                return -1;
            }
            if (byteString.size() == 2) {
                byte b6 = byteString.getByte(0);
                byte b7 = byteString.getByte(1);
                while (j2 < this.size) {
                    byte[] bArr3 = segment.data;
                    int i5 = (int) ((((long) segment.pos) + j) - j2);
                    int i6 = segment.limit;
                    while (i2 < i6) {
                        byte b8 = bArr3[i2];
                        if (!(b8 == b6 || b8 == b7)) {
                            i5 = i2 + 1;
                        }
                    }
                    j = ((long) (segment.limit - segment.pos)) + j2;
                    segment = segment.next;
                    if (segment == null) {
                        C52711k.m112234a();
                    }
                    j3 = j;
                }
            } else {
                byte[] internalArray$jvm2 = byteString.internalArray$jvm();
                while (j2 < this.size) {
                    byte[] bArr4 = segment.data;
                    int i7 = (int) ((((long) segment.pos) + j) - j2);
                    int i8 = segment.limit;
                    while (i < i8) {
                        byte b9 = bArr4[i];
                        for (byte b10 : internalArray$jvm2) {
                            if (b9 == b10) {
                                return ((long) (i - segment.pos)) + j2;
                            }
                        }
                        i7 = i + 1;
                    }
                    j = ((long) (segment.limit - segment.pos)) + j2;
                    segment = segment.next;
                    if (segment == null) {
                        C52711k.m112234a();
                    }
                    j3 = j;
                }
            }
            return -1;
            return ((long) (i2 - segment.pos)) + j2;
        }
        StringBuilder sb = new StringBuilder("fromIndex < 0: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void write(Buffer buffer, long j) {
        boolean z;
        Segment segment;
        int i;
        C52711k.m112240b(buffer, "source");
        if (buffer != this) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Util.checkOffsetAndCount(buffer.size, 0, j);
            while (j > 0) {
                Segment segment2 = buffer.head;
                if (segment2 == null) {
                    C52711k.m112234a();
                }
                int i2 = segment2.limit;
                Segment segment3 = buffer.head;
                if (segment3 == null) {
                    C52711k.m112234a();
                }
                if (j < ((long) (i2 - segment3.pos))) {
                    if (this.head != null) {
                        Segment segment4 = this.head;
                        if (segment4 == null) {
                            C52711k.m112234a();
                        }
                        segment = segment4.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        long j2 = ((long) segment.limit) + j;
                        if (segment.shared) {
                            i = 0;
                        } else {
                            i = segment.pos;
                        }
                        if (j2 - ((long) i) <= 8192) {
                            Segment segment5 = buffer.head;
                            if (segment5 == null) {
                                C52711k.m112234a();
                            }
                            segment5.writeTo(segment, (int) j);
                            buffer.size -= j;
                            this.size += j;
                            return;
                        }
                    }
                    Segment segment6 = buffer.head;
                    if (segment6 == null) {
                        C52711k.m112234a();
                    }
                    buffer.head = segment6.split((int) j);
                }
                Segment segment7 = buffer.head;
                if (segment7 == null) {
                    C52711k.m112234a();
                }
                long j3 = (long) (segment7.limit - segment7.pos);
                buffer.head = segment7.pop();
                if (this.head == null) {
                    this.head = segment7;
                    segment7.prev = segment7;
                    segment7.next = segment7.prev;
                } else {
                    Segment segment8 = this.head;
                    if (segment8 == null) {
                        C52711k.m112234a();
                    }
                    Segment segment9 = segment8.prev;
                    if (segment9 == null) {
                        C52711k.m112234a();
                    }
                    segment9.push(segment7).compact();
                }
                buffer.size -= j3;
                this.size += j3;
                j -= j3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    private final void readFrom(InputStream inputStream, long j, boolean z) throws IOException {
        while (true) {
            if (j > 0 || z) {
                Segment writableSegment$jvm = writableSegment$jvm(1);
                int read = inputStream.read(writableSegment$jvm.data, writableSegment$jvm.limit, (int) Math.min(j, (long) (8192 - writableSegment$jvm.limit)));
                if (read != -1) {
                    writableSegment$jvm.limit += read;
                    long j2 = (long) read;
                    this.size += j2;
                    j -= j2;
                } else if (!z) {
                    throw new EOFException();
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final Buffer copyTo(OutputStream outputStream, long j, long j2) throws IOException {
        C52711k.m112240b(outputStream, "out");
        Util.checkOffsetAndCount(this.size, j, j2);
        if (j2 == 0) {
            return this;
        }
        Segment segment = this.head;
        while (true) {
            if (segment == null) {
                C52711k.m112234a();
            }
            if (j < ((long) (segment.limit - segment.pos))) {
                break;
            }
            j -= (long) (segment.limit - segment.pos);
            segment = segment.next;
        }
        while (j2 > 0) {
            if (segment == null) {
                C52711k.m112234a();
            }
            int i = (int) (((long) segment.pos) + j);
            int min = (int) Math.min((long) (segment.limit - i), j2);
            outputStream.write(segment.data, i, min);
            j2 -= (long) min;
            segment = segment.next;
            j = 0;
        }
        return this;
    }

    public final int read(byte[] bArr, int i, int i2) {
        C52711k.m112240b(bArr, "sink");
        Util.checkOffsetAndCount((long) bArr.length, (long) i, (long) i2);
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(i2, segment.limit - segment.pos);
        System.arraycopy(segment.data, segment.pos, bArr, i, min);
        segment.pos += min;
        this.size -= (long) min;
        if (segment.pos == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return min;
    }

    public final Buffer write(byte[] bArr, int i, int i2) {
        C52711k.m112240b(bArr, "source");
        long j = (long) i2;
        Util.checkOffsetAndCount((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            Segment writableSegment$jvm = writableSegment$jvm(1);
            int min = Math.min(i3 - i, 8192 - writableSegment$jvm.limit);
            System.arraycopy(bArr, i, writableSegment$jvm.data, writableSegment$jvm.limit, min);
            i += min;
            writableSegment$jvm.limit += min;
        }
        this.size += j;
        return this;
    }

    public final Buffer copyTo(Buffer buffer, long j, long j2) {
        C52711k.m112240b(buffer, "out");
        Util.checkOffsetAndCount(this.size, j, j2);
        if (j2 == 0) {
            return this;
        }
        buffer.size += j2;
        Segment segment = this.head;
        while (true) {
            if (segment == null) {
                C52711k.m112234a();
            }
            if (j < ((long) (segment.limit - segment.pos))) {
                break;
            }
            j -= (long) (segment.limit - segment.pos);
            segment = segment.next;
        }
        while (j2 > 0) {
            if (segment == null) {
                C52711k.m112234a();
            }
            Segment sharedCopy = segment.sharedCopy();
            sharedCopy.pos += (int) j;
            sharedCopy.limit = Math.min(sharedCopy.pos + ((int) j2), sharedCopy.limit);
            if (buffer.head == null) {
                sharedCopy.prev = sharedCopy;
                sharedCopy.next = sharedCopy.prev;
                buffer.head = sharedCopy.next;
            } else {
                Segment segment2 = buffer.head;
                if (segment2 == null) {
                    C52711k.m112234a();
                }
                Segment segment3 = segment2.prev;
                if (segment3 == null) {
                    C52711k.m112234a();
                }
                segment3.push(sharedCopy);
            }
            j2 -= (long) (sharedCopy.limit - sharedCopy.pos);
            segment = segment.next;
            j = 0;
        }
        return this;
    }

    public final long indexOf(byte b, long j, long j2) {
        boolean z;
        long j3;
        int i;
        long j4 = 0;
        if (0 <= j && j2 >= j) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j2 > this.size) {
                j2 = this.size;
            }
            if (j == j2) {
                return -1;
            }
            Segment segment = this.head;
            if (segment == null) {
                return -1;
            }
            if (size() - j < j) {
                j3 = size();
                while (j3 > j) {
                    segment = segment.prev;
                    if (segment == null) {
                        C52711k.m112234a();
                    }
                    j3 -= (long) (segment.limit - segment.pos);
                }
                if (segment == null) {
                    return -1;
                }
                while (j3 < j2) {
                    byte[] bArr = segment.data;
                    int min = (int) Math.min((long) segment.limit, (((long) segment.pos) + j2) - j3);
                    i = (int) ((((long) segment.pos) + j) - j3);
                    while (i < min) {
                        if (bArr[i] != b) {
                            i++;
                        }
                    }
                    j = ((long) (segment.limit - segment.pos)) + j3;
                    segment = segment.next;
                    if (segment == null) {
                        C52711k.m112234a();
                    }
                    j3 = j;
                }
                return -1;
            }
            while (true) {
                long j5 = ((long) (segment.limit - segment.pos)) + j4;
                if (j5 > j) {
                    break;
                }
                segment = segment.next;
                if (segment == null) {
                    C52711k.m112234a();
                }
                j4 = j5;
            }
            if (segment == null) {
                return -1;
            }
            while (j3 < j2) {
                byte[] bArr2 = segment.data;
                int min2 = (int) Math.min((long) segment.limit, (((long) segment.pos) + j2) - j3);
                int i2 = (int) ((((long) segment.pos) + j) - j3);
                while (i < min2) {
                    if (bArr2[i] != b) {
                        i2 = i + 1;
                    }
                }
                j = ((long) (segment.limit - segment.pos)) + j3;
                segment = segment.next;
                if (segment == null) {
                    C52711k.m112234a();
                }
                j4 = j;
            }
            return -1;
            return ((long) (i - segment.pos)) + j3;
        }
        StringBuilder sb = new StringBuilder("size=");
        sb.append(this.size);
        sb.append(" fromIndex=");
        sb.append(j);
        sb.append(" toIndex=");
        sb.append(j2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final Buffer writeUtf8(String str, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        char c;
        C52711k.m112240b(str, "string");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 <= str.length()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    while (i < i2) {
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            Segment writableSegment$jvm = writableSegment$jvm(1);
                            byte[] bArr = writableSegment$jvm.data;
                            int i3 = writableSegment$jvm.limit - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                            while (true) {
                                i = i4;
                                if (i >= min) {
                                    break;
                                }
                                char charAt2 = str.charAt(i);
                                if (charAt2 >= 128) {
                                    break;
                                }
                                i4 = i + 1;
                                bArr[i + i3] = (byte) charAt2;
                            }
                            int i5 = (i3 + i) - writableSegment$jvm.limit;
                            writableSegment$jvm.limit += i5;
                            this.size += (long) i5;
                        } else if (charAt < 2048) {
                            writeByte((charAt >> 6) | 192);
                            writeByte((int) (charAt & '?') | 128);
                            i++;
                        } else if (charAt < 55296 || charAt > 57343) {
                            writeByte((charAt >> 12) | 224);
                            writeByte(((charAt >> 6) & 63) | 128);
                            writeByte((int) (charAt & '?') | 128);
                            i++;
                        } else {
                            int i6 = i + 1;
                            if (i6 < i2) {
                                c = str.charAt(i6);
                            } else {
                                c = 0;
                            }
                            if (charAt > 56319 || 56320 > c || 57343 < c) {
                                writeByte(63);
                                i = i6;
                            } else {
                                int i7 = (((charAt & 10239) << 10) | (9215 & c)) + 0;
                                writeByte((i7 >> 18) | 240);
                                writeByte(((i7 >> 12) & 63) | 128);
                                writeByte(((i7 >> 6) & 63) | 128);
                                writeByte((i7 & 63) | 128);
                                i += 2;
                            }
                        }
                    }
                    return this;
                }
                StringBuilder sb = new StringBuilder("endIndex > string.length: ");
                sb.append(i2);
                sb.append(" > ");
                sb.append(str.length());
                throw new IllegalArgumentException(sb.toString().toString());
            }
            StringBuilder sb2 = new StringBuilder("endIndex < beginIndex: ");
            sb2.append(i2);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        StringBuilder sb3 = new StringBuilder("beginIndex < 0: ");
        sb3.append(i);
        throw new IllegalArgumentException(sb3.toString().toString());
    }

    public static /* synthetic */ UnsafeCursor readAndWriteUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i, Object obj) {
        if ((i & 1) != 0) {
            unsafeCursor = new UnsafeCursor();
        }
        return buffer.readAndWriteUnsafe(unsafeCursor);
    }

    public static /* synthetic */ UnsafeCursor readUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i, Object obj) {
        if ((i & 1) != 0) {
            unsafeCursor = new UnsafeCursor();
        }
        return buffer.readUnsafe(unsafeCursor);
    }

    public final boolean rangeEquals(long j, ByteString byteString, int i, int i2) {
        C52711k.m112240b(byteString, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || this.size - j < ((long) i2) || byteString.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (getByte(((long) i3) + j) != byteString.getByte(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public final Buffer writeString(String str, int i, int i2, Charset charset) {
        boolean z;
        boolean z2;
        C52711k.m112240b(str, "string");
        C52711k.m112240b(charset, "charset");
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 > str.length()) {
                    z3 = false;
                }
                if (!z3) {
                    StringBuilder sb = new StringBuilder("endIndex > string.length: ");
                    sb.append(i2);
                    sb.append(" > ");
                    sb.append(str.length());
                    throw new IllegalArgumentException(sb.toString().toString());
                } else if (C52711k.m112239a((Object) charset, (Object) C52808d.f131043a)) {
                    return writeUtf8(str, i, i2);
                } else {
                    String substring = str.substring(i, i2);
                    C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (substring != null) {
                        byte[] bytes = substring.getBytes(charset);
                        C52711k.m112236a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                        return write(bytes, 0, bytes.length);
                    }
                    throw new C52857u("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                StringBuilder sb2 = new StringBuilder("endIndex < beginIndex: ");
                sb2.append(i2);
                sb2.append(" < ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        } else {
            StringBuilder sb3 = new StringBuilder("beginIndex < 0: ");
            sb3.append(i);
            throw new IllegalArgumentException(sb3.toString().toString());
        }
    }

    public static /* synthetic */ int selectPrefix$jvm$default(Buffer buffer, Options options, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return buffer.selectPrefix$jvm(options, z);
    }

    public static /* synthetic */ Buffer writeTo$default(Buffer buffer, OutputStream outputStream, long j, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = buffer.size;
        }
        return buffer.writeTo(outputStream, j);
    }

    private final boolean rangeEquals(Segment segment, int i, byte[] bArr, int i2, int i3) {
        int i4 = segment.limit;
        byte[] bArr2 = segment.data;
        while (i2 < i3) {
            if (i == i4) {
                segment = segment.next;
                if (segment == null) {
                    C52711k.m112234a();
                }
                byte[] bArr3 = segment.data;
                int i5 = segment.pos;
                bArr2 = bArr3;
                i = i5;
                i4 = segment.limit;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, OutputStream outputStream, long j, long j2, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = buffer.size - j3;
        }
        return buffer.copyTo(outputStream, j3, j2);
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = buffer.size - j3;
        }
        return buffer.copyTo(buffer2, j3, j2);
    }
}
