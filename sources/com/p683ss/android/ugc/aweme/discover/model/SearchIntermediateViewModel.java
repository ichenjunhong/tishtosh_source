package com.p683ss.android.ugc.aweme.discover.model;

import android.arch.lifecycle.C0209x;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23275b;
import com.p683ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p683ss.android.ugc.aweme.discover.p1644f.C28116e;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28522ay.C28523a;
import com.p683ss.android.ugc.aweme.search.C41431k;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.search.model.C41441f;
import p2628d.C52668f;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel */
public final class SearchIntermediateViewModel extends C0209x implements C28523a {
    static final /* synthetic */ C52767h[] $$delegatedProperties = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SearchIntermediateViewModel.class), "searchKeyword", "getSearchKeyword()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SearchIntermediateViewModel.class), "intermediateState", "getIntermediateState()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SearchIntermediateViewModel.class), "openSearchParam", "getOpenSearchParam()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SearchIntermediateViewModel.class), "searchTabIndex", "getSearchTabIndex()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SearchIntermediateViewModel.class), "dismissKeyboard", "getDismissKeyboard()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SearchIntermediateViewModel.class), "dismissKeyboardOnActionDown", "getDismissKeyboardOnActionDown()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;"))};
    public static final Companion Companion = new Companion(null);
    private final C52668f dismissKeyboard$delegate = SearchIntermediateViewModelKt.lazy(SearchIntermediateViewModel$dismissKeyboard$2.INSTANCE);
    private final C52668f dismissKeyboardOnActionDown$delegate = SearchIntermediateViewModelKt.lazy(SearchIntermediateViewModel$dismissKeyboardOnActionDown$2.INSTANCE);
    public C52670a<String> getIntermediateContainer = SearchIntermediateViewModel$getIntermediateContainer$1.INSTANCE;
    private final C52668f intermediateState$delegate = SearchIntermediateViewModelKt.lazy(SearchIntermediateViewModel$intermediateState$2.INSTANCE);
    private final C52668f openSearchParam$delegate = SearchIntermediateViewModelKt.lazy(SearchIntermediateViewModel$openSearchParam$2.INSTANCE);
    private final C52668f searchKeyword$delegate = SearchIntermediateViewModelKt.lazy(SearchIntermediateViewModel$searchKeyword$2.INSTANCE);
    private final C52668f searchTabIndex$delegate = SearchIntermediateViewModelKt.lazy(SearchIntermediateViewModel$searchTabIndex$2.INSTANCE);
    public C41441f timeParam;

    /* renamed from: com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    public final C23275b<Boolean> getDismissKeyboard() {
        return (C23275b) this.dismissKeyboard$delegate.getValue();
    }

    public final C23275b<Boolean> getDismissKeyboardOnActionDown() {
        return (C23275b) this.dismissKeyboardOnActionDown$delegate.getValue();
    }

    public final C23275b<Integer> getIntermediateState() {
        return (C23275b) this.intermediateState$delegate.getValue();
    }

    public final C23275b<C41440e> getOpenSearchParam() {
        return (C23275b) this.openSearchParam$delegate.getValue();
    }

    public final C23275b<String> getSearchKeyword() {
        return (C23275b) this.searchKeyword$delegate.getValue();
    }

    public final C23275b<Integer> getSearchTabIndex() {
        return (C23275b) this.searchTabIndex$delegate.getValue();
    }

    public final void hideIntermediate() {
        getIntermediateState().setValue(Integer.valueOf(0));
    }

    public final void openSearchSquare() {
        getIntermediateState().setValue(Integer.valueOf(1));
    }

    public final boolean canDismissKeyboardOnActionDown() {
        Boolean bool = (Boolean) getDismissKeyboardOnActionDown().getValue();
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final void setGetIntermediateContainer(C52670a<String> aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.getIntermediateContainer = aVar;
    }

    public final void openSearch(C41440e eVar) {
        C52711k.m112240b(eVar, "param");
        if (!TextUtils.isEmpty(eVar.getKeyword())) {
            C41431k.f105004a.tryPrefetchSearchData(eVar);
            getOpenSearchParam().setValue(eVar);
            hideIntermediate();
        }
    }

    public final void openSearchSug(String str) {
        C52711k.m112240b(str, "keyword");
        Integer num = (Integer) getIntermediateState().getValue();
        if (num == null || num.intValue() != 2 || !TextUtils.equals(str, (CharSequence) getSearchKeyword().getValue())) {
            getSearchKeyword().setValue(str);
            getIntermediateState().setValue(Integer.valueOf(2));
        }
    }

    public final void handleGuessWordItemClick(Word word, int i) {
        C52711k.m112240b(word, "word");
        C41440e keyword = new C41440e().setSearchFrom(16).setEnterFrom("recom_search").setOpenNewSearchContainer(SearchIntermediateViewModelFlavorDiff.shouldOpenNewSearchContainer()).setKeyword(word.getWord());
        C52711k.m112236a((Object) keyword, "param");
        C28116e.m66922a(5, keyword);
        openSearch(keyword);
        C23794bh.m58379E().mo58332a("search_transfer_trending_words_click");
    }
}
