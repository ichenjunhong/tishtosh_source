package android.support.p030v4.p037e;

import java.util.Locale;

/* renamed from: android.support.v4.e.e */
public final class C0769e {

    /* renamed from: a */
    public static final C0768d f2652a = new C0774e(null, false);

    /* renamed from: b */
    public static final C0768d f2653b = new C0774e(null, true);

    /* renamed from: c */
    public static final C0768d f2654c = new C0774e(C0771b.f2661a, false);

    /* renamed from: d */
    public static final C0768d f2655d = new C0774e(C0771b.f2661a, true);

    /* renamed from: e */
    public static final C0768d f2656e = new C0774e(C0770a.f2658a, false);

    /* renamed from: f */
    public static final C0768d f2657f = C0775f.f2664a;

    /* renamed from: android.support.v4.e.e$a */
    static class C0770a implements C0772c {

        /* renamed from: a */
        static final C0770a f2658a = new C0770a(true);

        /* renamed from: b */
        static final C0770a f2659b = new C0770a(false);

        /* renamed from: c */
        private final boolean f2660c;

        private C0770a(boolean z) {
            this.f2660c = z;
        }

        /* renamed from: a */
        public final int mo2447a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (true) {
                char c = 2;
                if (i < i3) {
                    switch (Character.getDirectionality(charSequence.charAt(i))) {
                        case 0:
                            c = 1;
                            break;
                        case 1:
                        case 2:
                            c = 0;
                            break;
                    }
                    switch (c) {
                        case 0:
                            if (this.f2660c) {
                                return 0;
                            }
                            break;
                        case 1:
                            if (!this.f2660c) {
                                return 1;
                            }
                            break;
                    }
                    z = true;
                    i++;
                } else if (!z) {
                    return 2;
                } else {
                    if (this.f2660c) {
                        return 1;
                    }
                    return 0;
                }
            }
        }
    }

    /* renamed from: android.support.v4.e.e$b */
    static class C0771b implements C0772c {

        /* renamed from: a */
        static final C0771b f2661a = new C0771b();

        private C0771b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
            r1 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
            r1 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
            r4 = r4 + 1;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo2447a(java.lang.CharSequence r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = r5 + r4
                r0 = 2
                r1 = 2
            L_0x0003:
                if (r4 >= r5) goto L_0x001d
                if (r1 != r0) goto L_0x001d
                char r1 = r3.charAt(r4)
                byte r1 = java.lang.Character.getDirectionality(r1)
                switch(r1) {
                    case 0: goto L_0x0019;
                    case 1: goto L_0x0017;
                    case 2: goto L_0x0017;
                    default: goto L_0x0012;
                }
            L_0x0012:
                switch(r1) {
                    case 14: goto L_0x0019;
                    case 15: goto L_0x0019;
                    case 16: goto L_0x0017;
                    case 17: goto L_0x0017;
                    default: goto L_0x0015;
                }
            L_0x0015:
                r1 = 2
                goto L_0x001a
            L_0x0017:
                r1 = 0
                goto L_0x001a
            L_0x0019:
                r1 = 1
            L_0x001a:
                int r4 = r4 + 1
                goto L_0x0003
            L_0x001d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.p037e.C0769e.C0771b.mo2447a(java.lang.CharSequence, int, int):int");
        }
    }

    /* renamed from: android.support.v4.e.e$c */
    interface C0772c {
        /* renamed from: a */
        int mo2447a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: android.support.v4.e.e$d */
    static abstract class C0773d implements C0768d {

        /* renamed from: a */
        private final C0772c f2662a;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract boolean mo2448a();

        C0773d(C0772c cVar) {
            this.f2662a = cVar;
        }

        /* renamed from: a */
        public final boolean mo2446a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i2 < 0 || charSequence.length() - i2 < 0) {
                throw new IllegalArgumentException();
            } else if (this.f2662a == null) {
                return mo2448a();
            } else {
                switch (this.f2662a.mo2447a(charSequence, 0, i2)) {
                    case 0:
                        return true;
                    case 1:
                        return false;
                    default:
                        return mo2448a();
                }
            }
        }
    }

    /* renamed from: android.support.v4.e.e$e */
    static class C0774e extends C0773d {

        /* renamed from: a */
        private final boolean f2663a;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo2448a() {
            return this.f2663a;
        }

        C0774e(C0772c cVar, boolean z) {
            super(cVar);
            this.f2663a = z;
        }
    }

    /* renamed from: android.support.v4.e.e$f */
    static class C0775f extends C0773d {

        /* renamed from: a */
        static final C0775f f2664a = new C0775f();

        C0775f() {
            super(null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo2448a() {
            if (C0776f.m2189a(Locale.getDefault()) == 1) {
                return true;
            }
            return false;
        }
    }
}
