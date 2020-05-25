package com.p683ss.android.ugc.aweme.local_test;

import android.content.Context;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.local_test.LocalTestApi */
public interface LocalTestApi {
    String getDefaultRNTestHost();

    List<String> getJsbSafeHost();

    void openRobustActivity(Context context);

    boolean shouldBulletShowDebugTagView();
}
