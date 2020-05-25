package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.p */
final /* synthetic */ class C32769p implements OnClickListener {

    /* renamed from: a */
    private final IAddFriendsActivity f85352a;

    C32769p(IAddFriendsActivity iAddFriendsActivity) {
        this.f85352a = iAddFriendsActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f85352a.mo66170h();
    }
}
