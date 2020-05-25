package com.p683ss.android.ugc.aweme.choosemusic.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.adapter.l */
final /* synthetic */ class C24830l implements OnClickListener {

    /* renamed from: a */
    private final MusicSheetViewHolder f65729a;

    C24830l(MusicSheetViewHolder musicSheetViewHolder) {
        this.f65729a = musicSheetViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        MusicSheetViewHolder musicSheetViewHolder = this.f65729a;
        if (MusicSheetAdapter.this.f65678a != null) {
            MusicSheetAdapter.this.f65678a.mo50736a(musicSheetViewHolder.f65679a, musicSheetViewHolder.getLayoutPosition());
        }
    }
}
