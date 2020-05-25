package com.p683ss.android.ugc.aweme.homepage.api.p1800ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.p030v4.app.Fragment;
import com.bytedance.ies.uikit.base.C11079a;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23699m.C23700a;
import com.p683ss.android.ugc.aweme.main.TabChangeManager;
import p2628d.C52855s;

/* renamed from: com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService */
public interface HomePageUIFrameService {
    void addTabToMainPageFragment(TabChangeManager tabChangeManager, Intent intent);

    void afterTabChangedInMainPageFragment(String str);

    C23700a getBuilderForFragmentInHomePageActivity();

    C52855s<String[], int[], String[]> getContentForMainFragment(Context context);

    int getCount(int i);

    Class<? extends Activity> getHomePageInflateActivityClass();

    Fragment getItemForPagerInMainFragment(C11079a aVar, int i, String str);

    int getItemPosition(Object obj);

    String getSecondTabDesc(Context context);

    String getTagForCurrentTabInMainPageFragment(TabChangeManager tabChangeManager, String str, String str2);

    void runInTabHostRunnable(C11079a aVar);

    void setTitleTabVisibility(boolean z);
}
