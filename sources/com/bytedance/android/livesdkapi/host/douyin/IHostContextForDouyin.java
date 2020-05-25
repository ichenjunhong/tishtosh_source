package com.bytedance.android.livesdkapi.host.douyin;

import android.content.Context;
import com.bef.effectsdk.C2592c;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.live.base.p184a.C2951a;
import com.bytedance.android.livesdkapi.host.p451a.C8781d;
import com.bytedance.android.livesdkapi.p455i.C8824m;
import com.p683ss.android.ugc.effectmanager.C48893h;
import java.util.Locale;

public interface IHostContextForDouyin extends C2952b, C8781d {
    int appId();

    String appName();

    Context context();

    Locale currentLocale();

    String getChannel();

    <T> T getClientABTestValue(C2951a<T> aVar, boolean z);

    C8824m getCurrentLocation();

    C48893h getEffectManager();

    int getLastVersionCode();

    String getPackageName();

    C2592c getResourceFinder();

    String getServerDeviceId();

    int getUpdateVersionCode();

    String getVersionCode();

    boolean hasLocation();

    boolean isLocalTest();

    boolean isNeedProtectUnderage();

    int liveId();

    void refreshClientABTestValues();
}
