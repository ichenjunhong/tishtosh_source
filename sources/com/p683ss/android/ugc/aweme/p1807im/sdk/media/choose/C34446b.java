package com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1855d.C34463a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.b */
public final class C34446b extends C1322a<C34450c> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88855a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34446b.class), "albumItems", "getAlbumItems()Ljava/util/List;"))};

    /* renamed from: b */
    private final C52668f f88856b = C52732g.m112285a(C34447a.f88858a);

    /* renamed from: c */
    private final C52671b<C34463a, C52860x> f88857c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.b$a */
    static final class C34447a extends C52712l implements C52670a<List<C34463a>> {

        /* renamed from: a */
        public static final C34447a f88858a = new C34447a();

        C34447a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final List<C34463a> mo72466a() {
        return (List) this.f88856b.getValue();
    }

    public final int getItemCount() {
        return mo72466a().size();
    }

    public C34446b(C52671b<? super C34463a, C52860x> bVar) {
        C52711k.m112240b(bVar, "openAlbum");
        this.f88857c = bVar;
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C34450c cVar = (C34450c) vVar;
        C52711k.m112240b(cVar, "holder");
        cVar.mo70626a((C34463a) mo72466a().get(i));
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bcv, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…_pop_menu, parent, false)");
        return new C34450c(inflate, this.f88857c);
    }
}
