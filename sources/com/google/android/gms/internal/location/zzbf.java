package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.location.C16876ag;
import com.google.android.gms.location.C16878ai;
import com.google.android.gms.location.C16879aj;
import com.google.android.gms.location.C16881al;

public final class zzbf extends AbstractSafeParcelable {
    public static final Creator<zzbf> CREATOR = new C16521s();

    /* renamed from: a */
    private int f46422a;

    /* renamed from: b */
    private zzbd f46423b;

    /* renamed from: c */
    private C16879aj f46424c;

    /* renamed from: d */
    private PendingIntent f46425d;

    /* renamed from: e */
    private C16876ag f46426e;

    /* renamed from: f */
    private C16506d f46427f;

    /* renamed from: a */
    public static zzbf m39413a(C16876ag agVar, C16506d dVar) {
        zzbf zzbf = new zzbf(2, null, null, null, agVar.asBinder(), dVar != null ? dVar.asBinder() : null);
        return zzbf;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f46422a);
        C15469b.m32183a(parcel, 2, (Parcelable) this.f46423b, i, false);
        IBinder iBinder = null;
        C15469b.m32182a(parcel, 3, this.f46424c == null ? null : this.f46424c.asBinder(), false);
        C15469b.m32183a(parcel, 4, (Parcelable) this.f46425d, i, false);
        C15469b.m32182a(parcel, 5, this.f46426e == null ? null : this.f46426e.asBinder(), false);
        if (this.f46427f != null) {
            iBinder = this.f46427f.asBinder();
        }
        C15469b.m32182a(parcel, 6, iBinder, false);
        C15469b.m32197c(parcel, a);
    }

    zzbf(int i, zzbd zzbd, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        C16879aj ajVar;
        C16876ag agVar;
        this.f46422a = i;
        this.f46423b = zzbd;
        C16506d dVar = null;
        if (iBinder == null || iBinder == null) {
            ajVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            ajVar = queryLocalInterface instanceof C16879aj ? (C16879aj) queryLocalInterface : new C16881al(iBinder);
        }
        this.f46424c = ajVar;
        this.f46425d = pendingIntent;
        if (iBinder2 == null || iBinder2 == null) {
            agVar = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            agVar = queryLocalInterface2 instanceof C16876ag ? (C16876ag) queryLocalInterface2 : new C16878ai(iBinder2);
        }
        this.f46426e = agVar;
        if (!(iBinder3 == null || iBinder3 == null)) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            dVar = queryLocalInterface3 instanceof C16506d ? (C16506d) queryLocalInterface3 : new C16508f(iBinder3);
        }
        this.f46427f = dVar;
    }
}
