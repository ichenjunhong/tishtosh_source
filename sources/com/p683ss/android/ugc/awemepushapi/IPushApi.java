package com.p683ss.android.ugc.awemepushapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.ss.android.ugc.awemepushapi.IPushApi */
public interface IPushApi {
    void init(Context context, C48426a aVar);

    void initImmediately(Context context, C48426a aVar);

    void initMessageDepend();

    void initNotificationChannel();

    void initPushAccountService(boolean z);

    boolean isSswoAct(Activity activity);

    void notifyOnDeeplink(boolean z, Context context, Intent intent, Uri uri);

    void notifyOnLocationChanged(Context context, String str);

    void removeRedBadge(Context context);

    void setAutoDisappear(int i);

    void startPushProcess(Context context);
}
