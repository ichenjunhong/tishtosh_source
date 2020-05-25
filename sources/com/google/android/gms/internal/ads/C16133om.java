package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.C14861b;
import com.google.ads.mediation.C14871e;
import com.google.ads.mediation.C14874f;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.C15051b;
import com.google.android.gms.ads.mediation.C15070l;
import com.google.android.gms.ads.mediation.customevent.C15057a;
import com.google.android.gms.ads.mediation.customevent.C15059c;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import java.util.Map;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.om */
public final class C16133om extends C16136op {

    /* renamed from: b */
    private static final C16191qq f45383b = new C16191qq();

    /* renamed from: a */
    public Map<Class<? extends Object>, Object> f45384a;

    /* renamed from: a */
    public final C16138or mo31234a(String str) throws RemoteException {
        return m38198d(str);
    }

    /* renamed from: b */
    public final boolean mo31235b(String str) throws RemoteException {
        try {
            return C15057a.class.isAssignableFrom(Class.forName(str, false, C16133om.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", assuming old implementation.");
            afc.m32798e(sb.toString());
            return false;
        }
    }

    /* renamed from: d */
    private final <NetworkExtrasT extends C14874f, ServerParametersT extends C14871e> C16138or m38198d(String str) throws RemoteException {
        try {
            Class cls = Class.forName(str, false, C16133om.class.getClassLoader());
            if (C14861b.class.isAssignableFrom(cls)) {
                C14861b bVar = (C14861b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                return new C16168pu(bVar, (C14874f) this.f45384a.get(bVar.getAdditionalParametersType()));
            } else if (C15051b.class.isAssignableFrom(cls)) {
                return new C16159pl((C15051b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } else {
                if (C15070l.class.isAssignableFrom(cls)) {
                    return new C16159pl((C15070l) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                afc.m32798e(sb.toString());
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            return m38199e(str);
        }
    }

    /* renamed from: e */
    private final C16138or m38199e(String str) throws RemoteException {
        try {
            afc.m32792b("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new C16159pl((C15051b) new AdMobAdapter());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                return new C16159pl((C15051b) new AdUrlAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new C16159pl((C15051b) new CustomEventAdapter());
            }
            if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                com.google.ads.mediation.customevent.CustomEventAdapter customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
                return new C16168pu(customEventAdapter, (C15059c) this.f45384a.get(customEventAdapter.getAdditionalParametersType()));
            }
            throw new RemoteException();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43);
            sb.append("Could not instantiate mediation adapter: ");
            sb.append(str);
            sb.append(". ");
            afc.m32795c(sb.toString(), th);
        }
    }

    /* renamed from: c */
    public final C16186ql mo31236c(String str) throws RemoteException {
        return C16191qq.m38684a(str);
    }
}
