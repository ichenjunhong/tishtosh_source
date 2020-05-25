package com.p683ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import com.p683ss.android.ugc.aweme.common.C26851b;
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
import com.p683ss.android.ugc.aweme.sticker.model.C46069d;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage */
public final class StickerSharePackage extends LinkDefaultSharePackage {

    /* renamed from: a */
    public static final C42193a f106701a = new C42193a(null);

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage$a */
    public static final class C42193a {

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage$a$a */
        public static final class C42194a implements C42354e {

            /* renamed from: a */
            final /* synthetic */ C46069d f106702a;

            public C42194a(C46069d dVar) {
                this.f106702a = dVar;
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
                    m92582a(gVar.mo49954c(), true, sharePackage, context, this.f106702a);
                }
            }

            /* renamed from: a */
            public final void mo49959a(C42307b bVar, boolean z, SharePackage sharePackage, Context context) {
                C52711k.m112240b(bVar, "channel");
                C52711k.m112240b(context, "context");
                C41979aq.m91947b().addShareRecord(bVar.mo86136b(), 2);
                m92582a(bVar.mo86136b(), z, sharePackage, context, this.f106702a);
            }

            /* renamed from: a */
            private static void m92582a(String str, boolean z, SharePackage sharePackage, Context context, C46069d dVar) {
                if (z && dVar != null) {
                    C26851b bVar = new C26851b();
                    bVar.mo54799a(new C30471a());
                    bVar.mo44934a_(new C30479a().mo60897a(dVar.f116246id).mo60896a(1).mo60902d(5).mo60900b(str).mo60898a());
                }
            }
        }

        private C42193a() {
        }

        public /* synthetic */ C42193a(C52707g gVar) {
            this();
        }
    }

    public StickerSharePackage(C42326a aVar) {
        C52711k.m112240b(aVar, "builder");
        super(aVar);
    }
}
