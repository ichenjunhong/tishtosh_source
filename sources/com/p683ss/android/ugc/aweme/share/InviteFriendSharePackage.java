package com.p683ss.android.ugc.aweme.share;

import android.content.Context;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.friends.p1789c.C32570c;
import com.p683ss.android.ugc.aweme.friends.p1789c.C32570c.C32572b;
import com.p683ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.C42322h;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42295u;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage.C42326a;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.InviteFriendSharePackage */
public final class InviteFriendSharePackage extends LinkDefaultSharePackage {

    /* renamed from: b */
    public static final C41916a f106085b = new C41916a(null);

    /* renamed from: a */
    public C32570c f106086a;

    /* renamed from: com.ss.android.ugc.aweme.share.InviteFriendSharePackage$a */
    public static final class C41916a {
        private C41916a() {
        }

        public /* synthetic */ C41916a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static InviteFriendSharePackage m91862a(C32570c cVar) {
            C52711k.m112240b(cVar, "inviteFriendPresenter");
            C42326a c = new C42326a().mo86240c("");
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            String a = cVar.mo65892a(C47915gg.m103666o(g.getCurUser()));
            C52711k.m112236a((Object) a, "inviteFriendPresenter.ge…e.userService().curUser))");
            InviteFriendSharePackage inviteFriendSharePackage = new InviteFriendSharePackage(c.mo86241d(a).mo86242e("").mo86236a("text"));
            inviteFriendSharePackage.mo85938a(cVar);
            return inviteFriendSharePackage;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.InviteFriendSharePackage$b */
    static final class C41917b implements C32572b {

        /* renamed from: a */
        final /* synthetic */ InviteFriendSharePackage f106087a;

        /* renamed from: b */
        final /* synthetic */ C42307b f106088b;

        /* renamed from: c */
        final /* synthetic */ Context f106089c;

        C41917b(InviteFriendSharePackage inviteFriendSharePackage, C42307b bVar, Context context) {
            this.f106087a = inviteFriendSharePackage;
            this.f106088b = bVar;
            this.f106089c = context;
        }

        /* renamed from: a */
        public final void mo65900a(String str) {
            if (this.f106088b instanceof C42295u) {
                C42307b bVar = this.f106088b;
                C52711k.m112236a((Object) str, "it");
                bVar.mo49947a((C42318f) new C42322h(str, this.f106087a.f106897f, this.f106087a.f106898g), this.f106089c);
                return;
            }
            C42307b bVar2 = this.f106088b;
            C52711k.m112236a((Object) str, "it");
            bVar2.mo49947a((C42318f) new C42322h(str, this.f106087a.f106897f, this.f106087a.f106898g), this.f106089c);
        }
    }

    /* renamed from: b */
    public static final InviteFriendSharePackage m91859b(C32570c cVar) {
        return C41916a.m91862a(cVar);
    }

    /* renamed from: a */
    public final void mo85938a(C32570c cVar) {
        C52711k.m112240b(cVar, "<set-?>");
        this.f106086a = cVar;
    }

    public InviteFriendSharePackage(C42326a aVar) {
        C52711k.m112240b(aVar, "builder");
        super(aVar);
    }

    /* renamed from: a */
    public final boolean mo85939a(C42307b bVar, Context context) {
        C52711k.m112240b(bVar, "channel");
        C52711k.m112240b(context, "context");
        C26890h.m65011a("invite_via", C23089d.m56640a().mo47829a("platform", bVar.mo86136b()).mo47829a("enter_from", "invite_friends").f61491a);
        if (this.f106086a == null) {
            C52711k.m112237a("presenter");
        }
        C32570c cVar = this.f106086a;
        if (cVar == null) {
            C52711k.m112237a("presenter");
        }
        String a = C32570c.m75348a(cVar.mo65896b(), bVar.mo86136b(), "invitevia", "invite_friends", false);
        C41979aq.m91947b().addShareRecord(bVar.mo86136b(), 2);
        C32570c cVar2 = this.f106086a;
        if (cVar2 == null) {
            C52711k.m112237a("presenter");
        }
        cVar2.mo65895a(a, new C41917b(this, bVar, context));
        return true;
    }
}
