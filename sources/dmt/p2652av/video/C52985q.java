package dmt.p2652av.video;

import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.vesdk.VEVideoEncodeSettings;

/* renamed from: dmt.av.video.q */
final /* synthetic */ class C52985q implements Runnable {

    /* renamed from: a */
    private final C52908ad f131415a;

    /* renamed from: b */
    private final VideoPublishEditModel f131416b;

    /* renamed from: c */
    private final VEVideoEncodeSettings f131417c;

    C52985q(C52908ad adVar, VideoPublishEditModel videoPublishEditModel, VEVideoEncodeSettings vEVideoEncodeSettings) {
        this.f131415a = adVar;
        this.f131416b = videoPublishEditModel;
        this.f131417c = vEVideoEncodeSettings;
    }

    public final void run() {
        C52908ad adVar = this.f131415a;
        VideoPublishEditModel videoPublishEditModel = this.f131416b;
        adVar.f131275u.mo43022a(videoPublishEditModel.getOutputFile(), (String) null, this.f131417c);
    }
}
