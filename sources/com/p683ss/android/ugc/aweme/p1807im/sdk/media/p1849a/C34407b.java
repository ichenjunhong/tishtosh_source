package com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1849a;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35200an;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.a.b */
public final class C34407b {

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.a.b$a */
    static final class C34408a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52671b f88785a;

        C34408a(C52671b bVar) {
            this.f88785a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C35200an.m79575a(view, (long) C35200an.f90491b)) {
                C52671b bVar = this.f88785a;
                C52711k.m112236a((Object) view, "it");
                bVar.invoke(view);
            }
        }
    }

    /* renamed from: a */
    public static final void m78359a(View view, C52671b<? super View, C52860x> bVar) {
        C52711k.m112240b(view, "$this$setNoDoubleClickListener");
        C52711k.m112240b(bVar, "block");
        view.setOnClickListener(new C34408a(bVar));
    }
}
