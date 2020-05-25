package com.p683ss.android.ttvecamera;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.ttvecamera.TEFocusParameters */
public class TEFocusParameters implements Parcelable {
    public static final Creator<TEFocusParameters> CREATOR = new Creator<TEFocusParameters>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new TEFocusParameters[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new TEFocusParameters(parcel);
        }
    };

    /* renamed from: a */
    public Rect f55394a;

    /* renamed from: b */
    public Rect f55395b;

    /* renamed from: c */
    public int f55396c;

    /* renamed from: d */
    public int f55397d;

    public TEFocusParameters() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("active size is:");
        sb.append(this.f55394a.toString());
        sb.append(" crop size is: ");
        sb.append(this.f55395b.toString());
        sb.append("  max AF regions is: ");
        sb.append(this.f55396c);
        sb.append("  max AE regions is: ");
        sb.append(this.f55397d);
        return sb.toString();
    }

    public TEFocusParameters(Parcel parcel) {
        this.f55394a = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.f55396c = parcel.readInt();
        this.f55397d = parcel.readInt();
        this.f55395b = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f55394a, i);
        parcel.writeInt(this.f55396c);
        parcel.writeInt(this.f55397d);
        parcel.writeParcelable(this.f55395b, i);
    }
}
