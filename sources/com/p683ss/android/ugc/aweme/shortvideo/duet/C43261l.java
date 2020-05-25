package com.p683ss.android.ugc.aweme.shortvideo.duet;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48699d;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.l */
public final class C43261l extends C1352v {

    /* renamed from: f */
    public static final C43263a f109395f = new C43263a(null);

    /* renamed from: a */
    AVDmtImageTextView f109396a;

    /* renamed from: b */
    public StickerWrapper f109397b;

    /* renamed from: c */
    public final FrameLayout f109398c;

    /* renamed from: d */
    public final C29252f f109399d;

    /* renamed from: e */
    public final C43264b f109400e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.l$a */
    public static final class C43263a {
        private C43263a() {
        }

        public /* synthetic */ C43263a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.l$b */
    public interface C43264b {
        /* renamed from: a */
        void mo87942a(int i, boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.l$c */
    public static final class C43265c implements C48699d {

        /* renamed from: a */
        final /* synthetic */ C43261l f109402a;

        /* renamed from: b */
        final /* synthetic */ boolean f109403b;

        /* renamed from: a */
        public final void mo8643a(Effect effect) {
            C43261l.m94902a(this.f109402a).f115781c = 2;
            this.f109402a.mo87938a(C43261l.m94902a(this.f109402a));
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            Effect effect = (Effect) obj;
            C43261l.m94902a(this.f109402a).f115781c = 1;
            this.f109402a.mo87938a(C43261l.m94902a(this.f109402a));
            this.f109402a.mo87940b(this.f109403b);
        }

        C43265c(C43261l lVar, boolean z) {
            this.f109402a = lVar;
            this.f109403b = z;
        }

        /* renamed from: a */
        public final void mo8644a(Effect effect, C48649d dVar) {
            C52711k.m112240b(dVar, "e");
            C10691a.m21543b(this.f109402a.f109398c.getContext(), (int) R.string.at2, 0).mo19066a();
        }

        /* renamed from: a */
        public final void mo59191a(Effect effect, int i, long j) {
            C43261l.m94902a(this.f109402a).f115781c = 5;
            C43261l.m94902a(this.f109402a).f115783e = i;
            this.f109402a.mo87938a(C43261l.m94902a(this.f109402a));
        }
    }

    /* renamed from: c */
    public final void mo87941c(boolean z) {
        this.f109396a.mo93970a(z);
    }

    /* renamed from: a */
    public static final /* synthetic */ StickerWrapper m94902a(C43261l lVar) {
        StickerWrapper stickerWrapper = lVar.f109397b;
        if (stickerWrapper == null) {
            C52711k.m112237a("duetLayoutEffect");
        }
        return stickerWrapper;
    }

    /* renamed from: b */
    public final void mo87940b(boolean z) {
        this.f109396a.mo93970a(true);
        this.f109400e.mo87942a(getAdapterPosition(), z);
        mo87941c(true);
    }

    /* renamed from: a */
    public final void mo87938a(StickerWrapper stickerWrapper) {
        this.f109396a.mo93966a(stickerWrapper.f115781c, stickerWrapper.f115783e);
    }

    /* renamed from: a */
    public final void mo87939a(boolean z) {
        StickerWrapper stickerWrapper = this.f109397b;
        if (stickerWrapper == null) {
            C52711k.m112237a("duetLayoutEffect");
        }
        if (stickerWrapper.f115781c != 2) {
            StickerWrapper stickerWrapper2 = this.f109397b;
            if (stickerWrapper2 == null) {
                C52711k.m112237a("duetLayoutEffect");
            }
            if (stickerWrapper2.f115781c == 1) {
                mo87940b(z);
                return;
            }
            StickerWrapper stickerWrapper3 = this.f109397b;
            if (stickerWrapper3 == null) {
                C52711k.m112237a("duetLayoutEffect");
            }
            Effect effect = stickerWrapper3.f115779a;
            C52711k.m112236a((Object) effect, "duetLayoutEffect.effect");
            m94903a(effect, z);
        }
    }

    /* renamed from: a */
    private final void m94903a(Effect effect, boolean z) {
        this.f109399d.mo59123a(effect, (C48705j) new C43265c(this, z));
    }

    public C43261l(FrameLayout frameLayout, C29252f fVar, C43264b bVar) {
        C52711k.m112240b(frameLayout, "parent");
        C52711k.m112240b(fVar, "effectPlatform");
        C52711k.m112240b(bVar, "onItemClickListener");
        super(frameLayout);
        this.f109398c = frameLayout;
        this.f109399d = fVar;
        this.f109400e = bVar;
        View findViewById = this.f109398c.findViewById(R.id.elf);
        C52711k.m112236a((Object) findViewById, "parent.findViewById(R.id.mode_img_view)");
        this.f109396a = (AVDmtImageTextView) findViewById;
        this.itemView.setOnClickListener(new C47687av(this) {

            /* renamed from: a */
            final /* synthetic */ C43261l f109401a;

            {
                this.f109401a = r1;
            }

            /* renamed from: a */
            public final void mo59929a(View view) {
                C52711k.m112240b(view, "v");
                this.f109401a.mo87939a(true);
            }
        });
    }
}
