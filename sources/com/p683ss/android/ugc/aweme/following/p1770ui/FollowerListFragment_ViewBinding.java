package com.p683ss.android.ugc.aweme.following.p1770ui;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerListFragment_ViewBinding */
public class FollowerListFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FollowerListFragment f83640a;

    /* renamed from: b */
    private View f83641b;

    public void unbind() {
        FollowerListFragment followerListFragment = this.f83640a;
        if (followerListFragment != null) {
            this.f83640a = null;
            followerListFragment.viewFansDivider = null;
            followerListFragment.imgAddFriends = null;
            this.f83641b.setOnClickListener(null);
            this.f83641b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FollowerListFragment_ViewBinding(final FollowerListFragment followerListFragment, View view) {
        this.f83640a = followerListFragment;
        followerListFragment.viewFansDivider = Utils.findRequiredView(view, R.id.adq, "field 'viewFansDivider'");
        View findRequiredView = Utils.findRequiredView(view, R.id.dh, "field 'imgAddFriends' and method 'onViewClicked'");
        followerListFragment.imgAddFriends = (ImageView) Utils.castView(findRequiredView, R.id.dh, "field 'imgAddFriends'", ImageView.class);
        this.f83641b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                followerListFragment.onViewClicked();
            }
        });
    }
}
