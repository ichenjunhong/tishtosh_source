package com.p683ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36954b.C36955a;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36954b.C36957c;
import com.p683ss.android.ugc.aweme.miniapp_api.p1958b.C36943e;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.C42322h;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42333b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42354e;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage.C42326a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.MicroAppSharePackage */
public final class MicroAppSharePackage extends SharePackage {

    /* renamed from: b */
    public static final C42187a f106691b = new C42187a(null);

    /* renamed from: a */
    public C36943e f106692a;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.MicroAppSharePackage$a */
    public static final class C42187a {

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.MicroAppSharePackage$a$a */
        public static final class C42188a implements C42354e {

            /* renamed from: a */
            final /* synthetic */ Activity f106693a;

            /* renamed from: b */
            final /* synthetic */ MicroAppSharePackage f106694b;

            /* renamed from: c */
            final /* synthetic */ C36943e f106695c;

            /* renamed from: a */
            public final void mo49961a(C42357g gVar, SharePackage sharePackage, Context context) {
                C52711k.m112240b(gVar, "action");
                C52711k.m112240b(sharePackage, "sharePackage");
                C52711k.m112240b(context, "context");
            }

            /* renamed from: b */
            public final void mo49962b(SharePackage sharePackage, Context context) {
                C52711k.m112240b(sharePackage, "sharePackage");
                C52711k.m112240b(context, "context");
            }

            /* renamed from: a */
            public final void mo49960a(SharePackage sharePackage, Context context) {
                C52711k.m112240b(sharePackage, "sharePackage");
                C52711k.m112240b(context, "context");
                this.f106695c.mo76193b("");
            }

            public C42188a(Activity activity, MicroAppSharePackage microAppSharePackage, C36943e eVar) {
                this.f106693a = activity;
                this.f106694b = microAppSharePackage;
                this.f106695c = eVar;
            }

            /* renamed from: a */
            public final void mo49959a(C42307b bVar, boolean z, SharePackage sharePackage, Context context) {
                C52711k.m112240b(bVar, "channel");
                C52711k.m112240b(context, "context");
                C52711k.m112240b(bVar, "channel");
                C52711k.m112240b(context, "context");
                C42333b bVar2 = this;
                C52711k.m112240b(bVar, "channel");
                C52711k.m112240b(context, "context");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.MicroAppSharePackage$a$b */
        public static final class C42189b implements OnCancelListener {

            /* renamed from: a */
            final /* synthetic */ C36943e f106696a;

            public C42189b(C36943e eVar) {
                this.f106696a = eVar;
            }

            public final void onCancel(DialogInterface dialogInterface) {
                this.f106696a.mo76193b("");
            }
        }

        private C42187a() {
        }

        public /* synthetic */ C42187a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final MicroAppSharePackage mo86157a(C36957c cVar, MicroAppSharePackage microAppSharePackage) {
            C36943e eVar;
            C52711k.m112240b(cVar, "shareContent");
            if (microAppSharePackage != null) {
                eVar = microAppSharePackage.f106692a;
            } else {
                eVar = null;
            }
            return m92573a(cVar, eVar);
        }

        /* renamed from: a */
        public static MicroAppSharePackage m92573a(C36957c cVar, C36943e eVar) {
            boolean z;
            C52711k.m112240b(cVar, "shareContent");
            C23515d.m57687b(cVar.f94340c);
            C42326a aVar = new C42326a();
            C36955a aVar2 = cVar.f94350m;
            C52711k.m112236a((Object) aVar2, "shareContent.appInfo");
            String str = aVar2.f94325a;
            C52711k.m112236a((Object) str, "shareContent.appInfo.appId");
            C42326a b = aVar.mo86239b(str);
            String str2 = cVar.f94339b;
            C52711k.m112236a((Object) str2, "shareContent.title");
            C42326a c = b.mo86240c(str2);
            String str3 = cVar.f94349l;
            if (str3 == null) {
                str3 = "";
            }
            C42326a d = c.mo86241d(str3);
            String b2 = C42149b.m92515b(cVar.f94346i);
            if (b2 == null) {
                b2 = "";
            }
            MicroAppSharePackage microAppSharePackage = new MicroAppSharePackage(d.mo86242e(b2).mo86236a("game"));
            microAppSharePackage.f106692a = eVar;
            Bundle bundle = microAppSharePackage.f106900i;
            C36955a aVar3 = cVar.f94350m;
            C52711k.m112236a((Object) aVar3, "shareContent.appInfo");
            bundle.putString("app_name", aVar3.f94327c);
            bundle.putString("thumb_url", cVar.f94340c);
            String str4 = "is_game";
            C36955a aVar4 = cVar.f94350m;
            C52711k.m112236a((Object) aVar4, "shareContent.appInfo");
            if (aVar4.f94330f == 2) {
                z = true;
            } else {
                z = false;
            }
            bundle.putBoolean(str4, z);
            bundle.putString("query", cVar.f94341d);
            C36955a aVar5 = cVar.f94350m;
            C52711k.m112236a((Object) aVar5, "shareContent.appInfo");
            bundle.putString("app_id", aVar5.f94325a);
            return microAppSharePackage;
        }
    }

    /* renamed from: a */
    public static final MicroAppSharePackage m92570a(C36957c cVar, MicroAppSharePackage microAppSharePackage) {
        return f106691b.mo86157a(cVar, microAppSharePackage);
    }

    public MicroAppSharePackage(C42326a aVar) {
        C52711k.m112240b(aVar, "builder");
        super(aVar);
    }

    /* renamed from: a */
    public final C42318f mo73884a(C42307b bVar) {
        C52711k.m112240b(bVar, "channel");
        return new C42322h(this.f106899h, this.f106897f, this.f106898g);
    }

    /* renamed from: a */
    public final boolean mo85939a(C42307b bVar, Context context) {
        C52711k.m112240b(bVar, "channel");
        C52711k.m112240b(context, "context");
        if (super.mo85939a(bVar, context)) {
            return true;
        }
        C36943e eVar = this.f106692a;
        if (eVar != null) {
            eVar.mo76192a(bVar.mo86136b(), true);
        }
        return true;
    }
}
