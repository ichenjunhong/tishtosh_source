package com.p683ss.android.ugc.aweme.tools.music.aichoosemusic;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r;

/* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.b */
public final class C47156b {

    /* renamed from: a */
    public static SharedPreferences f119059a = C35807d.m80935a(AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin().getApplicationService().mo74157c(), "ai_music", 0);

    /* renamed from: b */
    public static long m102387b() {
        return f119059a.getLong("ai_music_time", 0);
    }

    /* renamed from: c */
    public static String m102388c() {
        return f119059a.getString("ai_music_url", "");
    }

    /* renamed from: d */
    public static String m102389d() {
        return f119059a.getString("ai_music_list", "");
    }

    /* renamed from: e */
    public static void m102390e() {
        Editor edit = f119059a.edit();
        edit.remove("ai_music_time");
        edit.remove("ai_music_list");
        edit.remove("ai_music_url");
        edit.commit();
    }

    /* renamed from: a */
    public static boolean m102386a() {
        if (C39629l.m88232a().mo58583n().mo83103a(C40790a.EditPagePrompt)) {
            return C43763r.m96184a("music");
        }
        return f119059a.getBoolean("ai_music_guide_show", false);
    }

    /* renamed from: a */
    public static void m102385a(boolean z) {
        if (C39629l.m88232a().mo58583n().mo83103a(C40790a.EditPagePrompt)) {
            C43763r.m96180a("music", true);
            return;
        }
        Editor edit = f119059a.edit();
        edit.putBoolean("ai_music_guide_show", z);
        edit.commit();
    }

    /* renamed from: a */
    public static void m102384a(String str, String str2) {
        Editor edit = f119059a.edit();
        edit.putLong("ai_music_time", System.currentTimeMillis());
        edit.putString("ai_music_list", str);
        edit.putString("ai_music_url", str2);
        edit.commit();
    }
}
