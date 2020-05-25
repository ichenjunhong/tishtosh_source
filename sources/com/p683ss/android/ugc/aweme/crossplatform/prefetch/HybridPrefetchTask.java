package com.p683ss.android.ugc.aweme.crossplatform.prefetch;

import android.content.Context;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.HybridPrefetchTask */
public final class HybridPrefetchTask implements LegoTask {
    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public final void run(Context context) {
        String a = C27263b.f71934c.mo55646a();
        C27263b bVar = C27263b.f71934c;
        if (a == null) {
            a = "";
        }
        bVar.mo55647a(a);
    }
}
