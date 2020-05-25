package com.p683ss.android.ugc.aweme.poi.p2060c;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.c.b */
public final class C39053b {

    /* renamed from: a */
    public static final C39053b f99594a = new C39053b();

    private C39053b() {
    }

    /* renamed from: c */
    public static final void m86892c(C39051a aVar) {
        C52711k.m112240b(aVar, "params");
        C23089d a = C23089d.m56640a();
        if (!TextUtils.isEmpty(aVar.f99551b)) {
            a.mo47829a("poi_id", aVar.f99551b);
        }
        if (!TextUtils.isEmpty(aVar.f99550a)) {
            a.mo47829a("enter_from", aVar.f99550a);
        }
        if (!TextUtils.isEmpty(aVar.f99555f)) {
            a.mo47829a("enter_method", aVar.f99555f);
        }
        if (!TextUtils.isEmpty(aVar.f99559j)) {
            a.mo47829a("content_type", aVar.f99559j);
        }
        C39452l.m87729a(aVar, "show_ctrip_reserve_button", a);
    }

    /* renamed from: a */
    public static final void m86888a(C39051a aVar) {
        C52711k.m112240b(aVar, "params");
        C23089d a = C23089d.m56640a();
        if (!TextUtils.isEmpty(aVar.f99551b)) {
            a.mo47829a("poi_id", aVar.f99551b);
        }
        if (!TextUtils.isEmpty(aVar.f99550a)) {
            a.mo47829a("enter_from", aVar.f99550a);
        }
        if (!TextUtils.isEmpty(aVar.f99552c)) {
            a.mo47829a("poi_type", aVar.f99552c);
        }
        if (!TextUtils.isEmpty(aVar.f99553d)) {
            a.mo47829a("group_id", aVar.f99553d);
        }
        if (!TextUtils.isEmpty(aVar.f99554e)) {
            a.mo47829a("previous_page", aVar.f99554e);
        }
        if (!TextUtils.isEmpty(aVar.f99555f)) {
            a.mo47829a("enter_method", aVar.f99555f);
        }
        if (!TextUtils.isEmpty(aVar.f99569t)) {
            a.mo47829a("anchor_id", aVar.f99569t);
        }
        if (!TextUtils.isEmpty(aVar.f99570u)) {
            a.mo47829a("room_id", aVar.f99570u);
        }
        if (!TextUtils.isEmpty(aVar.f99571v)) {
            a.mo47829a("page_type", aVar.f99571v);
        }
        C39452l.m87729a(aVar, "favourite_poi", a);
    }

    /* renamed from: b */
    public static final void m86891b(C39051a aVar) {
        C52711k.m112240b(aVar, "params");
        C23089d a = C23089d.m56640a();
        if (!TextUtils.isEmpty(aVar.f99551b)) {
            a.mo47829a("poi_id", aVar.f99551b);
        }
        if (!TextUtils.isEmpty(aVar.f99550a)) {
            a.mo47829a("enter_from", aVar.f99550a);
        }
        if (!TextUtils.isEmpty(aVar.f99552c)) {
            a.mo47829a("poi_type", aVar.f99552c);
        }
        if (!TextUtils.isEmpty(aVar.f99553d)) {
            a.mo47829a("group_id", aVar.f99553d);
        }
        if (!TextUtils.isEmpty(aVar.f99554e)) {
            a.mo47829a("previous_page", aVar.f99554e);
        }
        if (!TextUtils.isEmpty(aVar.f99555f)) {
            a.mo47829a("enter_method", aVar.f99555f);
        }
        if (!TextUtils.isEmpty(aVar.f99569t)) {
            a.mo47829a("anchor_id", aVar.f99569t);
        }
        if (!TextUtils.isEmpty(aVar.f99570u)) {
            a.mo47829a("room_id", aVar.f99570u);
        }
        if (!TextUtils.isEmpty(aVar.f99571v)) {
            a.mo47829a("page_type", aVar.f99571v);
        }
        C39452l.m87729a(aVar, "cancel_favourite_poi", a);
    }

    /* renamed from: d */
    public static final void m86893d(C39051a aVar) {
        C52711k.m112240b(aVar, "params");
        C23089d a = C23089d.m56640a();
        if (!TextUtils.isEmpty(aVar.f99551b)) {
            a.mo47829a("poi_id", aVar.f99551b);
        }
        if (!TextUtils.isEmpty(aVar.f99550a)) {
            a.mo47829a("enter_from", aVar.f99550a);
        }
        if (!TextUtils.isEmpty(aVar.f99556g)) {
            a.mo47829a("coupon_id", aVar.f99556g);
        }
        if (!TextUtils.isEmpty(aVar.f99557h)) {
            a.mo47829a("coupon_type", aVar.f99557h);
        }
        if (!TextUtils.isEmpty(aVar.f99555f)) {
            a.mo47829a("enter_method", aVar.f99555f);
        }
        if (!TextUtils.isEmpty(aVar.f99561l)) {
            a.mo47829a("source_type", aVar.f99561l);
        }
        if (!TextUtils.isEmpty(aVar.f99554e)) {
            a.mo47829a("previous_page", aVar.f99554e);
        }
        if (!TextUtils.isEmpty(aVar.f99569t)) {
            a.mo47829a("anchor_id", aVar.f99569t);
        }
        if (!TextUtils.isEmpty(aVar.f99570u)) {
            a.mo47829a("room_id", aVar.f99570u);
        }
        if (!TextUtils.isEmpty(aVar.f99571v)) {
            a.mo47829a("page_type", aVar.f99571v);
        }
        C39452l.m87729a(aVar, "click_coupon", a);
    }

    /* renamed from: a */
    public static final void m86889a(String str, String str2, String str3, String str4, C39067g gVar, String str5) {
        String str6;
        C23089d a = C23089d.m56640a().mo47829a("enter_from", str3);
        String str7 = "previous_page";
        String str8 = null;
        if (gVar != null) {
            str6 = gVar.getPreviousPage();
        } else {
            str6 = null;
        }
        C23089d a2 = a.mo47829a(str7, str6).mo47829a("enter_method", str);
        String str9 = "poi_id";
        if (gVar != null) {
            str8 = gVar.getPoiId();
        }
        C23089d a3 = a2.mo47829a(str9, str8).mo47829a("content_type", str2).mo47829a("poi_posititon", str4);
        if (str5 != null) {
            a3.mo47829a("supplier_id", str5);
        }
        C39452l.m87730a(gVar, "poi_puscene", a3);
    }
}
