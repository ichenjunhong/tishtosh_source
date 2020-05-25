package p060b.p061a.p062a.p063a;

import java.lang.reflect.Method;

/* renamed from: b.a.a.a.a */
public final class C1661a {

    /* renamed from: a */
    public static boolean f5800a;

    /* renamed from: b */
    public static boolean f5801b;

    /* renamed from: b */
    public static float m5778b() {
        try {
            return ((Float) m5776a("android.os.FtBuild", "getRomVersion", new Object[0])).floatValue();
        } catch (ClassNotFoundException | Exception unused) {
            return 2.5f;
        }
    }

    /* renamed from: a */
    public static boolean m5777a() {
        String str = "no";
        try {
            str = (String) m5776a("android.os.SystemProperties", "get", "ro.vivo.product.overseas", "no");
        } catch (ClassNotFoundException | Exception unused) {
        }
        return "yes".equals(str);
    }

    /* renamed from: a */
    private static Object m5776a(String str, String str2, Object... objArr) throws Exception {
        Class cls = Class.forName(str);
        Class[] clsArr = new Class[objArr.length];
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        Method method = cls.getMethod(str2, clsArr);
        method.setAccessible(true);
        return method.invoke(null, objArr);
    }
}
