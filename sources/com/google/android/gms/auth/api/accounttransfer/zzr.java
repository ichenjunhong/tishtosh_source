package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class zzr extends zzaz {
    public static final Creator<zzr> CREATOR = new C15113c();

    /* renamed from: a */
    private static final HashMap<String, Field<?, ?>> f39035a;

    /* renamed from: b */
    private final Set<Integer> f39036b;

    /* renamed from: c */
    private final int f39037c;

    /* renamed from: d */
    private zzt f39038d;

    /* renamed from: e */
    private String f39039e;

    /* renamed from: f */
    private String f39040f;

    /* renamed from: g */
    private String f39041g;

    public zzr() {
        this.f39036b = new HashSet(3);
        this.f39037c = 1;
    }

    zzr(Set<Integer> set, int i, zzt zzt, String str, String str2, String str3) {
        this.f39036b = set;
        this.f39037c = i;
        this.f39038d = zzt;
        this.f39039e = str;
        this.f39040f = str2;
        this.f39041g = str3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        Set<Integer> set = this.f39036b;
        if (set.contains(Integer.valueOf(1))) {
            C15469b.m32195b(parcel, 1, this.f39037c);
        }
        if (set.contains(Integer.valueOf(2))) {
            C15469b.m32183a(parcel, 2, (Parcelable) this.f39038d, i, true);
        }
        if (set.contains(Integer.valueOf(3))) {
            C15469b.m32187a(parcel, 3, this.f39039e, true);
        }
        if (set.contains(Integer.valueOf(4))) {
            C15469b.m32187a(parcel, 4, this.f39040f, true);
        }
        if (set.contains(Integer.valueOf(5))) {
            C15469b.m32187a(parcel, 5, this.f39041g, true);
        }
        C15469b.m32197c(parcel, a);
    }

    /* renamed from: a */
    public final boolean mo27876a(Field field) {
        return this.f39036b.contains(Integer.valueOf(field.f39917f));
    }

    /* renamed from: b */
    public final Object mo27877b(Field field) {
        switch (field.f39917f) {
            case 1:
                return Integer.valueOf(this.f39037c);
            case 2:
                return this.f39038d;
            case 3:
                return this.f39039e;
            case 4:
                return this.f39040f;
            default:
                int i = field.f39917f;
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Map mo27875a() {
        return f39035a;
    }

    static {
        HashMap<String, Field<?, ?>> hashMap = new HashMap<>();
        f39035a = hashMap;
        hashMap.put("authenticatorInfo", Field.m32222a("authenticatorInfo", 2, zzt.class));
        f39035a.put("signature", Field.m32221a("signature", 3));
        f39035a.put("package", Field.m32221a("package", 4));
    }
}
