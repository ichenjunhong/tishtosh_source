package com.snapchat.kit.sdk.creative.models;

import com.snapchat.kit.sdk.creative.media.SnapPhotoFile;
import java.io.File;

public final class SnapPhotoContent extends SnapContent {

    /* renamed from: b */
    private SnapPhotoFile f50541b;

    public final String getDeeplinkUrlPath() {
        return "preview";
    }

    public final String getIntentType() {
        return "image/*";
    }

    public final File getMediaFile() {
        return this.f50541b.getPhotoFile();
    }

    public SnapPhotoContent(SnapPhotoFile snapPhotoFile) {
        this.f50541b = snapPhotoFile;
    }
}
