package com.p683ss.android.ugc.aweme.discover.adapter;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.mob.C28381ab;
import com.p683ss.android.ugc.aweme.discover.mob.p1658a.C28377e;
import com.p683ss.android.ugc.aweme.discover.mob.p1658a.C28378f;
import com.p683ss.android.ugc.aweme.discover.mob.p1658a.C28379g;
import com.p683ss.android.ugc.aweme.discover.model.RelatedSearchWordItem;
import com.p683ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.p683ss.android.ugc.aweme.discover.p1644f.C28116e;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28515aw;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.search.C41431k;
import com.p683ss.android.ugc.aweme.search.model.C41437b;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.am */
public final class C27814am extends C1352v {

    /* renamed from: f */
    public static final C27815a f73071f = new C27815a(null);

    /* renamed from: a */
    public RecommendWordMob f73072a;

    /* renamed from: b */
    public C41440e f73073b;

    /* renamed from: c */
    public LinearLayout f73074c;

    /* renamed from: d */
    public List<? extends RelatedSearchWordItem> f73075d;

    /* renamed from: e */
    public final RecyclerView f73076e;

    /* renamed from: g */
    private final TextView f73077g;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.am$a */
    public static final class C27815a {
        private C27815a() {
        }

        public /* synthetic */ C27815a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.am$b */
    public static final class C27816b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C27814am f73078a;

        public C27816b(C27814am amVar) {
            this.f73078a = amVar;
        }

