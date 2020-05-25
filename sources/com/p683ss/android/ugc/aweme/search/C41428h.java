package com.p683ss.android.ugc.aweme.search;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import com.google.gson.C17978g;
import com.p683ss.android.ugc.aweme.commercialize.C25930g;
import com.p683ss.android.ugc.aweme.discover.SearchHandlerImpl;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.search.h */
public final class C41428h implements ISearchHandler {

    /* renamed from: a */
    public static final C41428h f105000a = new C41428h();

    /* renamed from: b */
    private final /* synthetic */ ISearchHandler f105001b;

    public final Fragment createCommodityFragment() {
        return this.f105001b.createCommodityFragment();
    }

    public final Fragment createMixFeedFragment() {
        return this.f105001b.createMixFeedFragment();
    }

    public final Fragment createPoiFragment() {
        return this.f105001b.createPoiFragment();
    }

    public final Fragment createRNSingleIntermediateFragment() {
        return this.f105001b.createRNSingleIntermediateFragment();
    }

    public final Fragment createRankingListWordFragment() {
        return this.f105001b.createRankingListWordFragment();
    }

    public final Fragment createSingleIntermediateFragment(boolean z) {
        return this.f105001b.createSingleIntermediateFragment(z);
    }

    public final Fragment createSingleRankingListStarFragment() {
        return this.f105001b.createSingleRankingListStarFragment();
    }

    public final C17978g getCommonGsonBuilder() {
        return this.f105001b.getCommonGsonBuilder();
    }

    public final boolean getDisableIntercept() {
        return this.f105001b.getDisableIntercept();
    }

    public final Collection<Integer> getSearchMixVideoViewHolderLayouts() {
        return this.f105001b.getSearchMixVideoViewHolderLayouts();
    }

    public final int getSearchPoiItemLayout() {
        return this.f105001b.getSearchPoiItemLayout();
    }

    public final boolean isTeenModeOn() {
        return this.f105001b.isTeenModeOn();
    }

    public final void launchDetailActivity(Activity activity, Bundle bundle, View view, List<? extends Aweme> list) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(bundle, "bundle");
        C52711k.m112240b(view, "view");
        C52711k.m112240b(list, "awemes");
        this.f105001b.launchDetailActivity(activity, bundle, view, list);
    }

    public final void launchEasterEggActivity(Context context, C25930g gVar) {
        C52711k.m112240b(gVar, "pageParams");
        this.f105001b.launchEasterEggActivity(context, gVar);
    }

    public final void launchHotSpot(Context context, C41440e eVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(eVar, "param");
        this.f105001b.launchHotSpot(context, eVar);
    }

    public final void launchHotSpot(Context context, C41440e eVar, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(eVar, "param");
        this.f105001b.launchHotSpot(context, eVar, str);
    }

    public final void launchUserProfileActivity(Context context, User user, String str, String str2, String str3) {
        C52711k.m112240b(context, "context");
        this.f105001b.launchUserProfileActivity(context, user, str, str2, str3);
    }

    public final void loadTeenModeCache() {
        this.f105001b.loadTeenModeCache();
    }

    public final void openRN(String str, Map<String, String> map, Context context) {
        C52711k.m112240b(map, "options");
        this.f105001b.openRN(str, map, context);
    }

    public final void preload(Context context) {
        C52711k.m112240b(context, "context");
        this.f105001b.preload(context);
    }

    public final String replaceRnSchemaFromUrl(String str, Map<String, String> map) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(map, "paramsMap");
        return this.f105001b.replaceRnSchemaFromUrl(str, map);
    }

    public final void resetTeenModeCache() {
        this.f105001b.resetTeenModeCache();
    }

    public final void startLoftPlayActivity(Context context, String str, int i, Bitmap bitmap) {
        C52711k.m112240b(str, "loftId");
        this.f105001b.startLoftPlayActivity(context, str, i, bitmap);
    }

    public final void startRankingListActivity(Context context, int i) {
        C52711k.m112240b(context, "context");
        this.f105001b.startRankingListActivity(context, i);
    }

    private C41428h() {
        ISearchHandler createISearchHandlerbyMonsterPlugin = SearchHandlerImpl.createISearchHandlerbyMonsterPlugin();
        C52711k.m112236a((Object) createISearchHandlerbyMonsterPlugin, "ServiceManager.get().get…earchHandler::class.java)");
        this.f105001b = createISearchHandlerbyMonsterPlugin;
    }
}
