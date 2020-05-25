package com.p683ss.android.ugc.aweme.poi.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.aq */
public final class C39111aq implements Serializable {
    @C17952c(mo34828a = "schema_type")

    /* renamed from: a */
    private Integer f99773a;
    @C17952c(mo34828a = "url")

    /* renamed from: b */
    private String f99774b;
    @C17952c(mo34828a = "platform_source")

    /* renamed from: c */
    private Integer f99775c;
    @C17952c(mo34828a = "platform_name")

    /* renamed from: d */
    private String f99776d;

    public final Integer getSchemaType() {
        return this.f99773a;
    }

    public final Integer getSupplier() {
        return this.f99775c;
    }

    public final String getSupplierName() {
        return this.f99776d;
    }

    public final String getUrl() {
        return this.f99774b;
    }

    public final void setSchemaType(Integer num) {
        this.f99773a = num;
    }

    public final void setSupplier(Integer num) {
        this.f99775c = num;
    }

    public final void setSupplierName(String str) {
        this.f99776d = str;
    }

    public final void setUrl(String str) {
        this.f99774b = str;
    }

    public C39111aq(Integer num, String str, Integer num2, String str2) {
        this.f99773a = num;
        this.f99774b = str;
        this.f99775c = num2;
        this.f99776d = str2;
    }
}
