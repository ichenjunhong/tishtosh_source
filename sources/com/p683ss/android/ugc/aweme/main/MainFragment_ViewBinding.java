package com.p683ss.android.ugc.aweme.main;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimatedImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.CustomInterceptTouchEventFrameLayout;
import com.p683ss.android.ugc.aweme.base.p1420ui.FlippableViewPager;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.view.MainTabStrip;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.main.MainFragment_ViewBinding */
public class MainFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MainFragment f93464a;

    public void unbind() {
        MainFragment mainFragment = this.f93464a;
        if (mainFragment != null) {
            this.f93464a = null;
            mainFragment.mFlRootContainer = null;
            mainFragment.mFlContainerStoryPanel = null;
            mainFragment.mFlContentContainer = null;
            mainFragment.mSwipeRefreshLayoutWhenStoryOpen = null;
            mainFragment.mViewPager = null;
            mainFragment.mPagerTabStrip = null;
            mainFragment.mStatusBarView = null;
            mainFragment.mRlTabContainer = null;
            mainFragment.mTeenagerModeTitleBarStub = null;
            mainFragment.mXmasTreeViewStub = null;
            mainFragment.mVTabBg = null;
            mainFragment.mVolumeBtnStub = null;
            mainFragment.mTitleBarContainer = null;
            mainFragment.mTitleShadow = null;
            mainFragment.mLiveSquareEntrance = null;
            mainFragment.mLiveSquareEntranceImg = null;
            mainFragment.mTeenageSpecialTopicEnterView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MainFragment_ViewBinding(MainFragment mainFragment, View view) {
        this.f93464a = mainFragment;
        mainFragment.mFlRootContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ahd, "field 'mFlRootContainer'", ViewGroup.class);
        mainFragment.mFlContainerStoryPanel = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.agv, "field 'mFlContainerStoryPanel'", ViewGroup.class);
        mainFragment.mFlContentContainer = (CustomInterceptTouchEventFrameLayout) Utils.findRequiredViewAsType(view, R.id.agx, "field 'mFlContentContainer'", CustomInterceptTouchEventFrameLayout.class);
        mainFragment.mSwipeRefreshLayoutWhenStoryOpen = (SwipeRefreshLayout) Utils.findRequiredViewAsType(view, R.id.crb, "field 'mSwipeRefreshLayoutWhenStoryOpen'", SwipeRefreshLayout.class);
        mainFragment.mViewPager = (FlippableViewPager) Utils.findRequiredViewAsType(view, R.id.ds2, "field 'mViewPager'", FlippableViewPager.class);
        mainFragment.mPagerTabStrip = (MainTabStrip) Utils.findRequiredViewAsType(view, R.id.bvy, "field 'mPagerTabStrip'", MainTabStrip.class);
        mainFragment.mStatusBarView = Utils.findRequiredView(view, R.id.csm, "field 'mStatusBarView'");
        mainFragment.mRlTabContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.ce3, "field 'mRlTabContainer'", FrameLayout.class);
        mainFragment.mTeenagerModeTitleBarStub = Utils.findRequiredView(view, R.id.cy2, "field 'mTeenagerModeTitleBarStub'");
        mainFragment.mXmasTreeViewStub = (ViewStub) Utils.findRequiredViewAsType(view, R.id.dt9, "field 'mXmasTreeViewStub'", ViewStub.class);
        mainFragment.mVTabBg = Utils.findRequiredView(view, R.id.do7, "field 'mVTabBg'");
        mainFragment.mVolumeBtnStub = (ViewStub) Utils.findRequiredViewAsType(view, R.id.bjv, "field 'mVolumeBtnStub'", ViewStub.class);
        mainFragment.mTitleBarContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.d12, "field 'mTitleBarContainer'", LinearLayout.class);
        mainFragment.mTitleShadow = (ImageView) Utils.findRequiredViewAsType(view, R.id.d1i, "field 'mTitleShadow'", ImageView.class);
        mainFragment.mLiveSquareEntrance = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.ejm, "field 'mLiveSquareEntrance'", FrameLayout.class);
        mainFragment.mLiveSquareEntranceImg = (ImageView) Utils.findRequiredViewAsType(view, R.id.ejn, "field 'mLiveSquareEntranceImg'", ImageView.class);
        mainFragment.mTeenageSpecialTopicEnterView = (AnimatedImageView) Utils.findRequiredViewAsType(view, R.id.ezf, "field 'mTeenageSpecialTopicEnterView'", AnimatedImageView.class);
    }
}
