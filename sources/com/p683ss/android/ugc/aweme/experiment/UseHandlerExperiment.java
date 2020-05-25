package com.p683ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;
import p2628d.p2639f.p2641b.C52711k;

@C10178a(mo18163a = "nickname_to_username")
/* renamed from: com.ss.android.ugc.aweme.experiment.UseHandlerExperiment */
public final class UseHandlerExperiment {
    @C10179b
    public static final int CHANGE_ALL = 1;
    @C10179b(mo18165a = false)
    public static final int CHANGE_BESIDE_MESSAGE = 2;
    @C10179b
    public static final int CHANGE_ONLY_COMMENT_NOTIFICATION = 4;
    @C10179b
    public static final int CHANGE_ONLY_MESSAGE = 3;
    public static final UseHandlerExperiment INSTANCE = new UseHandlerExperiment();
    @C10179b(mo18165a = true)
    public static final int ORIGIN = 0;

    private UseHandlerExperiment() {
    }

    /* renamed from: a */
    private static int m69632a() {
        return C10181b.m20511a().mo18168a(UseHandlerExperiment.class, true, "nickname_to_username", 31744, 0);
    }

    /* renamed from: a */
    public static final boolean m69633a(String str) {
        C52711k.m112240b(str, "module");
        switch (m69632a()) {
            case 1:
                return true;
            case 2:
                return !C52711k.m112239a((Object) str, (Object) "Message");
            case 3:
                return C52711k.m112239a((Object) str, (Object) "Message");
            case 4:
                if (C52711k.m112239a((Object) str, (Object) "Comment") || C52711k.m112239a((Object) str, (Object) "Notification")) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }
}
