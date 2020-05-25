package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.MobLaunchEventTask */
public class MobLaunchEventTask implements LegoTask {
    private long duration;
    private boolean isFirstStart;

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    public void run(Context context) {
        String str;
        String str2;
        C32458a.m75144a("MobLaunchEventTask");
        String str3 = "aweme_app_performance";
        if (this.isFirstStart) {
            str = "first_launch_time";
        } else {
            str = "launch_time";
        }
        C23131p.m57778a(str3, str, (float) this.duration);
        MobClick obtain = MobClick.obtain();
        if (this.isFirstStart) {
            str2 = "first_launch_time";
        } else {
            str2 = "launch_time";
        }
        C26890h.onEvent(obtain.setEventName(str2).setLabelName("perf_monitor").setExtValueLong(this.duration));
    }

    public MobLaunchEventTask(boolean z, long j) {
        this.isFirstStart = z;
        this.duration = j;
    }
}
