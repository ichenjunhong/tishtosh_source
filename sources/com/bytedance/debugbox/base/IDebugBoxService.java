package com.bytedance.debugbox.base;

import android.app.Activity;
import android.app.Application;
import com.bytedance.jirafast.p749b.C11998b;

public interface IDebugBoxService extends C11998b {
    void disableFloating();

    void forceShowFloatingButton(Activity activity);

    void initialize(Application application, C9732a aVar);
}
