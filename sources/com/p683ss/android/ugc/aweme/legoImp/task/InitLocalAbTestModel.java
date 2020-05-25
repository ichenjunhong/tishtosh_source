package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.setting.model.LocalAbTestModel;
import com.p683ss.android.ugc.aweme.setting.p2148ui.C41890s;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitLocalAbTestModel */
public class InitLocalAbTestModel implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.MAIN;
    }

    public void run(Context context) {
        LocalAbTestModel localAbTestModel = new LocalAbTestModel();
        C41890s.m91839b().mo49464a(C11010c.m22280a(), "local_ab_test_model", (Object) localAbTestModel);
        C23794bh.m58401o().mo85305a(localAbTestModel);
    }
}
