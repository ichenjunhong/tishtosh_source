package com.p683ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.p1807im.disableim.ImUnder16Manger;
import com.p683ss.android.ugc.aweme.p1807im.disableim.ImUnder16Manger.C33183a;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.FetchImUnder16RequestTask */
public final class FetchImUnder16RequestTask implements LegoTask {
    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public final void run(Context context) {
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        if (g.isLogin()) {
            ImUnder16Manger.f86148a.getUnder16Info().mo20a((C0011g<TResult, TContinuationResult>) C33183a.f86164a, (Executor) C0013i.f24a);
        }
    }
}
