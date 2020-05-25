package com.p683ss.android.ugc.aweme.main.uiApiImpl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.uikit.base.C11079a;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.app.AwemeAppData;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23699m.C23700a;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p683ss.android.ugc.aweme.experiment.UnloginDiggShowInProfileExperiment;
import com.p683ss.android.ugc.aweme.familiar.p1699a.C29634a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30750af;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30753ai;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C31143x;
import com.p683ss.android.ugc.aweme.feed.p1736ui.FeedTimeLineFragment;
import com.p683ss.android.ugc.aweme.feed.pneumonia.C30674a;
import com.p683ss.android.ugc.aweme.homepage.api.p1800ui.HomePageUIFrameService;
import com.p683ss.android.ugc.aweme.main.C36637ee;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.main.MainFragment;
import com.p683ss.android.ugc.aweme.main.MainPageFragment;
import com.p683ss.android.ugc.aweme.main.TabChangeManager;
import com.p683ss.android.ugc.aweme.main.experiment.ForYouTranslationsExperiment;
import com.p683ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl;
import com.p683ss.android.ugc.aweme.message.MessagesFragment;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.FriendTabFragment;
import com.p683ss.android.ugc.aweme.notice.api.C38046d;
import com.p683ss.android.ugc.aweme.p1485by.C24465d;
import com.p683ss.android.ugc.aweme.profile.C39940m;
import com.p683ss.android.ugc.aweme.profile.unlogin.C40487e;
import com.ss.android.ugc.trill.R;
import p2628d.C52855s;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl */
public final class HomePageUIFrameServiceImpl extends HomePageUIFrameServiceCommonImpl {
    public final void afterTabChangedInMainPageFragment(String str) {
    }

    public final Class<? extends Activity> getHomePageInflateActivityClass() {
        return MainActivity.class;
    }

    public final String getSecondTabDesc(Context context) {
        C52711k.m112240b(context, "context");
        return "";
    }

    public final C23700a getBuilderForFragmentInHomePageActivity() {
        C23700a aVar = new C23700a();
        aVar.mo49125a(MainPageFragment.class, "page_feed").mo49126a(C39940m.m88696f(), "page_profile", 1, 1.0f, null);
        return aVar;
    }

