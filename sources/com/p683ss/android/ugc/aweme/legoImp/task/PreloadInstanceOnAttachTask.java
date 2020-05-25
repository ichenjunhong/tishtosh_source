package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.setting.C41562b;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.PreloadInstanceOnAttachTask */
public class PreloadInstanceOnAttachTask implements LegoTask {
    private void preloadInstance(Object obj) {
    }

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    public void run(Context context) {
        Keva.getRepo("ab_repo_cold_boot");
        C22574a.m55738f().mo46917a("method_init_abtest_keva", false);
        C41562b.f105272a.f105273b.name();
        C22574a.m55738f().mo46921b("method_init_abtest_keva", false);
        C22574a.m55738f().mo46917a("method_preload_settings", false);
        C22574a.m55738f().mo46921b("method_preload_settings", false);
    }
}
