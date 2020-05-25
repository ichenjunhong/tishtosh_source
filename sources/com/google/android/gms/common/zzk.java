package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C15418ai;
import com.google.android.gms.common.internal.C15420ak;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;

public final class zzk extends AbstractSafeParcelable {
    public static final Creator<zzk> CREATOR = new C15534v();

    /* renamed from: a */
    private final String f40017a;

    /* renamed from: b */
    private final C15483p f40018b;

    /* renamed from: c */
    private final boolean f40019c;

    zzk(String str, IBinder iBinder, boolean z) {
        this.f40017a = str;
        this.f40018b = m32330a(iBinder);
        this.f40019c = z;
    }

    zzk(String str, C15483p pVar, boolean z) {
        this.f40017a = str;
        this.f40018b = pVar;
        this.f40019c = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = C15469b.m32174a(parcel);
        C15469b.m32187a(parcel, 1, this.f40017a, false);
        if (this.f40018b == null) {
            iBinder = null;
        } else {
            iBinder = this.f40018b.asBinder();
        }
        C15469b.m32182a(parcel, 2, iBinder, false);
        C15469b.m32189a(parcel, 3, this.f40019c);
        C15469b.m32197c(parcel, a);
    }

    /* renamed from: a */
    private static C15483p m32330a(IBinder iBinder) {
        C15418ai aiVar;
        byte[] bArr;
        C15484q qVar = null;
        if (iBinder == null) {
            return null;
        }
        if (iBinder == null) {
            aiVar = null;
        } else {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                if (queryLocalInterface instanceof C15418ai) {
                    aiVar = (C15418ai) queryLocalInterface;
                } else {
                    aiVar = new C15420ak(iBinder);
                }
            } catch (RemoteException unused) {
                return null;
            }
        }
        C14882b a = aiVar.mo28387a();
        if (a == null) {
            bArr = null;
        } else {
            bArr = (byte[]) C14886d.m30545a(a);
        }
        if (bArr != null) {
            qVar = new C15484q(bArr);
        }
        return qVar;
    }
}
