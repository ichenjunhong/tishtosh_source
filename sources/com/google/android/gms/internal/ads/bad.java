package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class bad {

    /* renamed from: a */
    static final Class<?> f41700a = m35036c();

    /* renamed from: b */
    static final bau<?, ?> f41701b = m35017a(true);

    /* renamed from: c */
    private static final bau<?, ?> f41702c = m35017a(false);

    /* renamed from: d */
    private static final bau<?, ?> f41703d = new baw();

    /* renamed from: a */
    public static void m35022a(int i, List<Double> list, bbq bbq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbq.mo29772g(i, list, z);
        }
    }

    /* renamed from: b */
    public static void m35033b(int i, List<Float> list, bbq bbq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbq.mo29771f(i, list, z);
        }
    }

    /* renamed from: c */
    public static void m35037c(int i, List<Long> list, bbq bbq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbq.mo29763c(i, list, z);
        }
    }

    /* renamed from: d */
    public static void m35041d(int i, List<Long> list, bbq bbq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbq.mo29766d(i, list, z);
        }
    }

    /* renamed from: e */
    public static void m35044e(int i, List<Long> list, bbq bbq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbq.mo29779n(i, list, z);
        }
    }

    /* renamed from: f */
    public static void m35047f(int i, List<Long> list, bbq bbq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbq.mo29769e(i, list, z);
        }
    }

    /* renamed from: g */
    public static void m35050g(int i, List<Long> list, bbq bbq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbq.mo29777l(i, list, z);
        }
    }

    /* renamed from: h */
    public static void m35053h(int i, List<Integer> list, bbq bbq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbq.mo29752a(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m35056i(int i, List<Integer> list, bbq bbq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbq.mo29775j(i, list, z);
        }
    }

    /* renamed from: j */
    public static void m35059j(int i, List<Integer> list, bbq bbq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbq.mo29778m(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m35060k(int i, List<Integer> list, bbq bbq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbq.mo29760b(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m35061l(int i, List<Integer> list, bbq bbq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbq.mo29776k(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m35062m(int i, List<Integer> list, bbq bbq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbq.mo29773h(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m35063n(int i, List<Boolean> list, bbq bbq, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbq.mo29774i(i, list, z);
        }
    }

    /* renamed from: a */
    public static void m35020a(int i, List<String> list, bbq bbq) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbq.mo29750a(i, list);
        }
    }

    /* renamed from: b */
    public static void m35031b(int i, List<awo> list, bbq bbq) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbq.mo29758b(i, list);
        }
    }

    /* renamed from: a */
    public static void m35021a(int i, List<?> list, bbq bbq, bab bab) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbq.mo29751a(i, list, bab);
        }
    }

    /* renamed from: b */
    public static void m35032b(int i, List<?> list, bbq bbq, bab bab) throws IOException {
        if (list != null && !list.isEmpty()) {
            bbq.mo29759b(i, list, bab);
        }
    }

    /* renamed from: a */
    static int m35015a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ayx) {
            ayx ayx = (ayx) list;
            i = 0;
            while (i2 < size) {
                i += axf.m34448d(ayx.mo29865b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + axf.m34448d(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    static int m35014a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m35015a(list) + (list.size() * axf.m34450e(i));
    }

    /* renamed from: b */
    static int m35029b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ayx) {
            ayx ayx = (ayx) list;
            i = 0;
            while (i2 < size) {
                i += axf.m34452e(ayx.mo29865b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + axf.m34452e(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    static int m35028b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m35029b(list) + (size * axf.m34450e(i));
    }

    /* renamed from: c */
    static int m35035c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ayx) {
            ayx ayx = (ayx) list;
            i = 0;
            while (i2 < size) {
                i += axf.m34456f(ayx.mo29865b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + axf.m34456f(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: c */
    static int m35034c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m35035c(list) + (size * axf.m34450e(i));
    }

    /* renamed from: d */
    static int m35039d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aya) {
            aya aya = (aya) list;
            i = 0;
            while (i2 < size) {
                i += axf.m34464i(aya.mo29834c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + axf.m34464i(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: d */
    static int m35038d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m35039d(list) + (size * axf.m34450e(i));
    }

    /* renamed from: e */
    static int m35043e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aya) {
            aya aya = (aya) list;
            i = 0;
            while (i2 < size) {
                i += axf.m34453f(aya.mo29834c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + axf.m34453f(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e */
    static int m35042e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m35043e(list) + (size * axf.m34450e(i));
    }

    /* renamed from: f */
    static int m35046f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aya) {
            aya aya = (aya) list;
            i = 0;
            while (i2 < size) {
                i += axf.m34457g(aya.mo29834c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + axf.m34457g(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    static int m35045f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m35046f(list) + (size * axf.m34450e(i));
    }

    /* renamed from: g */
    static int m35049g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aya) {
            aya aya = (aya) list;
            i = 0;
            while (i2 < size) {
                i += axf.m34461h(aya.mo29834c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + axf.m34461h(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: g */
    static int m35048g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m35049g(list) + (size * axf.m34450e(i));
    }

    /* renamed from: h */
    static int m35052h(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: h */
    static int m35051h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * axf.m34465i(i, 0);
    }

    /* renamed from: i */
    static int m35055i(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: i */
    static int m35054i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * axf.m34459g(i, 0);
    }

    /* renamed from: j */
    static int m35058j(List<?> list) {
        return list.size();
    }

    /* renamed from: j */
    static int m35057j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * axf.m34436b(i, true);
    }

    /* renamed from: a */
    static int m35012a(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int e = axf.m34450e(i) * size;
        if (list instanceof ays) {
            ays ays = (ays) list;
            while (i4 < size) {
                Object b = ays.mo29856b(i4);
                if (b instanceof awo) {
                    i3 = axf.m34437b((awo) b);
                } else {
                    i3 = axf.m34440b((String) b);
                }
                e += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof awo) {
                    i2 = axf.m34437b((awo) obj);
                } else {
                    i2 = axf.m34440b((String) obj);
                }
                e += i2;
                i4++;
            }
        }
        return e;
    }

    /* renamed from: a */
    static int m35011a(int i, Object obj, bab bab) {
        if (obj instanceof ayq) {
            return axf.m34428a(i, (ayq) obj);
        }
        return axf.m34434b(i, (azj) obj, bab);
    }

    /* renamed from: a */
    static int m35013a(int i, List<?> list, bab bab) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = axf.m34450e(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof ayq) {
                i2 = axf.m34429a((ayq) obj);
            } else {
                i2 = axf.m34439b((azj) obj, bab);
            }
            e += i2;
        }
        return e;
    }

    /* renamed from: b */
    static int m35026b(int i, List<awo> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * axf.m34450e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += axf.m34437b((awo) list.get(i2));
        }
        return e;
    }

    /* renamed from: b */
    static int m35027b(int i, List<azj> list, bab bab) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += axf.m34444c(i, (azj) list.get(i3), bab);
        }
        return i2;
    }

    /* renamed from: a */
    public static bau<?, ?> m35016a() {
        return f41702c;
    }

    /* renamed from: b */
    public static bau<?, ?> m35030b() {
        return f41703d;
    }

    /* renamed from: a */
    private static bau<?, ?> m35017a(boolean z) {
        try {
            Class d = m35040d();
            if (d == null) {
                return null;
            }
            return (bau) d.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Class<?> m35036c() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Class<?> m35040d() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static boolean m35025a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    static <T, FT extends axs<FT>> void m35023a(axn<FT> axn, T t, T t2) {
        axq a = axn.mo29788a((Object) t2);
        if (!a.mo29798a()) {
            axn.mo29795b(t).mo29797a(a);
        }
    }

    /* renamed from: a */
    static <T, UT, UB> void m35024a(bau<UT, UB> bau, T t, T t2) {
        bau.mo29961a((Object) t, bau.mo29968c(bau.mo29963b(t), bau.mo29963b(t2)));
    }

    /* renamed from: a */
    static <UT, UB> UB m35019a(int i, List<Integer> list, aye aye, UB ub, bau<UT, UB> bau) {
        UB ub2;
        if (aye == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (!aye.mo29113a(intValue)) {
                        ub = m35018a(i, intValue, ub2, bau);
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
                if (aye.mo29113a(intValue2)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = m35018a(i, intValue2, ub2, bau);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        }
        return ub2;
    }

    /* renamed from: a */
    static <UT, UB> UB m35018a(int i, int i2, UB ub, bau<UT, UB> bau) {
        if (ub == null) {
            ub = bau.mo29954a();
        }
        bau.mo29957a(ub, i, (long) i2);
        return ub;
    }
}
