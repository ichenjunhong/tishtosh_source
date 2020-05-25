package com.p683ss.android.ugc.aweme.feed.api;

import android.app.Activity;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.common.utility.p522b.C9381g;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.noticebar.C30574a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.AbstractUnReadSunRoofTouchEventFrameLayout;
import com.p683ss.android.ugc.aweme.feed.p1736ui.AbstractUnReadSunRoofView;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30782az;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30786ba;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.api.IFeedModuleService */
public interface IFeedModuleService {
    void attachActivityToGlobalAcViewModel(FragmentActivity fragmentActivity);

    boolean canResumePlay();

    void commitFeedRequest(int i, C9381g gVar, Callable callable, int i2, boolean z);

    C30786ba createUnReadSunRoofViewDelegate(FragmentActivity fragmentActivity, AbstractUnReadSunRoofView abstractUnReadSunRoofView, AbstractUnReadSunRoofTouchEventFrameLayout abstractUnReadSunRoofTouchEventFrameLayout);

    boolean enableOptimize();

    boolean fullscreenShowLive();

    String getFeedRequstParam();

    Integer getInsertIndex(int i, Aweme aweme);

    C30782az getUnReadFeedSunRoofViewModel(FragmentActivity fragmentActivity);

    void initPosterSRProcessorOnHotStart();

    boolean isInterestAweme(Aweme aweme);

    void maybeMonitorTimeSpend(Aweme aweme, Long l);

    void maybeRequestAfterFirstFrame();

    void mobStartRequest(Fragment fragment, String str);

    C30574a newTopNoticeFeedManager(Activity activity, View view);

    void posterSRProcessorOnDestroy();

    void setFeedRequstParam(String str);
}
