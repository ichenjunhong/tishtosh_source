package com.p683ss.android.ugc.aweme.recommend;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "popup_recommend_pause_after_display")
/* renamed from: com.ss.android.ugc.aweme.recommend.RecommendUserDialogPauseWhenShowing */
public final class RecommendUserDialogPauseWhenShowing {
    @C10179b(mo18165a = true)
    private static final boolean DISABLED = false;
    @C10179b
    private static final boolean ENABLED = true;
    public static final RecommendUserDialogPauseWhenShowing INSTANCE = new RecommendUserDialogPauseWhenShowing();

    private RecommendUserDialogPauseWhenShowing() {
    }

    /* renamed from: a */
    public static final boolean m90740a() {
        return C10181b.m20511a().mo18172a(RecommendUserDialogPauseWhenShowing.class, true, "popup_recommend_pause_after_display", 31744, false);
    }
}
