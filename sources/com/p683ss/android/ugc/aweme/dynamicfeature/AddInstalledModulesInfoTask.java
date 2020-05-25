package com.p683ss.android.ugc.aweme.dynamicfeature;

import android.content.Context;
import android.os.Build.VERSION;
import com.bytedance.common.utility.p523c.C9393e;
import com.bytedance.crash.C9571d;
import com.bytedance.crash.C9610j;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.dynamicfeature.AddInstalledModulesInfoTask */
public final class AddInstalledModulesInfoTask implements LegoTask {

    /* renamed from: com.ss.android.ugc.aweme.dynamicfeature.AddInstalledModulesInfoTask$a */
    static final class C29071a implements Runnable {

        /* renamed from: a */
        public static final C29071a f76199a = new C29071a();

        C29071a() {
        }

        public final void run() {
            C9610j.m19138b(C290721.f76200a, C9571d.ALL);
        }
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public final void run(Context context) {
        C52711k.m112240b(context, "context");
        if (VERSION.SDK_INT >= 21) {
            C9393e.submitRunnable(C29071a.f76199a);
        }
    }
}
