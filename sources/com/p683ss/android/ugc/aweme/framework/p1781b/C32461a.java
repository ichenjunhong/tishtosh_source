package com.p683ss.android.ugc.aweme.framework.p1781b;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.view.ViewConfiguration;
import com.facebook.drawee.p930a.p931a.C13771c;

/* renamed from: com.ss.android.ugc.aweme.framework.b.a */
public class C32461a extends C1340m {

    /* renamed from: a */
    private int f84535a;

    public C32461a(Context context) {
        this.f84535a = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            C13771c.m27875c().mo26193c();
        }
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        super.onScrolled(recyclerView, i, i2);
        int abs = Math.abs(i2);
        if (recyclerView.getScrollState() == 1 && abs < this.f84535a) {
            C13771c.m27875c().mo26193c();
        } else if (recyclerView.getScrollState() != 1 || abs < this.f84535a) {
            if (recyclerView.getScrollState() == 2) {
                C13771c.m27875c().mo26190b();
            }
        } else {
            C13771c.m27875c().mo26190b();
        }
    }
}
