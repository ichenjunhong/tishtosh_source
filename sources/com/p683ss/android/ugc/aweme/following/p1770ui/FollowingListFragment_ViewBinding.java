package com.p683ss.android.ugc.aweme.following.p1770ui;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingListFragment_ViewBinding */
public class FollowingListFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FollowingListFragment f83656a;

    /* renamed from: b */
    private View f83657b;

    public void unbind() {
        FollowingListFragment followingListFragment = this.f83656a;
        if (followingListFragment != null) {
            this.f83656a = null;
            followingListFragment.imgAddFriends = null;
            followingListFragment.mVSpit = null;
            followingListFragment.mEnablePushNoticeView = null;
            this.f83657b.setOnClickListener(null);
            this.f83657b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FollowingListFragment_ViewBinding(final FollowingListFragment followingListFragment, View view) {
        this.f83656a = followingListFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.dh, "field 'imgAddFriends' and method 'onViewClicked'");
        followingListFragment.imgAddFriends = (ImageView) Utils.castView(findRequiredView, R.id.dh, "field 'imgAddFriends'", ImageView.class);
        this.f83657b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                followingListFragment.onViewClicked();
            }
        });
        followingListFragment.mVSpit = Utils.findRequiredView(view, R.id.do6, "field 'mVSpit'");
        followingListFragment.mEnablePushNoticeView = (NoticeView) Utils.findRequiredViewAsType(view, R.id.e_z, "field 'mEnablePushNoticeView'", NoticeView.class);
    }
}
