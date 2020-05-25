package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.aj */
final /* synthetic */ class C24918aj implements OnClickListener {

    /* renamed from: a */
    private final OnlineMusicFragment f65978a;

    C24918aj(OnlineMusicFragment onlineMusicFragment) {
        this.f65978a = onlineMusicFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        OnlineMusicFragment onlineMusicFragment = this.f65978a;
        onlineMusicFragment.mo50855a(onlineMusicFragment.mSearchEditView.getText().toString());
    }
}
