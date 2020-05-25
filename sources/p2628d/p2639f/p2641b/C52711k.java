package p2628d.p2639f.p2641b;

import com.taobao.android.dexposed.ClassUtils;
import java.util.Arrays;
import p2628d.C52644e;
import p2628d.C52859w;

/* renamed from: d.f.b.k */
public class C52711k {
    private C52711k() {
    }

    /* renamed from: a */
    public static int m112230a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: a */
    public static boolean m112239a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static void m112234a() {
        throw ((C52644e) m112232a((T) new C52644e()));
    }

    /* renamed from: b */
    private static void m112241b(String str) {
        throw ((C52859w) m112232a((T) new C52859w(str)));
    }

    /* renamed from: a */
    private static <T extends Throwable> T m112232a(T t) {
        return m112233a(t, C52711k.class.getName());
    }

    /* renamed from: c */
    private static void m112242c(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        StringBuilder sb = new StringBuilder("Parameter specified as non-null is null: method ");
        sb.append(className);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(methodName);
        sb.append(", parameter ");
        sb.append(str);
        throw ((IllegalArgumentException) m112232a((T) new IllegalArgumentException(sb.toString())));
    }

    /* renamed from: a */
    public static void m112237a(String str) {
        StringBuilder sb = new StringBuilder("lateinit property ");
        sb.append(str);
        sb.append(" has not been initialized");
        m112241b(sb.toString());
    }

    /* renamed from: a */
    public static void m112235a(int i, String str) {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: b */
    public static void m112240b(Object obj, String str) {
        if (obj == null) {
            m112242c(str);
        }
    }

    /* renamed from: a */
    public static String m112231a(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(obj);
        return sb.toString();
    }

    /* renamed from: a */
    static <T extends Throwable> T m112233a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: a */
    public static void m112236a(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" must not be null");
            throw ((IllegalStateException) m112232a((T) new IllegalStateException(sb.toString())));
        }
    }

    /* renamed from: a */
    public static boolean m112238a(Float f, float f2) {
        if (f == null || f.floatValue() != 0.0f) {
            return false;
        }
        return true;
    }
}
