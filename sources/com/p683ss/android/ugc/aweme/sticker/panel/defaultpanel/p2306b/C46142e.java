package com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2306b;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45814b;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45815a;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45816b;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45858a;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45859b;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.panel.newpanel.C46236d.C46240d;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48710o;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.b.e */
public final class C46142e extends C46141d implements OnClickListener {

    /* renamed from: j */
    public C46240d f116457j;

    /* renamed from: b */
    public final void mo92256b() {
        super.mo92256b();
        this.f116450c.mo93973b(false);
    }

    /* renamed from: a */
    public final void mo92255a() {
        super.mo92255a();
        this.f116450c.mo93971a(true, 8388693);
        mo92840c().f115784f = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo92843e() {
        if (this.f116453f.getParent() != null) {
            this.f116455h.mo92249a(m100277f());
        }
    }

    /* renamed from: f */
    private C45816b<StickerWrapper> m100277f() {
        StickerWrapper a;
        if (this.f116456i == null) {
            a = null;
        } else {
            a = C45859b.m99696a(this.f116454g, this.f116456i, this.f116452e);
        }
        return C45858a.m99690a(mo92840c(), this.f116452e, C45815a.UI_CLICK, a, null, this, this);
    }

    /* renamed from: b */
    public final void mo92254b(Effect effect) {
        super.mo92254b(effect);
        mo92840c().f115784f = true;
    }

    /* renamed from: a */
    public final void mo92251a(Effect effect) {
        super.mo92251a(effect);
        if (effect.getEffectId().equals(mo92840c().f115779a.getEffectId())) {
            mo92838a(true);
            int adapterPosition = getAdapterPosition();
            if (this.f116457j != null && -1 != adapterPosition) {
                this.f116457j.mo92938a(adapterPosition, true);
            }
        }
    }

    public final void onClick(View view) {
        boolean z;
        ClickInstrumentation.onClick(view);
        int adapterPosition = getAdapterPosition();
        if (-1 != adapterPosition) {
            if (this.f116457j != null) {
                this.f116457j.mo92938a(adapterPosition, false);
            }
            this.f116454g.mo92989g().mo93015b(mo92840c().f115779a);
            View view2 = this.f116450c.f118164b;
            if (view2 == null) {
                C52711k.m112237a("dotView");
            }
            if (view2.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f116450c.mo93974c(false);
            }
            if (mo92840c().f115781c != 2 && !C46059g.m100095s(this.f116454g.mo92985c())) {
                if (C45859b.m99701b(this.f116454g, mo92840c().f115779a)) {
                    this.f116455h.mo92249a((C45816b<T>) C45858a.m99694a(mo92840c(), this.f116452e, C45815a.UI_CLICK, null, 4, null));
                    mo92838a(false);
                    return;
                }
                this.f116454g.mo92979a(mo92840c().f115779a.getId(), mo92840c().f115779a.getTagsUpdatedAt(), C46144f.f116459a);
                this.f116455h.mo92249a(m100277f());
            }
        }
    }

    /* renamed from: a */
    public final void mo92253a(Effect effect, C48649d dVar) {
        super.mo92253a(effect, dVar);
        if (effect.getEffectId().equals(mo92840c().f115779a.getEffectId())) {
            C50275d.m108531a(this.f116451d, (int) R.string.awe, 0).mo98174a();
        }
    }

    public C46142e(View view, C46354l lVar, C45814b bVar, List<StickerWrapper> list) {
        super(view, lVar, bVar, list);
        view.setOnClickListener(this);
    }

    /* renamed from: a */
    public final void mo92842a(StickerWrapper stickerWrapper, List<StickerWrapper> list, int i, int i2) {
        if (stickerWrapper != null && !C9376b.m18558a((Collection<T>) list)) {
            mo92837a(this.f116454g.mo92973a().mo92532d().mo92509a(stickerWrapper));
            mo92838a(false);
            this.f116452e = i2;
            mo92841d();
            if (mo92840c().f115779a.getIconUrl() != null && !C9414h.m18630a(mo92840c().f115779a.getIconUrl().getUrlList())) {
                this.f116450c.mo93969a((String) mo92840c().f115779a.getIconUrl().getUrlList().get(0));
            }
            this.f116454g.mo92980a(mo92840c().f115779a.getId(), mo92840c().f115779a.getTags(), mo92840c().f115779a.getTagsUpdatedAt(), (C48710o) new C48710o() {
                /* renamed from: a */
                public final void mo8641a() {
                }

                /* renamed from: b */
                public final void mo8642b() {
                }
            });
            if (C45859b.m99701b(this.f116454g, stickerWrapper.f115779a)) {
                mo92838a(true);
            } else {
                mo92838a(false);
            }
            this.itemView.setContentDescription(stickerWrapper.f115779a.getName());
            Effect effect = stickerWrapper.f115779a;
            if (this.f116448a != null && this.f116448a.mo92784a(effect, i, i2)) {
                this.f116453f.post(new C46145g(this));
            }
        }
    }
}
