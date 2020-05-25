package com.p683ss.android.ugc.aweme.p1807im.sdk.abtest;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.ss.android.ugc.trill.R;

@C10178a(mo18163a = "unread_conversation_ui_optimize")
/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.ImUnreadMessageEnhanceExperiment */
public final class ImUnreadMessageEnhanceExperiment {
    public static final ImUnreadMessageEnhanceExperiment INSTANCE = new ImUnreadMessageEnhanceExperiment();
    @C10179b(mo18165a = true)
    public static final int NONE = 0;
    @C10179b
    public static final int STRATEGY_WHITE = 2;
    @C10179b
    public static final int STRATEGY_YELLOW = 1;

    private ImUnreadMessageEnhanceExperiment() {
    }

    /* renamed from: a */
    public static boolean m76329a() {
        if (C10181b.m20511a().mo18168a(ImUnreadMessageEnhanceExperiment.class, true, "unread_conversation_ui_optimize", 31744, 0) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m76330b() {
        if (C10181b.m20511a().mo18168a(ImUnreadMessageEnhanceExperiment.class, true, "unread_conversation_ui_optimize", 31744, 0) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static int m76331c() {
        switch (C10181b.m20511a().mo18168a(ImUnreadMessageEnhanceExperiment.class, true, "unread_conversation_ui_optimize", 31744, 0)) {
            case 1:
                return C11010c.m22280a().getResources().getColor(R.color.as4);
            case 2:
                return C11010c.m22280a().getResources().getColor(R.color.as0);
            default:
                return C11010c.m22280a().getResources().getColor(R.color.sh);
        }
    }

    /* renamed from: d */
    public static int m76332d() {
        switch (C10181b.m20511a().mo18168a(ImUnreadMessageEnhanceExperiment.class, true, "unread_conversation_ui_optimize", 31744, 0)) {
            case 1:
                return C11010c.m22280a().getResources().getColor(R.color.as4);
            case 2:
                return C11010c.m22280a().getResources().getColor(R.color.ja);
            default:
                return C11010c.m22280a().getResources().getColor(R.color.ar1);
        }
    }
}
