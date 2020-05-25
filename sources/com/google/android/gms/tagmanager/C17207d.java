package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.tagmanager.d */
public class C17207d {

    /* renamed from: g */
    private static C17207d f48644g;

    /* renamed from: a */
    public final C17203c f48645a;

    /* renamed from: b */
    final C17184av f48646b;

    /* renamed from: c */
    final ConcurrentMap<String, C17200bk> f48647c;

    /* renamed from: d */
    private final C17208a f48648d;

    /* renamed from: e */
    private final Context f48649e;

    /* renamed from: f */
    private final C17210f f48650f;

    /* renamed from: com.google.android.gms.tagmanager.d$a */
    public interface C17208a {
    }

    private C17207d(Context context, C17208a aVar, C17203c cVar, C17184av avVar) {
        if (context != null) {
            this.f48649e = context.getApplicationContext();
            this.f48646b = avVar;
            this.f48648d = aVar;
            this.f48647c = new ConcurrentHashMap();
            this.f48645a = cVar;
            this.f48645a.mo33460a((C17205b) new C17191bb(this));
            this.f48645a.mo33460a((C17205b) new C17190ba(this.f48649e));
            this.f48650f = new C17210f();
            this.f48649e.registerComponentCallbacks(new C17193bd(this));
            C17209e.m42161a(this.f48649e);
            return;
        }
        throw new NullPointerException("context cannot be null");
    }

    /* renamed from: a */
    public static C17207d m42159a(Context context) {
        C17207d dVar;
        synchronized (C17207d.class) {
            if (f48644g == null) {
                C17192bc bcVar = new C17192bc();
                C17203c cVar = new C17203c(new C17215k(context));
                if (C17185aw.f48599a == null) {
                    C17185aw.f48599a = new C17185aw();
                }
                f48644g = new C17207d(context, bcVar, cVar, C17185aw.f48599a);
            }
            dVar = f48644g;
        }
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized boolean mo33469a(Uri uri) {
        C17171aj a = C17171aj.m42098a();
        if (!a.mo33436a(uri)) {
            return false;
        }
        String str = a.f48568b;
        switch (C17194be.f48614a[a.f48567a.ordinal()]) {
            case 1:
                C17200bk bkVar = (C17200bk) this.f48647c.get(str);
                break;
            case 2:
            case 3:
                for (String str2 : this.f48647c.keySet()) {
                    C17200bk bkVar2 = (C17200bk) this.f48647c.get(str2);
                    if (str2.equals(str)) {
                        String str3 = a.f48569c;
                    } else if (!bkVar2.f48628c) {
                        bkVar2.f48627b.mo33458a();
                    }
                }
                break;
        }
        return true;
    }
}
