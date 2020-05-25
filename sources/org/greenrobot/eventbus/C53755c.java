package org.greenrobot.eventbus;

import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import org.greenrobot.eventbus.C53762g.C53763a;
import org.greenrobot.eventbus.C53762g.C53764b;
import org.greenrobot.eventbus.C53765h.C53766a;

/* renamed from: org.greenrobot.eventbus.c */
public class C53755c {

    /* renamed from: a */
    public static String f133306a = "EventBus";

    /* renamed from: b */
    static volatile C53755c f133307b;

    /* renamed from: e */
    private static final C53759d f133308e = new C53759d();

    /* renamed from: f */
    private static final Map<Class<?>, List<Class<?>>> f133309f = new HashMap();

    /* renamed from: c */
    public final ExecutorService f133310c;

    /* renamed from: d */
    public final C53762g f133311d;

    /* renamed from: g */
    private final Map<Class<?>, CopyOnWriteArrayList<C53776q>> f133312g;

    /* renamed from: h */
    private final Map<Object, List<Class<?>>> f133313h;

    /* renamed from: i */
    private final Map<Class<?>, Object> f133314i;

    /* renamed from: j */
    private final ThreadLocal<C53758a> f133315j;

    /* renamed from: k */
    private final C53765h f133316k;

    /* renamed from: l */
    private final C53770l f133317l;

    /* renamed from: m */
    private final C53754b f133318m;

    /* renamed from: n */
    private final C53748a f133319n;

    /* renamed from: o */
    private final C53774p f133320o;

    /* renamed from: p */
    private final boolean f133321p;

    /* renamed from: q */
    private final boolean f133322q;

    /* renamed from: r */
    private final boolean f133323r;

    /* renamed from: s */
    private final boolean f133324s;

    /* renamed from: t */
    private final boolean f133325t;

    /* renamed from: u */
    private final boolean f133326u;

    /* renamed from: v */
    private final int f133327v;

    /* renamed from: org.greenrobot.eventbus.c$a */
    static final class C53758a {

        /* renamed from: a */
        final List<Object> f133330a = new ArrayList();

        /* renamed from: b */
        boolean f133331b;

        /* renamed from: c */
        boolean f133332c;

        /* renamed from: d */
        C53776q f133333d;

        /* renamed from: e */
        Object f133334e;

        /* renamed from: f */
        boolean f133335f;

        C53758a() {
        }
    }

    /* renamed from: a */
    public final void mo112955a(Object obj) {
        List<C53773o> a = this.f133320o.mo112980a(obj.getClass());
        synchronized (this) {
            for (C53773o a2 : a) {
                m114321a(obj, a2);
            }
        }
    }

