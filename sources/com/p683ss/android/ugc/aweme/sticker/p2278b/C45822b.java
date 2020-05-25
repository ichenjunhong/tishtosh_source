package com.p683ss.android.ugc.aweme.sticker.p2278b;

import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.p929d.C13745c;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c.C45874b;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45918p;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.p2504a.C50181a.C50185b;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.sticker.b.b */
public final class C45822b {

    /* renamed from: e */
    public static final C45823a f115820e = new C45823a(null);

    /* renamed from: a */
    public boolean f115821a;

    /* renamed from: b */
    public boolean f115822b;

    /* renamed from: c */
    public final C45918p f115823c;

    /* renamed from: d */
    public final C52682m<StickerWrapper, C45874b, C52860x> f115824d;

    /* renamed from: com.ss.android.ugc.aweme.sticker.b.b$a */
    public static final class C45823a {
        private C45823a() {
        }

        public /* synthetic */ C45823a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.b.b$b */
    public static final class C45824b extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C45822b f115825a;

        /* renamed from: b */
        final /* synthetic */ C45874b f115826b;

        /* renamed from: c */
        final /* synthetic */ StickerWrapper f115827c;

        public C45824b(C45822b bVar, C45874b bVar2, StickerWrapper stickerWrapper) {
            this.f115825a = bVar;
            this.f115826b = bVar2;
            this.f115827c = stickerWrapper;
            super(0);
        }

        public final boolean invoke() {
            if (!this.f115825a.f115822b || !this.f115825a.f115821a) {
                return false;
            }
            this.f115826b.mo92251a(this.f115827c.f115779a);
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.b.b$c */
    public static final class C45825c implements C45874b {

        /* renamed from: a */
        final /* synthetic */ C45822b f115828a;

        /* renamed from: b */
        final /* synthetic */ C45874b f115829b;

        /* renamed from: c */
        final /* synthetic */ C45824b f115830c;

        /* renamed from: a */
        public final void mo92251a(Effect effect) {
            C52711k.m112240b(effect, "effect");
            this.f115828a.f115822b = true;
            this.f115830c.invoke();
        }

        /* renamed from: b */
        public final void mo92254b(Effect effect) {
            C52711k.m112240b(effect, "effect");
            this.f115829b.mo92254b(effect);
        }

        /* renamed from: a */
        public final void mo92252a(Effect effect, int i) {
            C52711k.m112240b(effect, "effect");
            this.f115828a.f115822b = false;
            this.f115829b.mo92252a(effect, i);
        }

        /* renamed from: a */
        public final void mo92253a(Effect effect, C48649d dVar) {
            C52711k.m112240b(effect, "effect");
            C52711k.m112240b(dVar, "e");
            this.f115828a.f115822b = false;
            this.f115829b.mo92253a(effect, dVar);
        }

        public C45825c(C45822b bVar, C45874b bVar2, C45824b bVar3) {
            this.f115828a = bVar;
            this.f115829b = bVar2;
            this.f115830c = bVar3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.b.b$d */
    public static final class C45826d implements C50185b {

        /* renamed from: a */
        final /* synthetic */ C45822b f115831a;

        /* renamed from: b */
        final /* synthetic */ C45824b f115832b;

        /* renamed from: a */
        public final void mo86744a(C13745c<C13715a<C14042c>> cVar) {
            C52711k.m112240b(cVar, "dataSource");
            this.f115831a.f115821a = true;
            this.f115832b.invoke();
        }

        /* renamed from: a */
        public final void mo86745a(Exception exc) {
            C52711k.m112240b(exc, "e");
            this.f115831a.f115821a = true;
            this.f115832b.invoke();
        }

        public C45826d(C45822b bVar, C45824b bVar2) {
            this.f115831a = bVar;
            this.f115832b = bVar2;
        }
    }

    public C45822b(C45918p pVar, C52682m<? super StickerWrapper, ? super C45874b, C52860x> mVar) {
        C52711k.m112240b(pVar, "stickerRepository");
        C52711k.m112240b(mVar, "downloader");
        this.f115823c = pVar;
        this.f115824d = mVar;
    }
}
