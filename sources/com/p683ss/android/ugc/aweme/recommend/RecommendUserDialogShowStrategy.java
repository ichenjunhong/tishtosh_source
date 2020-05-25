package com.p683ss.android.ugc.aweme.recommend;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.experiment.EnableGroupChatExperiment;
import com.p683ss.android.ugc.aweme.feed.guide.C30289j;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.i18n.language.p1806b.C33121l;
import com.p683ss.android.ugc.aweme.main.C36605dw;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p2377ug.guide.C47464j;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.service.C40010c;
import com.p683ss.android.ugc.aweme.user.C47549c;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import p2628d.p2639f.p2641b.C52711k;

@C10178a(mo18163a = "popup_alert_recommend_strategy")
/* renamed from: com.ss.android.ugc.aweme.recommend.RecommendUserDialogShowStrategy */
public final class RecommendUserDialogShowStrategy {
    public static final RecommendUserDialogShowStrategy INSTANCE = new RecommendUserDialogShowStrategy();
    @C10179b(mo18165a = true)
    private static final int OFF = 0;
    @C10179b
    private static final int SHOW_WHEN_COLD_BOOT = 1;
    @C10179b
    private static final int SHOW_WHEN_SWITCHING_FROM_FEED = 2;

    private RecommendUserDialogShowStrategy() {
    }

    /* renamed from: a */
    public static final boolean m90741a() {
        int a = C10181b.m20511a().mo18168a(RecommendUserDialogShowStrategy.class, true, "popup_alert_recommend_strategy", 31744, 0);
        if (a == 1 || a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m90747d() {
        boolean z;
        if (!C36605dw.m82472a(false)) {
            if (!C47464j.f119726b.mo94744b() || !C30289j.m71207a(false)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m90745b() {
        if (!C47915gg.m103651b()) {
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            if (g.isLogin() && C10181b.m20511a().mo18168a(RecommendUserDialogShowStrategy.class, true, "popup_alert_recommend_strategy", 31744, 0) == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m90746c() {
        if (!C47915gg.m103651b()) {
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            if (g.isLogin() && C10181b.m20511a().mo18168a(RecommendUserDialogShowStrategy.class, true, "popup_alert_recommend_strategy", 31744, 0) == 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m90748e() {
        if (!C47915gg.m103651b()) {
            return false;
        }
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        User curUser = g.getCurUser();
        C52711k.m112236a((Object) curUser, "AccountProxyService.userService().curUser");
        if (curUser.getUserPeriod() != 1) {
            return false;
        }
        C23183v a = C23183v.m56778a();
        C52711k.m112236a((Object) a, "CommonSharePrefCache.inst()");
        C23051bf G = a.mo47896G();
        C52711k.m112236a((Object) G, "CommonSharePrefCache.inst().ftcReportFistShow");
        Long l = (Long) G.mo47782d();
        if (l == null || l.longValue() != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            C52711k.m112236a((Object) l, "firstShowTime");
            if (currentTimeMillis - l.longValue() > TimeUnit.DAYS.toMillis(30)) {
                return false;
            }
        }
        C23183v a2 = C23183v.m56778a();
        C52711k.m112236a((Object) a2, "CommonSharePrefCache.inst()");
        C23051bf F = a2.mo47895F();
        C52711k.m112236a((Object) F, "CommonSharePrefCache.inst().ftcReportShow");
        Long l2 = (Long) F.mo47782d();
        long currentTimeMillis2 = System.currentTimeMillis();
        C52711k.m112236a((Object) l2, "lastShowTime");
        if (currentTimeMillis2 - l2.longValue() > TimeUnit.DAYS.toMillis(1)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m90742a(Aweme aweme) {
        if (!C41125m.f104508b && !C47915gg.m103651b()) {
            C52711k.m112236a((Object) C47549c.m102974a(), "UserManager.inst()");
            if (!C47549c.m102978c() || m90747d()) {
                return false;
            }
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            if ((!C9376b.m18558a((Collection<T>) b.getContentLanguageGuideCodes()) && !C47915gg.m103654c()) || C33121l.m76123a(0) == 1) {
                return false;
            }
            if ((aweme == null || !aweme.isWithSurvey()) && C32616c.f84865a.checkFriendslistPermissionPopUp("homepage_hot") == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m90743a(String str) {
        C52711k.m112240b(str, "tabName");
        if (!C47915gg.m103651b()) {
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            if (g.isLogin()) {
                IAccountUserService g2 = C20854a.m53167g();
                C52711k.m112236a((Object) g2, "AccountProxyService.userService()");
                User curUser = g2.getCurUser();
                int hashCode = str.hashCode();
                if (hashCode != -1382453013) {
                    if (hashCode != 2223327) {
                        if (hashCode == 2614219 && str.equals("USER")) {
                            if (m90748e()) {
                                return false;
                            }
                            IAccountUserService g3 = C20854a.m53167g();
                            C52711k.m112236a((Object) g3, "AccountProxyService.userService()");
                            if (g3.isLogin()) {
                                C52711k.m112236a((Object) curUser, "currentUser");
                                if (curUser.isSecret()) {
                                    SharePrefCache inst = SharePrefCache.inst();
                                    C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
                                    C23051bf shouldShowPrivateAccountTipInProfile = inst.getShouldShowPrivateAccountTipInProfile();
                                    C52711k.m112236a((Object) shouldShowPrivateAccountTipInProfile, "SharePrefCache.inst().sh…rivateAccountTipInProfile");
                                    Object d = shouldShowPrivateAccountTipInProfile.mo47782d();
                                    C52711k.m112236a(d, "SharePrefCache.inst().sh…AccountTipInProfile.cache");
                                    if (((Boolean) d).booleanValue()) {
                                        return false;
                                    }
                                }
                            }
                            if (!C40010c.f101950a.mo82034f() && C32616c.f84865a.checkFriendslistPermissionPopUp("others_homepage") == 0) {
                                return true;
                            }
                            return false;
                        }
                    } else if (str.equals("HOME")) {
                        return true;
                    }
                } else if (str.equals("NOTIFICATION")) {
                    if (C33194e.m76264a() && EnableGroupChatExperiment.m69587a()) {
                        IIMService d2 = C33194e.m76279d();
                        C52711k.m112236a((Object) d2, "IM.get()");
                        if (d2.getMixBusinessService().mo72371a()) {
                            return false;
                        }
                    }
                    if (C32616c.f84865a.checkFriendslistPermissionPopUp("notification_page") != 0) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m90744a(String str, String str2) {
        if (!C47915gg.m103651b()) {
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            if (g.isLogin() && m90746c() && TextUtils.equals("HOME", str)) {
                CharSequence charSequence = str2;
                if (TextUtils.equals("NOTIFICATION", charSequence) || TextUtils.equals("USER", charSequence)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
