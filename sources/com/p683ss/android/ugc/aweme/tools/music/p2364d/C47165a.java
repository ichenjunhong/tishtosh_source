package com.p683ss.android.ugc.aweme.tools.music.p2364d;

import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.tools.music.aichoosemusic.AIChooseMusicManager;
import com.p683ss.android.ugc.aweme.tools.music.aichoosemusic.C47156b;
import com.p683ss.android.ugc.aweme.tools.music.p2366e.C47202e;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.music.d.a */
public class C47165a {

    /* renamed from: d */
    private static C47165a f119070d;
    @C17952c(mo34828a = "frame_count")

    /* renamed from: a */
    public int f119071a;
    @C17952c(mo34828a = "song_uri")

    /* renamed from: b */
    public String f119072b;
    @C17952c(mo34828a = "song_url_list")

    /* renamed from: c */
    public List<String> f119073c;

    /* renamed from: a */
    public static C47165a m102396a() {
        return f119070d;
    }

    /* renamed from: b */
    public static void m102398b() {
        try {
            String string = C47156b.f119059a.getString("ai_music_setting", "");
            if (!TextUtils.isEmpty(string)) {
                f119070d = (C47165a) C47202e.m102460a().mo34884a(string, C47165a.class);
            }
        } catch (Exception unused) {
        }
        AIChooseMusicManager.m102361m();
    }

    /* renamed from: a */
    public static void m102397a(String str) {
        try {
            f119070d = (C47165a) C47202e.m102460a().mo34884a(str, C47165a.class);
            Editor edit = C47156b.f119059a.edit();
            edit.putString("ai_music_setting", str);
            edit.commit();
        } catch (Exception unused) {
        }
        AIChooseMusicManager.m102361m();
    }
}
