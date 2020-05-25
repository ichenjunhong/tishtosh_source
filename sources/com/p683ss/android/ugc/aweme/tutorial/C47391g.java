package com.p683ss.android.ugc.aweme.tutorial;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.tutorial.p2374a.C47373a;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tutorial.g */
public final class C47391g extends C1352v {

    /* renamed from: a */
    final SimpleDraweeView f119603a;

    /* renamed from: b */
    final TextView f119604b;

    /* renamed from: c */
    public final C52671b<C47373a, C52860x> f119605c;

    /* renamed from: com.ss.android.ugc.aweme.tutorial.g$a */
    public static final class C47392a extends C47687av {

        /* renamed from: a */
        final /* synthetic */ C47391g f119606a;

        /* renamed from: b */
        final /* synthetic */ C47373a f119607b;

        /* renamed from: a */
        public final void mo59929a(View view) {
            this.f119606a.f119605c.invoke(this.f119607b);
        }

        C47392a(C47391g gVar, C47373a aVar) {
            this.f119606a = gVar;
            this.f119607b = aVar;
        }
    }

    public C47391g(View view, C52671b<? super C47373a, C52860x> bVar) {
        C52711k.m112240b(view, "rootView");
        C52711k.m112240b(bVar, "onClickListener");
        super(view);
        this.f119605c = bVar;
        View findViewById = view.findViewById(R.id.e47);
        C52711k.m112236a((Object) findViewById, "rootView.findViewById(R.….creation_tutorial_cover)");
        this.f119603a = (SimpleDraweeView) findViewById;
        View findViewById2 = view.findViewById(R.id.e4_);
        C52711k.m112236a((Object) findViewById2, "rootView.findViewById(R.….creation_tutorial_title)");
        this.f119604b = (TextView) findViewById2;
    }
}
