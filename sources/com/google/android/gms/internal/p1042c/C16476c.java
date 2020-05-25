package com.google.android.gms.internal.p1042c;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.google.android.gms.internal.c.c */
public class C16476c {

    /* renamed from: a */
    private static final ClassLoader f46379a = C16476c.class.getClassLoader();

    private C16476c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m39341a(Parcel parcel, Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m39342a(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
