package com.p683ss.android.ugc.aweme.sticker.presenter.handler;

import android.view.View;
import android.widget.LinearLayout;
import com.p683ss.android.ugc.aweme.sticker.panel.C46256q;
import com.p683ss.android.ugc.aweme.sticker.panel.C46256q.C46257a;
import com.p683ss.android.ugc.aweme.sticker.panel.p2303b.C46092a;
import com.p683ss.android.ugc.aweme.sticker.panel.p2303b.C46095d;
import com.p683ss.android.ugc.aweme.sticker.panel.p2303b.C46099f;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2310b.C46312b;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46316b;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.d */
public final class C46319d extends C46306b implements C46256q {

    /* renamed from: a */
    private C46095d f116863a;

    /* renamed from: b */
    private C46092a f116864b;

    /* renamed from: c */
    private C46099f f116865c;

    /* renamed from: d */
    private Effect f116866d;

    /* renamed from: e */
    private int f116867e = -1;

    /* renamed from: f */
    private final C46312b f116868f;

    /* renamed from: g */
    private final String f116869g;

    /* renamed from: a */
    public final void mo92780a(C46257a aVar) {
        C52711k.m112240b(aVar, "state");
    }

    /* renamed from: a */
    public final boolean mo93030a(C46315a aVar) {
        C52711k.m112240b(aVar, "session");
        return true;
    }

    /* renamed from: b */
    public final void mo92781b(C46257a aVar) {
        C52711k.m112240b(aVar, "state");
    }

    public final void cl_() {
    }

    /* renamed from: b */
    private final void m100614b() {
        C46099f fVar = this.f116865c;
        if (fVar != null) {
            fVar.mo92793a(null, null);
        }
    }

    /* renamed from: a */
    public final void mo93028a() {
        this.f116866d = null;
        this.f116867e = -1;
        C46099f fVar = this.f116865c;
        if (fVar != null) {
            fVar.mo92793a(null, null);
        }
        C46092a aVar = this.f116864b;
        if (aVar != null) {
            aVar.mo92788a((Effect) null, 0);
        }
        C46095d dVar = this.f116863a;
        if (dVar != null) {
            dVar.mo92790a(null);
        }
    }

    /* renamed from: a */
    private final void m100612a(Effect effect) {
        C46099f fVar = this.f116865c;
        if (fVar != null) {
            fVar.mo92793a(effect, null);
        }
    }

    /* renamed from: a */
    public final void mo92779a(View view) {
        C52711k.m112240b(view, "stickerView");
        this.f116865c = new C46099f((LinearLayout) view.findViewById(R.id.b9s), view.getContext());
        this.f116864b = new C46092a((LinearLayout) view.findViewById(R.id.y8), this.f116868f, view.getContext());
        View findViewById = view.findViewById(R.id.y_);
        C52711k.m112236a((Object) findViewById, "stickerView.findViewById…d.commerce_sticker_goods)");
        this.f116863a = new C46095d((LinearLayout) findViewById, this.f116868f, this.f116869g);
        Effect effect = this.f116866d;
        if (effect != null) {
            m100613a(effect, this.f116867e);
        }
    }

    public C46319d(C46312b bVar, String str) {
        C52711k.m112240b(bVar, "mobHelper");
        C52711k.m112240b(str, "fontType");
        this.f116868f = bVar;
        this.f116869g = str;
    }

    /* renamed from: a */
    private final void m100613a(Effect effect, int i) {
        C46095d dVar = this.f116863a;
        if (dVar == null || !dVar.mo92790a(effect)) {
            C46092a aVar = this.f116864b;
            if (aVar == null || !aVar.mo92788a(effect, i)) {
                m100612a(effect);
            } else {
                m100614b();
            }
        } else {
            C46092a aVar2 = this.f116864b;
            if (aVar2 != null) {
                aVar2.mo92788a((Effect) null, 0);
            }
            m100614b();
        }
    }

    /* renamed from: a */
    public final void mo93029a(C46316b bVar, C46315a aVar) {
        C52711k.m112240b(bVar, "result");
        C52711k.m112240b(aVar, "session");
        Effect effect = aVar.f116852a;
        this.f116866d = effect;
        this.f116867e = aVar.f116853b;
        m100613a(effect, this.f116867e);
    }
}
