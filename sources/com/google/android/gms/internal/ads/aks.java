package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14963ax;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@C16299uq
public final class aks implements Iterable<akq> {

    /* renamed from: a */
    public final List<akq> f40781a = new ArrayList();

    /* renamed from: a */
    public static boolean m33177a(aib aib) {
        akq b = m33178b(aib);
        if (b == null) {
            return false;
        }
        b.f40777b.mo29088a();
        return true;
    }

    /* renamed from: b */
    static akq m33178b(aib aib) {
        Iterator it = C14963ax.m30848r().iterator();
        while (it.hasNext()) {
            akq akq = (akq) it.next();
            if (akq.f40776a == aib) {
                return akq;
            }
        }
        return null;
    }

    public final Iterator<akq> iterator() {
        return this.f40781a.iterator();
    }
}
