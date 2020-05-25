package com.p683ss.android.ugc.aweme.sticker.types.multi.p2331a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45814b;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45815a;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45816b;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45858a;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45859b;
import com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2306b.C46141d;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48710o;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.multi.a.b */
public final class C46594b extends C46141d implements OnClickListener {

    /* renamed from: j */
    private List<StickerWrapper> f117564j;

    /* renamed from: b */
    public final void mo92254b(Effect effect) {
        super.mo92254b(effect);
    }

    /* renamed from: a */
    public final void mo92251a(Effect effect) {
        super.mo92251a(effect);
        if (effect.getEffectId().equals(mo92840c().f115779a.getEffectId())) {
            mo92838a(true);
        }
    }

    public final void onClick(View view) {
        StickerWrapper stickerWrapper;
        ClickInstrumentation.onClick(view);
        this.f116454g.mo92989g().mo93015b(mo92840c().f115779a);
        if (mo92840c().f115781c != 2) {
            C45814b bVar = this.f116455h;
            StickerWrapper c = mo92840c();
            int i = this.f116452e;
            C45815a aVar = C45815a.UI_CLICK;
            C46354l lVar = this.f116454g;
            List<StickerWrapper> list = this.f117564j;
            int i2 = this.f116452e;
            C52711k.m112240b(lVar, "$this$findChildFirstNotDownload");
            C52711k.m112240b(list, "stickers");
            if (list.size() >= i2) {
                int i3 = i2 + 1;
                int size = list.size();
                while (true) {
                    if (i3 >= size) {
                        break;
                    } else if (C45859b.m99697a((StickerWrapper) list.get(i3))) {
                        stickerWrapper = (StickerWrapper) list.get(i3);
                        break;
                    } else {
                        i3++;
                    }
                }
                bVar.mo92249a((C45816b<T>) C45858a.m99690a(c, i, aVar, stickerWrapper, null, this, this));
            }
            stickerWrapper = null;
            bVar.mo92249a((C45816b<T>) C45858a.m99690a(c, i, aVar, stickerWrapper, null, this, this));
        }
    }

    /* renamed from: a */
    public final void mo92252a(Effect effect, int i) {
        if (TextUtils.equals(effect.getEffectId(), mo92840c().f115779a.getEffectId())) {
            mo92840c().f115781c = 5;
            this.f116450c.mo93965a(i);
            mo92841d();
        }
    }

    /* renamed from: a */
    public final void mo92253a(Effect effect, C48649d dVar) {
        super.mo92253a(effect, dVar);
        if (effect.getEffectId().equals(mo92840c().f115779a.getEffectId())) {
            C50275d.m108531a(this.f116451d, (int) R.string.awe, 0).mo98174a();
        }
    }

    C46594b(View view, C46354l lVar, C45814b bVar) {
        super(view, lVar, bVar, null);
        C52711k.m112240b(view, "<set-?>");
        this.f116453f = view;
        Context context = view.getContext();
        C52711k.m112240b(context, "<set-?>");
        this.f116451d = context;
        this.itemView.setOnClickListener(this);
    }

    /* renamed from: a */
    public final void mo93385a(StickerWrapper stickerWrapper, boolean z, int i, List<StickerWrapper> list) {
        if (stickerWrapper != null) {
            this.f117564j = list;
            this.f116452e = i;
            mo92837a(this.f116454g.mo92973a().mo92532d().mo92512b(stickerWrapper));
            mo92838a(false);
            mo92841d();
            this.f116450c.mo93969a((String) mo92840c().f115779a.getIconUrl().getUrlList().get(0));
            this.f116454g.mo92980a(mo92840c().f115779a.getId(), mo92840c().f115779a.getTags(), mo92840c().f115779a.getTagsUpdatedAt(), (C48710o) new C48710o() {
                /* renamed from: a */
                public final void mo8641a() {
                }

                /* renamed from: b */
                public final void mo8642b() {
                }
            });
            if (z) {
                this.f116453f.post(new C46596c(this));
            }
        }
    }
}
