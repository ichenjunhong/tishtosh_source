package com.google.p997a.p998a.p1020g;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;
import java.util.WeakHashMap;

/* renamed from: com.google.a.a.g.d */
public final class C14795d {

    /* renamed from: d */
    private static final Map<Class<?>, C14795d> f38315d = new WeakHashMap();

    /* renamed from: e */
    private static final Map<Class<?>, C14795d> f38316e = new WeakHashMap();

    /* renamed from: a */
    public final Class<?> f38317a;

    /* renamed from: b */
    public final boolean f38318b;

    /* renamed from: c */
    public final List<String> f38319c;

    /* renamed from: f */
    private final IdentityHashMap<String, C14805i> f38320f = new IdentityHashMap<>();

    /* renamed from: a */
    public static C14795d m30256a(Class<?> cls) {
        return m30257a(cls, false);
    }

    /* renamed from: b */
    public final Field mo27116b(String str) {
        C14805i a = mo27115a(str);
        if (a == null) {
            return null;
        }
        return a.f38356b;
    }

    /* renamed from: a */
    public final C14805i mo27115a(String str) {
        if (str != null) {
            if (this.f38318b) {
                str = str.toLowerCase();
            }
            str = str.intern();
        }
        return (C14805i) this.f38320f.get(str);
    }

    /* renamed from: a */
    public static C14795d m30257a(Class<?> cls, boolean z) {
        Map<Class<?>, C14795d> map;
        C14795d dVar;
        if (cls == null) {
            return null;
        }
        if (z) {
            map = f38316e;
        } else {
            map = f38315d;
        }
        synchronized (map) {
            dVar = (C14795d) map.get(cls);
            if (dVar == null) {
                dVar = new C14795d(cls, z);
                map.put(cls, dVar);
            }
        }
        return dVar;
    }

    private C14795d(Class<?> cls, boolean z) {
        boolean z2;
        Field[] declaredFields;
        List<String> list;
        boolean z3;
        String str;
        Field field;
        boolean z4 = z;
        this.f38317a = cls;
        this.f38318b = z4;
        if (!z4 || !cls.isEnum()) {
            z2 = true;
        } else {
            z2 = false;
        }
        String valueOf = String.valueOf(String.valueOf(cls));
        StringBuilder sb = new StringBuilder(valueOf.length() + 31);
        sb.append("cannot ignore case on an enum: ");
        sb.append(valueOf);
        C14814o.m30290a(z2, (Object) sb.toString());
        TreeSet treeSet = new TreeSet(new Comparator<String>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                String str = (String) obj;
                String str2 = (String) obj2;
                if (str == str2) {
                    return 0;
                }
                if (str == null) {
                    return -1;
                }
                if (str2 == null) {
                    return 1;
                }
                return str.compareTo(str2);
            }
        });
        for (Field field2 : cls.getDeclaredFields()) {
            C14805i a = C14805i.m30275a(field2);
            if (a != null) {
                String str2 = a.f38357c;
                if (z4) {
                    str2 = str2.toLowerCase().intern();
                }
                C14805i iVar = (C14805i) this.f38320f.get(str2);
                if (iVar == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String str3 = "two fields have the same %sname <%s>: %s and %s";
                Object[] objArr = new Object[4];
                if (z4) {
                    str = "case-insensitive ";
                } else {
                    str = "";
                }
                objArr[0] = str;
                objArr[1] = str2;
                objArr[2] = field2;
                if (iVar == null) {
                    field = null;
                } else {
                    field = iVar.f38356b;
                }
                objArr[3] = field;
                C14814o.m30291a(z3, str3, objArr);
                this.f38320f.put(str2, a);
                treeSet.add(str2);
            }
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            C14795d a2 = m30257a(superclass, z4);
            treeSet.addAll(a2.f38319c);
            for (Entry entry : a2.f38320f.entrySet()) {
                String str4 = (String) entry.getKey();
                if (!this.f38320f.containsKey(str4)) {
                    this.f38320f.put(str4, entry.getValue());
                }
            }
        }
        if (treeSet.isEmpty()) {
            list = Collections.emptyList();
        } else {
            list = Collections.unmodifiableList(new ArrayList(treeSet));
        }
        this.f38319c = list;
    }
}
