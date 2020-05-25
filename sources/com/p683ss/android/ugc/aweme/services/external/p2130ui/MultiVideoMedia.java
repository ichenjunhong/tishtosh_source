package com.p683ss.android.ugc.aweme.services.external.p2130ui;

import android.os.Bundle;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.MultiVideoMedia */
public final class MultiVideoMedia implements MediaInfo {
    private Bundle extraBundle;
    private final ArrayList<MediaModel> videoMedias;

    public final Bundle getExtraBundle() {
        return this.extraBundle;
    }

    public final ArrayList<MediaModel> getVideoMedias() {
        return this.videoMedias;
    }

    public final void setExtraBundle(Bundle bundle) {
        this.extraBundle = bundle;
    }

    public MultiVideoMedia(ArrayList<MediaModel> arrayList) {
        C52711k.m112240b(arrayList, "videoMedias");
        this.videoMedias = arrayList;
    }
}
