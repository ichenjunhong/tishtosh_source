package com.p2615tt.miniapphost.recent;

import com.p2615tt.miniapphost.RecentAppsManager.OnAppDeleteListener;
import com.p2615tt.miniapphost.RecentAppsManager.OnDataGetListener;
import com.p2615tt.miniapphost.entity.AppLaunchInfo;
import java.util.List;

/* renamed from: com.tt.miniapphost.recent.IRecentAppsManager */
public interface IRecentAppsManager {
    void addDataChangeListener(DataChangeListener dataChangeListener);

    void deleteRecentApp(String str, OnAppDeleteListener onAppDeleteListener);

    List<AppLaunchInfo> getRecentAppList(OnDataGetListener onDataGetListener);

    boolean removeDataChangeListener(DataChangeListener dataChangeListener);
}
