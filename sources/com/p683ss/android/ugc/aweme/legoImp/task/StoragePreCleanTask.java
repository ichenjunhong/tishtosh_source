package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.aweme.storage.C2562f;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.experiment.DeepCleanExperiment;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.legoImp.task.StorageTask.C35966a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.StoragePreCleanTask */
public final class StoragePreCleanTask implements LegoTask {
    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BACKGROUND;
    }

    public final void run(Context context) {
        C52711k.m112240b(context, "context");
        if (!C35966a.m81147a()) {
            int a = C10181b.m20511a().mo18168a(DeepCleanExperiment.class, true, "is_deep_clean_enabled", 31744, 0);
            new StringBuilder("deepSize = ").append(a);
            C2562f.m7493a(a);
            if (a > 0 && C2562f.m7494a(context)) {
                StorageTask.Companion.mo74649a(context, a);
            }
        }
    }
}
