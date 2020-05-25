package com.google.android.gms.p1027a;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.C15384g;
import com.google.android.gms.common.internal.C15464q;

/* renamed from: com.google.android.gms.a.f */
public abstract class C14888f<T> {

    /* renamed from: a */
    private final String f38417a;

    /* renamed from: b */
    private T f38418b;

    /* renamed from: com.google.android.gms.a.f$a */
    public static class C14889a extends Exception {
        public C14889a(String str) {
            super(str);
        }

        public C14889a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected C14888f(String str) {
        this.f38417a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo27254a(IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final T mo27253a(Context context) throws C14889a {
        if (this.f38418b == null) {
            C15464q.m32123a(context);
            Context c = C15384g.m31963c(context);
            if (c != null) {
                try {
                    this.f38418b = mo27254a((IBinder) c.getClassLoader().loadClass(this.f38417a).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new C14889a("Could not load creator class.", e);
                } catch (InstantiationException e2) {
                    throw new C14889a("Could not instantiate creator.", e2);
                } catch (IllegalAccessException e3) {
                    throw new C14889a("Could not access creator.", e3);
                }
            } else {
                throw new C14889a("Could not get remote context.");
            }
        }
        return this.f38418b;
    }
}
