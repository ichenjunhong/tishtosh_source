package com.p683ss.android.ugc.aweme.share.p2157g;

import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.share.g.a */
public enum C42014a {
    Default(1, R.drawable.a5s),
    H_THREE_POINT(2, R.drawable.a5t),
    ARROW(3, R.drawable.a5u),
    T_THREE_POINT(4, R.drawable.a5v);
    

    /* renamed from: a */
    private int f106352a;

    /* renamed from: b */
    private int f106353b;

    public final int getDrawable() {
        return this.f106353b;
    }

    public final int getStyle() {
        return this.f106352a;
    }

    public static C42014a build(int i) {
        C42014a aVar = Default;
        if (i == H_THREE_POINT.getStyle()) {
            return H_THREE_POINT;
        }
        if (i == T_THREE_POINT.getStyle()) {
            return T_THREE_POINT;
        }
        if (i == ARROW.getStyle()) {
            return ARROW;
        }
        return aVar;
    }

    private C42014a(int i, int i2) {
        this.f106352a = i;
        this.f106353b = i2;
    }
}
