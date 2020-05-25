package com.p683ss.android.p1159di.push;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.p683ss.android.ugc.awemepushapi.C48426a;
import com.p683ss.android.ugc.awemepushapi.IPushApi;

/* renamed from: com.ss.android.di.push.PushServiceMock */
public class PushServiceMock implements IPushApi {
    public void init(Context context, C48426a aVar) {
    }

    public void initImmediately(Context context, C48426a aVar) {
    }

    public void initMessageDepend() {
    }

    public void initNotificationChannel() {
    }

    public void initPushAccountService(boolean z) {
    }

    public boolean isSswoAct(Activity activity) {
        return false;
    }

    public void notifyOnDeeplink(boolean z, Context context, Intent intent, Uri uri) {
    }

    public void notifyOnLocationChanged(Context context, String str) {
    }

    public void removeRedBadge(Context context) {
    }

    public void setAutoDisappear(int i) {
    }

    public void startPushProcess(Context context) {
    }
}
