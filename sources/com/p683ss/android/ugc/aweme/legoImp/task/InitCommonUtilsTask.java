package com.p683ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32463a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitCommonUtilsTask */
public final class InitCommonUtilsTask implements LegoTask {
    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.MAIN;
    }

    public final void run(Context context) {
        C52711k.m112240b(context, "context");
        C32463a.m75162a((Application) context);
    }
}
