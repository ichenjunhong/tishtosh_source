package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.jd */
final class C16795jd {

    /* renamed from: a */
    static final Class<?> f47184a = m40557c();

    /* renamed from: b */
    static final C16812ju<?, ?> f47185b = m40538a(true);

    /* renamed from: c */
    private static final C16812ju<?, ?> f47186c = m40538a(false);

    /* renamed from: d */
    private static final C16812ju<?, ?> f47187d = new C16814jw();

    /* renamed from: a */
    public static void m40543a(int i, List<Double> list, C16838kp kpVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            kpVar.mo32177g(i, list, z);
        }
    }

    /* renamed from: b */
    public static void m40554b(int i, List<Float> list, C16838kp kpVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            kpVar.mo32176f(i, list, z);
        }
    }

    /* renamed from: c */
    public static void m40558c(int i, List<Long> list, C16838kp kpVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            kpVar.mo32168c(i, list, z);
        }
    }

    /* renamed from: d */
    public static void m40562d(int i, List<Long> list, C16838kp kpVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            kpVar.mo32171d(i, list, z);
        }
    }

    /* renamed from: e */
    public static void m40565e(int i, List<Long> list, C16838kp kpVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            kpVar.mo32184n(i, list, z);
        }
    }

    /* renamed from: f */
    public static void m40568f(int i, List<Long> list, C16838kp kpVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            kpVar.mo32174e(i, list, z);
        }
    }

    /* renamed from: g */
    public static void m40571g(int i, List<Long> list, C16838kp kpVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            kpVar.mo32182l(i, list, z);
        }
    }

    /* renamed from: h */
    public static void m40574h(int i, List<Integer> list, C16838kp kpVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            kpVar.mo32157a(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m40577i(int i, List<Integer> list, C16838kp kpVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            kpVar.mo32180j(i, list, z);
        }
    }

    /* renamed from: j */
    public static void m40580j(int i, List<Integer> list, C16838kp kpVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            kpVar.mo32183m(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m40581k(int i, List<Integer> list, C16838kp kpVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            kpVar.mo32165b(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m40582l(int i, List<Integer> list, C16838kp kpVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            kpVar.mo32181k(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m40583m(int i, List<Integer> list, C16838kp kpVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            kpVar.mo32178h(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m40584n(int i, List<Boolean> list, C16838kp kpVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            kpVar.mo32179i(i, list, z);
        }
    }

    /* renamed from: a */
    public static void m40541a(int i, List<String> list, C16838kp kpVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            kpVar.mo32155a(i, list);
        }
    }

    /* renamed from: b */
    public static void m40552b(int i, List<C16691fs> list, C16838kp kpVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            kpVar.mo32163b(i, list);
        }
    }

    /* renamed from: a */
    public static void m40542a(int i, List<?> list, C16838kp kpVar, C16793jb jbVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            kpVar.mo32156a(i, list, jbVar);
        }
    }

    /* renamed from: b */
    public static void m40553b(int i, List<?> list, C16838kp kpVar, C16793jb jbVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            kpVar.mo32164b(i, list, jbVar);
        }
    }

    /* renamed from: a */
    static int m40536a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16762hy) {
            C16762hy hyVar = (C16762hy) list;
            i = 0;
            while (i2 < size) {
                i += C16709gj.m40020d(hyVar.mo32269b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C16709gj.m40020d(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    static int m40535a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m40536a(list) + (list.size() * C16709gj.m40021e(i));
    }

    /* renamed from: b */
    static int m40550b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16762hy) {
            C16762hy hyVar = (C16762hy) list;
            i = 0;
            while (i2 < size) {
                i += C16709gj.m40023e(hyVar.mo32269b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C16709gj.m40023e(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    static int m40549b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m40550b(list) + (size * C16709gj.m40021e(i));
    }

    /* renamed from: c */
    static int m40556c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16762hy) {
            C16762hy hyVar = (C16762hy) list;
            i = 0;
            while (i2 < size) {
                i += C16709gj.m40027f(hyVar.mo32269b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C16709gj.m40027f(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: c */
    static int m40555c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m40556c(list) + (size * C16709gj.m40021e(i));
    }

    /* renamed from: d */
    static int m40560d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16742he) {
            C16742he heVar = (C16742he) list;
            i = 0;
            while (i2 < size) {
                i += C16709gj.m40035i(heVar.mo32241b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C16709gj.m40035i(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: d */
    static int m40559d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m40560d(list) + (size * C16709gj.m40021e(i));
    }

    /* renamed from: e */
    static int m40564e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16742he) {
            C16742he heVar = (C16742he) list;
            i = 0;
            while (i2 < size) {
                i += C16709gj.m40024f(heVar.mo32241b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C16709gj.m40024f(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e */
    static int m40563e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m40564e(list) + (size * C16709gj.m40021e(i));
    }

    /* renamed from: f */
    static int m40567f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16742he) {
            C16742he heVar = (C16742he) list;
            i = 0;
            while (i2 < size) {
                i += C16709gj.m40028g(heVar.mo32241b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C16709gj.m40028g(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    static int m40566f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m40567f(list) + (size * C16709gj.m40021e(i));
    }

    /* renamed from: g */
    static int m40570g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C16742he) {
            C16742he heVar = (C16742he) list;
            i = 0;
            while (i2 < size) {
                i += C16709gj.m40032h(heVar.mo32241b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C16709gj.m40032h(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: g */
    static int m40569g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m40570g(list) + (size * C16709gj.m40021e(i));
    }

    /* renamed from: h */
    static int m40573h(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: h */
    static int m40572h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C16709gj.m40036i(i, 0);
    }

    /* renamed from: i */
    static int m40576i(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: i */
    static int m40575i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C16709gj.m40030g(i, 0);
    }

    /* renamed from: j */
    static int m40579j(List<?> list) {
        return list.size();
    }

    /* renamed from: j */
    static int m40578j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C16709gj.m40008b(i, true);
    }

    /* renamed from: a */
    static int m40533a(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int e = C16709gj.m40021e(i) * size;
        if (list instanceof C16757ht) {
            C16757ht htVar = (C16757ht) list;
            while (i4 < size) {
                Object b = htVar.mo32260b(i4);
                if (b instanceof C16691fs) {
                    i3 = C16709gj.m40009b((C16691fs) b);
                } else {
                    i3 = C16709gj.m40012b((String) b);
                }
                e += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof C16691fs) {
                    i2 = C16709gj.m40009b((C16691fs) obj);
                } else {
                    i2 = C16709gj.m40012b((String) obj);
                }
                e += i2;
                i4++;
            }
        }
        return e;
    }

    /* renamed from: a */
    static int m40532a(int i, Object obj, C16793jb jbVar) {
        if (obj instanceof C16755hr) {
            return C16709gj.m40000a(i, (C16755hr) obj);
        }
        return C16709gj.m40006b(i, (C16775ik) obj, jbVar);
    }

    /* renamed from: a */
    static int m40534a(int i, List<?> list, C16793jb jbVar) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = C16709gj.m40021e(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C16755hr) {
                i2 = C16709gj.m40001a((C16755hr) obj);
            } else {
                i2 = C16709gj.m40011b((C16775ik) obj, jbVar);
            }
            e += i2;
        }
        return e;
    }

    /* renamed from: b */
    static int m40547b(int i, List<C16691fs> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * C16709gj.m40021e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += C16709gj.m40009b((C16691fs) list.get(i2));
        }
        return e;
    }

    /* renamed from: b */
    static int m40548b(int i, List<C16775ik> list, C16793jb jbVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C16709gj.m40015c(i, (C16775ik) list.get(i3), jbVar);
        }
        return i2;
    }

    /* renamed from: a */
    public static C16812ju<?, ?> m40537a() {
        return f47186c;
    }

    /* renamed from: b */
    public static C16812ju<?, ?> m40551b() {
        return f47187d;
    }

    /* renamed from: a */
    private static C16812ju<?, ?> m40538a(boolean z) {
        try {
            Class d = m40561d();
            if (d == null) {
                return null;
            }
            return (C16812ju) d.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Class<?> m40557c() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Class<?> m40561d() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static boolean m40546a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    static <T, FT extends C16728gw<FT>> void m40544a(C16723gr<FT> grVar, T t, T t2) {
        C16726gu a = grVar.mo32193a((Object) t2);
        if (!a.mo32203a()) {
            grVar.mo32200b(t).mo32202a(a);
        }
    }

    /* renamed from: a */
    static <T, UT, UB> void m40545a(C16812ju<UT, UB> juVar, T t, T t2) {
        juVar.mo32363a((Object) t, juVar.mo32370c(juVar.mo32365b(t), juVar.mo32365b(t2)));
    }

    /* renamed from: a */
    static <UT, UB> UB m40540a(int i, List<Integer> list, C16746hi hiVar, UB ub, C16812ju<UT, UB> juVar) {
        UB ub2;
        if (hiVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (!hiVar.mo31922a(intValue)) {
                        ub = m40539a(i, intValue, ub2, juVar);
                        it.remove();
                    }
                }
                break loop1;
            }
        } else {
            int size = list.size();
            ub2 = ub;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue2 = ((Integer) list.get(i3)).intValue();
                if (hiVar.mo31922a(intValue2)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = m40539a(i, intValue2, ub2, juVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        }
        return ub2;
    }

    /* renamed from: a */
    static <UT, UB> UB m40539a(int i, int i2, UB ub, C16812ju<UT, UB> juVar) {
        if (ub == null) {
            ub = juVar.mo32356a();
        }
        juVar.mo32359a(ub, i, (long) i2);
        return ub;
    }
}
