package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.io.InputStream;

@C16299uq
public final class zzwo extends AbstractSafeParcelable {
    public static final Creator<zzwo> CREATOR = new bxm();

    /* renamed from: a */
    private ParcelFileDescriptor f46306a;

    public zzwo() {
        this(null);
    }

    public zzwo(ParcelFileDescriptor parcelFileDescriptor) {
        this.f46306a = parcelFileDescriptor;
    }

    /* renamed from: a */
    public final synchronized boolean mo31638a() {
        return this.f46306a != null;
    }

    /* renamed from: b */
    public final synchronized InputStream mo31639b() {
        if (this.f46306a == null) {
            return null;
        }
        AutoCloseInputStream autoCloseInputStream = new AutoCloseInputStream(this.f46306a);
        this.f46306a = null;
        return autoCloseInputStream;
    }

    /* renamed from: c */
    private final synchronized ParcelFileDescriptor m39295c() {
        return this.f46306a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32183a(parcel, 2, (Parcelable) m39295c(), i, false);
        C15469b.m32197c(parcel, a);
    }
}
