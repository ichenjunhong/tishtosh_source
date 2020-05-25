package com.p683ss.android.ugc.aweme.search;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import com.google.gson.C17978g;
import com.p683ss.android.ugc.aweme.commercialize.C25930g;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.search.ISearchHandler */
public interface ISearchHandler {
    Fragment createCommodityFragment();

    Fragment createMixFeedFragment();

    Fragment createPoiFragment();

    Fragment createRNSingleIntermediateFragment();

    Fragment createRankingListWordFragment();

    Fragment createSingleIntermediateFragment(boolean z);

    Fragment createSingleRankingListStarFragment();

    C17978g getCommonGsonBuilder();

    boolean getDisableIntercept();

    Collection<Integer> getSearchMixVideoViewHolderLayouts();

    int getSearchPoiItemLayout();

    boolean isTeenModeOn();

    void launchDetailActivity(Activity activity, Bundle bundle, View view, List<? extends Aweme> list);

    void launchEasterEggActivity(Context context, C25930g gVar);

    void launchHotSpot(Context context, C41440e eVar);

    void launchHotSpot(Context context, C41440e eVar, String str);

    void launchUserProfileActivity(Context context, User user, String str, String str2, String str3);

    void loadTeenModeCache();

    void openRN(String str, Map<String, String> map, Context context);

    void preload(Context context);

    String replaceRnSchemaFromUrl(String str, Map<String, String> map);

    void resetTeenModeCache();

    void startLoftPlayActivity(Context context, String str, int i, Bitmap bitmap);

    void startRankingListActivity(Context context, int i);
}
