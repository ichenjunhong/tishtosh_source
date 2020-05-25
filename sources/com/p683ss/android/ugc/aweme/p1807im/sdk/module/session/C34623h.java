package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session;

import android.support.p043v7.widget.RecyclerView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.h */
public final class C34623h {
    /* renamed from: b */
    static boolean m78570b(int i, int i2, boolean z) {
        if (i <= 0 || m78569a(i, i2, z)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static boolean m78569a(int i, int i2, boolean z) {
        if (C35279p.m79763a()) {
            if (i <= 0 || z || (i2 != 0 && i2 != 3 && i2 != 4 && i2 != 7)) {
                return false;
            }
            return true;
        } else if (i <= 0 || z || (i2 != 0 && i2 != 17 && i2 != 20)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    static void m78568a(RecyclerView recyclerView, int i, int i2, int i3, int i4) {
        int i5;
        if (i2 != i3) {
            int i6 = i4 - i2;
            int height = recyclerView.getChildAt(1).getHeight();
            if (i == 1 && i2 == 0 && i4 > 0) {
                i5 = (recyclerView.getChildAt(1).getTop() - recyclerView.getChildAt(0).getTop()) - height;
            } else if (i == 1 && i2 > 0 && i4 == 0) {
                i5 = -1073741823;
            } else {
                i5 = 0;
            }
            recyclerView.mo4795a(0, (height * i6) + recyclerView.getChildAt(0).getTop() + i5);
        }
    }
}
