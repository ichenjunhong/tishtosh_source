package com.p683ss.android.ugc.aweme.choosemusic.activity;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.a */
final /* synthetic */ class C24811a implements OnClickListener {

    /* renamed from: a */
    private final ChooseMusicActivity f65675a;

    C24811a(ChooseMusicActivity chooseMusicActivity) {
        this.f65675a = chooseMusicActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        ChooseMusicActivity chooseMusicActivity = this.f65675a;
        chooseMusicActivity.mo50683a();
        chooseMusicActivity.finish();
    }
}
