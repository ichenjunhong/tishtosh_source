package com.p683ss.android.ugc.aweme.newfollow.p2002ui;

import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoPlayerProgressbar;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.FollowFeedVideoContent_ViewBinding */
public class FollowFeedVideoContent_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FollowFeedVideoContent f96510a;

    public void unbind() {
        FollowFeedVideoContent followFeedVideoContent = this.f96510a;
        if (followFeedVideoContent != null) {
            this.f96510a = null;
            followFeedVideoContent.mContainer = null;
            followFeedVideoContent.mCover = null;
            followFeedVideoContent.mProgressbar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FollowFeedVideoContent_ViewBinding(FollowFeedVideoContent followFeedVideoContent, View view) {
        this.f96510a = followFeedVideoContent;
        followFeedVideoContent.mContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.dqj, "field 'mContainer'", ViewGroup.class);
        followFeedVideoContent.mCover = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.azj, "field 'mCover'", RemoteImageView.class);
        followFeedVideoContent.mProgressbar = (VideoPlayerProgressbar) Utils.findRequiredViewAsType(view, R.id.dpu, "field 'mProgressbar'", VideoPlayerProgressbar.class);
    }
}
