package com.p683ss.android.ugc.aweme.bullet.api;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.ies.bullet.p628b.C10244c.C10246b;
import com.bytedance.ies.bullet.p628b.p631c.C10247a;
import com.bytedance.ies.bullet.p628b.p633e.C10287f;
import com.bytedance.ies.bullet.p628b.p641h.C10357d;
import com.bytedance.ies.bullet.p628b.p641h.C10358e;
import com.p683ss.android.ugc.aweme.bullet.views.C24363c;

/* renamed from: com.ss.android.ugc.aweme.bullet.api.IBulletService */
public interface IBulletService {
    String checkNeedCutOutParam(String str);

    void directOpen(Context context, String str, Bundle bundle);

    void enableKitApi(Class<?> cls, boolean z);

    Activity getActivityById(String str);

    C10246b getBulletCoreProvider();

    View getBulletLoadingView(Context context);

    void open(Context context, String str);

    void open(Context context, String str, Bundle bundle);

    void open(Context context, String str, String str2);

    void open(Context context, String str, String str2, Bundle bundle);

    void open(Context context, String str, String str2, Bundle bundle, C24107a aVar);

    void registerDefaultPackageBundle(Object obj);

    void registerGlobalSettingsBundle(Object obj);

    void registerPackageBundle(String str, Object obj);

    void setApplication(Application application);

    void setDebuggable(boolean z);

    void setKitDynamicFeature(C10287f fVar);

    void setReporter(C10357d dVar);

    void setResourceLoader(C10247a aVar);

    void setSettings(C10358e eVar);

    C24363c showBulletBottomDialog(Context context, String str, String str2, int i, int i2);
}
