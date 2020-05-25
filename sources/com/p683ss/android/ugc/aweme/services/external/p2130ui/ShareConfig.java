package com.p683ss.android.ugc.aweme.services.external.p2130ui;

import com.p683ss.android.ugc.aweme.common.C26916m;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.ShareConfig */
public final class ShareConfig {
    private String appName;
    private String file;
    private List<String> imageList;
    private final C26916m shareContext;
    private final int type;
    private List<String> videoList;

    public final String getAppName() {
        return this.appName;
    }

    public final String getFile() {
        return this.file;
    }

    public final List<String> getImageList() {
        return this.imageList;
    }

    public final C26916m getShareContext() {
        return this.shareContext;
    }

    public final int getType() {
        return this.type;
    }

    public final List<String> getVideoList() {
        return this.videoList;
    }

    public final void setAppName(String str) {
        this.appName = str;
    }

    public final void setFile(String str) {
        this.file = str;
    }

    public final void setImageList(List<String> list) {
        this.imageList = list;
    }

    public final void setVideoList(List<String> list) {
        this.videoList = list;
    }

    public ShareConfig(C26916m mVar, int i) {
        C52711k.m112240b(mVar, "shareContext");
        this.shareContext = mVar;
        this.type = i;
    }
}
