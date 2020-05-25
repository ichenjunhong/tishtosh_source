package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.FetchFriendsRelationTask */
public final class FetchFriendsRelationTask implements LegoTask {
    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public final void run(Context context) {
        IIMService d = C33194e.m76279d();
        C52711k.m112236a((Object) d, "IM.get()");
        d.getFamiliarService().mo72370a();
    }
}
