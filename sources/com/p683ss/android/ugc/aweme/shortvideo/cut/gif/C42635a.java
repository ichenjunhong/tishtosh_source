package com.p683ss.android.ugc.aweme.shortvideo.cut.gif;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.mediaplayer.C36764i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.gif.a */
final /* synthetic */ class C42635a implements C0199s {

    /* renamed from: a */
    private final Video2GifCutFragment f107867a;

    C42635a(Video2GifCutFragment video2GifCutFragment) {
        this.f107867a = video2GifCutFragment;
    }

    public final void onChanged(Object obj) {
        Video2GifCutFragment video2GifCutFragment = this.f107867a;
        C36764i iVar = (C36764i) obj;
        if (iVar != null) {
            switch (iVar.f93950b) {
                case 1:
                    if (!iVar.f93949a) {
                        video2GifCutFragment.mo86900b();
                        return;
                    } else if (video2GifCutFragment.f107856e != null) {
                        video2GifCutFragment.f107856e.f106357d = (int) video2GifCutFragment.f107853b.f93929b.mo75885e();
                        return;
                    }
                    break;
                case 2:
                case 4:
                    video2GifCutFragment.ivPlay.setVisibility(8);
                    if (iVar.f93949a) {
                        video2GifCutFragment.f107857f.post(video2GifCutFragment.f107858g);
                        return;
                    }
                    break;
                case 3:
                case 5:
                    if (iVar.f93949a && !video2GifCutFragment.f107852a) {
                        video2GifCutFragment.f107857f.removeCallbacks(video2GifCutFragment.f107858g);
                        video2GifCutFragment.ivPlay.setVisibility(0);
                        return;
                    }
                case 6:
                    if (iVar.f93949a) {
                        video2GifCutFragment.ivPlay.setVisibility(8);
                        break;
                    }
                    break;
            }
        }
    }
}
