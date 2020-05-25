package com.p683ss.android.ugc.aweme.commerce.p1529a;

import android.app.Activity;
import android.content.Context;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.retrofit2.p833c.C12727a;
import com.google.gson.C17971f;
import com.p683ss.android.anywheredoor_api.C18837a;
import com.p683ss.android.anywheredoor_api.IAnyWhereDoor;
import com.p683ss.android.anywheredoor_api.IAnyWhereDoorRouter;
import com.p683ss.android.anywheredoor_api.IAnyWhereInnerService;
import com.p683ss.android.p1103ad.splash.C18769p;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.app.C23104i;
import com.p683ss.android.ugc.aweme.app.api.p1367c.C22977c;
import com.p683ss.android.ugc.aweme.commercialize.anchor.AnchorListManager;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26217c;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26220e;
import com.p683ss.android.ugc.aweme.effect.C29094ad;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.p1632di.C27613b;
import com.p683ss.android.ugc.aweme.setting.C41549aq;
import com.p683ss.android.ugc.aweme.splash.SplashAdManagerHolder;
import com.p683ss.android.ugc.aweme.utils.C47731bq;
import com.p683ss.android.ugc.aweme.utils.GsonHolder;
import com.p683ss.android.ugc.aweme.utils.GsonProvider;
import com.p683ss.android.ugc.aweme.web.C48380q;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commerce.a.a */
public final class C25484a implements IAnyWhereDoor {

    /* renamed from: a */
    public static final C25485a f67415a = new C25485a(null);

    /* renamed from: b */
    private IAnyWhereInnerService f67416b;

    /* renamed from: com.ss.android.ugc.aweme.commerce.a.a$a */
    public static final class C25485a {
        private C25485a() {
        }

        public /* synthetic */ C25485a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public static IAnyWhereDoor m61998a() {
        if (C27991b.f73422F == null) {
            synchronized (IAnyWhereDoor.class) {
                if (C27991b.f73422F == null) {
                    C27991b.f73422F = C27613b.m66296i();
                }
            }
        }
        return (IAnyWhereDoor) C27991b.f73422F;
    }

    /* renamed from: b */
    private final void m61999b() {
        this.f67416b = null;
    }

    public final Class<?> getComposePbModelClass() {
        return C22977c.class;
    }

    public final boolean isDebugOpen() {
        return false;
    }

    public final Context getContext() {
        return C11010c.m22280a();
    }

    public final IAnyWhereDoorRouter getRouter() {
        return new C25486b();
    }

    public final C12727a getNetworkInterceptor() {
        m61999b();
        IAnyWhereInnerService iAnyWhereInnerService = this.f67416b;
        if (iAnyWhereInnerService != null) {
            C12727a networkInterceptor = iAnyWhereInnerService.getNetworkInterceptor();
            if (networkInterceptor != null) {
                return networkInterceptor;
            }
        }
        return null;
    }

    public final C17971f getGson() {
        GsonProvider createGsonProviderbyMonsterPlugin = GsonHolder.createGsonProviderbyMonsterPlugin();
        C52711k.m112236a((Object) createGsonProviderbyMonsterPlugin, "ServiceManager.get().get…GsonProvider::class.java)");
        C17971f gson = createGsonProviderbyMonsterPlugin.getGson();
        if (gson == null) {
            return new C17971f();
        }
        return gson;
    }

