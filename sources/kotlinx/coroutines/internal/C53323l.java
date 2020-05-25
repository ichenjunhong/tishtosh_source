package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.C53280bw;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.internal.l */
public final class C53323l {

    /* renamed from: a */
    public static final C53280bw f131953a = m113339a();

    /* renamed from: b */
    public static final C53323l f131954b = new C53323l();

    private C53323l() {
    }

    /* renamed from: a */
    private static C53280bw m113339a() {
        Object obj;
        Class<MainDispatcherFactory> cls = MainDispatcherFactory.class;
        try {
            ServiceLoader load = ServiceLoader.load(cls, cls.getClassLoader());
            C52711k.m112236a((Object) load, "ServiceLoader.load(clz, clz.classLoader)");
            List e = C52575l.m112138e((Iterable<? extends T>) load);
            Iterator it = e.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                obj = it.next();
                int loadPriority = ((MainDispatcherFactory) obj).getLoadPriority();
                while (it.hasNext()) {
                    Object next = it.next();
                    int loadPriority2 = ((MainDispatcherFactory) next).getLoadPriority();
                    if (loadPriority < loadPriority2) {
                        obj = next;
                        loadPriority = loadPriority2;
                    }
                }
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) obj;
            if (mainDispatcherFactory != null) {
                C53280bw a = C53324m.m113340a(mainDispatcherFactory, e);
                if (a != null) {
                    return a;
                }
            }
            return new C53325n(null, null, 2, null);
        } catch (Throwable th) {
            return new C53325n(th, null, 2, null);
        }
    }
}
