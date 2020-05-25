package com.p683ss.android.ugc.aweme.sticker.panel.p2303b;

import android.text.TextUtils;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.account.model.C22055c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.p683ss.android.ugc.tools.view.widget.AVTextView;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.b.h */
final /* synthetic */ class C46102h implements C0011g {

    /* renamed from: a */
    private final C46099f f116346a;

    /* renamed from: b */
    private final Effect f116347b;

    /* renamed from: c */
    private final C46098e f116348c;

    C46102h(C46099f fVar, Effect effect, C46098e eVar) {
        this.f116346a = fVar;
        this.f116347b = effect;
        this.f116348c = eVar;
    }

    public final Object then(C0013i iVar) {
        C22055c cVar;
        C46099f fVar = this.f116346a;
        Effect effect = this.f116347b;
        C46098e eVar = this.f116348c;
        if (iVar.mo31c() || iVar.mo33d()) {
            cVar = (C22055c) fVar.f116342f.get(effect.getDesignerId());
        } else {
            cVar = (C22055c) iVar.mo34e();
        }
        if (eVar != null && !eVar.mo92792a()) {
            return null;
        }
        if (effect.equals(fVar.f116343g)) {
            if (cVar == null) {
                fVar.f116337a.setVisibility(8);
                return null;
            }
            fVar.f116337a.setVisibility(0);
            C50181a.m108287a((SimpleDraweeView) fVar.f116338b, cVar.mo46161e());
            fVar.f116339c.setText(cVar.mo46163g());
            if (C39629l.m88232a().mo58564B().mo74268b()) {
                AVTextView aVTextView = fVar.f116339c;
                String str = cVar == null ? "" : TextUtils.isEmpty(cVar.mo46157a()) ? cVar.mo46158b() == null ? "" : cVar.mo46158b() : cVar.mo46157a();
                aVTextView.setText(str);
            }
        }
        fVar.f116342f.put(effect.getDesignerId(), cVar);
        return null;
    }
}