    /* renamed from: a */
    public final <T> T mo112954a(Class<T> cls) {
        T cast;
        synchronized (this.f133314i) {
            cast = cls.cast(this.f133314i.get(cls));
        }
        return cast;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo112956a(C53768j jVar) {
        Object obj = jVar.f133359a;
        C53776q qVar = jVar.f133360b;
        C53768j.m114355a(jVar);
        if (qVar.f133389c) {
            m114327b(qVar, obj);
        }
    }

    public C53755c() {
        this(f133308e);
    }

    /* renamed from: b */
    private boolean m114328b() {
        if (this.f133316k != null) {
            return this.f133316k.mo112971a();
        }
        return true;
    }

    /* renamed from: a */
    public static C53755c m114319a() {
        if (f133307b == null) {
            synchronized (C53755c.class) {
                if (f133307b == null) {
                    f133307b = new C53755c();
                }
            }
        }
        return f133307b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EventBus[indexCount=");
        sb.append(this.f133327v);
        sb.append(", eventInheritance=");
        sb.append(this.f133326u);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: b */
    public final <T> T mo112957b(Class<T> cls) {
        T cast;
        synchronized (this.f133314i) {
            cast = cls.cast(this.f133314i.remove(cls));
        }
        return cast;
    }

    /* renamed from: f */
    public final void mo112962f(Object obj) {
        synchronized (this.f133314i) {
            this.f133314i.put(obj.getClass(), obj);
        }
        mo112960d(obj);
    }

    /* renamed from: c */
    private static List<Class<?>> m114329c(Class<?> cls) {
        List<Class<?>> list;
        synchronized (f133309f) {
            list = (List) f133309f.get(cls);
            if (list == null) {
                list = new ArrayList<>();
                for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    list.add(cls2);
                    m114322a(list, (Class<?>[]) cls2.getInterfaces());
                }
                f133309f.put(cls, list);
            }
        }
        return list;
    }

    /* renamed from: e */
    public final void mo112961e(Object obj) {
        C53758a aVar = (C53758a) this.f133315j.get();
        if (!aVar.f133331b) {
            throw new C53760e("This method may only be called from inside event handling methods on the posting thread");
        } else if (obj == null) {
            throw new C53760e("Event may not be null");
        } else if (aVar.f133334e != obj) {
            throw new C53760e("Only the currently handled event may be aborted");
        } else if (aVar.f133333d.f133388b.f133369b == ThreadMode.POSTING) {
            aVar.f133335f = true;
        } else {
            throw new C53760e(" event handlers may only abort the incoming event");
        }
    }

    /* renamed from: g */
    public final boolean mo112963g(Object obj) {
        synchronized (this.f133314i) {
            Class cls = obj.getClass();
            if (!obj.equals(this.f133314i.get(cls))) {
                return false;
            }
            this.f133314i.remove(cls);
            return true;
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo112958b(Object obj) {
        return this.f133313h.containsKey(obj);
    }

    /* renamed from: c */
    public final synchronized void mo112959c(Object obj) {
        List<Class> list = (List) this.f133313h.get(obj);
        if (list != null) {
            for (Class cls : list) {
                List list2 = (List) this.f133312g.get(cls);
                if (list2 != null) {
                    int size = list2.size();
                    int i = 0;
                    while (i < size) {
                        C53776q qVar = (C53776q) list2.get(i);
                        if (qVar.f133387a == obj) {
                            qVar.f133389c = false;
                            list2.remove(i);
                            i--;
                            size--;
                        }
                        i++;
                    }
                }
            }
            this.f133313h.remove(obj);
            return;
        }
        C53762g gVar = this.f133311d;
        Level level = Level.WARNING;
        StringBuilder sb = new StringBuilder("Subscriber to unregister was not registered before: ");
        sb.append(obj.getClass());
        gVar.mo112968a(level, sb.toString());
    }

    /* renamed from: d */
    public final void mo112960d(Object obj) {
        C53758a aVar = (C53758a) this.f133315j.get();
        List<Object> list = aVar.f133330a;
        list.add(obj);
        if (!aVar.f133331b) {
            aVar.f133332c = m114328b();
            aVar.f133331b = true;
            if (!aVar.f133335f) {
                while (!list.isEmpty()) {
                    try {
                        m114320a(list.remove(0), aVar);
                    } finally {
                        aVar.f133331b = false;
                        aVar.f133332c = false;
                    }
                }
                return;
            }
            throw new C53760e("Internal error. Abort state was not reset");
        }
    }

    C53755c(C53759d dVar) {
        C53762g gVar;
        C53765h hVar;
        int i;
        this.f133315j = new ThreadLocal<C53758a>() {
            /* access modifiers changed from: protected */
            public final /* synthetic */ Object initialValue() {
                return new C53758a();
            }
        };
        if (dVar.f133347k != null) {
            gVar = dVar.f133347k;
        } else if (!C53763a.m114345a() || C53759d.m114340a() == null) {
            gVar = new C53764b();
        } else {
            gVar = new C53763a("EventBus");
        }
        this.f133311d = gVar;
        this.f133312g = new HashMap();
        this.f133313h = new HashMap();
        this.f133314i = new ConcurrentHashMap();
        C53770l lVar = null;
        if (dVar.f133348l != null) {
            hVar = dVar.f133348l;
        } else {
            if (C53763a.m114345a()) {
                Object a = C53759d.m114340a();
                if (a != null) {
                    hVar = new C53766a((Looper) a);
                }
            }
            hVar = null;
        }
        this.f133316k = hVar;
        if (this.f133316k != null) {
            lVar = this.f133316k.mo112970a(this);
        }
        this.f133317l = lVar;
        this.f133318m = new C53754b(this);
        this.f133319n = new C53748a(this);
        if (dVar.f133346j != null) {
            i = dVar.f133346j.size();
        } else {
            i = 0;
        }
        this.f133327v = i;
        this.f133320o = new C53774p(dVar.f133346j, dVar.f133344h, dVar.f133343g);
        this.f133322q = dVar.f133337a;
        this.f133323r = dVar.f133338b;
        this.f133324s = dVar.f133339c;
        this.f133325t = dVar.f133340d;
        this.f133321p = dVar.f133341e;
        this.f133326u = dVar.f133342f;
        this.f133310c = dVar.f133345i;
    }

    /* renamed from: a */
    private void m114323a(C53776q qVar, Object obj) {
        if (obj != null) {
            m114325a(qVar, obj, m114328b());
        }
    }

    /* renamed from: a */
    private static void m114322a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                m114322a(list, (Class<?>[]) cls.getInterfaces());
            }
        }
    }

    /* renamed from: b */
    private void m114327b(C53776q qVar, Object obj) {
        try {
            qVar.f133388b.f133368a.invoke(qVar.f133387a, new Object[]{obj});
        } catch (InvocationTargetException e) {
            m114324a(qVar, obj, e.getCause());
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unexpected exception", e2);
        }
    }

    /* renamed from: a */
    private void m114320a(Object obj, C53758a aVar) throws Error {
        boolean z;
        Class<C53772n> cls = obj.getClass();
        if (this.f133326u) {
            List c = m114329c(cls);
            z = false;
            for (int i = 0; i < c.size(); i++) {
                z |= m114326a(obj, aVar, (Class) c.get(i));
            }
        } else {
            z = m114326a(obj, aVar, cls);
        }
        if (!z) {
            if (this.f133323r) {
                C53762g gVar = this.f133311d;
                Level level = Level.FINE;
                StringBuilder sb = new StringBuilder("No subscribers registered for event ");
                sb.append(cls);
                gVar.mo112968a(level, sb.toString());
            }
            if (this.f133325t && cls != C53767i.class && cls != C53772n.class) {
                mo112960d(new C53767i(this, obj));
            }
        }
    }

    /* renamed from: a */
    private void m114321a(Object obj, C53773o oVar) {
        Class<?> cls = oVar.f133370c;
        C53776q qVar = new C53776q(obj, oVar);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f133312g.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f133312g.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(qVar)) {
            StringBuilder sb = new StringBuilder("Subscriber ");
            sb.append(obj.getClass());
            sb.append(" already registered to event ");
            sb.append(cls);
            throw new C53760e(sb.toString());
        }
        int size = copyOnWriteArrayList.size();
        int i = 0;
        while (true) {
            if (i > size) {
                break;
            } else if (i == size || oVar.f133371d > ((C53776q) copyOnWriteArrayList.get(i)).f133388b.f133371d) {
                copyOnWriteArrayList.add(i, qVar);
            } else {
                i++;
            }
        }
        copyOnWriteArrayList.add(i, qVar);
        List list = (List) this.f133313h.get(obj);
        if (list == null) {
            list = new ArrayList();
            this.f133313h.put(obj, list);
        }
        list.add(cls);
        if (oVar.f133372e) {
            if (this.f133326u) {
                for (Entry entry : this.f133314i.entrySet()) {
                    if (cls.isAssignableFrom((Class) entry.getKey())) {
                        m114323a(qVar, entry.getValue());
                    }
                }
                return;
            }
            m114323a(qVar, this.f133314i.get(cls));
        }
    }

