package com.p683ss.android.ugc.aweme.sticker.presenter.handler;

import android.support.p043v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.sticker.C45805a;
import com.p683ss.android.ugc.aweme.sticker.IFavoriteSticker;
import com.p683ss.android.ugc.aweme.sticker.IFavoriteSticker.FavoriteSticker;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45815a;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45859b;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45889c;
import com.p683ss.android.ugc.aweme.sticker.panel.C46190j;
import com.p683ss.android.ugc.aweme.sticker.panel.C46256q;
import com.p683ss.android.ugc.aweme.sticker.panel.C46256q.C46257a;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46316b;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.view.widget.CheckableImageView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.e */
public class C46320e extends C46306b implements C46190j, C46256q {

    /* renamed from: a */
    private IFavoriteSticker f116870a;

    /* renamed from: b */
    private boolean f116871b;

    /* renamed from: c */
    private Effect f116872c;

    /* renamed from: d */
    private final AppCompatActivity f116873d;

    /* renamed from: e */
    private final C46354l f116874e;

    /* renamed from: f */
    private final C45889c f116875f;

    /* renamed from: g */
    private final C45805a f116876g;

    /* renamed from: h */
    private boolean f116877h;

    /* renamed from: a */
    public boolean mo93030a(C46315a aVar) {
        C52711k.m112240b(aVar, "session");
        return true;
    }

    /* renamed from: b */
    public final void mo92781b(C46257a aVar) {
        C52711k.m112240b(aVar, "state");
    }

    /* renamed from: b */
    public final boolean mo92899b() {
        return this.f116871b;
    }

    public final void cl_() {
    }

    /* renamed from: a */
    public final void mo93028a() {
        this.f116872c = null;
        IFavoriteSticker iFavoriteSticker = this.f116870a;
        if (iFavoriteSticker != null) {
            iFavoriteSticker.mo92229a(false);
            iFavoriteSticker.mo92228a((Effect) null);
        }
    }

    /* renamed from: c */
    public final void mo92900c() {
        IFavoriteSticker iFavoriteSticker = this.f116870a;
        if (iFavoriteSticker != null) {
            this.f116871b = true;
            iFavoriteSticker.mo92229a(true);
        }
    }

    /* renamed from: d */
    public final void mo92901d() {
        IFavoriteSticker iFavoriteSticker = this.f116870a;
        if (iFavoriteSticker != null) {
            this.f116871b = false;
            iFavoriteSticker.mo92229a(false);
        }
    }

    /* renamed from: a */
    public final void mo92779a(View view) {
        C52711k.m112240b(view, "stickerView");
        if (this.f116877h) {
            FavoriteSticker favoriteSticker = new FavoriteSticker(this.f116873d, this.f116874e, this.f116875f, this.f116876g, (FrameLayout) view.findViewById(R.id.b9w), (CheckableImageView) view.findViewById(R.id.at5));
            this.f116870a = favoriteSticker;
        }
    }

    /* renamed from: a */
    public final void mo92780a(C46257a aVar) {
        C52711k.m112240b(aVar, "state");
        if (aVar == C46257a.AFTER_ANIMATE && this.f116872c != null && !mo92899b() && this.f116874e.mo92988f()) {
            mo92900c();
            IFavoriteSticker iFavoriteSticker = this.f116870a;
            if (iFavoriteSticker != null) {
                iFavoriteSticker.mo92228a(this.f116872c);
            }
        }
    }

    /* renamed from: a */
    public final void mo93029a(C46316b bVar, C46315a aVar) {
        C52711k.m112240b(bVar, "result");
        C52711k.m112240b(aVar, "session");
        if (!C45859b.m99699a(this.f116874e, aVar.f116852a)) {
            this.f116872c = aVar.f116852a;
            if (aVar.f116854c == C45815a.UI_CLICK) {
                this.f116874e.mo92983a(true);
            }
            if (this.f116874e.mo92988f()) {
                IFavoriteSticker iFavoriteSticker = this.f116870a;
                if (iFavoriteSticker != null) {
                    iFavoriteSticker.mo92229a(true);
                    iFavoriteSticker.mo92228a(aVar.f116852a);
                }
            }
        }
    }

    public C46320e(AppCompatActivity appCompatActivity, C46354l lVar, C45889c cVar, C45805a aVar, boolean z) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(lVar, "stickerDataManager");
        C52711k.m112240b(cVar, "stickerMobHelper");
        this.f116873d = appCompatActivity;
        this.f116874e = lVar;
        this.f116875f = cVar;
        this.f116876g = aVar;
        this.f116877h = z;
    }
}
