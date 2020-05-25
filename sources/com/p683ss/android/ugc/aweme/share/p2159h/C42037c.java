package com.p683ss.android.ugc.aweme.share.p2159h;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.share.C41979aq;

/* renamed from: com.ss.android.ugc.aweme.share.h.c */
public final class C42037c {

    /* renamed from: a */
    public static final C42037c f106425a = new C42037c();

    private C42037c() {
    }

    /* renamed from: a */
    public static boolean m92002a(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        Music music = aweme.getMusic();
        if (music == null || !music.isPreventDownload() || !C35837h.m80982g() || !C41979aq.m91946a().getMuteDownloadForJapanExperiment()) {
            return false;
        }
        return true;
    }
}
