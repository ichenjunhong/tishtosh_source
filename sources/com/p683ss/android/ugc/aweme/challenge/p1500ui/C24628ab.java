package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.ab */
final /* synthetic */ class C24628ab implements OnClickListener {

    /* renamed from: a */
    private final DetailAwemeListFragment f65183a;

    C24628ab(DetailAwemeListFragment detailAwemeListFragment) {
        this.f65183a = detailAwemeListFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f65183a.mo50456a(view);
    }
}
