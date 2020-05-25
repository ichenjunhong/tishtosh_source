package com.p683ss.android.ugc.aweme.commercialize.utils.p1579a;

import android.content.Context;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26533q.C26534a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.C26346c.C26347a;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.p1580a.C26333a;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.p1580a.C26336d;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.p1580a.C26338e;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.p1580a.C26339f;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.p1580a.C26344g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.d */
public final class C26348d {

    /* renamed from: a */
    public static final C26348d f69532a = new C26348d();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.d$a */
    public static final class C26349a extends C26339f {

        /* renamed from: a */
        final /* synthetic */ Context f69533a;

        /* renamed from: b */
        final /* synthetic */ C52670a f69534b;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.d$a$a */
        static final class C26350a implements C26534a {

            /* renamed from: a */
            final /* synthetic */ C26349a f69535a;

            /* renamed from: b */
            final /* synthetic */ C26325a f69536b;

            C26350a(C26349a aVar, C26325a aVar2) {
                this.f69535a = aVar;
                this.f69536b = aVar2;
            }

            /* renamed from: a */
            public final void mo49915a(boolean z) {
                String str;
                C26080b a = C26077e.m63190a().mo53582a(this.f69536b.f69474e.f69495a);
                if (z) {
                    str = "deeplink_success";
                } else {
                    str = "deeplink_failed";
                }
                a.mo53593b(str).mo53580a(Long.valueOf(this.f69536b.f69470a.f69478b)).mo53604i(this.f69536b.f69470a.f69479c).mo53592b(Long.valueOf(this.f69536b.f69470a.f69480d)).mo53602g(this.f69536b.f69474e.f69496b).mo53586a(this.f69535a.f69533a);
            }
        }

        C26349a(Context context, C52670a aVar) {
            this.f69533a = context;
            this.f69534b = aVar;
        }

