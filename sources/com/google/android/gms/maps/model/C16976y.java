package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.maps.model.y */
public final class C16976y implements Creator<TileOverlayOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        IBinder iBinder = null;
        boolean z = false;
        float f = 0.0f;
        boolean z2 = true;
        float f2 = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 2:
                    iBinder = C15467a.m32164o(parcel, a);
                    break;
                case 3:
                    z = C15467a.m32152c(parcel, a);
                    break;
                case 4:
                    f = C15467a.m32159j(parcel, a);
                    break;
                case 5:
                    z2 = C15467a.m32152c(parcel, a);
                    break;
                case 6:
                    f2 = C15467a.m32159j(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions(iBinder, z, f, z2, f2);
        return tileOverlayOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TileOverlayOptions[i];
    }
}
