package com.p683ss.android.ugc.aweme.discover.adapter.viewholder;

import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.jedi.ext.adapter.p747b.C11949e;
import com.bytedance.jedi.ext.adapter.p747b.C11952f;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.C27936b;
import com.p683ss.android.ugc.aweme.discover.abtest.SearchIntermediateStyleExperiment;
import com.p683ss.android.ugc.aweme.discover.model.HotSearchAdData;
import com.p683ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.p683ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p683ss.android.ugc.aweme.discover.p1644f.C28112b;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28482ak;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28522ay.C28523a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.search.C41424g;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.g */
public final class C28014g extends C1352v {

    /* renamed from: c */
    public static final int f73598c;

    /* renamed from: d */
    public static final C28015a f73599d = new C28015a(null);

    /* renamed from: a */
    public final C28021c f73600a = new C28021c();

    /* renamed from: b */
    public final boolean f73601b;

    /* renamed from: e */
    private final DmtTextView f73602e;

    /* renamed from: f */
    private final RecyclerView f73603f;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.g$a */
    public static final class C28015a {
        private C28015a() {
        }

        public /* synthetic */ C28015a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.g$b */
    static final class C28016b extends C11949e<Object> {

        /* renamed from: e */
        public static final C28017a f73604e = new C28017a(null);

        /* renamed from: a */
        public C28482ak f73605a;

        /* renamed from: b */
        public C28523a f73606b;

        /* renamed from: c */
        public String f73607c = "hot_search_section_search";

        /* renamed from: d */
        public final ViewGroup f73608d;

        /* renamed from: f */
        private final DmtTextView f73609f;

        /* renamed from: g */
        private final DmtTextView f73610g;

        /* renamed from: j */
        private final DmtTextView f73611j;

        /* renamed from: k */
        private final View f73612k;

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.g$b$a */
        public static final class C28017a {
            private C28017a() {
            }

