package com.p683ss.android.ugc.aweme.services.external.p2130ui;

import android.app.Activity;
import android.content.Intent;
import android.view.ViewGroup;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.IStoryService */
public interface IStoryService {
    void startStoryEditActivity(Activity activity, Intent intent);

    void startStoryRecord(Intent intent);

    void startStorySettingActivity(Activity activity, int i, int i2, int i3, boolean z);

    void startStorySettingActivity(Activity activity, int i, int i2, boolean z, int i3);

    void startStorySettingActivityForView(Activity activity, int i, int i2, boolean z, int i3, ViewGroup viewGroup);
}
