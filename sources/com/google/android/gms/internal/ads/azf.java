package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

final class azf implements aze {
    azf() {
    }

    /* renamed from: a */
    public final Map<?, ?> mo29883a(Object obj) {
        return (azd) obj;
    }

    /* renamed from: f */
    public final azc<?, ?> mo29888f(Object obj) {
        throw new NoSuchMethodError();
    }

    /* renamed from: b */
    public final Map<?, ?> mo29884b(Object obj) {
        return (azd) obj;
    }

    /* renamed from: c */
    public final boolean mo29885c(Object obj) {
        return !((azd) obj).isMutable();
    }

    /* renamed from: d */
    public final Object mo29886d(Object obj) {
        ((azd) obj).zzara();
        return obj;
    }

    /* renamed from: e */
    public final Object mo29887e(Object obj) {
        return azd.zzauk().zzaul();
    }

    /* renamed from: a */
    public final Object mo29882a(Object obj, Object obj2) {
        azd azd = (azd) obj;
        azd azd2 = (azd) obj2;
        if (!azd2.isEmpty()) {
            if (!azd.isMutable()) {
                azd = azd.zzaul();
            }
            azd.zza(azd2);
        }
        return azd;
    }

    /* renamed from: a */
    public final int mo29881a(int i, Object obj, Object obj2) {
        azd azd = (azd) obj;
        if (azd.isEmpty()) {
            return 0;
        }
        Iterator it = azd.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Entry entry = (Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
