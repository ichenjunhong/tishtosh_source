package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.internal.auth.zzaz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class zzl extends zzaz {
    public static final Creator<zzl> CREATOR = new C15111a();

    /* renamed from: a */
    private static final HashMap<String, Field<?, ?>> f39022a;

    /* renamed from: b */
    private final Set<Integer> f39023b;

    /* renamed from: c */
    private final int f39024c;

    /* renamed from: d */
    private ArrayList<zzr> f39025d;

    /* renamed from: e */
    private int f39026e;

    /* renamed from: f */
    private zzo f39027f;

    zzl(Set<Integer> set, int i, ArrayList<zzr> arrayList, int i2, zzo zzo) {
        this.f39023b = set;
        this.f39024c = i;
        this.f39025d = arrayList;
        this.f39026e = i2;
        this.f39027f = zzo;
    }

    public zzl() {
        this.f39023b = new HashSet(1);
        this.f39024c = 1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        Set<Integer> set = this.f39023b;
        if (set.contains(Integer.valueOf(1))) {
            C15469b.m32195b(parcel, 1, this.f39024c);
        }
        if (set.contains(Integer.valueOf(2))) {
            C15469b.m32196b(parcel, 2, this.f39025d, true);
        }
        if (set.contains(Integer.valueOf(3))) {
            C15469b.m32195b(parcel, 3, this.f39026e);
        }
        if (set.contains(Integer.valueOf(4))) {
            C15469b.m32183a(parcel, 4, (Parcelable) this.f39027f, i, true);
        }
        C15469b.m32197c(parcel, a);
    }

    /* renamed from: a */
    public final boolean mo27876a(Field field) {
        return this.f39023b.contains(Integer.valueOf(field.f39917f));
    }

    /* renamed from: b */
    public final Object mo27877b(Field field) {
        int i = field.f39917f;
        if (i == 4) {
            return this.f39027f;
        }
        switch (i) {
            case 1:
                return Integer.valueOf(this.f39024c);
            case 2:
                return this.f39025d;
            default:
                int i2 = field.f39917f;
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Map mo27875a() {
        return f39022a;
    }

    static {
        HashMap<String, Field<?, ?>> hashMap = new HashMap<>();
        f39022a = hashMap;
        Field field = new Field(11, true, 11, true, "authenticatorData", 2, zzr.class, null);
        hashMap.put("authenticatorData", field);
        f39022a.put("progress", Field.m32222a("progress", 4, zzo.class));
    }
}
