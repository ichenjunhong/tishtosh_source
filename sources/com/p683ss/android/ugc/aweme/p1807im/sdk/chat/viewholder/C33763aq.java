package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.DefaultIMService;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SayHelloContent;
import com.p683ss.android.ugc.aweme.p1807im.service.C35428b;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.aq */
public final class C33763aq extends C33805c<SayHelloContent> {

    /* renamed from: u */
    private View f87571u;

    /* renamed from: v */
    private C33742ah f87572v;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71779a() {
        super.mo71779a();
        View findViewById = this.itemView.findViewById(R.id.ch0);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.sayHelloRv)");
        this.f87571u = findViewById;
    }

    public C33763aq(View view, int i) {
        C52711k.m112240b(view, "itemView");
        super(view, i);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo71780a(C11207p pVar, C11207p pVar2, BaseContent baseContent, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        SayHelloContent sayHelloContent = (SayHelloContent) baseContent;
        super.mo71780a(pVar, pVar2, sayHelloContent, i);
        boolean z5 = false;
        if (!(pVar == null || sayHelloContent == null)) {
            IIMService provideIMService_Monster = DefaultIMService.provideIMService_Monster();
            C52711k.m112236a((Object) provideIMService_Monster, "IMServiceManager.getServ…e(IIMService::class.java)");
            provideIMService_Monster.getAbInterface();
            Collection emoji = sayHelloContent.getEmoji();
            if (emoji == null || emoji.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z || sayHelloContent.getEmoji().size() < 3) {
                z2 = false;
            } else {
                z2 = true;
            }
            Collection jokerEmojis = sayHelloContent.getJokerEmojis();
            if (jokerEmojis == null || jokerEmojis.isEmpty()) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z6 = !z3;
            if (z2 || z6) {
                IIMService provideIMService_Monster2 = DefaultIMService.provideIMService_Monster();
                C52711k.m112236a((Object) provideIMService_Monster2, "IMServiceManager.getServ…e(IIMService::class.java)");
                C35428b abInterface = provideIMService_Monster2.getAbInterface();
                if (abInterface == null || abInterface.mo70324e() != 1) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z4 && !z6 && z2) {
                    z4 = false;
                }
                if (!z4 && !z2 && z6) {
                    z4 = true;
                }
                if (z4) {
                    if (!(this.f87572v instanceof C33755ao)) {
                        C33742ah ahVar = this.f87572v;
                        if (ahVar != null) {
                            ahVar.mo71791a(false);
                        }
                        this.f87572v = new C33755ao(this);
                    }
                } else if (!(this.f87572v instanceof C33757ap)) {
                    C33742ah ahVar2 = this.f87572v;
                    if (ahVar2 != null) {
                        ahVar2.mo71791a(false);
                    }
                    this.f87572v = new C33757ap(this);
                }
                z5 = true;
            }
        }
        if (!z5) {
            View view = this.f87571u;
            if (view == null) {
                C52711k.m112237a("rootLayout");
            }
            view.setVisibility(8);
            return;
        }
        C33742ah ahVar3 = this.f87572v;
        if (ahVar3 == null) {
            C52711k.m112234a();
        }
        if (pVar == null) {
            C52711k.m112234a();
        }
        if (sayHelloContent == null) {
            C52711k.m112234a();
        }
        ahVar3.mo71790a(pVar, pVar2, sayHelloContent, i);
    }
}
