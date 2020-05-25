package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.arch.C23268b;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.discover.adapter.C27859bf;
import com.p683ss.android.ugc.aweme.discover.adapter.C27859bf.C27860a;
import com.p683ss.android.ugc.aweme.discover.adapter.C27918o;
import com.p683ss.android.ugc.aweme.discover.api.HotSearchApi.C28050a;
import com.p683ss.android.ugc.aweme.discover.api.SuggestWordsApi;
import com.p683ss.android.ugc.aweme.discover.api.p1638a.C28064a;
import com.p683ss.android.ugc.aweme.discover.helper.GuessWordsTimeHelper;
import com.p683ss.android.ugc.aweme.discover.mob.C28389ai;
import com.p683ss.android.ugc.aweme.discover.model.HotSearchAdData;
import com.p683ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.p683ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p683ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p683ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.p683ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27718c;
import com.p683ss.android.ugc.aweme.discover.p1640c.p1641a.C28069a;
import com.p683ss.android.ugc.aweme.discover.p1640c.p1641a.C28071b;
import com.p683ss.android.ugc.aweme.discover.p1644f.C28111a;
import com.p683ss.android.ugc.aweme.discover.p1644f.C28112b;
import com.p683ss.android.ugc.aweme.discover.p1651i.C28236a;
import com.p683ss.android.ugc.aweme.discover.p1651i.C28239b;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28522ay.C28523a;
import com.p683ss.android.ugc.aweme.discover.viewmodel.C28957a;
import com.p683ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel;
import com.p683ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel.C28943a;
import com.p683ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel.C28944b;
import com.p683ss.android.ugc.aweme.discover.viewmodel.HotSearchRankingListViewModel;
import com.p683ss.android.ugc.aweme.discover.viewmodel.HotSearchRankingListViewModel.C28947b;
import com.p683ss.android.ugc.aweme.discover.viewmodel.HotSearchRankingListViewModel.C28948c;
import com.p683ss.android.ugc.aweme.discover.viewmodel.HotSearchViewModel;
import com.p683ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel.C28950a;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.search.C41424g;
import com.p683ss.android.ugc.aweme.search.model.C41434a;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.search.model.C41441f;
import com.p683ss.android.ugc.aweme.search.performance.C41447d;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import p001a.C0011g;
import p001a.C0013i;
import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.C2206z;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.cg */
public class C28635cg extends C28572bm<Object> implements C0184k, C28482ak, C28523a {

