package com.p683ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.b */
final /* synthetic */ class C25022b implements OnClickListener {

    /* renamed from: a */
    private final MusicBoardViewHolder f66267a;

    C25022b(MusicBoardViewHolder musicBoardViewHolder) {
        this.f66267a = musicBoardViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        MusicBoardViewHolder musicBoardViewHolder = this.f66267a;
        if (!C32800a.m75679a(view) && musicBoardViewHolder.f66194b != null) {
            musicBoardViewHolder.f66194b.mo50703a(null, view, null, 0);
        }
    }
}
