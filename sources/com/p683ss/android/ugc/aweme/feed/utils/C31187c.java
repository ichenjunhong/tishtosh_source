package com.p683ss.android.ugc.aweme.feed.utils;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.utils.c */
public final class C31187c {

    /* renamed from: a */
    public static List<Aweme> f81607a;

    /* renamed from: b */
    private static Aweme f81608b;

    /* renamed from: c */
    private static User f81609c;

    /* renamed from: a */
    public static Aweme m72818a() {
        return f81608b;
    }

    /* renamed from: b */
    public static List<Aweme> m72822b() {
        return f81607a;
    }

    /* renamed from: c */
    public static User m72824c() {
        return f81609c;
    }

    /* renamed from: a */
    public static void m72819a(Aweme aweme) {
        f81608b = aweme;
    }

    /* renamed from: a */
    public static void m72820a(User user) {
        f81609c = user;
    }

    /* renamed from: b */
    public static void m72823b(Aweme aweme) {
        if (f81608b == aweme) {
            f81608b = null;
        }
    }

    /* renamed from: a */
    public static void m72821a(List<Aweme> list) {
        if (f81607a == list) {
            f81607a = null;
        }
    }
}
