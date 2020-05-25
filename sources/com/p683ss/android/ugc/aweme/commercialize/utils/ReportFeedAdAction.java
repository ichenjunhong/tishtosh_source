package com.p683ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ReportFeedAdAction */
public final class ReportFeedAdAction {

    /* renamed from: a */
    public static final ReportFeedAdAction f69464a = new ReportFeedAdAction();

    /* renamed from: b */
    private static final RetrofitApi f69465b = ((RetrofitApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19925a().mo19930a(RetrofitApi.class));

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ReportFeedAdAction$RetrofitApi */
    public interface RetrofitApi {
        @C53084o(mo110612a = "/api/ad/v1/ack_action/")
        @C53074e
        C0013i<Object> reportAction(@C53072c(mo110600a = "item_id") String str, @C53072c(mo110600a = "ad_id") long j, @C53072c(mo110600a = "creative_id") long j2, @C53072c(mo110600a = "log_extra") String str2, @C53072c(mo110600a = "action_extra") String str3, @C53072c(mo110600a = "action_type") int i);
    }

    private ReportFeedAdAction() {
    }

    /* renamed from: a */
    public static boolean m63707a(Aweme aweme, String str) {
        C52711k.m112240b(str, "enterFrom");
        return false;
    }

    /* renamed from: a */
    public final void mo54011a(Aweme aweme, int i, String str) {
        if (str == null) {
            str = "";
        }
        m63707a(aweme, str);
    }
}
