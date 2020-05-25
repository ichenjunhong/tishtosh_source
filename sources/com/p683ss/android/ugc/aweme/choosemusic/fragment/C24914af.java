package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.af */
final /* synthetic */ class C24914af implements OnClickListener {

    /* renamed from: a */
    private final NewMusicListFragment f65973a;

    C24914af(NewMusicListFragment newMusicListFragment) {
        this.f65973a = newMusicListFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        NewMusicListFragment newMusicListFragment = this.f65973a;
        if (!newMusicListFragment.mStatusView.mo19215i()) {
            newMusicListFragment.f65869t.onClick(view);
        }
    }
}
