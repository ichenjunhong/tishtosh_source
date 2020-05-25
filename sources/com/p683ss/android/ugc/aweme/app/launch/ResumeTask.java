package com.p683ss.android.ugc.aweme.app.launch;

import android.content.Context;
import com.bytedance.ttnet.p883a.C13258a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.utils.C47775cm;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.launch.ResumeTask */
final class ResumeTask implements LegoTask {
    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        C35898h hVar = C47775cm.f120295a;
        C52711k.m112236a((Object) hVar, "LauncherConstants.RESUME_TASK_WORK_TYPE");
        return hVar;
    }

    public final void run(Context context) {
        C52711k.m112240b(context, "context");
        C13258a.m26667b(context);
    }
}
