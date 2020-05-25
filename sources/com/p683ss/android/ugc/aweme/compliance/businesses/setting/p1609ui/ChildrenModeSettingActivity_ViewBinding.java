package com.p683ss.android.ugc.aweme.compliance.businesses.setting.p1609ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.compliance.businesses.setting.ui.ChildrenModeSettingActivity_ViewBinding */
public class ChildrenModeSettingActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChildrenModeSettingActivity f71421a;

    /* renamed from: b */
    private View f71422b;

    public void unbind() {
        ChildrenModeSettingActivity childrenModeSettingActivity = this.f71421a;
        if (childrenModeSettingActivity != null) {
            this.f71421a = null;
            childrenModeSettingActivity.statusBar = null;
            childrenModeSettingActivity.rootView = null;
            childrenModeSettingActivity.mTitleBar = null;
            childrenModeSettingActivity.mAccountAndSafetyItem = null;
            childrenModeSettingActivity.mUnderAgeProtection = null;
            childrenModeSettingActivity.mCommonProtocolItem = null;
            childrenModeSettingActivity.mHelperCenter = null;
            childrenModeSettingActivity.mFeedbackAndHelpItem = null;
            childrenModeSettingActivity.mProtocolItem = null;
            childrenModeSettingActivity.mPrivacyPolicyItem = null;
            childrenModeSettingActivity.mCopyRightPolicyItem = null;
            childrenModeSettingActivity.mClearCacheItem = null;
            childrenModeSettingActivity.mUserInfo = null;
            childrenModeSettingActivity.mVersionView = null;
            childrenModeSettingActivity.mOpenDebugTest = null;
            childrenModeSettingActivity.mLogout = null;
            childrenModeSettingActivity.mCommunityGuidelinesItem = null;
            childrenModeSettingActivity.mSafetyCenter = null;
            childrenModeSettingActivity.mDataSaver = null;
            this.f71422b.setOnClickListener(null);
            this.f71422b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChildrenModeSettingActivity_ViewBinding(final ChildrenModeSettingActivity childrenModeSettingActivity, View view) {
        this.f71421a = childrenModeSettingActivity;
        childrenModeSettingActivity.statusBar = Utils.findRequiredView(view, R.id.csm, "field 'statusBar'");
        childrenModeSettingActivity.rootView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.cfc, "field 'rootView'", ViewGroup.class);
        childrenModeSettingActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.d10, "field 'mTitleBar'", TextTitleBar.class);
        childrenModeSettingActivity.mAccountAndSafetyItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.x, "field 'mAccountAndSafetyItem'", CommonItemView.class);
        childrenModeSettingActivity.mUnderAgeProtection = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.dl8, "field 'mUnderAgeProtection'", CommonItemView.class);
        childrenModeSettingActivity.mCommonProtocolItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.yh, "field 'mCommonProtocolItem'", CommonItemView.class);
        childrenModeSettingActivity.mHelperCenter = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.aoo, "field 'mHelperCenter'", CommonItemView.class);
        childrenModeSettingActivity.mFeedbackAndHelpItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.aer, "field 'mFeedbackAndHelpItem'", CommonItemView.class);
        childrenModeSettingActivity.mProtocolItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.cy5, "field 'mProtocolItem'", CommonItemView.class);
        childrenModeSettingActivity.mPrivacyPolicyItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.c4x, "field 'mPrivacyPolicyItem'", CommonItemView.class);
        childrenModeSettingActivity.mCopyRightPolicyItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.a0n, "field 'mCopyRightPolicyItem'", CommonItemView.class);
        childrenModeSettingActivity.mClearCacheItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.ts, "field 'mClearCacheItem'", CommonItemView.class);
        childrenModeSettingActivity.mUserInfo = (TextView) Utils.findRequiredViewAsType(view, R.id.f133597dmt, "field 'mUserInfo'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.dog, "field 'mVersionView' and method 'onVersionClick'");
        childrenModeSettingActivity.mVersionView = (TextView) Utils.castView(findRequiredView, R.id.dog, "field 'mVersionView'", TextView.class);
        this.f71422b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                childrenModeSettingActivity.onVersionClick(view);
            }
        });
        childrenModeSettingActivity.mOpenDebugTest = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.bux, "field 'mOpenDebugTest'", CommonItemView.class);
        childrenModeSettingActivity.mLogout = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.bjf, "field 'mLogout'", CommonItemView.class);
        childrenModeSettingActivity.mCommunityGuidelinesItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.e3g, "field 'mCommunityGuidelinesItem'", CommonItemView.class);
        childrenModeSettingActivity.mSafetyCenter = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.cgi, "field 'mSafetyCenter'", CommonItemView.class);
        childrenModeSettingActivity.mDataSaver = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.a3f, "field 'mDataSaver'", CommonItemView.class);
    }
}
