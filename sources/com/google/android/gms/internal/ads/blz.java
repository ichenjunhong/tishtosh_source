package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class blz {

    /* renamed from: a */
    public final String f42900a;

    /* renamed from: b */
    public final String f42901b;

    public blz(String str, String str2) {
        this.f42900a = str;
        this.f42901b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        blz blz = (blz) obj;
        return TextUtils.equals(this.f42900a, blz.f42900a) && TextUtils.equals(this.f42901b, blz.f42901b);
    }

    public final int hashCode() {
        return (this.f42900a.hashCode() * 31) + this.f42901b.hashCode();
    }

    public final String toString() {
        String str = this.f42900a;
        String str2 = this.f42901b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
