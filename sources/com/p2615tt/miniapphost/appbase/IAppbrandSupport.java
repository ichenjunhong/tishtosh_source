package com.p2615tt.miniapphost.appbase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p2615tt.miniapphost.appbase.listener.MiniAppPreloadListCheckListener;
import com.p2615tt.miniapphost.entity.MiniAppPreloadConfigEntity;
import com.p2615tt.miniapphost.entity.PreLoadAppEntity;
import com.p2615tt.miniapphost.entity.PreloadExtSrcEntity;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.tt.miniapphost.appbase.IAppbrandSupport */
public interface IAppbrandSupport {
    void cancelPreloadMiniApp(String str);

    String getTmaJssdkVersion();

    String getTmaJssdkVersion(Context context);

    boolean isSDKSupport();

    boolean isSDKSupport(Context context);

    boolean openAppbrand(String str);

    boolean openAppbrand(String str, Bundle bundle);

    boolean openShortcut(Intent intent);

    void preloadEmptyProcess();

    void preloadMiniApp(List<PreLoadAppEntity> list, List<PreloadExtSrcEntity> list2);

    void preloadMiniApp(List<PreLoadAppEntity> list, Map<String, String> map, MiniAppPreloadListCheckListener miniAppPreloadListCheckListener);

    void preloadMiniApp(List<PreLoadAppEntity> list, Map<String, String> map, MiniAppPreloadListCheckListener miniAppPreloadListCheckListener, Executor executor);

    void setMiniAppPreloadConfigEntity(MiniAppPreloadConfigEntity miniAppPreloadConfigEntity);

    void switchLang(Locale locale);
}
