package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.AssistantTask */
public final class AssistantTask implements LegoTask {
    public static final C35932a Companion = new C35932a(null);

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.AssistantTask$a */
    public static final class C35932a {
        private C35932a() {
        }

        public /* synthetic */ C35932a(C52707g gVar) {
            this();
        }
    }

    public static final void openDebugPage(Context context) {
        C52711k.m112240b(context, "context");
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BACKGROUND;
    }

    public final void run(Context context) {
        C52711k.m112240b(context, "context");
        try {
            C52711k.m112236a((Object) C23794bh.m58412z(), "LegacyServiceUtils.getInitService()");
        } catch (Throwable unused) {
        }
    }
}
