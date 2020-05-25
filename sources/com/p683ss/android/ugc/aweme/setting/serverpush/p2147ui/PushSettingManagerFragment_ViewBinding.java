package com.p683ss.android.ugc.aweme.setting.serverpush.p2147ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.widget.setting.Divider;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerFragment_ViewBinding */
public class PushSettingManagerFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PushSettingManagerFragment f105561a;

    /* renamed from: b */
    private View f105562b;

    public void unbind() {
        PushSettingManagerFragment pushSettingManagerFragment = this.f105561a;
        if (pushSettingManagerFragment != null) {
            this.f105561a = null;
            pushSettingManagerFragment.mTitle = null;
            pushSettingManagerFragment.backBtn = null;
            pushSettingManagerFragment.itemPushMain = null;
            pushSettingManagerFragment.itemPushDig = null;
            pushSettingManagerFragment.itemPushComment = null;
            pushSettingManagerFragment.itemPushFollow = null;
            pushSettingManagerFragment.itemPushMention = null;
            pushSettingManagerFragment.itemPushFollowNewVideo = null;
            pushSettingManagerFragment.itemPushRecommendVideo = null;
            pushSettingManagerFragment.itemPushLive = null;
            pushSettingManagerFragment.itemOuterPushIm = null;
            pushSettingManagerFragment.itemInnerPushIm = null;
            pushSettingManagerFragment.itemOther = null;
            pushSettingManagerFragment.interactionDivider = null;
            pushSettingManagerFragment.interactionDividerWithoutLine = null;
            pushSettingManagerFragment.messageDivider = null;
            pushSettingManagerFragment.pushDivider = null;
            pushSettingManagerFragment.liveDivider = null;
            pushSettingManagerFragment.otherDivider = null;
            pushSettingManagerFragment.itemInnerPushLive = null;
            pushSettingManagerFragment.mPushItemParent = null;
            this.f105562b.setOnClickListener(null);
            this.f105562b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PushSettingManagerFragment_ViewBinding(final PushSettingManagerFragment pushSettingManagerFragment, View view) {
        this.f105561a = pushSettingManagerFragment;
        pushSettingManagerFragment.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.ik, "field 'backBtn' and method 'onClick'");
        pushSettingManagerFragment.backBtn = (ImageView) Utils.castView(findRequiredView, R.id.ik, "field 'backBtn'", ImageView.class);
        this.f105562b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                pushSettingManagerFragment.onClick(view);
            }
        });
        pushSettingManagerFragment.itemPushMain = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.awz, "field 'itemPushMain'", CommonItemView.class);
        pushSettingManagerFragment.itemPushDig = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.awv, "field 'itemPushDig'", CommonItemView.class);
        pushSettingManagerFragment.itemPushComment = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.awu, "field 'itemPushComment'", CommonItemView.class);
        pushSettingManagerFragment.itemPushFollow = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.aww, "field 'itemPushFollow'", CommonItemView.class);
        pushSettingManagerFragment.itemPushMention = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.ax0, "field 'itemPushMention'", CommonItemView.class);
        pushSettingManagerFragment.itemPushFollowNewVideo = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.awx, "field 'itemPushFollowNewVideo'", CommonItemView.class);
        pushSettingManagerFragment.itemPushRecommendVideo = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.ax1, "field 'itemPushRecommendVideo'", CommonItemView.class);
        pushSettingManagerFragment.itemPushLive = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.awy, "field 'itemPushLive'", CommonItemView.class);
        pushSettingManagerFragment.itemOuterPushIm = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.aw_, "field 'itemOuterPushIm'", CommonItemView.class);
        pushSettingManagerFragment.itemInnerPushIm = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.avr, "field 'itemInnerPushIm'", CommonItemView.class);
        pushSettingManagerFragment.itemOther = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.edo, "field 'itemOther'", CommonItemView.class);
        pushSettingManagerFragment.interactionDivider = (Divider) Utils.findRequiredViewAsType(view, R.id.ed2, "field 'interactionDivider'", Divider.class);
        pushSettingManagerFragment.interactionDividerWithoutLine = (Divider) Utils.findRequiredViewAsType(view, R.id.ed3, "field 'interactionDividerWithoutLine'", Divider.class);
        pushSettingManagerFragment.messageDivider = (Divider) Utils.findRequiredViewAsType(view, R.id.ela, "field 'messageDivider'", Divider.class);
        pushSettingManagerFragment.pushDivider = (Divider) Utils.findRequiredViewAsType(view, R.id.er1, "field 'pushDivider'", Divider.class);
        pushSettingManagerFragment.liveDivider = (Divider) Utils.findRequiredViewAsType(view, R.id.eja, "field 'liveDivider'", Divider.class);
        pushSettingManagerFragment.otherDivider = (Divider) Utils.findRequiredViewAsType(view, R.id.ens, "field 'otherDivider'", Divider.class);
        pushSettingManagerFragment.itemInnerPushLive = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.edi, "field 'itemInnerPushLive'", CommonItemView.class);
        pushSettingManagerFragment.mPushItemParent = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.er2, "field 'mPushItemParent'", LinearLayout.class);
    }
}
