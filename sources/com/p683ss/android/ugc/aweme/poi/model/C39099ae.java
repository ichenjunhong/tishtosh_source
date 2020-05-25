package com.p683ss.android.ugc.aweme.poi.model;

import com.bytedance.common.utility.C9431p;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.ae */
public final class C39099ae implements Serializable {
    @C17952c(mo34828a = "app_url")
    public String app_url;
    @C17952c(mo34828a = "h5_url")
    public String h5_url;
    @C17952c(mo34828a = "icon")
    public UrlModel icon;
    @C17952c(mo34828a = "price")
    public double price;
    @C17952c(mo34828a = "provider")
    public String provider;
    @C17952c(mo34828a = "title")
    public String title;

    public final String getPrice() {
        return String.valueOf(Math.round(this.price));
    }

    public final boolean isValid() {
        if (!C9431p.m18664a(this.h5_url) || !C9431p.m18664a(this.app_url)) {
            return true;
        }
        return false;
    }
}
