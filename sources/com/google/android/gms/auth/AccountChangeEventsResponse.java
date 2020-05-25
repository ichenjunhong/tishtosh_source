package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.util.List;

public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Creator<AccountChangeEventsResponse> CREATOR = new C15170c();

    /* renamed from: a */
    public final List<AccountChangeEvent> f38993a;

    /* renamed from: b */
    private final int f38994b;

    AccountChangeEventsResponse(int i, List<AccountChangeEvent> list) {
        this.f38994b = i;
        this.f38993a = (List) C15464q.m32123a(list);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f38994b);
        C15469b.m32196b(parcel, 2, this.f38993a, false);
        C15469b.m32197c(parcel, a);
    }
}
