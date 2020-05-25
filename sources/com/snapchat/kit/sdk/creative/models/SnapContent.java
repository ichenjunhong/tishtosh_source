package com.snapchat.kit.sdk.creative.models;

import com.snapchat.kit.sdk.creative.media.SnapSticker;
import java.io.File;

public abstract class SnapContent {

    /* renamed from: a */
    protected SnapSticker f50538a;

    /* renamed from: b */
    private String f50539b;

    /* renamed from: c */
    private String f50540c;

    public String getAttachmentUrl() {
        return this.f50539b;
    }

    public String getCaptionText() {
        return this.f50540c;
    }

    public abstract String getDeeplinkUrlPath();

    public abstract String getIntentType();

    public abstract File getMediaFile();

    public SnapSticker getSnapSticker() {
        return this.f50538a;
    }

    public void setAttachmentUrl(String str) {
        this.f50539b = str;
    }

    public void setCaptionText(String str) {
        this.f50540c = str;
    }

    public void setSnapSticker(SnapSticker snapSticker) {
        this.f50538a = snapSticker;
    }
}
