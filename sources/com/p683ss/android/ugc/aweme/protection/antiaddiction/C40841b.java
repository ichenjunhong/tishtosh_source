package com.p683ss.android.ugc.aweme.protection.antiaddiction;

import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.protection.antiaddiction.b */
public final class C40841b {
    /* renamed from: a */
    public static void m90322a() {
        C26890h.m65011a("addict_alert", C23089d.m56640a().f61491a);
    }

    /* renamed from: a */
    public static void m90323a(Aweme aweme) {
        String str;
        if (C40849c.m90331a().mo83176a(System.currentTimeMillis())) {
            str = "night";
        } else {
            str = "day";
        }
        C26890h.onEvent(MobClick.obtain().setEventName("video_play").setLabelName("homepage_hot").setValue(aweme.getAid()).setJsonObject(C23088c.m56631a().mo47824a("is_addicted", "1").mo47824a("appear_time", str).mo47825b()));
    }
}
