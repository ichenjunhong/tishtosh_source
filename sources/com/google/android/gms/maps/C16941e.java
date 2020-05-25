package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.C15373d;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.internal.p1045f.C16496f;
import com.google.android.gms.maps.model.C16953b;
import com.google.android.gms.maps.model.C16955d;
import com.google.android.gms.maps.p1046a.C16910a;
import com.google.android.gms.maps.p1046a.C16925p;
import com.google.android.gms.maps.p1046a.C16926q;

/* renamed from: com.google.android.gms.maps.e */
public final class C16941e {

    /* renamed from: a */
    private static boolean f47720a;

    /* renamed from: a */
    public static synchronized int m41107a(Context context) {
        synchronized (C16941e.class) {
            C15464q.m32124a(context, (Object) "Context is null");
            if (f47720a) {
                return 0;
            }
            try {
                C16926q a = C16925p.m41039a(context);
                try {
                    C16932b.f47709a = (C16910a) C15464q.m32123a(a.mo32655N_());
                    C16496f b = a.mo32658b();
                    if (C16953b.f47843a == null) {
                        C16953b.f47843a = (C16496f) C15464q.m32123a(b);
                    }
                    f47720a = true;
                    return 0;
                } catch (RemoteException e) {
                    throw new C16955d(e);
                }
            } catch (C15373d e2) {
                return e2.errorCode;
            }
        }
    }
}
