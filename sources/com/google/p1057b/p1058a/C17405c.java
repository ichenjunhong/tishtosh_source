package com.google.p1057b.p1058a;

/* renamed from: com.google.b.a.c */
public final class C17405c {
    /* renamed from: a */
    private static boolean m42621a(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* renamed from: a */
    public static String m42620a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m42621a(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m42621a(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }
}
