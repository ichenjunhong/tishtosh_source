package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.C15384g;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

public abstract class cae<T> {

    /* renamed from: a */
    private static final C16228s f44758a = m37089c();

    cae() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo30884a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo30885a(C16228s sVar) throws RemoteException;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo30886b() throws RemoteException;

    /* renamed from: c */
    private static C16228s m37089c() {
        try {
            Object newInstance = bzy.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
            if (!(newInstance instanceof IBinder)) {
                afc.m32798e("ClientApi class is not an instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
            if (queryLocalInterface instanceof C16228s) {
                return (C16228s) queryLocalInterface;
            }
            return new C16282u(iBinder);
        } catch (Exception unused) {
            afc.m32798e("Failed to instantiate ClientApi class.");
            return null;
        }
    }

    /* renamed from: d */
    private final T m37090d() {
        if (f44758a == null) {
            afc.m32798e("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return mo30885a(f44758a);
        } catch (RemoteException e) {
            afc.m32795c("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    /* renamed from: e */
    private final T m37091e() {
        try {
            return mo30886b();
        } catch (RemoteException e) {
            afc.m32795c("Cannot invoke remote loader.", e);
            return null;
        }
    }

    /* renamed from: a */
    public final T mo30891a(Context context, boolean z) {
        T t;
        boolean z2 = true;
        if (!z && !aes.m32765c(context, C15384g.f39685b)) {
            afc.m32792b("Google Play Services is not available.");
            z = true;
        }
        if (DynamiteModule.m32331a(context, ModuleDescriptor.MODULE_ID) > DynamiteModule.m32339b(context, ModuleDescriptor.MODULE_ID)) {
            z = true;
        }
        C15740bx.m36941a(context);
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44332cM)).booleanValue()) {
            z = false;
        }
        if (z) {
            t = m37090d();
            if (t == null) {
                t = m37091e();
            }
        } else {
            T e = m37091e();
            int i = e == null ? 1 : 0;
            if (i != 0) {
                if (caf.f44759a.f44760b.nextInt(((Integer) caf.m37099d().mo30717a(C15740bx.f44402dd)).intValue()) != 0) {
                    z2 = false;
                }
                if (z2) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", i);
                    caf.m37096a().mo28761a(context, caf.m37101f().f46237a, "gmob-apps", bundle, true);
                }
            }
            t = e == null ? m37090d() : e;
        }
        return t == null ? mo30884a() : t;
    }
}
