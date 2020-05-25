package com.bytedance.business.base;

import android.app.Activity;
import com.bytedance.jirafast.p749b.C11997a;
import com.bytedance.jirafast.p749b.C12003g;

public interface IBugReportService {
    boolean canDrawOverlays();

    void captureScreen();

    void goJiraCreateActivity();

    void permissionChecker(Activity activity);

    void setEmail(String str);

    void setGoToFeedbackPageListener(C11997a aVar);

    void setOnGetMoreJIRAParamsListener(C12003g gVar);

    void startScreenshotObserver();

    void stopScreenshotObserver();
}
