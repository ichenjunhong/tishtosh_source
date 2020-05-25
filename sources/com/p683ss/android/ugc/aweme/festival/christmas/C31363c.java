package com.p683ss.android.ugc.aweme.festival.christmas;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.festival.christmas.c */
final /* synthetic */ class C31363c implements OnClickListener {

    /* renamed from: a */
    private final FestivalHomePageView f82140a;

    C31363c(FestivalHomePageView festivalHomePageView) {
        this.f82140a = festivalHomePageView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        FestivalHomePageView festivalHomePageView = this.f82140a;
        if (festivalHomePageView.f82121a != null) {
            festivalHomePageView.f82121a.mo64240a();
        }
    }
}
