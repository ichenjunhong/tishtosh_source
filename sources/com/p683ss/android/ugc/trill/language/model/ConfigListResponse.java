package com.p683ss.android.ugc.trill.language.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41684a;
import java.util.List;

/* renamed from: com.ss.android.ugc.trill.language.model.ConfigListResponse */
public class ConfigListResponse extends BaseResponse {
    @C17952c(mo34828a = "content_languages")
    List<C41684a> contentLanguage;

    public List<C41684a> getContentLanguage() {
        return this.contentLanguage;
    }

    public void setContentLanguage(List<C41684a> list) {
        this.contentLanguage = list;
    }
}
