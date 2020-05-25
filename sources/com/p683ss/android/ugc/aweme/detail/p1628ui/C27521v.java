package com.p683ss.android.ugc.aweme.detail.p1628ui;

import android.arch.lifecycle.C0199s;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p669e.C10703a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.feed.C29988ad;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30342k;
import com.p683ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p683ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p683ss.android.ugc.aweme.main.C36672p;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23249s;
import com.p683ss.android.ugc.aweme.p1436bi.C23827a.C23828a;
import com.p683ss.android.ugc.aweme.profile.C40733z;
import com.p683ss.android.ugc.aweme.share.model.C42207a;
import com.p683ss.android.ugc.aweme.share.model.C42208b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.video.C48039k;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.playerkit.videoview.C50130a;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.v */
final /* synthetic */ class C27521v implements C0199s {

    /* renamed from: a */
    private final C27514r f72360a;

    /* renamed from: b */
    private final ScrollSwitchStateManager f72361b;

    /* renamed from: c */
    private final HomePageDataViewModel f72362c;

    C27521v(C27514r rVar, ScrollSwitchStateManager scrollSwitchStateManager, HomePageDataViewModel homePageDataViewModel) {
        this.f72360a = rVar;
        this.f72361b = scrollSwitchStateManager;
        this.f72362c = homePageDataViewModel;
    }

    public final void onChanged(Object obj) {
        C27514r rVar = this.f72360a;
        ScrollSwitchStateManager scrollSwitchStateManager = this.f72361b;
        HomePageDataViewModel homePageDataViewModel = this.f72362c;
        Integer num = (Integer) obj;
        rVar.f72335j.mo55796b(num.intValue());
        String a = scrollSwitchStateManager.mo69853a(num.intValue());
        C40733z.f103767a.preloadProfile(rVar.getActivity(), a);
        C47718bf.m103288a(new C42208b(scrollSwitchStateManager.mo69868b("page_feed")));
        if (num.intValue() == 1) {
            C47718bf.m103288a(new C42207a());
        }
        int i = rVar.f72339n;
        rVar.f72339n = num.intValue();
        if (TextUtils.isEmpty(C23828a.f63481e)) {
            C23828a.f63478b = a;
        }
        if (!TextUtils.equals(a, "page_feed")) {
            C22574a.m55738f().mo46914a();
            C22574a.m55738f().mo46919b();
        }
        if (!TextUtils.equals(a, "page_feed")) {
            if (!C48121w.m104087I()) {
                C48121w.m104249M().mo95293z();
            } else {
                C50130a.m108170a().mo60215af();
            }
            C48039k.m104036a().mo95304b();
        }
        scrollSwitchStateManager.mo69853a(i);
        char c = 65535;
        int hashCode = a.hashCode();
        if (hashCode != 185242617) {
            if (hashCode == 883457358 && a.equals("page_feed")) {
                c = 0;
            }
        } else if (a.equals("page_profile")) {
            c = 1;
        }
        switch (c) {
            case 0:
                C10703a.m21575a(true);
                return;
            case 1:
                C47718bf.m103288a(new C30342k());
                if (rVar.mo55944k() != null) {
                    String a2 = homePageDataViewModel.mo69848a();
                    if (a2 == null) {
                        a2 = "";
                    }
                    C26898j jVar = new C26898j();
                    jVar.mo54849a("enter_from", a2);
                    if (!homePageDataViewModel.f85657k) {
                        C26890h.m65008a(rVar.getContext(), "slide_left", "left", rVar.mo55945l(), rVar.mo55944k() == null ? "" : rVar.mo55944k().getAid(), jVar.mo54850a());
                        ((C23249s) ((C23249s) ((C23249s) new C23249s().mo48137c(a2).mo47941a("slide_left")).mo48140e(C36672p.m82599b(rVar)).mo48141f(C36672p.m82600c(rVar)).mo48138d(C36672p.m82598a(rVar)).mo48136c(rVar.mo55944k(), 0).mo48144s(rVar.mo55945l()).mo48145t(homePageDataViewModel.f85655i).mo48107r(FeedParamProvider.m71941a(rVar.getContext()).getSearchId())).mo47940a(rVar.getContext())).mo48076e();
                    }
                    if (TextUtils.equals(a2, "follow_card_push_publish")) {
                        C26890h.m65011a("follow_card", C23089d.m56640a().mo47829a("enter_from", a2).mo47829a("event_type", "enter_profile").mo47829a("rec_uid", C23198ae.m56887w(rVar.mo55944k())).mo47829a("req_id", homePageDataViewModel.f85655i).mo47829a("card_type", "item").mo47826a("impr_order", 0).f61491a);
                    }
                    jVar.mo54849a("group_id", rVar.mo55944k() == null ? "" : rVar.mo55944k().getAid());
                    jVar.mo54849a("enter_method", "slide_left");
                    jVar.mo54849a("request_id", homePageDataViewModel.f85655i);
                    jVar.mo54849a("enter_type", "normal_way");
                    if (!TextUtils.isEmpty(C23198ae.m56861e(rVar.mo55944k()))) {
                        jVar.mo54849a("poi_id", C23198ae.m56861e(rVar.mo55944k()));
                    }
                    if (C23198ae.m56858c(homePageDataViewModel.mo69848a())) {
                        jVar.mo54849a("city_info", C23198ae.m56845a());
                        jVar.mo54849a("distance_info", C23198ae.m56869i(rVar.mo55944k()));
                        jVar.mo54849a("poi_type", C23198ae.m56867h(rVar.mo55944k()));
                        jVar.mo54849a("poi_channel", C23198ae.m56852b());
                    }
                    C26890h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(rVar.mo55944k() == null ? "" : rVar.mo55944k().getAuthor().getUid()).setJsonObject(jVar.mo54850a()));
                    rVar.mo55944k();
                }
                C30578o.m71566a(C29988ad.PROFILE);
                homePageDataViewModel.f85657k = false;
                C10703a.m21575a(false);
                break;
        }
    }
}
