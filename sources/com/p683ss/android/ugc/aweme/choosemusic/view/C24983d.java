package com.p683ss.android.ugc.aweme.choosemusic.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.d */
public final /* synthetic */ class C24983d implements OnClickListener {

    /* renamed from: a */
    private final ChooseMusicFragmentView f66147a;

    public C24983d(ChooseMusicFragmentView chooseMusicFragmentView) {
        this.f66147a = chooseMusicFragmentView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f66147a.mSearchEditView.setText("");
    }
}
