package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p030v4.p038f.C0779b;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class zzt extends zzaz {
    public static final Creator<zzt> CREATOR = new C15114d();

    /* renamed from: a */
    private static final HashMap<String, Field<?, ?>> f39042a;

    /* renamed from: b */
    private final Set<Integer> f39043b;

    /* renamed from: c */
    private final int f39044c;

    /* renamed from: d */
    private String f39045d;

    /* renamed from: e */
    private int f39046e;

    /* renamed from: f */
    private byte[] f39047f;

    /* renamed from: g */
    private PendingIntent f39048g;

    /* renamed from: h */
    private DeviceMetaData f39049h;

    zzt(Set<Integer> set, int i, String str, int i2, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.f39043b = set;
        this.f39044c = i;
        this.f39045d = str;
        this.f39046e = i2;
        this.f39047f = bArr;
        this.f39048g = pendingIntent;
        this.f39049h = deviceMetaData;
    }

    public zzt() {
        this.f39043b = new C0779b(3);
        this.f39044c = 1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        Set<Integer> set = this.f39043b;
        if (set.contains(Integer.valueOf(1))) {
            C15469b.m32195b(parcel, 1, this.f39044c);
        }
        if (set.contains(Integer.valueOf(2))) {
            C15469b.m32187a(parcel, 2, this.f39045d, true);
        }
        if (set.contains(Integer.valueOf(3))) {
            C15469b.m32195b(parcel, 3, this.f39046e);
        }
        if (set.contains(Integer.valueOf(4))) {
            C15469b.m32190a(parcel, 4, this.f39047f, true);
        }
        if (set.contains(Integer.valueOf(5))) {
            C15469b.m32183a(parcel, 5, (Parcelable) this.f39048g, i, true);
        }
        if (set.contains(Integer.valueOf(6))) {
            C15469b.m32183a(parcel, 6, (Parcelable) this.f39049h, i, true);
        }
        C15469b.m32197c(parcel, a);
    }

    /* renamed from: a */
    public final boolean mo27876a(Field field) {
        return this.f39043b.contains(Integer.valueOf(field.f39917f));
    }

    /* renamed from: b */
    public final Object mo27877b(Field field) {
        switch (field.f39917f) {
            case 1:
                return Integer.valueOf(this.f39044c);
            case 2:
                return this.f39045d;
            case 3:
                return Integer.valueOf(this.f39046e);
            case 4:
                return this.f39047f;
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
        return f39042a;
    }

    static {
        HashMap<String, Field<?, ?>> hashMap = new HashMap<>();
        f39042a = hashMap;
        hashMap.put("accountType", Field.m32221a("accountType", 2));
        Field field = new Field(0, false, 0, false, "status", 3, null, null);
        f39042a.put("status", field);
        Field field2 = new Field(8, false, 8, false, "transferBytes", 4, null, null);
        f39042a.put("transferBytes", field2);
    }
}
