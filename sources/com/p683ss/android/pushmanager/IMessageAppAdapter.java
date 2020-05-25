package com.p683ss.android.pushmanager;

import android.content.Context;
import android.content.Intent;
import com.p683ss.android.pushmanager.p1205b.C19672a;
import org.json.JSONObject;

/* renamed from: com.ss.android.pushmanager.IMessageAppAdapter */
public interface IMessageAppAdapter {
    boolean checkPushConfiguration(String str, Context context);

    String handleMySelfPushIntent(Intent intent);

    void initOnApplication(Context context, C19698d dVar);

    void initOnApplication(Context context, C19698d dVar, String str);

    void initPushSetting(Context context);

    void setDebuggable(boolean z);

    void setIExtraMessageDepend(C19681c cVar);

    void setMonitorEnable(boolean z);

    void setMonitorImpl(C19672a aVar);

    void trackClickPush(Context context, long j, boolean z, String str, JSONObject jSONObject);

    void trackPush(Context context, int i, Object obj);

    void unRegisterAllThirdPush(Context context);
}
