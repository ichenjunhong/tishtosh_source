package com.p683ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerifyAndLive;
import com.p683ss.android.ugc.aweme.feed.p1736ui.LiveCircleView;
import com.p683ss.android.ugc.aweme.following.p1770ui.view.FollowUserBtn;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchUserViewHolder_ViewBinding */
public class SearchUserViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SearchUserViewHolder f73009a;

    public void unbind() {
        SearchUserViewHolder searchUserViewHolder = this.f73009a;
        if (searchUserViewHolder != null) {
            this.f73009a = null;
            searchUserViewHolder.mLiveNewTagLayout = null;
            searchUserViewHolder.mLiveNewTag = null;
            searchUserViewHolder.mIvAvator = null;
            searchUserViewHolder.mLiveCircle = null;
            searchUserViewHolder.mBtnFollow = null;
            searchUserViewHolder.mTvUsername = null;
            searchUserViewHolder.mTvAwemeId = null;
            searchUserViewHolder.mTvFansCnt = null;
            searchUserViewHolder.mTvDesc = null;
            searchUserViewHolder.mTvRecommendReason = null;
            searchUserViewHolder.adCardLinkStub = null;
            searchUserViewHolder.cardViewStub = null;
            searchUserViewHolder.mLiveTag = null;
            searchUserViewHolder.mMusicianCardStub = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SearchUserViewHolder_ViewBinding(SearchUserViewHolder searchUserViewHolder, View view) {
        this.f73009a = searchUserViewHolder;
        searchUserViewHolder.mLiveNewTagLayout = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.f1m, "field 'mLiveNewTagLayout'", FrameLayout.class);
        searchUserViewHolder.mLiveNewTag = (TextView) Utils.findRequiredViewAsType(view, R.id.f1l, "field 'mLiveNewTag'", TextView.class);
        searchUserViewHolder.mIvAvator = (AvatarImageWithVerifyAndLive) Utils.findRequiredViewAsType(view, R.id.ay2, "field 'mIvAvator'", AvatarImageWithVerifyAndLive.class);
        searchUserViewHolder.mLiveCircle = (LiveCircleView) Utils.findRequiredViewAsType(view, R.id.avw, "field 'mLiveCircle'", LiveCircleView.class);
        searchUserViewHolder.mBtnFollow = (FollowUserBtn) Utils.findRequiredViewAsType(view, R.id.nr, "field 'mBtnFollow'", FollowUserBtn.class);
        searchUserViewHolder.mTvUsername = (TextView) Utils.findRequiredViewAsType(view, R.id.dif, "field 'mTvUsername'", TextView.class);
        searchUserViewHolder.mTvAwemeId = (TextView) Utils.findRequiredViewAsType(view, R.id.d6y, "field 'mTvAwemeId'", TextView.class);
        searchUserViewHolder.mTvFansCnt = (TextView) Utils.findRequiredViewAsType(view, R.id.d_6, "field 'mTvFansCnt'", TextView.class);
        searchUserViewHolder.mTvDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.d98, "field 'mTvDesc'", TextView.class);
        searchUserViewHolder.mTvRecommendReason = (TextView) Utils.findRequiredViewAsType(view, R.id.deg, "field 'mTvRecommendReason'", TextView.class);
        searchUserViewHolder.adCardLinkStub = (ViewStub) Utils.findRequiredViewAsType(view, R.id.eu3, "field 'adCardLinkStub'", ViewStub.class);
        searchUserViewHolder.cardViewStub = (ViewStub) Utils.findRequiredViewAsType(view, R.id.civ, "field 'cardViewStub'", ViewStub.class);
        searchUserViewHolder.mLiveTag = (ImageView) Utils.findRequiredViewAsType(view, R.id.aqi, "field 'mLiveTag'", ImageView.class);
        searchUserViewHolder.mMusicianCardStub = (ViewStub) Utils.findRequiredViewAsType(view, R.id.emi, "field 'mMusicianCardStub'", ViewStub.class);
    }
}
