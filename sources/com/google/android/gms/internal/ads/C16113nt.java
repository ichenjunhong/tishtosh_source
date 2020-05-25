package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.measurement.C15044a.C15045a;
import com.google.android.gms.internal.measurement.C16596cm;
import com.google.android.gms.internal.measurement.C16596cm.C16597a;
import com.google.android.gms.internal.measurement.C16601co;
import com.google.android.gms.internal.measurement.C16602cp;
import com.google.android.gms.internal.measurement.C16603cq;
import com.google.android.gms.internal.measurement.C16604cr;
import com.google.android.gms.internal.measurement.C16605cs;
import com.google.android.gms.internal.measurement.C16606ct;
import com.google.android.gms.internal.measurement.C16607cu;
import com.google.android.gms.internal.measurement.C16609cw;
import com.google.android.gms.internal.measurement.C16610cx;
import com.google.android.gms.internal.measurement.C16611cy;
import com.google.android.gms.internal.measurement.C16615db;
import com.google.android.gms.internal.measurement.C16616dc;
import com.google.android.gms.internal.measurement.C16617dd;
import com.google.android.gms.internal.measurement.C16618de;
import com.google.android.gms.measurement.p1047a.C16979a;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.nt */
public final class C16113nt extends C15045a {

    /* renamed from: a */
    static final Object f45265a = new Object();

    /* renamed from: b */
    static C16113nt f45266b;

    /* renamed from: c */
    private final C16979a f45267c;

    C16113nt(C16979a aVar) {
        this.f45267c = aVar;
    }

    /* renamed from: a */
    public final void mo27733a(Bundle bundle) throws RemoteException {
        this.f45267c.f47853a.mo31897a(bundle, false);
    }

    /* renamed from: b */
    public final Bundle mo27737b(Bundle bundle) throws RemoteException {
        return this.f45267c.f47853a.mo31897a(bundle, true);
    }

    /* renamed from: a */
    public final void mo27735a(String str, String str2, Bundle bundle) throws RemoteException {
        C16596cm cmVar = this.f45267c.f47853a;
        C16616dc dcVar = new C16616dc(cmVar, null, str, str2, bundle, true, true);
        cmVar.mo31900a((C16598b) dcVar);
    }

    /* renamed from: a */
    public final void mo27736a(String str, String str2, C14882b bVar) throws RemoteException {
        Object obj;
        C16979a aVar = this.f45267c;
        if (bVar != null) {
            obj = C14886d.m30545a(bVar);
        } else {
            obj = null;
        }
        Object obj2 = obj;
        C16596cm cmVar = aVar.f47853a;
        C16617dd ddVar = new C16617dd(cmVar, str, str2, obj2, true);
        cmVar.mo31900a((C16598b) ddVar);
    }

    /* renamed from: a */
    public final Map mo27732a(String str, String str2, boolean z) throws RemoteException {
        C16596cm cmVar = this.f45267c.f47853a;
        C16597a aVar = new C16597a();
        C16611cy cyVar = new C16611cy(cmVar, str, str2, z, aVar);
        cmVar.mo31900a((C16598b) cyVar);
        Bundle b = aVar.mo31903b(5000);
        if (b == null || b.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(b.size());
        for (String str3 : b.keySet()) {
            Object obj = b.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final int mo27729a(String str) throws RemoteException {
        C16596cm cmVar = this.f45267c.f47853a;
        C16597a aVar = new C16597a();
        cmVar.mo31900a((C16598b) new C16615db(cmVar, str, aVar));
        Integer num = (Integer) aVar.mo31901a(aVar.mo31903b(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: c */
    public final void mo27742c(Bundle bundle) throws RemoteException {
        C16596cm cmVar = this.f45267c.f47853a;
        cmVar.mo31900a((C16598b) new C16618de(cmVar, bundle));
    }

    /* renamed from: b */
    public final void mo27740b(String str, String str2, Bundle bundle) throws RemoteException {
        C16596cm cmVar = this.f45267c.f47853a;
        cmVar.mo31900a((C16598b) new C16601co(cmVar, str, str2, bundle));
    }

    /* renamed from: a */
    public final List mo27731a(String str, String str2) throws RemoteException {
        C16596cm cmVar = this.f45267c.f47853a;
        C16597a aVar = new C16597a();
        cmVar.mo31900a((C16598b) new C16602cp(cmVar, str, str2, aVar));
        List list = (List) aVar.mo31901a(aVar.mo31903b(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    public final String mo27730a() throws RemoteException {
        C16596cm cmVar = this.f45267c.f47853a;
        C16597a aVar = new C16597a();
        cmVar.mo31900a((C16598b) new C16607cu(cmVar, aVar));
        return aVar.mo31902a(50);
    }

    /* renamed from: b */
    public final String mo27738b() throws RemoteException {
        C16596cm cmVar = this.f45267c.f47853a;
        C16597a aVar = new C16597a();
        cmVar.mo31900a((C16598b) new C16606ct(cmVar, aVar));
        return aVar.mo31902a(500);
    }

    /* renamed from: c */
    public final long mo27741c() throws RemoteException {
        return this.f45267c.f47853a.mo31896a();
    }

    /* renamed from: b */
    public final void mo27739b(String str) throws RemoteException {
        C16596cm cmVar = this.f45267c.f47853a;
        cmVar.mo31900a((C16598b) new C16604cr(cmVar, str));
    }

    /* renamed from: c */
    public final void mo27743c(String str) throws RemoteException {
        C16596cm cmVar = this.f45267c.f47853a;
        cmVar.mo31900a((C16598b) new C16605cs(cmVar, str));
    }

    /* renamed from: a */
    public final void mo27734a(C14882b bVar, String str, String str2) throws RemoteException {
        C16979a aVar = this.f45267c;
        Activity activity = bVar != null ? (Activity) C14886d.m30545a(bVar) : null;
        C16596cm cmVar = aVar.f47853a;
        cmVar.mo31900a((C16598b) new C16603cq(cmVar, activity, str, str2));
    }

    /* renamed from: d */
    public final String mo27744d() throws RemoteException {
        C16596cm cmVar = this.f45267c.f47853a;
        C16597a aVar = new C16597a();
        cmVar.mo31900a((C16598b) new C16609cw(cmVar, aVar));
        return aVar.mo31902a(500);
    }

    /* renamed from: e */
    public final String mo27745e() throws RemoteException {
        C16596cm cmVar = this.f45267c.f47853a;
        C16597a aVar = new C16597a();
        cmVar.mo31900a((C16598b) new C16610cx(cmVar, aVar));
        return aVar.mo31902a(500);
    }

    /* renamed from: f */
    public final String mo27746f() throws RemoteException {
        return this.f45267c.f47853a.f46623f;
    }
}
