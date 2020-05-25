package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.util.Comparator;

public class DetectedActivity extends AbstractSafeParcelable {
    public static final Creator<DetectedActivity> CREATOR = new C16906x();

    /* renamed from: b */
    private static final Comparator<DetectedActivity> f47613b = new C16905w();

    /* renamed from: c */
    private static final int[] f47614c = {9, 10};

    /* renamed from: d */
    private static final int[] f47615d = {0, 1, 2, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 16, 17, 18, 19};

    /* renamed from: e */
    private static final int[] f47616e = {0, 1, 2, 3, 7, 8, 16, 17};

    /* renamed from: a */
    public int f47617a;

    /* renamed from: f */
    private int f47618f;

    public DetectedActivity(int i, int i2) {
        this.f47618f = i;
        this.f47617a = i2;
    }

    /* renamed from: a */
    public final int mo32552a() {
        int i = this.f47618f;
        if (i > 19 || i < 0) {
            return 4;
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            return this.f47618f == detectedActivity.f47618f && this.f47617a == detectedActivity.f47617a;
        }
    }

    public int hashCode() {
        return C15462p.m32118a(Integer.valueOf(this.f47618f), Integer.valueOf(this.f47617a));
    }

    public String toString() {
        String str;
        int a = mo32552a();
        switch (a) {
            case 0:
                str = "IN_VEHICLE";
                break;
            case 1:
                str = "ON_BICYCLE";
                break;
            case 2:
                str = "ON_FOOT";
                break;
            case 3:
                str = "STILL";
                break;
            case 4:
                str = "UNKNOWN";
                break;
            case 5:
                str = "TILTING";
                break;
            default:
                switch (a) {
                    case 7:
                        str = "WALKING";
                        break;
                    case 8:
                        str = "RUNNING";
                        break;
                    default:
                        switch (a) {
                            case 16:
                                str = "IN_ROAD_VEHICLE";
                                break;
                            case 17:
                                str = "IN_RAIL_VEHICLE";
                                break;
                            case 18:
                                str = "IN_TWO_WHEELER_VEHICLE";
                                break;
                            case 19:
                                str = "IN_FOUR_WHEELER_VEHICLE";
                                break;
                            default:
                                str = Integer.toString(a);
                                break;
                        }
                }
        }
        int i = this.f47617a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
        sb.append("DetectedActivity [type=");
        sb.append(str);
        sb.append(", confidence=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f47618f);
        C15469b.m32195b(parcel, 2, this.f47617a);
        C15469b.m32197c(parcel, a);
    }
}