            public /* synthetic */ C28017a(C52707g gVar) {
                this();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.g$b$b */
        static final class C28018b implements Runnable {

            /* renamed from: a */
            public static final C28018b f73613a = new C28018b();

            C28018b() {
            }

            public final void run() {
                C28112b.m66905b();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.g$b$c */
        static final class C28019c implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C28016b f73614a;

            /* renamed from: b */
            final /* synthetic */ HotSearchItem f73615b;

            C28019c(C28016b bVar, HotSearchItem hotSearchItem) {
                this.f73614a = bVar;
                this.f73615b = hotSearchItem;
            }

            public final void onClick(View view) {
                String str;
                String str2;
                Long l;
                String str3;
                ClickInstrumentation.onClick(view);
                if (this.f73615b.getType() == 0) {
                    C28482ak akVar = this.f73614a.f73605a;
                    if (akVar != null) {
                        akVar.mo56499a(this.f73615b, this.f73614a.getAdapterPosition(), "hot_search_section_search");
                    }
                    C26890h.m65011a("hot_search_keyword", C23089d.m56640a().mo47829a("action_type", "click").mo47829a("key_word", this.f73615b.getWord()).mo47829a("key_word_type", "general_word").mo47826a("order", this.f73614a.getPosition() + 1).mo47829a("enter_from", this.f73614a.f73607c).f61491a);
                } else if (this.f73615b.getType() == 1) {
                    C26890h.m65011a("enter_tag_detail", C23089d.m56640a().mo47829a("tag_id", this.f73615b.getChallengeId()).mo47826a("order", this.f73614a.getPosition() + 1).mo47829a("enter_from", this.f73614a.f73607c).mo47829a("log_pb", new C17971f().mo34889b(this.f73615b.getLogPb())).f61491a);
                    C26890h.m65011a("hot_search_keyword", C23089d.m56640a().mo47829a("action_type", "click").mo47829a("key_word", this.f73615b.getWord()).mo47829a("key_word_type", "tag").mo47826a("order", this.f73614a.getPosition() + 1).mo47829a("enter_from", this.f73614a.f73607c).f61491a);
                    StringBuilder sb = new StringBuilder("aweme://challenge/detail/");
                    sb.append(this.f73615b.getChallengeId());
                    C41302w.m91042a().mo83861a(sb.toString());
                }
                if (this.f73615b.isAd()) {
                    if (TextUtils.equals(this.f73614a.f73607c, "hot_search_section_search")) {
                        str = "hot_search_keyword_click";
                    } else {
                        str = "hot_search_keyword_click_detail";
                    }
                    HotSearchAdData adData = this.f73615b.getAdData();
                    if (adData != null) {
                        C27936b.m66691a(adData.getClickTrackUrl(), adData.getCreativeId(), adData.getLogExtra());
                    }
                    C26080b g = C26077e.m63190a().mo53582a("result_ad").mo53593b(str).mo53602g(this.f73614a.f73607c);
                    HotSearchAdData adData2 = this.f73615b.getAdData();
                    Long l2 = null;
                    if (adData2 != null) {
                        str2 = adData2.getLogExtra();
                    } else {
                        str2 = null;
                    }
                    C26080b i = g.mo53604i(str2);
                    HotSearchAdData adData3 = this.f73615b.getAdData();
                    if (adData3 != null) {
                        l = Long.valueOf(adData3.getCreativeId());
                    } else {
                        l = null;
                    }
                    C26080b a = i.mo53580a(l);
                    View view2 = this.f73614a.itemView;
                    C52711k.m112236a((Object) view2, "itemView");
                    a.mo53586a(view2.getContext());
                    C26080b b = C26077e.m63190a().mo53582a("result_ad").mo53593b("click");
                    HotSearchAdData adData4 = this.f73615b.getAdData();
                    if (adData4 != null) {
                        str3 = adData4.getLogExtra();
                    } else {
                        str3 = null;
                    }
                    C26080b i2 = b.mo53604i(str3);
                    HotSearchAdData adData5 = this.f73615b.getAdData();
                    if (adData5 != null) {
                        l2 = Long.valueOf(adData5.getCreativeId());
                    }
                    C26080b a2 = i2.mo53580a(l2);
                    View view3 = this.f73614a.itemView;
                    C52711k.m112236a((Object) view3, "itemView");
                    a2.mo53586a(view3.getContext());
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.g$b$d */
        static final class C28020d implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C28016b f73616a;

            /* renamed from: b */
            final /* synthetic */ Word f73617b;

            /* renamed from: c */
            final /* synthetic */ int f73618c;

            C28020d(C28016b bVar, Word word, int i) {
                this.f73616a = bVar;
                this.f73617b = word;
                this.f73618c = i;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!TextUtils.isEmpty(this.f73617b.getWord())) {
                    C28523a aVar = this.f73616a.f73606b;
                    if (aVar != null) {
                        aVar.handleGuessWordItemClick(this.f73617b, this.f73616a.getAdapterPosition());
                    }
                    C26890h.m65011a("trending_words_click", C23089d.m56640a().mo47826a("words_position", this.f73618c).mo47829a("words_source", "recom_search").mo47829a("words_content", this.f73617b.getWord()).mo47829a("group_id", this.f73617b.getId()).f61491a);
                }
            }
        }

        public C28016b(View view, ViewGroup viewGroup) {
            C52711k.m112240b(view, "itemView");
            C52711k.m112240b(viewGroup, "parent");
            super(view);
            this.f73608d = viewGroup;
            this.f73609f = (DmtTextView) view.findViewById(R.id.dh5);
            this.f73610g = (DmtTextView) view.findViewById(R.id.dh0);
            this.f73611j = (DmtTextView) view.findViewById(R.id.dcz);
            this.f73612k = view.findViewById(R.id.by7);
        }

        /* renamed from: a */
        public final void mo22665a(Object obj, int i) {
            int i2;
            String str;
            String str2;
            Object obj2 = obj;
            int i3 = i;
            C52711k.m112240b(obj2, "item");
            ViewGroup viewGroup = this.f73608d;
            if (viewGroup != null) {
                C1332i layoutManager = ((RecyclerView) viewGroup).getLayoutManager();
                if (layoutManager != null) {
                    int a = ((GridLayoutManager) layoutManager).f4526g.mo4691a(getAdapterPosition(), 2);
                    View view = this.itemView;
                    C52711k.m112236a((Object) view, "itemView");
                    LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        if (a % 2 == 0) {
                            marginLayoutParams.leftMargin = 0;
                            marginLayoutParams.rightMargin = C23728o.m58241a(16.0d);
                        } else if (C10181b.m20511a().mo18168a(SearchIntermediateStyleExperiment.class, true, "double_column_search_history_style", 31744, 0) == 2) {
                            marginLayoutParams.leftMargin = 0;
                            marginLayoutParams.rightMargin = C23728o.m58241a(16.0d);
                        } else {
                            marginLayoutParams.leftMargin = C23728o.m58241a(16.0d);
                            marginLayoutParams.rightMargin = 0;
                        }
                        View view2 = this.itemView;
                        C52711k.m112236a((Object) view2, "itemView");
                        view2.setLayoutParams(marginLayoutParams);
                        if (obj2 instanceof HotSearchItem) {
                            HotSearchItem hotSearchItem = (HotSearchItem) obj2;
                            StringBuilder sb = new StringBuilder();
                            if (hotSearchItem.getType() == 1) {
                                sb.append("#");
                            }
                            sb.append(hotSearchItem.getWord());
                            DmtTextView dmtTextView = this.f73611j;
                            C52711k.m112236a((Object) dmtTextView, "numView");
                            dmtTextView.setVisibility(8);
                            DmtTextView dmtTextView2 = this.f73609f;
                            C52711k.m112236a((Object) dmtTextView2, "textView");
                            dmtTextView2.setText(sb.toString());
                            if (hotSearchItem.getLabel() == 0) {
                                DmtTextView dmtTextView3 = this.f73610g;
                                C52711k.m112236a((Object) dmtTextView3, "tagView");
                                dmtTextView3.setVisibility(8);
                            } else {
                                DmtTextView dmtTextView4 = this.f73610g;
                                C52711k.m112236a((Object) dmtTextView4, "tagView");
                                dmtTextView4.setVisibility(0);
                            }
                            View view3 = this.itemView;
                            C52711k.m112236a((Object) view3, "itemView");
                            view3.getContext();
                            hotSearchItem.getLabel();
                            this.itemView.setOnClickListener(new C28019c(this, hotSearchItem));
                            if (!hotSearchItem.getHasSentMob()) {
                                hotSearchItem.setHasSentMob(true);
                                String str3 = "hot_search_keyword";
                                C23089d a2 = C23089d.m56640a().mo47829a("action_type", "show").mo47829a("key_word", hotSearchItem.getWord());
                                String str4 = "key_word_type";
                                if (hotSearchItem.getType() == 1) {
                                    str = "tag";
                                } else {
                                    str = "general_word";
                                }
                                C26890h.m65011a(str3, a2.mo47829a(str4, str).mo47826a("order", getPosition() + 1).mo47829a("enter_from", this.f73607c).f61491a);
                                if (TextUtils.equals(this.f73607c, "hot_search_section_search")) {
                                    str2 = "hot_search_keyword_show";
                                } else {
                                    str2 = "hot_search_keyword_show_detail";
                                }
                                if (hotSearchItem.isAd()) {
                                    HotSearchAdData adData = hotSearchItem.getAdData();
                                    if (adData != null) {
                                        C27936b.m66694b(adData.getTrackUrl(), adData.getCreativeId(), adData.getLogExtra());
                                    }
                                    C26080b g = C26077e.m63190a().mo53582a("result_ad").mo53593b(str2).mo53602g(this.f73607c);
                                    HotSearchAdData adData2 = hotSearchItem.getAdData();
                                    if (adData2 == null) {
                                        C52711k.m112234a();
                                    }
                                    C26080b i4 = g.mo53604i(adData2.getLogExtra());
                                    HotSearchAdData adData3 = hotSearchItem.getAdData();
                                    if (adData3 == null) {
                                        C52711k.m112234a();
                                    }
                                    C26080b a3 = i4.mo53580a(Long.valueOf(adData3.getCreativeId()));
                                    View view4 = this.itemView;
                                    C52711k.m112236a((Object) view4, "itemView");
                                    a3.mo53586a(view4.getContext());
                                    C26080b b = C26077e.m63190a().mo53582a("result_ad").mo53593b("show");
                                    HotSearchAdData adData4 = hotSearchItem.getAdData();
                                    if (adData4 == null) {
                                        C52711k.m112234a();
                                    }
                                    C26080b i5 = b.mo53604i(adData4.getLogExtra());
                                    HotSearchAdData adData5 = hotSearchItem.getAdData();
                                    if (adData5 == null) {
                                        C52711k.m112234a();
                                    }
                                    C26080b a4 = i5.mo53580a(Long.valueOf(adData5.getCreativeId()));
                                    View view5 = this.itemView;
                                    C52711k.m112236a((Object) view5, "itemView");
                                    a4.mo53586a(view5.getContext());
                                }
                            }
                            return;
                        }
                        if (obj2 instanceof Word) {
                            Word word = (Word) obj2;
                            if (C10181b.m20511a().mo18168a(SearchIntermediateStyleExperiment.class, true, "double_column_search_history_style", 31744, 0) == 2) {
                                DmtTextView dmtTextView5 = this.f73611j;
                                C52711k.m112236a((Object) dmtTextView5, "numView");
                                dmtTextView5.setVisibility(0);
                                View view6 = this.itemView;
                                C52711k.m112236a((Object) view6, "itemView");
                                view6.getContext();
                                i2 = 18;
                            } else {
                                i2 = 0;
                            }
                            if (word.getWord() == null) {
                                View view7 = this.f73612k;
                                C52711k.m112236a((Object) view7, "placeHolderView");
                                view7.setVisibility(0);
                                View view8 = this.f73612k;
                                C52711k.m112236a((Object) view8, "placeHolderView");
                                LayoutParams layoutParams2 = view8.getLayoutParams();
                                if (layoutParams2 != null) {
                                    MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) layoutParams2;
                                    View view9 = this.f73612k;
                                    C52711k.m112236a((Object) view9, "placeHolderView");
                                    float a5 = ((float) C9432q.m18670a(view9.getContext())) * 0.5f;
                                    if ((i3 >> 1) % 2 == 0) {
                                        View view10 = this.f73612k;
                                        C52711k.m112236a((Object) view10, "placeHolderView");
                                        marginLayoutParams2.width = (int) (a5 - C9432q.m18687b(view10.getContext(), ((float) i2) + 32.0f));
                                    } else {
                                        View view11 = this.f73612k;
                                        C52711k.m112236a((Object) view11, "placeHolderView");
                                        marginLayoutParams2.width = (int) (a5 - C9432q.m18687b(view11.getContext(), ((float) i2) + 64.0f));
                                    }
                                    if (C10181b.m20511a().mo18168a(SearchIntermediateStyleExperiment.class, true, "double_column_search_history_style", 31744, 0) == 2) {
                                        marginLayoutParams2.leftMargin = C23728o.m58241a(34.0d);
                                    }
                                    View view12 = this.f73612k;
                                    C52711k.m112236a((Object) view12, "placeHolderView");
                                    view12.setLayoutParams(marginLayoutParams2);
                                } else {
                                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                }
                            } else {
                                View view13 = this.f73612k;
                                C52711k.m112236a((Object) view13, "placeHolderView");
                                view13.setVisibility(4);
                                if (C10181b.m20511a().mo18168a(SearchIntermediateStyleExperiment.class, true, "double_column_search_history_style", 31744, 0) == 2) {
                                    DmtTextView dmtTextView6 = this.f73609f;
                                    C52711k.m112236a((Object) dmtTextView6, "textView");
                                    LayoutParams layoutParams3 = dmtTextView6.getLayoutParams();
                                    if (layoutParams3 != null) {
                                        MarginLayoutParams marginLayoutParams3 = (MarginLayoutParams) layoutParams3;
                                        marginLayoutParams3.leftMargin = C23728o.m58241a(34.0d);
                                        DmtTextView dmtTextView7 = this.f73609f;
                                        C52711k.m112236a((Object) dmtTextView7, "textView");
                                        dmtTextView7.setLayoutParams(marginLayoutParams3);
                                    } else {
                                        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                    }
                                }
                                word.getWordType();
                                DmtTextView dmtTextView8 = this.f73609f;
                                C52711k.m112236a((Object) dmtTextView8, "textView");
                                dmtTextView8.getPaint().measureText(word.getWord());
                                View view14 = this.itemView;
                                C52711k.m112236a((Object) view14, "itemView");
                                C9432q.m18687b(view14.getContext(), ((float) i2) + 36.0f);
                            }
                            DmtTextView dmtTextView9 = this.f73609f;
                            C52711k.m112236a((Object) dmtTextView9, "textView");
                            dmtTextView9.setText(word.getWord());
                            if (C41424g.m91245e()) {
                                DmtTextView dmtTextView10 = this.f73609f;
                                View view15 = this.itemView;
                                C52711k.m112236a((Object) view15, "itemView");
                                dmtTextView10.setTextColor(view15.getResources().getColor(R.color.f));
                            }
                            this.itemView.setOnClickListener(new C28020d(this, word, i3));
                            if (!TextUtils.isEmpty(word.getWord()) && !word.isShowed()) {
                                word.setShowed(true);
                                C26890h.m65011a("trending_words_show", C23089d.m56640a().mo47826a("words_position", getPosition()).mo47829a("words_source", "recom_search").mo47829a("words_content", word.getWord()).mo47829a("group_id", word.getId()).f61491a);
                            }
                            if (word.getWord() != null) {
                                this.itemView.post(C28018b.f73613a);
                            }
                        }
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.RecyclerView");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.g$c */
    public static final class C28021c extends C11952f<Object> {

        /* renamed from: a */
        public C28482ak f73619a;

        /* renamed from: b */
        public C28523a f73620b;

        /* renamed from: c */
        private final List<Object> f73621c = new ArrayList();

        public final int getItemCount() {
            return this.f73621c.size();
        }

        /* renamed from: a */
        public final void mo56396a(List<? extends Object> list) {
            this.f73621c.clear();
            if (list != null) {
                this.f73621c.addAll(list);
            }
            notifyDataSetChanged();
        }

        /* renamed from: a */
        public final C11949e<Object> mo22692a(ViewGroup viewGroup) {
            C52711k.m112240b(viewGroup, "parent");
            if (this.f73619a == null && C10181b.m20511a().mo18168a(SearchIntermediateStyleExperiment.class, true, "double_column_search_history_style", 31744, 0) == 3) {
                C52711k.m112240b(viewGroup, "parent");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bsv, viewGroup, false);
                C52711k.m112236a((Object) inflate, "view");
                C28011f fVar = new C28011f(inflate, viewGroup);
                fVar.f73590a = this.f73620b;
                return fVar;
            }
            C52711k.m112240b(viewGroup, "parent");
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bsu, viewGroup, false);
            C52711k.m112236a((Object) inflate2, "view");
            C28016b bVar = new C28016b(inflate2, viewGroup);
            bVar.f73605a = this.f73619a;
            bVar.f73606b = this.f73620b;
            return bVar;
        }

        /* renamed from: a */
        public final Object mo22687a(int i, boolean z) {
            return this.f73621c.get(i);
        }
    }

    static {
        IESSettingsProxy b = C32816h.m75716b();
        C52711k.m112236a((Object) b, "SettingsReader.get()");
        Integer searchMiddleRecommendWordsCount = b.getSearchMiddleRecommendWordsCount();
        C52711k.m112236a((Object) searchMiddleRecommendWordsCount, "SettingsReader.get().sea…MiddleRecommendWordsCount");
        f73598c = searchMiddleRecommendWordsCount.intValue();
    }

    public C28014g(View view, boolean z) {
        C52711k.m112240b(view, "itemView");
        super(view);
        this.f73601b = z;
        this.f73602e = (DmtTextView) view.findViewById(R.id.dhb);
        View findViewById = view.findViewById(R.id.caf);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.recycler_view)");
        this.f73603f = (RecyclerView) findViewById;
        this.f73603f.setLayoutManager(new GridLayoutManager(view.getContext(), 2));
        this.f73603f.setAdapter(this.f73600a);
        if (this.f73601b) {
            this.f73602e.setText(R.string.e0c);
        } else {
            this.f73602e.setText(R.string.b_x);
        }
        if (C41424g.m91245e()) {
            DmtTextView dmtTextView = this.f73602e;
            C52711k.m112236a((Object) dmtTextView, "titleView");
            dmtTextView.setVisibility(8);
            LayoutParams layoutParams = this.f73603f.getLayoutParams();
            if (layoutParams != null) {
                ((MarginLayoutParams) layoutParams).topMargin = (int) C9432q.m18687b(this.f73603f.getContext(), 12.0f);
            } else {
                throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        if (C10181b.m20511a().mo18168a(SearchIntermediateStyleExperiment.class, true, "double_column_search_history_style", 31744, 0) == 2) {
            LayoutParams layoutParams2 = this.f73603f.getLayoutParams();
            if (layoutParams2 != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams2;
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = 0;
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }
}
