package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.auth.api.proxy.c */
public final class C15133c implements Creator<ProxyResponse> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyResponse[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        PendingIntent pendingIntent = null;
        Bundle bundle = null;
        byte[] bArr = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            int a2 = C15467a.m32142a(a);
            if (a2 != 1000) {
                switch (a2) {
                    case 1:
                        i2 = C15467a.m32154e(parcel, a);
                        break;
                    case 2:
                        pendingIntent = (PendingIntent) C15467a.m32145a(parcel, a, PendingIntent.CREATOR);
                        break;
                    case 3:
                        i3 = C15467a.m32154e(parcel, a);
                        break;
                    case 4:
                        bundle = C15467a.m32165p(parcel, a);
                        break;
                    case 5:
                        bArr = C15467a.m32166q(parcel, a);
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
        ProxyResponse proxyResponse = new ProxyResponse(i, i2, pendingIntent, i3, bundle, bArr);
        return proxyResponse;
    }
}
