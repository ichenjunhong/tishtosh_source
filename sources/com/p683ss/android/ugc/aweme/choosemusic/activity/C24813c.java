package com.p683ss.android.ugc.aweme.choosemusic.activity;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.music.p1977e.C37378c;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.c */
final /* synthetic */ class C24813c implements OnClickListener {

    /* renamed from: a */
    private final OnlineMusicFragmentActivity f65677a;

    C24813c(OnlineMusicFragmentActivity onlineMusicFragmentActivity) {
        this.f65677a = onlineMusicFragmentActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        OnlineMusicFragmentActivity onlineMusicFragmentActivity = this.f65677a;
        KeyboardUtils.m58184c(onlineMusicFragmentActivity.f65667a);
        C37378c.m83696a((Activity) onlineMusicFragmentActivity, 10086, onlineMusicFragmentActivity.f65671e);
        C24963c.m60733e();
    }
}
