package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.sysoptimizer.fake.name.SmFakeNameHandler;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.SamangCrashHandleTask */
public final class SamangCrashHandleTask implements LegoTask {
    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BACKGROUND;
    }

    public final void run(Context context) {
        if (context != null) {
            SmFakeNameHandler.start(context);
        }
    }
}
