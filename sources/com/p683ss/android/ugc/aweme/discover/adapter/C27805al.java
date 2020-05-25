package com.p683ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.graphics.Rect;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.mob.C28381ab;
import com.p683ss.android.ugc.aweme.discover.mob.p1658a.C28377e;
import com.p683ss.android.ugc.aweme.discover.mob.p1658a.C28378f;
import com.p683ss.android.ugc.aweme.discover.mob.p1658a.C28379g;
import com.p683ss.android.ugc.aweme.discover.model.RelatedSearchWordItem;
import com.p683ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.search.C41431k;
import com.p683ss.android.ugc.aweme.search.model.C41437b;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.al */
public final class C27805al extends C1352v {

    /* renamed from: f */
    public static final C27806a f73049f = new C27806a(null);

    /* renamed from: a */
    public final RecyclerView f73050a;

    /* renamed from: b */
    public final C27809c f73051b = new C27809c();

    /* renamed from: c */
    public final List<RelatedSearchWordItem> f73052c = new ArrayList();

    /* renamed from: d */
    public RecommendWordMob f73053d;

    /* renamed from: e */
    public C41440e f73054e;

    /* renamed from: g */
    private final TextView f73055g;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.al$a */
    public static final class C27806a {
        private C27806a() {
        }

        public /* synthetic */ C27806a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.al$b */
    static final class C27807b extends C1331h {

        /* renamed from: a */
        public static final C27808a f73056a = new C27808a(null);

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.al$b$a */
        public static final class C27808a {
            private C27808a() {
            }

            public /* synthetic */ C27808a(C52707g gVar) {
                this();
            }
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
            C52711k.m112240b(rect, "outRect");
            C52711k.m112240b(view, "view");
            C52711k.m112240b(recyclerView, "parent");
            C52711k.m112240b(sVar, "state");
            int f = RecyclerView.m4275f(view);
            if (f == 0) {
                rect.left = C23728o.m58241a(16.0d);
                rect.right = C23728o.m58241a(4.0d);
            } else if (f == sVar.mo5115a() - 1) {
                rect.left = C23728o.m58241a(4.0d);
                rect.right = C23728o.m58241a(16.0d);
            } else {
                rect.left = C23728o.m58241a(4.0d);
                rect.right = C23728o.m58241a(4.0d);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.al$c */
    public static final class C27809c extends C1322a<C27810d> {

        /* renamed from: a */
        public RecommendWordMob f73057a;

        /* renamed from: b */
        public C41440e f73058b;

        /* renamed from: c */
        public int f73059c;

        /* renamed from: d */
        public final List<RelatedSearchWordItem> f73060d = new ArrayList();

        public final int getItemCount() {
            return this.f73060d.size();
        }

        public final /* synthetic */ void onViewAttachedToWindow(C1352v vVar) {
            String str;
            String str2;
            String str3;
            String str4;
            C27810d dVar = (C27810d) vVar;
            C52711k.m112240b(dVar, "holder");
            super.onViewAttachedToWindow(dVar);
            RelatedSearchWordItem relatedSearchWordItem = dVar.f73067f;
            if (relatedSearchWordItem == null) {
                C52711k.m112237a("mItem");
            }
            if (!relatedSearchWordItem.isMobShow) {
                RelatedSearchWordItem relatedSearchWordItem2 = dVar.f73067f;
                if (relatedSearchWordItem2 == null) {
                    C52711k.m112237a("mItem");
                }
                relatedSearchWordItem2.isMobShow = true;
                String a = C28381ab.m67359d().mo56813a(3);
                String a2 = C29981aa.m70153a().mo60161a(a);
                String str5 = "related_search_keywords";
                C23089d a3 = C23089d.m56640a().mo47829a("action_type", "show");
                String str6 = "search_keyword";
                RelatedSearchWordItem relatedSearchWordItem3 = dVar.f73067f;
                if (relatedSearchWordItem3 == null) {
                    C52711k.m112237a("mItem");
                }
                C26890h.m65011a(str5, a3.mo47829a(str6, relatedSearchWordItem3.getRelatedWord()).mo47826a("order", dVar.getAdapterPosition() + 1).mo47829a("enter_from", "general_search").mo47829a("log_pb", a2).mo47829a("search_id", a).mo47829a("impr_id", a).f61491a);
                String str7 = null;
                C28379g gVar = new C28379g(null, 1, null);
                RelatedSearchWordItem relatedSearchWordItem4 = dVar.f73067f;
                if (relatedSearchWordItem4 == null) {
                    C52711k.m112237a("mItem");
                }
                C28379g e = gVar.mo56802a(relatedSearchWordItem4.getWord()).mo56803a(Integer.valueOf(dVar.getAdapterPosition())).mo56807d(a).mo56808e(a2);
                C41440e eVar = dVar.f73065d;
                if (eVar != null) {
                    str = eVar.getKeyword();
                } else {
                    str = null;
                }
                C28379g c = e.mo56806c(str);
                C23089d a4 = C23089d.m56640a().mo47829a("search_id", a);
                String str8 = "query_id";
                RecommendWordMob recommendWordMob = dVar.f73064c;
                if (recommendWordMob != null) {
                    str2 = recommendWordMob.getQueryId();
                } else {
                    str2 = null;
                }
                C23089d a5 = a4.mo47829a(str8, str2);
                String str9 = "query";
                C41440e eVar2 = dVar.f73065d;
                if (eVar2 != null) {
                    str3 = eVar2.getKeyword();
                } else {
                    str3 = null;
                }
                C23089d a6 = a5.mo47829a(str9, str3).mo47826a("rank", dVar.f73066e);
                String str10 = "source";
                C41440e eVar3 = dVar.f73065d;
                if (eVar3 != null) {
                    str4 = eVar3.getEnterFrom();
                } else {
                    str4 = null;
                }
                C23089d a7 = a6.mo47829a(str10, str4);
                String str11 = "info";
                RecommendWordMob recommendWordMob2 = dVar.f73064c;
                if (recommendWordMob2 != null) {
                    str7 = recommendWordMob2.getInfo();
                }
                ((C28379g) c.mo48070a(a7.mo47829a(str11, str7).f61491a)).mo48076e();
            }
        }

        public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
            C52711k.m112240b(viewGroup, "parent");
            C52711k.m112240b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bs9, viewGroup, false);
            C52711k.m112236a((Object) inflate, "itemView");
            C27810d dVar = new C27810d(inflate);
            dVar.f73064c = this.f73057a;
            dVar.f73065d = this.f73058b;
            dVar.f73066e = this.f73059c;
            return dVar;
        }

