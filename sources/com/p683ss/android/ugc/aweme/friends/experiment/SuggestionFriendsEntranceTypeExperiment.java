package com.p683ss.android.ugc.aweme.friends.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "suggestion_friends_entrance_type")
/* renamed from: com.ss.android.ugc.aweme.friends.experiment.SuggestionFriendsEntranceTypeExperiment */
public final class SuggestionFriendsEntranceTypeExperiment {
    @C10179b(mo18165a = true)
    private static final int DEFAULT = 0;
    public static final SuggestionFriendsEntranceTypeExperiment INSTANCE = new SuggestionFriendsEntranceTypeExperiment();
    @C10179b
    private static final int TYPE_A = 1;
    @C10179b
    public static final int TYPE_B = 2;
    @C10179b
    public static final int TYPE_C = 3;

    private SuggestionFriendsEntranceTypeExperiment() {
    }

    /* renamed from: a */
    public static final boolean m75374a() {
        int a = C10181b.m20511a().mo18168a(SuggestionFriendsEntranceTypeExperiment.class, true, "suggestion_friends_entrance_type", 31744, 0);
        if (a == TYPE_A || a == TYPE_C) {
            return true;
        }
        return false;
    }
}
