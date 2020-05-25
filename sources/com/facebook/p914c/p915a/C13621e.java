package com.facebook.p914c.p915a;

import android.net.Uri;
import java.util.List;

/* renamed from: com.facebook.c.a.e */
public final class C13621e implements C13619c {

    /* renamed from: a */
    public final List<C13619c> f35534a;

    public final int hashCode() {
        return this.f35534a.hashCode();
    }

    /* renamed from: a */
    public final String mo25470a() {
        return ((C13619c) this.f35534a.get(0)).mo25470a();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiCacheKey:");
        sb.append(this.f35534a.toString());
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo25471a(Uri uri) {
        for (int i = 0; i < this.f35534a.size(); i++) {
            if (((C13619c) this.f35534a.get(i)).mo25471a(uri)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13621e)) {
            return false;
        }
        return this.f35534a.equals(((C13621e) obj).f35534a);
    }
}
