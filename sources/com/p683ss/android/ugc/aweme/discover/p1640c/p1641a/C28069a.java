package com.p683ss.android.ugc.aweme.discover.p1640c.p1641a;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.discover.adapter.C27918o;
import com.p683ss.android.ugc.aweme.discover.adapter.viewholder.C27992a;
import com.p683ss.android.ugc.aweme.discover.adapter.viewholder.C28010e;
import com.p683ss.android.ugc.aweme.discover.adapter.viewholder.C28014g;
import com.p683ss.android.ugc.aweme.discover.adapter.viewholder.C28014g.C28021c;
import com.p683ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28522ay.C28523a;
import com.p683ss.android.ugc.aweme.search.C41424g;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.c.a.a */
public final class C28069a extends C26835b<List<? extends Object>> {

    /* renamed from: d */
    public static final C28070a f73746d = new C28070a(null);

    /* renamed from: a */
    public C28523a f73747a;

    /* renamed from: b */
    public boolean f73748b;

    /* renamed from: c */
    public final C0184k f73749c;

    /* renamed from: com.ss.android.ugc.aweme.discover.c.a.a$a */
    public static final class C28070a {
        private C28070a() {
        }

        public /* synthetic */ C28070a(C52707g gVar) {
            this();
        }
    }

    public C28069a(C0184k kVar) {
        C52711k.m112240b(kVar, "lifecycleOwner");
        this.f73749c = kVar;
    }

    /* renamed from: a */
    public final C1352v mo51021a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        C28523a aVar = this.f73747a;
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bsy, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C27992a(inflate, aVar);
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo51023a(Object obj, int i) {
        List list = (List) obj;
        C52711k.m112240b(list, "items");
        Object obj2 = list.get(i);
        if (!(obj2 instanceof List)) {
            obj2 = null;
        }
        List list2 = (List) obj2;
        if (list2 != null && !C9376b.m18558a((Collection<T>) list2) && (list2.get(0) instanceof Word)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo51022a(Object obj, int i, C1352v vVar, List list) {
        boolean z;
        int i2;
        List list2;
        List list3 = (List) obj;
        C52711k.m112240b(list3, "items");
        C52711k.m112240b(vVar, "holder");
        C52711k.m112240b(list, "payloads");
        if (this.f73748b) {
            this.f73748b = false;
            if (vVar instanceof C27918o) {
                C27918o oVar = (C27918o) vVar;
                Object obj2 = list3.get(i);
                if (obj2 != null) {
                    oVar.mo56312a((List) obj2);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.discover.model.suggest.Word>");
            } else if (vVar instanceof C28014g) {
                C28014g gVar = (C28014g) vVar;
                Object obj3 = list3.get(i);
                if (obj3 != null) {
                    List list4 = (List) obj3;
                    if (!C52711k.m112239a((Object) list4, (Object) C27918o.f73330h)) {
                        if (list4 != null) {
                            i2 = list4.size();
                        } else {
                            i2 = 0;
                        }
                        int min = Math.min(i2, C28014g.f73598c);
                        C26890h.m65011a("trending_show", C23089d.m56640a().mo47826a("words_num", min).mo47829a("words_source", "recom_search").f61491a);
                        C28021c cVar = gVar.f73600a;
                        if (list4 != null) {
                            list2 = list4.subList(0, min);
                        } else {
                            list2 = null;
                        }
                        cVar.mo56396a(list2);
                        C23794bh.m58379E().mo58332a("search_transfer_trending_words_show");
                    }
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.discover.model.suggest.Word>");
            } else if (vVar instanceof C27992a) {
                C27992a aVar = (C27992a) vVar;
                Object obj4 = list3.get(i);
                if (obj4 != null) {
                    List<Word> list5 = (List) obj4;
                    C52711k.m112240b(list5, "list");
                    if (C52711k.m112239a((Object) list5, (Object) C27918o.f73330h)) {
                        aVar.f73537d.setVisibility(8);
                        return;
                    }
                    aVar.f73536c = list5;
                    C28010e.f73586a = !aVar.f73536c.isEmpty();
                    if (C41424g.m91243d() || !C28010e.m66766a() || !C28010e.m66767b()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        aVar.f73537d.setVisibility(8);
                    } else {
                        aVar.f73537d.setVisibility(0);
                    }
                    if (!C41424g.m91243d()) {
                        aVar.f73534a.setPadding(0, 0, 0, (int) C9432q.m18687b(aVar.f73534a.getContext(), 48.0f));
                        aVar.f73534a.setClipToPadding(false);
                    }
                    aVar.f73538e.setVisibility(8);
                    int size = list5.size();
                    if ((!list5.isEmpty()) && !((Word) C52575l.m112137e(list5)).isShowed()) {
                        C26890h.m65011a("trending_show", C23089d.m56640a().mo47826a("words_num", size).mo47829a("words_source", "recom_search").f61491a);
                    }
                    aVar.f73535b.notifyDataSetChanged();
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.discover.model.suggest.Word>");
                }
            }
        }
    }
}
