package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.recommend;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.h */
public final class C34661h extends C1352v {

    /* renamed from: a */
    public final View f89282a;

    /* renamed from: b */
    public final ImageView f89283b;

    /* renamed from: c */
    public final ImageView f89284c;

    /* renamed from: d */
    public final C52670a<C52860x> f89285d;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.h$a */
    public static final class C34662a implements OnClickListener {

        /* renamed from: a */
        public static final C34662a f89286a = new C34662a();

        C34662a() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C34004b a = C34004b.m77717a();
            C52711k.m112236a((Object) a, "AwemeImManager.instance()");
            C35460j f = a.mo71949f();
            C52711k.m112236a((Object) view, "it");
            f.openPrivacyReminder(view.getContext());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.h$b */
    public static final class C34663b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34661h f89287a;

        public C34663b(C34661h hVar) {
            this.f89287a = hVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f89287a.f89284c.setVisibility(8);
            this.f89287a.f89285d.invoke();
        }
    }

    public C34661h(View view, C52670a<C52860x> aVar) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(aVar, "removeListener");
        super(view);
        this.f89285d = aVar;
        View findViewById = view.findViewById(R.id.bas);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.line)");
        this.f89282a = findViewById;
        View findViewById2 = view.findViewById(R.id.c4l);
        C52711k.m112236a((Object) findViewById2, "view.findViewById(R.id.privacyReminderImage)");
        this.f89283b = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.efm);
        C52711k.m112236a((Object) findViewById3, "view.findViewById(R.id.iv_remove_recommend)");
        this.f89284c = (ImageView) findViewById3;
    }
}
