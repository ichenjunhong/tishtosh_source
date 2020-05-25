package com.p683ss.android.ugc.aweme.player;

import com.bytedance.keva.Keva;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.player.b */
public final class C38847b {

    /* renamed from: a */
    public static Keva f98941a;

    /* renamed from: b */
    public static final C38847b f98942b = new C38847b();

    private C38847b() {
    }

    /* renamed from: a */
    public final String mo78826a() {
        return m86279b("KEY_SMART_PRELOAD_V2_LAST_PREDICT_LABEL");
    }

    static {
        Keva repoSync = Keva.getRepoSync("repo_player_kv", 0);
        C52711k.m112236a((Object) repoSync, "Keva.getRepoSync(REPO_NA…ants.MODE_SINGLE_PROCESS)");
        f98941a = repoSync;
    }

    /* renamed from: b */
    private static String m86279b(String str) {
        C52711k.m112240b(str, "key");
        String string = f98941a.getString(str, "");
        C52711k.m112236a((Object) string, "keva.getString(key, \"\")");
        return string;
    }

    /* renamed from: a */
    public final void mo78827a(float f) {
        m86277a("KEY_SMART_PRELOAD_V2_LAST_PREDICT_PROBILITY", f);
    }

    /* renamed from: a */
    public final void mo78828a(String str) {
        C52711k.m112240b(str, "value");
        m86278a("KEY_SMART_PRELOAD_V2_LAST_PREDICT_LABEL", str);
    }

    /* renamed from: a */
    private static void m86277a(String str, float f) {
        C52711k.m112240b(str, "key");
        f98941a.storeFloat(str, f);
    }

    /* renamed from: a */
    private static void m86278a(String str, String str2) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(str2, "value");
        f98941a.storeString(str, str2);
    }
}
