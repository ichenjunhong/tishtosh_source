package com.p683ss.android.ugc.gamora.editor.p2461c;

import android.arch.lifecycle.C0198r;
import com.p683ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import dmt.p2652av.video.VEVideoPublishEditViewModel;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.editor.c.a */
public final class C49339a {

    /* renamed from: a */
    public static final C49339a f123886a = new C49339a();

    private C49339a() {
    }

    /* renamed from: a */
    public static final void m106426a(float f, float f2, VideoPublishEditModel videoPublishEditModel, VEVideoPublishEditViewModel vEVideoPublishEditViewModel) {
        C52711k.m112240b(videoPublishEditModel, "videoPublishEditModel");
        C52711k.m112240b(vEVideoPublishEditViewModel, "publishEditViewModel");
        StitchParams stitchParams = videoPublishEditModel.stitchParams;
        if (stitchParams != null) {
            if (!stitchParams.isPGCMusic() || stitchParams.getMusicStart() < 0) {
                int duration = (int) stitchParams.getDuration();
                int i = (int) videoPublishEditModel.maxDuration;
                if (f2 != -1.0f) {
                    C0198r m = vEVideoPublishEditViewModel.mo110468m();
                    C52711k.m112236a((Object) m, "publishEditViewModel.volumeChangeOpLiveData");
                    m.setValue(VEVolumeChangeOp.ofVoice(f2, 0, duration, 1));
                }
                C0198r m2 = vEVideoPublishEditViewModel.mo110468m();
                C52711k.m112236a((Object) m2, "publishEditViewModel.volumeChangeOpLiveData");
                int i2 = duration + 100;
                m2.setValue(VEVolumeChangeOp.ofVoice(0.0f, duration, i2, 3));
                if (f != -1.0f) {
                    C0198r m3 = vEVideoPublishEditViewModel.mo110468m();
                    C52711k.m112236a((Object) m3, "publishEditViewModel.volumeChangeOpLiveData");
                    m3.setValue(VEVolumeChangeOp.ofVoice(f, i2, i, 2));
                }
            } else {
                if (f != -1.0f) {
                    C0198r m4 = vEVideoPublishEditViewModel.mo110468m();
                    C52711k.m112236a((Object) m4, "publishEditViewModel.volumeChangeOpLiveData");
                    m4.setValue(VEVolumeChangeOp.ofVoice(f));
                }
                if (f2 != -1.0f) {
                    C0198r m5 = vEVideoPublishEditViewModel.mo110468m();
                    C52711k.m112236a((Object) m5, "publishEditViewModel.volumeChangeOpLiveData");
                    m5.setValue(VEVolumeChangeOp.ofMusic(f2));
                }
            }
        }
    }
}
