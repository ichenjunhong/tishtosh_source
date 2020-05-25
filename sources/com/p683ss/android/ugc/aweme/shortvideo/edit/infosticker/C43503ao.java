package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.ao */
public final class C43503ao {
    /* renamed from: a */
    public static final int[] m95364a(View view, int i, int i2) {
        C52711k.m112240b(view, "view");
        C22452a.m55494a(view, i, i2);
        LayoutParams layoutParams = view.getLayoutParams();
        double d = (double) (i * 16);
        double d2 = (double) i2;
        Double.isNaN(d2);
        if (d > d2 * 9.01d) {
            return new int[]{0, (((C43303dy.m94974e(view.getContext()) - C22452a.m55500f()) - layoutParams.height) / 2) + C22452a.m55498d()};
        }
        return new int[]{(C43303dy.m94971b(view.getContext()) - layoutParams.width) >> 1, C22452a.m55498d()};
    }
}
