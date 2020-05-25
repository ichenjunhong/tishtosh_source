package com.p683ss.android.ugc.aweme.services.external.p2130ui;

import android.os.Bundle;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.VideoMedia */
public final class VideoMedia implements MediaInfo {
    private Bundle extraBundle;
    private final String filePath;

    public final Bundle getExtraBundle() {
        return this.extraBundle;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final void setExtraBundle(Bundle bundle) {
        this.extraBundle = bundle;
    }

    public VideoMedia(String str) {
        C52711k.m112240b(str, "filePath");
        this.filePath = str;
    }
}
