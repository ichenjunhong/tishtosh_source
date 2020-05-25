package com.bytedance.liko.leakdetector;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import leakcanary.internal.InternalLeakCanary;

public final class TriggerLeakCanaryReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        C12279a.m24757a("on receive trigger LeakCanary");
        InternalLeakCanary.INSTANCE.onDumpHeapReceived();
    }
}
