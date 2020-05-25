package com.p683ss.android.ugc.aweme.comment;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.r */
final class C25278r extends ClickableSpan {

    /* renamed from: a */
    private final C29366a f66875a;

    public C25278r(C29366a aVar) {
        C52711k.m112240b(aVar, "emoji");
        this.f66875a = aVar;
    }

    public final void onClick(View view) {
        C52711k.m112240b(view, "widget");
        Context a = C11010c.m22280a();
        if (a != null) {
            SmartRouter.buildRoute(a, "//gif_emoji").withParam("gif_emoji", (Serializable) this.f66875a).open();
        }
    }
}
