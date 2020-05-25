package com.p683ss.android.ugc.aweme.commerce.p1529a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.anywheredoor_api.C18838b.C18839a;
import com.p683ss.android.anywheredoor_api.IAnyWhereDoorRouter;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22722h;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1382aq.C23208an;
import com.p683ss.android.ugc.aweme.search.C41431k;
import com.p683ss.android.ugc.aweme.search.model.C41434a;
import com.p683ss.android.ugc.aweme.search.model.C41437b;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import java.lang.reflect.Method;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.commerce.a.b */
public final class C25486b implements IAnyWhereDoorRouter {

    /* renamed from: a */
    public static final C25487a f67417a = new C25487a(null);

    /* renamed from: com.ss.android.ugc.aweme.commerce.a.b$a */
    public static final class C25487a {
        private C25487a() {
        }

        public /* synthetic */ C25487a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.a.b$b */
    static final class C25488b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f67418a;

        C25488b(Activity activity) {
            this.f67418a = activity;
        }

        public final void run() {
            Intent launchIntentForPackage = this.f67418a.getPackageManager().getLaunchIntentForPackage(this.f67418a.getPackageName());
            Activity activity = this.f67418a;
            C52711k.m112236a((Object) launchIntentForPackage, "intent");
            activity.startActivity(Intent.makeRestartActivityTask(launchIntentForPackage.getComponent()));
            Runtime.getRuntime().exit(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.a.b$c */
    static final class C25489c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f67419a;

        C25489c(Activity activity) {
            this.f67419a = activity;
        }

        public final void run() {
            C18839a.m45927a().mo38460a().checkSplashData(this.f67419a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.a.b$d */
    public static final class C25490d implements AsyncServiceLoader {

        /* renamed from: a */
        final /* synthetic */ Activity f67420a;

        /* renamed from: b */
        final /* synthetic */ Builder f67421b;

        C25490d(Activity activity, Builder builder) {
            this.f67420a = activity;
            this.f67421b = builder;
        }

        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C52711k.m112240b(asyncAVService, "service");
            asyncAVService.uiService().recordService().startRecord((Context) this.f67420a, this.f67421b.build());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.a.b$e */
    static final class C25491e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f67422a;

        C25491e(Activity activity) {
            this.f67422a = activity;
        }

        public final void run() {
            Method declaredMethod = this.f67422a.getClass().getDeclaredMethod("getCurrentFeedRecommendFragment", new Class[0]);
            C52711k.m112236a((Object) declaredMethod, "getCurrentFeedRecommendFragmentMethod");
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.f67422a, new Object[0]);
        }
    }

    /* renamed from: b */
    private static void m62001b(Activity activity) throws Throwable {
        C52711k.m112240b(activity, "activity");
        C41434a a = C41434a.Companion.newBuilder().mo84113a("homepage_hot").mo84112a(1).mo84115b("").mo84114a();
        C41440e searchFrom = new C41440e().setSearchFrom(17);
        C41431k kVar = C41431k.f105004a;
        Context context = activity;
        C52711k.m112236a((Object) searchFrom, "param");
        C41437b bVar = new C41437b(context, searchFrom, a, "", null, null);
        kVar.launchSearchPage(bVar);
    }

    /* renamed from: a */
    private static void m62000a(Activity activity) throws Throwable {
        C52711k.m112240b(activity, "activity");
        Class cls = Class.forName("com.ss.android.ugc.aweme.utils.ActivityStack");
        Activity[] activityArr = (Activity[]) cls.getDeclaredMethod("getActivityStack", new Class[0]).invoke(cls, new Object[0]);
        Activity activity2 = null;
        if (activityArr != null) {
            int length = activityArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Activity activity3 = activityArr[i];
                String name = activity3.getClass().getName();
                C52711k.m112236a((Object) name, "it.javaClass.name");
                if (C52830p.m112456b((CharSequence) name, (CharSequence) "com.ss.android.ugc.aweme.main.MainActivity", false, 2, (Object) null)) {
                    activity2 = activity3;
                    break;
                }
                i++;
            }
        }
        if (activity2 != null) {
            Intent intent = new Intent(C18839a.m45927a().mo38460a().getContext(), activity2.getClass());
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            intent.addFlags(268435456);
            C18839a.m45927a().mo38460a().getContext().startActivity(intent);
            new Handler(Looper.getMainLooper()).postDelayed(new C25491e(activity2), 500);
            return;
        }
        throw new IllegalArgumentException("【AnyWhereDoor】Main Activity Not Found!");
    }

    public final void startRoute(String str, Activity activity) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        C52711k.m112240b(activity, "activity");
        switch (str.hashCode()) {
            case -1849961962:
                if (str.equals("my_profile")) {
                    C52711k.m112240b(activity, "activity");
                    SmartRouter.buildRoute((Context) activity, "aweme://user/profile?sec_uid=MS4wLjABAAAATmLP1Fku8Ml_6vNt554lml47qGBxkB7GOy0Fob8TvhI").open();
                    C18839a.m45927a().mo38460a().refreshUserInfo(activity);
                    return;
                }
                break;
            case -906336856:
                if (str.equals("search")) {
                    m62001b(activity);
                    return;
                }
                break;
            case -895866265:
                if (str.equals("splash")) {
                    C52711k.m112240b(activity, "activity");
                    new Thread(new C25489c(activity)).start();
                    return;
                }
                break;
            case -169343402:
                if (str.equals("shutdown")) {
                    C10691a.m21552c((Context) activity, "5s后重启", 0).mo19066a();
                    new Handler(Looper.getMainLooper()).postDelayed(new C25488b(activity), 5000);
                    return;
                }
                break;
            case -121207376:
                if (str.equals("discovery")) {
                    C52711k.m112240b(activity, "activity");
                    m62001b(activity);
                    return;
                }
                break;
            case 3138974:
                if (str.equals(C22858c.f61207c)) {
                    m62000a(activity);
                    return;
                }
                break;
            case 461177713:
                if (str.equals("search_query")) {
                    C52711k.m112240b(activity, "activity");
                    SmartRouter.buildRoute((Context) activity, "//search?keyword=FPX NB&display_keyword=跳转搜索页&enter_from=anywheredoor").open();
                    return;
                }
                break;
            case 1210177285:
                if (str.equals("anchor_request")) {
                    C18839a.m45927a().mo38460a().fetchAnchorList(activity);
                    break;
                }
                break;
            case 1216225589:
                if (str.equals("user_profile")) {
                    C52711k.m112240b(activity, "activity");
                    SmartRouter.buildRoute((Context) activity, "aweme://user/profile?sec_uid=MS4wLjABAAAATmLP1Fku8Ml_6vNt554lml47qGBxkB7GOy0Fob8TvhI").open();
                    C18839a.m45927a().mo38460a().refreshUserInfo(activity);
                    return;
                }
                break;
            case 1402633315:
                if (str.equals("challenge")) {
                    C52711k.m112240b(activity, "activity");
                    SmartRouter.buildRoute((Context) activity, "aweme://aweme/challenge/detail?cid=1622711827927047").withParam("is_commerce", "1").open();
                    return;
                }
                break;
            case 1434631203:
                if (str.equals("settings")) {
                    C18839a.m45927a().mo38460a().synSetting(activity);
                    return;
                }
                break;
            case 1880910712:
                if (str.equals("create_video")) {
                    C52711k.m112240b(activity, "activity");
                    AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C25490d(activity, new Builder().creationId("").shootWay("direct_shoot").groupId(C23208an.m56933a()).enterFrom(C22722h.m55986c()).fromMain(true).musicType(1).translationType(3)));
                    return;
                }
                break;
            case 2122459230:
                if (str.equals("star_atlas")) {
                    C18839a.m45927a().mo38460a().refreshStartAtlasAccount(activity);
                    return;
                }
                break;
        }
    }
}
