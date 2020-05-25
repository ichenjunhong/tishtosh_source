package com.p683ss.android.ugc.aweme.discover;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.ies.abmock.C10181b;
import com.google.gson.C17978g;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a;
import com.p683ss.android.ugc.aweme.commerce.C25492b;
import com.p683ss.android.ugc.aweme.commercialize.C25930g;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26386al;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.crossplatform.preload.C27278a;
import com.p683ss.android.ugc.aweme.crossplatform.preload.C27278a.C27279a;
import com.p683ss.android.ugc.aweme.crossplatform.preload.PreloadReleaseObserver;
import com.p683ss.android.ugc.aweme.detail.p1628ui.DetailActivity;
import com.p683ss.android.ugc.aweme.discover.abtest.EpidemicDynamicCardExperiment;
import com.p683ss.android.ugc.aweme.discover.hotspot.HotSpotDetailActivity;
import com.p683ss.android.ugc.aweme.discover.hotspot.HotSpotDetailActivity.C28222a;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28325h;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28325h.C28326a;
import com.p683ss.android.ugc.aweme.discover.p1645g.C28148t;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28516ax;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28635cg;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28667c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.utils.C31181ae;
import com.p683ss.android.ugc.aweme.feed.utils.C31181ae.C31182a;
import com.p683ss.android.ugc.aweme.feed.utils.C31181ae.C31183b;
import com.p683ss.android.ugc.aweme.feed.utils.C31181ae.C31184c;
import com.p683ss.android.ugc.aweme.feed.utils.C31181ae.C31185d;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.miniapp.anchor.C36811b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.p683ss.android.ugc.aweme.profile.presenter.C39958b;
import com.p683ss.android.ugc.aweme.search.ISearchHandler;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.SearchHandlerImpl */
public final class SearchHandlerImpl implements ISearchHandler {
    public final Fragment createRankingListWordFragment() {
        return null;
    }

    public final Fragment createSingleRankingListStarFragment() {
        return null;
    }

    public final int getSearchPoiItemLayout() {
        return R.layout.b4_;
    }

    public final void startLoftPlayActivity(Context context, String str, int i, Bitmap bitmap) {
        C52711k.m112240b(str, "loftId");
    }

    public final void startRankingListActivity(Context context, int i) {
        C52711k.m112240b(context, "context");
    }

    public final Fragment createCommodityFragment() {
        C52711k.m112236a((Object) null, "SearchBridge.createCommodityFragment()");
        return null;
    }

    public final Fragment createMixFeedFragment() {
        C52711k.m112236a((Object) null, "SearchBridge.createMixFeedFragment()");
        return null;
    }

    public final Fragment createPoiFragment() {
        return new C28148t();
    }

    public final Fragment createRNSingleIntermediateFragment() {
        return new C28516ax();
    }

    public final boolean getDisableIntercept() {
        return C28667c.m67925b();
    }

    public final void resetTeenModeCache() {
        C31181ae.f81600a = null;
        C31181ae.f81601b = null;
    }

    public final C17978g getCommonGsonBuilder() {
        C17978g commonGsonBuilder = GsonHolder.commonGsonBuilder();
        C52711k.m112236a((Object) commonGsonBuilder, "GsonHolder.commonGsonBuilder()");
        return commonGsonBuilder;
    }

    public static ISearchHandler createISearchHandlerbyMonsterPlugin() {
        Object a = C27991b.m66756a(ISearchHandler.class);
        if (a != null) {
            return (ISearchHandler) a;
        }
        return new SearchHandlerImpl();
    }

    public final boolean isTeenModeOn() {
        if (C31181ae.f81600a == null) {
            return TimeLockRuler.isTeenModeON();
        }
        Boolean bool = C31181ae.f81600a;
        if (bool == null) {
            C52711k.m112234a();
        }
        return bool.booleanValue();
    }

    public final void loadTeenModeCache() {
        C0013i.m16a((Callable<TResult>) C31182a.f81603a).mo20a((C0011g<TResult, TContinuationResult>) C31183b.f81604a, C0013i.f25b);
        C0013i.m16a((Callable<TResult>) C31184c.f81605a).mo20a((C0011g<TResult, TContinuationResult>) C31185d.f81606a, C0013i.f25b);
    }

