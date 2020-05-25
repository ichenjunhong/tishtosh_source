package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.C2240a;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.util.Locale;

public final class WebImage extends AbstractSafeParcelable {
    public static final Creator<WebImage> CREATOR = new C15394d();

    /* renamed from: a */
    public final Uri f39712a;

    /* renamed from: b */
    public final int f39713b;

    /* renamed from: c */
    public final int f39714c;

    /* renamed from: d */
    private final int f39715d;

    WebImage(int i, Uri uri, int i2, int i3) {
        this.f39715d = i;
        this.f39712a = uri;
        this.f39713b = i2;
        this.f39714c = i3;
    }

    public final String toString() {
        return C2240a.m6773a(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.f39713b), Integer.valueOf(this.f39714c), this.f39712a.toString()});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof WebImage)) {
            return false;
        }
        WebImage webImage = (WebImage) obj;
        return C15462p.m32120a(this.f39712a, webImage.f39712a) && this.f39713b == webImage.f39713b && this.f39714c == webImage.f39714c;
    }

    public final int hashCode() {
        return C15462p.m32118a(this.f39712a, Integer.valueOf(this.f39713b), Integer.valueOf(this.f39714c));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f39715d);
        C15469b.m32183a(parcel, 2, (Parcelable) this.f39712a, i, false);
        C15469b.m32195b(parcel, 3, this.f39713b);
        C15469b.m32195b(parcel, 4, this.f39714c);
        C15469b.m32197c(parcel, a);
    }
}
