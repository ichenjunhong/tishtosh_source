package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.trill.abtest.C50295b;
import com.p683ss.android.ugc.trill.abtest.impl.C50297a;
import com.p683ss.android.ugc.trill.abtest.impl.C50300b;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitAbTest */
public class InitAbTest implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.MAIN;
    }

    public void run(Context context) {
        C50295b.m108561a().mo98202a("attract_user_without_login_back", new C50297a());
        C50295b.m108561a().mo98202a("attract_user_without_login_home", new C50300b());
    }
}
