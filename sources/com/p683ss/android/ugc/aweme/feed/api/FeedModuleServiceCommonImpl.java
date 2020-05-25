package com.p683ss.android.ugc.aweme.feed.api;

import android.app.Activity;
import android.content.Context;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.experiment.InterestSelectExperiment;
import com.p683ss.android.ugc.aweme.experiment.InterestSelectExperiment.C29496b;
import com.p683ss.android.ugc.aweme.experiment.InterestSelectExperiment.C29497c;
import com.p683ss.android.ugc.aweme.feed.C30436k;
import com.p683ss.android.ugc.aweme.feed.C31219v;
import com.p683ss.android.ugc.aweme.feed.experiment.RecommendFeedMemoryOptimize;
import com.p683ss.android.ugc.aweme.feed.interest.C30410b;
import com.p683ss.android.ugc.aweme.feed.interest.InterestApi;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.noticebar.C30574a;
import com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.noticebar.C30575b;
import com.p683ss.android.ugc.aweme.feed.p1736ui.AbstractUnReadSunRoofTouchEventFrameLayout;
import com.p683ss.android.ugc.aweme.feed.p1736ui.AbstractUnReadSunRoofView;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30782az;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30786ba;
import com.p683ss.android.ugc.aweme.feed.unread.UnReadFeedSunRoofViewModel.C31151a;
import com.p683ss.android.ugc.aweme.feed.unread.UnReadSunRoofViewDelegate;
import com.p683ss.android.ugc.aweme.feed.utils.C31202n;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.main.C36663h;
import java.util.concurrent.Callable;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.api.FeedModuleServiceCommonImpl */
public abstract class FeedModuleServiceCommonImpl implements IFeedModuleService {
    public boolean isInterestAweme(Aweme aweme) {
        return false;
    }

    public boolean fullscreenShowLive() {
        return C31202n.m72858a();
    }

    public String getFeedRequstParam() {
        return InterestSelectExperiment.m69602b();
    }

    public boolean canResumePlay() {
        CharSequence b = InterestSelectExperiment.m69602b();
        if (b == null || b.length() == 0) {
            return true;
        }
        return false;
    }

    public boolean enableOptimize() {
        if (C10181b.m20511a().mo18168a(RecommendFeedMemoryOptimize.class, true, "recommend_feed_list_memory_optimize", 31744, 0) == 1) {
            return true;
        }
        return false;
    }

    public void maybeRequestAfterFirstFrame() {
        if (InterestSelectExperiment.INSTANCE.mo59605g() && InterestSelectExperiment.INSTANCE.mo59601c() != 0 && !InterestSelectExperiment.alreadyRequested) {
            InterestSelectExperiment.alreadyRequested = true;
            C30410b bVar = C30410b.f79484a;
            C26890h.m65011a("ask_interest_lable", new C23089d().mo47829a("enter_from", "homepage_hot").mo47829a("user_id", C30410b.m71333a()).f61491a);
            String str = InterestSelectExperiment.TAG;
            StringBuilder sb = new StringBuilder("start to request,current expr is group1:");
            sb.append(InterestSelectExperiment.INSTANCE.mo59606h());
            C32458a.m75141a(4, str, sb.toString());
            InterestSelectExperiment interestSelectExperiment = InterestSelectExperiment.INSTANCE;
            ((InterestApi) InterestSelectExperiment.api$delegate.getValue()).getInterestList().mo6529b(C2168a.m6521b()).mo6505a((C1710e<? super T>) C29496b.f77261a, (C1710e<? super Throwable>) C29497c.f77262a);
        }
    }

    public void setFeedRequstParam(String str) {
        InterestSelectExperiment.m69601a(str);
    }

    public C30782az getUnReadFeedSunRoofViewModel(FragmentActivity fragmentActivity) {
        return C31151a.m72790a(fragmentActivity);
    }

    public C30574a newTopNoticeFeedManager(Activity activity, View view) {
        return C30575b.m71562a(activity, view);
    }

    public void mobStartRequest(Fragment fragment, String str) {
        new C31219v(fragment).mo64024a(str);
    }

    public Integer getInsertIndex(int i, Aweme aweme) {
        Integer num = null;
        if (aweme == null) {
            return null;
        }
        if (InterestSelectExperiment.INSTANCE.mo59606h()) {
            int d = InterestSelectExperiment.INSTANCE.mo59602d() - 1;
            int i2 = i + 2;
            if (i2 < d) {
                i2 = d;
            }
            num = Integer.valueOf(i2);
        } else if (InterestSelectExperiment.INSTANCE.mo59607i()) {
            num = Integer.valueOf(i + 1);
        }
        return num;
    }

    public void maybeMonitorTimeSpend(Aweme aweme, Long l) {
        long longValue = l.longValue();
        if (InterestSelectExperiment.v2NotRequest && InterestSelectExperiment.INSTANCE.mo59605g() && InterestSelectExperiment.INSTANCE.mo59607i() && aweme != null && !aweme.isAd()) {
            if (System.currentTimeMillis() - longValue <= ((long) InterestSelectExperiment.INSTANCE.mo59608j()) * 1000) {
                int i = InterestSelectExperiment.monitorTimes + 1;
                InterestSelectExperiment.monitorTimes = i;
                if (i >= InterestSelectExperiment.INSTANCE.mo59609k()) {
                    Activity g = C11016e.m22312g();
                    if (g instanceof C36663h) {
                        InterestSelectExperiment.m69600a((Context) g);
                        InterestSelectExperiment.v2NotRequest = false;
                        return;
                    }
                    C32458a.m75141a(4, InterestSelectExperiment.TAG, "not insert cause not IMainActivity");
                }
            } else {
                InterestSelectExperiment.monitorTimes = 0;
            }
        }
    }

    public C30786ba createUnReadSunRoofViewDelegate(FragmentActivity fragmentActivity, AbstractUnReadSunRoofView abstractUnReadSunRoofView, AbstractUnReadSunRoofTouchEventFrameLayout abstractUnReadSunRoofTouchEventFrameLayout) {
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(abstractUnReadSunRoofView, "view");
        C52711k.m112240b(abstractUnReadSunRoofTouchEventFrameLayout, "touchLayout");
        return new UnReadSunRoofViewDelegate(fragmentActivity, abstractUnReadSunRoofView, abstractUnReadSunRoofTouchEventFrameLayout);
    }

    public void commitFeedRequest(int i, C9381g gVar, Callable callable, int i2, boolean z) {
        C30436k.m71362a(i, gVar, callable, i2, z);
    }
}
