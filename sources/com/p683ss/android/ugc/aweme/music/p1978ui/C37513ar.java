package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.os.Build.VERSION;
import android.view.View;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;

/* renamed from: com.ss.android.ugc.aweme.music.ui.ar */
final /* synthetic */ class C37513ar implements Runnable {

    /* renamed from: a */
    private final MusicDetailFragment f95708a;

    C37513ar(MusicDetailFragment musicDetailFragment) {
        this.f95708a = musicDetailFragment;
    }

    public final void run() {
        MusicDetailFragment musicDetailFragment = this.f95708a;
        if (musicDetailFragment.getActivity() != null && !musicDetailFragment.getActivity().isFinishing() && musicDetailFragment.isViewValid()) {
            try {
                MusicCollectGuidePopupWindow musicCollectGuidePopupWindow = musicDetailFragment.f95550d;
                View view = musicDetailFragment.mMusicCollectLayout;
                if (view != null) {
                    if (VERSION.SDK_INT >= 19) {
                        musicCollectGuidePopupWindow.showAsDropDown(view, (view.getWidth() - musicCollectGuidePopupWindow.f95512b) / 2, -(view.getHeight() + musicCollectGuidePopupWindow.f95513c), 51);
                    } else {
                        musicCollectGuidePopupWindow.showAsDropDown(view, (view.getWidth() - musicCollectGuidePopupWindow.f95512b) / 2, -(view.getHeight() + musicCollectGuidePopupWindow.f95513c));
                    }
                    musicCollectGuidePopupWindow.getContentView().removeCallbacks(musicCollectGuidePopupWindow.f95511a);
                    musicCollectGuidePopupWindow.getContentView().postDelayed(musicCollectGuidePopupWindow.f95511a, 5000);
                }
            } catch (Exception e) {
                C32458a.m75143a(e);
            }
        }
    }
}
