package com.p683ss.android.ugc.aweme.services.external.p2130ui;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.XSConfig */
public final class XSConfig implements Serializable {
    private String city;
    private String enterFrom;
    private Boolean fromClick;

    public final String getCity() {
        return this.city;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final Boolean getFromClick() {
        return this.fromClick;
    }

    public final void setCity(String str) {
        this.city = str;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setFromClick(Boolean bool) {
        this.fromClick = bool;
    }
}
