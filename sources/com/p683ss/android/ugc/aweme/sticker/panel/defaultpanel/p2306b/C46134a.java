package com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2306b;

import android.os.Bundle;
import android.text.TextUtils;
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
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c.C45874b;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c.C45875c;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48710o;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.b.a */
public final class C46134a extends C46141d implements OnClickListener {
    /* renamed from: b */
    public final void mo92254b(Effect effect) {
        super.mo92254b(effect);
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f116454g.mo92989g().mo93015b(mo92840c().f115779a);
        if (mo92840c().f115781c != 2) {
            this.f116454g.mo92979a(mo92840c().f115779a.getId(), mo92840c().f115779a.getTagsUpdatedAt(), C46136b.f116430a);
            this.f116455h.mo92249a((C45816b<T>) C45858a.m99691a(mo92840c(), this.f116452e, C45815a.UI_CLICK, (StickerWrapper) null, (Bundle) null, (C45874b) null, (C45875c) null, 60, (Object) null));
        }
    }

    /* renamed from: a */
    public final void mo92253a(Effect effect, C48649d dVar) {
        super.mo92253a(effect, dVar);
        if (TextUtils.equals(effect.getEffectId(), mo92840c().f115779a.getEffectId())) {
            C50275d.m108531a(this.f116451d, (int) R.string.awe, 0).mo98174a();
        }
    }

    /* renamed from: a */
    public final void mo92832a(StickerWrapper stickerWrapper, List<StickerWrapper> list, int i) {
        if (stickerWrapper != null && !C9376b.m18558a((Collection<T>) list)) {
            mo92837a(this.f116454g.mo92973a().mo92532d().mo92509a(stickerWrapper));
            mo92838a(false);
            this.f116452e = i;
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
            this.itemView.setContentDescription(stickerWrapper.f115779a.getName());
        }
    }

    public C46134a(View view, C46354l lVar, C45814b bVar, List<StickerWrapper> list) {
        super(view, lVar, bVar, list);
        view.setOnClickListener(this);
    }
}
