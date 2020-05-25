package android.support.p030v4.p037e;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: android.support.v4.e.a */
public final class C0761a {

    /* renamed from: a */
    static final C0768d f2619a = C0769e.f2654c;

    /* renamed from: b */
    static final C0761a f2620b = new C0761a(false, 2, f2619a);

    /* renamed from: c */
    static final C0761a f2621c = new C0761a(true, 2, f2619a);

    /* renamed from: e */
    private static final String f2622e = Character.toString(8206);

    /* renamed from: f */
    private static final String f2623f = Character.toString(8207);

    /* renamed from: d */
    public final boolean f2624d;

    /* renamed from: g */
    private final int f2625g;

    /* renamed from: h */
    private final C0768d f2626h;

    /* renamed from: android.support.v4.e.a$a */
    public static final class C0762a {

        /* renamed from: a */
        private boolean f2627a;

        /* renamed from: b */
        private int f2628b;

        /* renamed from: c */
        private C0768d f2629c;

        public C0762a() {
            boolean z = true;
            if (C0776f.m2189a(Locale.getDefault()) != 1) {
                z = false;
            }
            m2166a(z);
        }

        /* renamed from: a */
        public final C0761a mo2429a() {
            if (this.f2628b == 2 && this.f2629c == C0761a.f2619a) {
                return m2167b(this.f2627a);
            }
            return new C0761a(this.f2627a, this.f2628b, this.f2629c);
        }

        public C0762a(boolean z) {
            m2166a(z);
        }

        /* renamed from: b */
        private static C0761a m2167b(boolean z) {
            if (z) {
                return C0761a.f2621c;
            }
            return C0761a.f2620b;
        }

        /* renamed from: a */
        private void m2166a(boolean z) {
            this.f2627a = z;
            this.f2629c = C0761a.f2619a;
            this.f2628b = 2;
        }
    }

    /* renamed from: android.support.v4.e.a$b */
    static class C0763b {

        /* renamed from: a */
        private static final byte[] f2630a = new byte[1792];

        /* renamed from: b */
        private final CharSequence f2631b;

        /* renamed from: c */
        private final boolean f2632c = false;

        /* renamed from: d */
        private final int f2633d;

        /* renamed from: e */
        private int f2634e;

        /* renamed from: f */
        private char f2635f;

        static {
            for (int i = 0; i < 1792; i++) {
                f2630a[i] = Character.getDirectionality(i);
            }
        }

        /* renamed from: g */
        private byte m2174g() {
            while (this.f2634e < this.f2633d) {
                CharSequence charSequence = this.f2631b;
                int i = this.f2634e;
                this.f2634e = i + 1;
                char charAt = charSequence.charAt(i);
                this.f2635f = charAt;
                if (charAt == ';') {
                    break;
                }
            }
            return 12;
        }

        /* renamed from: h */
        private byte m2175h() {
            int i = this.f2634e;
            while (this.f2634e > 0) {
                CharSequence charSequence = this.f2631b;
                int i2 = this.f2634e - 1;
                this.f2634e = i2;
                this.f2635f = charSequence.charAt(i2);
                if (this.f2635f != '&') {
                    if (this.f2635f == ';') {
                        break;
                    }
                } else {
                    return 12;
                }
            }
            this.f2634e = i;
            this.f2635f = ';';
            return 13;
        }

