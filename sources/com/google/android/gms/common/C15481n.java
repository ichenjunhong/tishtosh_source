package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import com.google.android.gms.common.internal.C15422am;
import com.google.android.gms.common.internal.C15423an;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.C15538a;
import com.google.android.gms.p1027a.C14886d;

/* renamed from: com.google.android.gms.common.n */
final class C15481n {

    /* renamed from: a */
    private static volatile C15422am f39889a;

    /* renamed from: b */
    private static final Object f39890b = new Object();

    /* renamed from: c */
    private static Context f39891c;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void m32204a(android.content.Context r2) {
        /*
            java.lang.Class<com.google.android.gms.common.n> r0 = com.google.android.gms.common.C15481n.class
            monitor-enter(r0)
            android.content.Context r1 = f39891c     // Catch:{ all -> 0x0013 }
            if (r1 != 0) goto L_0x0011
            if (r2 == 0) goto L_0x0011
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0013 }
            f39891c = r2     // Catch:{ all -> 0x0013 }
            monitor-exit(r0)
            return
        L_0x0011:
            monitor-exit(r0)
            return
        L_0x0013:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C15481n.m32204a(android.content.Context):void");
    }

    /* renamed from: a */
    static C15535w m32203a(String str, C15483p pVar, boolean z) {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m32205b(str, pVar, z);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: b */
    static C15535w m32205b(String str, C15483p pVar, boolean z) {
        C15422am amVar;
        try {
            if (f39889a == null) {
                C15464q.m32123a(f39891c);
                synchronized (f39890b) {
                    if (f39889a == null) {
                        IBinder a = DynamiteModule.m32334a(f39891c, DynamiteModule.f40022c, "com.google.android.gms.googlecertificates").mo28530a("com.google.android.gms.common.GoogleCertificatesImpl");
                        if (a == null) {
                            amVar = null;
                        } else {
                            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                            if (queryLocalInterface instanceof C15422am) {
                                amVar = (C15422am) queryLocalInterface;
                            } else {
                                amVar = new C15423an(a);
                            }
                        }
                        f39889a = amVar;
                    }
                }
            }
            C15464q.m32123a(f39891c);
            try {
                if (f39889a.mo28393a(new zzk(str, pVar, z), C14886d.m30544a(f39891c.getPackageManager()))) {
                    return C15535w.f40012a;
                }
                return new C15537y(new C15482o(z, str, pVar));
            } catch (RemoteException e) {
                return C15535w.m32329a("module call", e);
            }
        } catch (C15538a e2) {
            String str2 = "module init: ";
            String valueOf = String.valueOf(e2.getMessage());
            return C15535w.m32329a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e2);
        }
    }
}
