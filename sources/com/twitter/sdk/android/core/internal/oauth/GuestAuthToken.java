package com.twitter.sdk.android.core.internal.oauth;

import com.google.gson.p1076a.C17952c;

public class GuestAuthToken extends OAuth2Token {
    @C17952c(mo34828a = "guest_token")

    /* renamed from: b */
    public final String f129749b;

    /* renamed from: a */
    public final boolean mo108827a() {
        if (System.currentTimeMillis() >= this.f129651a + 10800000) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        if (this.f129749b != null) {
            i = this.f129749b.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        GuestAuthToken guestAuthToken = (GuestAuthToken) obj;
        if (this.f129749b == null ? guestAuthToken.f129749b == null : this.f129749b.equals(guestAuthToken.f129749b)) {
            return true;
        }
        return false;
    }

    public GuestAuthToken(String str, String str2, String str3) {
        super(str, str2);
        this.f129749b = str3;
    }
}
