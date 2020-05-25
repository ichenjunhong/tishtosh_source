package p2628d.p2650m;

import java.util.Iterator;
import p2628d.p2629a.C52549aa;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2649l.C52786h;

/* renamed from: d.m.x */
public class C52840x extends C52839w {
    /* renamed from: a */
    public static final boolean m112406a(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    /* renamed from: a */
    public static final boolean m112402a(CharSequence charSequence) {
        boolean z;
        C52711k.m112240b(charSequence, "$this$isBlank");
        if (charSequence.length() != 0) {
            Iterator it = C52830p.m112460e(charSequence).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!C52804a.m112364a(charSequence.charAt(((C52549aa) it).mo110114a()))) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final String m112397a(CharSequence charSequence, int i) {
        boolean z;
        C52711k.m112240b(charSequence, "$this$repeat");
        int i2 = 1;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            switch (i) {
                case 0:
                    return "";
                case 1:
                    return charSequence.toString();
                default:
                    switch (charSequence.length()) {
                        case 0:
                            return "";
                        case 1:
                            char charAt = charSequence.charAt(0);
                            char[] cArr = new char[i];
                            for (int i3 = 0; i3 < i; i3++) {
                                cArr[i3] = charAt;
                            }
                            return new String(cArr);
                        default:
                            StringBuilder sb = new StringBuilder(charSequence.length() * i);
                            if (i > 0) {
                                while (true) {
                                    sb.append(charSequence);
                                    if (i2 != i) {
                                        i2++;
                                    }
                                }
                            }
                            String sb2 = sb.toString();
                            C52711k.m112236a((Object) sb2, "sb.toString()");
                            return sb2;
                    }
            }
        } else {
            StringBuilder sb3 = new StringBuilder("Count 'n' must be non-negative, but was ");
            sb3.append(i);
            sb3.append('.');
            throw new IllegalArgumentException(sb3.toString().toString());
        }
    }

    /* renamed from: b */
    public static final boolean m112410b(String str, String str2, boolean z) {
        C52711k.m112240b(str, "$this$startsWith");
        C52711k.m112240b(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return C52830p.m112403a(str, 0, str2, 0, str2.length(), z);
    }

    /* renamed from: c */
    public static final boolean m112412c(String str, String str2, boolean z) {
        C52711k.m112240b(str, "$this$endsWith");
        C52711k.m112240b(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return C52830p.m112403a(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* renamed from: a */
    public static final String m112400a(String str, String str2, String str3, boolean z) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        C52711k.m112240b(str4, "$this$replace");
        C52711k.m112240b(str5, "oldValue");
        C52711k.m112240b(str6, "newValue");
        return C52786h.m112343a(C52830p.m112425a((CharSequence) str4, new String[]{str5}, z, 0, 4, (Object) null), str6, null, null, 0, null, null, 62, null);
    }

    /* renamed from: a */
    public static final String m112398a(String str, char c, char c2, boolean z) {
        C52711k.m112240b(str, "$this$replace");
        if (!z) {
            String replace = str.replace(c, c2);
            C52711k.m112236a((Object) replace, "(this as java.lang.Strin…replace(oldChar, newChar)");
            return replace;
        }
        CharSequence charSequence = str;
        char[] cArr = {c};
        C52711k.m112240b(charSequence, "$this$splitToSequence");
        C52711k.m112240b(cArr, "delimiters");
        return C52786h.m112343a(C52786h.m112348d(C52841y.m112421a(charSequence, cArr, 0, z, 0), new C52845d(charSequence)), String.valueOf(c2), null, null, 0, null, null, 62, null);
    }

    /* renamed from: b */
    public static final String m112408b(String str, String str2, String str3, boolean z) {
        C52711k.m112240b(str, "$this$replaceFirst");
        C52711k.m112240b(str2, "oldValue");
        C52711k.m112240b(str3, "newValue");
        CharSequence charSequence = str;
        int a = C52830p.m112419a(charSequence, str2, 0, z, 2, (Object) null);
        if (a < 0) {
            return str;
        }
        int length = str2.length() + a;
        CharSequence charSequence2 = str3;
        C52711k.m112240b(charSequence, "$this$replaceRange");
        C52711k.m112240b(charSequence2, "replacement");
        if (length >= a) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, a);
            sb.append(charSequence2);
            sb.append(charSequence, length, charSequence.length());
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("End index (");
        sb2.append(length);
        sb2.append(") is less than start index (");
        sb2.append(a);
        sb2.append(").");
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    /* renamed from: a */
    public static final boolean m112404a(String str, String str2, int i, boolean z) {
        C52711k.m112240b(str, "$this$startsWith");
        C52711k.m112240b(str2, "prefix");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return C52830p.m112403a(str, i, str2, 0, str2.length(), z);
    }

    /* renamed from: a */
    public static final boolean m112403a(String str, int i, String str2, int i2, int i3, boolean z) {
        C52711k.m112240b(str, "$this$regionMatches");
        C52711k.m112240b(str2, "other");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }
}
