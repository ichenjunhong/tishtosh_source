package com.p683ss.android.ugc.aweme.newfollow.p2002ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.feed.widget.MarqueeView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.VideoFollowFeedDetailActivity_ViewBinding */
public class VideoFollowFeedDetailActivity_ViewBinding extends AbsFollowFeedDetailActivity_ViewBinding {

    /* renamed from: a */
    private VideoFollowFeedDetailActivity f96540a;

    public void unbind() {
        VideoFollowFeedDetailActivity videoFollowFeedDetailActivity = this.f96540a;
        if (videoFollowFeedDetailActivity != null) {
            this.f96540a = null;
            videoFollowFeedDetailActivity.mIvMusicIcon = null;
            videoFollowFeedDetailActivity.mTvMusicOriginal = null;
            videoFollowFeedDetailActivity.mMusicTitleLayout = null;
            videoFollowFeedDetailActivity.mMusicTitleView = null;
            videoFollowFeedDetailActivity.mMusicLayout = null;
            videoFollowFeedDetailActivity.mLoadingView = null;
            videoFollowFeedDetailActivity.mIvPlay = null;
            videoFollowFeedDetailActivity.mIvPause = null;
            videoFollowFeedDetailActivity.mPlayStatusLayout = null;
            videoFollowFeedDetailActivity.mInteractStickers = null;
            videoFollowFeedDetailActivity.mAdDownloadButton = null;
            videoFollowFeedDetailActivity.mAdDownloadButtonPercent = null;
            videoFollowFeedDetailActivity.mAdDownloadButtonSize = null;
            videoFollowFeedDetailActivity.mAdDownloadButtonDetail = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public VideoFollowFeedDetailActivity_ViewBinding(VideoFollowFeedDetailActivity videoFollowFeedDetailActivity, View view) {
        super(videoFollowFeedDetailActivity, view);
        this.f96540a = videoFollowFeedDetailActivity;
        videoFollowFeedDetailActivity.mIvMusicIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.bo7, "field 'mIvMusicIcon'", ImageView.class);
        videoFollowFeedDetailActivity.mTvMusicOriginal = (TextView) Utils.findRequiredViewAsType(view, R.id.boc, "field 'mTvMusicOriginal'", TextView.class);
        videoFollowFeedDetailActivity.mMusicTitleLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.b8h, "field 'mMusicTitleLayout'", ViewGroup.class);
        videoFollowFeedDetailActivity.mMusicTitleView = (MarqueeView) Utils.findRequiredViewAsType(view, R.id.bot, "field 'mMusicTitleView'", MarqueeView.class);
        videoFollowFeedDetailActivity.mMusicLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.b8g, "field 'mMusicLayout'", ViewGroup.class);
        videoFollowFeedDetailActivity.mLoadingView = (ImageView) Utils.findRequiredViewAsType(view, R.id.b25, "field 'mLoadingView'", ImageView.class);
        videoFollowFeedDetailActivity.mIvPlay = (ImageView) Utils.findRequiredViewAsType(view, R.id.b37, "field 'mIvPlay'", ImageView.class);
        videoFollowFeedDetailActivity.mIvPause = (ImageView) Utils.findRequiredViewAsType(view, R.id.b2x, "field 'mIvPause'", ImageView.class);
        videoFollowFeedDetailActivity.mPlayStatusLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.b8z, "field 'mPlayStatusLayout'", ViewGroup.class);
        videoFollowFeedDetailActivity.mInteractStickers = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.auf, "field 'mInteractStickers'", ViewGroup.class);
        videoFollowFeedDetailActivity.mAdDownloadButton = (ViewGroup) Utils.findOptionalViewAsType(view, R.id.bl, "field 'mAdDownloadButton'", ViewGroup.class);
        videoFollowFeedDetailActivity.mAdDownloadButtonPercent = (TextView) Utils.findOptionalViewAsType(view, R.id.bhm, "field 'mAdDownloadButtonPercent'", TextView.class);
        videoFollowFeedDetailActivity.mAdDownloadButtonSize = (TextView) Utils.findOptionalViewAsType(view, R.id.bho, "field 'mAdDownloadButtonSize'", TextView.class);
        videoFollowFeedDetailActivity.mAdDownloadButtonDetail = (ImageView) Utils.findOptionalViewAsType(view, R.id.a7z, "field 'mAdDownloadButtonDetail'", ImageView.class);
    }
}
