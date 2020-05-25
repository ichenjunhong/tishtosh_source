package com.p683ss.android.ugc.aweme.setting.p2141j;

import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;

/* renamed from: com.ss.android.ugc.aweme.setting.j.c */
public final class C41630c {
    /* renamed from: a */
    public static int m91505a(int i) {
        int i2;
        try {
            int identifier = C11010c.m22280a().getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i2 = C11010c.m22280a().getResources().getDimensionPixelSize(identifier);
            } else {
                i2 = 44;
            }
            return C9432q.m18692c(C11010c.m22280a(), (float) i2);
        } catch (Exception unused) {
            return 44;
        }
    }
}
