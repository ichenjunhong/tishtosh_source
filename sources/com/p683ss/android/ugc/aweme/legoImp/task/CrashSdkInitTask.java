package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.analysis.C22579a;
import com.p683ss.android.ugc.aweme.app.p1375e.C23081a;
import com.p683ss.android.ugc.aweme.common.p1597i.C26897a;
import com.p683ss.android.ugc.aweme.experiment.EnableALogExperiment;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32460c;
import com.p683ss.android.ugc.aweme.i18n.C33091a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.CrashSdkInitTask */
public class CrashSdkInitTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public void run(Context context) {
        if (C26897a.m65024a()) {
            initCrashlyticsWrapper(context);
        }
    }

    private void initCrashlyticsWrapper(Context context) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C22579a(C10181b.m20511a().mo18172a(EnableALogExperiment.class, true, "enable_alog", 31744, true)));
            C32458a.m75142a(context.getApplicationContext(), (List<C32460c>) arrayList);
        } catch (Throwable unused) {
        }
        C18842a.m45934b(C35976c.f92205a);
        C33091a.m76063a();
        new C23081a().run();
    }
}
