package com.p683ss.android.ugc.aweme.friends.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "account_suggestion_experiment")
/* renamed from: com.ss.android.ugc.aweme.friends.experiment.AccountSuggestionExperiment */
public final class AccountSuggestionExperiment {
    @C10179b(mo18165a = true)
    private static final int DEFAULT = 0;
    @C10179b
    private static final int EXPERIMENT_ONE = 1;
    @C10179b
    private static final int EXPERIMENT_THREE = 3;
    @C10179b
    private static final int EXPERIMENT_TWO = 2;
    public static final AccountSuggestionExperiment INSTANCE = new AccountSuggestionExperiment();

    private AccountSuggestionExperiment() {
    }

    /* renamed from: a */
    public static final boolean m75370a() {
        if (C10181b.m20511a().mo18168a(AccountSuggestionExperiment.class, true, "account_suggestion_experiment", 31744, 0) == EXPERIMENT_THREE) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m75371b() {
        int a = C10181b.m20511a().mo18168a(AccountSuggestionExperiment.class, true, "account_suggestion_experiment", 31744, 0);
        if (a == EXPERIMENT_ONE || a == EXPERIMENT_TWO) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m75372c() {
        if (C10181b.m20511a().mo18168a(AccountSuggestionExperiment.class, true, "account_suggestion_experiment", 31744, 0) == DEFAULT) {
            return true;
        }
        return false;
    }
}
