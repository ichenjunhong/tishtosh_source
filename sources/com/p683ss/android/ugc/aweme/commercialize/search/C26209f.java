package com.p683ss.android.ugc.aweme.commercialize.search;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.model.C26114ah;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.search.f */
public final class C26209f extends C1352v {

    /* renamed from: a */
    final RemoteImageView f69202a;

    /* renamed from: b */
    final DmtTextView f69203b;

    /* renamed from: c */
    final DmtTextView f69204c;

    /* renamed from: d */
    final DmtTextView f69205d;

    /* renamed from: e */
    final RelativeLayout f69206e;

    /* renamed from: f */
    public final C52671b<String, C52860x> f69207f;

    /* renamed from: g */
    final C52671b<C26114ah, C52860x> f69208g;

    /* renamed from: h */
    public final C52671b<C26114ah, C52860x> f69209h;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.search.f$a */
    static final class C26210a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C26209f f69210a;

        /* renamed from: b */
        final /* synthetic */ C26114ah f69211b;

        C26210a(C26209f fVar, C26114ah ahVar) {
            this.f69210a = fVar;
            this.f69211b = ahVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C52671b<String, C52860x> bVar = this.f69210a.f69207f;
            String str = this.f69211b.url;
            C52711k.m112236a((Object) str, "info.url");
            bVar.invoke(str);
            this.f69210a.f69209h.invoke(this.f69211b);
        }
    }

    public C26209f(View view, C52671b<? super String, C52860x> bVar, C52671b<? super C26114ah, C52860x> bVar2, C52671b<? super C26114ah, C52860x> bVar3) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(bVar, "click");
        C52711k.m112240b(bVar2, "mobViewMoreShow");
        C52711k.m112240b(bVar3, "mobViewMoreClick");
        super(view);
        this.f69207f = bVar;
        this.f69208g = bVar2;
        this.f69209h = bVar3;
        this.f69202a = (RemoteImageView) view.findViewById(R.id.f72);
        this.f69203b = (DmtTextView) view.findViewById(R.id.f73);
        this.f69204c = (DmtTextView) view.findViewById(R.id.f71);
        this.f69205d = (DmtTextView) view.findViewById(R.id.f70);
        this.f69206e = (RelativeLayout) view.findViewById(R.id.ehy);
    }
}
