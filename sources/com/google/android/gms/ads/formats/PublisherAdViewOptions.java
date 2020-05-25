package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.internal.ads.C16147p;
import com.google.android.gms.internal.ads.C16201r;
import com.google.android.gms.internal.ads.C16299uq;

@C16299uq
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Creator<PublisherAdViewOptions> CREATOR = new C14934l();

    /* renamed from: a */
    public final boolean f38468a;

    /* renamed from: b */
    public final C16147p f38469b;

    /* renamed from: c */
    private final IBinder f38470c;

    PublisherAdViewOptions(boolean z, IBinder iBinder, IBinder iBinder2) {
        this.f38468a = z;
        C16147p pVar = null;
        if (!(iBinder == null || iBinder == null)) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            pVar = queryLocalInterface instanceof C16147p ? (C16147p) queryLocalInterface : new C16201r(iBinder);
        }
        this.f38469b = pVar;
        this.f38470c = iBinder2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32189a(parcel, 1, this.f38468a);
        C15469b.m32182a(parcel, 2, this.f38469b == null ? null : this.f38469b.asBinder(), false);
        C15469b.m32182a(parcel, 3, this.f38470c, false);
        C15469b.m32197c(parcel, a);
    }
}
