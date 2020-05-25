package com.p683ss.android.ugc.aweme.music.presenter;

import android.os.CountDownTimer;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.experiment.RemoveMusic15sCapExperiment;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.p2425e.p2426a.C48549d;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.r */
final /* synthetic */ class C37423r implements C48549d {

    /* renamed from: a */
    private final C37419p f95453a;

    C37423r(C37419p pVar) {
        this.f95453a = pVar;
    }

    /* renamed from: a */
    public final void mo50923a(int i, int i2) {
        C37419p pVar = this.f95453a;
        MusicModel musicModel = pVar.f95434a;
        if (C10181b.m20511a().mo18172a(RemoveMusic15sCapExperiment.class, true, "remove_15s_cap_music", 31744, true)) {
            if (pVar.f95440i != null) {
                pVar.f95440i.cancel();
            }
            if (musicModel.getDuration() != musicModel.getAuditionDuration().intValue()) {
                long realAuditionDuration = (long) musicModel.getRealAuditionDuration();
                if (realAuditionDuration <= 0) {
                    StringBuilder sb = new StringBuilder("MusicDetailFragment: audition_duration is zero, music id: ");
                    sb.append(musicModel.getMusicId());
                    C47625i.m103103a(sb.toString());
                } else {
                    C374212 r0 = new CountDownTimer(realAuditionDuration, 1000) {
                        public final void onTick(long j) {
                        }

                        public final void onFinish() {
                            C37419p.this.mo76922f();
                        }
                    };
                    pVar.f95440i = r0;
                    pVar.f95440i.start();
                }
            }
        }
        if (!pVar.f95444m) {
            pVar.f95439h.mo96057b();
        }
        if (pVar.f95434a != null) {
            C26890h.m65011a("play_music", C23089d.m56640a().mo47829a("music_id", pVar.f95434a.getMusicId()).mo47829a("enter_from", "single_song").mo47829a("process_id", pVar.f95446o).mo47829a("enter_method", "click_play_music").f61491a);
        }
    }
}
