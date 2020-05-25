package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.location.zzj;
import java.util.Collections;
import java.util.List;

public final class zzm extends AbstractSafeParcelable {
    public static final Creator<zzm> CREATOR = new C16528z();

    /* renamed from: a */
    static final List<ClientIdentity> f46437a = Collections.emptyList();

    /* renamed from: b */
    static final zzj f46438b = new zzj();

    /* renamed from: c */
    private zzj f46439c;

    /* renamed from: d */
    private List<ClientIdentity> f46440d;

    /* renamed from: e */
    private String f46441e;

    zzm(zzj zzj, List<ClientIdentity> list, String str) {
        this.f46439c = zzj;
        this.f46440d = list;
        this.f46441e = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzm = (zzm) obj;
        return C15462p.m32120a(this.f46439c, zzm.f46439c) && C15462p.m32120a(this.f46440d, zzm.f46440d) && C15462p.m32120a(this.f46441e, zzm.f46441e);
    }

    public final int hashCode() {
        return this.f46439c.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32183a(parcel, 1, (Parcelable) this.f46439c, i, false);
        C15469b.m32196b(parcel, 2, this.f46440d, false);
        C15469b.m32187a(parcel, 3, this.f46441e, false);
        C15469b.m32197c(parcel, a);
    }
}
