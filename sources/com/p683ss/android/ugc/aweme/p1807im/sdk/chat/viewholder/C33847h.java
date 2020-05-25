package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ChatCallContent;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.h */
public final class C33847h extends C33848i {

    /* renamed from: u */
    private C33820cn f87809u;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71779a() {
        super.mo71779a();
        this.f87704f = (ImageView) mo71845a((int) R.id.css);
        this.f87809u = new C33820cn(this.f87704f);
    }

    public C33847h(View view, int i) {
        C52711k.m112240b(view, "itemView");
        super(view, i);
    }

    /* renamed from: a */
    public final void mo71780a(C11207p pVar, C11207p pVar2, ChatCallContent chatCallContent, int i) {
        super.mo71780a(pVar, pVar2, chatCallContent, i);
        C33820cn cnVar = this.f87809u;
        if (cnVar == null) {
            C52711k.m112237a("statusIcon");
        }
        cnVar.mo71862a(this.f87712n);
    }
}
