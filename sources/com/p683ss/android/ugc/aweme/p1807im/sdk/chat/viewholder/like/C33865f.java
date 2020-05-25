package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.like;

import android.arch.lifecycle.C0198r;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33805c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.like.DmViewModel.C33854a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.like.f */
public final class C33865f extends C33805c<C33857a> {

    /* renamed from: u */
    public C11207p f87852u;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.like.f$a */
    static final class C33866a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C33865f f87853a;

        C33866a(C33865f fVar) {
            this.f87853a = fVar;
        }

        public final void run() {
            C33864e.f87851a.mo71894a(this.f87853a.f87852u, "auto");
            this.f87853a.dismiss(this.f87853a.f87852u);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.like.f$b */
    static final class C33867b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33865f f87854a;

        C33867b(C33865f fVar) {
            this.f87854a = fVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C33864e.f87851a.mo71894a(this.f87854a.f87852u, "click");
            this.f87854a.dismiss(this.f87854a.f87852u);
        }
    }

    public final void dismiss(C11207p pVar) {
        if (pVar != null) {
            this.f87852u = null;
            C32458a.m75141a(4, "GuideBubbleViewHolder", "start to delete msg");
            View view = this.itemView;
            C52711k.m112236a((Object) view, "itemView");
            DmViewModel a = C33854a.m77621a(view.getContext());
            if (a != null) {
                C0198r a2 = a.mo71884a();
                if (a2 != null) {
                    a2.setValue(pVar);
                }
            }
        }
    }

    public C33865f(View view, int i) {
        C52711k.m112240b(view, "itemView");
        super(view, i);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo71780a(C11207p pVar, C11207p pVar2, BaseContent baseContent, int i) {
        super.mo71780a(pVar, pVar2, (C33857a) baseContent, i);
        this.f87852u = pVar;
        C32458a.m75141a(4, "GuideBubbleViewHolder", "start to bind msg");
        C11207p pVar3 = this.f87852u;
        if (pVar3 != null) {
            C33864e eVar = C33864e.f87851a;
            C52711k.m112240b(pVar3, "msg");
            C26890h.m65011a("bubble_message_show", eVar.mo71893a(pVar3).f61491a);
        }
        this.itemView.postDelayed(new C33866a(this), 5000);
        mo71804c().setOnClickListener(new C33867b(this));
    }
}
