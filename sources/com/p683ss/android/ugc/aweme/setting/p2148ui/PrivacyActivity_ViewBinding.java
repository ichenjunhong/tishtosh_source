package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.PrivacyActivity_ViewBinding */
public class PrivacyActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PrivacyActivity f105731a;

    /* renamed from: b */
    private View f105732b;

    public void unbind() {
        PrivacyActivity privacyActivity = this.f105731a;
        if (privacyActivity != null) {
            this.f105731a = null;
            privacyActivity.mTitle = null;
            privacyActivity.mBack = null;
            privacyActivity.contactItem = null;
            privacyActivity.mPrivacyManagerItem = null;
            privacyActivity.mBlockListItem = null;
            privacyActivity.mReactItem = null;
            privacyActivity.mDuetItem = null;
            privacyActivity.mDownloadItem = null;
            privacyActivity.mCommentManagerItem = null;
            privacyActivity.mPrivateAccount = null;
            privacyActivity.mCommentFilterItem = null;
            privacyActivity.mPrivacyParent = null;
            privacyActivity.mWhoCanSeeMyLikeListItem = null;
            privacyActivity.mPersonalizationItem = null;
            privacyActivity.personalizationDiv = null;
            privacyActivity.safeDivider = null;
            this.f105732b.setOnClickListener(null);
            this.f105732b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PrivacyActivity_ViewBinding(final PrivacyActivity privacyActivity, View view) {
        this.f105731a = privacyActivity;
        privacyActivity.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.ik, "field 'mBack' and method 'back'");
        privacyActivity.mBack = (ImageView) Utils.castView(findRequiredView, R.id.ik, "field 'mBack'", ImageView.class);
        this.f105732b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                privacyActivity.back();
            }
        });
        privacyActivity.contactItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.c4q, "field 'contactItem'", CommonItemView.class);
        privacyActivity.mPrivacyManagerItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.c4v, "field 'mPrivacyManagerItem'", CommonItemView.class);
        privacyActivity.mBlockListItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.c4p, "field 'mBlockListItem'", CommonItemView.class);
        privacyActivity.mReactItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.c4u, "field 'mReactItem'", CommonItemView.class);
        privacyActivity.mDuetItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.c4s, "field 'mDuetItem'", CommonItemView.class);
        privacyActivity.mDownloadItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.c4r, "field 'mDownloadItem'", CommonItemView.class);
        privacyActivity.mCommentManagerItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.xc, "field 'mCommentManagerItem'", CommonItemView.class);
        privacyActivity.mPrivateAccount = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.c4t, "field 'mPrivateAccount'", CommonItemView.class);
        privacyActivity.mCommentFilterItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.x7, "field 'mCommentFilterItem'", CommonItemView.class);
        privacyActivity.mPrivacyParent = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.c4w, "field 'mPrivacyParent'", LinearLayout.class);
        privacyActivity.mWhoCanSeeMyLikeListItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.dv4, "field 'mWhoCanSeeMyLikeListItem'", CommonItemView.class);
        privacyActivity.mPersonalizationItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.bxf, "field 'mPersonalizationItem'", CommonItemView.class);
        privacyActivity.personalizationDiv = Utils.findRequiredView(view, R.id.bxd, "field 'personalizationDiv'");
        privacyActivity.safeDivider = Utils.findRequiredView(view, R.id.cgh, "field 'safeDivider'");
    }
}
