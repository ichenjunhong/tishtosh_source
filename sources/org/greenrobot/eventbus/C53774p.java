package org.greenrobot.eventbus;

import com.taobao.android.dexposed.ClassUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.p2694a.C53751c;
import org.greenrobot.eventbus.p2694a.C53752d;

/* renamed from: org.greenrobot.eventbus.p */
final class C53774p {

    /* renamed from: a */
    private static final Map<Class<?>, List<C53773o>> f133374a = new ConcurrentHashMap();

    /* renamed from: e */
    private static final C53775a[] f133375e = new C53775a[4];

    /* renamed from: b */
    private List<C53752d> f133376b;

    /* renamed from: c */
    private final boolean f133377c;

    /* renamed from: d */
    private final boolean f133378d;

    /* renamed from: org.greenrobot.eventbus.p$a */
    static class C53775a {

        /* renamed from: a */
        final List<C53773o> f133379a = new ArrayList();

        /* renamed from: b */
        final Map<Class, Object> f133380b = new HashMap();

        /* renamed from: c */
        final Map<String, Class> f133381c = new HashMap();

        /* renamed from: d */
        final StringBuilder f133382d = new StringBuilder(128);

        /* renamed from: e */
        Class<?> f133383e;

        /* renamed from: f */
        Class<?> f133384f;

        /* renamed from: g */
        boolean f133385g;

        /* renamed from: h */
        C53751c f133386h;

        C53775a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo112981a() {
            if (!this.f133385g) {
                this.f133384f = this.f133384f.getSuperclass();
                String name = this.f133384f.getName();
                if (!name.startsWith("java.") && !name.startsWith("javax.") && !name.startsWith("android.")) {
                    return;
                }
            }
            this.f133384f = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo112982a(Class<?> cls) {
            this.f133384f = cls;
            this.f133383e = cls;
            this.f133385g = false;
            this.f133386h = null;
        }

        /* renamed from: b */
        private boolean m114371b(Method method, Class<?> cls) {
            this.f133382d.setLength(0);
            this.f133382d.append(method.getName());
            StringBuilder sb = this.f133382d;
            sb.append('>');
            sb.append(cls.getName());
            String sb2 = this.f133382d.toString();
            Class declaringClass = method.getDeclaringClass();
            Class cls2 = (Class) this.f133381c.put(sb2, declaringClass);
            if (cls2 == null || cls2.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f133381c.put(sb2, cls2);
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo112983a(Method method, Class<?> cls) {
            Object put = this.f133380b.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (m114371b((Method) put, cls)) {
                    this.f133380b.put(cls, this);
                } else {
                    throw new IllegalStateException();
                }
            }
            return m114371b(method, cls);
        }
    }

    /* renamed from: a */
    private static C53775a m114365a() {
        synchronized (f133375e) {
            int i = 0;
            while (i < 4) {
                try {
                    C53775a aVar = f133375e[i];
                    if (aVar != null) {
                        f133375e[i] = null;
                        return aVar;
                    }
                    i++;
                } finally {
                    while (true) {
                    }
                }
            }
            return new C53775a();
        }
    }

    /* renamed from: c */
    private List<C53773o> m114368c(Class<?> cls) {
        C53775a a = m114365a();
        a.mo112982a(cls);
        while (a.f133384f != null) {
            m114369c(a);
            a.mo112981a();
        }
        return m114364a(a);
    }

    /* renamed from: a */
    private static List<C53773o> m114364a(C53775a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f133379a);
        aVar.f133379a.clear();
        aVar.f133380b.clear();
        aVar.f133381c.clear();
        int i = 0;
        aVar.f133382d.setLength(0);
        aVar.f133383e = null;
        aVar.f133384f = null;
        aVar.f133385g = false;
        aVar.f133386h = null;
        synchronized (f133375e) {
            while (true) {
                if (i >= 4) {
                    break;
                }
                try {
                    if (f133375e[i] == null) {
                        f133375e[i] = aVar;
                        break;
                    }
                    i++;
                } finally {
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private List<C53773o> m114366b(Class<?> cls) {
        C53773o[] c;
        C53775a a = m114365a();
        a.mo112982a(cls);
        while (a.f133384f != null) {
            a.f133386h = m114367b(a);
            if (a.f133386h != null) {
                for (C53773o oVar : a.f133386h.mo112952c()) {
                    if (a.mo112983a(oVar.f133368a, oVar.f133370c)) {
                        a.f133379a.add(oVar);
                    }
                }
            } else {
                m114369c(a);
            }
            a.mo112981a();
        }
        return m114364a(a);
    }

    /* renamed from: b */
    private C53751c m114367b(C53775a aVar) {
        if (!(aVar.f133386h == null || aVar.f133386h.mo112951b() == null)) {
            C53751c b = aVar.f133386h.mo112951b();
            if (aVar.f133384f == b.mo112949a()) {
                return b;
            }
        }
        if (this.f133376b != null) {
            for (C53752d a : this.f133376b) {
                C53751c a2 = a.mo49413a(aVar.f133384f);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    private void m114369c(C53775a aVar) {
        Method[] methodArr;
        try {
            methodArr = aVar.f133384f.getDeclaredMethods();
        } catch (Throwable unused) {
            methodArr = aVar.f133384f.getMethods();
            aVar.f133385g = true;
        }
        for (Method method : methodArr) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    C53771m mVar = (C53771m) method.getAnnotation(C53771m.class);
                    if (mVar != null) {
                        Class cls = parameterTypes[0];
                        if (aVar.mo112983a(method, cls)) {
                            ThreadMode a = mVar.mo112975a();
                            List<C53773o> list = aVar.f133379a;
                            C53773o oVar = new C53773o(method, cls, a, mVar.mo112977c(), mVar.mo112976b());
                            list.add(oVar);
                        }
                    }
                } else if (this.f133377c && method.isAnnotationPresent(C53771m.class)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(method.getDeclaringClass().getName());
                    sb.append(ClassUtils.PACKAGE_SEPARATOR);
                    sb.append(method.getName());
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder("@Subscribe method ");
                    sb3.append(sb2);
                    sb3.append("must have exactly 1 parameter but has ");
                    sb3.append(parameterTypes.length);
                    throw new C53760e(sb3.toString());
                }
            } else if (this.f133377c && method.isAnnotationPresent(C53771m.class)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(method.getDeclaringClass().getName());
                sb4.append(ClassUtils.PACKAGE_SEPARATOR);
                sb4.append(method.getName());
                String sb5 = sb4.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(sb5);
                sb6.append(" is a illegal @Subscribe method: must be public, non-static, and non-abstract");
                throw new C53760e(sb6.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final List<C53773o> mo112980a(Class<?> cls) {
        List<C53773o> list;
        List<C53773o> list2 = (List) f133374a.get(cls);
        if (list2 != null) {
            return list2;
        }
        if (this.f133378d) {
            list = m114368c(cls);
        } else {
            list = m114366b(cls);
        }
        if (!list.isEmpty()) {
            f133374a.put(cls, list);
            return list;
        }
        StringBuilder sb = new StringBuilder("Subscriber ");
        sb.append(cls);
        sb.append(" and its super classes have no public methods with the @Subscribe annotation");
        throw new C53760e(sb.toString());
    }

    C53774p(List<C53752d> list, boolean z, boolean z2) {
        this.f133376b = list;
        this.f133377c = z;
        this.f133378d = z2;
    }
}
