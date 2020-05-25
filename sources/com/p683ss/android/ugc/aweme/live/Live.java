package com.p683ss.android.ugc.aweme.live;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.C2240a;
import com.bytedance.android.live.base.C2950a;
import com.bytedance.android.live.base.p185b.C2953a;
import com.bytedance.android.live.base.p185b.C2955b;
import com.bytedance.android.live.base.p192sp.C3018a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.feed.p334c.C6856b;
import com.bytedance.android.livesdkapi.C8827j;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.android.livesdkapi.depend.model.live.C8725y.C8726a;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.p432d.C8612a;
import com.bytedance.android.livesdkapi.p432d.C8612a.C8613a;
import com.bytedance.android.livesdkapi.p458l.C8833a;
import com.bytedance.android.livesdkapi.service.C8858a;
import com.bytedance.android.livesdkapi.service.C8861d;
import com.bytedance.android.livesdkapi.service.C8862e;
import com.bytedance.common.utility.C9425l;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.p753k.C12103a;
import com.bytedance.p753k.p754a.p755a.C12106a;
import com.bytedance.p753k.p754a.p755a.C12107b;
import com.bytedance.p753k.p754a.p755a.C12108c;
import com.bytedance.p753k.p754a.p755a.C12109d;
import com.bytedance.p753k.p754a.p755a.C12110e;
import com.bytedance.p753k.p754a.p755a.C12111f;
import com.bytedance.p753k.p754a.p755a.C12112g;
import com.bytedance.p753k.p754a.p756b.C12113a;
import com.bytedance.p753k.p754a.p757c.C12114a;
import com.bytedance.p753k.p754a.p757c.C12115b;
import com.bytedance.p753k.p758b.p759a.C12116a;
import com.bytedance.p753k.p758b.p759a.C12117b;
import com.bytedance.p753k.p758b.p759a.C12118c;
import com.bytedance.p753k.p758b.p759a.C12119d;
import com.bytedance.p753k.p758b.p759a.C12120e;
import com.bytedance.p753k.p758b.p759a.C12121f;
import com.bytedance.p753k.p758b.p759a.C12122g;
import com.bytedance.p753k.p758b.p760b.C12123a;
import com.bytedance.p753k.p758b.p761c.C12124a;
import com.bytedance.p753k.p758b.p761c.C12125b;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.i18n.language.C33106b;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.live.livehostimpl.C36123n;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.ReshootConfig;
import com.p683ss.android.ugc.aweme.story.C46635b;
import com.p683ss.android.ugc.aweme.story.live.C46641d;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.permission.C47946e;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.live.Live */
public class Live {
    public static boolean sGiftInited;
    public static boolean sInited;
    private static volatile boolean sInitedLiveSDK;

    public static C8862e getService() {
        C8862e serviceInternal = getServiceInternal();
        initOnce();
        return serviceInternal;
    }

    public static String getLiveDomain() {
        if (C35837h.m80977b()) {
            return "webcast.tiktokv.com";
        }
        return "webcast.musical.ly";
    }

    public static void initGiftResourceOnce() {
        if (!sGiftInited) {
            C8830k.m17327a();
            C8830k.m17328b();
        }
        sGiftInited = true;
    }

    public static boolean invalid() {
        if (getServiceInternal() == null) {
            return true;
        }
        return false;
    }

    public static void initOnce() {
        if (!sInited) {
            C8830k.m17327a();
            ((C12114a) C12103a.m24530b(C12114a.class)).mo22892a();
            refreshLoginState();
        }
        sInited = true;
    }

    public static void requestFeedTab() {
        if (getService() != null) {
            C6856b.m14398a(C8830k.m17331e());
            C6856b.m14399b().mo13016b();
        }
    }

