package com.p683ss.android.ugc.aweme.p1807im.sdk.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35470g;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.model.c */
public final class C34546c {
    @C17952c(mo34828a = "body_text")

    /* renamed from: a */
    public String f89058a = "";
    @C17952c(mo34828a = "open_schema")

    /* renamed from: b */
    public String f89059b = "";
    @C17952c(mo34828a = "background_icon")

    /* renamed from: c */
    public C35470g f89060c;
    @C17952c(mo34828a = "logo_icon")

    /* renamed from: d */
    public C35470g f89061d;
    @C17952c(mo34828a = "extra_icon_1")

    /* renamed from: e */
    public C35470g f89062e;
    @C17952c(mo34828a = "sub_head_list")

    /* renamed from: f */
    public List<UrlModel> f89063f;
    @C17952c(mo34828a = "new_user_discard_days")

    /* renamed from: g */
    public int f89064g;
    @C17952c(mo34828a = "past_user_discard_days")

    /* renamed from: h */
    public int f89065h;
    @C17952c(mo34828a = "hit_interactive_ploter")

    /* renamed from: i */
    public boolean f89066i;
    @C17952c(mo34828a = "button_text")

    /* renamed from: j */
    public String f89067j;
    @C17952c(mo34828a = "extra_str_1")

    /* renamed from: k */
    public String f89068k;

    /* renamed from: a */
    public static C34546c m78481a(XPlanAwemeBannerConfig xPlanAwemeBannerConfig) {
        C34546c cVar = new C34546c();
        cVar.f89060c = xPlanAwemeBannerConfig.getBackgroundIcon();
        cVar.f89061d = xPlanAwemeBannerConfig.getLogoIcon();
        cVar.f89058a = xPlanAwemeBannerConfig.getBodyText();
        cVar.f89059b = xPlanAwemeBannerConfig.getOpenSchema();
        cVar.f89063f = xPlanAwemeBannerConfig.getSubHeadList();
        return cVar;
    }
}
