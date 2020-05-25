package com.bytedance.android.livesdkapi.host.p454xt;

import android.content.Context;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.live.base.p184a.C2951a;
import com.bytedance.android.livesdkapi.host.p451a.C8781d;
import com.p683ss.android.ugc.effectmanager.C48893h;

/* renamed from: com.bytedance.android.livesdkapi.host.xt.IHostContextForXT */
public interface IHostContextForXT extends C2952b, C8781d {
    int appId();

    String appName();

    Context context();

    String getChannel();

    <T> T getClientABTestValue(C2951a<T> aVar, boolean z);

    C48893h getEffectManager();

    int getLastVersionCode();

    String getPackageName();

    String getServerDeviceId();

    int getUpdateVersionCode();

    String getVersionCode();

    boolean isLocalTest();

    boolean isNeedProtectUnderage();

    int liveId();

    void refreshClientABTestValues();
}
