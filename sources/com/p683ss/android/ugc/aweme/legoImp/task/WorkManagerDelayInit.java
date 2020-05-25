package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import androidx.work.impl.C1626f;
import com.p683ss.android.ugc.aweme.lancet.p1151a.C18971c;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.WorkManagerDelayInit */
public class WorkManagerDelayInit implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.IDLE;
    }

    public void run(Context context) {
        C18971c.m46140a();
        if (C1626f.m5693a() == null) {
            throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
        }
    }
}
