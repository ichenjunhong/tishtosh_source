package com.p683ss.android.ugc.aweme.search;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0643c;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0794k;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.gson.C17978g;
import com.google.gson.C18097x;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c.C27132a;
import com.p683ss.android.ugc.aweme.discover.adapter.C27797ad;
import com.p683ss.android.ugc.aweme.discover.adapter.C27881bm;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28338q;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28338q.C28339a;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28343s;
import com.p683ss.android.ugc.aweme.discover.mob.C28381ab;
import com.p683ss.android.ugc.aweme.discover.mob.C28420y;
import com.p683ss.android.ugc.aweme.discover.mob.C28420y.C28421a;
import com.p683ss.android.ugc.aweme.discover.p1644f.C28111a;
import com.p683ss.android.ugc.aweme.discover.p1644f.C28112b;
import com.p683ss.android.ugc.aweme.discover.p1645g.C28136n;
import com.p683ss.android.ugc.aweme.discover.p1645g.C28163z;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28485an;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28486ao;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28525az.C28526a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.following.p1770ui.adapter.C32112c;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.search.activity.SearchResultActivity;
import com.p683ss.android.ugc.aweme.search.activity.SearchResultActivity.C41401a;
import com.p683ss.android.ugc.aweme.search.gson.SearchMixFeedCollectionTypeAdapterFactory;
import com.p683ss.android.ugc.aweme.search.model.C41434a;
import com.p683ss.android.ugc.aweme.search.model.C41437b;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.search.model.C41441f;
import com.p683ss.android.ugc.aweme.search.model.SearchResultParamProvider.C41433a;
import com.p683ss.android.ugc.aweme.search.p2122b.C41406a;
import com.p683ss.android.ugc.aweme.search.p2123c.C41409a;
import com.p683ss.android.ugc.aweme.search.p2123c.C41410b;
import com.p683ss.android.ugc.aweme.search.performance.C41450g;
import com.p683ss.android.ugc.aweme.search.performance.C41457i;
import com.ss.android.ugc.trill.R;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.search.a */
public abstract class C41396a implements ISearchService {

    /* renamed from: a */
    public static final C41397a f104956a = new C41397a(null);

    /* renamed from: b */
    private static final String f104957b = f104957b;

    /* renamed from: com.ss.android.ugc.aweme.search.a$a */
    public static final class C41397a {
        private C41397a() {
        }

        public /* synthetic */ C41397a(C52707g gVar) {
            this();
        }
    }

    public int getVideoLayout() {
        return R.layout.bst;
    }

    public boolean isAllowShowCaption(Aweme aweme, String str) {
        return false;
    }

    public void mobSearchCaptionShow(Aweme aweme, String str) {
    }

    public void processSearchCaption(Context context, TextView textView, Aweme aweme, String str) {
    }

    public void addActivityRouter() {
        C41302w.m91044a(f104957b, SearchResultActivity.class);
    }

    public C41409a getSearchTimeDisplayDelegate() {
        return C41410b.f104973a;
    }

    public C28420y provideSearchContext() {
        return C28381ab.m67359d();
    }

    public boolean isSearchResultActivity(Activity activity) {
        return activity instanceof SearchResultActivity;
    }

    public C28486ao createSearchUserPresenter(boolean z) {
        return new C28163z(z);
    }

    public String getSearchId(String str) {
        return C28381ab.f74518i.mo56813a(C28421a.m67432a(str));
    }

    public void buildGson(C17978g gVar) {
        C52711k.m112240b(gVar, "builder");
        if (C41450g.f105073c.mo84192a()) {
            gVar.mo34894a((C18097x) new SearchMixFeedCollectionTypeAdapterFactory());
        }
    }

    public String getSearchKeyword(Context context) {
        Activity a = C23729p.m58248a(context);
        if (!(a instanceof FragmentActivity)) {
            a = null;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) a;
        if (fragmentActivity == null || !C41431k.f105004a.isSearchResultActivity(fragmentActivity)) {
            return "";
        }
        C41440e a2 = C41433a.m91252a(fragmentActivity);
        if (a2 != null) {
            return a2.getKeyword();
        }
        return null;
    }

    public Map<String, String> getSearchStatisticsMap(Aweme aweme) {
        C23089d a = C23089d.m56640a();
        if (aweme != null && !TextUtils.isEmpty(aweme.getRequestId())) {
            a.mo47829a("search_id", aweme.getRequestId());
        }
        Map<String, String> map = a.f61491a;
        C52711k.m112236a((Object) map, "builder.builder()");
        return map;
    }

