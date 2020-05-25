package com.p683ss.android.ugc.aweme.share.libra;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "whatsapp_share_type")
/* renamed from: com.ss.android.ugc.aweme.share.libra.WhatsppShareTypeExperiment */
public final class WhatsppShareTypeExperiment {
    public static final WhatsppShareTypeExperiment INSTANCE = new WhatsppShareTypeExperiment();
    @C10179b
    public static final int LINK = 1;
    @C10179b(mo18165a = true)
    public static final int VIDEO = 0;

    private WhatsppShareTypeExperiment() {
    }

    /* renamed from: a */
    public static boolean m92641a() {
        if (C10181b.m20511a().mo18168a(WhatsppShareTypeExperiment.class, true, "whatsapp_share_type", 31744, 0) == 1) {
            return true;
        }
        return false;
    }
}
