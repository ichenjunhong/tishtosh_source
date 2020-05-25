package com.google.p997a.p998a.p1020g;

import com.google.p997a.p998a.p1015f.p1016a.p1017a.p1018a.p1019a.C14780b;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.a.a.g.f */
public final class C14799f {

    /* renamed from: a */
    public static final Boolean f38323a = new Boolean(true);

    /* renamed from: b */
    public static final String f38324b = new String();

    /* renamed from: c */
    public static final Character f38325c = new Character(0);

    /* renamed from: d */
    public static final Byte f38326d = new Byte(0);

    /* renamed from: e */
    public static final Short f38327e = new Short(0);

    /* renamed from: f */
    public static final Integer f38328f = new Integer(0);

    /* renamed from: g */
    public static final Float f38329g = new Float(0.0f);

    /* renamed from: h */
    public static final Long f38330h = new Long(0);

    /* renamed from: i */
    public static final Double f38331i = new Double(ProfileUiInitOptimizeEnterThreshold.DEFAULT);

    /* renamed from: j */
    public static final BigInteger f38332j = new BigInteger("0");

    /* renamed from: k */
    public static final BigDecimal f38333k = new BigDecimal("0");

    /* renamed from: l */
    public static final C14804h f38334l = new C14804h(0);

    /* renamed from: m */
    private static final ConcurrentHashMap<Class<?>, Object> f38335m;

    static {
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = new ConcurrentHashMap<>();
        f38335m = concurrentHashMap;
        concurrentHashMap.put(Boolean.class, f38323a);
        f38335m.put(String.class, f38324b);
        f38335m.put(Character.class, f38325c);
        f38335m.put(Byte.class, f38326d);
        f38335m.put(Short.class, f38327e);
        f38335m.put(Integer.class, f38328f);
        f38335m.put(Float.class, f38329g);
        f38335m.put(Long.class, f38330h);
        f38335m.put(Double.class, f38331i);
        f38335m.put(BigInteger.class, f38332j);
        f38335m.put(BigDecimal.class, f38333k);
        f38335m.put(C14804h.class, f38334l);
    }