    /* renamed from: a */
    private void m114324a(C53776q qVar, Object obj, Throwable th) {
        if (obj instanceof C53772n) {
            if (this.f133322q) {
                C53762g gVar = this.f133311d;
                Level level = Level.SEVERE;
                StringBuilder sb = new StringBuilder("SubscriberExceptionEvent subscriber ");
                sb.append(qVar.f133387a.getClass());
                sb.append(" threw an exception");
                gVar.mo112969a(level, sb.toString(), th);
                C53772n nVar = (C53772n) obj;
                C53762g gVar2 = this.f133311d;
                Level level2 = Level.SEVERE;
                StringBuilder sb2 = new StringBuilder("Initial event ");
                sb2.append(nVar.f133366c);
                sb2.append(" caused exception in ");
                sb2.append(nVar.f133367d);
                gVar2.mo112969a(level2, sb2.toString(), nVar.f133365b);
            }
        } else if (!this.f133321p) {
            if (this.f133322q) {
                C53762g gVar3 = this.f133311d;
                Level level3 = Level.SEVERE;
                StringBuilder sb3 = new StringBuilder("Could not dispatch event: ");
                sb3.append(obj.getClass());
                sb3.append(" to subscribing class ");
                sb3.append(qVar.f133387a.getClass());
                gVar3.mo112969a(level3, sb3.toString(), th);
            }
            if (this.f133324s) {
                mo112960d(new C53772n(this, th, obj, qVar.f133387a));
            }
        } else {
            throw new C53760e("Invoking subscriber failed", th);
        }
    }

    /* renamed from: a */
    private void m114325a(C53776q qVar, Object obj, boolean z) {
        switch (qVar.f133388b.f133369b) {
            case POSTING:
                m114327b(qVar, obj);
                return;
            case MAIN:
                if (z) {
                    m114327b(qVar, obj);
                    return;
                } else {
                    this.f133317l.mo112947a(qVar, obj);
                    return;
                }
            case MAIN_ORDERED:
                if (this.f133317l != null) {
                    this.f133317l.mo112947a(qVar, obj);
                    return;
                } else {
                    m114327b(qVar, obj);
                    return;
                }
            case BACKGROUND:
                if (z) {
                    this.f133318m.mo112947a(qVar, obj);
                    return;
                } else {
                    m114327b(qVar, obj);
                    return;
                }
            case ASYNC:
                this.f133319n.mo112947a(qVar, obj);
                return;
            default:
                StringBuilder sb = new StringBuilder("Unknown thread mode: ");
                sb.append(qVar.f133388b.f133369b);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    private boolean m114326a(Object obj, C53758a aVar, Class<?> cls) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = (CopyOnWriteArrayList) this.f133312g.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C53776q qVar = (C53776q) it.next();
            aVar.f133334e = obj;
            aVar.f133333d = qVar;
            try {
                m114325a(qVar, obj, aVar.f133332c);
                if (aVar.f133335f) {
                    break;
                }
            } finally {
                aVar.f133334e = null;
                aVar.f133333d = null;
                aVar.f133335f = false;
            }
        }
        return true;
    }
}