    public static void refreshLoginState() {
        try {
            String a = C2240a.m6772a("https://%s/", new Object[]{getLiveDomain()});
            String cookie = CookieManager.getInstance().getCookie(NetworkUtils.getShareCookieHost());
            CookieManager.getInstance().setAcceptCookie(true);
            if (!TextUtils.isEmpty(cookie)) {
                for (String cookie2 : cookie.split("; ")) {
                    CookieManager.getInstance().setCookie(a, cookie2);
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void switchLocale() {
        Context a = C11010c.m22280a();
        if (a != null) {
            C8862e service = getService();
            if (service != null) {
                Locale a2 = C33106b.m76104a(a);
                if (a2 != null && !TextUtils.isEmpty(a2.getLanguage())) {
                    service.mo15043a(a2);
                }
            }
        }
    }

    private static C8862e getServiceInternal() {
        if (!sInitedLiveSDK) {
            synchronized (Live.class) {
                if (sInitedLiveSDK) {
                    C8862e d = C8830k.m17330d();
                    return d;
                }
                initService();
                C4116c.m10251a(C8612a.class, new C8613a());
                C36123n nVar = new C36123n();
                C8827j jVar = new C8827j(nVar);
                C8830k.f24111c = jVar;
                C8830k.f24110b = jVar.mo13039a().context();
                C2950a.m8372a((C2955b) new C2955b(nVar) {

                    /* renamed from: a */
                    final /* synthetic */ C8858a f24115a;

                    {
                        this.f24115a = r1;
                    }

                    /* renamed from: a */
                    public final <T> T mo7596a(Class<T> cls) {
                        if (cls == C2953a.class) {
                            return this.f24115a.mo13035D();
                        }
                        return C8830k.f24109a.mo10340a(cls);
                    }
                });
                C8861d dVar = C8830k.f24111c;
                C8830k.m17326a(dVar);
                C8833a.m17337a("com.bytedance.android.livesdk.TTLiveSDKContext", "initialize", dVar);
                ((C12114a) C12103a.m24530b(C12114a.class)).mo22893a(C8830k.m17331e());
                sInitedLiveSDK = true;
            }
        }
        return C8830k.m17330d();
    }

    private static void initService() {
        C12103a.m10251a(C36093g.class, new C36170u());
        C12103a.m10251a(C12110e.class, C12120e.m24547a());
        C12103a.m10251a(C12106a.class, C12116a.m24541a());
        C12103a.m10251a(C12107b.class, C12117b.m24542a());
        C12103a.m10251a(C12108c.class, C12118c.m24543a());
        C12103a.m10251a(C12109d.class, C12119d.m24545b());
        C12103a.m10251a(C12111f.class, C12121f.m24549a());
        C12103a.m10251a(C12112g.class, C12122g.m24550a());
        C12103a.m10251a(C12113a.class, C12123a.m24551a());
        C12103a.m10251a(C12114a.class, C12124a.m24552b());
        C12103a.m10251a(C12115b.class, C12125b.m24555b());
    }

    public static boolean openLiveRecord() {
        final Activity g = C11016e.m22312g();
        if (g == null) {
            return false;
        }
        if (C47915gg.m103651b()) {
            C23131p.m56692a("aweme_child_mode_live", "", null);
        }
        if (C47946e.m103734a(g) == 0 && C47946e.m103736b(g) == 0 && C47946e.m103737c(g) == 0) {
            jumpToLive(g);
        } else {
            C23361b.m57419a(g, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE"}, new C23364b() {
                /* renamed from: a */
                public final void mo40906a(String[] strArr, int[] iArr) {
                    int length = iArr.length;
                    int i = 0;
                    while (i < length) {
                        if (iArr[i] == 0) {
                            i++;
                        } else {
                            return;
                        }
                    }
                    Live.jumpToLive(g);
                }
            });
        }
        return true;
    }

    private static boolean isPrivateAccount(User user) {
        if (user == null || !user.isSecret()) {
            return false;
        }
        return true;
    }

    private static boolean hasFollowed(User user) {
        if (user == null || (user.getFollowStatus() != 1 && user.getFollowStatus() != 2)) {
            return false;
        }
        return true;
    }

    public static boolean showLive(User user) {
        if (user == null || !user.isLive() || !C46635b.m101190a()) {
            return false;
        }
        if (isPrivateAccount(user)) {
            return hasFollowed(user);
        }
        return true;
    }

    public static void jumpToLive(Activity activity) {
        AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C36144o(activity, new Builder().shootWay("direct_shoot").translationType(3).defaultTab(2).reshootConfig(new ReshootConfig(true, Boolean.valueOf(true))).build()));
    }

    public static void enterLiveConverge(Context context, Bundle bundle) {
        if (getService() != null) {
            C6856b.m14398a(C8830k.m17331e());
            HashMap hashMap = new HashMap();
            hashMap.put("intercept", "new_style");
            if (bundle.getBoolean("enter_from_live_square", false)) {
                hashMap.put("enter_from_live_square", "live_square");
            }
            if (bundle == null || !bundle.getBoolean("live.intent.extra.FROM_NEW_STYLE", false) || C8830k.m17330d() == null || C8830k.m17330d().mo15058k() == null || !C8830k.m17330d().mo15058k().mo10302a(hashMap)) {
                LiveFeedActivity.m81192a(context, null);
            }
        }
    }

    private static void prepareStreamData(String str, Bundle bundle) {
        if (bundle != null && !TextUtils.isEmpty(str)) {
            boolean z = true;
            try {
                Boolean enableEnterLiveRoomStreamOpt = C32816h.m75716b().getEnableEnterLiveRoomStreamOpt();
                if (enableEnterLiveRoomStreamOpt != null && !enableEnterLiveRoomStreamOpt.booleanValue()) {
                    z = false;
                }
            } catch (C10174a unused) {
            }
            SlimRoom slimRoom = null;
            if (z) {
                slimRoom = (SlimRoom) C47760cd.m103384a(str, SlimRoom.class);
            }
            if (slimRoom != null) {
                bundle.putString("live.intent.extra.PULL_STREAM_URL", slimRoom.buildPullUrl());
                bundle.putString("live.intent.extra.PULL_SDK_PARAMS", slimRoom.getSdkParams());
                bundle.putString("live.intent.extra.PULL_STREAM_DATA", slimRoom.getMultiStreamData());
                bundle.putString("live.intent.extra.PULL_DEFAULT_RESOLUTION", slimRoom.getMultiStreamDefaultQualitySdkKey());
                C8726a aVar = slimRoom.getStreamUrlExtraSafely().f23984n;
                if (aVar != null) {
                    bundle.putBoolean("live.intent.extra.EXTRA_STREAM_SR_ENABLED", aVar.f23992a);
                    bundle.putBoolean("live.intent.extra.EXTRA_STREAM_SR_ANTI_ALIAS", aVar.f23993b);
                    bundle.putInt("live.intent.extra.EXTRA_STREAM_SR_STRENGTH", aVar.f23994c);
                }
                bundle.putInt("live.intent.extra.STREAM_TYPE", slimRoom.getStreamType().ordinal());
                bundle.putString("live.intent.extra.PRIVATE_INFO", slimRoom.getPrivateInfo());
            }
        }
    }

    public static void enterLiveConverge(Context context, Bundle bundle, String str) {
        if (getService() != null) {
            C6856b.m14398a(C8830k.m17331e());
            HashMap hashMap = new HashMap();
            hashMap.put("intercept", "new_style");
            if (bundle.getBoolean("enter_from_live_square", false)) {
                hashMap.put("enter_from_live_square", "live_square");
            }
            hashMap.put("live.intent.extra.FROM_NEW_STYLE_SOURCE", str);
            if (bundle == null || !bundle.getBoolean("live.intent.extra.FROM_NEW_STYLE", false) || C8830k.m17330d() == null || C8830k.m17330d().mo15058k() == null || !C8830k.m17330d().mo15058k().mo10302a(hashMap)) {
                LiveFeedActivity.m81192a(context, null);
            }
        }
    }

    public static void watchLive(Context context, long j, Bundle bundle, String str) {
        watchLive(context, j, (String) null, bundle, str);
    }

    static final /* synthetic */ void lambda$watchLive$1$Live(String str, Bundle bundle, long j, DialogInterface dialogInterface, int i) {
        if (TextUtils.equals(str, "push")) {
            C46641d.m101211a(bundle.getString("anchor_id", ""), j, "no_wifi_dialog_cancel");
        }
        dialogInterface.dismiss();
    }

    public static void watchLive(Context context, long j, Bundle bundle, String str, List<Long> list) {
        watchLive(context, j, null, bundle, str, list);
    }

    public static void watchLive(Context context, long j, String str, Bundle bundle, String str2) {
        watchLive(context, j, str, bundle, str2, null);
    }

    public static void watchLive(Context context, long j, String str, Bundle bundle, String str2, List<Long> list) {
        Context context2 = context;
        long j2 = j;
        Bundle bundle2 = bundle;
        String str3 = str2;
        if (getService() != null) {
            if (C20854a.m53167g().isLogin()) {
                if (C47915gg.m103651b()) {
                    C23131p.m56692a("aweme_child_mode_live", "", null);
                }
                if (C9425l.m18651b(context) || C3018a.m8457b(context) || !(context2 instanceof Activity) || C36148r.m81573a().isDeepLinkHandlerActivity(context)) {
                    prepareStreamData(str, bundle);
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("enter_from_merge", str3);
                    String string = bundle2.getString("live.intent.extra.ENTER_AWEME_ID");
                    if (!TextUtils.isEmpty(string)) {
                        bundle3.putLong("video_id", Long.valueOf(string).longValue());
                    }
                    String string2 = bundle2.getString("enter_method");
                    if (!TextUtils.isEmpty(string2)) {
                        bundle3.putString("enter_method", string2);
                    }
                    String string3 = bundle2.getString("previous_page");
                    if (!TextUtils.isEmpty(string3)) {
                        bundle3.putString("previous_page", string3);
                    }
                    String string4 = bundle2.getString("live_reason");
                    if (!TextUtils.isEmpty(string4)) {
                        bundle3.putString("live_reason", string4);
                    }
                    String string5 = bundle2.getString("challenge_page");
                    if (!TextUtils.isEmpty(string5)) {
                        bundle3.putString("challenge_page", string5);
                    }
                    String string6 = bundle2.getString("tag_id");
                    if (!TextUtils.isEmpty(string6)) {
                        bundle3.putString("tag_id", string6);
                    }
                    bundle3.putInt("live.intent.extra.ENTER_LIVE_ORDER", bundle2.getInt("order"));
                    bundle2.putBundle("live.intent.extra.ENTER_LIVE_EXTRA", bundle3);
                    if (!C9376b.m18558a((Collection<T>) list)) {
                        long[] jArr = new long[list.size()];
                        for (int i = 0; i < list.size(); i++) {
                            jArr[i] = ((Long) list.get(i)).longValue();
                        }
                        bundle2.putLongArray("live.intent.extra.ENTER_ROOM_IDS", jArr);
                    }
                    LivePlayActivity.m81198a(context, j2, bundle2);
                    return;
                }
                C10643a b = new C10643a(context).mo18899b((int) R.string.fbg);
                C36138m mVar = new C36138m(context, j, str, bundle, str2, list);
                b.mo18886a((int) R.string.ah2, (OnClickListener) mVar).mo18900b((int) R.string.wf, (OnClickListener) new C36143n(str3, bundle2, j2)).mo18897a().mo18882b();
            } else if (context2 instanceof Activity) {
                Bundle bundle4 = new Bundle();
                bundle2.putBoolean("block_bind_phone", true);
                C27965f.m66721a((Activity) context2, "personal_homepage", "click", bundle4, (C23505g) null);
            }
        }
    }

    static final /* synthetic */ void lambda$watchLive$0$Live(Context context, long j, String str, Bundle bundle, String str2, List list, DialogInterface dialogInterface, int i) {
        C3018a.m8456a(context);
        watchLive(context, j, str, bundle, str2, list);
        dialogInterface.dismiss();
    }
}
