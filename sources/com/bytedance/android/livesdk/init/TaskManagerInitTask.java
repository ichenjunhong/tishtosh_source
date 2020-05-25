package com.bytedance.android.livesdk.init;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.live.p179a.C2941a;
import com.bytedance.android.livesdk.p392l.C7734a;
import com.bytedance.common.utility.p523c.C9388b;
import com.bytedance.ies.p661d.p662a.C10632b;
import com.bytedance.ies.p661d.p662a.C10632b.C10634a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

@C2941a(mo7578a = 4)
public class TaskManagerInitTask extends C7734a {
    public List<Integer> preTasks() {
        return Arrays.asList(new Integer[]{Integer.valueOf(0)});
    }

    public void run() {
        C10634a aVar = new C10634a();
        new C9388b("live-work-threads", true);
        Executor c = C24076h.m58902c();
        if (c == null) {
            c = C10632b.f28171a;
        }
        aVar.f28179a = c;
        C10632b a = C10632b.m21416a();
        a.f28175e = aVar.f28179a;
        C10632b.f28173c = new Handler(Looper.getMainLooper());
        a.f28174d = true;
    }
}
