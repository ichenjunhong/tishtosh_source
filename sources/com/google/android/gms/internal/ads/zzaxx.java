package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.util.List;

@C16299uq
public final class zzaxx extends AbstractSafeParcelable {
    public static final Creator<zzaxx> CREATOR = new C16340wd();

    /* renamed from: a */
    private final Bundle f46214a;

    /* renamed from: b */
    private final zzbgz f46215b;

    /* renamed from: c */
    private final ApplicationInfo f46216c;

    /* renamed from: d */
    private final String f46217d;

    /* renamed from: e */
    private final List<String> f46218e;

    /* renamed from: f */
    private final PackageInfo f46219f;

    /* renamed from: g */
    private final String f46220g;

    /* renamed from: h */
    private final boolean f46221h;

    /* renamed from: i */
    private final String f46222i;

    public zzaxx(Bundle bundle, zzbgz zzbgz, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, String str2, boolean z, String str3) {
        this.f46214a = bundle;
        this.f46215b = zzbgz;
        this.f46217d = str;
        this.f46216c = applicationInfo;
        this.f46218e = list;
        this.f46219f = packageInfo;
        this.f46220g = str2;
        this.f46221h = z;
        this.f46222i = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32181a(parcel, 1, this.f46214a, false);
        C15469b.m32183a(parcel, 2, (Parcelable) this.f46215b, i, false);
        C15469b.m32183a(parcel, 3, (Parcelable) this.f46216c, i, false);
        C15469b.m32187a(parcel, 4, this.f46217d, false);
        C15469b.m32188a(parcel, 5, this.f46218e, false);
        C15469b.m32183a(parcel, 6, (Parcelable) this.f46219f, i, false);
        C15469b.m32187a(parcel, 7, this.f46220g, false);
        C15469b.m32189a(parcel, 8, this.f46221h);
        C15469b.m32187a(parcel, 9, this.f46222i, false);
        C15469b.m32197c(parcel, a);
    }
}
