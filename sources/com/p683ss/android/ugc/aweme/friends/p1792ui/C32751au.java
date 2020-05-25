package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.au */
final /* synthetic */ class C32751au implements OnClickListener {

    /* renamed from: a */
    private final SummonFriendsFragment f85311a;

    C32751au(SummonFriendsFragment summonFriendsFragment) {
        this.f85311a = summonFriendsFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        SummonFriendsFragment summonFriendsFragment = this.f85311a;
        summonFriendsFragment.f85144b.mo44934a_(Boolean.valueOf(false), summonFriendsFragment.mEditView.getText().toString(), SummonFriendsFragment.m75553a(summonFriendsFragment.f85147e));
    }
}
