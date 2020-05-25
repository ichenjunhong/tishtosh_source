package com.p683ss.android.ugc.aweme.choosemusic.p1504c;

import com.p683ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.p683ss.android.ugc.aweme.music.p1977e.C37375a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.c.c */
public class C24840c extends C24837a {

    /* renamed from: b */
    private static volatile C24840c f65736b;

    private C24840c() {
    }

    /* renamed from: b */
    public final List<MusicSearchHistory> mo50744b() {
        return C37375a.m83682a("music_search_history_lyric", MusicSearchHistory.class, "music_sp");
    }

    /* renamed from: c */
    public static C24840c m60407c() {
        if (f65736b == null) {
            synchronized (C24840c.class) {
                if (f65736b == null) {
                    f65736b = new C24840c();
                }
            }
        }
        return f65736b;
    }

    /* renamed from: a */
    public final void mo50741a(List<MusicSearchHistory> list) {
        C37375a.m83683a("music_search_history_lyric", list, "music_sp");
    }
}
