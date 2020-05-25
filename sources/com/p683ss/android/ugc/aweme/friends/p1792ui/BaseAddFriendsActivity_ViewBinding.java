package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.titlebar.NormalTitleBar;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.BaseAddFriendsActivity_ViewBinding */
public class BaseAddFriendsActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseAddFriendsActivity f84882a;

    public void unbind() {
        BaseAddFriendsActivity baseAddFriendsActivity = this.f84882a;
        if (baseAddFriendsActivity != null) {
            this.f84882a = null;
            baseAddFriendsActivity.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseAddFriendsActivity_ViewBinding(BaseAddFriendsActivity baseAddFriendsActivity, View view) {
        this.f84882a = baseAddFriendsActivity;
        baseAddFriendsActivity.mTitleBar = (NormalTitleBar) Utils.findRequiredViewAsType(view, R.id.d10, "field 'mTitleBar'", NormalTitleBar.class);
    }
}
