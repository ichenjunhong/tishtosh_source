package com.facebook.imageutils;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

/* renamed from: com.facebook.imageutils.g */
class C14258g {

    /* renamed from: a */
    static final Class<?> f37165a = C14258g.class;

    /* renamed from: com.facebook.imageutils.g$a */
    static class C14260a {

        /* renamed from: a */
        boolean f37166a;

        /* renamed from: b */
        int f37167b;

        /* renamed from: c */
        int f37168c;

        private C14260a() {
        }
    }

    C14258g() {
    }

    /* renamed from: a */
    public static int m29216a(int i) {
        if (i == 3) {
            return NormalGiftView.ALPHA_180;
        }
        if (i == 6) {
            return 90;
        }
        if (i == 8) {
            return 270;
        }
        switch (i) {
            case 0:
            case 1:
                return 0;
            default:
                return 0;
        }
    }
}
