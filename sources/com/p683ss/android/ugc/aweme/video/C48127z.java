package com.p683ss.android.ugc.aweme.video;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.video.experiment.PreloadProcessDataExperiment;
import com.p683ss.android.ugc.playerkit.p2492a.C50104d;
import com.p683ss.android.ugc.playerkit.p2494c.C50121j;

/* renamed from: com.ss.android.ugc.aweme.video.z */
final /* synthetic */ class C48127z implements C50104d {

    /* renamed from: a */
    private final C48121w f120963a;

    /* renamed from: b */
    private final boolean f120964b;

    /* renamed from: c */
    private final VideoUrlModel f120965c;

    C48127z(C48121w wVar, boolean z, VideoUrlModel videoUrlModel) {
        this.f120963a = wVar;
        this.f120964b = z;
        this.f120965c = videoUrlModel;
    }

    /* renamed from: a */
    public final Object mo95137a() {
        C48121w wVar = this.f120963a;
        boolean z = this.f120964b;
        VideoUrlModel videoUrlModel = this.f120965c;
        if (!z && C10181b.m20511a().mo18172a(PreloadProcessDataExperiment.class, true, "is_preload_process_data", 31744, false)) {
            C50121j jVar = null;
            if (wVar.f120942e != null) {
                jVar = (C50121j) wVar.f120942e.mo33771a(videoUrlModel);
            }
            if (jVar != null) {
                return jVar;
            }
        }
        return wVar.mo95445b(videoUrlModel, z);
    }
}
