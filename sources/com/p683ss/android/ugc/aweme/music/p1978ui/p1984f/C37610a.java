package com.p683ss.android.ugc.aweme.music.p1978ui.p1984f;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.music.ui.f.a */
public final class C37610a {

    /* renamed from: a */
    public static final C37611a f95918a = new C37611a(null);

    /* renamed from: com.ss.android.ugc.aweme.music.ui.f.a$a */
    public static final class C37611a {
        private C37611a() {
        }

        public /* synthetic */ C37611a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m84057a(String str, String str2) {
            C26890h.m65011a("video_play", C23089d.m56640a().mo47829a("enter_from", "similar_song").mo47829a("group_id", str).mo47829a("author_id", str2).f61491a);
        }

        /* renamed from: b */
        public static void m84060b(String str, String str2) {
            C26890h.m65011a("video_play_finish", C23089d.m56640a().mo47829a("enter_from", "similar_song").mo47829a("group_id", str).mo47829a("author_id", str2).f61491a);
        }

        /* renamed from: a */
        public static void m84059a(String str, boolean z) {
            String str2;
            String str3 = "slide_similar_song_list";
            C23089d a = C23089d.m56640a().mo47829a("enter_from", "similar_song").mo47829a("music_id", str);
            String str4 = "action_type";
            if (z) {
                str2 = "up";
            } else {
                str2 = "down";
            }
            C26890h.m65011a(str3, a.mo47829a(str4, str2).f61491a);
        }

        /* renamed from: a */
        public static void m84058a(String str, String str2, Long l) {
            C26890h.m65011a("play_time", C23089d.m56640a().mo47829a("enter_from", "similar_song").mo47829a("group_id", str).mo47829a("author_id", str2).mo47828a("duration", (Object) l).f61491a);
        }
    }
}
