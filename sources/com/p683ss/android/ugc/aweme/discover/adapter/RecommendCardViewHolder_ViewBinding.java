package com.p683ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.RecommendCardViewHolder_ViewBinding */
public class RecommendCardViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RecommendCardViewHolder f72931a;

    /* renamed from: b */
    private View f72932b;

    /* renamed from: c */
    private View f72933c;

    public void unbind() {
        RecommendCardViewHolder recommendCardViewHolder = this.f72931a;
        if (recommendCardViewHolder != null) {
            this.f72931a = null;
            recommendCardViewHolder.closeIv = null;
            recommendCardViewHolder.avatar = null;
            recommendCardViewHolder.txtNickName = null;
            recommendCardViewHolder.closeContainer = null;
            recommendCardViewHolder.txtDescription = null;
            recommendCardViewHolder.ivFollow = null;
            recommendCardViewHolder.nickNameBg = null;
            recommendCardViewHolder.descriptionBg = null;
            recommendCardViewHolder.rootLayout = null;
            this.f72932b.setOnClickListener(null);
            this.f72932b = null;
            this.f72933c.setOnClickListener(null);
            this.f72933c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RecommendCardViewHolder_ViewBinding(final RecommendCardViewHolder recommendCardViewHolder, View view) {
        this.f72931a = recommendCardViewHolder;
        recommendCardViewHolder.closeIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.un, "field 'closeIv'", ImageView.class);
        recommendCardViewHolder.avatar = (CircleImageView) Utils.findRequiredViewAsType(view, R.id.hi, "field 'avatar'", CircleImageView.class);
        recommendCardViewHolder.txtNickName = (TextView) Utils.findRequiredViewAsType(view, R.id.bqu, "field 'txtNickName'", TextView.class);
        recommendCardViewHolder.closeContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.uk, "field 'closeContainer'", FrameLayout.class);
        recommendCardViewHolder.txtDescription = (TextView) Utils.findRequiredViewAsType(view, R.id.a4o, "field 'txtDescription'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.b0t, "field 'ivFollow' and method 'onClick'");
        recommendCardViewHolder.ivFollow = (AnimationImageView) Utils.castView(findRequiredView, R.id.b0t, "field 'ivFollow'", AnimationImageView.class);
        this.f72932b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                recommendCardViewHolder.onClick(view);
            }
        });
        recommendCardViewHolder.nickNameBg = Utils.findRequiredView(view, R.id.bqv, "field 'nickNameBg'");
        recommendCardViewHolder.descriptionBg = Utils.findRequiredView(view, R.id.a4p, "field 'descriptionBg'");
        View findRequiredView2 = Utils.findRequiredView(view, R.id.cfg, "field 'rootLayout' and method 'onClick'");
        recommendCardViewHolder.rootLayout = (LinearLayout) Utils.castView(findRequiredView2, R.id.cfg, "field 'rootLayout'", LinearLayout.class);
        this.f72933c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                recommendCardViewHolder.onClick(view);
            }
        });
    }
}
