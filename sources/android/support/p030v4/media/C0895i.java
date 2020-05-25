package android.support.p030v4.media;

import android.support.p030v4.p038f.C0793j;
import android.text.TextUtils;

/* renamed from: android.support.v4.media.i */
class C0895i {

    /* renamed from: a */
    private static final boolean f2961a = C0889f.f2957a;

    /* renamed from: android.support.v4.media.i$a */
    static class C0896a implements C0891b {

        /* renamed from: a */
        private String f2962a;

        /* renamed from: b */
        private int f2963b;

        /* renamed from: c */
        private int f2964c;

        public final int hashCode() {
            return C0793j.m2263a(this.f2962a, Integer.valueOf(this.f2963b), Integer.valueOf(this.f2964c));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0896a)) {
                return false;
            }
            C0896a aVar = (C0896a) obj;
            if (TextUtils.equals(this.f2962a, aVar.f2962a) && this.f2963b == aVar.f2963b && this.f2964c == aVar.f2964c) {
                return true;
            }
            return false;
        }

        C0896a(String str, int i, int i2) {
            this.f2962a = str;
            this.f2963b = i;
            this.f2964c = i2;
        }
    }
}