    /* renamed from: l */
    static final /* synthetic */ C52767h[] f75185l = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28635cg.class), "mGuessWordsTimeHelper", "getMGuessWordsTimeHelper()Lcom/ss/android/ugc/aweme/discover/helper/GuessWordsTimeHelper;"))};

    /* renamed from: o */
    public static final C28636a f75186o = new C28636a(null);

    /* renamed from: m */
    public SearchStateViewModel f75187m;

    /* renamed from: n */
    public C28239b f75188n;

    /* renamed from: p */
    private HotSearchViewModel f75189p;

    /* renamed from: q */
    private GuessWordsViewModel f75190q;

    /* renamed from: r */
    private C28236a f75191r;

    /* renamed from: s */
    private final C52668f f75192s = C52732g.m112285a(new C28640e(this));

    /* renamed from: t */
    private ViewGroup f75193t;

    /* renamed from: u */
    private NestedWebScrollView f75194u;

    /* renamed from: v */
    private boolean f75195v = true;

    /* renamed from: w */
    private final C0199s<C28064a<List<HotSearchItem>>> f75196w = new C28638c(this);

    /* renamed from: x */
    private final C0199s<C28064a<TypeWords>> f75197x = new C28637b(this);

    /* renamed from: y */
    private final C0199s<C23268b<String, Object>> f75198y = new C28639d(this);

    /* renamed from: z */
    private HashMap f75199z;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.cg$a */
    public static final class C28636a {
        private C28636a() {
        }

        public /* synthetic */ C28636a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.cg$b */
    static final class C28637b<T> implements C0199s<C28064a<TypeWords>> {

        /* renamed from: a */
        final /* synthetic */ C28635cg f75200a;

        C28637b(C28635cg cgVar) {
            this.f75200a = cgVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C28064a aVar = (C28064a) obj;
            if (!C41424g.m91245e() && aVar != null) {
                if (aVar.f73735a) {
                    TypeWords typeWords = (TypeWords) aVar.f73736b;
                    if (typeWords == null) {
                        C52711k.m112234a();
                    }
                    List<Word> list = typeWords.words;
                    if (list != null && list.size() < 3) {
                        list = null;
                    }
                    this.f75200a.mo58265f().mo56281a(list);
                    return;
                }
                this.f75200a.mo58265f().mo56281a(null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.cg$c */
    static final class C28638c<T> implements C0199s<C28064a<List<? extends HotSearchItem>>> {

        /* renamed from: a */
        final /* synthetic */ C28635cg f75201a;

        C28638c(C28635cg cgVar) {
            this.f75201a = cgVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C27860a aVar;
            List list;
            C28064a aVar2 = (C28064a) obj;
            if (aVar2 != null) {
                if (aVar2.f73735a) {
                    C27859bf f = this.f75201a.mo58265f();
                    List list2 = (List) aVar2.f73736b;
                    f.f73198e.f73753c = true;
                    if (C9376b.m18558a((Collection<T>) list2)) {
                        aVar = f.mo56280a();
                        list = Collections.emptyList();
                        C52711k.m112236a((Object) list, "Collections.emptyList()");
                    } else {
                        C27860a a = f.mo56280a();
                        if (list2 == null) {
                            C52711k.m112234a();
                        }
                        C27860a aVar3 = a;
                        list = list2;
                        aVar = aVar3;
                    }
                    aVar.mo56288b(list);
                } else if (this.f75201a.isViewValid()) {
                    Context context = this.f75201a.getContext();
                    Context context2 = this.f75201a.getContext();
                    if (context2 == null) {
                        C52711k.m112234a();
                    }
                    C10691a.m21545b(context, context2.getString(R.string.c28)).mo19066a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.cg$d */
    static final class C28639d<T> implements C0199s<C23268b<String, Object>> {

        /* renamed from: a */
        final /* synthetic */ C28635cg f75202a;

        C28639d(C28635cg cgVar) {
            this.f75202a = cgVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C23268b bVar = (C23268b) obj;
            SearchStateViewModel searchStateViewModel = this.f75202a.f75187m;
            if (searchStateViewModel == null) {
                C52711k.m112237a("mSearchStateViewModel");
            }
            C0198r<C23268b<String, Object>> rVar = searchStateViewModel.hotSearchLiveData;
            C52711k.m112236a((Object) rVar, "mSearchStateViewModel.hotSearchLiveData");
            rVar.setValue(bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.cg$e */
    static final class C28640e extends C52712l implements C52670a<GuessWordsTimeHelper> {

        /* renamed from: a */
        final /* synthetic */ C28635cg f75203a;

        C28640e(C28635cg cgVar) {
            this.f75203a = cgVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            FragmentActivity activity = this.f75203a.getActivity();
            if (activity != null) {
                return (GuessWordsTimeHelper) C0214z.m440a(activity).mo359a(GuessWordsTimeHelper.class);
            }
            return null;
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo58275p();
    }

    /* renamed from: p */
    public final void mo58275p() {
        if (this.f75199z != null) {
            this.f75199z.clear();
        }
    }

    /* renamed from: n */
    public final String mo58272n() {
        return C28389ai.m67368a(mo58273o());
    }

    /* renamed from: o */
    public final int mo58273o() {
        Integer num = (Integer) mo58266g().getSearchTabIndex().getValue();
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: h */
    public final void mo58267h() {
        super.mo58267h();
        C27859bf f = mo58265f();
        C28482ak akVar = this;
        C52711k.m112240b(akVar, "handler");
        C28071b bVar = f.f73198e;
        C52711k.m112240b(akVar, "handler");
        bVar.f73752b = akVar;
        C27859bf f2 = mo58265f();
        C28523a aVar = this;
        C52711k.m112240b(aVar, "handler");
        C28069a aVar2 = f2.f73197d;
        C52711k.m112240b(aVar, "handler");
        aVar2.f73747a = aVar;
    }

    /* renamed from: j */
    public final boolean mo58269j() {
        Integer num = (Integer) mo58266g().getIntermediateState().getValue();
        if (num == null) {
            return false;
        }
        if (num.intValue() == 2 || num.intValue() == 0) {
            NestedWebScrollView nestedWebScrollView = this.f75194u;
            if (nestedWebScrollView != null && nestedWebScrollView.getVisibility() == 0) {
                NestedWebScrollView nestedWebScrollView2 = this.f75194u;
                if (nestedWebScrollView2 != null) {
                    nestedWebScrollView2.setVisibility(4);
                }
            }
        }
        return super.mo58269j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo58271m() {
        NestedWebScrollView nestedWebScrollView = this.f75194u;
        if (nestedWebScrollView != null) {
            nestedWebScrollView.setVisibility(0);
        }
        super.mo58271m();
        ViewGroup viewGroup = this.f75193t;
        if (viewGroup == null) {
            C52711k.m112237a("mRNFragment");
        }
        if (viewGroup.getChildCount() <= 1 && this.f75194u != null) {
            ViewGroup viewGroup2 = this.f75193t;
            if (viewGroup2 == null) {
                C52711k.m112237a("mRNFragment");
            }
            C23526a aVar = this;
            C0184k kVar = this;
            C52711k.m112240b(viewGroup2, "parent");
            C52711k.m112240b(aVar, "fragment");
            C52711k.m112240b(kVar, "owner");
            this.f75188n = new C28239b(new View(viewGroup2.getContext()), aVar, kVar);
            ViewGroup viewGroup3 = this.f75193t;
            if (viewGroup3 == null) {
                C52711k.m112237a("mRNFragment");
            }
            C28239b bVar = this.f75188n;
            if (bVar == null) {
                C52711k.m112237a("mSearchInterSecondFloorViewHolder");
            }
            viewGroup3.addView(bVar.itemView, 0, new LayoutParams(-1, -2));
        }
    }

    /* renamed from: i */
    public final void mo58268i() {
        super.mo58268i();
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C52711k.m112234a();
        }
        C0209x a = C0214z.m440a(activity).mo359a(SearchStateViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…ateViewModel::class.java)");
        this.f75187m = (SearchStateViewModel) a;
        C0209x a2 = C0214z.m438a((Fragment) this).mo359a(HotSearchViewModel.class);
        HotSearchViewModel hotSearchViewModel = (HotSearchViewModel) a2;
        C0184k kVar = this;
        hotSearchViewModel.f75781a.observe(kVar, this.f75196w);
        hotSearchViewModel.f75782b.observe(kVar, this.f75198y);
        C52711k.m112236a((Object) a2, "ViewModelProviders.of(th…archWordBundleObserver) }");
        this.f75189p = hotSearchViewModel;
        FragmentActivity activity2 = getActivity();
        if (activity2 == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) activity2, "activity!!");
        GuessWordsViewModel a3 = C28943a.m68264a(activity2);
        a3.f75769a.observe(kVar, this.f75197x);
        this.f75190q = a3;
        if (C41424g.m91245e()) {
            RecyclerView recyclerView = this.f75074c;
            if (recyclerView == null) {
                C52711k.m112237a("mListView");
            }
            ViewGroup viewGroup = recyclerView;
            C23526a aVar = this;
            C52711k.m112240b(viewGroup, "parent");
            C52711k.m112240b(aVar, "fragment");
            this.f75191r = new C28236a(viewGroup, aVar);
            C27718c cVar = this.f75073b;
            if (cVar == null) {
                C52711k.m112237a("mHeaderAndFooterWrapper");
            }
            C28236a aVar2 = this.f75191r;
            if (aVar2 == null) {
                C52711k.m112237a("mSearchInterMainViewHolder");
            }
            cVar.mo56145a(aVar2.itemView);
        }
        C52711k.m112240b(this, "$this$initDiff");
    }

    /* renamed from: l */
    public final void mo58270l() {
        String str;
        super.mo58270l();
        if (!m67784k()) {
            if (!C41424g.m91245e()) {
                C27859bf f = mo58265f();
                if (this.f75195v && C41424g.m91249i()) {
                    f.mo56281a(C27918o.f73330h);
                }
                this.f75195v = false;
                f.f73197d.f73748b = true;
                f.f73198e.f73753c = true;
            }
            if (C41424g.m91249i()) {
                GuessWordsTimeHelper guessWordsTimeHelper = (GuessWordsTimeHelper) this.f75192s.getValue();
                if (guessWordsTimeHelper != null) {
                    SearchIntermediateViewModel g = mo58266g();
                    C52711k.m112240b(g, "intermediateViewModel");
                    C41441f fVar = g.timeParam;
                    if (!guessWordsTimeHelper.f73982a && fVar != null) {
                        fVar.setGuessWordsRequestTime(System.currentTimeMillis());
                        C23794bh.m58379E().mo58333a("search_transfer_native_send_request", fVar.getGuessWordsRequestTime() - fVar.getClickMagnifyingGlassTime());
                        guessWordsTimeHelper.f73982a = true;
                    }
                }
                GuessWordsViewModel guessWordsViewModel = this.f75190q;
                if (guessWordsViewModel == null) {
                    C52711k.m112237a("mGuessWordsViewModel");
                }
                C41434a b = C28950a.m68269b(getActivity());
                IRetrofit a = GuessWordsViewModel.m68262a();
                String str2 = "30000";
                C28112b bVar = C28112b.f73810b;
                C28111a aVar = C28112b.f73809a;
                if (aVar != null) {
                    aVar.f73802b = System.currentTimeMillis();
                }
                SuggestWordsApi suggestWordsApi = (SuggestWordsApi) a.create(SuggestWordsApi.class);
                if (b != null) {
                    str = b.consumeGid();
                } else {
                    str = null;
                }
                suggestWordsApi.getSuggestWords(str2, str, "").mo20a((C0011g<TResult, TContinuationResult>) new C28944b<TResult,TContinuationResult>(guessWordsViewModel), C0013i.f25b);
            }
            if (C41424g.m91245e()) {
                FragmentActivity activity = getActivity();
                if (activity == null) {
                    C52711k.m112234a();
                }
                HotSearchRankingListViewModel hotSearchRankingListViewModel = (HotSearchRankingListViewModel) C0214z.m440a(activity).mo359a(HotSearchRankingListViewModel.class);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - hotSearchRankingListViewModel.f75776b >= C28957a.f75796a || !hotSearchRankingListViewModel.f75777c) {
                    hotSearchRankingListViewModel.f75776b = currentTimeMillis;
                    C1680ad.m5960a((C2206z<? extends T>) C28050a.m66820a().getHotSearchList(Integer.valueOf(1), null, Integer.valueOf(0), "", " ", "")).mo6155b(C2168a.m6521b()).mo6157b((C1711f<? super T, ? extends R>) C28947b.f75778a).mo6148a(C1667a.m5940a()).mo6159b((C1683ag<? super T>) new C28948c<Object>(hotSearchRankingListViewModel));
                }
            }
        }
    }

    @C53771m
    public final void onWebViewScrollToTop(C28645cj cjVar) {
        C52711k.m112240b(cjVar, "event");
        NestedWebScrollView nestedWebScrollView = this.f75194u;
        if (nestedWebScrollView != null) {
            nestedWebScrollView.setTop(true);
        }
    }

    public void handleGuessWordItemClick(Word word, int i) {
        C52711k.m112240b(word, "word");
        mo58266g().handleGuessWordItemClick(word, i);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C41447d.m91261a();
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (onCreateView == null) {
            C52711k.m112234a();
        }
        View findViewById = onCreateView.findViewById(R.id.ceb);
        C52711k.m112236a((Object) findViewById, "view!!.findViewById(R.id.rn_fragment)");
        this.f75193t = (ViewGroup) findViewById;
        this.f75194u = (NestedWebScrollView) onCreateView.findViewById(R.id.et_);
        return onCreateView;
    }

    /* renamed from: a */
    public final void mo56499a(HotSearchItem hotSearchItem, int i, String str) {
        String str2;
        C52711k.m112240b(hotSearchItem, "item");
        C52711k.m112240b(str, "enterFrom");
        C41440e wordType = new C41440e().setKeyword(hotSearchItem.getWord()).setWordType(hotSearchItem.getHotSpotWordType());
        HotSearchAdData adData = hotSearchItem.getAdData();
        if (adData != null) {
            str2 = adData.getItemIdList();
        } else {
            str2 = null;
        }
        C41440e source = wordType.setItemIdList(str2).setRealSearchWord(hotSearchItem.getRealSearchWord()).setAd(hotSearchItem.isAd()).setSearchFrom(2).setEnterFrom(str).setSource("hot_search_section");
        C52711k.m112236a((Object) source, "SearchResultParam()\n    …OURCE_HOT_SEARCH_SECTION)");
        C52711k.m112240b(source, "$this$setOpenNewSearchContainer");
        source.setOpenNewSearchContainer(false);
        C41424g.m91248h();
        mo58263a(source);
    }
}
