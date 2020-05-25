package com.p683ss.android.ugc.aweme.shortvideo.experiment;

import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "publish_privacy_account_confirm")
/* renamed from: com.ss.android.ugc.aweme.shortvideo.experiment.PublishPrivacyConfirmationExperiment */
public final class PublishPrivacyConfirmationExperiment {
    public static final PublishPrivacyConfirmationExperiment INSTANCE = new PublishPrivacyConfirmationExperiment();
    @C10179b(mo18165a = true)
    public static final int NO_PRIVACY_CONFIRM = 0;
    @C10179b
    public static final int PRIVACY_CONFIRM_SHOW = 1;
    @C10179b
    public static final int PRIVACY_CONFIRM_SHOW_ENHANCEED = 2;

    private PublishPrivacyConfirmationExperiment() {
    }
}
