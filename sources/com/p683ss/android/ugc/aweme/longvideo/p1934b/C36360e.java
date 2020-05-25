package com.p683ss.android.ugc.aweme.longvideo.p1934b;

import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.longvideo.b.e */
public final class C36360e {

    /* renamed from: a */
    public static final C36361a f93074a = new C36361a(null);

    /* renamed from: com.ss.android.ugc.aweme.longvideo.b.e$a */
    public static final class C36361a {
        private C36361a() {
        }

        public /* synthetic */ C36361a(C52707g gVar) {
            this();
        }

        /* renamed from: b */
        public static int m82046b(int i) {
            if (i <= 0) {
                return 0;
            }
            return i / 1000;
        }

        /* renamed from: c */
        private static String m82047c(int i) {
            if (i >= 10) {
                return String.valueOf(i);
            }
            StringBuilder sb = new StringBuilder("0");
            sb.append(i);
            return sb.toString();
        }

        /* renamed from: a */
        public final String mo75274a(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(m82047c(i / 60));
            sb.append(':');
            sb.append(m82047c(i % 60));
            return sb.toString();
        }

        /* renamed from: a */
        public final CharSequence mo75273a(float f, int i) {
            return mo75274a((int) ((f * ((float) i)) / 100.0f));
        }
    }
}
