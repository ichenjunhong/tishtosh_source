package com.p683ss.android.ugc.aweme.emoji.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.d */
public final class C29474d {

    /* renamed from: b */
    private static C29474d f77205b;

    /* renamed from: c */
    private static volatile long f77206c;

    /* renamed from: a */
    public SharedPreferences f77207a;

    /* renamed from: d */
    private SharedPreferences f77208d = C35807d.m80935a(C11010c.m22280a(), "aweme_emoji", 0);

    /* renamed from: b */
    public final boolean mo59574b() {
        return this.f77207a.getBoolean("hint_weshine_search", true);
    }

    /* renamed from: c */
    public final String mo59575c() {
        return this.f77208d.getString("key_small_emoji_md5", "");
    }

    /* renamed from: e */
    public final String mo59577e() {
        return this.f77208d.getString("last_login_user_id", "");
    }

    /* renamed from: d */
    public final void mo59576d() {
        this.f77208d.edit().putString("last_login_user_id", C29433a.m69407b().toString()).commit();
    }

    private C29474d() {
        f77206c = C29433a.m69408c();
        Context a = C11010c.m22280a();
        StringBuilder sb = new StringBuilder("aweme_emoji_");
        sb.append(f77206c);
        this.f77207a = C35807d.m80935a(a, sb.toString(), 0);
    }

    /* renamed from: a */
    public static synchronized C29474d m69546a() {
        C29474d dVar;
        synchronized (C29474d.class) {
            long c = C29433a.m69408c();
            if (f77205b == null || c != f77206c) {
                synchronized (C29474d.class) {
                    if (f77205b == null || c != f77206c) {
                        f77205b = new C29474d();
                    }
                }
            }
            dVar = f77205b;
        }
        return dVar;
    }

    /* renamed from: a */
    public final void mo59572a(String str) {
        this.f77208d.edit().putString("key_small_emoji_md5", str).commit();
    }

    /* renamed from: a */
    public final void mo59573a(boolean z) {
        this.f77207a.edit().putBoolean("hint_weshine_search", false).commit();
    }

    /* renamed from: a */
    public final void mo59571a(C29366a aVar) {
        List b = C29481i.m69569b(this.f77207a.getString("recent_gif_emojis", ""), C29366a[].class);
        if (b.isEmpty()) {
            b.add(aVar);
        } else {
            b.remove(aVar);
            b.add(0, aVar);
            if (b.size() > 8) {
                b = b.subList(0, 8);
            }
        }
        this.f77207a.edit().putString("recent_gif_emojis", C29481i.m69568a(b)).commit();
    }
}