    public static HomePageUIFrameService createHomePageUIFrameServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(HomePageUIFrameService.class);
        if (a != null) {
            return (HomePageUIFrameService) a;
        }
        if (C27991b.f73499bc == null) {
            synchronized (HomePageUIFrameService.class) {
                if (C27991b.f73499bc == null) {
                    C27991b.f73499bc = new HomePageUIFrameServiceImpl();
                }
            }
        }
        return (HomePageUIFrameServiceImpl) C27991b.f73499bc;
    }

    private final void addFollowFeedTab(TabChangeManager tabChangeManager) {
        tabChangeManager.mo75613a(FriendTabFragment.class, "DISCOVER", null);
    }

    private final void addProfileTab(TabChangeManager tabChangeManager) {
        Bundle bundle = new Bundle();
        bundle.putString("from", "from_main");
        IBridgeService bridgeService_Monster = I18nBridgeService.getBridgeService_Monster();
        C52711k.m112236a((Object) bridgeService_Monster, "ServiceManager.get().get…ridgeService::class.java)");
        tabChangeManager.mo75613a(bridgeService_Monster.getMyProfileFragmentClass(), "USER", bundle);
    }

    private final Bundle getMainFragmentBundle(Intent intent) {
        int i = -1;
        if (intent != null) {
            String stringExtra = intent.getStringExtra("tab");
            if (C9431p.m18664a(stringExtra)) {
                i = intent.getIntExtra("tab", -1);
            } else {
                try {
                    i = Integer.parseInt(stringExtra);
                } catch (Throwable unused) {
                }
            }
        }
        if (i < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("tab", i);
        return bundle;
    }

    public final int getItemPosition(Object obj) {
        C52711k.m112240b(obj, "object");
        SharePrefCache inst = SharePrefCache.inst();
        C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
        C23051bf showTimeLineTab = inst.getShowTimeLineTab();
        C52711k.m112236a((Object) showTimeLineTab, "SharePrefCache.inst().showTimeLineTab");
        Object d = showTimeLineTab.mo47782d();
        C52711k.m112236a(d, "SharePrefCache.inst().showTimeLineTab.cache");
        if (((Boolean) d).booleanValue() || !(obj instanceof FeedTimeLineFragment)) {
            return 0;
        }
        return -2;
    }

    public final C52855s<String[], int[], String[]> getContentForMainFragment(Context context) {
        String[] strArr;
        int[] iArr;
        SharePrefCache inst = SharePrefCache.inst();
        C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
        C23051bf isShowNearBy = inst.getIsShowNearBy();
        C52711k.m112236a((Object) isShowNearBy, "SharePrefCache.inst().isShowNearBy");
        Boolean bool = (Boolean) isShowNearBy.mo47782d();
        C52711k.m112236a((Object) bool, "isShowNearby");
        if (bool.booleanValue()) {
            iArr = new int[]{1, 0, 7};
            strArr = new String[]{"homepage_follow", "homepage_hot", "nearby"};
        } else {
            iArr = new int[]{1, 0, 2};
            strArr = new String[]{"homepage_follow", "homepage_hot", "homepage_fresh"};
        }
        return new C52855s<>(getTitles(context, bool.booleanValue()), iArr, strArr);
    }

    public final int getCount(int i) {
        SharePrefCache inst = SharePrefCache.inst();
        C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
        C23051bf showTimeLineTab = inst.getShowTimeLineTab();
        C52711k.m112236a((Object) showTimeLineTab, "SharePrefCache.inst().showTimeLineTab");
        Object d = showTimeLineTab.mo47782d();
        C52711k.m112236a(d, "SharePrefCache.inst().showTimeLineTab.cache");
        boolean booleanValue = ((Boolean) d).booleanValue();
        SharePrefCache inst2 = SharePrefCache.inst();
        C52711k.m112236a((Object) inst2, "SharePrefCache.inst()");
        C23051bf isShowNearBy = inst2.getIsShowNearBy();
        C52711k.m112236a((Object) isShowNearBy, "SharePrefCache.inst().isShowNearBy");
        Boolean bool = (Boolean) isShowNearBy.mo47782d();
        C52711k.m112236a((Object) bool, "isShowNearby");
        if (bool.booleanValue() || booleanValue) {
            return i;
        }
        return i - 1;
    }

    private final String[] getTitles(Context context, boolean z) {
        String[] strArr;
        String[] stringArray;
        Resources resources = null;
        if (z) {
            if (context != null) {
                resources = context.getResources();
            }
            if (resources == null) {
                C52711k.m112234a();
            }
            strArr = resources.getStringArray(R.array.ac);
        } else {
            if (context != null) {
                resources = context.getResources();
            }
            if (resources == null) {
                C52711k.m112234a();
            }
            strArr = resources.getStringArray(R.array.aa);
        }
        if (C10181b.m20511a().mo18172a(ForYouTranslationsExperiment.class, true, "for_you_new_translations", 31744, false)) {
            if (z) {
                Resources resources2 = context.getResources();
                if (resources2 == null) {
                    C52711k.m112234a();
                }
                stringArray = resources2.getStringArray(R.array.ad);
            } else {
                Resources resources3 = context.getResources();
                if (resources3 == null) {
                    C52711k.m112234a();
                }
                stringArray = resources3.getStringArray(R.array.ab);
            }
            strArr = stringArray;
        }
        C52711k.m112236a((Object) strArr, "tabs");
        return strArr;
    }

    public final void addTabToMainPageFragment(TabChangeManager tabChangeManager, Intent intent) {
        C52711k.m112240b(tabChangeManager, "mTabChangeManager");
        C52711k.m112240b(intent, "intent");
        tabChangeManager.mo75613a(MainFragment.class, "HOME", getMainFragmentBundle(intent));
        addFollowFeedTab(tabChangeManager);
        Class<MessagesFragment> a = C38046d.f96822b.mo77573a().mo77571a();
        if (a == null) {
            a = MessagesFragment.class;
        }
        tabChangeManager.mo75613a(a, "NOTIFICATION", null);
        Bundle bundle = new Bundle();
        bundle.putString("tab", "UNLOGIN_NOTIFICATION");
        tabChangeManager.mo75613a(C24465d.class, "UNLOGIN_NOTIFICATION", bundle);
        if (UnloginDiggShowInProfileExperiment.INSTANCE.mo59615a()) {
            tabChangeManager.mo75613a(C40487e.class, "UNLOGIN_PROFILE", new Bundle());
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putString("tab", "UNLOGIN_PROFILE");
            tabChangeManager.mo75613a(C24465d.class, "UNLOGIN_PROFILE", bundle2);
        }
        addProfileTab(tabChangeManager);
    }

    public final Fragment getItemForPagerInMainFragment(C11079a aVar, int i, String str) {
        Fragment fragment;
        C52711k.m112240b(aVar, "mainFragment");
        C52711k.m112240b(str, "eventType");
        AwemeAppData a = AwemeAppData.m47851a();
        C52711k.m112236a((Object) a, "AwemeAppData.inst()");
        a.f61130h = str;
        Bundle bundle = new Bundle(2);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", i);
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", str);
        switch (i) {
            case 1:
                fragment = new C31143x();
                break;
            case 2:
                fragment = new FeedTimeLineFragment();
                break;
            case 7:
                fragment = I18nBridgeService.getBridgeService_Monster().getNearbyFragment();
                break;
            case 8:
                fragment = new C36637ee();
                break;
            case 22:
                fragment = new C29634a();
                break;
            case 24:
                fragment = new C30674a();
                break;
            default:
                fragment = new C30753ai();
                break;
        }
        fragment.setArguments(bundle);
        if (fragment instanceof C30750af) {
            ((C30750af) fragment).f80582s = aVar;
        }
        C52711k.m112236a((Object) fragment, "fragment");
        return fragment;
    }
}
