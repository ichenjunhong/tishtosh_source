package com.p683ss.android.ugc.aweme.search;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.gson.C17978g;
import com.p683ss.android.ugc.aweme.discover.adapter.C27797ad;
import com.p683ss.android.ugc.aweme.discover.mob.C28420y;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28485an;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28486ao;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.following.p1770ui.adapter.C32112c;
import com.p683ss.android.ugc.aweme.search.model.C41437b;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.search.p2122b.C41406a;
import com.p683ss.android.ugc.aweme.search.p2123c.C41409a;
import java.util.Map;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.search.k */
public final class C41431k implements ISearchService {

    /* renamed from: a */
    public static final C41431k f105004a = new C41431k();

    /* renamed from: b */
    private final /* synthetic */ ISearchService f105005b;

    public final void addActivityRouter() {
        this.f105005b.addActivityRouter();
    }

    public final void buildGson(C17978g gVar) {
        C52711k.m112240b(gVar, "builder");
        this.f105005b.buildGson(gVar);
    }

    public final C28485an createSearchUserAdapter(C27797ad adVar, String str, C32112c cVar, C41406a aVar) {
        C52711k.m112240b(adVar, "mobParam");
        C52711k.m112240b(str, "mKeyword");
        C52711k.m112240b(cVar, "mFollowUserListener");
        return this.f105005b.createSearchUserAdapter(adVar, str, cVar, aVar);
    }

    public final C28486ao createSearchUserPresenter(boolean z) {
        return this.f105005b.createSearchUserPresenter(z);
    }

    public final String getSearchId(String str) {
        return this.f105005b.getSearchId(str);
    }

    public final String getSearchKeyword(Context context) {
        return this.f105005b.getSearchKeyword(context);
    }

    public final Map<String, String> getSearchStatisticsMap(Context context, Aweme aweme) {
        return this.f105005b.getSearchStatisticsMap(context, aweme);
    }

    public final Map<String, String> getSearchStatisticsMap(Aweme aweme) {
        return this.f105005b.getSearchStatisticsMap(aweme);
    }

    public final C41409a getSearchTimeDisplayDelegate() {
        return this.f105005b.getSearchTimeDisplayDelegate();
    }

    public final int getVideoLayout() {
        return this.f105005b.getVideoLayout();
    }

    public final View inflateLayoutFromCache(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "root");
        return this.f105005b.inflateLayoutFromCache(viewGroup, i);
    }

    public final View inflateSearchUserItem(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "container");
        return this.f105005b.inflateSearchUserItem(viewGroup, i);
    }

    public final boolean isAllowShowCaption(Aweme aweme, String str) {
        return this.f105005b.isAllowShowCaption(aweme, str);
    }

    public final boolean isSearchResultActivity(Activity activity) {
        return this.f105005b.isSearchResultActivity(activity);
    }

    public final void launchSearchPage(C41437b bVar) {
        C52711k.m112240b(bVar, "launchElement");
        this.f105005b.launchSearchPage(bVar);
    }

    public final Intent makeSearchResultActivityIntent(Context context, C41440e eVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(eVar, "param");
        return this.f105005b.makeSearchResultActivityIntent(context, eVar);
    }

    public final void mobSearchCaptionShow(Aweme aweme, String str) {
        this.f105005b.mobSearchCaptionShow(aweme, str);
    }

    public final void processSearchCaption(Context context, TextView textView, Aweme aweme, String str) {
        this.f105005b.processSearchCaption(context, textView, aweme, str);
    }

    public final C28420y provideSearchContext() {
        return this.f105005b.provideSearchContext();
    }

    public final void reportSlardarCommonEvent(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C52711k.m112240b(str, "serviceName");
        C52711k.m112240b(str2, "triggerFrom");
        this.f105005b.reportSlardarCommonEvent(str, str2, jSONObject, jSONObject2, jSONObject3);
    }

    public final void tryPrefetchSearchData(C41440e eVar) {
        C52711k.m112240b(eVar, "param");
        this.f105005b.tryPrefetchSearchData(eVar);
    }

    private C41431k() {
        ISearchService a = C41432l.m91251a();
        C52711k.m112236a((Object) a, "ServiceManager.get().get…earchService::class.java)");
        this.f105005b = a;
    }
}
