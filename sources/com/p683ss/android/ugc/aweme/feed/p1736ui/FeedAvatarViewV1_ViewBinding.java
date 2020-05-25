package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.FeedAvatarViewV1_ViewBinding */
public class FeedAvatarViewV1_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FeedAvatarViewV1 f80401a;

    /* renamed from: b */
    private View f80402b;

    public void unbind() {
        FeedAvatarViewV1 feedAvatarViewV1 = this.f80401a;
        if (feedAvatarViewV1 != null) {
            this.f80401a = null;
            feedAvatarViewV1.mFollowContainerView = null;
            feedAvatarViewV1.mFollowView = null;
            this.f80402b.setOnClickListener(null);
            this.f80402b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FeedAvatarViewV1_ViewBinding(final FeedAvatarViewV1 feedAvatarViewV1, View view) {
        this.f80401a = feedAvatarViewV1;
        View findRequiredView = Utils.findRequiredView(view, R.id.ai3, "field 'mFollowContainerView' and method 'onClick'");
        feedAvatarViewV1.mFollowContainerView = (ViewGroup) Utils.castView(findRequiredView, R.id.ai3, "field 'mFollowContainerView'", ViewGroup.class);
        this.f80402b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                feedAvatarViewV1.onClick(view);
            }
        });
        feedAvatarViewV1.mFollowView = (AnimationImageView) Utils.findRequiredViewAsType(view, R.id.ai0, "field 'mFollowView'", AnimationImageView.class);
    }
}
