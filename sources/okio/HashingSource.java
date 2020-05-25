package okio;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

public final class HashingSource extends ForwardingSource {
    public static final Companion Companion = new Companion(null);
    private final Mac mac;
    private final MessageDigest messageDigest;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }

        public final HashingSource md5(Source source) {
            C52711k.m112240b(source, "source");
            return new HashingSource(source, "MD5");
        }

        public final HashingSource sha1(Source source) {
            C52711k.m112240b(source, "source");
            return new HashingSource(source, "SHA-1");
        }

        public final HashingSource sha256(Source source) {
            C52711k.m112240b(source, "source");
            return new HashingSource(source, "SHA-256");
        }

        public final HashingSource sha512(Source source) {
            C52711k.m112240b(source, "source");
            return new HashingSource(source, "SHA-512");
        }

        public final HashingSource hmacSha1(Source source, ByteString byteString) {
            C52711k.m112240b(source, "source");
            C52711k.m112240b(byteString, "key");
            return new HashingSource(source, byteString, "HmacSHA1");
        }

        public final HashingSource hmacSha256(Source source, ByteString byteString) {
            C52711k.m112240b(source, "source");
            C52711k.m112240b(byteString, "key");
            return new HashingSource(source, byteString, "HmacSHA256");
        }

        public final HashingSource hmacSha512(Source source, ByteString byteString) {
            C52711k.m112240b(source, "source");
            C52711k.m112240b(byteString, "key");
            return new HashingSource(source, byteString, "HmacSHA512");
        }
    }

    public static final HashingSource hmacSha1(Source source, ByteString byteString) {
        return Companion.hmacSha1(source, byteString);
    }

    public static final HashingSource hmacSha256(Source source, ByteString byteString) {
        return Companion.hmacSha256(source, byteString);
    }

    public static final HashingSource hmacSha512(Source source, ByteString byteString) {
        return Companion.hmacSha512(source, byteString);
    }

    public static final HashingSource md5(Source source) {
        return Companion.md5(source);
    }

    public static final HashingSource sha1(Source source) {
        return Companion.sha1(source);
    }

    public static final HashingSource sha256(Source source) {
        return Companion.sha256(source);
    }

    public static final HashingSource sha512(Source source) {
        return Companion.sha512(source);
    }

    /* renamed from: -deprecated_hash reason: not valid java name */
    public final ByteString m114644deprecated_hash() {
        return hash();
    }

    public final ByteString hash() {
        byte[] bArr;
        if (this.messageDigest != null) {
            bArr = this.messageDigest.digest();
        } else {
            Mac mac2 = this.mac;
            if (mac2 == null) {
                C52711k.m112234a();
            }
            bArr = mac2.doFinal();
        }
        C52711k.m112236a((Object) bArr, "result");
        return new ByteString(bArr);
    }

    public HashingSource(Source source, String str) {
        C52711k.m112240b(source, "source");
        C52711k.m112240b(str, "algorithm");
        super(source);
        this.messageDigest = MessageDigest.getInstance(str);
        this.mac = null;
    }

    public final long read(Buffer buffer, long j) throws IOException {
        C52711k.m112240b(buffer, "sink");
        long read = super.read(buffer, j);
        if (read != -1) {
            long size = buffer.size() - read;
            long size2 = buffer.size();
            Segment segment = buffer.head;
            if (segment == null) {
                C52711k.m112234a();
            }
            while (size2 > size) {
                segment = segment.prev;
                if (segment == null) {
                    C52711k.m112234a();
                }
                size2 -= (long) (segment.limit - segment.pos);
            }
            while (size2 < buffer.size()) {
                int i = (int) ((((long) segment.pos) + size) - size2);
                if (this.messageDigest != null) {
                    this.messageDigest.update(segment.data, i, segment.limit - i);
                } else {
                    Mac mac2 = this.mac;
                    if (mac2 == null) {
                        C52711k.m112234a();
                    }
                    mac2.update(segment.data, i, segment.limit - i);
                }
                size = ((long) (segment.limit - segment.pos)) + size2;
                segment = segment.next;
                if (segment == null) {
                    C52711k.m112234a();
                }
                size2 = size;
            }
        }
        return read;
    }

    public HashingSource(Source source, ByteString byteString, String str) {
        C52711k.m112240b(source, "source");
        C52711k.m112240b(byteString, "key");
        C52711k.m112240b(str, "algorithm");
        super(source);
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(byteString.toByteArray(), str));
            this.mac = instance;
            this.messageDigest = null;
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