        /* renamed from: a */
        public final void mo54081a(boolean z, C26325a aVar) {
            C52711k.m112240b(aVar, "params");
            super.mo54081a(z, aVar);
            if (z) {
                C26077e.m63190a().mo53582a(aVar.f69474e.f69495a).mo53593b("open_url_app").mo53580a(Long.valueOf(aVar.f69470a.f69478b)).mo53604i(aVar.f69470a.f69479c).mo53592b(Long.valueOf(aVar.f69470a.f69480d)).mo53602g(aVar.f69474e.f69496b).mo53586a(this.f69533a);
                C26540w.m64208a((C26534a) new C26350a(this, aVar));
                this.f69534b.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.d$b */
    public static final class C26351b extends C26333a {

        /* renamed from: a */
        final /* synthetic */ C52670a f69537a;

        /* renamed from: a */
        public final boolean mo54084a() {
            return true;
        }

        /* renamed from: b */
        public final boolean mo54085b() {
            this.f69537a.invoke();
            return true;
        }

        C26351b(C52670a aVar) {
            this.f69537a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.d$c */
    public static final class C26352c extends C26339f {

        /* renamed from: a */
        final /* synthetic */ Context f69538a;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.d$c$a */
        static final class C26353a implements C26534a {

            /* renamed from: a */
            final /* synthetic */ C26352c f69539a;

            /* renamed from: b */
            final /* synthetic */ C26325a f69540b;

            C26353a(C26352c cVar, C26325a aVar) {
                this.f69539a = cVar;
                this.f69540b = aVar;
            }

            /* renamed from: a */
            public final void mo49915a(boolean z) {
                String str;
                C26080b a = C26077e.m63190a().mo53582a(this.f69540b.f69474e.f69495a);
                if (z) {
                    str = "landing_deeplink_success";
                } else {
                    str = "landing_deeplink_failed";
                }
                a.mo53593b(str).mo53580a(Long.valueOf(this.f69540b.f69470a.f69478b)).mo53604i(this.f69540b.f69470a.f69479c).mo53592b(Long.valueOf(this.f69540b.f69470a.f69480d)).mo53602g(this.f69540b.f69474e.f69496b).mo53586a(this.f69539a.f69538a);
            }
        }

        public C26352c(Context context) {
            this.f69538a = context;
        }

        /* renamed from: a */
        public final void mo54081a(boolean z, C26325a aVar) {
            C52711k.m112240b(aVar, "params");
            super.mo54081a(z, aVar);
            if (z) {
                C26077e.m63190a().mo53582a(aVar.f69474e.f69495a).mo53593b("landing_open_url_app").mo53580a(Long.valueOf(aVar.f69470a.f69478b)).mo53604i(aVar.f69470a.f69479c).mo53592b(Long.valueOf(aVar.f69470a.f69480d)).mo53602g(aVar.f69474e.f69496b).mo53586a(this.f69538a);
                C26540w.m64208a((C26534a) new C26353a(this, aVar));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.d$d */
    public static final class C26354d extends C26339f {

        /* renamed from: a */
        final /* synthetic */ Context f69541a;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.d$d$a */
        static final class C26355a implements C26534a {

            /* renamed from: a */
            final /* synthetic */ C26354d f69542a;

            /* renamed from: b */
            final /* synthetic */ C26325a f69543b;

            C26355a(C26354d dVar, C26325a aVar) {
                this.f69542a = dVar;
                this.f69543b = aVar;
            }

            /* renamed from: a */
            public final void mo49915a(boolean z) {
                String str;
                C26080b a = C26077e.m63190a().mo53582a(this.f69543b.f69474e.f69495a);
                if (z) {
                    str = "deeplink_success";
                } else {
                    str = "deeplink_failed";
                }
                a.mo53593b(str).mo53580a(Long.valueOf(this.f69543b.f69470a.f69478b)).mo53604i(this.f69543b.f69470a.f69479c).mo53592b(Long.valueOf(this.f69543b.f69470a.f69480d)).mo53602g(this.f69543b.f69474e.f69496b).mo53586a(this.f69542a.f69541a);
            }
        }

        C26354d(Context context) {
            this.f69541a = context;
        }

        /* renamed from: a */
        public final void mo54081a(boolean z, C26325a aVar) {
            C52711k.m112240b(aVar, "params");
            super.mo54081a(z, aVar);
            if (z) {
                C26077e.m63190a().mo53582a(aVar.f69474e.f69495a).mo53593b("open_url_app").mo53580a(Long.valueOf(aVar.f69470a.f69478b)).mo53604i(aVar.f69470a.f69479c).mo53592b(Long.valueOf(aVar.f69470a.f69480d)).mo53602g(aVar.f69474e.f69496b).mo53586a(this.f69541a);
                C26540w.m64208a((C26534a) new C26355a(this, aVar));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.d$e */
    public static final class C26356e extends C26344g {

        /* renamed from: a */
        final /* synthetic */ Context f69544a;

        C26356e(Context context) {
            this.f69544a = context;
        }

        /* renamed from: a */
        public final void mo54081a(boolean z, C26325a aVar) {
            C52711k.m112240b(aVar, "params");
            super.mo54081a(z, aVar);
            if (z) {
                C26077e.m63190a().mo53582a(aVar.f69474e.f69495a).mo53593b("open_url_h5").mo53580a(Long.valueOf(aVar.f69470a.f69478b)).mo53604i(aVar.f69470a.f69479c).mo53592b(Long.valueOf(aVar.f69470a.f69480d)).mo53602g(aVar.f69474e.f69496b).mo53586a(this.f69544a);
            }
        }
    }

    private C26348d() {
    }

    /* renamed from: a */
    public static final C26365g m63784a(Context context, C26325a aVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "params");
        return new C26347a().mo54092a(aVar).mo54090a(context).mo54091a((C26333a) new C26336d()).mo54091a((C26333a) new C26354d(context)).mo54091a((C26333a) new C26338e()).mo54091a((C26333a) new C26356e(context)).f69531a;
    }

    /* renamed from: a */
    public static final C26365g m63785a(Context context, C26325a aVar, C52670a<C52860x> aVar2, C52670a<C52860x> aVar3) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "params");
        C52711k.m112240b(aVar2, "openUrlHandleCallback");
        C52711k.m112240b(aVar3, "downloadCallback");
        return new C26347a().mo54092a(aVar).mo54090a(context).mo54091a((C26333a) new C26349a(context, aVar2)).mo54091a((C26333a) new C26351b(aVar3)).f69531a;
    }
}
