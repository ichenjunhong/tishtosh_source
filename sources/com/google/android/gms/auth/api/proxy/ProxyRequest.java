package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public class ProxyRequest extends AbstractSafeParcelable {
    public static final Creator<ProxyRequest> CREATOR = new C15132b();

    /* renamed from: a */
    public static final int f39096a = 0;

    /* renamed from: b */
    public static final int f39097b = 1;

    /* renamed from: c */
    public static final int f39098c = 2;

    /* renamed from: d */
    public static final int f39099d = 3;

    /* renamed from: e */
    public static final int f39100e = 4;

    /* renamed from: f */
    public static final int f39101f = 5;

    /* renamed from: g */
    public static final int f39102g = 6;

    /* renamed from: h */
    public static final int f39103h = 7;

    /* renamed from: i */
    public static final int f39104i = 7;

    /* renamed from: j */
    public final String f39105j;

    /* renamed from: k */
    public final int f39106k;

    /* renamed from: l */
    public final long f39107l;

    /* renamed from: m */
    public final byte[] f39108m;

    /* renamed from: n */
    private final int f39109n;

    /* renamed from: o */
    private Bundle f39110o;

    ProxyRequest(int i, String str, int i2, long j, byte[] bArr, Bundle bundle) {
        this.f39109n = i;
        this.f39105j = str;
        this.f39106k = i2;
        this.f39107l = j;
        this.f39108m = bArr;
        this.f39110o = bundle;
    }

    public String toString() {
        String str = this.f39105j;
        int i = this.f39106k;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
        sb.append("ProxyRequest[ url: ");
        sb.append(str);
        sb.append(", method: ");
        sb.append(i);
        sb.append(" ]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32187a(parcel, 1, this.f39105j, false);
        C15469b.m32195b(parcel, 2, this.f39106k);
        C15469b.m32180a(parcel, 3, this.f39107l);
        C15469b.m32190a(parcel, 4, this.f39108m, false);
        C15469b.m32181a(parcel, 5, this.f39110o, false);
        C15469b.m32195b(parcel, 1000, this.f39109n);
        C15469b.m32197c(parcel, a);
    }
}
