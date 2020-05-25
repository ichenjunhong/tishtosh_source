package com.p683ss.android.ugc.aweme.commercialize.views;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;
import com.p683ss.android.ugc.aweme.views.MentionTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdCommentView_ViewBinding */
public class AdCommentView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AdCommentView f69905a;

    /* renamed from: b */
    private View f69906b;

    /* renamed from: c */
    private View f69907c;

    /* renamed from: d */
    private View f69908d;

    /* renamed from: e */
    private View f69909e;

    /* renamed from: f */
    private View f69910f;

    /* renamed from: g */
    private View f69911g;

    /* renamed from: h */
    private View f69912h;

    /* renamed from: i */
    private View f69913i;

    public void unbind() {
        AdCommentView adCommentView = this.f69905a;
        if (adCommentView != null) {
            this.f69905a = null;
            adCommentView.mAvatarView = null;
            adCommentView.mTitleView = null;
            adCommentView.mContentView = null;
            adCommentView.mCommentContainer = null;
            adCommentView.mReplyContainer = null;
            adCommentView.mReplyTitleView = null;
            adCommentView.mReplyContentView = null;
            adCommentView.mMenuItem = null;
            adCommentView.mReplyDivider = null;
            adCommentView.mCommentTimeView = null;
            adCommentView.mDiggView = null;
            adCommentView.mCommentStyleView = null;
            adCommentView.mDiggLayout = null;
            adCommentView.mReplyCommentStyleView = null;
            adCommentView.contentll = null;
            this.f69906b.setOnClickListener(null);
            this.f69906b = null;
            this.f69907c.setOnClickListener(null);
            this.f69907c = null;
            this.f69908d.setOnClickListener(null);
            this.f69908d = null;
            this.f69909e.setOnClickListener(null);
            this.f69909e = null;
            this.f69910f.setOnClickListener(null);
            this.f69910f = null;
            this.f69911g.setOnClickListener(null);
            this.f69911g = null;
            this.f69912h.setOnClickListener(null);
            this.f69912h = null;
            this.f69913i.setOnClickListener(null);
            this.f69913i = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AdCommentView_ViewBinding(final AdCommentView adCommentView, View view) {
        this.f69905a = adCommentView;
        View findRequiredView = Utils.findRequiredView(view, R.id.hi, "field 'mAvatarView' and method 'onClick'");
        adCommentView.mAvatarView = (CircleImageView) Utils.castView(findRequiredView, R.id.hi, "field 'mAvatarView'", CircleImageView.class);
        this.f69906b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                adCommentView.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.title, "field 'mTitleView' and method 'onClick'");
        adCommentView.mTitleView = (DmtTextView) Utils.castView(findRequiredView2, R.id.title, "field 'mTitleView'", DmtTextView.class);
        this.f69907c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                adCommentView.onClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.ze, "field 'mContentView' and method 'onClick'");
        adCommentView.mContentView = (MentionTextView) Utils.castView(findRequiredView3, R.id.ze, "field 'mContentView'", MentionTextView.class);
        this.f69908d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                adCommentView.onClick(view);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, R.id.x2, "field 'mCommentContainer' and method 'onClick'");
        adCommentView.mCommentContainer = findRequiredView4;
        this.f69909e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                adCommentView.onClick(view);
            }
        });
        adCommentView.mReplyContainer = Utils.findRequiredView(view, R.id.cbg, "field 'mReplyContainer'");
        adCommentView.mReplyTitleView = (TextView) Utils.findRequiredViewAsType(view, R.id.cbj, "field 'mReplyTitleView'", TextView.class);
        adCommentView.mReplyContentView = (MentionTextView) Utils.findRequiredViewAsType(view, R.id.cbh, "field 'mReplyContentView'", MentionTextView.class);
        adCommentView.mMenuItem = (ImageView) Utils.findOptionalViewAsType(view, R.id.acx, "field 'mMenuItem'", ImageView.class);
        adCommentView.mReplyDivider = Utils.findRequiredView(view, R.id.cbi, "field 'mReplyDivider'");
        adCommentView.mCommentTimeView = (TextView) Utils.findRequiredViewAsType(view, R.id.xm, "field 'mCommentTimeView'", TextView.class);
        adCommentView.mDiggView = (ImageView) Utils.findRequiredViewAsType(view, R.id.b02, "field 'mDiggView'", ImageView.class);
        View findRequiredView5 = Utils.findRequiredView(view, R.id.xl, "field 'mCommentStyleView' and method 'onClick'");
        adCommentView.mCommentStyleView = (TextView) Utils.castView(findRequiredView5, R.id.xl, "field 'mCommentStyleView'", TextView.class);
        this.f69910f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                adCommentView.onClick(view);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, R.id.b7f, "field 'mDiggLayout' and method 'onClick'");
        adCommentView.mDiggLayout = (RelativeLayout) Utils.castView(findRequiredView6, R.id.b7f, "field 'mDiggLayout'", RelativeLayout.class);
        this.f69911g = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                adCommentView.onClick(view);
            }
        });
        adCommentView.mReplyCommentStyleView = (TextView) Utils.findRequiredViewAsType(view, R.id.cbf, "field 'mReplyCommentStyleView'", TextView.class);
        View findRequiredView7 = Utils.findRequiredView(view, R.id.zw, "field 'contentll' and method 'onClick'");
        adCommentView.contentll = (LinearLayout) Utils.castView(findRequiredView7, R.id.zw, "field 'contentll'", LinearLayout.class);
        this.f69912h = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                adCommentView.onClick(view);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, R.id.xb, "method 'onClick'");
        this.f69913i = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                adCommentView.onClick(view);
            }
        });
        adCommentView.size = view.getContext().getResources().getDimensionPixelSize(R.dimen.ei);
    }
}
