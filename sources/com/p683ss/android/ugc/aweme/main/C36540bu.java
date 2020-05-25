package com.p683ss.android.ugc.aweme.main;

import android.arch.lifecycle.C0199s;
import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.feed.C29988ad;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.feed.activity.GlobalAcViewModel;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30750af;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30753ai;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30928e;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30986f;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C31143x;
import com.p683ss.android.ugc.aweme.feed.p1736ui.FeedTimeLineFragment;
import com.p683ss.android.ugc.aweme.main.experiment.MainTabStripSwipeSwitchExperiment;

/* renamed from: com.ss.android.ugc.aweme.main.bu */
final /* synthetic */ class C36540bu implements C0199s {

    /* renamed from: a */
    private final MainFragment f93619a;

    C36540bu(MainFragment mainFragment) {
        this.f93619a = mainFragment;
    }

    public final void onChanged(Object obj) {
        MainFragment mainFragment = this.f93619a;
        Integer num = (Integer) obj;
        int i = mainFragment.f93442q.f85658l;
        mainFragment.f93442q.f85658l = num.intValue();
        if (MainTabStripSwipeSwitchExperiment.m82550a() && mainFragment.f93430a == 2) {
            C36605dw.m82473b(false);
            int intValue = num.intValue();
            Fragment b = mainFragment.mo75496b(i);
            if (b instanceof C30750af) {
                if (C36553cd.m82445a()) {
                    b.setUserVisibleHint(true);
                }
                ((C30750af) b).mo63329f(false);
                b.setUserVisibleHint(false);
            }
            Fragment b2 = mainFragment.mo75496b(intValue);
            if (b2 != null) {
                b2.setUserVisibleHint(true);
            }
            mainFragment.mo75492a(num.intValue(), 2);
        }
        C30750af afVar = null;
        if (MainTabStripSwipeSwitchExperiment.m82550a()) {
            Fragment b3 = mainFragment.mo75496b(num.intValue());
            if (b3 instanceof C30750af) {
                afVar = (C30750af) b3;
            }
        } else {
            Fragment a = mainFragment.f93436k.mo69929a();
            if (a instanceof C30750af) {
                afVar = (C30750af) a;
            }
        }
        if (afVar != null) {
            if (num.intValue() <= 1 && (afVar instanceof C30986f)) {
                afVar.mo63328e(false);
                if (num.intValue() == 0 && mainFragment.f93437l) {
                    afVar.mo59855d_(false);
                    mainFragment.f93437l = false;
                }
            } else if (num.intValue() == 2 || (afVar instanceof C30928e)) {
                afVar.mo63328e(false);
            }
            if (num.intValue() == 0 && (afVar instanceof C31143x)) {
                mainFragment.mo75513m();
                mainFragment.f93443r = false;
                if (mainFragment.mPagerTabStrip.mo69973f()) {
                    MainFragment.m82264a("follow_notice_dis", "yellow_dot");
                }
                C30578o.m71566a(C29988ad.FOLLOW);
            }
            mainFragment.f93445t = afVar instanceof C30753ai;
            GlobalAcViewModel.m70159a(mainFragment.requireActivity()).f78245d.setValue(Boolean.valueOf(mainFragment.f93445t));
            if (mainFragment.f93445t && mainFragment.f93446u == null) {
                mainFragment.f93446u = (C30753ai) afVar;
            }
            if (mainFragment.f93434e != null) {
                mainFragment.f93434e.setVisibility(mainFragment.f93445t && mainFragment.f93444s ? 0 : 4);
            }
            if (afVar instanceof C30986f) {
                ((C30986f) afVar).mo63455n();
            }
            if (afVar instanceof FeedTimeLineFragment) {
                mainFragment.mVTabBg.setVisibility(0);
            } else {
                mainFragment.mVTabBg.setVisibility(4);
            }
            if (mainFragment.f93445t) {
                C30578o.m71566a(C29988ad.FEED);
            }
        }
        mainFragment.f93430a = 1;
    }
}
