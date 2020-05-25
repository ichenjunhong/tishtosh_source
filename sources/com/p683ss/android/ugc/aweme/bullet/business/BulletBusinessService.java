package com.p683ss.android.ugc.aweme.bullet.business;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.bullet.business.BulletBusinessService */
public final class BulletBusinessService {

    /* renamed from: a */
    private final C24252a f64314a;

    /* renamed from: b */
    private HashMap<Class, Business> f64315b = new HashMap<>();

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.BulletBusinessService$Business */
    public static class Business {

        /* renamed from: k */
        protected final C24252a f64316k;

        public Business(C24252a aVar) {
            this.f64316k = aVar;
        }
    }

    BulletBusinessService(C24252a aVar) {
        this.f64314a = aVar;
    }

    /* renamed from: a */
    public final <T extends Business> T mo49980a(Class<T> cls) {
        T t;
        if (this.f64315b.containsKey(cls)) {
            return (Business) this.f64315b.get(cls);
        }
        if (!Modifier.isAbstract(cls.getModifiers())) {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[]{C24252a.class});
                declaredConstructor.setAccessible(true);
                t = (Business) declaredConstructor.newInstance(new Object[]{this.f64314a});
                try {
                    this.f64315b.put(cls, t);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
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
