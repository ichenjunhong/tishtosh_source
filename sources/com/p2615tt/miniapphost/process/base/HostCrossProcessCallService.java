package com.p2615tt.miniapphost.process.base;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.p2615tt.miniapphost.AppBrandLogger;

/* renamed from: com.tt.miniapphost.process.base.HostCrossProcessCallService */
public class HostCrossProcessCallService extends Service {
    public IBinder onBind(Intent intent) {
        AppBrandLogger.m111324i("HostCrossProcessCallService", "onBind");
        IBinder hostProcessCrossProcessCallBinder = HostProcessSupport.inst().getHostProcessCrossProcessCallBinder();
        if (hostProcessCrossProcessCallBinder == null) {
            AppBrandLogger.m111323e("HostCrossProcessCallService", "未正确获取的跨进程通信 Binder");
            return new EmptyBinder();
        }
        AppBrandLogger.m111324i("HostCrossProcessCallService", "返回正确的跨进程通信 Binder");
        return hostProcessCrossProcessCallBinder;
    }
}
