package com.p683ss.android.ugc.aweme.filter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.filter.ab */
final /* synthetic */ class C31399ab implements OnClickListener {

    /* renamed from: a */
    private final FilterViewImpl f82240a;

    C31399ab(FilterViewImpl filterViewImpl) {
        this.f82240a = filterViewImpl;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        FilterViewImpl filterViewImpl = this.f82240a;
        if (filterViewImpl.f82185l != null) {
            filterViewImpl.f82185l.run();
        }
        filterViewImpl.mo64271b();
    }
}
