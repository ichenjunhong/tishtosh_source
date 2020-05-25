package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.q */
final /* synthetic */ class C32770q implements OnEditorActionListener {

    /* renamed from: a */
    private final IAddFriendsActivity f85353a;

    C32770q(IAddFriendsActivity iAddFriendsActivity) {
        this.f85353a = iAddFriendsActivity;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        IAddFriendsActivity iAddFriendsActivity = this.f85353a;
        if (i != 3) {
            return false;
        }
        iAddFriendsActivity.searchUser();
        return true;
    }
}
