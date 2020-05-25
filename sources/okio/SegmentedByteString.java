package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

public final class SegmentedByteString extends ByteString {
    private final transient int[] directory;
    private final transient byte[][] segments;

    public final int[] getDirectory() {
        return this.directory;
    }

    public final byte[][] getSegments() {
        return this.segments;
    }

    public final byte[] internalArray$jvm() {
        return toByteArray();
    }

    private final ByteString toByteString() {
        return new ByteString(toByteArray());
    }

    public final ByteBuffer asByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    public final String base64() {
        return toByteString().base64();
    }

    public final String base64Url() {
        return toByteString().base64Url();
    }

    public final int getSize$jvm() {
        return this.directory[((Object[]) this.segments).length - 1];
    }

    public final String hex() {
        return toByteString().hex();
    }

    public final ByteString md5() {
        return toByteString().md5();
    }

    public final ByteString sha1() {
        return toByteString().sha1();
    }

    public final ByteString sha256() {
        return toByteString().sha256();
    }

    public final ByteString sha512() {
        return toByteString().sha512();
    }

    public final ByteString toAsciiLowercase() {
        return toByteString().toAsciiLowercase();
    }

    public final ByteString toAsciiUppercase() {
        return toByteString().toAsciiUppercase();
    }

    public final String toString() {
        return toByteString().toString();
    }

    public final String utf8() {
        return toByteString().utf8();
    }

    private final Object writeReplace() {
        ByteString byteString = toByteString();
        if (byteString != null) {
            return byteString;
        }
        throw new C52857u("null cannot be cast to non-null type java.lang.Object");
    }

    public final int hashCode() {
        int hashCode$jvm = getHashCode$jvm();
        if (hashCode$jvm != 0) {
            return hashCode$jvm;
        }
        int length = ((Object[]) this.segments).length;
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        while (i < length) {
            byte[] bArr = this.segments[i];
            int i4 = this.directory[length + i];
            int i5 = this.directory[i];
            int i6 = (i5 - i2) + i4;
            while (i4 < i6) {
                i3 = (i3 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i2 = i5;
        }
        setHashCode$jvm(i3);
        return i3;
    }

    public final byte[] toByteArray() {
        byte[] bArr = new byte[this.directory[((Object[]) this.segments).length - 1]];
        int length = ((Object[]) this.segments).length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = this.directory[length + i];
            int i4 = this.directory[i];
            Platform.arraycopy(this.segments[i], i3, bArr, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr;
    }

    public final ByteString hmacSha1(ByteString byteString) {
        C52711k.m112240b(byteString, "key");
        return toByteString().hmacSha1(byteString);
    }

    public final ByteString hmacSha256(ByteString byteString) {
        C52711k.m112240b(byteString, "key");
        return toByteString().hmacSha256(byteString);
    }

    public final ByteString hmacSha512(ByteString byteString) {
        C52711k.m112240b(byteString, "key");
        return toByteString().hmacSha512(byteString);
    }

    public final String string(Charset charset) {
        C52711k.m112240b(charset, "charset");
        return toByteString().string(charset);
    }

    private final int segment(int i) {
        int binarySearch = Arrays.binarySearch(this.directory, 0, ((Object[]) this.segments).length, i + 1);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return binarySearch ^ -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (byteString.size() != size() || !rangeEquals(0, byteString, 0, size())) {
            return false;
        }
        return true;
    }

    public final byte internalGet$jvm(int i) {
        int i2;
        Util.checkOffsetAndCount((long) this.directory[((Object[]) this.segments).length - 1], (long) i, 1);
        int segment = segment(i);
        if (segment == 0) {
            i2 = 0;
        } else {
            i2 = this.directory[segment - 1];
        }
        return this.segments[segment][(i - i2) + this.directory[((Object[]) this.segments).length + segment]];
    }

    public final void write(OutputStream outputStream) throws IOException {
        C52711k.m112240b(outputStream, "out");
        int length = ((Object[]) this.segments).length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = this.directory[length + i];
            int i4 = this.directory[i];
            outputStream.write(this.segments[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
    }

    public final void write$jvm(Buffer buffer) {
        C52711k.m112240b(buffer, "buffer");
        int length = ((Object[]) this.segments).length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = this.directory[length + i];
            int i4 = this.directory[i];
            Segment segment = new Segment(this.segments[i], i3, (i3 + i4) - i2, true, false);
            if (buffer.head == null) {
                segment.prev = segment;
                segment.next = segment.prev;
                buffer.head = segment.next;
            } else {
                Segment segment2 = buffer.head;
                if (segment2 == null) {
                    C52711k.m112234a();
                }
                Segment segment3 = segment2.prev;
                if (segment3 == null) {
                    C52711k.m112234a();
                }
                segment3.push(segment);
            }
            i++;
            i2 = i4;
        }
        buffer.setSize$jvm(buffer.size() + ((long) i2));
    }

    public final int indexOf(byte[] bArr, int i) {
        C52711k.m112240b(bArr, "other");
        return toByteString().indexOf(bArr, i);
    }

    public final int lastIndexOf(byte[] bArr, int i) {
        C52711k.m112240b(bArr, "other");
        return toByteString().lastIndexOf(bArr, i);
    }

    public final ByteString substring(int i, int i2) {
        return toByteString().substring(i, i2);
    }

    public SegmentedByteString(Buffer buffer, int i) {
        C52711k.m112240b(buffer, "buffer");
        super(ByteString.EMPTY.getData$jvm());
        Util.checkOffsetAndCount(buffer.size(), 0, (long) i);
        int i2 = 0;
        Segment segment = buffer.head;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (segment == null) {
                C52711k.m112234a();
            }
            if (segment.limit != segment.pos) {
                i3 += segment.limit - segment.pos;
                i4++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4][];
        this.directory = new int[(i4 * 2)];
        Segment segment2 = buffer.head;
        int i5 = 0;
        while (i2 < i) {
            if (segment2 == null) {
                C52711k.m112234a();
            }
            bArr[i5] = segment2.data;
            i2 += segment2.limit - segment2.pos;
            if (i2 > i) {
                i2 = i;
            }
            this.directory[i5] = i2;
            this.directory[((Object[]) bArr).length + i5] = segment2.pos;
            segment2.shared = true;
            i5++;
            segment2 = segment2.next;
        }
        this.segments = bArr;
    }

    public final boolean rangeEquals(int i, ByteString byteString, int i2, int i3) {
        int i4;
        C52711k.m112240b(byteString, "other");
        if (i < 0 || i > size() - i3) {
            return false;
        }
        int segment = segment(i);
        while (i3 > 0) {
            if (segment == 0) {
                i4 = 0;
            } else {
                i4 = this.directory[segment - 1];
            }
            int min = Math.min(i3, ((this.directory[segment] - i4) + i4) - i);
            if (!byteString.rangeEquals(i2, this.segments[segment], (i - i4) + this.directory[((Object[]) this.segments).length + segment], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            segment++;
        }
        return true;
    }

    public final boolean rangeEquals(int i, byte[] bArr, int i2, int i3) {
        int i4;
        C52711k.m112240b(bArr, "other");
        if (i < 0 || i > size() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int segment = segment(i);
        while (i3 > 0) {
            if (segment == 0) {
                i4 = 0;
            } else {
                i4 = this.directory[segment - 1];
            }
            int min = Math.min(i3, ((this.directory[segment] - i4) + i4) - i);
            if (!Util.arrayRangeEquals(this.segments[segment], (i - i4) + this.directory[((Object[]) this.segments).length + segment], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            segment++;
        }
        return true;
    }
}
