package com.p683ss.android.ugc.aweme.choosemusic.p1504c;

import com.p683ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.p683ss.android.ugc.aweme.music.p1977e.C37375a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.c.d */
public class C24841d extends C24837a {

    /* renamed from: b */
    private static volatile C24841d f65737b;

    private C24841d() {
    }

    /* renamed from: b */
    public final List<MusicSearchHistory> mo50744b() {
        return C37375a.m83682a("music_search_history", MusicSearchHistory.class, "music_sp");
    }

    /* renamed from: c */
    public static C24841d m60410c() {
        if (f65737b == null) {
            synchronized (C24841d.class) {
                if (f65737b == null) {
                    f65737b = new C24841d();
                }
            }
        }
        return f65737b;
    }

    /* renamed from: a */
    public final void mo50741a(List<MusicSearchHistory> list) {
        C37375a.m83683a("music_search_history", list, "music_sp");
    }
}
