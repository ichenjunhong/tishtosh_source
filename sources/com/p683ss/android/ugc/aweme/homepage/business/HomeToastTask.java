package com.p683ss.android.ugc.aweme.homepage.business;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.homepage.business.HomeToastTask */
public final class HomeToastTask implements LegoTask {
    private final boolean isShowABToast;

    /* renamed from: com.ss.android.ugc.aweme.homepage.business.HomeToastTask$a */
    static final class C32979a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f85696a;

        /* renamed from: b */
        final /* synthetic */ long f85697b;

        C32979a(Context context, long j) {
            this.f85696a = context;
            this.f85697b = j;
        }

        public final void run() {
            String str;
            Context context = this.f85696a;
            Context context2 = this.f85696a;
            if (context2 != null) {
                str = context2.getString(R.string.d66, new Object[]{Long.valueOf(this.f85697b)});
            } else {
                str = null;
            }
            C10691a.m21551c(context, str).mo19066a();
        }
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public HomeToastTask(boolean z) {
        this.isShowABToast = z;
    }

    public final void run(Context context) {
        Context context2;
        C32458a.m75144a("ToastTask");
        long c = C23859b.m58575b().mo49473c(context, "red_point_count");
        if (c > 0) {
            if (!C47915gg.m103651b()) {
                Activity g = C11016e.m22312g();
                if (g != null) {
                    context2 = g;
                } else {
                    context2 = context;
                }
                new Handler(Looper.getMainLooper()).post(new C32979a(context2, c));
            }
            C23131p.m56692a("log_red_badge", "click", C23088c.m56631a().mo47824a("count", String.valueOf(c)).mo47825b());
            C26890h.onEvent(MobClick.obtain().setEventName("red_badge").setLabelName("click").setValue(String.valueOf(c)));
            C23859b.m58575b().mo49463a(context, "red_point_count", 0);
        }
    }
}
