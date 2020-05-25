package com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2305a.C46124a;
import com.p683ss.android.ugc.effectmanager.common.p2437d.C48636c;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p683ss.android.ugc.tools.view.widget.AVStatusView.C50243a;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.m */
public final class C46162m extends C46119a {

    /* renamed from: s */
    private HashMap f116490s;

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.m$a */
    static final class C46163a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C46162m f116491a;

        C46163a(C46162m mVar) {
            this.f116491a = mVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f116491a.mo92811a();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f116490s != null) {
            this.f116490s.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo92817b() {
        boolean z;
        super.mo92817b();
        if (this.f116380e != null) {
            CategoryEffectModel categoryEffectModel = this.f116380e;
            C52711k.m112236a((Object) categoryEffectModel, "categoryEffectModel");
            Collection effects = categoryEffectModel.getEffects();
            if (effects == null || effects.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return;
            }
        }
        C46124a aVar = this.f116377b;
        C52711k.m112236a((Object) aVar, "mAdapter");
        aVar.mo64318a(C52575l.m112097a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo92816a(Throwable th) {
        if (!(th instanceof C48636c) || ((C48636c) th).getStatusCode() != 8) {
            super.mo92816a(th);
        } else {
            this.f116502r.mo98097c();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        this.f116502r.setBuilder(C50243a.m108469a(getContext()).mo98104a(R.string.f5o, R.string.f5k, R.string.f5u, new C46163a(this)).mo98105a(getLayoutInflater().inflate(R.layout.a0p, null)).mo98106b(1));
    }
}
