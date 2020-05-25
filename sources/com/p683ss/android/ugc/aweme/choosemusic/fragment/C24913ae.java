package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.ae */
final /* synthetic */ class C24913ae implements OnClickListener {

    /* renamed from: a */
    private final NewMusicListFragment f65972a;

    C24913ae(NewMusicListFragment newMusicListFragment) {
        this.f65972a = newMusicListFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        NewMusicListFragment newMusicListFragment = this.f65972a;
        if (newMusicListFragment.f65867r != null) {
            newMusicListFragment.f65867r.mo50832a();
        }
    }
}
