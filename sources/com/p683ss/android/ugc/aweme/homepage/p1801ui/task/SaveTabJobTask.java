package com.p683ss.android.ugc.aweme.homepage.p1801ui.task;

import android.content.Context;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.task.SaveTabJobTask */
public final class SaveTabJobTask implements LegoTask {
    private int tab;

    public final int getTab() {
        return this.tab;
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public final void setTab(int i) {
        this.tab = i;
    }

    public SaveTabJobTask(int i) {
        this.tab = i;
    }

    public final void run(Context context) {
        C52711k.m112240b(context, "context");
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        if (g.isLogin()) {
            C33014a aVar = C33014a.f85743a;
            C33014a.m75944a().storeInt("last_tab_id", this.tab);
        }
    }
}
