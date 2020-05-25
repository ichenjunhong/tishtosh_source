package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.kz */
public final class C16848kz extends IOException {
    public C16848kz(String str) {
        super(str);
    }

    public C16848kz(String str, Exception exc) {
        super(str, exc);
    }

    /* renamed from: a */
    static C16848kz m40904a() {
        return new C16848kz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static C16848kz m40905b() {
        return new C16848kz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static C16848kz m40906c() {
        return new C16848kz("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    static C16848kz m40907d() {
        return new C16848kz("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
