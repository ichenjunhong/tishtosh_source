package com.p683ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.app.C22835a.C22863g;
import com.p683ss.android.ugc.aweme.app.C23034av.C23035a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.ChallengeDetailActivity;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26403au;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.experiment.FtcBindExperiment;
import com.p683ss.android.ugc.aweme.friends.p1792ui.InviteUserListActivity;
import com.p683ss.android.ugc.aweme.i18n.settings.agreements.AgreementActivity;
import com.p683ss.android.ugc.aweme.live.C36006a;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.live.ILiveOuterService;
import com.p683ss.android.ugc.aweme.live.feedpage.C36091h;
import com.p683ss.android.ugc.aweme.live.feedpage.LiveStateApi;
import com.p683ss.android.ugc.aweme.livewallpaper.p1929ui.LocalLiveWallPaperActivity;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.miniapp_api.C36949e;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b.C36961a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTNotificationTabMergeExperiment;
import com.p683ss.android.ugc.aweme.p1803i.C33089c;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.story.live.C46641d;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.app.aj */
public final class C22934aj extends C22835a {

    /* renamed from: d */
    public static final C22936b f61263d = new C22936b(null);

    /* renamed from: com.ss.android.ugc.aweme.app.aj$a */
    public static final class C22935a extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return C47915gg.m103651b();
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            Intent intent = new Intent();
            intent.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
            intent.setFlags(335544320);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            C23041b.f61395b.mo47764a("homepage_hot", uri, z);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.aj$b */
    public static final class C22936b {
        private C22936b() {
        }

