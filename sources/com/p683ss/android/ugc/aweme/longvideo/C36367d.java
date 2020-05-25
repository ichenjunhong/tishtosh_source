package com.p683ss.android.ugc.aweme.longvideo;

import android.content.Context;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.longvideonew.LongVideoActivity;
import com.p683ss.android.ugc.aweme.longvideonew.LongVideoActivity.C36395a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideo.d */
public final class C36367d {

    /* renamed from: a */
    public static final C36367d f93083a = new C36367d();

    /* renamed from: b */
    private static Aweme f93084b;

    private C36367d() {
    }

    /* renamed from: a */
    public static Aweme m82057a() {
        return f93084b;
    }

    /* renamed from: a */
    public static void m82059a(Aweme aweme) {
        f93084b = aweme;
    }

    /* renamed from: a */
    public static final void m82058a(Context context, Aweme aweme, String str, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        C36395a.m82125a(LongVideoActivity.f93195a, context, aweme, str, i, 0, null, false, 112, null);
    }
}
