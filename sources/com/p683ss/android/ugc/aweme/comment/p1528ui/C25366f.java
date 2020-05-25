package com.p683ss.android.ugc.aweme.comment.p1528ui;

import com.bytedance.apm.C8936b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.comment.experiment.CommentKeyboardWorkaroundExperiment;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p2628d.C52856t;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.f */
public final class C25366f {

    /* renamed from: a */
    static final boolean f67056a = C10181b.m20511a().mo18172a(CommentKeyboardWorkaroundExperiment.class, true, "comment_keyboard_workaround", 31744, false);

    /* renamed from: b */
    static final long f67057b = TimeUnit.DAYS.toMillis(3);

    /* renamed from: c */
    static final Keva f67058c;

    /* renamed from: d */
    static long f67059d;

    /* renamed from: e */
    static int f67060e;

    /* renamed from: f */
    public static final C25366f f67061f = new C25366f();

    private C25366f() {
    }

    /* renamed from: b */
    public static final boolean m61645b() {
        boolean z = !f67056a;
        if (!z) {
            m61643a(true);
        }
        return z;
    }

    static {
        Keva repo = Keva.getRepo("comment");
        C52711k.m112236a((Object) repo, "Keva.getRepo(REPO_NAME)");
        f67058c = repo;
    }

    /* renamed from: a */
    public static final boolean m61644a() {
        boolean z = f67058c.getBoolean("keyboard_can_dismiss", true);
        if (f67058c.getLong("keyboard_can_dismiss_expire_time", 0) < System.currentTimeMillis()) {
            f67058c.storeBoolean("keyboard_can_dismiss", true);
            z = true;
        }
        if (!z) {
            m61643a(false);
        }
        return z;
    }

    /* renamed from: a */
    private static void m61643a(boolean z) {
        String str;
        if (z) {
            str = "by_network";
        } else {
            str = "by_local";
        }
        try {
            HashMap c = C52550ab.m112057c(C52856t.m112465a("wont_dismiss_type", str));
            C32458a.m75150b("comment_keyboard_wont_dismiss", str);
            C8936b.m17655a("comment_keyboard_wont_dismiss", new JSONObject(c));
        } catch (Throwable unused) {
        }
    }
}
