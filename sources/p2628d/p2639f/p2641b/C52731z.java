package p2628d.p2639f.p2641b;

import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p2628d.C52598c;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52672c;
import p2628d.p2639f.p2640a.C52673d;
import p2628d.p2639f.p2640a.C52674e;
import p2628d.p2639f.p2640a.C52675f;
import p2628d.p2639f.p2640a.C52676g;
import p2628d.p2639f.p2640a.C52677h;
import p2628d.p2639f.p2640a.C52678i;
import p2628d.p2639f.p2640a.C52679j;
import p2628d.p2639f.p2640a.C52680k;
import p2628d.p2639f.p2640a.C52681l;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52683n;
import p2628d.p2639f.p2640a.C52684o;
import p2628d.p2639f.p2640a.C52685p;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2640a.C52689t;
import p2628d.p2639f.p2640a.C52690u;
import p2628d.p2639f.p2640a.C52691v;
import p2628d.p2639f.p2640a.C52692w;
import p2628d.p2639f.p2641b.p2642a.C52695a;
import p2628d.p2639f.p2641b.p2642a.C52696b;
import p2628d.p2639f.p2641b.p2642a.C52697c;
import p2628d.p2639f.p2641b.p2642a.C52698d;
import p2628d.p2639f.p2641b.p2642a.C52699e;
import p2628d.p2639f.p2641b.p2642a.C52700f;

/* renamed from: d.f.b.z */
public class C52731z {
    /* renamed from: a */
    private static ClassCastException m112260a(ClassCastException classCastException) {
        throw ((ClassCastException) m112262a((T) classCastException));
    }

    /* renamed from: a */
    private static <T extends Throwable> T m112262a(T t) {
        return C52711k.m112233a(t, C52731z.class.getName());
    }

    /* renamed from: c */
    public static boolean m112267c(Object obj) {
        if (!(obj instanceof List) || ((obj instanceof C52695a) && !(obj instanceof C52698d))) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static Iterable m112271g(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw m112260a(e);
        }
    }

    /* renamed from: h */
    private static Collection m112272h(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw m112260a(e);
        }
    }

    /* renamed from: i */
    private static List m112273i(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw m112260a(e);
        }
    }

    /* renamed from: j */
    private static Set m112274j(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw m112260a(e);
        }
    }

    /* renamed from: k */
    private static Map m112275k(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw m112260a(e);
        }
    }

    /* renamed from: a */
    public static Iterable m112261a(Object obj) {
        if ((obj instanceof C52695a) && !(obj instanceof C52697c)) {
            m112263a(obj, "kotlin.collections.MutableIterable");
        }
        return m112271g(obj);
    }

    /* renamed from: d */
    public static List m112268d(Object obj) {
        if ((obj instanceof C52695a) && !(obj instanceof C52698d)) {
            m112263a(obj, "kotlin.collections.MutableList");
        }
        return m112273i(obj);
    }

    /* renamed from: e */
    public static Set m112269e(Object obj) {
        if ((obj instanceof C52695a) && !(obj instanceof C52700f)) {
            m112263a(obj, "kotlin.collections.MutableSet");
        }
        return m112274j(obj);
    }

    /* renamed from: f */
    public static Map m112270f(Object obj) {
        if ((obj instanceof C52695a) && !(obj instanceof C52699e)) {
            m112263a(obj, "kotlin.collections.MutableMap");
        }
        return m112275k(obj);
    }

    /* renamed from: b */
    public static Collection m112266b(Object obj) {
        if ((obj instanceof C52695a) && !(obj instanceof C52696b)) {
            m112263a(obj, "kotlin.collections.MutableCollection");
        }
        return m112272h(obj);
    }

    /* renamed from: l */
    private static int m112276l(Object obj) {
        if (obj instanceof C52709i) {
            return ((C52709i) obj).getArity();
        }
        if (obj instanceof C52670a) {
            return 0;
        }
        if (obj instanceof C52671b) {
            return 1;
        }
        if (obj instanceof C52682m) {
            return 2;
        }
        if (obj instanceof C52686q) {
            return 3;
        }
        if (obj instanceof C52687r) {
            return 4;
        }
        if (obj instanceof C52688s) {
            return 5;
        }
        if (obj instanceof C52689t) {
            return 6;
        }
        if (obj instanceof C52690u) {
            return 7;
        }
        if (obj instanceof C52691v) {
            return 8;
        }
        if (obj instanceof C52692w) {
            return 9;
        }
        if (obj instanceof C52672c) {
            return 10;
        }
        if (obj instanceof C52673d) {
            return 11;
        }
        if (obj instanceof C52674e) {
            return 12;
        }
        if (obj instanceof C52675f) {
            return 13;
        }
        if (obj instanceof C52676g) {
            return 14;
        }
        if (obj instanceof C52677h) {
            return 15;
        }
        if (obj instanceof C52678i) {
            return 16;
        }
        if (obj instanceof C52679j) {
            return 17;
        }
        if (obj instanceof C52680k) {
            return 18;
        }
        if (obj instanceof C52681l) {
            return 19;
        }
        if (obj instanceof C52683n) {
            return 20;
        }
        if (obj instanceof C52684o) {
            return 21;
        }
        if (obj instanceof C52685p) {
            return 22;
        }
        return -1;
    }

    /* renamed from: b */
    public static Object m112265b(Object obj, int i) {
        if (obj != null && !m112264a(obj, i)) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.functions.Function");
            sb.append(i);
            m112263a(obj, sb.toString());
        }
        return obj;
    }

    /* renamed from: a */
    private static void m112263a(Object obj, String str) {
        String str2;
        if (obj == null) {
            str2 = TEVideoRecorder.FACE_BEAUTY_NULL;
        } else {
            str2 = obj.getClass().getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" cannot be cast to ");
        sb.append(str);
        throw m112260a(new ClassCastException(sb.toString()));
    }

    /* renamed from: a */
    public static boolean m112264a(Object obj, int i) {
        if (!(obj instanceof C52598c) || m112276l(obj) != i) {
            return false;
        }
        return true;
    }
}
