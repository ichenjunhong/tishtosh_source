package okio;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

public final class HashingSink extends ForwardingSink {
    public static final Companion Companion = new Companion(null);
    private final Mac mac;
    private final MessageDigest messageDigest;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }

        public final HashingSink md5(Sink sink) {
            C52711k.m112240b(sink, "sink");
            return new HashingSink(sink, "MD5");
        }

        public final HashingSink sha1(Sink sink) {
            C52711k.m112240b(sink, "sink");
            return new HashingSink(sink, "SHA-1");
        }

        public final HashingSink sha256(Sink sink) {
            C52711k.m112240b(sink, "sink");
            return new HashingSink(sink, "SHA-256");
        }

        public final HashingSink sha512(Sink sink) {
            C52711k.m112240b(sink, "sink");
            return new HashingSink(sink, "SHA-512");
        }

        public final HashingSink hmacSha1(Sink sink, ByteString byteString) {
            C52711k.m112240b(sink, "sink");
            C52711k.m112240b(byteString, "key");
            return new HashingSink(sink, byteString, "HmacSHA1");
        }

        public final HashingSink hmacSha256(Sink sink, ByteString byteString) {
            C52711k.m112240b(sink, "sink");
            C52711k.m112240b(byteString, "key");
            return new HashingSink(sink, byteString, "HmacSHA256");
        }

        public final HashingSink hmacSha512(Sink sink, ByteString byteString) {
            C52711k.m112240b(sink, "sink");
            C52711k.m112240b(byteString, "key");
            return new HashingSink(sink, byteString, "HmacSHA512");
        }
    }

    public static final HashingSink hmacSha1(Sink sink, ByteString byteString) {
        return Companion.hmacSha1(sink, byteString);
    }

    public static final HashingSink hmacSha256(Sink sink, ByteString byteString) {
        return Companion.hmacSha256(sink, byteString);
    }

    public static final HashingSink hmacSha512(Sink sink, ByteString byteString) {
        return Companion.hmacSha512(sink, byteString);
    }

    public static final HashingSink md5(Sink sink) {
        return Companion.md5(sink);
    }

    public static final HashingSink sha1(Sink sink) {
        return Companion.sha1(sink);
    }

    public static final HashingSink sha256(Sink sink) {
        return Companion.sha256(sink);
    }

    public static final HashingSink sha512(Sink sink) {
        return Companion.sha512(sink);
    }

    /* renamed from: -deprecated_hash reason: not valid java name */
    public final ByteString m114643deprecated_hash() {
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

    public HashingSink(Sink sink, String str) {
        C52711k.m112240b(sink, "sink");
        C52711k.m112240b(str, "algorithm");
        super(sink);
        this.messageDigest = MessageDigest.getInstance(str);
        this.mac = null;
    }

    public final void write(Buffer buffer, long j) throws IOException {
        C52711k.m112240b(buffer, "source");
        Util.checkOffsetAndCount(buffer.size(), 0, j);
        Segment segment = buffer.head;
        if (segment == null) {
            C52711k.m112234a();
        }
        long j2 = 0;
        while (j2 < j) {
            int min = (int) Math.min(j - j2, (long) (segment.limit - segment.pos));
            if (this.messageDigest != null) {
                this.messageDigest.update(segment.data, segment.pos, min);
            } else {
                Mac mac2 = this.mac;
                if (mac2 == null) {
                    C52711k.m112234a();
                }
                mac2.update(segment.data, segment.pos, min);
            }
            j2 += (long) min;
            segment = segment.next;
            if (segment == null) {
                C52711k.m112234a();
            }
        }
        super.write(buffer, j);
    }

    public HashingSink(Sink sink, ByteString byteString, String str) {
        C52711k.m112240b(sink, "sink");
        C52711k.m112240b(byteString, "key");
        C52711k.m112240b(str, "algorithm");
        super(sink);
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
