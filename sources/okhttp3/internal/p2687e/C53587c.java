package okhttp3.internal.p2687e;

import okhttp3.internal.C53559c;
import okio.ByteString;

/* renamed from: okhttp3.internal.e.c */
public final class C53587c {

    /* renamed from: a */
    public static final ByteString f132809a = ByteString.encodeUtf8(":");

    /* renamed from: b */
    public static final ByteString f132810b = ByteString.encodeUtf8(":status");

    /* renamed from: c */
    public static final ByteString f132811c = ByteString.encodeUtf8(":method");

    /* renamed from: d */
    public static final ByteString f132812d = ByteString.encodeUtf8(":path");

    /* renamed from: e */
    public static final ByteString f132813e = ByteString.encodeUtf8(":scheme");

    /* renamed from: f */
    public static final ByteString f132814f = ByteString.encodeUtf8(":authority");

    /* renamed from: g */
    public final ByteString f132815g;

    /* renamed from: h */
    public final ByteString f132816h;

    /* renamed from: i */
    final int f132817i;

    public final int hashCode() {
        return ((this.f132815g.hashCode() + 527) * 31) + this.f132816h.hashCode();
    }

    public final String toString() {
        return C53559c.m113798a("%s: %s", this.f132815g.utf8(), this.f132816h.utf8());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C53587c)) {
            return false;
        }
        C53587c cVar = (C53587c) obj;
        if (!this.f132815g.equals(cVar.f132815g) || !this.f132816h.equals(cVar.f132816h)) {
            return false;
        }
        return true;
    }

    public C53587c(ByteString byteString, String str) {
        this(byteString, ByteString.encodeUtf8(str));
    }

    public C53587c(String str, String str2) {
        this(ByteString.encodeUtf8(str), ByteString.encodeUtf8(str2));
    }

    public C53587c(ByteString byteString, ByteString byteString2) {
        this.f132815g = byteString;
        this.f132816h = byteString2;
        this.f132817i = byteString.size() + 32 + byteString2.size();
    }
}