    public void launchSearchPage(C41437b bVar) {
        boolean z;
        C52711k.m112240b(bVar, "launchElement");
        C41441f fVar = new C41441f();
        fVar.setClickMagnifyingGlassTime(System.currentTimeMillis());
        bVar.f105020b.setTimeParam(fVar);
        C41430j jVar = C41430j.f105003b;
        Context context = bVar.f105019a;
        C41440e eVar = bVar.f105020b;
        C41434a aVar = bVar.f105021c;
        String str = bVar.f105022d;
        String str2 = bVar.f105023e;
        Bundle bundle = bVar.f105024f;
        C52711k.m112240b(eVar, "param");
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - C41430j.f105002a;
        C41430j.f105002a = currentTimeMillis;
        if (j >= 1000) {
            z = true;
        } else {
            z = false;
        }
        if (z && context != null) {
            C28136n.f73887e++;
            C28112b bVar2 = C28112b.f73810b;
            C28111a aVar2 = new C28111a();
            C28112b.f73809a = aVar2;
            aVar2.f73801a = System.currentTimeMillis();
            if (eVar.getKeyword() != null) {
                C41431k.f105004a.tryPrefetchSearchData(eVar);
            }
            if (aVar != null) {
                aVar.getGroupId();
            }
            if (context instanceof Activity) {
                if (bundle == null) {
                    bundle = C0643c.m1726a((Activity) context, new C0794k[0]).mo2171a();
                }
                C41401a.m91219a(context, eVar, aVar, bundle);
                return;
            }
            C41401a aVar3 = SearchResultActivity.f104959c;
            C41401a.m91219a(context, eVar, aVar, null);
        }
    }

    public void tryPrefetchSearchData(C41440e eVar) {
        boolean z;
        int i;
        String str;
        C52711k.m112240b(eVar, "param");
        C28136n nVar = C28136n.f73888f;
        boolean z2 = true;
        int i2 = 0;
        if (!C28136n.f73884b || C28136n.m66999b()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C28136n nVar2 = C28136n.f73888f;
            C52711k.m112240b(eVar, "param");
            C52711k.m112240b(eVar, "param");
            C28339a a = new C28339a().mo56749a(eVar);
            String keyword = eVar.getKeyword();
            C52711k.m112236a((Object) keyword, "param.keyword");
            C28339a c = a.mo56750a(keyword).mo56747a(0).mo56753b(C28343s.m67288c()).mo56756c(1);
            if (8 == eVar.getSearchFrom()) {
                i = 0;
            } else {
                i = 1;
            }
            C28339a d = c.mo56758d(i);
            CharSequence enterMethod = eVar.getEnterMethod();
            if (!(enterMethod == null || enterMethod.length() == 0)) {
                z2 = false;
            }
            if (!z2) {
                str = eVar.getEnterMethod();
            } else {
                str = eVar.getEnterFrom();
            }
            C52711k.m112236a((Object) str, "if (!param.enterMethod.i…thod else param.enterFrom");
            C28339a c2 = d.mo56757c(str);
            if (eVar.getSearchFrom() == 2 || eVar.getSearchFrom() == 5) {
                i2 = C28526a.m67668a();
            }
            C28338q b = c2.mo56759e(i2).mo56755b();
            C52711k.m112240b(b, "request");
            if (C28136n.f73884b && !C28136n.m66999b()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - C28136n.f73885c;
                C28136n.f73885c = currentTimeMillis;
                if (j >= 1000) {
                    C28136n.f73883a.put(b, new C52847n(b, b.mo56742b()));
                }
            }
        }
    }

    public View inflateLayoutFromCache(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "root");
        return C41457i.f105090b.mo84196a(viewGroup, i);
    }

    public View inflateSearchUserItem(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "container");
        return C41457i.f105090b.mo84196a(viewGroup, i);
    }

    public Intent makeSearchResultActivityIntent(Context context, C41440e eVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(eVar, "param");
        Intent intent = new Intent(context, SearchResultActivity.class);
        intent.putExtra("searchParam", eVar);
        return intent;
    }

    public Map<String, String> getSearchStatisticsMap(Context context, Aweme aweme) {
        Activity a = C23729p.m58248a(context);
        if (!(a instanceof FragmentActivity)) {
            a = null;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) a;
        if (fragmentActivity == null || !C41431k.f105004a.isSearchResultActivity(fragmentActivity)) {
            return new LinkedHashMap<>();
        }
        C23089d a2 = C23089d.m56640a();
        if (aweme != null && !TextUtils.isEmpty(aweme.getRequestId())) {
            a2.mo47829a("search_id", aweme.getRequestId());
        }
        Map<String, String> map = a2.f61491a;
        C52711k.m112236a((Object) map, "builder.builder()");
        return map;
    }

    public C28485an createSearchUserAdapter(C27797ad adVar, String str, C32112c cVar, C41406a aVar) {
        C52711k.m112240b(adVar, "mobParam");
        C52711k.m112240b(str, "mKeyword");
        C52711k.m112240b(cVar, "mFollowUserListener");
        return new C27881bm(adVar, str, cVar, aVar);
    }

    public void reportSlardarCommonEvent(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C52711k.m112240b(str, "serviceName");
        C52711k.m112240b(str2, "triggerFrom");
        C27132a.m65458a().mo55450a(str, str2, jSONObject, jSONObject2, jSONObject3);
    }
}
