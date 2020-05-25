package com.p683ss.android.ugc.aweme.framework.services;

import com.p683ss.android.ugc.aweme.lancet.C18991l;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.util.C47639s;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;
import com.p683ss.android.ugc.p2416c.C48514f;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.framework.services.ServiceManager */
public final class ServiceManager {
    final ConcurrentHashMap<Class<?>, Set<ServiceProvider<?>>> classServiceProviderConcurrentHashMap;
    final Map<Class<?>, Map<String, ServiceProvider<?>>> groupServiceProviderConcurrentHashMap;

    /* renamed from: com.ss.android.ugc.aweme.framework.services.ServiceManager$Holder */
    static final class Holder {
        public static final ServiceManager INSTANCE = new ServiceManager();

        private Holder() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.framework.services.ServiceManager$_lancet */
    class _lancet {
        private _lancet() {
        }

        static Object com_ss_android_ugc_aweme_lancet_ServiceManagerLancet_getService(ServiceManager serviceManager, Class cls, boolean z) {
            if (!C18991l.f52295b && C18991l.f52296c == null) {
                return null;
            }
            C18991l.setupGraph();
            long j = 0;
            if (C22574a.m55738f().f60703d && C18991l.m46167a() && C18991l.m46168b()) {
                j = System.currentTimeMillis();
            }
            Object service = serviceManager.getService(cls, z);
            if (C22574a.m55738f().f60703d && C18991l.m46167a() && C18991l.m46168b()) {
                C22574a.m55738f().mo46915a(C47639s.f120109a ? "method_service_frame_total" : "method_service_get_total", System.currentTimeMillis() - j);
            }
            return service;
        }

        static Iterator com_ss_android_ugc_aweme_lancet_ServiceManagerLancet_iterator(Class cls) {
            if (!C18991l.f52294a && C18991l.m46167a()) {
                C22574a.m55738f().mo46917a("configloader_init", false);
            }
            Iterator it = ConfigLoader.iterator(cls);
            if (!C18991l.f52294a && C18991l.m46167a()) {
                C22574a.m55738f().mo46921b("configloader_init", false);
                C18991l.f52294a = true;
            }
            return it;
        }
    }

    public static ServiceManager get() {
        return Holder.INSTANCE;
    }

    public final ConcurrentHashMap getServiceProviderMap() {
        return this.classServiceProviderConcurrentHashMap;
    }

    private ServiceManager() {
        this.classServiceProviderConcurrentHashMap = new ConcurrentHashMap<>();
        this.groupServiceProviderConcurrentHashMap = Collections.synchronizedMap(new HashMap());
    }

    public final <T> T getService(Class<T> cls) {
        return _lancet.com_ss_android_ugc_aweme_lancet_ServiceManagerLancet_getService(this, cls, false);
    }

    public final <T> Set<T> getServices(Class<T> cls) {
        Set<ServiceProvider> set = (Set) this.classServiceProviderConcurrentHashMap.get(cls);
        if (set == null || set.isEmpty()) {
            Iterator com_ss_android_ugc_aweme_lancet_ServiceManagerLancet_iterator = _lancet.com_ss_android_ugc_aweme_lancet_ServiceManagerLancet_iterator(cls);
            Set<T> synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
            while (com_ss_android_ugc_aweme_lancet_ServiceManagerLancet_iterator.hasNext()) {
                synchronizedSet.add(com_ss_android_ugc_aweme_lancet_ServiceManagerLancet_iterator.next());
            }
            return synchronizedSet;
        }
        Set<T> synchronizedSet2 = Collections.synchronizedSet(new LinkedHashSet());
        for (ServiceProvider serviceProvider : set) {
            synchronizedSet2.add(serviceProvider.get());
        }
        return synchronizedSet2;
    }

    public final <T> Binding bind(Class<T> cls, ServiceProvider<T> serviceProvider) {
        return new Binding(this, cls, serviceProvider);
    }

    public final <T> T getServiceByGroup(Class<T> cls, String str) {
        Map map = (Map) this.groupServiceProviderConcurrentHashMap.get(cls);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return ((ServiceProvider) map.get(str)).get();
    }

    public final <T> T getLegacyService(Class<T> cls, boolean z) {
        Set set = (Set) this.classServiceProviderConcurrentHashMap.get(cls);
        if (set != null && !set.isEmpty() && !z) {
            return ((ServiceProvider) set.toArray()[0]).get();
        }
        Iterator com_ss_android_ugc_aweme_lancet_ServiceManagerLancet_iterator = _lancet.com_ss_android_ugc_aweme_lancet_ServiceManagerLancet_iterator(cls);
        if (com_ss_android_ugc_aweme_lancet_ServiceManagerLancet_iterator.hasNext()) {
            return com_ss_android_ugc_aweme_lancet_ServiceManagerLancet_iterator.next();
        }
        return null;
    }

    public final <T> T getService(final Class<T> cls, final boolean z) {
        T t;
        if (!z) {
            t = C48514f.m104950a(cls);
        } else {
            t = null;
        }
        if (t != null) {
            return t;
        }
        return C20302a.m50070a((Class) cls).mo42947a((C20310d) new C20310d<T>() {
            public T get(Class cls, Class cls2) {
                T legacyService = ServiceManager.this.getLegacyService(cls, z);
                if (legacyService == null) {
                    return super.get(cls, cls2);
                }
                return legacyService;
            }
        }).mo42946a().mo42948b();
    }

    public final <T> GroupBinding bind(Class<T> cls, String str, ServiceProvider<T> serviceProvider) {
        return new GroupBinding(this.groupServiceProviderConcurrentHashMap, cls, str, serviceProvider);
    }
}
