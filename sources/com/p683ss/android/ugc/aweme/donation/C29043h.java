package com.p683ss.android.ugc.aweme.donation;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.C22835a;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartAvatarImageView;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.donation.h */
public final class C29043h extends C1352v {

    /* renamed from: f */
    public static final int f75988f = ((int) C9432q.m18687b(C11010c.m22280a().getApplicationContext(), 32.0f));

    /* renamed from: g */
    public static final C29044a f75989g = new C29044a(null);

    /* renamed from: a */
    public final SmartAvatarImageView f75990a;

    /* renamed from: b */
    public final TextView f75991b;

    /* renamed from: c */
    public final TextView f75992c;

    /* renamed from: d */
    public final TextView f75993d;

    /* renamed from: e */
    public final C29020b f75994e;

    /* renamed from: com.ss.android.ugc.aweme.donation.h$a */
    public static final class C29044a {
        private C29044a() {
        }

        public /* synthetic */ C29044a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.h$b */
    static final class C29045b implements OnClickListener {

        /* renamed from: a */
        public static final C29045b f75995a = new C29045b();

        C29045b() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.h$c */
    static final class C29046c implements OnClickListener {

        /* renamed from: a */
        public static final C29046c f75996a = new C29046c();

        C29046c() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.h$d */
    static final class C29047d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C29043h f75997a;

        /* renamed from: b */
        final /* synthetic */ C29048i f75998b;

        C29047d(C29043h hVar, C29048i iVar) {
            this.f75997a = hVar;
            this.f75998b = iVar;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            this.f75997a.f75994e.mo58655k();
            View view2 = this.f75997a.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            SmartRoute buildRoute = SmartRouter.buildRoute(view2.getContext(), "aweme://user/profile/");
            String str2 = "uid";
            User user = this.f75998b.f75999a;
            String str3 = null;
            if (user != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            SmartRoute withParam = buildRoute.withParam(str2, str);
            String str4 = C22835a.f61196a;
            User user2 = this.f75998b.f75999a;
            if (user2 != null) {
                str3 = user2.getSecUid();
            }
            withParam.withParam(str4, str3).withParam("enter_from", this.f75997a.f75994e.mo58650c()).withParam("enter_method", this.f75997a.f75994e.mo58651d()).open();
        }
    }

    public C29043h(View view, C29020b bVar) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(bVar, "fragment");
        super(view);
        this.f75994e = bVar;
        this.f75990a = (SmartAvatarImageView) view.findViewById(R.id.hi);
        this.f75991b = (TextView) view.findViewById(R.id.bpp);
        this.f75992c = (TextView) view.findViewById(R.id.a4e);
        this.f75993d = (TextView) view.findViewById(R.id.ezz);
    }
}
