package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.zzar;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.internal.ads.C15927gw;
import com.google.android.gms.internal.ads.C15929gy;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.ama;
import com.google.android.gms.internal.ads.bzl;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.p1027a.C14882b.C14883a;
import com.google.android.gms.p1027a.C14886d;

@C16299uq
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<AdOverlayInfoParcel> CREATOR = new C15016m();

    /* renamed from: a */
    public final zzc f38769a;

    /* renamed from: b */
    public final bzl f38770b;

    /* renamed from: c */
    public final C15017n f38771c;

    /* renamed from: d */
    public final ama f38772d;

    /* renamed from: e */
    public final C15929gy f38773e;

    /* renamed from: f */
    public final String f38774f;

    /* renamed from: g */
    public final boolean f38775g;

    /* renamed from: h */
    public final String f38776h;

    /* renamed from: i */
    public final C15023t f38777i;

    /* renamed from: j */
    public final int f38778j;

    /* renamed from: k */
    public final int f38779k;

    /* renamed from: l */
    public final String f38780l;

    /* renamed from: m */
    public final zzbgz f38781m;

    /* renamed from: n */
    public final String f38782n;

    /* renamed from: o */
    public final zzar f38783o;

    /* renamed from: p */
    public final C15927gw f38784p;

    /* renamed from: a */
    public static AdOverlayInfoParcel m31020a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    public AdOverlayInfoParcel(bzl bzl, C15017n nVar, C15023t tVar, ama ama, int i, zzbgz zzbgz, String str, zzar zzar) {
        this.f38770b = bzl;
        this.f38771c = nVar;
        this.f38772d = ama;
        this.f38777i = tVar;
        this.f38778j = i;
        this.f38779k = 1;
        this.f38781m = zzbgz;
        this.f38782n = str;
        this.f38783o = zzar;
    }

    public AdOverlayInfoParcel(bzl bzl, C15017n nVar, C15023t tVar, ama ama, boolean z, int i, zzbgz zzbgz) {
        this.f38770b = bzl;
        this.f38771c = nVar;
        this.f38772d = ama;
        this.f38775g = z;
        this.f38777i = tVar;
        this.f38778j = i;
        this.f38779k = 2;
        this.f38781m = zzbgz;
    }

    public AdOverlayInfoParcel(bzl bzl, C15017n nVar, C15927gw gwVar, C15929gy gyVar, C15023t tVar, ama ama, boolean z, int i, String str, zzbgz zzbgz) {
        this.f38770b = bzl;
        this.f38771c = nVar;
        this.f38772d = ama;
        this.f38784p = gwVar;
        this.f38773e = gyVar;
        this.f38775g = z;
        this.f38777i = tVar;
        this.f38778j = i;
        this.f38779k = 3;
        this.f38780l = str;
        this.f38781m = zzbgz;
    }

    public AdOverlayInfoParcel(bzl bzl, C15017n nVar, C15927gw gwVar, C15929gy gyVar, C15023t tVar, ama ama, boolean z, int i, String str, String str2, zzbgz zzbgz) {
        this.f38770b = bzl;
        this.f38771c = nVar;
        this.f38772d = ama;
        this.f38784p = gwVar;
        this.f38773e = gyVar;
        this.f38774f = str2;
        this.f38775g = z;
        this.f38776h = str;
        this.f38777i = tVar;
        this.f38778j = i;
        this.f38779k = 3;
        this.f38781m = zzbgz;
    }

    public AdOverlayInfoParcel(zzc zzc, bzl bzl, C15017n nVar, C15023t tVar, zzbgz zzbgz) {
        this.f38769a = zzc;
        this.f38770b = bzl;
        this.f38771c = nVar;
        this.f38777i = tVar;
        this.f38778j = -1;
        this.f38779k = 4;
        this.f38781m = zzbgz;
    }

    AdOverlayInfoParcel(zzc zzc, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, zzbgz zzbgz, String str4, zzar zzar, IBinder iBinder6) {
        this.f38769a = zzc;
        this.f38770b = (bzl) C14886d.m30545a(C14883a.m30535a(iBinder));
        this.f38771c = (C15017n) C14886d.m30545a(C14883a.m30535a(iBinder2));
        this.f38772d = (ama) C14886d.m30545a(C14883a.m30535a(iBinder3));
        this.f38784p = (C15927gw) C14886d.m30545a(C14883a.m30535a(iBinder6));
        this.f38773e = (C15929gy) C14886d.m30545a(C14883a.m30535a(iBinder4));
        this.f38774f = str;
        this.f38775g = z;
        this.f38776h = str2;
        this.f38777i = (C15023t) C14886d.m30545a(C14883a.m30535a(iBinder5));
        this.f38778j = i;
        this.f38779k = i2;
        this.f38780l = str3;
        this.f38781m = zzbgz;
        this.f38782n = str4;
        this.f38783o = zzar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32183a(parcel, 2, (Parcelable) this.f38769a, i, false);
        C15469b.m32182a(parcel, 3, C14886d.m30544a(this.f38770b).asBinder(), false);
        C15469b.m32182a(parcel, 4, C14886d.m30544a(this.f38771c).asBinder(), false);
        C15469b.m32182a(parcel, 5, C14886d.m30544a(this.f38772d).asBinder(), false);
        C15469b.m32182a(parcel, 6, C14886d.m30544a(this.f38773e).asBinder(), false);
        C15469b.m32187a(parcel, 7, this.f38774f, false);
        C15469b.m32189a(parcel, 8, this.f38775g);
        C15469b.m32187a(parcel, 9, this.f38776h, false);
        C15469b.m32182a(parcel, 10, C14886d.m30544a(this.f38777i).asBinder(), false);
        C15469b.m32195b(parcel, 11, this.f38778j);
        C15469b.m32195b(parcel, 12, this.f38779k);
        C15469b.m32187a(parcel, 13, this.f38780l, false);
        C15469b.m32183a(parcel, 14, (Parcelable) this.f38781m, i, false);
        C15469b.m32187a(parcel, 16, this.f38782n, false);
        C15469b.m32183a(parcel, 17, (Parcelable) this.f38783o, i, false);
        C15469b.m32182a(parcel, 18, C14886d.m30544a(this.f38784p).asBinder(), false);
        C15469b.m32197c(parcel, a);
    }
}
