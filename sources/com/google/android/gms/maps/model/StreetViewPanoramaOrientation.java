package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;

public class StreetViewPanoramaOrientation extends AbstractSafeParcelable {
    public static final Creator<StreetViewPanoramaOrientation> CREATOR = new C16972u();

    /* renamed from: a */
    public final float f47820a;

    /* renamed from: b */
    public final float f47821b;

    /* renamed from: com.google.android.gms.maps.model.StreetViewPanoramaOrientation$a */
    public static final class C16951a {

        /* renamed from: a */
        public float f47822a;

        /* renamed from: b */
        public float f47823b;
    }

    public StreetViewPanoramaOrientation(float f, float f2) {
        boolean z = -90.0f <= f && f <= 90.0f;
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f);
        C15464q.m32134b(z, sb.toString());
        this.f47820a = f + 0.0f;
        if (((double) f2) <= ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
            f2 = (f2 % 360.0f) + 360.0f;
        }
        this.f47821b = f2 % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        return Float.floatToIntBits(this.f47820a) == Float.floatToIntBits(streetViewPanoramaOrientation.f47820a) && Float.floatToIntBits(this.f47821b) == Float.floatToIntBits(streetViewPanoramaOrientation.f47821b);
    }

    public int hashCode() {
        return C15462p.m32118a(Float.valueOf(this.f47820a), Float.valueOf(this.f47821b));
    }

    public String toString() {
        return C15462p.m32119a((Object) this).mo28449a("tilt", Float.valueOf(this.f47820a)).mo28449a("bearing", Float.valueOf(this.f47821b)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32178a(parcel, 2, this.f47820a);
        C15469b.m32178a(parcel, 3, this.f47821b);
        C15469b.m32197c(parcel, a);
    }
}
