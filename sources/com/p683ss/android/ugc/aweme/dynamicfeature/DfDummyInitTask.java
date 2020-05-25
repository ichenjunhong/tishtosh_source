package com.p683ss.android.ugc.aweme.dynamicfeature;

import android.content.Context;
import com.bytedance.common.utility.p523c.C9393e;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.experiment.DfDummyExperiment;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.dynamicfeature.DfDummyInitTask */
public class DfDummyInitTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    private void initDfDummy() {
        C9393e.submitRunnable(C29073a.f76201a);
    }

    static final /* synthetic */ void lambda$initDfDummy$0$DfDummyInitTask() {
        C29074b bVar = new C29074b();
        if (C29074b.m66172c()) {
            bVar.mo55969b();
        }
    }

    public void run(Context context) {
        if (C10181b.m20511a().mo18172a(DfDummyExperiment.class, true, "enable_df_dummy", 31744, false)) {
            initDfDummy();
        }
    }
}
