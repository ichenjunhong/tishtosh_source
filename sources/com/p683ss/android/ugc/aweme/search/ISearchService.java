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

/* renamed from: com.ss.android.ugc.aweme.search.ISearchService */
public interface ISearchService {
    void addActivityRouter();

    void buildGson(C17978g gVar);

    C28485an createSearchUserAdapter(C27797ad adVar, String str, C32112c cVar, C41406a aVar);

    C28486ao createSearchUserPresenter(boolean z);

    String getSearchId(String str);

    String getSearchKeyword(Context context);

    Map<String, String> getSearchStatisticsMap(Context context, Aweme aweme);

    Map<String, String> getSearchStatisticsMap(Aweme aweme);

    C41409a getSearchTimeDisplayDelegate();

    int getVideoLayout();

    View inflateLayoutFromCache(ViewGroup viewGroup, int i);

    View inflateSearchUserItem(ViewGroup viewGroup, int i);

    boolean isAllowShowCaption(Aweme aweme, String str);

    boolean isSearchResultActivity(Activity activity);

    void launchSearchPage(C41437b bVar);

    Intent makeSearchResultActivityIntent(Context context, C41440e eVar);

    void mobSearchCaptionShow(Aweme aweme, String str);

    void processSearchCaption(Context context, TextView textView, Aweme aweme, String str);

    C28420y provideSearchContext();

    void reportSlardarCommonEvent(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    void tryPrefetchSearchData(C41440e eVar);
}
