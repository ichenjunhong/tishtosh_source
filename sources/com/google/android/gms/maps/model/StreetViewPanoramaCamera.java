package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation.C16951a;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;

public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<StreetViewPanoramaCamera> CREATOR = new C16969r();

    /* renamed from: a */
    public final float f47811a;

    /* renamed from: b */
    public final float f47812b;

    /* renamed from: c */
    public final float f47813c;

    /* renamed from: d */
    public final StreetViewPanoramaOrientation f47814d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        return Float.floatToIntBits(this.f47811a) == Float.floatToIntBits(streetViewPanoramaCamera.f47811a) && Float.floatToIntBits(this.f47812b) == Float.floatToIntBits(streetViewPanoramaCamera.f47812b) && Float.floatToIntBits(this.f47813c) == Float.floatToIntBits(streetViewPanoramaCamera.f47813c);
    }

    public int hashCode() {
        return C15462p.m32118a(Float.valueOf(this.f47811a), Float.valueOf(this.f47812b), Float.valueOf(this.f47813c));
    }

    public String toString() {
        return C15462p.m32119a((Object) this).mo28449a("zoom", Float.valueOf(this.f47811a)).mo28449a("tilt", Float.valueOf(this.f47812b)).mo28449a("bearing", Float.valueOf(this.f47813c)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32178a(parcel, 2, this.f47811a);
        C15469b.m32178a(parcel, 3, this.f47812b);
        C15469b.m32178a(parcel, 4, this.f47813c);
        C15469b.m32197c(parcel, a);
    }

    public StreetViewPanoramaCamera(float f, float f2, float f3) {
        boolean z = -90.0f <= f2 && f2 <= 90.0f;
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f2);
        C15464q.m32134b(z, sb.toString());
        if (((double) f) <= ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
            f = 0.0f;
        }
        this.f47811a = f;
        this.f47812b = 0.0f + f2;
        this.f47813c = (((double) f3) <= ProfileUiInitOptimizeEnterThreshold.DEFAULT ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
        C16951a aVar = new C16951a();
        aVar.f47823b = f2;
        aVar.f47822a = f3;
        this.f47814d = new StreetViewPanoramaOrientation(aVar.f47823b, aVar.f47822a);
    }
}
