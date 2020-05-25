package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.p030v4.p038f.C0777a;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.internal.auth.zzaz;
import java.util.List;
import java.util.Map;

public class zzo extends zzaz {
    public static final Creator<zzo> CREATOR = new C15112b();

    /* renamed from: a */
    private static final C0777a<String, Field<?, ?>> f39028a;

    /* renamed from: b */
    private final int f39029b;

    /* renamed from: c */
    private List<String> f39030c;

    /* renamed from: d */
    private List<String> f39031d;

    /* renamed from: e */
    private List<String> f39032e;

    /* renamed from: f */
    private List<String> f39033f;

    /* renamed from: g */
    private List<String> f39034g;

    public zzo() {
        this.f39029b = 1;
    }

    /* renamed from: a */
    public final boolean mo27876a(Field field) {
        return true;
    }

    zzo(int i, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        this.f39029b = i;
        this.f39030c = list;
        this.f39031d = list2;
        this.f39032e = list3;
        this.f39033f = list4;
        this.f39034g = list5;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f39029b);
        C15469b.m32188a(parcel, 2, this.f39030c, false);
        C15469b.m32188a(parcel, 3, this.f39031d, false);
        C15469b.m32188a(parcel, 4, this.f39032e, false);
        C15469b.m32188a(parcel, 5, this.f39033f, false);
        C15469b.m32188a(parcel, 6, this.f39034g, false);
        C15469b.m32197c(parcel, a);
    }

    /* renamed from: a */
    public final Map<String, Field<?, ?>> mo27875a() {
        return f39028a;
    }

    /* renamed from: b */
    public final Object mo27877b(Field field) {
        switch (field.f39917f) {
            case 1:
                return Integer.valueOf(this.f39029b);
            case 2:
                return this.f39030c;
            case 3:
                return this.f39031d;
            case 4:
                return this.f39032e;
            case 5:
                return this.f39033f;
            case 6:
                return this.f39034g;
            default:
                int i = field.f39917f;
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }

    static {
        C0777a<String, Field<?, ?>> aVar = new C0777a<>();
        f39028a = aVar;
        aVar.put("registered", Field.m32223b("registered", 2));
        f39028a.put("in_progress", Field.m32223b("in_progress", 3));
        f39028a.put("success", Field.m32223b("success", 4));
        f39028a.put("failed", Field.m32223b("failed", 5));
        f39028a.put("escrowed", Field.m32223b("escrowed", 6));
    }
}
