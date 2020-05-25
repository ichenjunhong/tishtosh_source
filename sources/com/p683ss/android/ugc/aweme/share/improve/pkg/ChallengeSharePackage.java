package com.p683ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30471a;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30478c.C30479a;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42153d;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42354e;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42354e.C42355a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage.C42326a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.ChallengeSharePackage */
public final class ChallengeSharePackage extends LinkDefaultSharePackage {

    /* renamed from: a */
    public static final C42180a f106674a = new C42180a(null);

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.ChallengeSharePackage$a */
    public static final class C42180a {

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.ChallengeSharePackage$a$a */
        public static final class C42181a implements C42354e {

            /* renamed from: a */
            final /* synthetic */ Challenge f106675a;

            public C42181a(Challenge challenge) {
                this.f106675a = challenge;
            }

            /* renamed from: a */
            public final void mo49960a(SharePackage sharePackage, Context context) {
                C52711k.m112240b(sharePackage, "sharePackage");
                C52711k.m112240b(context, "context");
                C42355a.m92983a(this, sharePackage, context);
            }

            /* renamed from: b */
            public final void mo49962b(SharePackage sharePackage, Context context) {
                C52711k.m112240b(sharePackage, "sharePackage");
                C52711k.m112240b(context, "context");
                C42355a.m92984b(this, sharePackage, context);
            }

            /* renamed from: a */
            public final void mo49961a(C42357g gVar, SharePackage sharePackage, Context context) {
                C52711k.m112240b(gVar, "action");
                C52711k.m112240b(sharePackage, "sharePackage");
                C52711k.m112240b(context, "context");
                if (C42153d.m92523a(gVar)) {
                    m92550a(gVar.mo49954c(), true, sharePackage, context, this.f106675a);
                }
            }

            /* renamed from: a */
            public final void mo49959a(C42307b bVar, boolean z, SharePackage sharePackage, Context context) {
                C52711k.m112240b(bVar, "channel");
                C52711k.m112240b(context, "context");
                C41979aq.m91947b().addShareRecord(bVar.mo86136b(), 2);
                m92550a(bVar.mo86136b(), z, sharePackage, context, this.f106675a);
            }

            /* renamed from: a */
            private static void m92550a(String str, boolean z, SharePackage sharePackage, Context context, Challenge challenge) {
                if (z && challenge != null) {
                    C26851b bVar = new C26851b();
                    bVar.mo54799a(new C30471a());
                    bVar.mo44934a_(new C30479a().mo60897a(challenge.getCid()).mo60896a(1).mo60902d(3).mo60900b(str).mo60898a());
                }
            }
        }

        private C42180a() {
        }

        public /* synthetic */ C42180a(C52707g gVar) {
            this();
        }
    }

    public final int describeContents() {
        return 0;
    }

    public ChallengeSharePackage(C42326a aVar) {
        C52711k.m112240b(aVar, "builder");
        super(aVar);
    }
}
