package com.p683ss.android.ugc.aweme.music.p1978ui.api;

import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import com.p683ss.android.ugc.aweme.music.p1978ui.viewmodel.C37680b;
import p064c.p065a.C2201v;

/* renamed from: com.ss.android.ugc.aweme.music.ui.api.MusicAwemeApi */
public interface MusicAwemeApi {

    /* renamed from: a */
    public static final C37511a f95705a = C37511a.f95706a;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.api.MusicAwemeApi$a */
    public static final class C37511a {

        /* renamed from: a */
        static final /* synthetic */ C37511a f95706a = new C37511a();

        private C37511a() {
        }
    }

    @C12706h(mo23876a = "/aweme/v1/similar/music/aweme/")
    C2201v<C37680b> queryRecommendMusicAwemeList(@C12724z(mo23894a = "music_id") String str, @C12724z(mo23894a = "cursor") long j, @C12724z(mo23894a = "count") int i, @C12724z(mo23894a = "enter_from") int i2);
}
