package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.internal.ads.amq.C15587a;

public final class zzbqq extends AbstractSafeParcelable {
    public static final Creator<zzbqq> CREATOR = new apc();

    /* renamed from: a */
    private final int f46247a;

    /* renamed from: b */
    private C15587a f46248b;

    /* renamed from: c */
    private byte[] f46249c;

    zzbqq(int i, byte[] bArr) {
        this.f46247a = i;
        this.f46249c = bArr;
        m39279b();
    }

    /* renamed from: a */
    public final C15587a mo31596a() {
        if (!(this.f46248b != null)) {
            try {
                this.f46248b = C15587a.m33509a(this.f46249c, axm.m34647b());
                this.f46249c = null;
            } catch (ayi e) {
                throw new IllegalStateException(e);
            }
        }
        m39279b();
        return this.f46248b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr;
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f46247a);
        if (this.f46249c != null) {
            bArr = this.f46249c;
        } else {
            bArr = this.f46248b.mo29580f();
        }
        C15469b.m32190a(parcel, 2, bArr, false);
        C15469b.m32197c(parcel, a);
    }

    /* renamed from: b */
    private final void m39279b() {
        if (this.f46248b == null && this.f46249c != null) {
            return;
        }
        if (this.f46248b != null && this.f46249c == null) {
            return;
        }
        if (this.f46248b != null && this.f46249c != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (this.f46248b == null && this.f46249c == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }
}
