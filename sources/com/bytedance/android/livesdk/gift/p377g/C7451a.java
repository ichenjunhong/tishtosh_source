package com.bytedance.android.livesdk.gift.p377g;

import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.gift.g.a */
public final class C7451a implements C7455e {
    /* renamed from: a */
    public final int mo13859a(int i) {
        return i > 1000 ? R.drawable.blh : i > 60 ? R.drawable.blf : R.drawable.bld;
    }

    /* renamed from: b */
    public final int[] mo13860b(int i) {
        int[] iArr = new int[2];
        if (i > 1000) {
            iArr[0] = R.color.aev;
            iArr[1] = R.color.aeu;
        } else if (i > 60) {
            iArr[0] = R.color.aer;
            iArr[1] = R.color.aeq;
        } else {
            iArr[0] = R.color.ae9;
            iArr[1] = R.color.ae9;
        }
        return iArr;
    }
}
