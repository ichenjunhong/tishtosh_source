package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import okio.internal.ByteStringKt;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52808d;

public class ByteString implements Serializable, Comparable<ByteString> {
    public static final Companion Companion = new Companion(null);
    public static final ByteString EMPTY = ByteStringKt.getCOMMON_EMPTY();
    public static final char[] HEX_DIGITS = ByteStringKt.getCOMMON_HEX_DIGITS();
    private static final long serialVersionUID = 1;
    private final byte[] data;
    private transient int hashCode;
    private transient String utf8;

    public static final class Companion {
        private Companion() {
        }

        public final char[] getHEX_DIGITS$jvm() {
            return ByteString.HEX_DIGITS;
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }

        /* renamed from: -deprecated_decodeBase64 reason: not valid java name */
        public final ByteString m114633deprecated_decodeBase64(String str) {
            C52711k.m112240b(str, "string");
            return decodeBase64(str);
        }

        /* renamed from: -deprecated_decodeHex reason: not valid java name */
        public final ByteString m114634deprecated_decodeHex(String str) {
            C52711k.m112240b(str, "string");
            return decodeHex(str);
        }

        /* renamed from: -deprecated_encodeUtf8 reason: not valid java name */
        public final ByteString m114636deprecated_encodeUtf8(String str) {
            C52711k.m112240b(str, "string");
            return encodeUtf8(str);
        }

        /* renamed from: -deprecated_of reason: not valid java name */
        public final ByteString m114637deprecated_of(ByteBuffer byteBuffer) {
            C52711k.m112240b(byteBuffer, "buffer");
            return mo111882of(byteBuffer);
        }

        public final ByteString decodeBase64(String str) {
            C52711k.m112240b(str, "$receiver");
            return ByteStringKt.commonDecodeBase64(str);
        }

        public final ByteString decodeHex(String str) {
            C52711k.m112240b(str, "$receiver");
            return ByteStringKt.commonDecodeHex(str);
        }

        public final ByteString encodeUtf8(String str) {
            C52711k.m112240b(str, "$receiver");
            return ByteStringKt.commonEncodeUtf8(str);
        }

        /* renamed from: of */
        public final ByteString mo111883of(byte... bArr) {
            C52711k.m112240b(bArr, "data");
            return ByteStringKt.commonOf(bArr);
        }

        /* renamed from: of */
        public final ByteString mo111882of(ByteBuffer byteBuffer) {
            C52711k.m112240b(byteBuffer, "$receiver");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new ByteString(bArr);
        }

        /* renamed from: -deprecated_read reason: not valid java name */
        public final ByteString m114639deprecated_read(InputStream inputStream, int i) {
            C52711k.m112240b(inputStream, "inputstream");
            return read(inputStream, i);
        }

        /* renamed from: -deprecated_encodeString reason: not valid java name */
        public final ByteString m114635deprecated_encodeString(String str, Charset charset) {
            C52711k.m112240b(str, "string");
            C52711k.m112240b(charset, "charset");
            return encodeString(str, charset);
        }

        public final ByteString encodeString(String str, Charset charset) {
            C52711k.m112240b(str, "$receiver");
            C52711k.m112240b(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            C52711k.m112236a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            return new ByteString(bytes);
        }

        public final ByteString read(InputStream inputStream, int i) throws IOException {
            boolean z;
            C52711k.m112240b(inputStream, "$receiver");
            int i2 = 0;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr = new byte[i];
                while (i2 < i) {
                    int read = inputStream.read(bArr, i2, i - i2);
                    if (read != -1) {
                        i2 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return new ByteString(bArr);
            }
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString().toString());
        }

        /* renamed from: -deprecated_of reason: not valid java name */
        public final ByteString m114638deprecated_of(byte[] bArr, int i, int i2) {
            C52711k.m112240b(bArr, "array");
            return mo111884of(bArr, i, i2);
        }

        /* renamed from: of */
        public final ByteString mo111884of(byte[] bArr, int i, int i2) {
            C52711k.m112240b(bArr, "$receiver");
            Util.checkOffsetAndCount((long) bArr.length, (long) i, (long) i2);
            byte[] bArr2 = new byte[i2];
            Platform.arraycopy(bArr, i, bArr2, 0, i2);
            return new ByteString(bArr2);
        }

        public static /* synthetic */ ByteString encodeString$default(Companion companion, String str, Charset charset, int i, Object obj) {
            if ((i & 1) != 0) {
                charset = C52808d.f131043a;
            }
            return companion.encodeString(str, charset);
        }

        public static /* synthetic */ ByteString of$default(Companion companion, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = bArr.length;
            }
            return companion.mo111884of(bArr, i, i2);
        }
    }

