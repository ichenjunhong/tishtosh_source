package com.p683ss.android.ugc.aweme.p1807im.sdk.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35470g;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.model.XPlanAwemeBannerConfig */
public final class XPlanAwemeBannerConfig extends BaseResponse {
    @C17952c(mo34828a = "background_icon")
    private C35470g backgroundIcon;
    @C17952c(mo34828a = "body_text")
    private String bodyText = "";
    @C17952c(mo34828a = "logo_icon")
    private C35470g logoIcon;
    @C17952c(mo34828a = "open_schema")
    private String openSchema = "";
    @C17952c(mo34828a = "sub_head_list")
    private List<? extends UrlModel> subHeadList;

    public final C35470g getBackgroundIcon() {
        return this.backgroundIcon;
    }

    public final String getBodyText() {
        return this.bodyText;
    }

    public final C35470g getLogoIcon() {
        return this.logoIcon;
    }

    public final String getOpenSchema() {
        return this.openSchema;
    }

    public final List<UrlModel> getSubHeadList() {
        return this.subHeadList;
    }

    public final void setBackgroundIcon(C35470g gVar) {
        this.backgroundIcon = gVar;
    }

    public final void setLogoIcon(C35470g gVar) {
        this.logoIcon = gVar;
    }

    public final void setSubHeadList(List<? extends UrlModel> list) {
        this.subHeadList = list;
    }

    public final void setBodyText(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.bodyText = str;
    }

    public final void setOpenSchema(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.openSchema = str;
    }
}
