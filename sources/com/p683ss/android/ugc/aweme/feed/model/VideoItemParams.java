package com.p683ss.android.ugc.aweme.feed.model;

import android.support.p030v4.app.Fragment;
import com.bytedance.services.apm.api.C13218a;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25880al;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25908e;
import com.p683ss.android.ugc.aweme.commercialize.p1555e.C25735b;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.model.VideoItemParams */
public class VideoItemParams {
    public volatile String curPoiId;
    public volatile String curPoiLat;
    public volatile String curPoiLng;
    public int currentPosition;
    public Fragment fragment;
    public boolean isFromPostList;
    public boolean isMyProfile;
    public C25735b mAdOpenCallBack;
    public C25908e mAdViewController;
    public Aweme mAweme;
    public int mAwemeFromPage;
    public volatile String mEnterMethodValue;
    public volatile String mEventType;
    public volatile int mPageType;
    public volatile JSONObject mRequestId;
    public Aweme mWidgetAweme;
    public volatile String poiPageType;
    public String trackerData;

    public static VideoItemParams newBuilder() {
        return new VideoItemParams();
    }

    public VideoItemParams setAdOpenCallBack(C25735b bVar) {
        this.mAdOpenCallBack = bVar;
        return this;
    }

    public VideoItemParams setAdViewController(C25908e eVar) {
        this.mAdViewController = eVar;
        return this;
    }

    public VideoItemParams setAweme(Aweme aweme) {
        this.mAweme = aweme;
        return this;
    }

    public VideoItemParams setAwemeFromPage(int i) {
        this.mAwemeFromPage = i;
        return this;
    }

    public VideoItemParams setCurPoiId(String str) {
        this.curPoiId = str;
        return this;
    }

    public VideoItemParams setCurPoiLat(String str) {
        this.curPoiLat = str;
        return this;
    }

    public VideoItemParams setCurPoiLng(String str) {
        this.curPoiLng = str;
        return this;
    }

    public VideoItemParams setEnterMethodValue(String str) {
        this.mEnterMethodValue = str;
        return this;
    }

    public VideoItemParams setEventType(String str) {
        this.mEventType = str;
        return this;
    }

    public VideoItemParams setFragment(Fragment fragment2) {
        this.fragment = fragment2;
        return this;
    }

    public VideoItemParams setFromPostList(boolean z) {
        this.isFromPostList = z;
        return this;
    }

    public VideoItemParams setMyProfile(boolean z) {
        this.isMyProfile = z;
        return this;
    }

    public VideoItemParams setPageType(int i) {
        this.mPageType = i;
        return this;
    }

    public VideoItemParams setPoiPageType(String str) {
        this.poiPageType = str;
        return this;
    }

    public VideoItemParams setRequestId(JSONObject jSONObject) {
        this.mRequestId = jSONObject;
        return this;
    }

    public VideoItemParams setwidgetAweme(Aweme aweme) {
        this.mWidgetAweme = aweme;
        return this;
    }

    public static VideoItemParams newBuilder(BaseFeedPageParams baseFeedPageParams, C25880al alVar, Fragment fragment2, String str) {
        VideoItemParams awemeFromPage = new VideoItemParams().setEventType(baseFeedPageParams.eventType).setMyProfile(baseFeedPageParams.isMyProfile).setPageType(baseFeedPageParams.pageType).setFromPostList(baseFeedPageParams.isFromPostList).setFragment(fragment2).setEnterMethodValue(str).setAwemeFromPage(baseFeedPageParams.awemeFromPage);
        if (baseFeedPageParams.eventType == null) {
            C13218a.m26605a("event type null ");
        }
        if (baseFeedPageParams.param != null) {
            awemeFromPage.setCurPoiLat(baseFeedPageParams.param.getCurPoiLat()).setCurPoiLng(baseFeedPageParams.param.getCurPoiLng()).setCurPoiId(baseFeedPageParams.param.getPagePoiId()).setPoiPageType(baseFeedPageParams.getPoiTabType()).trackerData = baseFeedPageParams.param.getTracker();
        }
        if (alVar != null) {
            awemeFromPage.setAdOpenCallBack(alVar.mo53071f()).setAdViewController(alVar.mo53064c());
        }
        return awemeFromPage;
    }
}
