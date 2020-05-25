package com.p683ss.android.ugc.aweme.compliance.business.api.services;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.api.services.IComplianceBusinessService */
public interface IComplianceBusinessService {
    C27022b getBanAppealService();

    Object getCommentFilterPushSettingCallback();

    boolean isShowPrivacyAccountSetting();

    Class<? extends Activity> provideChildrenModeSettingActivityClass();

    void tryShowCommentFilterGuide(Activity activity, Aweme aweme, Comment comment);
}
