package com.p683ss.android.ugc.trill.share.base;

import android.content.Context;
import com.bytedance.p829r.C12660a;
import com.bytedance.p829r.C12662c;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.trill.share.base.ShareCacheRegisterTask */
public final class ShareCacheRegisterTask implements LegoTask {
    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.IDLE;
    }

    public final void run(Context context) {
        C52711k.m112240b(context, "context");
        C12662c.m25453a((C12660a) new C50440i());
    }
}
