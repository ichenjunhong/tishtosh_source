package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;

public class StreetViewPanoramaLink extends AbstractSafeParcelable {
    public static final Creator<StreetViewPanoramaLink> CREATOR = new C16970s();

    /* renamed from: a */
    public final String f47815a;

    /* renamed from: b */
    public final float f47816b;

    public StreetViewPanoramaLink(String str, float f) {
        this.f47815a = str;
        if (((double) f) <= ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
            f = (f % 360.0f) + 360.0f;
        }
        this.f47816b = f % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        return this.f47815a.equals(streetViewPanoramaLink.f47815a) && Float.floatToIntBits(this.f47816b) == Float.floatToIntBits(streetViewPanoramaLink.f47816b);
    }

    public int hashCode() {
        return C15462p.m32118a(this.f47815a, Float.valueOf(this.f47816b));
    }

    public String toString() {
        return C15462p.m32119a((Object) this).mo28449a("panoId", this.f47815a).mo28449a("bearing", Float.valueOf(this.f47816b)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32187a(parcel, 2, this.f47815a, false);
        C15469b.m32178a(parcel, 3, this.f47816b);
        C15469b.m32197c(parcel, a);
    }
}
