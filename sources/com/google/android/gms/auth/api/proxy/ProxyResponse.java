package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public class ProxyResponse extends AbstractSafeParcelable {
    public static final Creator<ProxyResponse> CREATOR = new C15133c();

    /* renamed from: a */
    public final int f39111a;

    /* renamed from: b */
    public final PendingIntent f39112b;

    /* renamed from: c */
    public final int f39113c;

    /* renamed from: d */
    public final byte[] f39114d;

    /* renamed from: e */
    private final int f39115e;

    /* renamed from: f */
    private final Bundle f39116f;

    ProxyResponse(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
        this.f39115e = i;
        this.f39111a = i2;
        this.f39113c = i3;
        this.f39116f = bundle;
        this.f39114d = bArr;
        this.f39112b = pendingIntent;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f39111a);
        C15469b.m32183a(parcel, 2, (Parcelable) this.f39112b, i, false);
        C15469b.m32195b(parcel, 3, this.f39113c);
        C15469b.m32181a(parcel, 4, this.f39116f, false);
        C15469b.m32190a(parcel, 5, this.f39114d, false);
        C15469b.m32195b(parcel, 1000, this.f39115e);
        C15469b.m32197c(parcel, a);
    }
}
