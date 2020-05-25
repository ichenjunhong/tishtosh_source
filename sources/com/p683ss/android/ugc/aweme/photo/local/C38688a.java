package com.p683ss.android.ugc.aweme.photo.local;

import android.support.p030v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.photo.local.a */
final /* synthetic */ class C38688a implements OnClickListener {

    /* renamed from: a */
    private final ViewPager f98404a;

    /* renamed from: b */
    private final int f98405b;

    C38688a(ViewPager viewPager, int i) {
        this.f98404a = viewPager;
        this.f98405b = i;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f98404a.setCurrentItem(this.f98405b);
    }
}
