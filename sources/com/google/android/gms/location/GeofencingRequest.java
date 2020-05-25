package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.internal.location.zzbh;
import java.util.List;

public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Creator<GeofencingRequest> CREATOR = new C16872ac();

    /* renamed from: a */
    public final int f47619a;

    /* renamed from: b */
    private final List<zzbh> f47620b;

    /* renamed from: c */
    private final String f47621c;

    GeofencingRequest(List<zzbh> list, int i, String str) {
        this.f47620b = list;
        this.f47619a = i;
        this.f47621c = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GeofencingRequest[");
        sb.append("geofences=");
        sb.append(this.f47620b);
        int i = this.f47619a;
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(", initialTrigger=");
        sb2.append(i);
        sb2.append(", ");
        sb.append(sb2.toString());
        String str = "tag=";
        String valueOf = String.valueOf(this.f47621c);
        sb.append(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32196b(parcel, 1, this.f47620b, false);
        C15469b.m32195b(parcel, 2, this.f47619a);
        C15469b.m32187a(parcel, 3, this.f47621c, false);
        C15469b.m32197c(parcel, a);
    }
}
