package com.google.p997a.p998a.p1015f.p1016a.p1017a.p1018a.p1019a;

/* renamed from: com.google.a.a.f.a.a.a.a.b */
public final class C14780b {
    /* renamed from: a */
    public static <T> T m30226a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static void m30229a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static <T> T m30227a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static String m30228a(String str, Object... objArr) {
        String valueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (i < objArr.length) {
            int indexOf = valueOf.indexOf("%s", i2);
            if (indexOf == -1) {
                break;
            }
            sb.append(valueOf.substring(i2, indexOf));
            int i3 = i + 1;
            sb.append(objArr[i]);
            int i4 = i3;
            i2 = indexOf + 2;
            i = i4;
        }
        sb.append(valueOf.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            int i5 = i + 1;
            sb.append(objArr[i]);
            while (i5 < objArr.length) {
                sb.append(", ");
                int i6 = i5 + 1;
                sb.append(objArr[i5]);
                i5 = i6;
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m30230a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m30231a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(m30228a(str, objArr));
        }
    }
}
