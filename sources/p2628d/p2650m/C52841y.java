package p2628d.p2650m;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.p2629a.C52568f;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2647j.C52748a;
import p2628d.p2647j.C52751c;
import p2628d.p2647j.C52753d;
import p2628d.p2649l.C52785g;
import p2628d.p2649l.C52786h;

/* renamed from: d.m.y */
public class C52841y extends C52840x {

    /* renamed from: d.m.y$a */
    static final class C52842a extends C52712l implements C52682m<CharSequence, Integer, C52847n<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ char[] f131086a;

        /* renamed from: b */
        final /* synthetic */ boolean f131087b;

        C52842a(char[] cArr, boolean z) {
            this.f131086a = cArr;
            this.f131087b = z;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            CharSequence charSequence = (CharSequence) obj;
            int intValue = ((Number) obj2).intValue();
            C52711k.m112240b(charSequence, "$receiver");
            int a = C52830p.m112420a(charSequence, this.f131086a, intValue, this.f131087b);
            if (a < 0) {
                return null;
            }
            return C52856t.m112465a(Integer.valueOf(a), Integer.valueOf(1));
        }
    }

    /* renamed from: d.m.y$b */
    static final class C52843b extends C52712l implements C52682m<CharSequence, Integer, C52847n<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ List f131088a;

        /* renamed from: b */
        final /* synthetic */ boolean f131089b;

        C52843b(List list, boolean z) {
            this.f131088a = list;
            this.f131089b = z;
            super(2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:60:0x0134  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x014b A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r14, java.lang.Object r15) {
            /*
                r13 = this;
                java.lang.CharSequence r14 = (java.lang.CharSequence) r14
                java.lang.Number r15 = (java.lang.Number) r15
                int r2 = r15.intValue()
                java.lang.String r15 = "$receiver"
                p2628d.p2639f.p2641b.C52711k.m112240b(r14, r15)
                java.util.List r15 = r13.f131088a
                java.util.Collection r15 = (java.util.Collection) r15
                boolean r9 = r13.f131089b
                r0 = 0
                r10 = 0
                if (r9 != 0) goto L_0x0092
                int r1 = r15.size()
                r3 = 1
                if (r1 != r3) goto L_0x0092
                java.lang.Iterable r15 = (java.lang.Iterable) r15
                java.lang.String r1 = "$this$single"
                p2628d.p2639f.p2641b.C52711k.m112240b(r15, r1)
                boolean r1 = r15 instanceof java.util.List
                if (r1 == 0) goto L_0x0050
                java.util.List r15 = (java.util.List) r15
                java.lang.String r1 = "$this$single"
                p2628d.p2639f.p2641b.C52711k.m112240b(r15, r1)
                int r1 = r15.size()
                switch(r1) {
                    case 0: goto L_0x0046;
                    case 1: goto L_0x0041;
                    default: goto L_0x0037;
                }
            L_0x0037:
                java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
                java.lang.String r15 = "List has more than one element."
                r14.<init>(r15)
                java.lang.Throwable r14 = (java.lang.Throwable) r14
                throw r14
            L_0x0041:
                java.lang.Object r15 = r15.get(r0)
                goto L_0x0065
            L_0x0046:
                java.util.NoSuchElementException r14 = new java.util.NoSuchElementException
                java.lang.String r15 = "List is empty."
                r14.<init>(r15)
                java.lang.Throwable r14 = (java.lang.Throwable) r14
                throw r14
            L_0x0050:
                java.util.Iterator r15 = r15.iterator()
                boolean r0 = r15.hasNext()
                if (r0 == 0) goto L_0x0088
                java.lang.Object r0 = r15.next()
                boolean r15 = r15.hasNext()
                if (r15 != 0) goto L_0x007e
                r15 = r0
            L_0x0065:
                java.lang.String r15 = (java.lang.String) r15
                r3 = 0
                r4 = 4
                r5 = 0
                r0 = r14
                r1 = r15
                int r14 = p2628d.p2650m.C52830p.m112419a(r0, r1, r2, r3, r4, r5)
                if (r14 >= 0) goto L_0x0074
                goto L_0x0131
            L_0x0074:
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                d.n r14 = p2628d.C52856t.m112465a(r14, r15)
                goto L_0x0132
            L_0x007e:
                java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
                java.lang.String r15 = "Collection has more than one element."
                r14.<init>(r15)
                java.lang.Throwable r14 = (java.lang.Throwable) r14
                throw r14
            L_0x0088:
                java.util.NoSuchElementException r14 = new java.util.NoSuchElementException
                java.lang.String r15 = "Collection is empty."
                r14.<init>(r15)
                java.lang.Throwable r14 = (java.lang.Throwable) r14
                throw r14
            L_0x0092:
                int r0 = p2628d.p2647j.C52753d.m112321c(r2, r0)
                d.j.c r1 = new d.j.c
                int r2 = r14.length()
                r1.<init>(r0, r2)
                d.j.a r1 = (p2628d.p2647j.C52748a) r1
                boolean r0 = r14 instanceof java.lang.String
                if (r0 == 0) goto L_0x00e9
                int r0 = r1.f130995a
                int r2 = r1.f130996b
                int r1 = r1.f130997c
                if (r1 < 0) goto L_0x00b0
                if (r0 > r2) goto L_0x0131
                goto L_0x00b2
            L_0x00b0:
                if (r0 < r2) goto L_0x0131
            L_0x00b2:
                r3 = r15
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                java.util.Iterator r11 = r3.iterator()
            L_0x00b9:
                boolean r3 = r11.hasNext()
                if (r3 == 0) goto L_0x00d7
                java.lang.Object r12 = r11.next()
                r3 = r12
                java.lang.String r3 = (java.lang.String) r3
                r4 = 0
                r5 = r14
                java.lang.String r5 = (java.lang.String) r5
                int r7 = r3.length()
                r6 = r0
                r8 = r9
                boolean r3 = p2628d.p2650m.C52830p.m112403a(r3, r4, r5, r6, r7, r8)
                if (r3 == 0) goto L_0x00b9
                goto L_0x00d8
            L_0x00d7:
                r12 = r10
            L_0x00d8:
                java.lang.String r12 = (java.lang.String) r12
                if (r12 == 0) goto L_0x00e5
                java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
                d.n r14 = p2628d.C52856t.m112465a(r14, r12)
                goto L_0x0132
            L_0x00e5:
                if (r0 == r2) goto L_0x0131
                int r0 = r0 + r1
                goto L_0x00b2
            L_0x00e9:
                int r0 = r1.f130995a
                int r6 = r1.f130996b
                int r7 = r1.f130997c
                if (r7 < 0) goto L_0x00f4
                if (r0 > r6) goto L_0x0131
                goto L_0x00f6
            L_0x00f4:
                if (r0 < r6) goto L_0x0131
            L_0x00f6:
                r8 = r0
            L_0x00f7:
                r0 = r15
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r11 = r0.iterator()
            L_0x00fe:
                boolean r0 = r11.hasNext()
                if (r0 == 0) goto L_0x011f
                java.lang.Object r12 = r11.next()
                r0 = r12
                java.lang.String r0 = (java.lang.String) r0
                r1 = r0
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r2 = 0
                int r4 = r0.length()
                r0 = r1
                r1 = r2
                r2 = r14
                r3 = r8
                r5 = r9
                boolean r0 = p2628d.p2650m.C52830p.m112440a(r0, r1, r2, r3, r4, r5)
                if (r0 == 0) goto L_0x00fe
                goto L_0x0120
            L_0x011f:
                r12 = r10
            L_0x0120:
                java.lang.String r12 = (java.lang.String) r12
                if (r12 == 0) goto L_0x012d
                java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
                d.n r14 = p2628d.C52856t.m112465a(r14, r12)
                goto L_0x0132
            L_0x012d:
                if (r8 == r6) goto L_0x0131
                int r8 = r8 + r7
                goto L_0x00f7
            L_0x0131:
                r14 = r10
            L_0x0132:
                if (r14 == 0) goto L_0x014b
                java.lang.Object r15 = r14.getFirst()
                java.lang.Object r14 = r14.getSecond()
                java.lang.String r14 = (java.lang.String) r14
                int r14 = r14.length()
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                d.n r14 = p2628d.C52856t.m112465a(r15, r14)
                return r14
            L_0x014b:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p2628d.p2650m.C52841y.C52843b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: d.m.y$c */
    static final class C52844c extends C52712l implements C52671b<C52751c, String> {

        /* renamed from: a */
        final /* synthetic */ CharSequence f131090a;

        C52844c(CharSequence charSequence) {
            this.f131090a = charSequence;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52751c cVar = (C52751c) obj;
            C52711k.m112240b(cVar, "it");
            return C52830p.m112429a(this.f131090a, cVar);
        }
    }

    /* renamed from: d.m.y$d */
    static final class C52845d extends C52712l implements C52671b<C52751c, String> {

        /* renamed from: a */
        final /* synthetic */ CharSequence f131091a;

        C52845d(CharSequence charSequence) {
            this.f131091a = charSequence;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52751c cVar = (C52751c) obj;
            C52711k.m112240b(cVar, "it");
            return C52830p.m112429a(this.f131091a, cVar);
        }
    }

    /* renamed from: a */
    public static final CharSequence m112426a(CharSequence charSequence, int i, char c) {
        C52711k.m112240b(charSequence, "$this$padStart");
        if (i < 0) {
            StringBuilder sb = new StringBuilder("Desired length ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString());
        } else if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i);
            int length = i - charSequence.length();
            if (length > 0) {
                int i2 = 1;
                while (true) {
                    sb2.append(c);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb2.append(charSequence);
            return sb2;
        }
    }

    /* renamed from: a */
    public static final String m112430a(String str, int i, char c) {
        C52711k.m112240b(str, "$this$padStart");
        return C52830p.m112426a((CharSequence) str, 2, '0').toString();
    }

    /* renamed from: a */
    public static final String m112431a(String str, C52751c cVar) {
        C52711k.m112240b(str, "$this$substring");
        C52711k.m112240b(cVar, "range");
        String substring = str.substring(cVar.mo110348b().intValue(), cVar.mo110349c().intValue() + 1);
        C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: a */
    public static final String m112429a(CharSequence charSequence, C52751c cVar) {
        C52711k.m112240b(charSequence, "$this$substring");
        C52711k.m112240b(cVar, "range");
        return charSequence.subSequence(cVar.mo110348b().intValue(), cVar.mo110349c().intValue() + 1).toString();
    }

    /* renamed from: a */
    public static final CharSequence m112427a(CharSequence charSequence, int i, int i2) {
        C52711k.m112240b(charSequence, "$this$removeRange");
        if (i2 < i) {
            StringBuilder sb = new StringBuilder("End index (");
            sb.append(i2);
            sb.append(") is less than start index (");
            sb.append(i);
            sb.append(").");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 == i) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb2 = new StringBuilder(charSequence.length() - (i2 - i));
            sb2.append(charSequence, 0, i);
            sb2.append(charSequence, i2, charSequence.length());
            return sb2;
        }
    }

    /* renamed from: a */
    public static final CharSequence m112428a(CharSequence charSequence, CharSequence charSequence2) {
        C52711k.m112240b(charSequence, "$this$removeSuffix");
        C52711k.m112240b(charSequence2, "suffix");
        if (C52830p.m112441a(charSequence, charSequence2, false)) {
            return charSequence.subSequence(0, charSequence.length() - charSequence2.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    /* renamed from: a */
    public static final String m112432a(String str, CharSequence charSequence) {
        C52711k.m112240b(str, "$this$removeSuffix");
        C52711k.m112240b(charSequence, "suffix");
        if (!C52830p.m112441a((CharSequence) str, charSequence, false)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: a */
    public static final String m112433a(String str, CharSequence charSequence, CharSequence charSequence2) {
        boolean z;
        C52711k.m112240b(str, "$this$removeSurrounding");
        C52711k.m112240b(charSequence, "prefix");
        C52711k.m112240b(charSequence2, "suffix");
        if (str.length() >= charSequence.length() + charSequence2.length()) {
            CharSequence charSequence3 = str;
            C52711k.m112240b(charSequence3, "$this$startsWith");
            C52711k.m112240b(charSequence, "prefix");
            if (!(charSequence3 instanceof String) || !(charSequence instanceof String)) {
                z = C52830p.m112440a(charSequence3, 0, charSequence, 0, charSequence.length(), false);
            } else {
                z = C52830p.m112410b((String) charSequence3, (String) charSequence, false);
            }
            if (z && C52830p.m112441a(charSequence3, charSequence2, false)) {
                String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
                C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return substring;
            }
        }
        return str;
    }

    /* renamed from: a */
    public static final boolean m112440a(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C52711k.m112240b(charSequence, "$this$regionMatchesImpl");
        C52711k.m112240b(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C52804a.m112365a(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m112438a(CharSequence charSequence, char c, boolean z) {
        C52711k.m112240b(charSequence, "$this$endsWith");
        return charSequence.length() > 0 && C52804a.m112365a(charSequence.charAt(C52830p.m112461f(charSequence)), c, z);
    }

    /* renamed from: a */
    public static final boolean m112441a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C52711k.m112240b(charSequence, "$this$endsWith");
        C52711k.m112240b(charSequence2, "suffix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C52830p.m112412c((String) charSequence, (String) charSequence2, false);
        }
        return C52830p.m112440a(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: b */
    public static final boolean m112455b(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C52711k.m112240b(charSequence, "$this$contains");
        C52711k.m112240b(charSequence2, "other");
        if (charSequence2 instanceof String) {
            return C52830p.m112419a(charSequence, (String) charSequence2, 0, z, 2, (Object) null) >= 0;
        }
        return m112416a(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0;
    }

    /* renamed from: b */
    public static final boolean m112453b(CharSequence charSequence, char c, boolean z) {
        C52711k.m112240b(charSequence, "$this$contains");
        return C52830p.m112415a(charSequence, c, 0, z, 2, (Object) null) >= 0;
    }

    /* renamed from: a */
    public static /* synthetic */ C52785g m112425a(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return C52830p.m112424a(charSequence, strArr, z, 0);
    }

    /* renamed from: a */
    public static final C52785g<String> m112424a(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C52711k.m112240b(charSequence, "$this$splitToSequence");
        C52711k.m112240b(strArr, "delimiters");
        return C52786h.m112348d(m112423a(charSequence, strArr, 0, z, i, 2, (Object) null), new C52844c(charSequence));
    }

    /* renamed from: a */
    public static final List<String> m112436a(CharSequence charSequence, char[] cArr, boolean z, int i) {
        C52711k.m112240b(charSequence, "$this$split");
        C52711k.m112240b(cArr, "delimiters");
        if (cArr.length == 1) {
            return m112435a(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable<C52751c> j = C52786h.m112356j(m112421a(charSequence, cArr, 0, z, i));
        Collection arrayList = new ArrayList(C52575l.m112104a(j, 10));
        for (C52751c a : j) {
            arrayList.add(C52830p.m112429a(charSequence, a));
        }
        return (List) arrayList;
    }

    /* renamed from: a */
    private static final List<String> m112435a(CharSequence charSequence, String str, boolean z, int i) {
        int i2 = 0;
        if (i >= 0) {
            int a = C52830p.m112418a(charSequence, str, 0, z);
            if (a == -1 || i == 1) {
                return C52575l.m112092a(charSequence.toString());
            }
            boolean z2 = i > 0;
            int i3 = 10;
            if (z2) {
                i3 = C52753d.m112322d(i, 10);
            }
            ArrayList arrayList = new ArrayList(i3);
            do {
                arrayList.add(charSequence.subSequence(i2, a).toString());
                i2 = str.length() + a;
                if (z2 && arrayList.size() == i - 1) {
                    break;
                }
                a = C52830p.m112418a(charSequence, str, i2, z);
            } while (a != -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        StringBuilder sb = new StringBuilder("Limit must be non-negative, but was ");
        sb.append(i);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    private static /* synthetic */ C52785g m112423a(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if (i2 >= 0) {
            return new C52809e(charSequence, 0, i2, new C52843b(C52568f.m112068a(strArr), z));
        }
        StringBuilder sb = new StringBuilder("Limit must be non-negative, but was ");
        sb.append(i2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: f */
    public static final int m112461f(CharSequence charSequence) {
        C52711k.m112240b(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    /* renamed from: h */
    public static final List<String> m112463h(CharSequence charSequence) {
        C52711k.m112240b(charSequence, "$this$lines");
        return C52786h.m112353g(C52830p.m112462g(charSequence));
    }

    /* renamed from: e */
    public static final C52751c m112460e(CharSequence charSequence) {
        C52711k.m112240b(charSequence, "$this$indices");
        return new C52751c(0, charSequence.length() - 1);
    }

    /* renamed from: c */
    public static final CharSequence m112457c(CharSequence charSequence) {
        C52711k.m112240b(charSequence, "$this$trimStart");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!C52804a.m112364a(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    /* renamed from: d */
    public static final CharSequence m112459d(CharSequence charSequence) {
        C52711k.m112240b(charSequence, "$this$trimEnd");
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return "";
            }
        } while (C52804a.m112364a(charSequence.charAt(length)));
        return charSequence.subSequence(0, length + 1);
    }

    /* renamed from: g */
    public static final C52785g<String> m112462g(CharSequence charSequence) {
        C52711k.m112240b(charSequence, "$this$lineSequence");
        return C52830p.m112425a(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    /* renamed from: b */
    public static final CharSequence m112447b(CharSequence charSequence) {
        int i;
        C52711k.m112240b(charSequence, "$this$trim");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean a = C52804a.m112364a(charSequence.charAt(i));
            if (z) {
                if (!a) {
                    break;
                }
                length--;
            } else if (!a) {
                z = true;
            } else {
                i2++;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    /* renamed from: b */
    public static final String m112448b(String str, CharSequence charSequence) {
        C52711k.m112240b(str, "$this$removeSurrounding");
        C52711k.m112240b(charSequence, "delimiter");
        return C52830p.m112433a(str, charSequence, charSequence);
    }

    /* renamed from: c */
    public static final String m112458c(String str, String str2, String str3) {
        C52711k.m112240b(str, "$this$substringAfterLast");
        C52711k.m112240b(str2, "delimiter");
        C52711k.m112240b(str3, "missingDelimiterValue");
        int b = C52830p.m112446b((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (b == -1) {
            return str3;
        }
        String substring = str.substring(b + str2.length(), str.length());
        C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: b */
    public static final String m112449b(String str, String str2, String str3) {
        C52711k.m112240b(str, "$this$substringBeforeLast");
        C52711k.m112240b(str2, "delimiter");
        C52711k.m112240b(str3, "missingDelimiterValue");
        int b = C52830p.m112446b((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (b == -1) {
            return str3;
        }
        String substring = str.substring(0, b);
        C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: a */
    public static final int m112414a(CharSequence charSequence, char c, int i, boolean z) {
        C52711k.m112240b(charSequence, "$this$indexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return C52830p.m112420a(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: b */
    public static final int m112445b(CharSequence charSequence, String str, int i, boolean z) {
        C52711k.m112240b(charSequence, "$this$lastIndexOf");
        C52711k.m112240b(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(str, i);
        }
        return m112416a(charSequence, (CharSequence) str, i, 0, z, true);
    }

    /* renamed from: b */
    public static final int m112443b(CharSequence charSequence, char c, int i, boolean z) {
        int i2;
        boolean z2;
        C52711k.m112240b(charSequence, "$this$lastIndexOf");
        if (z || !(charSequence instanceof String)) {
            char[] cArr = {c};
            C52711k.m112240b(charSequence, "$this$lastIndexOfAny");
            C52711k.m112240b(cArr, "chars");
            if (z || !(charSequence instanceof String)) {
                int d = C52753d.m112322d(i, C52830p.m112461f(charSequence));
                while (d >= 0) {
                    char charAt = charSequence.charAt(d);
                    int i3 = 0;
                    while (true) {
                        if (i3 > 0) {
                            z2 = false;
                            break;
                        } else if (C52804a.m112365a(cArr[i3], charAt, z)) {
                            z2 = true;
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (z2) {
                        i2 = d;
                    } else {
                        d--;
                    }
                }
                return -1;
            }
            i2 = ((String) charSequence).lastIndexOf(C52568f.m112071a(cArr), i);
        } else {
            i2 = ((String) charSequence).lastIndexOf(c, i);
        }
        return i2;
    }

    /* renamed from: a */
    public static final int m112418a(CharSequence charSequence, String str, int i, boolean z) {
        C52711k.m112240b(charSequence, "$this$indexOf");
        C52711k.m112240b(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m112416a(charSequence, (CharSequence) str, i, charSequence.length(), z, false);
    }

    /* renamed from: a */
    public static final int m112420a(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        C52711k.m112240b(charSequence, "$this$indexOfAny");
        C52711k.m112240b(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int c = C52753d.m112321c(i, 0);
            int f = C52830p.m112461f(charSequence);
            if (c <= f) {
                while (true) {
                    char charAt = charSequence.charAt(c);
                    int length = cArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z2 = false;
                            break;
                        } else if (C52804a.m112365a(cArr[i2], charAt, z)) {
                            z2 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (!z2) {
                        if (c == f) {
                            break;
                        }
                        c++;
                    } else {
                        return c;
                    }
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(C52568f.m112071a(cArr), i);
    }

    /* renamed from: b */
    public static final List<String> m112451b(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C52711k.m112240b(charSequence, "$this$split");
        C52711k.m112240b(strArr, "delimiters");
        if (strArr.length == 1) {
            boolean z2 = false;
            String str = strArr[0];
            if (str.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                return m112435a(charSequence, str, z, i);
            }
        }
        Iterable<C52751c> j = C52786h.m112356j(m112423a(charSequence, strArr, 0, z, i, 2, (Object) null));
        Collection arrayList = new ArrayList(C52575l.m112104a(j, 10));
        for (C52751c a : j) {
            arrayList.add(C52830p.m112429a(charSequence, a));
        }
        return (List) arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final C52785g<C52751c> m112421a(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        boolean z2;
        if (i2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return new C52809e<>(charSequence, i, i2, new C52842a(cArr, z));
        }
        StringBuilder sb = new StringBuilder("Limit must be non-negative, but was ");
        sb.append(i2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    public static /* synthetic */ int m112415a(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return C52830p.m112414a(charSequence, c, i, z);
    }

    /* renamed from: b */
    public static /* synthetic */ int m112446b(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = C52830p.m112461f(charSequence);
        }
        return C52830p.m112445b(charSequence, str, i, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final int m112416a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C52748a aVar;
        if (!z2) {
            aVar = new C52751c(C52753d.m112321c(i, 0), C52753d.m112322d(i2, charSequence.length()));
        } else {
            aVar = C52753d.m112318a(C52753d.m112322d(i, C52830p.m112461f(charSequence)), C52753d.m112321c(i2, 0));
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int i3 = aVar.f130995a;
            int i4 = aVar.f130996b;
            int i5 = aVar.f130997c;
            if (i5 < 0 ? i3 >= i4 : i3 <= i4) {
                while (true) {
                    if (!C52830p.m112440a(charSequence2, 0, charSequence, i3, charSequence2.length(), z)) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        return i3;
                    }
                }
            }
        } else {
            int i6 = aVar.f130995a;
            int i7 = aVar.f130996b;
            int i8 = aVar.f130997c;
            if (i8 < 0 ? i6 >= i7 : i6 <= i7) {
                while (true) {
                    if (!C52830p.m112403a((String) charSequence2, 0, (String) charSequence, i6, charSequence2.length(), z)) {
                        if (i6 == i7) {
                            break;
                        }
                        i6 += i8;
                    } else {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static /* synthetic */ int m112419a(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return C52830p.m112418a(charSequence, str, i, z);
    }
}
