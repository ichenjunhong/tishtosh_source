package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;

public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<CameraPosition> CREATOR = new C16957f();

    /* renamed from: a */
    public final LatLng f47726a;

    /* renamed from: b */
    public final float f47727b;

    /* renamed from: c */
    public final float f47728c;

    /* renamed from: d */
    public final float f47729d;

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        C15464q.m32124a(latLng, (Object) "null camera target");
        C15464q.m32135b(0.0f <= f2 && f2 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.f47726a = latLng;
        this.f47727b = f;
        this.f47728c = f2 + 0.0f;
        if (((double) f3) <= ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
            f3 = (f3 % 360.0f) + 360.0f;
        }
        this.f47729d = f3 % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f47726a.equals(cameraPosition.f47726a) && Float.floatToIntBits(this.f47727b) == Float.floatToIntBits(cameraPosition.f47727b) && Float.floatToIntBits(this.f47728c) == Float.floatToIntBits(cameraPosition.f47728c) && Float.floatToIntBits(this.f47729d) == Float.floatToIntBits(cameraPosition.f47729d);
    }

    public final int hashCode() {
        return C15462p.m32118a(this.f47726a, Float.valueOf(this.f47727b), Float.valueOf(this.f47728c), Float.valueOf(this.f47729d));
    }

    public final String toString() {
        return C15462p.m32119a((Object) this).mo28449a("target", this.f47726a).mo28449a("zoom", Float.valueOf(this.f47727b)).mo28449a("tilt", Float.valueOf(this.f47728c)).mo28449a("bearing", Float.valueOf(this.f47729d)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32183a(parcel, 2, (Parcelable) this.f47726a, i, false);
        C15469b.m32178a(parcel, 3, this.f47727b);
        C15469b.m32178a(parcel, 4, this.f47728c);
        C15469b.m32178a(parcel, 5, this.f47729d);
        C15469b.m32197c(parcel, a);
    }
}
