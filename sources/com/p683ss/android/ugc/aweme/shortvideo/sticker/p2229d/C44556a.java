package com.p683ss.android.ugc.aweme.shortvideo.sticker.p2229d;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44625e;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44626f;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44643a;
import com.p683ss.android.ugc.aweme.sticker.C46063m;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.d.a */
public final class C44556a extends C44643a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f112731a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44556a.class), "presenter", "getPresenter()Lcom/ss/android/ugc/aweme/shortvideo/sticker/donation/DonationStickerPresenter;"))};

    /* renamed from: b */
    public final C44626f f112732b;

    /* renamed from: k */
    private View f112733k;

    /* renamed from: l */
    private final C52668f f112734l;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.d.a$a */
    static final class C44557a extends C52712l implements C52670a<C44558b> {

        /* renamed from: a */
        final /* synthetic */ C44556a f112735a;

        /* renamed from: b */
        final /* synthetic */ Context f112736b;

        /* renamed from: c */
        final /* synthetic */ InteractStickerStruct f112737c;

        /* renamed from: d */
        final /* synthetic */ C46063m f112738d;

        C44557a(C44556a aVar, Context context, InteractStickerStruct interactStickerStruct, C46063m mVar) {
            this.f112735a = aVar;
            this.f112736b = context;
            this.f112737c = interactStickerStruct;
            this.f112738d = mVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C44558b bVar = new C44558b(this.f112736b, this.f112735a, this.f112737c, this.f112738d, this.f112735a.f112732b);
            return bVar;
        }
    }

    /* renamed from: i */
    private final C44558b m97484i() {
        return (C44558b) this.f112734l.getValue();
    }

    /* renamed from: a */
    public final int mo90484a() {
        return 6;
    }

    /* renamed from: b */
    public final void mo90489b() {
    }

    /* renamed from: d */
    public final void mo90491d() {
    }

    /* renamed from: c */
    public final View mo90490c() {
        return new View(this.f112937h);
    }

    /* renamed from: a */
    public final View mo90485a(int i) {
        if (this.f112733k == null) {
            this.f112733k = new FrameLayout(this.f112937h);
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            View view = this.f112733k;
            if (view != null) {
                view.setLayoutParams(layoutParams);
            }
        }
        return this.f112733k;
    }

    /* renamed from: a */
    public final boolean mo90487a(long j, int i, float f, float f2) {
        return m97484i().mo90487a(j, i, f, f2);
    }

    /* renamed from: a */
    public final boolean mo90488a(long j, int i, float f, float f2, C44625e eVar) {
        C52711k.m112240b(eVar, "poiPopListener");
        return m97484i().mo90488a(j, i, f, f2, eVar);
    }

    public C44556a(int i, Context context, View view, InteractStickerStruct interactStickerStruct, C46063m mVar, C44626f fVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(view, "contentView");
        C52711k.m112240b(interactStickerStruct, "stickerStruct");
        super(i, context, view, interactStickerStruct, mVar);
        this.f112732b = fVar;
        this.f112734l = C52732g.m112285a(new C44557a(this, context, interactStickerStruct, mVar));
    }
}