    public static final ByteString decodeBase64(String str) {
        return Companion.decodeBase64(str);
    }

    public static final ByteString decodeHex(String str) {
        return Companion.decodeHex(str);
    }

    public static final ByteString encodeString(String str, Charset charset) {
        return Companion.encodeString(str, charset);
    }

    public static final ByteString encodeUtf8(String str) {
        return Companion.encodeUtf8(str);
    }

    /* renamed from: of */
    public static final ByteString m114276of(ByteBuffer byteBuffer) {
        return Companion.mo111882of(byteBuffer);
    }

    /* renamed from: of */
    public static final ByteString m114277of(byte... bArr) {
        return Companion.mo111883of(bArr);
    }

    /* renamed from: of */
    public static final ByteString m114278of(byte[] bArr, int i, int i2) {
        return Companion.mo111884of(bArr, i, i2);
    }

    public static final ByteString read(InputStream inputStream, int i) throws IOException {
        return Companion.read(inputStream, i);
    }

    public final byte[] getData$jvm() {
        return this.data;
    }

    public final int getHashCode$jvm() {
        return this.hashCode;
    }

    public final String getUtf8$jvm() {
        return this.utf8;
    }

    public final int indexOf(ByteString byteString) {
        return indexOf$default(this, byteString, 0, 2, (Object) null);
    }

