package com.p683ss.android.ugc.aweme.commercialize.log;

import android.content.Context;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.ax */
public final class C26059ax {
    /* renamed from: a */
    public static void m63133a(Context context, C26051ar arVar) {
        m63134a(context, arVar, "safety_video_show");
    }

    /* renamed from: b */
    public static void m63135b(Context context, C26051ar arVar) {
        m63134a(context, arVar, "safety_video_play");
    }

    /* renamed from: c */
    public static void m63136c(Context context, C26051ar arVar) {
        m63134a(context, arVar, "safety_video_click");
    }

    /* renamed from: a */
    public static void m63134a(Context context, C26051ar arVar, String str) {
        if (context != null && arVar != null) {
            C26077e.m63190a().mo53582a("result_ad").mo53593b(str).mo53580a(Long.valueOf(arVar.getCreativeId())).mo53604i(arVar.getLogExtra()).mo53586a(context);
        }
    }
}
