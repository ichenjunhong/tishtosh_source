package android.arch.lifecycle;

import com.taobao.android.dexposed.ClassUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: android.arch.lifecycle.n */
public final class C0189n {

    /* renamed from: a */
    private static Map<Class, Integer> f449a = new HashMap();

    /* renamed from: b */
    private static Map<Class, List<Constructor<? extends C0167d>>> f450b = new HashMap();

    /* renamed from: d */
    private static boolean m416d(Class<?> cls) {
        if (cls == null || !C0183j.class.isAssignableFrom(cls)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static int m414b(Class<?> cls) {
        if (f449a.containsKey(cls)) {
            return ((Integer) f449a.get(cls)).intValue();
        }
        int c = m415c(cls);
        f449a.put(cls, Integer.valueOf(c));
        return c;
    }

    /* renamed from: a */
    static GenericLifecycleObserver m411a(Object obj) {
        if (obj instanceof FullLifecycleObserver) {
            return new FullLifecycleObserverAdapter((FullLifecycleObserver) obj);
        }
        if (obj instanceof GenericLifecycleObserver) {
            return (GenericLifecycleObserver) obj;
        }
        Class cls = obj.getClass();
        if (m414b(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = (List) f450b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m412a((Constructor) list.get(0), obj));
        }
        C0167d[] dVarArr = new C0167d[list.size()];
        for (int i = 0; i < list.size(); i++) {
            dVarArr[i] = m412a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(dVarArr);
    }

    /* renamed from: c */
    private static int m415c(Class<?> cls) {
        Class[] interfaces;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor a = m413a(cls);
        if (a != null) {
            f450b.put(cls, Collections.singletonList(a));
            return 2;
        } else if (C0156a.f403a.mo295a(cls)) {
            return 1;
        } else {
            Class superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m416d(superclass)) {
                if (m414b(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList((Collection) f450b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (m416d(cls2)) {
                    if (m414b(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll((Collection) f450b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f450b.put(cls, arrayList);
            return 2;
        }
    }

    /* renamed from: a */
    private static Constructor<? extends C0167d> m413a(Class<?> cls) {
        String str;
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            if (packageR != null) {
                str = packageR.getName();
            } else {
                str = "";
            }
            if (!str.isEmpty()) {
                canonicalName = canonicalName.substring(str.length() + 1);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(canonicalName.replace(ClassUtils.PACKAGE_SEPARATOR, "_"));
            sb.append("_LifecycleAdapter");
            String sb2 = sb.toString();
            if (!str.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(ClassUtils.PACKAGE_SEPARATOR);
                sb3.append(sb2);
                sb2 = sb3.toString();
            }
            Constructor<? extends C0167d> declaredConstructor = Class.forName(sb2).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static C0167d m412a(Constructor<? extends C0167d> constructor, Object obj) {
        try {
            return (C0167d) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
