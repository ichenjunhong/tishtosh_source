package com.p683ss.android.ugc.aweme.poi.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.aa */
public final class C39095aa implements Serializable {
    @C17952c(mo34828a = "service_type")

    /* renamed from: a */
    private Integer f99723a;
    @C17952c(mo34828a = "uni_service_type")

    /* renamed from: b */
    private Integer f99724b;
    @C17952c(mo34828a = "service_name")

    /* renamed from: c */
    private String f99725c;
    @C17952c(mo34828a = "icon")

    /* renamed from: d */
    private UrlModel f99726d;
    @C17952c(mo34828a = "service_entry")

    /* renamed from: e */
    private List<C39111aq> f99727e;

    public static /* synthetic */ void serviceType$annotations() {
    }

    public final String getServiceName() {
        return this.f99725c;
    }

    public final Integer getServiceType() {
        return this.f99723a;
    }

    public final List<C39111aq> getSuppliers() {
        return this.f99727e;
    }

    public final Integer getUniformServiceType() {
        return this.f99724b;
    }

    public final UrlModel getUrlModel() {
        return this.f99726d;
    }

    public final void setServiceName(String str) {
        this.f99725c = str;
    }

    public final void setServiceType(Integer num) {
        this.f99723a = num;
    }

    public final void setSuppliers(List<C39111aq> list) {
        this.f99727e = list;
    }

    public final void setUniformServiceType(Integer num) {
        this.f99724b = num;
    }

    public final void setUrlModel(UrlModel urlModel) {
        this.f99726d = urlModel;
    }

    public C39095aa(Integer num, Integer num2, String str, UrlModel urlModel, List<C39111aq> list) {
        this.f99723a = num;
        this.f99724b = num2;
        this.f99725c = str;
        this.f99726d = urlModel;
        this.f99727e = list;
    }
}
