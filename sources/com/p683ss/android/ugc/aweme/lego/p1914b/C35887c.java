package com.p683ss.android.ugc.aweme.lego.p1914b;

import android.content.Context;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.lego.b.c */
public final class C35887c {

    /* renamed from: a */
    public final Map<Class<? extends LegoService>, LegoService> f92104a = new ConcurrentHashMap();

    /* renamed from: b */
    private Context f92105b;

    /* renamed from: c */
    private final Map<Class<? extends LegoService>, LegoService> f92106c = new ConcurrentHashMap();

    /* renamed from: d */
    private final Map<C35898h, List<Class<? extends LegoService>>> f92107d = new HashMap();

    /* renamed from: a */
    public final void mo74555a(Context context) {
        C52711k.m112240b(context, "context");
        this.f92105b = context;
        for (C35898h put : C35898h.values()) {
            this.f92107d.put(put, new ArrayList());
        }
    }

    /* renamed from: b */
    public final LegoService mo74559b(Class<? extends LegoService> cls) {
        C52711k.m112240b(cls, LeakCanaryFileProvider.f132049i);
        if (this.f92104a.containsKey(cls)) {
            return null;
        }
        Object obj = this.f92106c.get(cls);
        if (obj == null) {
            C52711k.m112234a();
        }
        return (LegoService) obj;
    }

    /* renamed from: a */
    public final LegoService mo74554a(Class<? extends LegoService> cls) {
        LegoService legoService;
        C52711k.m112240b(cls, LeakCanaryFileProvider.f132049i);
        Object obj = this.f92106c.get(cls);
        if (obj == null) {
            C52711k.m112234a();
        }
        LegoService legoService2 = (LegoService) obj;
        synchronized (legoService2) {
            if (!this.f92104a.containsKey(cls)) {
                Context context = this.f92105b;
                if (context == null) {
                    C52711k.m112237a("context");
                }
                legoService2.init(context);
                this.f92104a.put(cls, legoService2);
            }
            Object obj2 = this.f92104a.get(cls);
            if (obj2 == null) {
                C52711k.m112234a();
            }
            legoService = (LegoService) obj2;
        }
        return legoService;
    }

    /* renamed from: b */
    public final Class<? extends LegoService> mo74560b(C35898h hVar) {
        C52711k.m112240b(hVar, "type");
        synchronized (this.f92107d) {
            Object obj = this.f92107d.get(hVar);
            if (obj == null) {
                C52711k.m112234a();
            }
            if (((List) obj).isEmpty()) {
                return null;
            }
            Object obj2 = this.f92107d.get(hVar);
            if (obj2 == null) {
                C52711k.m112234a();
            }
            Class<? extends LegoService> cls = (Class) ((List) obj2).remove(0);
            return cls;
        }
    }

    /* renamed from: c */
    public final List<Class<? extends LegoService>> mo74561c(C35898h hVar) {
        List<Class<? extends LegoService>> list;
        C52711k.m112240b(hVar, "type");
        synchronized (this.f92107d) {
            Object obj = this.f92107d.get(hVar);
            if (obj == null) {
                C52711k.m112234a();
            }
            ArrayList arrayList = new ArrayList((Collection) obj);
            Object obj2 = this.f92107d.get(hVar);
            if (obj2 == null) {
                C52711k.m112234a();
            }
            ((List) obj2).clear();
            list = arrayList;
        }
        return list;
    }

    /* renamed from: a */
    public final boolean mo74558a(C35898h hVar) {
        C52711k.m112240b(hVar, "type");
        Object obj = this.f92107d.get(hVar);
        if (obj == null) {
            C52711k.m112234a();
        }
        if (!((List) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo74556a(C35898h hVar, List<? extends Class<? extends LegoService>> list) {
        C52711k.m112240b(hVar, "type");
        C52711k.m112240b(list, "services");
        synchronized (this.f92107d) {
            Object obj = this.f92107d.get(hVar);
            if (obj == null) {
                C52711k.m112234a();
            }
            ((List) obj).addAll(list);
        }
    }

    /* renamed from: a */
    public final void mo74557a(Class<? extends LegoService> cls, LegoService legoService) {
        C52711k.m112240b(cls, LeakCanaryFileProvider.f132049i);
        C52711k.m112240b(legoService, "service");
        if (!this.f92106c.containsKey(cls)) {
            this.f92106c.put(cls, legoService);
        }
    }
}
