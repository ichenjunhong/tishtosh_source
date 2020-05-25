package com.p683ss.android.ugc.aweme.flowfeed.p1761ui;

import android.text.TextUtils.EllipsizeCallback;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.ui.b */
final /* synthetic */ class C31834b implements EllipsizeCallback {

    /* renamed from: a */
    private final int[] f83193a;

    /* renamed from: b */
    private final int f83194b;

    C31834b(int[] iArr, int i) {
        this.f83193a = iArr;
        this.f83194b = i;
    }

    public final void ellipsized(int i, int i2) {
        int[] iArr = this.f83193a;
        int i3 = this.f83194b;
        if (i2 - i <= 0) {
            iArr[0] = -1;
        } else {
            iArr[0] = i3 + i;
        }
    }
}
