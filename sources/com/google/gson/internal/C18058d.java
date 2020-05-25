package com.google.gson.internal;

/* renamed from: com.google.gson.internal.d */
public final class C18058d {

    /* renamed from: a */
    public static final int f50106a;

    /* renamed from: a */
    public static boolean m44246a() {
        if (f50106a >= 9) {
            return true;
        }
        return false;
    }

    static {
        String property = System.getProperty("java.version");
        int a = m44245a(property);
        if (a == -1) {
            a = m44247b(property);
        }
        if (a == -1) {
            a = 6;
        }
        f50106a = a;
    }

    /* renamed from: a */
    private static int m44245a(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            if (parseInt != 1 || split.length <= 1) {
                return parseInt;
            }
            return Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    private static int m44247b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
