package com.p683ss.android.ugc.aweme.compliance.businesses.setting.p1609ui;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.compliance.businesses.setting.ui.ChildrenModeManageMyAccountActivity_ViewBinding */
public class ChildrenModeManageMyAccountActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChildrenModeManageMyAccountActivity f71413a;

    public void unbind() {
        ChildrenModeManageMyAccountActivity childrenModeManageMyAccountActivity = this.f71413a;
        if (childrenModeManageMyAccountActivity != null) {
            this.f71413a = null;
            childrenModeManageMyAccountActivity.mTitleBar = null;
            childrenModeManageMyAccountActivity.mChangePwdItem = null;
            childrenModeManageMyAccountActivity.mLoginDeviceManagerItem = null;
            childrenModeManageMyAccountActivity.mSaveLoginInfoItem = null;
            childrenModeManageMyAccountActivity.mDeleteAccount = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChildrenModeManageMyAccountActivity_ViewBinding(ChildrenModeManageMyAccountActivity childrenModeManageMyAccountActivity, View view) {
        this.f71413a = childrenModeManageMyAccountActivity;
        childrenModeManageMyAccountActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.d10, "field 'mTitleBar'", TextTitleBar.class);
        childrenModeManageMyAccountActivity.mChangePwdItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.e1j, "field 'mChangePwdItem'", CommonItemView.class);
        childrenModeManageMyAccountActivity.mLoginDeviceManagerItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.bj3, "field 'mLoginDeviceManagerItem'", CommonItemView.class);
        childrenModeManageMyAccountActivity.mSaveLoginInfoItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.cgv, "field 'mSaveLoginInfoItem'", CommonItemView.class);
        childrenModeManageMyAccountActivity.mDeleteAccount = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.a43, "field 'mDeleteAccount'", DmtTextView.class);
    }
}
