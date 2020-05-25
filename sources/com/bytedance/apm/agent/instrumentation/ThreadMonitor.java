package com.bytedance.apm.agent.instrumentation;

import com.bytedance.apm.C8976c;
import com.bytedance.apm.p501q.C9198o;
import com.bytedance.apm.p501q.C9203s;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;

public class ThreadMonitor {
    private static boolean isDebuggable() {
        return C9203s.m18288a(C8976c.m17736a());
    }

    private static boolean isLocalChannel() {
        if (C8976c.f24425c == null || C8976c.f24425c.optString("channel") == null) {
            return false;
        }
        return C8976c.f24425c.optString("channel").contains("local");
    }

    public static void sleepMonitor(long j) throws InterruptedException {
        if (C9198o.m18275a() && j > 10 && (isDebuggable() || isLocalChannel())) {
            C9220a.m18310a("sleep_in_main_thread");
        }
        Thread.sleep(j);
    }
}