        public /* synthetic */ C22936b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.aj$c */
    public static final class C22937c extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return C52830p.m112411b(sb.toString(), "aweme/create", false, 2, null);
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            boolean booleanQueryParameter = uri.getBooleanQueryParameter("effects", false);
            boolean booleanQueryParameter2 = uri.getBooleanQueryParameter("blur", false);
            boolean booleanQueryParameter3 = uri.getBooleanQueryParameter("duet", false);
            String queryParameter = uri.getQueryParameter("aweme_id");
            Intent intent = new Intent(activity, PushCameraBlurActivity.class);
            intent.putExtra("show_dialog", booleanQueryParameter2);
            intent.putExtra("show_effect", booleanQueryParameter);
            intent.putExtra("show_duet", booleanQueryParameter3);
            intent.putExtra("aid", queryParameter);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.aj$d */
    public static final class C22938d extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return C52711k.m112239a((Object) str, (Object) C22858c.f61207c);
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            Intent intent = new Intent(activity, MainActivity.class);
            try {
                int parseInt = Integer.parseInt(uri.getQueryParameter("tab"));
                intent.putExtra("tab", parseInt);
                if (parseInt == 1) {
                    C23041b.f61395b.mo47764a("homepage_hot", uri, z);
                } else if (parseInt == 2) {
                    C23041b.f61395b.mo47764a("homepage_fresh", uri, z);
                }
            } catch (Exception unused) {
            }
            intent.addFlags(536870912);
            intent.addFlags(32768);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.aj$e */
    public static final class C22939e extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return C52711k.m112239a((Object) sb.toString(), (Object) "friend/find");
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            if (a.isLogin() && TextUtils.equals(uri.getQueryParameter("platform"), "facebook")) {
                IAccountUserService a2 = C20902b.m53242a();
                C52711k.m112236a((Object) a2, "AccountUserProxyService.get()");
                User curUser = a2.getCurUser();
                C52711k.m112236a((Object) curUser, "AccountUserProxyService.get().curUser");
                if (curUser.getUserMode() != 2 && C10181b.m20511a().mo18172a(FtcBindExperiment.class, true, "ftc_bind_enable", 31744, false) && !C20854a.m53165e().isPlatformBound("facebook")) {
                    Intent intent = new Intent(activity, InviteUserListActivity.class);
                    intent.putExtra("type", 3);
                    intent.putExtra("enter_from", "guide_to_invite_third_friends");
                    return intent;
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.aj$f */
    public static final class C22940f extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return C52711k.m112239a((Object) "game", (Object) str);
        }

        /* renamed from: a */
        public final void mo47676a(Activity activity, Uri uri, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C23137q a = C23137q.m56698a();
            C52711k.m112236a((Object) a, "AwemeRuntime.inst()");
            if (a.mo47855c()) {
                C36960b a2 = new C36961a().mo76222b("schema").mo76221a();
                Context context = activity;
                C36983a.m83185b().mo76294a().openMiniApp(context, C36949e.m83165a("", uri.getQueryParameter("game_id"), true, ""), a2);
                return;
            }
            Intent mainActivityIntent = MainActivity.getMainActivityIntent(activity);
            String queryParameter = uri.getQueryParameter("game_id");
            mainActivityIntent.putExtra("jumpToGame", true);
            mainActivityIntent.putExtra("gameId", queryParameter);
            activity.startActivity(mainActivityIntent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.aj$g */
    public static final class C22941g extends C22863g {

        /* renamed from: a */
        public final String f61264a = "click_push_follow_request";

        /* renamed from: b */
        public final String f61265b = "click_push_follow_approve";

        /* renamed from: c */
        public final String f61266c = "click_push_follow";

        /* renamed from: d */
        public final String f61267d = "click_push_digg";

        /* renamed from: e */
        public final String f61268e = "click_push_digg_comment";

        /* renamed from: f */
        public final String f61269f = "click_push_forward_digg";

        /* renamed from: g */
        public final String f61270g = "click_push_vote";

        /* renamed from: h */
        public final String f61271h = "click_push_comment";

        /* renamed from: i */
        public final String f61272i = "click_push_replycomment";

        /* renamed from: j */
        public final String f61273j = "click_push_forward";

        /* renamed from: k */
        public final String f61274k = "click_push_forward_and_forward";

        /* renamed from: l */
        public final String f61275l = "click_push_forward_comment";

        /* renamed from: m */
        public final String f61276m = "click_push_forwardreplycomment";

        /* renamed from: n */
        public final String f61277n = "click_push_videoat";

        /* renamed from: o */
        public final String f61278o = "click_push_commentat";

        /* renamed from: p */
        public final String f61279p = "click_push_forward_at";

        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            if (C52711k.m112239a((Object) "notification", (Object) str) || C52711k.m112239a((Object) "chat", (Object) str)) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            String queryParameter = uri.getQueryParameter("multi_account_push_uid");
            if (MTNotificationTabMergeExperiment.m85062b()) {
                if (!C52711k.m112239a((Object) "chat", (Object) str) || !C52711k.m112239a((Object) "/system", (Object) str2)) {
                    String queryParameter2 = uri.getQueryParameter("gd_label");
                    Intent intent = new Intent();
                    CharSequence charSequence = queryParameter2;
                    if (TextUtils.equals(charSequence, this.f61266c)) {
                        intent = SmartRouter.buildRoute((Context) activity, "//notification").withParam("from_where", 0).buildIntent();
                        C52711k.m112236a((Object) intent, "SmartRouter.buildRoute(a…           .buildIntent()");
                    } else if (TextUtils.equals(charSequence, this.f61267d) || TextUtils.equals(charSequence, this.f61268e) || TextUtils.equals(charSequence, this.f61269f)) {
                        intent = SmartRouter.buildRoute((Context) activity, "//notification").withParam("from_where", 1).buildIntent();
                        C52711k.m112236a((Object) intent, "SmartRouter.buildRoute(a…           .buildIntent()");
                    } else if (TextUtils.equals(charSequence, this.f61271h) || TextUtils.equals(charSequence, this.f61272i) || TextUtils.equals(charSequence, this.f61270g) || TextUtils.equals(charSequence, this.f61273j) || TextUtils.equals(charSequence, this.f61274k) || TextUtils.equals(charSequence, this.f61275l) || TextUtils.equals(charSequence, this.f61276m)) {
                        intent = SmartRouter.buildRoute((Context) activity, "//notification").withParam("from_where", 3).buildIntent();
                        C52711k.m112236a((Object) intent, "SmartRouter.buildRoute(a…           .buildIntent()");
                    } else if (TextUtils.equals(charSequence, this.f61277n) || TextUtils.equals(charSequence, this.f61279p) || TextUtils.equals(charSequence, this.f61278o)) {
                        intent = SmartRouter.buildRoute((Context) activity, "//notification").withParam("from_where", 2).buildIntent();
                        C52711k.m112236a((Object) intent, "SmartRouter.buildRoute(a…           .buildIntent()");
                    } else {
                        intent.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
                        intent.setFlags(335544320);
                        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
                    }
                    intent.putExtra("enter_from", "push");
                    C23111k a = C23111k.m56679a();
                    C52711k.m112236a((Object) a, "AppLifeCircleCacheManager.getInstance()");
                    if (a.f61536a) {
                        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
                    }
                    IAccountUserService a2 = C20902b.m53242a();
                    C52711k.m112236a((Object) a2, "AccountUserProxyService.get()");
                    if (!a2.isLogin()) {
                        return C23035a.m56552a(activity, intent, queryParameter);
                    }
                    return intent;
                }
                Intent buildIntent = SmartRouter.buildRoute((Context) activity, "//notification").withParam("from_where", 5).buildIntent();
                IAccountUserService a3 = C20902b.m53242a();
                C52711k.m112236a((Object) a3, "AccountUserProxyService.get()");
                if (!a3.isLogin()) {
                    return C23035a.m56552a(activity, buildIntent, queryParameter);
                }
                return buildIntent;
            } else if (C52711k.m112239a((Object) "chat", (Object) str)) {
                IIMService d = C33194e.m76279d();
                C52711k.m112236a((Object) d, "IM.get()");
                Class sessionListActivityClass = d.getSessionListActivityClass();
                if (sessionListActivityClass != null) {
                    IAccountUserService a4 = C20902b.m53242a();
                    C52711k.m112236a((Object) a4, "AccountUserProxyService.get()");
                    if (!a4.isLogin()) {
                        return C23035a.m56552a(activity, new Intent(activity, sessionListActivityClass), queryParameter);
                    }
                    return new Intent(activity, sessionListActivityClass);
                }
                IAccountUserService a5 = C20902b.m53242a();
                C52711k.m112236a((Object) a5, "AccountUserProxyService.get()");
                if (!a5.isLogin()) {
                    return C23035a.m56552a(activity, null, queryParameter);
                }
                return null;
            } else if (!C52711k.m112239a((Object) "notification", (Object) str)) {
                return null;
            } else {
                Intent intent2 = new Intent();
                intent2.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
                intent2.setFlags(335544320);
                intent2.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
                String queryParameter3 = uri.getQueryParameter("label");
                C23041b.f61395b.mo47764a(queryParameter3, uri, z);
                if (TextUtils.equals(queryParameter3, "check_profile")) {
                    intent2.putExtra("push", true);
                }
                IAccountUserService a6 = C20902b.m53242a();
                C52711k.m112236a((Object) a6, "AccountUserProxyService.get()");
                if (!a6.isLogin()) {
                    return C23035a.m56552a(activity, intent2, queryParameter);
                }
                return intent2;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.aj$h */
    public static final class C22942h extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return C52711k.m112239a((Object) str, (Object) "helper_center");
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            Intent intent = new Intent(activity, AgreementActivity.class);
            intent.putExtra("URL_FIELD", "https://support.tiktok.com");
            intent.putExtra("FIELD_TITLE", activity.getString(R.string.b23));
            intent.putExtra("FIELD_SHOW_AGREE_BUTTON", false);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.aj$i */
    public static final class C22943i extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return C52711k.m112239a((Object) str, (Object) "link_account");
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            Intent intent = new Intent();
            intent.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
            intent.setFlags(335544320);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_LINK_ACCOUNT", true);
            C23041b.f61395b.mo47764a("message", uri, z);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.aj$j */
    public static final class C22944j extends C22863g {

        /* renamed from: com.ss.android.ugc.aweme.app.aj$j$a */
        static final class C22945a<T> implements C1710e<Map<Long, Long>> {

            /* renamed from: a */
            final /* synthetic */ User f61280a;

            C22945a(User user) {
                this.f61280a = user;
            }

            public final /* synthetic */ void accept(Object obj) {
                String str;
                Map map = (Map) obj;
                String uid = this.f61280a.getUid();
                C52711k.m112236a((Object) uid, "user.uid");
                Long l = (Long) map.get(Long.valueOf(Long.parseLong(uid)));
                if (l != null) {
                    long longValue = l.longValue();
                    C46641d.m101223b(String.valueOf(longValue), this.f61280a.getUid());
                    String uid2 = this.f61280a.getUid();
                    if (longValue > 0) {
                        str = "live_on";
                    } else {
                        str = "live_finish";
                    }
                    C46641d.m101211a(uid2, longValue, str);
                }
            }
        }

        /* renamed from: a */
        public final String mo47674a(Uri uri) {
            C52711k.m112240b(uri, "uri");
            return CustomActionPushReceiver.f104061f;
        }

        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            if (C52711k.m112239a((Object) str, (Object) CustomActionPushReceiver.f104061f) || C52711k.m112239a((Object) str, (Object) "live.musical.ly")) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            Intent intent;
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str4 = str3;
            boolean z2 = z;
            C52711k.m112240b(activity2, "activity");
            C52711k.m112240b(uri2, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str4, "fromTokenType");
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            if (!a.isLogin()) {
                return new Intent(activity2, MainActivity.class);
            }
            long j = 0;
            String queryParameter = uri2.getQueryParameter("userId");
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = uri2.getQueryParameter("user_id");
            }
            String str5 = queryParameter;
            String queryParameter2 = uri2.getQueryParameter(C22835a.f61196a);
            C22835a.f61198c.mo47680a(str5, uri, true);
            String queryParameter3 = uri2.getQueryParameter("liveId");
            if (TextUtils.isEmpty(queryParameter3)) {
                queryParameter3 = uri2.getQueryParameter("room_id");
            }
            String queryParameter4 = uri2.getQueryParameter("from");
            if (TextUtils.isEmpty(queryParameter4)) {
                queryParameter4 = uri2.getQueryParameter("gd_label");
            }
            String queryParameter5 = uri2.getQueryParameter("enter_from_merge");
            String queryParameter6 = uri2.getQueryParameter("enter_method");
            String queryParameter7 = uri2.getQueryParameter("backurl");
            String queryParameter8 = uri2.getQueryParameter("tab_index");
            try {
                j = Long.parseLong(queryParameter3);
            } catch (NumberFormatException unused) {
            }
            User user = new User();
            user.setUid(str5);
            user.roomId = j;
            Context context = activity2;
            if (!C22952ak.m56417a(context)) {
                return new Intent(context, MainActivity.class);
            }
            AwemeAppData.m47851a().f61131i = true;
            if (!TextUtils.isEmpty(str5)) {
                C23027aq aqVar = new C23027aq(context);
                aqVar.f61369d = queryParameter4;
                aqVar.f61368c = str4;
                aqVar.f61370e = j;
                aqVar.f61372g = null;
                aqVar.f61367b = queryParameter8;
                aqVar.f61366a = z2;
                if (z2) {
                    C46641d.m101223b(String.valueOf(aqVar.f61370e), str5);
                }
                LiveStateApi a2 = C36173w.m81665a().getLiveStateManager().mo74798a();
                if (a2 != null) {
                    a2.liveStates(str5).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C1710e<C36091h>(str5, queryParameter2) {

                        /* renamed from: a */
                        final /* synthetic */ String f61373a;

                        /* renamed from: b */
                        final /* synthetic */ String f61374b;

                        public final /* synthetic */ void accept(Object obj) throws Exception {
                            boolean z;
                            String str;
                            long j;
                            C36091h hVar = (C36091h) obj;
                            Long l = (Long) hVar.mo74841a().get(Long.valueOf(Long.parseLong(this.f61373a)));
                            if (!(l instanceof Long) || l.longValue() == 0) {
                                z = true;
                                l = Long.valueOf(C23027aq.this.f61370e);
                            } else {
                                z = false;
                            }
                            User user = new User();
                            user.setUid(this.f61373a);
                            user.setSecUid(this.f61374b);
                            user.roomId = l.longValue();
                            if (z) {
                                str = "live_finish";
                            } else {
                                str = "live_on";
                            }
                            if (C23027aq.this.f61366a) {
                                String uid = user.getUid();
                                if (user.roomId > 0) {
                                    j = user.roomId;
                                } else {
                                    j = C23027aq.this.f61370e;
                                }
                                C46641d.m101211a(uid, j, str);
                            }
                            C23027aq aqVar = C23027aq.this;
                            String str2 = this.f61373a;
                            String requestId = hVar.getRequestId();
                            long longValue = l.longValue();
                            if (!TextUtils.equals(aqVar.f61369d, C23060d.f61427a) && !TextUtils.isEmpty("jsbridge")) {
                                C46641d.m101206a(C11010c.m22280a(), 1, requestId, str2, longValue);
                            }
                            if (!TextUtils.isEmpty(aqVar.f61368c)) {
                                C26890h.m65011a("live_play", C23089d.m56640a().mo47829a("enter_from", aqVar.f61368c).mo47829a("anchor_id", str2).f61491a);
                            }
                            C36006a e = new C36006a(C23027aq.this.f61371f, user).mo74737a(C23027aq.this.f61367b).mo74739b("push").mo74735a(4).mo74740c("push").mo74742e(C23027aq.this.f61372g);
                            if (C23027aq.this.f61366a) {
                                e.mo74738a("livesdk_live_push_status", str);
                            }
                            C36173w.m81665a().getLiveWatcherUtils().mo70097a(e);
                        }

                        {
                            this.f61373a = r2;
                            this.f61374b = r3;
                        }
                    }, (C1710e<? super Throwable>) new C1710e<Throwable>(str5, queryParameter2) {

                        /* renamed from: a */
                        final /* synthetic */ String f61376a;

                        /* renamed from: b */
                        final /* synthetic */ String f61377b;

                        public final /* synthetic */ void accept(Object obj) throws Exception {
                            Throwable th = (Throwable) obj;
                            if (C23027aq.this.f61366a) {
                                C46641d.m101211a(this.f61376a, 0, "live_query_api_error");
                            }
                            User user = new User();
                            user.setUid(this.f61376a);
                            user.setSecUid(this.f61377b);
                            user.roomId = C23027aq.this.f61370e;
                            C36006a e = new C36006a(C23027aq.this.f61371f, user).mo74737a(C23027aq.this.f61367b).mo74739b("push").mo74735a(4).mo74740c("push").mo74742e(C23027aq.this.f61372g);
                            if (C23027aq.this.f61366a) {
                                e.mo74738a("livesdk_live_push_status", "live_query_api_error");
                            }
                            C36173w.m81665a().getLiveWatcherUtils().mo70097a(e);
                        }

                        {
                            this.f61376a = r2;
                            this.f61377b = r3;
                        }
                    });
                }
                intent = null;
            } else {
                CharSequence charSequence = queryParameter4;
                if (TextUtils.equals(charSequence, C23060d.f61427a) || TextUtils.equals(charSequence, "jsbridge")) {
                    intent = null;
                } else {
                    intent = null;
                    C46641d.m101206a(context, 1, user.getRequestId(), user.getUid(), user.roomId);
                }
                if (z2) {
                    C36173w.m81665a().getLiveStateManager().mo74801a(C22934aj.f61263d.getClass(), user, (C1710e<Map<Long, Long>>) new C22945a<Map<Long, Long>>(user));
                }
                ILiveOuterService a3 = C36173w.m81665a();
                C52711k.m112236a((Object) a3, "ServiceManager.get().get…OuterService::class.java)");
                C33089c liveWatcherUtils = a3.getLiveWatcherUtils();
                C36006a a4 = new C36006a(context, user).mo74737a(queryParameter8);
                if (z2) {
                    queryParameter5 = "push";
                } else if (queryParameter5 == null || TextUtils.isEmpty(queryParameter5)) {
                    queryParameter5 = C23060d.f61427a;
                }
                C36006a a5 = a4.mo74739b(queryParameter5).mo74735a(4);
                if (z2) {
                    queryParameter6 = "push";
                } else if (queryParameter6 == null || TextUtils.isEmpty(queryParameter6)) {
                    queryParameter6 = C23060d.f61427a;
                }
                liveWatcherUtils.mo70097a(a5.mo74740c(queryParameter6).mo74738a("backUrl", queryParameter7));
            }
            C23041b.f61395b.mo47764a(CustomActionPushReceiver.f104061f, uri2, z2);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.aj$k */
    public static final class C22946k extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return C52711k.m112239a((Object) str, (Object) "livewallpaper");
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            return new Intent(activity, LocalLiveWallPaperActivity.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.aj$l */
    public static final class C22947l extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            if (C52711k.m112239a((Object) "microapp", (Object) str) || C52711k.m112239a((Object) "microgame", (Object) str)) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo47676a(Activity activity, Uri uri, boolean z) {
            String str;
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            CharSequence queryParameter = uri.getQueryParameter("schema_from");
            if (TextUtils.equals(queryParameter, "splash")) {
                str = "025001";
            } else if (TextUtils.equals(queryParameter, "qr_code")) {
                str = "021002";
            } else if (TextUtils.equals(queryParameter, "ad_link")) {
                str = "025003";
            } else {
                str = "";
            }
            String queryParameter2 = uri.getQueryParameter("position");
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            C36983a.m83185b().mo76294a().openMiniApp((Context) activity, uri.toString(), new C36961a().mo76222b("schema").mo76223c(str).mo76220a(queryParameter2).mo76225e(C23060d.f61428b).mo76221a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.aj$m */
    public static final class C22948m extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return C52711k.m112239a((Object) str, (Object) "growth_activity_dialog");
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            return new Intent(activity, MainActivity.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.aj$n */
    public static final class C22949n extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return C52711k.m112239a((Object) str, (Object) "private");
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            Intent intent = new Intent();
            String queryParameter = uri.getQueryParameter("multi_account_push_uid");
            intent.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
            intent.setFlags(335544320);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
            intent.putExtra("label", uri.getQueryParameter("label"));
            intent.putExtra("uid", uri.getLastPathSegment());
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            if (!a.isLogin()) {
                return C23035a.m56552a(activity, intent, queryParameter);
            }
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.aj$o */
    public static final class C22950o extends C22863g {
        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return C52830p.m112411b(sb.toString(), "user/referral", false, 2, null);
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            return new Intent(activity, MainActivity.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.aj$p */
    public static final class C22951p extends C22863g {
        /* renamed from: a */
        public final String mo47674a(Uri uri) {
            C52711k.m112240b(uri, "uri");
            return "challenge_detail";
        }

        /* renamed from: a */
        public final boolean mo47675a(String str, String str2) {
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            return C52711k.m112239a((Object) str, (Object) "tag");
        }

        /* renamed from: a */
        public final Intent mo47673a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(str, "host");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str3, "fromTokenType");
            C26403au.m63861a(uri, uri.getQueryParameter("id"));
            Intent intent = new Intent(activity, ChallengeDetailActivity.class);
            intent.putExtra("id", uri.getQueryParameter("id"));
            intent.putExtra("enter_from", uri.getQueryParameter("enter_from"));
            C23041b.f61395b.mo47764a("challenge_detail", uri, z);
            return intent;
        }
    }
}