        public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
            C27810d dVar = (C27810d) vVar;
            C52711k.m112240b(dVar, "holder");
            RelatedSearchWordItem relatedSearchWordItem = (RelatedSearchWordItem) this.f73060d.get(i);
            C52711k.m112240b(relatedSearchWordItem, "item");
            dVar.f73067f = relatedSearchWordItem;
            dVar.f73063b.setText(relatedSearchWordItem.getRelatedWord());
            if (!TextUtils.isEmpty(relatedSearchWordItem.getRelatedImg())) {
                C13833a aVar = (C13833a) dVar.f73062a.getHierarchy();
                C52711k.m112236a((Object) aVar, "mWordCover.hierarchy");
                aVar.mo25898a(C13818b.f36067g);
                C23515d.m57677a(dVar.f73062a, relatedSearchWordItem.getRelatedImg());
                return;
            }
            C13833a aVar2 = (C13833a) dVar.f73062a.getHierarchy();
            C52711k.m112236a((Object) aVar2, "mWordCover.hierarchy");
            aVar2.mo25898a(C13818b.f36066f);
            C23515d.m57668a(dVar.f73062a, (int) R.drawable.due);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.al$d */
    static final class C27810d extends C1352v {

        /* renamed from: g */
        public static final C27812a f73061g = new C27812a(null);

        /* renamed from: a */
        final RemoteImageView f73062a;

        /* renamed from: b */
        final TextView f73063b;

        /* renamed from: c */
        public RecommendWordMob f73064c;

        /* renamed from: d */
        public C41440e f73065d;

        /* renamed from: e */
        public int f73066e;

        /* renamed from: f */
        public RelatedSearchWordItem f73067f;

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.al$d$a */
        public static final class C27812a {
            private C27812a() {
            }

            public /* synthetic */ C27812a(C52707g gVar) {
                this();
            }
        }

        /* renamed from: a */
        public static final /* synthetic */ RelatedSearchWordItem m66549a(C27810d dVar) {
            RelatedSearchWordItem relatedSearchWordItem = dVar.f73067f;
            if (relatedSearchWordItem == null) {
                C52711k.m112237a("mItem");
            }
            return relatedSearchWordItem;
        }

        public C27810d(final View view) {
            C52711k.m112240b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.f8b);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.word_cover)");
            this.f73062a = (RemoteImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.f45);
            C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.tv_related_word)");
            this.f73063b = (TextView) findViewById2;
            view.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C27810d f73068a;

                {
                    this.f73068a = r1;
                }

