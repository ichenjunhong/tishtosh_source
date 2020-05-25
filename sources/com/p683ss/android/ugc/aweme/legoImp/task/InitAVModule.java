package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.dmt_integration.AVInitializerImpl;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46802c;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46803d;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46805f;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46806g;
import com.p683ss.android.ugc.aweme.tools.p2346a.p2347a.C46800b;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitAVModule */
public class InitAVModule implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.MAIN;
    }

    public void run(Context context) {
        C22574a.m55738f().mo46917a("method_av_module_init_duration", false);
        AVInitializerImpl.createIAVInitializerbyMonsterPlugin().initialize(AwemeApplication.m56199a());
        C46806g.f118267b = false;
        C46805f fVar = C46805f.MAIN_BUSINESS;
        C46802c bVar = new C46800b();
        if (C46806g.f118267b) {
            bVar = new C46803d(bVar);
        }
        C46806g.f118266a.put(fVar, bVar);
        C22574a.m55738f().mo46921b("method_av_module_init_duration", false);
    }
}
