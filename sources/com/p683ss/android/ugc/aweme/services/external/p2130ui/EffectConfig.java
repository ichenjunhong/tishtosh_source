package com.p683ss.android.ugc.aweme.services.external.p2130ui;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.EffectConfig */
public final class EffectConfig implements Serializable {
    private String effectImage;
    private String effectMetaInfo;

    public final String getEffectImage() {
        return this.effectImage;
    }

    public final String getEffectMetaInfo() {
        return this.effectMetaInfo;
    }

    public final void setEffectImage(String str) {
        this.effectImage = str;
    }

    public final void setEffectMetaInfo(String str) {
        this.effectMetaInfo = str;
    }
}
