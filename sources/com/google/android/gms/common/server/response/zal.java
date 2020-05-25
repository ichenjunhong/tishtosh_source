package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import java.util.ArrayList;
import java.util.Map;

public final class zal extends AbstractSafeParcelable {
    public static final Creator<zal> CREATOR = new C15495d();

    /* renamed from: a */
    final String f39933a;

    /* renamed from: b */
    final ArrayList<zam> f39934b;

    /* renamed from: c */
    private final int f39935c;

    zal(int i, String str, ArrayList<zam> arrayList) {
        this.f39935c = i;
        this.f39933a = str;
        this.f39934b = arrayList;
    }

    zal(String str, Map<String, Field<?, ?>> map) {
        ArrayList<zam> arrayList;
        this.f39935c = 1;
        this.f39933a = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, (Field) map.get(str2)));
            }
        }
        this.f39934b = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f39935c);
        C15469b.m32187a(parcel, 2, this.f39933a, false);
        C15469b.m32196b(parcel, 3, this.f39934b, false);
        C15469b.m32197c(parcel, a);
    }
}
