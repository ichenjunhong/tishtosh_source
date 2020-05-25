package com.p683ss.android.ugc.aweme.poi.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.ap */
public final class C39110ap implements Serializable {
    @C17952c(mo34828a = "service_type")

    /* renamed from: a */
    private Integer f99771a;
    @C17952c(mo34828a = "icon")

    /* renamed from: b */
    private UrlModel f99772b;

    public final Integer getType() {
        return this.f99771a;
    }

    public final UrlModel getUrlModel() {
        return this.f99772b;
    }

    public final void setType(Integer num) {
        this.f99771a = num;
    }

    public final void setUrlModel(UrlModel urlModel) {
        this.f99772b = urlModel;
    }

    public C39110ap(Integer num, UrlModel urlModel) {
        this.f99771a = num;
        this.f99772b = urlModel;
    }
}
