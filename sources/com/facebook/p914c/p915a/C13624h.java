package com.facebook.p914c.p915a;

import android.net.Uri;
import com.facebook.common.p920d.C13689i;

/* renamed from: com.facebook.c.a.h */
public final class C13624h implements C13619c {

    /* renamed from: a */
    final String f35537a;

    /* renamed from: a */
    public final String mo25470a() {
        return this.f35537a;
    }

    public final String toString() {
        return this.f35537a;
    }

    public final int hashCode() {
        return this.f35537a.hashCode();
    }

    public C13624h(String str) {
        this.f35537a = (String) C13689i.m27652a(str);
    }

    /* renamed from: a */
    public final boolean mo25471a(Uri uri) {
        return this.f35537a.contains(uri.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13624h)) {
            return false;
        }
        return this.f35537a.equals(((C13624h) obj).f35537a);
    }
}
