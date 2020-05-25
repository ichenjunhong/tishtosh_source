package com.google.p1057b.p1058a;

/* renamed from: com.google.b.a.k */
public final class C17421k {
    /* renamed from: a */
    public static void m42660a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m42661a(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(m42657a(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: a */
    public static void m42664a(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(m42657a(str, obj));
        }
    }

    /* renamed from: a */
    public static void m42663a(boolean z, String str, long j, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(m42657a(str, Long.valueOf(j), obj));
        }
    }

    /* renamed from: a */
    public static void m42665a(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(m42657a(str, obj, obj2));
        }
    }

    /* renamed from: a */
    public static void m42662a(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalStateException(m42657a(str, Long.valueOf(j)));
        }
    }

    /* renamed from: a */
    public static <T> T m42653a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: b */
    public static void m42667b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public static void m42659a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static <T> T m42654a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: b */
    public static int m42666b(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m42656a(i, i2, "index"));
    }

    /* renamed from: b */
    public static void m42668b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static int m42652a(int i, int i2) {
        String str;
        String str2 = "index";
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            str = m42657a("%s (%s) must not be negative", str2, Integer.valueOf(i));
        } else if (i2 < 0) {
            StringBuilder sb = new StringBuilder("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            str = m42657a("%s (%s) must be less than size (%s)", str2, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str);
    }

    /* renamed from: a */
    public static String m42657a(String str, Object... objArr) {
        String valueOf = String.valueOf(str);
        int i = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        }
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i2 = 0;
        while (i < objArr.length) {
            int indexOf = valueOf.indexOf("%s", i2);
            if (indexOf == -1) {
                break;
            }
            sb.append(valueOf, i2, indexOf);
            int i3 = i + 1;
            sb.append(objArr[i]);
            int i4 = i3;
            i2 = indexOf + 2;
            i = i4;
        }
        sb.append(valueOf, i2, valueOf.length());
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
    public static <T> T m42655a(T t, String str, Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(m42657a(str, objArr));
    }

    /* renamed from: b */
    public static void m42669b(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(m42657a(str, obj));
        }
    }

    /* renamed from: a */
    private static String m42656a(int i, int i2, String str) {
        if (i < 0) {
            return m42657a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return m42657a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public static void m42658a(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = m42656a(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = m42656a(i2, i3, "end index");
            } else {
                str = m42657a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }
}
