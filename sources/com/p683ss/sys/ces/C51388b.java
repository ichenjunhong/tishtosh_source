package com.p683ss.sys.ces;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

/* renamed from: com.ss.sys.ces.b */
public final class C51388b {

    /* renamed from: a */
    public static int f128486a = 255;

    /* renamed from: a */
    public static int m110521a(int i) {
        if (i != 0) {
            switch (i) {
                case 2:
                case 3:
                    f128486a = 1;
                    return 1;
                case 4:
                    break;
                default:
                    return NormalGiftView.ALPHA_255;
            }
        }
        f128486a = 0;
        return 0;
    }
}
