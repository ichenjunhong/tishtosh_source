package com.bytedance.android.livesdk.init;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.android.live.core.performance.C3974b;
import com.bytedance.android.live.core.performance.C3982g;
import com.bytedance.android.live.p179a.C2941a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p392l.C7734a;

@C2941a(mo7578a = 3)
public class MonitorInitTask extends C7734a {
    public void run() {
        try {
            C3974b a = C3974b.m10061a();
            boolean booleanValue = ((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_PERFORMANCE_SAMPLING.mo9431a()).booleanValue();
            int intValue = ((Integer) LiveConfigSettingKeys.LIVE_PERFORMANCE_SAMPLE_RATE.mo9431a()).intValue();
            a.f11073a = booleanValue;
            a.f11074b = intValue;
            HandlerThread handlerThread = new HandlerThread("monitor-performance", 10);
            handlerThread.start();
            C3974b.f11070d = new Handler(handlerThread.getLooper());
            C3982g.f11106a = ((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_TIME_COST.mo9431a()).booleanValue();
        } catch (Throwable unused) {
        }
    }
}
