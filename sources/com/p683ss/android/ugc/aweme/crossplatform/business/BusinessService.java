package com.p683ss.android.ugc.aweme.crossplatform.business;

import android.content.Context;
import com.p683ss.android.ugc.aweme.crossplatform.base.C27149c;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.BusinessService */
public final class BusinessService {

    /* renamed from: a */
    private final C27173c f71629a;

    /* renamed from: b */
    private HashMap<Class, Business> f71630b = new HashMap<>();

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.BusinessService$Business */
    public static abstract class Business {

        /* renamed from: h */
        protected final C27149c f71631h;

        /* renamed from: i */
        protected final C27173c f71632i;

        /* renamed from: j */
        protected final C27182a f71633j = this.f71631h.getCrossPlatformParams();

        /* renamed from: k */
        protected final Context f71634k = this.f71631h.getContext();

        public Business(C27173c cVar) {
            this.f71632i = cVar;
            this.f71631h = cVar.f71692a;
        }
    }

    BusinessService(C27173c cVar) {
        this.f71629a = cVar;
    }

    /* renamed from: a */
    public final <T extends Business> T mo55483a(Class<T> cls) {
        T t;
        if (this.f71630b.containsKey(cls)) {
            return (Business) this.f71630b.get(cls);
        }
        if (!Modifier.isAbstract(cls.getModifiers())) {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[]{C27173c.class});
                declaredConstructor.setAccessible(true);
                t = (Business) declaredConstructor.newInstance(new Object[]{this.f71629a});
                try {
                    this.f71630b.put(cls, t);
                } catch (Exception | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                }
            } catch (Exception | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused2) {
                t = null;
            }
            if (t == null) {
                return null;
            }
            return t;
        }
        StringBuilder sb = new StringBuilder("can't use abstract class!");
        sb.append(cls.getSimpleName());
        throw new IllegalStateException(sb.toString());
    }
}