    public final Collection<Integer> getSearchMixVideoViewHolderLayouts() {
        return C52575l.m112133c(C52575l.m112099b((Object[]) new Integer[]{Integer.valueOf(R.layout.b_n), Integer.valueOf(R.layout.a4k), Integer.valueOf(R.layout.ba0), Integer.valueOf(R.layout.b_r), Integer.valueOf(R.layout.b_w), Integer.valueOf(R.layout.b_s), Integer.valueOf(R.layout.b_u), Integer.valueOf(R.layout.a77)}), C25280a.m61493a().provideViewHolderLayoutIdsForPreload());
    }

    public final Fragment createSingleIntermediateFragment(boolean z) {
        return new C28635cg();
    }

    public final void preload(Context context) {
        Context context2;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(context, "context");
        boolean z = true;
        if (C10181b.m20511a().mo18168a(EpidemicDynamicCardExperiment.class, true, "epidemic_dynamic_type", 31744, 0) == 1) {
            if (!(context instanceof FragmentActivity)) {
                context2 = null;
            } else {
                context2 = context;
            }
            FragmentActivity fragmentActivity = (FragmentActivity) context2;
            if (fragmentActivity != null) {
                C28325h hVar = C28325h.f74308a;
                String a = C28325h.m67252a();
                if (a.length() != 0) {
                    z = false;
                }
                if (z) {
                    a = "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Ffe_lynx_main_web%2Fwuhan_search%2Findex.html%3F&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dfe_lynx_main_wuhan_search%26bundle%3Dindex.js%26module_name%3Dpage_wuhan_search%26bg_theme%3D%2523161823%26loading_bgcolor%3D%2523161823%26hide_nav_bar%3D1%26dynamic%3D1";
                }
                C27278a aVar = C27278a.f71960b;
                C27279a aVar2 = new C28326a(context);
                C52711k.m112240b(fragmentActivity, "fragmentActivity");
                C52711k.m112240b(a, "keyUrl");
                C52711k.m112240b(a, "loadUrl");
                C52711k.m112240b(aVar2, "factory");
                fragmentActivity.getLifecycle().mo324a(new PreloadReleaseObserver(a, fragmentActivity));
                C27278a.m65728a(a, a, aVar2);
            }
        }
    }

    public final void launchEasterEggActivity(Context context, C25930g gVar) {
        C52711k.m112240b(gVar, "pageParams");
        C26386al.m63838a(context, gVar, -1);
    }

    public final String replaceRnSchemaFromUrl(String str, Map<String, String> map) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(map, "paramsMap");
        return C36811b.m82840a(str, map);
    }

    public final void launchHotSpot(Context context, C41440e eVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(eVar, "param");
        C28222a aVar = HotSpotDetailActivity.f74087l;
        C28222a.m67136a(context, eVar, null);
    }

    public final void launchHotSpot(Context context, C41440e eVar, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(eVar, "param");
        C28222a.m67136a(context, eVar, str);
    }

    public final void openRN(String str, Map<String, String> map, Context context) {
        C52711k.m112240b(map, "options");
        C25492b.m62002a(str, map, context);
    }

    public final void launchDetailActivity(Activity activity, Bundle bundle, View view, List<? extends Aweme> list) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(bundle, "bundle");
        C52711k.m112240b(view, "view");
        C52711k.m112240b(list, "awemeList");
        C39958b bVar = new C39958b();
        bVar.setItems(list);
        C31213v.m72896a((C26875a) bVar);
        if (activity != null) {
            Intent intent = new Intent(activity, DetailActivity.class);
            intent.putExtras(bundle);
            DetailActivity.m66078a(activity, intent, view);
        }
    }

    public final void launchUserProfileActivity(Context context, User user, String str, String str2, String str3) {
        C52711k.m112240b(context, "context");
        UserProfileActivity.m89404a(context, user, str, str2, str3);
    }
}
