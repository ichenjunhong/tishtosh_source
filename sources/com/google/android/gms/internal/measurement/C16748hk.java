package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.hk */
public class C16748hk extends IOException {

    /* renamed from: a */
    private C16775ik f47112a;

    public C16748hk(String str) {
        super(str);
    }

    public final C16748hk zzg(C16775ik ikVar) {
        this.f47112a = ikVar;
        return this;
    }

    /* renamed from: a */
    static C16748hk m40322a() {
        return new C16748hk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static C16748hk m40323b() {
        return new C16748hk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static C16748hk m40324c() {
        return new C16748hk("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    static C16748hk m40325d() {
        return new C16748hk("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: e */
    static C16749hl m40326e() {
        return new C16749hl("Protocol message tag had invalid wire type.");
    }

    /* renamed from: f */
    static C16748hk m40327f() {
        return new C16748hk("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: g */
    static C16748hk m40328g() {
        return new C16748hk("Failed to parse the message.");
    }

    /* renamed from: h */
    static C16748hk m40329h() {
        return new C16748hk("Protocol message had invalid UTF-8.");
    }
}
