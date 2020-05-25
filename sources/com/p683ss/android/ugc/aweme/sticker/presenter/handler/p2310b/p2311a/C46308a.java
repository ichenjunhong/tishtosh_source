package com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2310b.p2311a;

import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45890d;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2310b.C46307a;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.b.a.a */
public final class C46308a implements C46307a {

    /* renamed from: a */
    private final ShortVideoContext f116843a;

    public C46308a(ShortVideoContext shortVideoContext) {
        C52711k.m112240b(shortVideoContext, "shortVideoContext");
        this.f116843a = shortVideoContext;
    }

    /* renamed from: a */
    public final void mo93037a(Effect effect, String str, String str2, String str3) {
        C52711k.m112240b(effect, "effect");
        C52711k.m112240b(str, "videoSource");
        C52711k.m112240b(str3, "clickContent");
        String str4 = "prop_customized_click";
        ShortVideoContext shortVideoContext = this.f116843a;
        C52847n[] nVarArr = new C52847n[4];
        nVarArr[0] = C52856t.m112465a("video_source", str);
        String str5 = "tab_name";
        if (str2 == null) {
            str2 = "";
        }
        nVarArr[1] = C52856t.m112465a(str5, str2);
        nVarArr[2] = C52856t.m112465a("prop_id", effect.getEffectId());
        nVarArr[3] = C52856t.m112465a("click_content", str3);
        C45890d.m99781a(str4, (Map<String, String>) C45890d.m99780a(shortVideoContext, (C52847n<String, String>[]) nVarArr));
    }

    /* renamed from: b */
    public final void mo93038b(Effect effect, String str, String str2, String str3) {
        C52711k.m112240b(effect, "effect");
        C52711k.m112240b(str, "videoSource");
        C52711k.m112240b(str3, "clickContent");
        String str4 = "prop_customized_complete";
        ShortVideoContext shortVideoContext = this.f116843a;
        C52847n[] nVarArr = new C52847n[4];
        nVarArr[0] = C52856t.m112465a("video_source", str);
        String str5 = "tab_name";
        if (str2 == null) {
            str2 = "";
        }
        nVarArr[1] = C52856t.m112465a(str5, str2);
        nVarArr[2] = C52856t.m112465a("prop_id", effect.getEffectId());
        nVarArr[3] = C52856t.m112465a("click_content", str3);
        C45890d.m99781a(str4, (Map<String, String>) C45890d.m99780a(shortVideoContext, (C52847n<String, String>[]) nVarArr));
    }
}
