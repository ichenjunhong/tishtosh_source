package com.p683ss.android.ugc.aweme.notification.newstyle.p2029f;

import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2027d.C38342g;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.t */
public final class C38404t extends C38383h {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f97750d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38404t.class), "mText", "getMText()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;"))};

    /* renamed from: e */
    private final C52668f f97751e;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.t$a */
    static final class C38405a extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ View f97752a;

        C38405a(View view) {
            this.f97752a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f97752a.findViewById(R.id.text);
        }
    }

    /* renamed from: d */
    private final DmtTextView m85715d() {
        return (DmtTextView) this.f97751e.getValue();
    }

    public C38404t(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        this.f97751e = C52732g.m112285a(new C38405a(view));
    }

    /* renamed from: a */
    public final void mo78315a(C38342g gVar) {
        C52711k.m112240b(gVar, "item");
        switch (gVar.getType()) {
            case 0:
                DmtTextView d = m85715d();
                C52711k.m112236a((Object) d, "mText");
                d.setText(this.f97110c.getString(R.string.ckt));
                return;
            case 1:
                DmtTextView d2 = m85715d();
                C52711k.m112236a((Object) d2, "mText");
                d2.setText(this.f97110c.getString(R.string.cku));
                break;
        }
    }
}
