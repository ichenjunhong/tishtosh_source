package com.p683ss.android.ugc.aweme.setting;

import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import java.io.File;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.ae */
public final class C41524ae extends C41607g {
    /* renamed from: c */
    public final File mo23791c() {
        IIMService d = C33194e.m76279d();
        C52711k.m112236a((Object) d, "IM.get()");
        File audioDownloadCachePath = d.getAudioDownloadCachePath();
        C52711k.m112236a((Object) audioDownloadCachePath, "IM.get().audioDownloadCachePath");
        return audioDownloadCachePath;
    }
}
