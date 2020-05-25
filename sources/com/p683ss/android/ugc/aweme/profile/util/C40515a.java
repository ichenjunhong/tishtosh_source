package com.p683ss.android.ugc.aweme.profile.util;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.imagepipeline.p970j.C14045f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23393g;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.festival.christmas.C31357a;
import com.p683ss.android.ugc.aweme.main.C36606dx;
import com.p683ss.android.ugc.aweme.profile.model.ActivityLinkResponse.LinkInfo;
import com.p683ss.android.ugc.aweme.util.C47641u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.util.a */
public final class C40515a {

    /* renamed from: l */
    public static boolean f103397l;

    /* renamed from: m */
    public static final C40516a f103398m = new C40516a(null);

    /* renamed from: a */
    public C36606dx f103399a;

    /* renamed from: b */
    public boolean f103400b = C31357a.m73095a();

    /* renamed from: c */
    C47641u f103401c = new C47641u("Banner");

    /* renamed from: d */
    public String f103402d = "";

    /* renamed from: e */
    public String f103403e = "";

    /* renamed from: f */
    public final Context f103404f;

    /* renamed from: g */
    public final FrameLayout f103405g;

    /* renamed from: h */
    public final RemoteImageView f103406h;

    /* renamed from: i */
    public final DmtTextView f103407i;

    /* renamed from: j */
    public final ImageView f103408j;

    /* renamed from: k */
    public final ImageView f103409k;

    /* renamed from: com.ss.android.ugc.aweme.profile.util.a$a */
    public static final class C40516a {
        private C40516a() {
        }

        public /* synthetic */ C40516a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.util.a$b */
    public static final class C40517b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40515a f103410a;

        /* renamed from: b */
        final /* synthetic */ LinkInfo f103411b;

        public C40517b(C40515a aVar, LinkInfo linkInfo) {
            this.f103410a = aVar;
            this.f103411b = linkInfo;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f103410a.f103409k != null) {
                this.f103410a.f103409k.setVisibility(8);
            }
            I18nBridgeService.getBridgeService_Monster().jumpToH5(this.f103411b.url, this.f103410a.f103404f);
            if (!C52711k.m112239a((Object) this.f103410a.f103402d, (Object) "others_homepage")) {
                C23089d a = C23089d.m56640a();
                a.mo47829a("enter_from", "personal_homepage");
                if (this.f103410a.f103400b) {
                    a.mo47829a("gen", C31357a.m73100c());
                }
                C26890h.m65011a("h5_enter_detail", a.f61491a);
            }
            if (this.f103410a.f103400b && C52711k.m112239a((Object) this.f103410a.f103402d, (Object) "others_homepage")) {
                C23089d a2 = C23089d.m56640a();
                a2.mo47829a("enter_from", this.f103410a.f103402d);
                a2.mo47829a("to_user_id", this.f103410a.f103403e);
                a2.mo47829a("gen", C31357a.m73100c());
                C26890h.m65011a("xmas_banner_click", a2.f61491a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.util.a$c */
    public static final class C40518c extends C13790c<C14045f> {

        /* renamed from: a */
        final /* synthetic */ C40515a f103412a;

        /* renamed from: b */
        final /* synthetic */ LayoutParams f103413b;

        /* renamed from: c */
        final /* synthetic */ LinkInfo f103414c;

        public C40518c(C40515a aVar, LayoutParams layoutParams, LinkInfo linkInfo) {
            this.f103412a = aVar;
            this.f103413b = layoutParams;
            this.f103414c = linkInfo;
        }

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            super.onFinalImageSet(str, (C14045f) obj, animatable);
            ImageView imageView = this.f103412a.f103408j;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            this.f103413b.gravity = 17;
            this.f103412a.f103407i.setLayoutParams(this.f103413b);
            this.f103412a.f103407i.setTextColor(Color.parseColor(this.f103414c.fontColor));
        }
    }

    public C40515a(Context context, FrameLayout frameLayout, RemoteImageView remoteImageView, DmtTextView dmtTextView, ImageView imageView, ImageView imageView2) {
        C52711k.m112240b(context, "context");
        this.f103404f = context;
        this.f103405g = frameLayout;
        this.f103406h = remoteImageView;
        this.f103407i = dmtTextView;
        this.f103408j = imageView;
        this.f103409k = imageView2;
        Object a = C23393g.m57474a(this.f103404f, C36606dx.class);
        C52711k.m112236a(a, "HomeSpManager.getSP(cont…bPreferences::class.java)");
        this.f103399a = (C36606dx) a;
    }
}
