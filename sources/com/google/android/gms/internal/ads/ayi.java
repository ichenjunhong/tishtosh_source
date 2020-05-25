package com.google.android.gms.internal.ads;

import java.io.IOException;

public class ayi extends IOException {

    /* renamed from: a */
    private azj f41632a;

    public ayi(String str) {
        super(str);
    }

    public final ayi zzk(azj azj) {
        this.f41632a = azj;
        return this;
    }

    /* renamed from: a */
    static ayi m34778a() {
        return new ayi("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static ayi m34779b() {
        return new ayi("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static ayi m34780c() {
        return new ayi("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    static ayi m34781d() {
        return new ayi("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: e */
    static ayi m34782e() {
        return new ayi("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: f */
    static ayj m34783f() {
        return new ayj("Protocol message tag had invalid wire type.");
    }

    /* renamed from: g */
    static ayi m34784g() {
        return new ayi("Failed to parse the message.");
    }

    /* renamed from: h */
    static ayi m34785h() {
        return new ayi("Protocol message had invalid UTF-8.");
    }
}