                public final void onClick(View view) {
                    String str;
                    String str2;
                    String str3;
                    String str4;
                    ClickInstrumentation.onClick(view);
                    String a = C28381ab.m67359d().mo56813a(3);
                    String a2 = C29981aa.m70153a().mo60161a(a);
                    C26890h.m65011a("related_search_keywords", C23089d.m56640a().mo47829a("action_type", "click").mo47829a("search_keyword", C27810d.m66549a(this.f73068a).getRelatedWord()).mo47826a("order", this.f73068a.getAdapterPosition() + 1).mo47829a("enter_from", "general_search").mo47829a("log_pb", a2).mo47829a("search_id", a).mo47829a("impr_id", a).f61491a);
                    C28379g e = new C28378f().mo56802a(C27810d.m66549a(this.f73068a).getWord()).mo56803a(Integer.valueOf(this.f73068a.getAdapterPosition())).mo56807d(a).mo56808e(a2);
                    C41440e eVar = this.f73068a.f73065d;
                    String str5 = null;
                    if (eVar != null) {
                        str = eVar.getKeyword();
                    } else {
                        str = null;
                    }
                    C28379g c = e.mo56806c(str);
                    C23089d a3 = C23089d.m56640a().mo47829a("search_id", a);
                    String str6 = "query_id";
                    RecommendWordMob recommendWordMob = this.f73068a.f73064c;
                    if (recommendWordMob != null) {
                        str2 = recommendWordMob.getQueryId();
                    } else {
                        str2 = null;
                    }
                    C23089d a4 = a3.mo47829a(str6, str2);
                    String str7 = "query";
                    C41440e eVar2 = this.f73068a.f73065d;
                    if (eVar2 != null) {
                        str3 = eVar2.getKeyword();
                    } else {
                        str3 = null;
                    }
                    C23089d a5 = a4.mo47829a(str7, str3).mo47826a("rank", this.f73068a.f73066e);
                    String str8 = "source";
                    C41440e eVar3 = this.f73068a.f73065d;
                    if (eVar3 != null) {
                        str4 = eVar3.getEnterFrom();
                    } else {
                        str4 = null;
                    }
                    C23089d a6 = a5.mo47829a(str8, str4);
                    String str9 = "info";
                    RecommendWordMob recommendWordMob2 = this.f73068a.f73064c;
                    if (recommendWordMob2 != null) {
                        str5 = recommendWordMob2.getInfo();
                    }
                    ((C28379g) c.mo48070a(a6.mo47829a(str9, str5).f61491a)).mo48076e();
                    C41440e enterFrom = new C41440e().setSearchFrom(4).setKeyword(C27810d.m66549a(this.f73068a).getRelatedWord()).setEnterFrom("related_search_keyword");
                    C41431k kVar = C41431k.f105004a;
                    Context context = view.getContext();
                    C52711k.m112236a((Object) enterFrom, "param");
                    C41437b bVar = new C41437b(context, enterFrom, null, null, null, null);
                    kVar.launchSearchPage(bVar);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.al$e */
    public static final class C27813e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C27805al f73070a;

        public C27813e(C27805al alVar) {
            this.f73070a = alVar;
        }

        public final void run() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            C27805al alVar = this.f73070a;
            String a = C28381ab.m67359d().mo56813a(3);
            C28377e c = new C28377e().mo56797a(Integer.valueOf(alVar.f73052c.size())).mo56801d(C29981aa.m70153a().mo60161a(a)).mo56800c(a);
            RecommendWordMob recommendWordMob = alVar.f73053d;
            String str6 = null;
            if (recommendWordMob != null) {
                str = recommendWordMob.getWordsSource();
            } else {
                str = null;
            }
            C28377e a2 = c.mo56798a(str);
            C41440e eVar = alVar.f73054e;
            if (eVar != null) {
                str2 = eVar.getKeyword();
            } else {
                str2 = null;
            }
            C28377e b = a2.mo56799b(str2);
            C23089d a3 = C23089d.m56640a().mo47829a("search_id", a);
            String str7 = "query_id";
            RecommendWordMob recommendWordMob2 = alVar.f73053d;
            if (recommendWordMob2 != null) {
                str3 = recommendWordMob2.getQueryId();
            } else {
                str3 = null;
            }
            C23089d a4 = a3.mo47829a(str7, str3);
            String str8 = "query";
            C41440e eVar2 = alVar.f73054e;
            if (eVar2 != null) {
                str4 = eVar2.getKeyword();
            } else {
                str4 = null;
            }
            C23089d a5 = a4.mo47829a(str8, str4).mo47826a("rank", alVar.getAdapterPosition());
            String str9 = "source";
            C41440e eVar3 = alVar.f73054e;
            if (eVar3 != null) {
                str5 = eVar3.getEnterFrom();
            } else {
                str5 = null;
            }
            C23089d a6 = a5.mo47829a(str9, str5);
            String str10 = "info";
            RecommendWordMob recommendWordMob3 = alVar.f73053d;
            if (recommendWordMob3 != null) {
                str6 = recommendWordMob3.getInfo();
            }
            ((C28377e) b.mo48070a(a6.mo47829a(str10, str6).f61491a)).mo48076e();
        }
    }

    public C27805al(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.dhb);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.tv_title)");
        this.f73055g = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.bc2);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.list_view)");
        this.f73050a = (RecyclerView) findViewById2;
        this.f73050a.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        this.f73050a.setAdapter(this.f73051b);
        this.f73050a.mo4798a((C1331h) new C27807b());
    }
}
