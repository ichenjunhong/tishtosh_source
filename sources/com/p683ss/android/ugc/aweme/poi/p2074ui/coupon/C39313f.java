package com.p683ss.android.ugc.aweme.poi.p2074ui.coupon;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.p2060c.C39051a;
import com.p683ss.android.ugc.aweme.poi.p2060c.C39051a.C39052a;
import com.p683ss.android.ugc.aweme.poi.utils.C39443d;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.f */
final /* synthetic */ class C39313f implements OnClickListener {

    /* renamed from: a */
    private final PoiAdLayout f100496a;

    /* renamed from: b */
    private final C39067g f100497b;

    /* renamed from: c */
    private final String f100498c;

    /* renamed from: d */
    private final AwemeRawAd f100499d;

    C39313f(PoiAdLayout poiAdLayout, C39067g gVar, String str, AwemeRawAd awemeRawAd) {
        this.f100496a = poiAdLayout;
        this.f100497b = gVar;
        this.f100498c = str;
        this.f100499d = awemeRawAd;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        PoiAdLayout poiAdLayout = this.f100496a;
        C39067g gVar = this.f100497b;
        String str = this.f100498c;
        AwemeRawAd awemeRawAd = this.f100499d;
        C39051a a = new C39052a().mo79210b(gVar.getPoiId()).mo79208a("poi_page").mo79213e(gVar.getPreviousPage()).mo79217i(str).mo79214f("click_button").mo79209a();
        C52711k.m112240b(a, "params");
        C23089d a2 = C23089d.m56640a();
        if (!TextUtils.isEmpty(a.f99551b)) {
            a2.mo47829a("poi_id", a.f99551b);
        }
        if (!TextUtils.isEmpty(a.f99550a)) {
            a2.mo47829a("enter_from", a.f99550a);
        }
        if (!TextUtils.isEmpty(a.f99555f)) {
            a2.mo47829a("enter_method", a.f99555f);
        }
        if (!TextUtils.isEmpty(a.f99559j)) {
            a2.mo47829a("content_type", a.f99559j);
        }
        if (!TextUtils.isEmpty(a.f99554e)) {
            a2.mo47829a("previous_page", a.f99554e);
        }
        a2.mo47829a("city_info", C23198ae.m56845a());
        a2.mo47829a("poi_channel", C23198ae.f61671a);
        C39452l.m87729a(a, "click_ctrip_reserve_button", a2);
        C39443d.m87702a(poiAdLayout.getContext(), C23324d.m57378a().getRawAdAwemeById(gVar.getAwemeId()), "reserve", gVar.getPoiId());
        if (!C39443d.m87705a(poiAdLayout.getContext(), awemeRawAd.getOpenUrl(), false)) {
            if (C39443d.m87704a(poiAdLayout.getContext(), awemeRawAd.getWebUrl(), awemeRawAd.getWebTitle()) && TextUtils.isEmpty(gVar.getAwemeId())) {
                C39443d.m87707b(poiAdLayout.getContext(), awemeRawAd, gVar.getPoiId());
                C39443d.m87710d(poiAdLayout.getContext(), awemeRawAd, gVar.getPoiId());
            }
        } else if (TextUtils.isEmpty(gVar.getAwemeId())) {
            C39443d.m87707b(poiAdLayout.getContext(), awemeRawAd, gVar.getPoiId());
            C39443d.m87709c(poiAdLayout.getContext(), awemeRawAd, gVar.getPoiId());
        }
    }
}
