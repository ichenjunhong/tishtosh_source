package com.p683ss.android.ugc.aweme.choosemusic.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.a */
final /* synthetic */ class C24980a implements OnClickListener {

    /* renamed from: a */
    private final BaseMusicListView f66144a;

    C24980a(BaseMusicListView baseMusicListView) {
        this.f66144a = baseMusicListView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f66144a.mo50931a(view);
    }
}
