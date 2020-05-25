package com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2310b.p2311a;

import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45890d;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2310b.C46312b;
import java.util.Map;
import p2628d.C52856t;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.b.a.b */
public final class C46309b implements C46312b {

    /* renamed from: a */
    private final ShortVideoContext f116844a;

    public C46309b(ShortVideoContext shortVideoContext) {
        C52711k.m112240b(shortVideoContext, "shortVideoContext");
        this.f116844a = shortVideoContext;
    }

    /* renamed from: a */
    public final void mo93039a(String str) {
        C52711k.m112240b(str, "effectId");
        C45890d.m99781a("show_toast", (Map<String, String>) C52550ab.m112057c(C52856t.m112465a("toast_type", "prop"), C52856t.m112465a("prop_id", str), C52856t.m112465a("enter_from", "video_shoot_page")));
    }

    /* renamed from: b */
    public final void mo93041b(String str, String str2) {
        C52711k.m112240b(str, "effectId");
        C52711k.m112240b(str2, "carrierType");
        C45890d.m99781a("click_transform_link", (Map<String, String>) C52550ab.m112057c(C52856t.m112465a("prop_id", str), C52856t.m112465a("shoot_way", this.f116844a.f107132y), C52856t.m112465a("carrier_type", str2)));
    }

    /* renamed from: a */
    public final void mo93040a(String str, String str2) {
        C52711k.m112240b(str, "effectId");
        C52711k.m112240b(str2, "carrierType");
        C45890d.m99781a("show_transform_link", (Map<String, String>) C52550ab.m112057c(C52856t.m112465a("prop_id", str), C52856t.m112465a("shoot_way", this.f116844a.f107132y), C52856t.m112465a("carrier_type", str2)));
    }
}
