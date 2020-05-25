package com.p683ss.android.ugc.aweme.services.external.p2130ui;

import com.p683ss.android.ugc.aweme.shortvideo.edit.C43758o;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.MiniAppConfig */
public final class MiniAppConfig implements Serializable {
    private Serializable appClass;
    private C43758o appInfo;
    private String stickerId;

    public final Serializable getAppClass() {
        return this.appClass;
    }

    public final C43758o getAppInfo() {
        return this.appInfo;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final void setAppClass(Serializable serializable) {
        this.appClass = serializable;
    }

    public final void setAppInfo(C43758o oVar) {
        this.appInfo = oVar;
    }

    public final void setStickerId(String str) {
        this.stickerId = str;
    }
}
