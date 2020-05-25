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

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerFragmentSecondVersion_ViewBinding */
public class PushSettingManagerFragmentSecondVersion_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PushSettingManagerFragmentSecondVersion f105557a;

    /* renamed from: b */
    private View f105558b;

    public void unbind() {
        PushSettingManagerFragmentSecondVersion pushSettingManagerFragmentSecondVersion = this.f105557a;
        if (pushSettingManagerFragmentSecondVersion != null) {
            this.f105557a = null;
            pushSettingManagerFragmentSecondVersion.mTitle = null;
            pushSettingManagerFragmentSecondVersion.backBtn = null;
            pushSettingManagerFragmentSecondVersion.itemPushMain = null;
            pushSettingManagerFragmentSecondVersion.itemPushDig = null;
            pushSettingManagerFragmentSecondVersion.itemPushComment = null;
            pushSettingManagerFragmentSecondVersion.itemPushFollow = null;
            pushSettingManagerFragmentSecondVersion.itemPushMention = null;
            pushSettingManagerFragmentSecondVersion.itemPushFollowNewVideo = null;
            pushSettingManagerFragmentSecondVersion.itemPushRecommendVideo = null;
            pushSettingManagerFragmentSecondVersion.itemPushLive = null;
            pushSettingManagerFragmentSecondVersion.itemOuterPushIm = null;
            pushSettingManagerFragmentSecondVersion.itemInnerPushIm = null;
            pushSettingManagerFragmentSecondVersion.itemOther = null;
            pushSettingManagerFragmentSecondVersion.interactionDivider = null;
            pushSettingManagerFragmentSecondVersion.interactionDividerWithoutLine = null;
            pushSettingManagerFragmentSecondVersion.messageDivider = null;
            pushSettingManagerFragmentSecondVersion.pushDivider = null;
            pushSettingManagerFragmentSecondVersion.liveDivider = null;
            pushSettingManagerFragmentSecondVersion.otherDivider = null;
            pushSettingManagerFragmentSecondVersion.itemInnerPushLive = null;
            pushSettingManagerFragmentSecondVersion.mPushItemParent = null;
            this.f105558b.setOnClickListener(null);
            this.f105558b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PushSettingManagerFragmentSecondVersion_ViewBinding(final PushSettingManagerFragmentSecondVersion pushSettingManagerFragmentSecondVersion, View view) {
        this.f105557a = pushSettingManagerFragmentSecondVersion;
        pushSettingManagerFragmentSecondVersion.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.ik, "field 'backBtn' and method 'onClick'");
        pushSettingManagerFragmentSecondVersion.backBtn = (ImageView) Utils.castView(findRequiredView, R.id.ik, "field 'backBtn'", ImageView.class);
        this.f105558b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                pushSettingManagerFragmentSecondVersion.onClick(view);
            }
        });
        pushSettingManagerFragmentSecondVersion.itemPushMain = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.awz, "field 'itemPushMain'", CommonItemView.class);
        pushSettingManagerFragmentSecondVersion.itemPushDig = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.awv, "field 'itemPushDig'", CommonItemView.class);
        pushSettingManagerFragmentSecondVersion.itemPushComment = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.awu, "field 'itemPushComment'", CommonItemView.class);
        pushSettingManagerFragmentSecondVersion.itemPushFollow = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.aww, "field 'itemPushFollow'", CommonItemView.class);
        pushSettingManagerFragmentSecondVersion.itemPushMention = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.ax0, "field 'itemPushMention'", CommonItemView.class);
        pushSettingManagerFragmentSecondVersion.itemPushFollowNewVideo = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.awx, "field 'itemPushFollowNewVideo'", CommonItemView.class);
        pushSettingManagerFragmentSecondVersion.itemPushRecommendVideo = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.ax1, "field 'itemPushRecommendVideo'", CommonItemView.class);
        pushSettingManagerFragmentSecondVersion.itemPushLive = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.awy, "field 'itemPushLive'", CommonItemView.class);
        pushSettingManagerFragmentSecondVersion.itemOuterPushIm = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.aw_, "field 'itemOuterPushIm'", CommonItemView.class);
        pushSettingManagerFragmentSecondVersion.itemInnerPushIm = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.avr, "field 'itemInnerPushIm'", CommonItemView.class);
        pushSettingManagerFragmentSecondVersion.itemOther = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.edo, "field 'itemOther'", CommonItemView.class);
        pushSettingManagerFragmentSecondVersion.interactionDivider = (Divider) Utils.findRequiredViewAsType(view, R.id.ed2, "field 'interactionDivider'", Divider.class);
        pushSettingManagerFragmentSecondVersion.interactionDividerWithoutLine = (Divider) Utils.findRequiredViewAsType(view, R.id.ed3, "field 'interactionDividerWithoutLine'", Divider.class);
        pushSettingManagerFragmentSecondVersion.messageDivider = (Divider) Utils.findRequiredViewAsType(view, R.id.ela, "field 'messageDivider'", Divider.class);
        pushSettingManagerFragmentSecondVersion.pushDivider = (Divider) Utils.findRequiredViewAsType(view, R.id.er1, "field 'pushDivider'", Divider.class);
        pushSettingManagerFragmentSecondVersion.liveDivider = (Divider) Utils.findRequiredViewAsType(view, R.id.eja, "field 'liveDivider'", Divider.class);
        pushSettingManagerFragmentSecondVersion.otherDivider = (Divider) Utils.findRequiredViewAsType(view, R.id.ens, "field 'otherDivider'", Divider.class);
        pushSettingManagerFragmentSecondVersion.itemInnerPushLive = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.edi, "field 'itemInnerPushLive'", CommonItemView.class);
        pushSettingManagerFragmentSecondVersion.mPushItemParent = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.er2, "field 'mPushItemParent'", LinearLayout.class);
    }
}
