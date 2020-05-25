package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.credentials.b */
public final class C15121b implements Creator<Credential> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new Credential[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        List list = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    str = C15467a.m32163n(parcel, a);
                    break;
                case 2:
                    str2 = C15467a.m32163n(parcel, a);
                    break;
                case 3:
                    uri = (Uri) C15467a.m32145a(parcel, a, Uri.CREATOR);
                    break;
                case 4:
                    list = C15467a.m32151c(parcel, a, IdToken.CREATOR);
                    break;
                case 5:
                    str3 = C15467a.m32163n(parcel, a);
                    break;
                case 6:
                    str4 = C15467a.m32163n(parcel, a);
                    break;
                case 9:
                    str5 = C15467a.m32163n(parcel, a);
                    break;
                case 10:
                    str6 = C15467a.m32163n(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        Credential credential = new Credential(str, str2, uri, list, str3, str4, str5, str6);
        return credential;
    }
}