    /* renamed from: a */
    public static boolean m30266a(Object obj) {
        if (obj == null || obj != f38335m.get(obj.getClass())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static Map<String, Object> m30268b(Object obj) {
        if (obj == null || m30266a(obj)) {
            return Collections.emptyMap();
        }
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return new C14800g(obj, false);
    }

    /* renamed from: a */
    public static <T> T m30262a(Class<?> cls) {
        T t = f38335m.get(cls);
        if (t == null) {
            synchronized (f38335m) {
                t = f38335m.get(cls);
                if (t == null) {
                    int i = 0;
                    if (cls.isArray()) {
                        Class<?> cls2 = cls;
                        do {
                            cls2 = cls2.getComponentType();
                            i++;
                        } while (cls2.isArray());
                        t = Array.newInstance(cls2, new int[i]);
                    } else if (cls.isEnum()) {
                        C14805i a = C14795d.m30256a(cls).mo27115a((String) null);
                        String str = "enum missing constant with @NullValue annotation: %s";
                        Object[] objArr = {cls};
                        if (a != null) {
                            t = a.mo27147b();
                        } else {
                            throw new NullPointerException(C14780b.m30228a(str, objArr));
                        }
                    } else {
                        t = C14816q.m30297a(cls);
                    }
                    f38335m.put(cls, t);
                }
            }
        }
        return t;
    }

    /* renamed from: c */
    public static <T> T m30269c(T t) {
        T t2;
        if (t == null || m30267a((Type) t.getClass())) {
            return t;
        }
        if (t instanceof C14806j) {
            return ((C14806j) t).clone();
        }
        Class cls = t.getClass();
        if (cls.isArray()) {
            t2 = Array.newInstance(cls.getComponentType(), Array.getLength(t));
        } else if (t instanceof C14782a) {
            t2 = ((C14782a) t).clone();
        } else if ("java.util.Arrays$ArrayList".equals(cls.getName())) {
            Object[] array = ((List) t).toArray();
            m30265a((Object) array, (Object) array);
            return Arrays.asList(array);
        } else {
            t2 = C14816q.m30297a(cls);
        }
        m30265a((Object) t, (Object) t2);
        return t2;
    }

    /* renamed from: a */
    public static boolean m30267a(Type type) {
        if (!(type instanceof Class)) {
            return false;
        }
        Class<Boolean> cls = (Class) type;
        if (cls.isPrimitive() || cls == Character.class || cls == String.class || cls == Integer.class || cls == Long.class || cls == Short.class || cls == Byte.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == C14804h.class || cls == Boolean.class) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Type m30264a(List<Type> list, Type type) {
        if (type instanceof WildcardType) {
            type = C14816q.m30301a((WildcardType) type);
        }
        while (type instanceof TypeVariable) {
            Type a = C14816q.m30302a(list, (TypeVariable) type);
            if (a != null) {
                type = a;
            }
            if (type instanceof TypeVariable) {
                type = ((TypeVariable) type).getBounds()[0];
            }
        }
        return type;
    }

    /* renamed from: a */
    public static Object m30263a(Type type, String str) {
        Class cls;
        if (type instanceof Class) {
            cls = (Class) type;
        } else {
            cls = null;
        }
        if (type == null || cls != null) {
            if (cls == Void.class) {
                return null;
            }
            if (str == null || cls == null || cls.isAssignableFrom(String.class)) {
                return str;
            }
            if (cls == Character.class || cls == Character.TYPE) {
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                String valueOf = String.valueOf(String.valueOf(cls));
                StringBuilder sb = new StringBuilder(valueOf.length() + 37);
                sb.append("expected type Character/char but got ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            } else if (cls == Boolean.class || cls == Boolean.TYPE) {
                return Boolean.valueOf(str);
            } else {
                if (cls == Byte.class || cls == Byte.TYPE) {
                    return Byte.valueOf(str);
                }
                if (cls == Short.class || cls == Short.TYPE) {
                    return Short.valueOf(str);
                }
                if (cls == Integer.class || cls == Integer.TYPE) {
                    return Integer.valueOf(str);
                }
                if (cls == Long.class || cls == Long.TYPE) {
                    return Long.valueOf(str);
                }
                if (cls == Float.class || cls == Float.TYPE) {
                    return Float.valueOf(str);
                }
                if (cls == Double.class || cls == Double.TYPE) {
                    return Double.valueOf(str);
                }
                if (cls == C14804h.class) {
                    return C14804h.parseRfc3339(str);
                }
                if (cls == BigInteger.class) {
                    return new BigInteger(str);
                }
                if (cls == BigDecimal.class) {
                    return new BigDecimal(str);
                }
                if (cls.isEnum()) {
                    return C14795d.m30256a(cls).mo27115a(str).mo27147b();
                }
            }
        }
        String valueOf2 = String.valueOf(String.valueOf(type));
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 35);
        sb2.append("expected primitive class, but got: ");
        sb2.append(valueOf2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: a */
    public static void m30265a(Object obj, Object obj2) {
        boolean z;
        C14795d dVar;
        Class cls = obj.getClass();
        int i = 0;
        boolean z2 = true;
        if (cls == obj2.getClass()) {
            z = true;
        } else {
            z = false;
        }
        C14814o.m30289a(z);
        if (cls.isArray()) {
            if (Array.getLength(obj) != Array.getLength(obj2)) {
                z2 = false;
            }
            C14814o.m30289a(z2);
            for (Object c : C14816q.m30296a(obj)) {
                int i2 = i + 1;
                Array.set(obj2, i, m30269c(c));
                i = i2;
            }
        } else if (Collection.class.isAssignableFrom(cls)) {
            Collection<Object> collection = (Collection) obj;
            if (ArrayList.class.isAssignableFrom(cls)) {
                ((ArrayList) obj2).ensureCapacity(collection.size());
            }
            Collection collection2 = (Collection) obj2;
            for (Object c2 : collection) {
                collection2.add(m30269c(c2));
            }
        } else {
            boolean isAssignableFrom = C14806j.class.isAssignableFrom(cls);
            if (isAssignableFrom || !Map.class.isAssignableFrom(cls)) {
                if (isAssignableFrom) {
                    dVar = ((C14806j) obj).f38359i;
                } else {
                    dVar = C14795d.m30256a(cls);
                }
                for (String a : dVar.f38319c) {
                    C14805i a2 = dVar.mo27115a(a);
                    if (!a2.mo27146a() && (!isAssignableFrom || !a2.f38355a)) {
                        Object a3 = a2.mo27144a(obj);
                        if (a3 != null) {
                            a2.mo27145a(obj2, m30269c(a3));
                        }
                    }
                }
            } else if (C14782a.class.isAssignableFrom(cls)) {
                C14782a aVar = (C14782a) obj2;
                C14782a aVar2 = (C14782a) obj;
                int size = aVar2.size();
                while (i < size) {
                    aVar.mo27086a(i, m30269c(aVar2.mo27085a(i)));
                    i++;
                }
            } else {
                Map map = (Map) obj2;
                for (Entry entry : ((Map) obj).entrySet()) {
                    map.put(entry.getKey(), m30269c(entry.getValue()));
                }
            }
        }
    }
}
