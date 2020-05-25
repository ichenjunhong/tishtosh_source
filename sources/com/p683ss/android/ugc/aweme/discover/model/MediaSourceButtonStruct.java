package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.MediaSourceButtonStruct */
public final class MediaSourceButtonStruct implements Serializable {
    @C17952c(mo34828a = "aid")
    private String aid;
    @C17952c(mo34828a = "button_type")
    private int buttonType = 1;
    @C17952c(mo34828a = "eid")
    private String eid;
    @C17952c(mo34828a = "icon")
    private final UrlModel icon;
    @C17952c(mo34828a = "has_perchase_url")
    private boolean isBuy;
    @C17952c(mo34828a = "name")
    private final String name = "";
    @C17952c(mo34828a = "schema")
    private String schema = "";

    public final String getAid() {
        return this.aid;
    }

    public final int getButtonType() {
        return this.buttonType;
    }

    public final String getEid() {
        return this.eid;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final boolean isBuy() {
        return this.isBuy;
    }

    public final boolean isOrigin() {
        if (this.buttonType == 1) {
            return true;
        }
        return false;
    }

    public final boolean isMiniApp() {
        if (this.buttonType == 2) {
            return true;
        }
        return false;
    }

    public final boolean isMix() {
        if (this.buttonType == 3) {
            return true;
        }
        return false;
    }

    public final void setAid(String str) {
        this.aid = str;
    }

    public final void setButtonType(int i) {
        this.buttonType = i;
    }

    public final void setBuy(boolean z) {
        this.isBuy = z;
    }

    public final void setEid(String str) {
        this.eid = str;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }
}
