package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.FeedAvatarView_ViewBinding */
public class FeedAvatarView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FeedAvatarView f80405a;

    /* renamed from: b */
    private View f80406b;

    public void unbind() {
        FeedAvatarView feedAvatarView = this.f80405a;
        if (feedAvatarView != null) {
            this.f80405a = null;
            feedAvatarView.mFollowContainerView = null;
            feedAvatarView.mFollowView = null;
            this.f80406b.setOnClickListener(null);
            this.f80406b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FeedAvatarView_ViewBinding(final FeedAvatarView feedAvatarView, View view) {
        this.f80405a = feedAvatarView;
        View findRequiredView = Utils.findRequiredView(view, R.id.ai3, "field 'mFollowContainerView' and method 'onClick'");
        feedAvatarView.mFollowContainerView = (ViewGroup) Utils.castView(findRequiredView, R.id.ai3, "field 'mFollowContainerView'", ViewGroup.class);
        this.f80406b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                feedAvatarView.onClick(view);
            }
        });
        feedAvatarView.mFollowView = (AnimationImageView) Utils.findRequiredViewAsType(view, R.id.ai0, "field 'mFollowView'", AnimationImageView.class);
    }
}
