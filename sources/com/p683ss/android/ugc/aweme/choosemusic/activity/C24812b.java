package com.p683ss.android.ugc.aweme.choosemusic.activity;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.music.p1977e.C37378c;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.b */
final /* synthetic */ class C24812b implements OnClickListener {

    /* renamed from: a */
    private final ChooseMusicActivity f65676a;

    C24812b(ChooseMusicActivity chooseMusicActivity) {
        this.f65676a = chooseMusicActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        ChooseMusicActivity chooseMusicActivity = this.f65676a;
        KeyboardUtils.m58184c(chooseMusicActivity.f65661a);
        C37378c.m83696a((Activity) chooseMusicActivity, 10086, chooseMusicActivity.f65664d);
        C24963c.m60733e();
    }
}
