package com.p683ss.android.ugc.aweme.effect;

import android.arch.lifecycle.C0199s;
import android.support.p030v4.p038f.C0781c;
import android.view.View;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.themechange.base.C46788b;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.C52904aa;
import dmt.p2652av.video.C53030y;

/* renamed from: com.ss.android.ugc.aweme.effect.be */
final /* synthetic */ class C29145be implements C0199s {

    /* renamed from: a */
    private final C29094ad f76392a;

    C29145be(C29094ad adVar) {
        this.f76392a = adVar;
    }

    public final void onChanged(Object obj) {
        C29094ad adVar = this.f76392a;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            adVar.f76268D = booleanValue;
            if (!booleanValue) {
                adVar.f76306m.setVisibility(8);
                adVar.f76307n.setVisibility(8);
            }
            C29218v.m68807a((View) adVar.f76303j, booleanValue, adVar.mo58970j(), adVar.f76266B, (C0781c<Void>) new C29149bi<Void>(adVar, booleanValue));
            if (booleanValue) {
                if (adVar.f76282R != null) {
                    adVar.f76282R.mo94977a(adVar.f76283S);
                }
                if (adVar.f76302i != null) {
                    adVar.f76297d.setValue(C53030y.m112775b(0));
                    adVar.mo58941a(0);
                    adVar.mo58974n();
                }
                adVar.mo58975o();
                if (adVar.f76316w == null) {
                    adVar.f76316w = new C29120av(adVar);
                    adVar.f76313t.mo43039b(adVar.f76316w);
                }
            } else if (adVar.f76282R != null) {
                adVar.f76282R.mo94978b(adVar.f76283S);
            }
            if (bool.booleanValue()) {
                adVar.f76281Q.mo59102l().setValue(C52904aa.m112575a(C46788b.f118235d.mo94007a(true, false, false, false, false), adVar.mo58969i() + C43303dy.m94972c(adVar.f76269E), adVar.mo58970j(), adVar.mo58978r(), C22452a.m55498d(), 0));
                adVar.f76310q.mo87582o();
                return;
            }
            adVar.f76281Q.mo59102l().setValue(C52904aa.m112578b(adVar.f76269E.getResources().getColor(R.color.ip), adVar.mo58969i() + C43303dy.m94972c(adVar.f76269E), adVar.mo58970j(), adVar.mo58978r(), C22452a.m55498d(), 0));
        }
    }
}
