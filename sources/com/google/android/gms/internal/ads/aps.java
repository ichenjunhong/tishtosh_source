package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class aps {

    /* renamed from: a */
    private static final CopyOnWriteArrayList<apr> f41200a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public static apr m33891a(String str) throws GeneralSecurityException {
        Iterator it = f41200a.iterator();
        while (it.hasNext()) {
            apr apr = (apr) it.next();
            if (apr.mo29458a(str)) {
                return apr;
            }
        }
        String str2 = "No KMS client does support: ";
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
