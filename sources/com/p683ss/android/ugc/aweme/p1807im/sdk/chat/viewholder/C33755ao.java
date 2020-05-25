package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33674j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SayHelloContent;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ao */
public final class C33755ao extends C33742ah {

    /* renamed from: g */
    private RecyclerView f87552g;

    /* renamed from: h */
    private C33674j f87553h;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ao$a */
    static final class C33756a extends C52712l implements C52682m<View, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C33755ao f87554a;

        C33756a(C33755ao aoVar) {
            this.f87554a = aoVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            View view = (View) obj;
            int intValue = ((Number) obj2).intValue();
            C52711k.m112240b(view, "<anonymous parameter 0>");
            this.f87554a.mo71789a(intValue);
            return C52860x.f131107a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final List<C29366a> mo71795d() {
        List<C29366a> jokerEmojis = mo71793b().getJokerEmojis();
        C52711k.m112236a((Object) jokerEmojis, "content.jokerEmojis");
        return jokerEmojis;
    }

    /* renamed from: e */
    public final void mo71796e() {
        super.mo71796e();
        this.f87552g = (RecyclerView) mo71792b(R.id.cg0);
        this.f87553h = new C33674j();
        C33674j jVar = this.f87553h;
        if (jVar == null) {
            C52711k.m112237a("adapter");
        }
        jVar.f87312a = new C33756a(this);
        RecyclerView recyclerView = this.f87552g;
        if (recyclerView == null) {
            C52711k.m112237a("recyclerView");
        }
        C33674j jVar2 = this.f87553h;
        if (jVar2 == null) {
            C52711k.m112237a("adapter");
        }
        recyclerView.setAdapter(jVar2);
        RecyclerView recyclerView2 = this.f87552g;
        if (recyclerView2 == null) {
            C52711k.m112237a("recyclerView");
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(this.f87523b, 0, false));
    }

    public C33755ao(C33763aq aqVar) {
        C52711k.m112240b(aqVar, "parent");
        super(aqVar);
    }

    /* renamed from: a */
    public final void mo71791a(boolean z) {
        int i;
        RecyclerView recyclerView = this.f87552g;
        if (recyclerView == null) {
            C52711k.m112237a("recyclerView");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        recyclerView.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo71790a(C11207p pVar, C11207p pVar2, SayHelloContent sayHelloContent, int i) {
        C52711k.m112240b(pVar, "msg");
        C52711k.m112240b(sayHelloContent, C42311c.f106865i);
        super.mo71790a(pVar, pVar2, sayHelloContent, i);
        mo71791a(true);
        C33674j jVar = this.f87553h;
        if (jVar == null) {
            C52711k.m112237a("adapter");
        }
        jVar.mo70601a(mo71795d(), null);
    }
}
