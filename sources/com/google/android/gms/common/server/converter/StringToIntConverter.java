package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.common.server.response.FastJsonResponse.C15491a;
import java.util.ArrayList;
import java.util.HashMap;

public final class StringToIntConverter extends AbstractSafeParcelable implements C15491a<String, Integer> {
    public static final Creator<StringToIntConverter> CREATOR = new C15489b();

    /* renamed from: a */
    private final int f39903a;

    /* renamed from: b */
    private final HashMap<String, Integer> f39904b;

    /* renamed from: c */
    private final SparseArray<String> f39905c;

    /* renamed from: d */
    private final ArrayList<zaa> f39906d;

    public static final class zaa extends AbstractSafeParcelable {
        public static final Creator<zaa> CREATOR = new C15490c();

        /* renamed from: a */
        final String f39907a;

        /* renamed from: b */
        final int f39908b;

        /* renamed from: c */
        private final int f39909c;

        zaa(int i, String str, int i2) {
            this.f39909c = i;
            this.f39907a = str;
            this.f39908b = i2;
        }

        zaa(String str, int i) {
            this.f39909c = 1;
            this.f39907a = str;
            this.f39908b = i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C15469b.m32174a(parcel);
            C15469b.m32195b(parcel, 1, this.f39909c);
            C15469b.m32187a(parcel, 2, this.f39907a, false);
            C15469b.m32195b(parcel, 3, this.f39908b);
            C15469b.m32197c(parcel, a);
        }
    }

    StringToIntConverter(int i, ArrayList<zaa> arrayList) {
        this.f39903a = i;
        this.f39904b = new HashMap<>();
        this.f39905c = new SparseArray<>();
        this.f39906d = null;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            zaa zaa2 = (zaa) obj;
            String str = zaa2.f39907a;
            int i3 = zaa2.f39908b;
            this.f39904b.put(str, Integer.valueOf(i3));
            this.f39905c.put(i3, str);
        }
    }

    public StringToIntConverter() {
        this.f39903a = 1;
        this.f39904b = new HashMap<>();
        this.f39905c = new SparseArray<>();
        this.f39906d = null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f39903a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f39904b.keySet()) {
            arrayList.add(new zaa(str, ((Integer) this.f39904b.get(str)).intValue()));
        }
        C15469b.m32196b(parcel, 2, arrayList, false);
        C15469b.m32197c(parcel, a);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo28474a(Object obj) {
        String str = (String) this.f39905c.get(((Integer) obj).intValue());
        return (str != null || !this.f39904b.containsKey("gms_unknown")) ? str : "gms_unknown";
    }
}
