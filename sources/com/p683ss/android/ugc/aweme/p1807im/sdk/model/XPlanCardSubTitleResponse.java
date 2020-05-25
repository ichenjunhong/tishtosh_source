package com.p683ss.android.ugc.aweme.p1807im.sdk.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.model.XPlanCardSubTitleResponse */
public class XPlanCardSubTitleResponse extends BaseResponse {
    @C17952c(mo34828a = "subtitle")
    String subtitle;
    @C17952c(mo34828a = "sub_head_list")
    List<UrlModel> urlModels;

    public String getSubTitle() {
        return this.subtitle;
    }

    public List<UrlModel> getUrlModels() {
        return this.urlModels;
    }
}
