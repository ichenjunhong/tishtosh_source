package com.p683ss.android.ugc.aweme.feed.helper;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.feed.helper.UserFeedbackSurveySettings */
public final class UserFeedbackSurveySettings {
    @C10179b
    private static final FeedSurveyConfig DEFAULT = null;
    public static final UserFeedbackSurveySettings INSTANCE = new UserFeedbackSurveySettings();

    private UserFeedbackSurveySettings() {
    }

    public final FeedSurveyConfig getDEFAULT() {
        return DEFAULT;
    }

    public static final FeedSurveyConfig get() {
        try {
            return (FeedSurveyConfig) C10193n.m20607a().mo18202a(UserFeedbackSurveySettings.class, "feed_survey", C10181b.m20511a().mo18175c().getFeedSurvey(), "com.ss.android.ugc.aweme.feed.helper.FeedSurveyConfig", FeedSurveyConfig.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
