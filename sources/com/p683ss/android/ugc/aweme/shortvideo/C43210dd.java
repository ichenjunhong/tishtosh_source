package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.tools.utils.C50203g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dd */
public final class C43210dd {

    /* renamed from: a */
    private int f109272a = -1;

    /* renamed from: a */
    public final int mo87841a(int i, int i2) {
        int i3;
        if (i == 0) {
            i3 = Math.min((int) (((float) i2) * 0.59f), 59);
        } else if (i == 2) {
            i3 = 60;
        } else if (i == 1) {
            i3 = Math.min((int) ((((float) i2) * 0.37f) + 61.0f), 98);
        } else if (i == 3) {
            i3 = 99;
        } else {
            i3 = 100;
        }
        if (i3 < this.f109272a) {
            StringBuilder sb = new StringBuilder("Error publish progress. step:");
            sb.append(i);
            sb.append(" sdkProgress:");
            sb.append(i2);
            sb.append(" calculateProgress:");
            sb.append(i3);
            sb.append(" lastProgress");
            sb.append(this.f109272a);
            C50203g.m108361b(sb.toString());
            i3 = this.f109272a;
        }
        this.f109272a = i3;
        return i3;
    }
}
