package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.Commodity */
public final class Commodity implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 42;
    @C17952c(mo34828a = "commodity_type")
    private int commodityType;
    @C17952c(mo34828a = "gid")
    private String gid = "";
    @C17952c(mo34828a = "img")
    private String image;
    private boolean isReportShow;
    private LogPbBean logPb;
    @C17952c(mo34828a = "name")
    private String name = "";
    @C17952c(mo34828a = "platform_name")
    private String platformName = "";
    @C17952c(mo34828a = "show_price")
    private long price;
    @C17952c(mo34828a = "schema")
    private String schema = "";
    @C17952c(mo34828a = "schema_type")
    private long schemaType;

    /* renamed from: com.ss.android.ugc.aweme.discover.model.Commodity$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    public final int getCommodityType() {
        return this.commodityType;
    }

    public final String getGid() {
        return this.gid;
    }

    public final String getImage() {
        return this.image;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPlatformName() {
        return this.platformName;
    }

    public final long getPrice() {
        return this.price;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final long getSchemaType() {
        return this.schemaType;
    }

    public final boolean isReportShow() {
        return this.isReportShow;
    }

    public final int hashCode() {
        return this.gid.hashCode();
    }

    public final boolean isMiniApp() {
        if (this.schemaType == 1) {
            return true;
        }
        return false;
    }

    public final boolean isPreview() {
        if (this.schemaType == 2) {
            return true;
        }
        return false;
    }

    public final void setCommodityType(int i) {
        this.commodityType = i;
    }

    public final void setImage(String str) {
        this.image = str;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setPrice(long j) {
        this.price = j;
    }

    public final void setReportShow(boolean z) {
        this.isReportShow = z;
    }

    public final void setSchemaType(long j) {
        this.schemaType = j;
    }

    public final void setGid(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.gid = str;
    }

    public final void setName(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.name = str;
    }

    public final void setPlatformName(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.platformName = str;
    }

    public final void setSchema(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.schema = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Commodity)) {
            return false;
        }
        return C52711k.m112239a((Object) this.gid, (Object) ((Commodity) obj).gid);
    }
}
