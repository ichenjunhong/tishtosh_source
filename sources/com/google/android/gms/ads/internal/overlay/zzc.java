package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.internal.ads.C16299uq;

@C16299uq
public final class zzc extends AbstractSafeParcelable {
    public static final Creator<zzc> CREATOR = new C15005b();

    /* renamed from: a */
    public final String f38828a;

    /* renamed from: b */
    public final String f38829b;

    /* renamed from: c */
    public final String f38830c;

    /* renamed from: d */
    public final String f38831d;

    /* renamed from: e */
    public final String f38832e;

    /* renamed from: f */
    public final Intent f38833f;

    /* renamed from: g */
    private final String f38834g;

    /* renamed from: h */
    private final String f38835h;

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, null);
    }

    public zzc(Intent intent) {
        this(null, null, null, null, null, null, null, intent);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent) {
        this.f38834g = str;
        this.f38828a = str2;
        this.f38829b = str3;
        this.f38830c = str4;
        this.f38831d = str5;
        this.f38832e = str6;
        this.f38835h = str7;
        this.f38833f = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32187a(parcel, 2, this.f38834g, false);
        C15469b.m32187a(parcel, 3, this.f38828a, false);
        C15469b.m32187a(parcel, 4, this.f38829b, false);
        C15469b.m32187a(parcel, 5, this.f38830c, false);
        C15469b.m32187a(parcel, 6, this.f38831d, false);
        C15469b.m32187a(parcel, 7, this.f38832e, false);
        C15469b.m32187a(parcel, 8, this.f38835h, false);
        C15469b.m32183a(parcel, 9, (Parcelable) this.f38833f, i, false);
        C15469b.m32197c(parcel, a);
    }
}
