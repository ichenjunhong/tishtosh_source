package com.p683ss.android.ugc.aweme.music.p1971ab;

import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import com.p683ss.android.ugc.aweme.utils.GsonProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.ab.a */
public final class C37249a {

    /* renamed from: a */
    public static MusicAbTestModel f95099a;

    /* renamed from: b */
    public static final C37249a f95100b = new C37249a();

    private C37249a() {
    }

    /* renamed from: a */
    public static int m83510a() {
        return f95099a.getMusicListType();
    }

    /* renamed from: b */
    public static boolean m83511b() {
        return f95099a.isMusicInstantSearchEnabled();
    }

    /* renamed from: c */
    public static int m83512c() {
        return f95099a.getLocalSoundEntranceStyle();
    }

    /* renamed from: d */
    public static int m83513d() {
        return f95099a.getMtCopywritingSaveOrDownload();
    }

    /* renamed from: e */
    public static int m83514e() {
        return f95099a.getNonStdMusicList();
    }

    static {
        f95099a = new MusicAbTestModel();
        String string = Keva.getRepo("music_sp").getString("music_ab_test", "");
        if (!C52711k.m112239a((Object) string, (Object) "")) {
            GsonProvider a = C47759cc.m103382a();
            C52711k.m112236a((Object) a, "GsonProvider.get()");
            Object a2 = a.getGson().mo34884a(string, MusicAbTestModel.class);
            C52711k.m112236a(a2, "GsonProvider.get().gson.…cAbTestModel::class.java)");
            f95099a = (MusicAbTestModel) a2;
        }
    }
}
