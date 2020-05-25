package com.p683ss.android.ugc.aweme.protection.experiment;

import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "teens_mode_days_alert_count")
/* renamed from: com.ss.android.ugc.aweme.protection.experiment.TeenModeAlertDaysIntervalExperiment */
public final class TeenModeAlertDaysIntervalExperiment {
    @C10179b(mo18165a = true)
    public static final int EVERY_DAY = 0;
    public static final TeenModeAlertDaysIntervalExperiment INSTANCE = new TeenModeAlertDaysIntervalExperiment();
    @C10179b
    public static final int ONE_DAY = 1;
    @C10179b
    public static final int THREE_DAY = 3;
    @C10179b
    public static final int TWO_DAY = 2;

    private TeenModeAlertDaysIntervalExperiment() {
    }
}
