package com.p683ss.android.ugc.aweme.profile.tab;

import android.support.p030v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.profile.tab.MusProfileNavigator.C40047a;

/* renamed from: com.ss.android.ugc.aweme.profile.tab.a */
final /* synthetic */ class C40050a implements OnClickListener {

    /* renamed from: a */
    private final MusProfileNavigator f102033a;

    /* renamed from: b */
    private final C40047a f102034b;

    /* renamed from: c */
    private final ViewPager f102035c;

    /* renamed from: d */
    private final int f102036d;

    C40050a(MusProfileNavigator musProfileNavigator, C40047a aVar, ViewPager viewPager, int i) {
        this.f102033a = musProfileNavigator;
        this.f102034b = aVar;
        this.f102035c = viewPager;
        this.f102036d = i;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        MusProfileNavigator musProfileNavigator = this.f102033a;
        C40047a aVar = this.f102034b;
        ViewPager viewPager = this.f102035c;
        int i = this.f102036d;
        if (musProfileNavigator.f102007f) {
            if (aVar != null) {
                aVar.mo82090f(14);
            }
            viewPager.setCurrentItem(i);
        }
    }
}
