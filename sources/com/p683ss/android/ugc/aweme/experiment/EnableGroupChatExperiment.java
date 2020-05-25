package com.p683ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "im_group_chat_switch")
/* renamed from: com.ss.android.ugc.aweme.experiment.EnableGroupChatExperiment */
public final class EnableGroupChatExperiment {
    public static final EnableGroupChatExperiment INSTANCE = new EnableGroupChatExperiment();
    @C10179b(mo18165a = true)
    public static final int OFF = 0;
    @C10179b

    /* renamed from: ON */
    public static final int f77242ON = 1;

    private EnableGroupChatExperiment() {
    }

    /* renamed from: a */
    public static final boolean m69587a() {
        if (C10181b.m20511a().mo18168a(EnableGroupChatExperiment.class, true, "im_group_chat_switch", 31744, 0) == 1) {
            return true;
        }
        return false;
    }
}
