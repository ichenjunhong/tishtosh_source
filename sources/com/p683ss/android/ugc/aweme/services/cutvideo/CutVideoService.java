package com.p683ss.android.ugc.aweme.services.cutvideo;

import android.content.Context;
import com.p683ss.android.ugc.aweme.shortvideo.cut.p2179a.C42608a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.p2179a.C42621b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.cutvideo.CutVideoService */
public final class CutVideoService implements ICutVideoService {
    public final CutVideoView getCutVideoView(Context context) {
        C52711k.m112240b(context, "context");
        CutVideoView cutVideoView = new CutVideoView(context);
        cutVideoView.setProxy(new C42608a());
        return cutVideoView;
    }

    public final DisplayVideoView getDisplayVideoView(Context context) {
        C52711k.m112240b(context, "context");
        DisplayVideoView displayVideoView = new DisplayVideoView(context);
        displayVideoView.setProxy(new C42621b());
        return displayVideoView;
    }
}
