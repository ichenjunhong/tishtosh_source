package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.common.data.c */
public final class C15381c implements Creator<DataHolder> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            int a2 = C15467a.m32142a(a);
            if (a2 != 1000) {
                switch (a2) {
                    case 1:
                        strArr = C15467a.m32169t(parcel, a);
                        break;
                    case 2:
                        cursorWindowArr = (CursorWindow[]) C15467a.m32150b(parcel, a, CursorWindow.CREATOR);
                        break;
                    case 3:
                        i2 = C15467a.m32154e(parcel, a);
                        break;
                    case 4:
                        bundle = C15467a.m32165p(parcel, a);
                        break;
                    default:
                        C15467a.m32149b(parcel, a);
                        break;
                }
            } else {
                i = C15467a.m32154e(parcel, a);
            }
        }
        C15467a.m32173x(parcel, b);
        DataHolder dataHolder = new DataHolder(i, strArr, cursorWindowArr, i2, bundle);
        dataHolder.f39667b = new Bundle();
        for (int i3 = 0; i3 < dataHolder.f39666a.length; i3++) {
            dataHolder.f39667b.putInt(dataHolder.f39666a[i3], i3);
        }
        dataHolder.f39671f = new int[dataHolder.f39668c.length];
        int i4 = 0;
        for (int i5 = 0; i5 < dataHolder.f39668c.length; i5++) {
            dataHolder.f39671f[i5] = i4;
            i4 += dataHolder.f39668c[i5].getNumRows() - (i4 - dataHolder.f39668c[i5].getStartPosition());
        }
        dataHolder.f39672g = i4;
        return dataHolder;
    }
}