    public int indexOf(byte[] bArr) {
        return indexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public final int lastIndexOf(ByteString byteString) {
        return lastIndexOf$default(this, byteString, 0, 2, (Object) null);
    }

    public int lastIndexOf(byte[] bArr) {
        return lastIndexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public ByteString substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    public ByteString substring(int i) {
        return substring$default(this, i, 0, 2, null);
    }

    /* renamed from: -deprecated_size reason: not valid java name */
    public final int m114632deprecated_size() {
        return size();
    }

    public String base64() {
        return ByteStringKt.commonBase64(this);
    }

    public String base64Url() {
        return ByteStringKt.commonBase64Url(this);
    }

    public int getSize$jvm() {
        return ByteStringKt.commonGetSize(this);
    }

    public int hashCode() {
        return ByteStringKt.commonHashCode(this);
    }

    public String hex() {
        return ByteStringKt.commonHex(this);
    }

    public byte[] internalArray$jvm() {
        return ByteStringKt.commonInternalArray(this);
    }

    public ByteString md5() {
        return digest("MD5");
    }

    public ByteString sha1() {
        return digest("SHA-1");
    }

    public ByteString sha256() {
        return digest("SHA-256");
    }

    public ByteString sha512() {
        return digest("SHA-512");
    }

    public final int size() {
        return getSize$jvm();
    }

    public ByteString toAsciiLowercase() {
        return ByteStringKt.commonToAsciiLowercase(this);
    }

    public ByteString toAsciiUppercase() {
        return ByteStringKt.commonToAsciiUppercase(this);
    }

    public byte[] toByteArray() {
        return ByteStringKt.commonToByteArray(this);
    }

    public String toString() {
        return ByteStringKt.commonToString(this);
    }

    public String utf8() {
        return ByteStringKt.commonUtf8(this);
    }

    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        C52711k.m112236a((Object) asReadOnlyBuffer, "ByteBuffer.wrap(data).asReadOnlyBuffer()");
        return asReadOnlyBuffer;
    }

    public final void setHashCode$jvm(int i) {
        this.hashCode = i;
    }

    public final void setUtf8$jvm(String str) {
        this.utf8 = str;
    }

    /* renamed from: -deprecated_getByte reason: not valid java name */
    public final byte m114631deprecated_getByte(int i) {
        return getByte(i);
    }

    public boolean equals(Object obj) {
        return ByteStringKt.commonEquals(this, obj);
    }

    public final byte getByte(int i) {
        return internalGet$jvm(i);
    }

    public byte internalGet$jvm(int i) {
        return ByteStringKt.commonGetByte(this, i);
    }

    public ByteString(byte[] bArr) {
        C52711k.m112240b(bArr, "data");
        this.data = bArr;
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    public int compareTo(ByteString byteString) {
        C52711k.m112240b(byteString, "other");
        return ByteStringKt.commonCompareTo(this, byteString);
    }

    public final boolean endsWith(ByteString byteString) {
        C52711k.m112240b(byteString, "suffix");
        return ByteStringKt.commonEndsWith(this, byteString);
    }

    public ByteString hmacSha1(ByteString byteString) {
        C52711k.m112240b(byteString, "key");
        return hmac("HmacSHA1", byteString);
    }

    public ByteString hmacSha256(ByteString byteString) {
        C52711k.m112240b(byteString, "key");
        return hmac("HmacSHA256", byteString);
    }

    public ByteString hmacSha512(ByteString byteString) {
        C52711k.m112240b(byteString, "key");
        return hmac("HmacSHA512", byteString);
    }

    public final boolean startsWith(ByteString byteString) {
        C52711k.m112240b(byteString, "prefix");
        return ByteStringKt.commonStartsWith(this, byteString);
    }

    public String string(Charset charset) {
        C52711k.m112240b(charset, "charset");
        return new String(this.data, charset);
    }

    public void write(OutputStream outputStream) throws IOException {
        C52711k.m112240b(outputStream, "out");
        outputStream.write(this.data);
    }

    public void write$jvm(Buffer buffer) {
        C52711k.m112240b(buffer, "buffer");
        buffer.write(this.data, 0, this.data.length);
    }

    private final ByteString digest(String str) {
        byte[] digest = MessageDigest.getInstance(str).digest(this.data);
        C52711k.m112236a((Object) digest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new ByteString(digest);
    }

    public final boolean endsWith(byte[] bArr) {
        C52711k.m112240b(bArr, "suffix");
        return ByteStringKt.commonEndsWith(this, bArr);
    }

    public final boolean startsWith(byte[] bArr) {
        C52711k.m112240b(bArr, "prefix");
        return ByteStringKt.commonStartsWith(this, bArr);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        ByteString read = Companion.read(objectInputStream, objectInputStream.readInt());
        Field declaredField = ByteString.class.getDeclaredField("data");
        C52711k.m112236a((Object) declaredField, "field");
        declaredField.setAccessible(true);
        declaredField.set(this, read.data);
    }

    public final int indexOf(ByteString byteString, int i) {
        C52711k.m112240b(byteString, "other");
        return indexOf(byteString.internalArray$jvm(), i);
    }

    public final int lastIndexOf(ByteString byteString, int i) {
        C52711k.m112240b(byteString, "other");
        return lastIndexOf(byteString.internalArray$jvm(), i);
    }

    public ByteString substring(int i, int i2) {
        return ByteStringKt.commonSubstring(this, i, i2);
    }

    private final ByteString hmac(String str, ByteString byteString) {
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(byteString.toByteArray(), str));
            byte[] doFinal = instance.doFinal(this.data);
            C52711k.m112236a((Object) doFinal, "mac.doFinal(data)");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public int indexOf(byte[] bArr, int i) {
        C52711k.m112240b(bArr, "other");
        return ByteStringKt.commonIndexOf(this, bArr, i);
    }

    public int lastIndexOf(byte[] bArr, int i) {
        C52711k.m112240b(bArr, "other");
        for (int min = Math.min(i, this.data.length - bArr.length); min >= 0; min--) {
            if (Util.arrayRangeEquals(this.data, min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean rangeEquals(int i, ByteString byteString, int i2, int i3) {
        C52711k.m112240b(byteString, "other");
        return ByteStringKt.commonRangeEquals(this, i, byteString, i2, i3);
    }

    public boolean rangeEquals(int i, byte[] bArr, int i2, int i3) {
        C52711k.m112240b(bArr, "other");
        return ByteStringKt.commonRangeEquals(this, i, bArr, i2, i3);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, ByteString byteString2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return byteString.indexOf(byteString2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, ByteString byteString2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = byteString.size();
            }
            return byteString.lastIndexOf(byteString2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    public static /* synthetic */ ByteString substring$default(ByteString byteString, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = byteString.size();
            }
            return byteString.substring(i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return byteString.indexOf(bArr, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = byteString.size();
            }
            return byteString.lastIndexOf(bArr, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }
}
