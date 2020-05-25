package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.utils.C47910gb;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.TrimMemoryTask */
public class TrimMemoryTask implements LegoTask {
    private int level;

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    public TrimMemoryTask(int i) {
        this.level = i;
    }

    public void run(Context context) {
        C32458a.m75144a("TrimMemoryTask");
        C47910gb.m103634a(this.level);
    }
}
