package com.p683ss.android.ugc.aweme.music;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.music.h */
final /* synthetic */ class C37387h implements OnClickListener {

    /* renamed from: a */
    private final OriginMusicListFragment f95380a;

    C37387h(OriginMusicListFragment originMusicListFragment) {
        this.f95380a = originMusicListFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f95380a.mo76537h();
    }
}
