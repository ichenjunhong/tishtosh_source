package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.arch.lifecycle.C0199s;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.music.ui.af */
final /* synthetic */ class C37500af implements C0199s {

    /* renamed from: a */
    private final MusicDetailFragment f95690a;

    C37500af(MusicDetailFragment musicDetailFragment) {
        this.f95690a = musicDetailFragment;
    }

    public final void onChanged(Object obj) {
        MusicDetailFragment musicDetailFragment = this.f95690a;
        Boolean bool = (Boolean) obj;
        if (musicDetailFragment.ivMusicCollect != null) {
            musicDetailFragment.ivMusicCollect.setImageResource(bool.booleanValue() ? R.drawable.dfz : R.drawable.dg0);
        }
        if (musicDetailFragment.mMusicCollectionText != null) {
            musicDetailFragment.mMusicCollectionText.setText(bool.booleanValue() ? R.string.f6 : R.string.f0);
        }
        if (!bool.booleanValue() && musicDetailFragment.f95556n != null && musicDetailFragment.f95556n.isShowing()) {
            musicDetailFragment.f95556n.dismiss();
        }
    }
}
