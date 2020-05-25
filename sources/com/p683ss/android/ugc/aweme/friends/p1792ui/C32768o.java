package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.o */
final /* synthetic */ class C32768o implements OnTouchListener {

    /* renamed from: a */
    private final IAddFriendsActivity f85351a;

    C32768o(IAddFriendsActivity iAddFriendsActivity) {
        this.f85351a = iAddFriendsActivity;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        IAddFriendsActivity iAddFriendsActivity = this.f85351a;
        if (motionEvent.getAction() == 1) {
            iAddFriendsActivity.mEditSearch.setCursorVisible(true);
            if (iAddFriendsActivity.mo66169d()) {
                iAddFriendsActivity.f84927e.mo58157f();
                iAddFriendsActivity.mStatusView.mo19209d();
            } else {
                iAddFriendsActivity.mRecyclerView.setAdapter((C1322a) iAddFriendsActivity.f84927e);
                iAddFriendsActivity.mStatusView.setBuilder(iAddFriendsActivity.f84928f);
                iAddFriendsActivity.mStatusView.mo19209d();
                iAddFriendsActivity.mo66168b(false);
            }
            if (!TextUtils.isEmpty(iAddFriendsActivity.mTvSearchHit.getText())) {
                iAddFriendsActivity.mTvSearchHit.setVisibility(0);
            }
            iAddFriendsActivity.mTvSearchBtn.setVisibility(0);
        }
        return false;
    }
}
