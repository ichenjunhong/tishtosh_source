package com.p683ss.android.ugc.trill.setting;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.titlebar.ButtonTitleBar;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.trill.setting.PushSettingActivity_ViewBinding */
public class PushSettingActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PushSettingActivity f126345a;

    public void unbind() {
        PushSettingActivity pushSettingActivity = this.f126345a;
        if (pushSettingActivity != null) {
            this.f126345a = null;
            pushSettingActivity.mTitleBar = null;
            pushSettingActivity.mLikeMeItem = null;
            pushSettingActivity.mFollowMeItem = null;
            pushSettingActivity.mCommentMeItem = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PushSettingActivity_ViewBinding(PushSettingActivity pushSettingActivity, View view) {
        this.f126345a = pushSettingActivity;
        pushSettingActivity.mTitleBar = (ButtonTitleBar) Utils.findRequiredViewAsType(view, R.id.d1b, "field 'mTitleBar'", ButtonTitleBar.class);
        pushSettingActivity.mLikeMeItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.ban, "field 'mLikeMeItem'", CommonItemView.class);
        pushSettingActivity.mFollowMeItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.aia, "field 'mFollowMeItem'", CommonItemView.class);
        pushSettingActivity.mCommentMeItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.xd, "field 'mCommentMeItem'", CommonItemView.class);
    }
}
