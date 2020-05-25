package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ad */
public final class C33737ad extends C33739ae {

    /* renamed from: u */
    static final /* synthetic */ C52767h[] f87516u = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C33737ad.class), "statusIcon", "getStatusIcon()Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/StatusIcon;"))};

    /* renamed from: A */
    private final C52668f f87517A = C52732g.m112285a(new C33738a(this));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ad$a */
    static final class C33738a extends C52712l implements C52670a<C33820cn> {

        /* renamed from: a */
        final /* synthetic */ C33737ad f87518a;

        C33738a(C33737ad adVar) {
            this.f87518a = adVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C33820cn(this.f87518a.f87704f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71779a() {
        super.mo71779a();
        this.f87704f = (ImageView) this.itemView.findViewById(R.id.css);
    }

    /* renamed from: a */
    public final void mo71783a(OnClickListener onClickListener) {
        super.mo71783a(onClickListener);
        this.f87704f.setOnClickListener(onClickListener);
        this.f87713o.mo73331a(this.f87704f);
    }

    public C33737ad(View view, int i) {
        C52711k.m112240b(view, "itemView");
        super(view, i);
    }

    /* renamed from: a */
    public final void mo71780a(C11207p pVar, C11207p pVar2, BaseContent baseContent, int i) {
        super.mo71780a(pVar, pVar2, baseContent, i);
        ((C33820cn) this.f87517A.getValue()).mo71862a(this.f87712n);
    }
}