    public final void cleanSplashVideo() {
        C26217c.m63502a();
        if (C26217c.f69224b != null) {
            File[] listFiles = new File(C26220e.f69244b).listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file.exists() && file.isFile()) {
                        file.delete();
                    }
                }
            }
        }
    }

    public final List<C18837a> getGeckoChannels() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C18837a("commerce_mt", "商业化", C47731bq.m103357i("commerce_mt")));
        arrayList.add(new C18837a("commerce_ad", C29094ad.f76264a, C47731bq.m103357i("commerce_ad")));
        arrayList.add(new C18837a("arena_dev", "开发中", C47731bq.m103357i("arena_dev")));
        return arrayList;
    }

    public final HashMap<String, String> getGeckoInfo() {
        HashMap<String, String> hashMap = new HashMap<>();
        Map map = hashMap;
        C48380q e = C48380q.m104672e();
        C52711k.m112236a((Object) e, "WebOfflineConfig.getInstance()");
        String l = e.mo95835l();
        C52711k.m112236a((Object) l, "WebOfflineConfig.getInst…e().anywhereDoorAccessKey");
        map.put("gecko_key", l);
        String g = C48380q.m104672e().mo95833g();
        C52711k.m112236a((Object) g, "WebOfflineConfig.getInst…RootDirWithoutAccessKey()");
        map.put("gecko_dir", g);
        return hashMap;
    }

    public final void fetchAnchorList(Activity activity) {
        C52711k.m112240b(activity, "activity");
        AnchorListManager.m62138a();
    }

    public final void openAnyWhereDoorPage(Context context) {
        m61999b();
        IAnyWhereInnerService iAnyWhereInnerService = this.f67416b;
        if (iAnyWhereInnerService != null) {
            iAnyWhereInnerService.openAnyWhereDoorPage(context);
        }
    }

    public final void checkSplashData(Activity activity) {
        C52711k.m112240b(activity, "activity");
        C18769p a = SplashAdManagerHolder.m99458a(C11010c.m22280a());
        if (a != null) {
            a.mo38121g();
        }
    }

    public final Class<?> getModelByPath(String str) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        if (str.hashCode() == 3138974 && str.equals(C22858c.f61207c)) {
            return FeedItemList.class;
        }
        return null;
    }

    public final void refreshStartAtlasAccount(Activity activity) {
        C52711k.m112240b(activity, "activity");
        C10691a.m21552c(getContext(), "请重新登录星图账号", 1).mo19066a();
        C27965f.m66719a(C11016e.m22312g(), "Anywhere", "click_repost_button");
    }

    public final void synSetting(Activity activity) {
        C52711k.m112240b(activity, "activity");
        C41549aq.m91378a().mo85329a(1, C11010c.m22280a());
    }

    public final void refreshUserInfo(Activity activity) {
        C52711k.m112240b(activity, "activity");
        IAccountUserService a = C20902b.m53242a();
        C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
        if (a.isLogin()) {
            C20902b.m53242a().queryUser();
            C20902b.m53242a().refreshPassportUserInfo();
            C23104i.m56672a();
        }
    }

    public final void preloadFeed(String str) {
        C52711k.m112240b(str, "feedJson");
        try {
            FeedItemList feedItemList = (FeedItemList) getGson().mo34884a(str, FeedItemList.class);
            if (feedItemList != null) {
                if (!C9376b.m18558a((Collection<T>) feedItemList.preloadAds)) {
                    C26217c.m63502a().mo53858a(C11010c.m22280a(), feedItemList.preloadAds);
                }
                if (!C9376b.m18558a((Collection<T>) feedItemList.preloadAwemes)) {
                    C26217c.m63502a().mo53858a(C11010c.m22280a(), feedItemList.preloadAwemes);
                }
            }
        } catch (Exception unused) {
        }
    }

    public final boolean switchEnable(Context context, boolean z) {
        m61999b();
        IAnyWhereInnerService iAnyWhereInnerService = this.f67416b;
        if (iAnyWhereInnerService != null) {
            return iAnyWhereInnerService.switchEnable(context, z);
        }
        return false;
    }

    public final boolean switchNetworkCounter(Context context, boolean z) {
        C52711k.m112240b(context, "context");
        m61999b();
        IAnyWhereInnerService iAnyWhereInnerService = this.f67416b;
        if (iAnyWhereInnerService != null) {
            return iAnyWhereInnerService.switchNetworkCounter(context, z);
        }
        C52711k.m112240b(context, "context");
        IAnyWhereInnerService iAnyWhereInnerService2 = this;
        C52711k.m112240b(context, "context");
        return false;
    }
}
