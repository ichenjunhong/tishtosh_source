package com.p683ss.android.ugc.aweme.profile.edit;

import android.app.Activity;
import android.graphics.drawable.Animatable;
import android.view.View;
import com.facebook.drawee.p942h.C13842a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.i18n.musically.cut.C33141f;
import com.p683ss.android.ugc.aweme.i18n.musically.cut.C33141f.C33145a;
import com.p683ss.android.ugc.aweme.profile.C39833e;
import com.p683ss.android.ugc.aweme.profile.C39875h;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.service.C40026s;
import com.p683ss.android.ugc.aweme.profile.util.C40557p;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.C42205l;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.g */
public final class C39847g implements C39875h {

    /* renamed from: g */
    public static boolean f101668g;

    /* renamed from: h */
    public static final C39849b f101669h = new C39849b(null);

    /* renamed from: a */
    public final C40557p f101670a;

    /* renamed from: b */
    boolean f101671b;

    /* renamed from: c */
    public final C42205l f101672c;

    /* renamed from: d */
    public final Activity f101673d;

    /* renamed from: e */
    public final AvatarImageView f101674e;

    /* renamed from: f */
    public User f101675f;

    /* renamed from: i */
    private final C39833e f101676i = new C39850c(this);

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.g$a */
    static final class C39848a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C39847g f101677a;

        C39848a(C39847g gVar) {
            this.f101677a = gVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C39847g gVar = this.f101677a;
            gVar.f101671b = true;
            gVar.f101674e.mo48931b();
            C13842a controller = gVar.f101674e.getController();
            if (controller != null) {
                C52711k.m112236a((Object) controller, "cont");
                Animatable i = controller.mo25749i();
                if (i != null && !i.isRunning()) {
                    i.start();
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.g$b */
    public static final class C39849b {
        private C39849b() {
        }

        /* renamed from: a */
        public static boolean m88609a() {
            boolean z = C39847g.f101668g;
            C39847g.f101668g = false;
            return z;
        }

        public /* synthetic */ C39849b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.g$c */
    public static final class C39850c implements C39833e {

        /* renamed from: a */
        final /* synthetic */ C39847g f101678a;

        /* renamed from: com.ss.android.ugc.aweme.profile.edit.g$c$a */
        static final class C39851a implements C33145a {

            /* renamed from: a */
            final /* synthetic */ C39850c f101679a;

            C39851a(C39850c cVar) {
                this.f101679a = cVar;
            }

            /* renamed from: a */
            public final void mo70187a(String str) {
                C42205l lVar = this.f101679a.f101678a.f101672c;
                if (lVar != null) {
                    C52711k.m112236a((Object) str, "filePath");
                    lVar.mo42941a(str);
                }
                C39847g.f101668g = true;
            }
        }

        /* renamed from: a */
        public final void mo80916a() {
            C40557p pVar = this.f101678a.f101670a;
            if (pVar != null) {
                pVar.mo82834c(0);
            }
        }

        /* renamed from: b */
        public final void mo80917b() {
            new C33141f().mo70183a(this.f101678a.f101673d, new C39851a(this));
        }

        /* renamed from: c */
        public final void mo80918c() {
            User user = this.f101678a.f101675f;
            if (user != null) {
                C40026s.f101964a.startHeaderDetailActivity(this.f101678a.f101673d, (View) this.f101678a.f101674e, user, false, false);
            }
        }

        C39850c(C39847g gVar) {
            this.f101678a = gVar;
        }
    }

    /* renamed from: a */
    public final void mo80952a() {
        if (!this.f101673d.isFinishing()) {
            C42205l lVar = this.f101672c;
            if (lVar != null) {
                lVar.mo42938a();
            }
            this.f101674e.mo48932c();
        }
    }

    /* renamed from: a */
    public final void mo80954a(User user) {
        this.f101675f = user;
    }

    /* renamed from: a */
    public final void mo80953a(UrlModel urlModel) {
        if (urlModel != null && !this.f101671b) {
            C42205l lVar = this.f101672c;
            if (lVar != null) {
                lVar.mo42939a(urlModel);
            }
        }
    }

    public C39847g(Activity activity, AvatarImageView avatarImageView, C40557p pVar, User user) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(avatarImageView, "originImage");
        this.f101673d = activity;
        this.f101674e = avatarImageView;
        this.f101675f = user;
        this.f101670a = pVar;
        C42205l obtainAvatarEditableShareDialog = C41979aq.m91946a().obtainAvatarEditableShareDialog(this.f101675f, this.f101673d, this.f101676i);
        if (obtainAvatarEditableShareDialog != null) {
            obtainAvatarEditableShareDialog.mo42940a((C52670a<C52860x>) new C39848a<C52860x>(this));
        }
        this.f101672c = obtainAvatarEditableShareDialog;
    }
}
