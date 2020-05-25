package com.google.android.gms.maps.p1046a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.C15373d;
import com.google.android.gms.common.C15383f;
import com.google.android.gms.common.C15384g;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.model.C16955d;
import com.google.android.gms.p1027a.C14886d;

/* renamed from: com.google.android.gms.maps.a.p */
public class C16925p {

    /* renamed from: a */
    private static final String f47706a = "p";

    /* renamed from: b */
    private static Context f47707b;

    /* renamed from: c */
    private static C16926q f47708c;

    /* renamed from: a */
    private static <T> T m41040a(Class<?> cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException unused) {
            String str = "Unable to instantiate the dynamic class ";
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        } catch (IllegalAccessException unused2) {
            String str2 = "Unable to call the default constructor of ";
            String valueOf2 = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
        }
    }

    /* renamed from: a */
    private static <T> T m41041a(ClassLoader classLoader, String str) {
        try {
            return m41040a(((ClassLoader) C15464q.m32123a(classLoader)).loadClass(str));
        } catch (ClassNotFoundException unused) {
            String str2 = "Unable to find dynamic class ";
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    /* renamed from: b */
    private static Context m41042b(Context context) {
        if (f47707b != null) {
            return f47707b;
        }
        Context c = m41043c(context);
        f47707b = c;
        return c;
    }

    /* renamed from: a */
    public static C16926q m41039a(Context context) throws C15373d {
        C16926q qVar;
        C15464q.m32123a(context);
        if (f47708c != null) {
            return f47708c;
        }
        int a = C15384g.m31956a(context, (int) C15384g.f39685b);
        if (a == 0) {
            IBinder iBinder = (IBinder) m41041a(m41042b(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl");
            if (iBinder == null) {
                qVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                qVar = queryLocalInterface instanceof C16926q ? (C16926q) queryLocalInterface : new C16927r(iBinder);
            }
            f47708c = qVar;
            try {
                f47708c.mo32657a(C14886d.m30544a(m41042b(context).getResources()), C15383f.f39683a);
                return f47708c;
            } catch (RemoteException e) {
                throw new C16955d(e);
            }
        } else {
            throw new C15373d(a);
        }
    }

    /* renamed from: c */
    private static Context m41043c(Context context) {
        try {
            return DynamiteModule.m32334a(context, DynamiteModule.f40020a, "com.google.android.gms.maps_dynamite").f40033e;
        } catch (Throwable unused) {
            return C15384g.m31963c(context);
        }
    }
}
