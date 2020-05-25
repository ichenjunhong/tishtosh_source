package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.MobMainAppEndTask */
public class MobMainAppEndTask implements LegoTask {
    private long value = (System.currentTimeMillis() - C22574a.m55738f().f60707h);

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public void run(Context context) {
        C26890h.onEvent(MobClick.obtain().setEventName("load_application_end").setLabelName("perf_monitor").setExtValueLong(this.value));
    }
}