        public final void run() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            C27814am amVar = this.f73078a;
            String a = C28381ab.m67359d().mo56813a(3);
            String a2 = C29981aa.m70153a().mo60161a(a);
            List<? extends RelatedSearchWordItem> list = amVar.f73075d;
            if (list == null) {
                C52711k.m112234a();
            }
            int size = list.size();
            int i = 0;
            while (true) {
                String str10 = null;
                if (i < size) {
                    List<? extends RelatedSearchWordItem> list2 = amVar.f73075d;
                    if (list2 == null) {
                        C52711k.m112234a();
                    }
                    if (i < list2.size()) {
                        List<? extends RelatedSearchWordItem> list3 = amVar.f73075d;
                        if (list3 == null) {
                            C52711k.m112234a();
                        }
                        RelatedSearchWordItem relatedSearchWordItem = (RelatedSearchWordItem) list3.get(i);
                        int i2 = i + 1;
                        C26890h.m65011a("related_search_keywords", C23089d.m56640a().mo47829a("action_type", "show").mo47829a("search_keyword", relatedSearchWordItem.getRelatedWord()).mo47826a("order", i2).mo47829a("enter_from", "general_search").mo47829a("log_pb", a2).mo47829a("search_id", a).mo47829a("impr_id", a).f61491a);
                        C28379g e = new C28379g(null, 1, null).mo56802a(relatedSearchWordItem.getWord()).mo56803a(Integer.valueOf(i)).mo56807d(a).mo56808e(a2);
                        C41440e eVar = amVar.f73073b;
                        if (eVar != null) {
                            str6 = eVar.getKeyword();
                        } else {
                            str6 = null;
                        }
                        C28379g c = e.mo56806c(str6);
                        C23089d a3 = C23089d.m56640a().mo47829a("search_id", a);
                        String str11 = "query_id";
                        RecommendWordMob recommendWordMob = amVar.f73072a;
                        if (recommendWordMob != null) {
                            str7 = recommendWordMob.getQueryId();
                        } else {
                            str7 = null;
                        }
                        C23089d a4 = a3.mo47829a(str11, str7);
                        String str12 = "query";
                        C41440e eVar2 = amVar.f73073b;
                        if (eVar2 != null) {
                            str8 = eVar2.getKeyword();
                        } else {
                            str8 = null;
                        }
                        C23089d a5 = a4.mo47829a(str12, str8).mo47826a("rank", amVar.getAdapterPosition());
                        String str13 = "source";
                        C41440e eVar3 = amVar.f73073b;
                        if (eVar3 != null) {
                            str9 = eVar3.getEnterFrom();
                        } else {
                            str9 = null;
                        }
                        C23089d a6 = a5.mo47829a(str13, str9);
                        String str14 = "info";
                        RecommendWordMob recommendWordMob2 = amVar.f73072a;
                        if (recommendWordMob2 != null) {
                            str10 = recommendWordMob2.getInfo();
                        }
                        ((C28379g) c.mo48070a(a6.mo47829a(str14, str10).f61491a)).mo48076e();
                        i = i2;
                    } else {
                        return;
                    }
                } else {
                    C28377e a7 = new C28377e().mo56797a(Integer.valueOf(size));
                    RecommendWordMob recommendWordMob3 = amVar.f73072a;
                    if (recommendWordMob3 != null) {
                        str = recommendWordMob3.getWordsSource();
                    } else {
                        str = null;
                    }
                    C28377e d = a7.mo56798a(str).mo56800c(a).mo56801d(a2);
                    C41440e eVar4 = amVar.f73073b;
                    if (eVar4 != null) {
                        str2 = eVar4.getKeyword();
                    } else {
                        str2 = null;
                    }
                    C28377e b = d.mo56799b(str2);
                    C23089d a8 = C23089d.m56640a().mo47829a("search_id", a);
                    String str15 = "query_id";
                    RecommendWordMob recommendWordMob4 = amVar.f73072a;
                    if (recommendWordMob4 != null) {
                        str3 = recommendWordMob4.getQueryId();
                    } else {
                        str3 = null;
                    }
                    C23089d a9 = a8.mo47829a(str15, str3);
                    String str16 = "query";
                    C41440e eVar5 = amVar.f73073b;
                    if (eVar5 != null) {
                        str4 = eVar5.getKeyword();
                    } else {
                        str4 = null;
                    }
                    C23089d a10 = a9.mo47829a(str16, str4).mo47826a("rank", amVar.getAdapterPosition());
                    String str17 = "source";
                    C41440e eVar6 = amVar.f73073b;
                    if (eVar6 != null) {
                        str5 = eVar6.getEnterFrom();
                    } else {
                        str5 = null;
                    }
                    C23089d a11 = a10.mo47829a(str17, str5);
                    String str18 = "info";
                    RecommendWordMob recommendWordMob5 = amVar.f73072a;
                    if (recommendWordMob5 != null) {
                        str10 = recommendWordMob5.getInfo();
                    }
                    ((C28377e) b.mo48070a(a11.mo47829a(str18, str10).f61491a)).mo48076e();
                    return;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.am$c */
    public static final class C27817c extends C28515aw {

        /* renamed from: a */
        final /* synthetic */ C27814am f73079a;

        /* renamed from: b */
        final /* synthetic */ RelatedSearchWordItem f73080b;

        /* renamed from: c */
        final /* synthetic */ int f73081c;

        /* renamed from: b */
        public final void mo55272b(View view, MotionEvent motionEvent) {
            String str;
            String str2;
            String str3;
            String str4;
            C52711k.m112240b(motionEvent, "event");
            String a = C28381ab.m67359d().mo56813a(3);
            String a2 = C29981aa.m70153a().mo60161a(a);
            C26890h.m65011a("related_search_keywords", C23089d.m56640a().mo47829a("action_type", "click").mo47829a("search_keyword", this.f73080b.getRelatedWord()).mo47826a("order", this.f73081c + 1).mo47829a("enter_from", "general_search").mo47829a("log_pb", a2).mo47829a("search_id", a).mo47829a("impr_id", a).f61491a);
            C28379g e = new C28378f().mo56802a(this.f73080b.getWord()).mo56803a(Integer.valueOf(this.f73081c)).mo56807d(a).mo56808e(a2);
            C41440e eVar = this.f73079a.f73073b;
            String str5 = null;
            if (eVar != null) {
                str = eVar.getKeyword();
            } else {
                str = null;
            }
            C28379g c = e.mo56806c(str);
            C23089d a3 = C23089d.m56640a().mo47829a("search_id", a);
            String str6 = "query_id";
            RecommendWordMob recommendWordMob = this.f73079a.f73072a;
            if (recommendWordMob != null) {
                str2 = recommendWordMob.getQueryId();
            } else {
                str2 = null;
            }
            C23089d a4 = a3.mo47829a(str6, str2);
            String str7 = "query";
            C41440e eVar2 = this.f73079a.f73073b;
            if (eVar2 != null) {
                str3 = eVar2.getKeyword();
            } else {
                str3 = null;
            }
            C23089d a5 = a4.mo47829a(str7, str3).mo47826a("rank", this.f73079a.getAdapterPosition());
            String str8 = "source";
            C41440e eVar3 = this.f73079a.f73073b;
            if (eVar3 != null) {
                str4 = eVar3.getEnterFrom();
            } else {
                str4 = null;
            }
            C23089d a6 = a5.mo47829a(str8, str4);
            String str9 = "info";
            RecommendWordMob recommendWordMob2 = this.f73079a.f73072a;
            if (recommendWordMob2 != null) {
                str5 = recommendWordMob2.getInfo();
            }
            ((C28379g) c.mo48070a(a6.mo47829a(str9, str5).f61491a)).mo48076e();
            C41440e enterFrom = new C41440e().setSearchFrom(4).setKeyword(this.f73080b.getRelatedWord()).setEnterFrom("related_search_keyword");
            C52711k.m112236a((Object) enterFrom, "param");
            C28116e.m66922a(3, enterFrom);
            C41431k kVar = C41431k.f105004a;
            View view2 = this.f73079a.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            C41437b bVar = new C41437b(view2.getContext(), enterFrom, null, null, null, null);
            kVar.launchSearchPage(bVar);
        }

        public C27817c(C27814am amVar, RelatedSearchWordItem relatedSearchWordItem, int i) {
            this.f73079a = amVar;
            this.f73080b = relatedSearchWordItem;
            this.f73081c = i;
        }
    }

    public C27814am(View view, RecyclerView recyclerView) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(recyclerView, "rv");
        super(view);
        this.f73076e = recyclerView;
        View findViewById = view.findViewById(R.id.czi);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.tg_hot_search)");
        this.f73074c = (LinearLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.dhb);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.tv_title)");
        this.f73077g = (TextView) findViewById2;
        this.f73077g.setCompoundDrawables(null, null, null, null);
    }
}
