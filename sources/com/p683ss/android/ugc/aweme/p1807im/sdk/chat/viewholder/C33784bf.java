package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareCompilationContent;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.bf */
public final class C33784bf extends C33785bg {

    /* renamed from: u */
    private C33820cn f87647u;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71779a() {
        super.mo71779a();
        this.f87704f = (ImageView) mo71845a((int) R.id.css);
        this.f87647u = new C33820cn(this.f87704f);
    }

    /* renamed from: a */
    public final void mo71783a(OnClickListener onClickListener) {
        C52711k.m112240b(onClickListener, "onClickListener");
        super.mo71783a(onClickListener);
        this.f87704f.setOnClickListener(onClickListener);
        this.f87713o.mo73331a(this.f87704f);
    }

    public C33784bf(View view, int i) {
        C52711k.m112240b(view, "itemView");
        super(view, i);
    }

    /* renamed from: a */
    public final void mo71780a(C11207p pVar, C11207p pVar2, ShareCompilationContent shareCompilationContent, int i) {
        super.mo71780a(pVar, pVar2, shareCompilationContent, i);
        C33820cn cnVar = this.f87647u;
        if (cnVar == null) {
            C52711k.m112237a("statusIcon");
        }
        cnVar.mo71862a(this.f87712n);
    }
}
