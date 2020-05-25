package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C15369c;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C15453l.C15454a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Creator<GetServiceRequest> CREATOR = new C15414ae();

    /* renamed from: a */
    String f39732a;

    /* renamed from: b */
    IBinder f39733b;

    /* renamed from: c */
    Scope[] f39734c;

    /* renamed from: d */
    public Bundle f39735d;

    /* renamed from: e */
    Account f39736e;

    /* renamed from: f */
    Feature[] f39737f;

    /* renamed from: g */
    Feature[] f39738g;

    /* renamed from: h */
    private final int f39739h;

    /* renamed from: i */
    private final int f39740i;

    /* renamed from: j */
    private int f39741j;

    /* renamed from: k */
    private boolean f39742k;

    public GetServiceRequest(int i) {
        this.f39739h = 4;
        this.f39741j = C15369c.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        this.f39740i = i;
        this.f39742k = true;
    }

    GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z) {
        this.f39739h = i;
        this.f39740i = i2;
        this.f39741j = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f39732a = "com.google.android.gms";
        } else {
            this.f39732a = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                account2 = C15395a.m31981a(C15454a.m32109a(iBinder));
            }
            this.f39736e = account2;
        } else {
            this.f39733b = iBinder;
            this.f39736e = account;
        }
        this.f39734c = scopeArr;
        this.f39735d = bundle;
        this.f39737f = featureArr;
        this.f39738g = featureArr2;
        this.f39742k = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f39739h);
        C15469b.m32195b(parcel, 2, this.f39740i);
        C15469b.m32195b(parcel, 3, this.f39741j);
        C15469b.m32187a(parcel, 4, this.f39732a, false);
        C15469b.m32182a(parcel, 5, this.f39733b, false);
        C15469b.m32191a(parcel, 6, (T[]) this.f39734c, i, false);
        C15469b.m32181a(parcel, 7, this.f39735d, false);
        C15469b.m32183a(parcel, 8, (Parcelable) this.f39736e, i, false);
        C15469b.m32191a(parcel, 10, (T[]) this.f39737f, i, false);
        C15469b.m32191a(parcel, 11, (T[]) this.f39738g, i, false);
        C15469b.m32189a(parcel, 12, this.f39742k);
        C15469b.m32197c(parcel, a);
    }
}
