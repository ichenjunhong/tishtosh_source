package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public class ClientIdentity extends AbstractSafeParcelable {
    public static final Creator<ClientIdentity> CREATOR = new C15471u();

    /* renamed from: a */
    private final int f39727a;

    /* renamed from: b */
    private final String f39728b;

    public ClientIdentity(int i, String str) {
        this.f39727a = i;
        this.f39728b = str;
    }

    public int hashCode() {
        return this.f39727a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f39727a == this.f39727a && C15462p.m32120a(clientIdentity.f39728b, this.f39728b);
    }

    public String toString() {
        int i = this.f39727a;
        String str = this.f39728b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f39727a);
        C15469b.m32187a(parcel, 2, this.f39728b, false);
        C15469b.m32197c(parcel, a);
    }
}
