package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.auth.api.proxy.b */
public final class C15132b implements Creator<ProxyRequest> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        String str = null;
        byte[] bArr = null;
        Bundle bundle = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            int a2 = C15467a.m32142a(a);
            if (a2 != 1000) {
                switch (a2) {
                    case 1:
                        str = C15467a.m32163n(parcel, a);
                        break;
                    case 2:
                        i2 = C15467a.m32154e(parcel, a);
                        break;
                    case 3:
                        j = C15467a.m32156g(parcel, a);
                        break;
                    case 4:
                        bArr = C15467a.m32166q(parcel, a);
                        break;
                    case 5:
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
        ProxyRequest proxyRequest = new ProxyRequest(i, str, i2, j, bArr, bundle);
        return proxyRequest;
    }
}