        /* renamed from: c */
        private byte m2170c() {
            this.f2635f = this.f2631b.charAt(this.f2634e);
            if (Character.isHighSurrogate(this.f2635f)) {
                int codePointAt = Character.codePointAt(this.f2631b, this.f2634e);
                this.f2634e += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f2634e++;
            byte a = m2169a(this.f2635f);
            if (this.f2632c) {
                if (this.f2635f == '<') {
                    a = m2172e();
                } else if (this.f2635f == '&') {
                    a = m2174g();
                }
            }
            return a;
        }

        /* renamed from: d */
        private byte m2171d() {
            this.f2635f = this.f2631b.charAt(this.f2634e - 1);
            if (Character.isLowSurrogate(this.f2635f)) {
                int codePointBefore = Character.codePointBefore(this.f2631b, this.f2634e);
                this.f2634e -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f2634e--;
            byte a = m2169a(this.f2635f);
            if (this.f2632c) {
                if (this.f2635f == '>') {
                    a = m2173f();
                } else if (this.f2635f == ';') {
                    a = m2175h();
                }
            }
            return a;
        }

        /* renamed from: e */
        private byte m2172e() {
            int i = this.f2634e;
            while (this.f2634e < this.f2633d) {
                CharSequence charSequence = this.f2631b;
                int i2 = this.f2634e;
                this.f2634e = i2 + 1;
                this.f2635f = charSequence.charAt(i2);
                if (this.f2635f == '>') {
                    return 12;
                }
                if (this.f2635f == '\"' || this.f2635f == '\'') {
                    char c = this.f2635f;
                    while (this.f2634e < this.f2633d) {
                        CharSequence charSequence2 = this.f2631b;
                        int i3 = this.f2634e;
                        this.f2634e = i3 + 1;
                        char charAt = charSequence2.charAt(i3);
                        this.f2635f = charAt;
                        if (charAt == c) {
                            break;
                        }
                    }
                }
            }
            this.f2634e = i;
            this.f2635f = '<';
            return 13;
        }

        /* renamed from: f */
        private byte m2173f() {
            int i = this.f2634e;
            while (this.f2634e > 0) {
                CharSequence charSequence = this.f2631b;
                int i2 = this.f2634e - 1;
                this.f2634e = i2;
                this.f2635f = charSequence.charAt(i2);
                if (this.f2635f != '<') {
                    if (this.f2635f == '>') {
                        break;
                    } else if (this.f2635f == '\"' || this.f2635f == '\'') {
                        char c = this.f2635f;
                        while (this.f2634e > 0) {
                            CharSequence charSequence2 = this.f2631b;
                            int i3 = this.f2634e - 1;
                            this.f2634e = i3;
                            char charAt = charSequence2.charAt(i3);
                            this.f2635f = charAt;
                            if (charAt == c) {
                                break;
                            }
                        }
                    }
                } else {
                    return 12;
                }
            }
            this.f2634e = i;
            this.f2635f = '>';
            return 13;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo2430a() {
            this.f2634e = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f2634e < this.f2633d && i == 0) {
                byte c = m2170c();
                if (c != 9) {
                    switch (c) {
                        case 0:
                            if (i3 == 0) {
                                return -1;
                            }
                            break;
                        case 1:
                        case 2:
                            if (i3 == 0) {
                                return 1;
                            }
                            break;
                        default:
                            switch (c) {
                                case 14:
                                case 15:
                                    i3++;
                                    i2 = -1;
                                    continue;
                                case 16:
                                case 17:
                                    i3++;
                                    i2 = 1;
                                    continue;
                                case 18:
                                    i3--;
                                    i2 = 0;
                                    continue;
                                    continue;
                            }
                    }
                    i = i3;
                }
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f2634e > 0) {
                switch (m2171d()) {
                    case 14:
                    case 15:
                        if (i != i3) {
                            i3--;
                            break;
                        } else {
                            return -1;
                        }
                    case 16:
                    case 17:
                        if (i != i3) {
                            i3--;
                            break;
                        } else {
                            return 1;
                        }
                    case 18:
                        i3++;
                        break;
                }
            }
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo2431b() {
            /*
                r6 = this;
                int r0 = r6.f2633d
                r6.f2634e = r0
                r0 = 0
                r1 = 0
                r2 = 0
            L_0x0007:
                int r3 = r6.f2634e
                if (r3 <= 0) goto L_0x003a
                byte r3 = r6.m2171d()
                r4 = 9
                if (r3 == r4) goto L_0x0007
                r4 = 1
                r5 = -1
                switch(r3) {
                    case 0: goto L_0x0033;
                    case 1: goto L_0x002d;
                    case 2: goto L_0x002d;
                    default: goto L_0x0018;
                }
            L_0x0018:
                switch(r3) {
                    case 14: goto L_0x0027;
                    case 15: goto L_0x0027;
                    case 16: goto L_0x0021;
                    case 17: goto L_0x0021;
                    case 18: goto L_0x001e;
                    default: goto L_0x001b;
                }
            L_0x001b:
                if (r1 != 0) goto L_0x0007
                goto L_0x0038
            L_0x001e:
                int r2 = r2 + 1
                goto L_0x0007
            L_0x0021:
                if (r1 != r2) goto L_0x0024
                return r4
            L_0x0024:
                int r2 = r2 + -1
                goto L_0x0007
            L_0x0027:
                if (r1 != r2) goto L_0x002a
                return r5
            L_0x002a:
                int r2 = r2 + -1
                goto L_0x0007
            L_0x002d:
                if (r2 != 0) goto L_0x0030
                return r4
            L_0x0030:
                if (r1 != 0) goto L_0x0007
                goto L_0x0038
            L_0x0033:
                if (r2 != 0) goto L_0x0036
                return r5
            L_0x0036:
                if (r1 != 0) goto L_0x0007
            L_0x0038:
                r1 = r2
                goto L_0x0007
            L_0x003a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.p037e.C0761a.C0763b.mo2431b():int");
        }

        /* renamed from: a */
        private static byte m2169a(char c) {
            if (c < 1792) {
                return f2630a[c];
            }
            return Character.getDirectionality(c);
        }

        C0763b(CharSequence charSequence, boolean z) {
            this.f2631b = charSequence;
            this.f2633d = charSequence.length();
        }
    }

    /* renamed from: a */
    public static C0761a m2155a() {
        return new C0762a().mo2429a();
    }

    /* renamed from: b */
    private boolean m2161b() {
        if ((this.f2625g & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final CharSequence mo2426a(CharSequence charSequence) {
        return m2157a(charSequence, this.f2626h, true);
    }

    /* renamed from: b */
    private static int m2159b(CharSequence charSequence) {
        return new C0763b(charSequence, false).mo2431b();
    }

    /* renamed from: c */
    private static int m2162c(CharSequence charSequence) {
        return new C0763b(charSequence, false).mo2430a();
    }

    /* renamed from: a */
    public static C0761a m2156a(boolean z) {
        return new C0762a(z).mo2429a();
    }

    /* renamed from: b */
    public final String mo2428b(String str) {
        C0768d dVar = this.f2626h;
        if (str == null) {
            return null;
        }
        return m2157a(str, dVar, true).toString();
    }

    /* renamed from: a */
    public final boolean mo2427a(String str) {
        return this.f2626h.mo2446a(str, 0, str.length());
    }

    /* renamed from: a */
    private String m2158a(CharSequence charSequence, C0768d dVar) {
        boolean a = dVar.mo2446a(charSequence, 0, charSequence.length());
        if (!this.f2624d && (a || m2159b(charSequence) == 1)) {
            return f2622e;
        }
        if (!this.f2624d || (a && m2159b(charSequence) != -1)) {
            return "";
        }
        return f2623f;
    }

    /* renamed from: b */
    private String m2160b(CharSequence charSequence, C0768d dVar) {
        boolean a = dVar.mo2446a(charSequence, 0, charSequence.length());
        if (!this.f2624d && (a || m2162c(charSequence) == 1)) {
            return f2622e;
        }
        if (!this.f2624d || (a && m2162c(charSequence) != -1)) {
            return "";
        }
        return f2623f;
    }

    C0761a(boolean z, int i, C0768d dVar) {
        this.f2624d = z;
        this.f2625g = i;
        this.f2626h = dVar;
    }

    /* renamed from: a */
    private CharSequence m2157a(CharSequence charSequence, C0768d dVar, boolean z) {
        C0768d dVar2;
        char c;
        C0768d dVar3;
        if (charSequence == null) {
            return null;
        }
        boolean a = dVar.mo2446a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m2161b() && z) {
            if (a) {
                dVar3 = C0769e.f2653b;
            } else {
                dVar3 = C0769e.f2652a;
            }
            spannableStringBuilder.append(m2160b(charSequence, dVar3));
        }
        if (a != this.f2624d) {
            if (a) {
                c = 8235;
            } else {
                c = 8234;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            if (a) {
                dVar2 = C0769e.f2653b;
            } else {
                dVar2 = C0769e.f2652a;
            }
            spannableStringBuilder.append(m2158a(charSequence, dVar2));
        }
        return spannableStringBuilder;
    }
}
