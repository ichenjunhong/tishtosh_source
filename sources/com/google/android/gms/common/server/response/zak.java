package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class zak extends AbstractSafeParcelable {
    public static final Creator<zak> CREATOR = new C15494c();

    /* renamed from: a */
    public final String f39930a;

    /* renamed from: b */
    private final int f39931b;

    /* renamed from: c */
    private final HashMap<String, Map<String, Field<?, ?>>> f39932c;

    zak(int i, ArrayList<zal> arrayList, String str) {
        this.f39931b = i;
        HashMap<String, Map<String, Field<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zal = (zal) arrayList.get(i2);
            String str2 = zal.f39933a;
            HashMap hashMap2 = new HashMap();
            int size2 = zal.f39934b.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zam = (zam) zal.f39934b.get(i3);
                hashMap2.put(zam.f39936a, zam.f39937b);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f39932c = hashMap;
        this.f39930a = (String) C15464q.m32123a(str);
        m32236a();
    }

    /* renamed from: a */
    private void m32236a() {
        for (String str : this.f39932c.keySet()) {
            Map map = (Map) this.f39932c.get(str);
            for (String str2 : map.keySet()) {
                ((Field) map.get(str2)).f39919h = this;
            }
        }
    }

    /* renamed from: a */
    public final Map<String, Field<?, ?>> mo28504a(String str) {
        return (Map) this.f39932c.get(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f39932c.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) this.f39932c.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f39931b);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f39932c.keySet()) {
            arrayList.add(new zal(str, (Map) this.f39932c.get(str)));
        }
        C15469b.m32196b(parcel, 2, arrayList, false);
        C15469b.m32187a(parcel, 3, this.f39930a, false);
        C15469b.m32197c(parcel, a);
    }
}
