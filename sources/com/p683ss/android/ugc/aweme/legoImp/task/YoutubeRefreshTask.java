package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.C10174a;
import com.bytedance.keva.Keva;
import com.google.p997a.p1022b.p1023a.C14820a;
import com.google.p997a.p1022b.p1023a.C14820a.C14821a;
import com.google.p997a.p1022b.p1023a.C14820a.C14822b.C14823a;
import com.google.p997a.p998a.p1001b.p1002a.p1003a.C14743a;
import com.google.p997a.p998a.p1004c.p1005a.p1006a.C14746b;
import com.google.p997a.p998a.p1004c.p1005a.p1006a.C14746b.C14747a;
import com.google.p997a.p998a.p1009d.C14765e;
import com.google.p997a.p998a.p1009d.C14769i;
import com.google.p997a.p998a.p1013e.C14774b;
import com.google.p997a.p998a.p1013e.p1014a.C14772a;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.buildconfigdiff.C24095a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.global.config.settings.C32811d;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.C32818i;
import com.p683ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.profile.edit.api.YoutubeApi;
import com.p683ss.android.ugc.aweme.profile.edit.api.YoutubeApi.C39836a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47683as;
import com.p683ss.android.ugc.aweme.utils.C47957v;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import net.openid.appauth.C53454c;
import net.openid.appauth.C53459d;
import net.openid.appauth.C53469g;
import net.openid.appauth.C53469g.C53471b;
import net.openid.appauth.C53473i;
import net.openid.appauth.C53486o;
import net.openid.appauth.C53487p;
import net.openid.appauth.C53489r;
import net.openid.appauth.C53489r.C53491a;
import net.openid.appauth.C53492s;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.YoutubeRefreshTask */
public final class YoutubeRefreshTask implements C9382a, C32811d, LegoTask {
    static final /* synthetic */ C52767h[] $$delegatedProperties = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(YoutubeRefreshTask.class), "googleClientId", "getGoogleClientId()Ljava/lang/String;"))};
    public static final C35969a Companion = new C35969a(null);
    private static final boolean DEBUG = false;
    private Handler bgHandler;
    private Context context;
    private final C52668f googleClientId$delegate = C52732g.m112285a(C35972c.f92200a);
    private int settingsTimeoutTicker;

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.YoutubeRefreshTask$a */
    static final class C35969a {
        private C35969a() {
        }

        public /* synthetic */ C35969a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.YoutubeRefreshTask$b */
    static final class C35970b implements C53471b {

        /* renamed from: a */
        final /* synthetic */ YoutubeRefreshTask f92195a;

        /* renamed from: b */
        final /* synthetic */ String f92196b;

        C35970b(YoutubeRefreshTask youtubeRefreshTask, String str) {
            this.f92195a = youtubeRefreshTask;
            this.f92196b = str;
        }

        /* renamed from: a */
        public final void mo74654a(final C53492s sVar, final C53459d dVar) {
            C47957v.m103769a(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C35970b f92197a;

                {
                    this.f92197a = r1;
                }

                public final void run() {
                    this.f92197a.f92195a.processOAuthResult(this.f92197a.f92196b, sVar, dVar);
                }
            }, "YoutubeRefreshTask");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.YoutubeRefreshTask$c */
    static final class C35972c extends C52712l implements C52670a<String> {

        /* renamed from: a */
        public static final C35972c f92200a = new C35972c();

        C35972c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C24095a.m58958o();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.YoutubeRefreshTask$d */
    static final class C35973d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ YoutubeRefreshTask f92201a;

        /* renamed from: b */
        final /* synthetic */ User f92202b;

        C35973d(YoutubeRefreshTask youtubeRefreshTask, User user) {
            this.f92201a = youtubeRefreshTask;
            this.f92202b = user;
        }

        public final void run() {
            YoutubeRefreshTask youtubeRefreshTask = this.f92201a;
            User user = this.f92202b;
            C52711k.m112236a((Object) user, "curUser");
            youtubeRefreshTask.fetchNewData(user);
        }
    }

    private final String getGoogleClientId() {
        return (String) this.googleClientId$delegate.getValue();
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final void sync() {
    }

    public final void syncFail(Exception exc) {
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    private final void unlinkYouTube() {
        if (YoutubeApi.m88596a()) {
            C20854a.m53167g().queryUser();
        }
    }

    private final boolean isEnabled() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            Integer thirdPartyDataRefresh = b.getThirdPartyDataRefresh();
            if (thirdPartyDataRefresh == null) {
                return false;
            }
            if (thirdPartyDataRefresh.intValue() == 1) {
                return true;
            }
            return false;
        } catch (C10174a unused) {
            return false;
        }
    }

    private final void startTimeoutTimer() {
        if (this.bgHandler == null) {
            HandlerThread handlerThread = new HandlerThread("youtube-refresh-timer");
            handlerThread.start();
            this.bgHandler = new C9381g(handlerThread.getLooper(), this);
        }
        Handler handler = this.bgHandler;
        if (handler == null) {
            C52711k.m112234a();
        }
        if (handler.hasMessages(1)) {
            Handler handler2 = this.bgHandler;
            if (handler2 == null) {
                C52711k.m112234a();
            }
            handler2.removeMessages(1);
        }
        Handler handler3 = this.bgHandler;
        if (handler3 == null) {
            C52711k.m112234a();
        }
        handler3.sendEmptyMessage(1);
    }

    private final String getUserAgent(C14820a aVar) {
        C14823a a = aVar.mo27165d().mo27168a("id, snippet");
        C52711k.m112236a((Object) a, "youtube.channels().list(\"id, snippet\")");
        C14765e eVar = a.f38248d;
        C52711k.m112236a((Object) eVar, "youtube.channels().list(… snippet\").requestHeaders");
        String a2 = eVar.mo27057a();
        C52711k.m112236a((Object) a2, "youtube.channels().list(….requestHeaders.userAgent");
        return a2;
    }

    public final void change(IESSettingsProxy iESSettingsProxy) {
        C52711k.m112240b(iESSettingsProxy, "iesSettings");
        Handler handler = this.bgHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Context context2 = this.context;
        if (context2 == null) {
            C52711k.m112237a("context");
        }
        run(context2);
    }

    public final void handleMsg(Message message) {
        if (message != null && message.what == 1) {
            Handler handler = this.bgHandler;
            if (handler != null) {
                handler.removeMessages(1);
            }
            this.settingsTimeoutTicker++;
            if (this.settingsTimeoutTicker > 3) {
                SettingsManagerProxy.inst().removeSettingsWatcher(this);
                Handler handler2 = this.bgHandler;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                }
            } else {
                Handler handler3 = this.bgHandler;
                if (handler3 != null) {
                    handler3.sendEmptyMessageDelayed(1, 1000);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean isAccessRevoked(net.openid.appauth.C53459d r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            org.json.JSONObject r7 = r7.toJson()
            java.lang.String r1 = "error"
            boolean r1 = r7.has(r1)
            java.lang.String r2 = "errorDescription"
            boolean r2 = r7.has(r2)
            r1 = r1 & r2
            r2 = 0
            if (r1 == 0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r7 = r2
        L_0x001a:
            if (r7 == 0) goto L_0x0064
            java.lang.String r1 = "error"
            java.lang.String r1 = r7.getString(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r3 = "invalid_grant"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            r3 = 1
            if (r1 == 0) goto L_0x005c
            java.lang.String r1 = "errorDescription"
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r4 = "it.getString(\"errorDescription\")"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            if (r1 == 0) goto L_0x0054
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r4 = "(this as java.lang.String).toLowerCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r4 = "revoked"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r5 = 2
            boolean r1 = p2628d.p2650m.C52830p.m112456b(r1, r4, r0, r5, r2)
            if (r1 == 0) goto L_0x005c
            r1 = 1
            goto L_0x005d
        L_0x0054:
            d.u r7 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r7.<init>(r0)
            throw r7
        L_0x005c:
            r1 = 0
        L_0x005d:
            if (r1 == 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r7 = r2
        L_0x0061:
            if (r7 == 0) goto L_0x0064
            return r3
        L_0x0064:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.legoImp.task.YoutubeRefreshTask.isAccessRevoked(net.openid.appauth.d):boolean");
    }

    public final void fetchNewData(User user) {
        String youTubeRefreshToken = user.getYouTubeRefreshToken();
        C52711k.m112236a((Object) youTubeRefreshToken, "curUser.youTubeRefreshToken");
        String b = C47683as.m103197b(youTubeRefreshToken, "J?I7iAd=3j9AM1P=", "AES/CBC/PKCS7Padding", "J?I7iAd=3j9AM1P=");
        if (TextUtils.isEmpty(b)) {
            logEvent$default(this, false, null, new Exception("Failed to decrypt refresh token, cannot continue"), null, null, 26, null);
            return;
        }
        C53491a a = new C53491a(new C53473i(Uri.parse("https://accounts.google.com/o/oauth2/v2/auth"), Uri.parse("https://www.googleapis.com/oauth2/v4/token")), getGoogleClientId()).mo111239a("refresh_token");
        String str = "https://www.googleapis.com/auth/youtube.readonly";
        if (TextUtils.isEmpty(str)) {
            a.f132334b = null;
        } else {
            String[] split = str.split(" +");
            if (split == null) {
                split = new String[0];
            }
            a.f132334b = C53454c.m113509a(Arrays.asList(split));
        }
        if (b != null) {
            C53487p.m113586a(b, (Object) "refresh token cannot be empty if defined");
        }
        a.f132336d = b;
        C53489r a2 = a.mo111240a();
        C52711k.m112236a((Object) a2, "TokenRequest.Builder(con…\n                .build()");
        Context context2 = this.context;
        if (context2 == null) {
            C52711k.m112237a("context");
        }
        new C53469g(context2).mo111231a(a2, C53486o.f132321a, new C35970b(this, b));
    }

    public final void run(Context context2) {
        C52711k.m112240b(context2, "context");
        this.context = context2;
        C32818i a = C32818i.m75717a();
        C52711k.m112236a((Object) a, "SettingsStateManager.getInstance()");
        boolean z = true;
        if (!a.mo66399b()) {
            SettingsManagerProxy.inst().registerSettingsWatcher(this, true);
            startTimeoutTimer();
        } else if (isEnabled()) {
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            User curUser = g.getCurUser();
            C52711k.m112236a((Object) curUser, "curUser");
            if (!TextUtils.isEmpty(curUser.getYouTubeRefreshToken())) {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                long youTubeLastRefreshTime = curUser.getYouTubeLastRefreshTime();
                if (youTubeLastRefreshTime <= 0 || currentTimeMillis - youTubeLastRefreshTime <= TimeUnit.DAYS.toSeconds(30)) {
                    z = false;
                }
                if (z) {
                    if (C52711k.m112239a((Object) Looper.myLooper(), (Object) Looper.getMainLooper())) {
                        C47957v.m103769a(new C35973d(this, curUser), "YoutubeRefreshTask");
                    } else {
                        fetchNewData(curUser);
                    }
                }
            }
        }
    }

    public final void processOAuthResult(String str, C53492s sVar, C53459d dVar) {
        Integer num;
        C53492s sVar2 = sVar;
        C53459d dVar2 = dVar;
        if (dVar2 != null) {
            boolean isAccessRevoked = isAccessRevoked(dVar2);
            Boolean valueOf = Boolean.valueOf(isAccessRevoked);
            Integer valueOf2 = Integer.valueOf(dVar2.code);
            logEvent$default(this, false, valueOf, dVar2, valueOf2, null, 16, null);
            if (isAccessRevoked) {
                unlinkYouTube();
            }
        }
        if (sVar2 == null) {
            logEvent$default(this, false, null, new Exception("OAuth TokenResponse is null"), null, null, 26, null);
            return;
        }
        C14769i a = C14743a.m30124a();
        C14774b aVar = new C14772a();
        Integer num2 = null;
        C14746b a2 = new C14747a().mo27028a(a).mo27029a(aVar).mo27034a(getGoogleClientId(), null).mo27035a();
        if (DEBUG && sVar2.f132346e != null) {
            StringBuilder sb = new StringBuilder("New token expires on ");
            Long l = sVar2.f132346e;
            if (l == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) l, "response.accessTokenExpirationTime!!");
            sb.append(new Date(l.longValue()));
        }
        C52711k.m112236a((Object) a2, "mCredential");
        a2.mo27024a(sVar2.f132345d);
        a2.mo27025b(sVar2.f132346e);
        a2.mo27026b(sVar2.f132348g);
        C14821a aVar2 = new C14821a(a, aVar, a2);
        Context context2 = this.context;
        if (context2 == null) {
            C52711k.m112237a("context");
        }
        C14820a a3 = aVar2.mo27046f(context2.getString(R.string.bcx)).mo27166a();
        C52711k.m112236a((Object) a3, "youtube");
        C39836a a4 = YoutubeApi.m88594a(str, null, null, null, getUserAgent(a3), sVar2.f132345d, sVar2.f132344c);
        if (a4 != null) {
            num = a4.f101655a;
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            logEvent$default(this, true, null, null, null, a4, 14, null);
            C20854a.m53167g().queryUser();
        } else if (num != null && num.intValue() == 3004005) {
            logEvent$default(this, false, Boolean.valueOf(true), null, null, a4, 12, null);
            Keva.getRepo("keva_repo_profile_component").storeInt("show_yt_removed_toast", 1);
            unlinkYouTube();
        } else if (num != null && num.intValue() == 3004006) {
            logEvent$default(this, false, Boolean.valueOf(true), null, null, a4, 12, null);
            unlinkYouTube();
        } else {
            if (DEBUG) {
                StringBuilder sb2 = new StringBuilder("Ignoring YouTube result ");
                if (a4 != null) {
                    num2 = a4.f101655a;
                }
                sb2.append(num2);
            }
        }
    }

    private final void logEvent(boolean z, Boolean bool, Exception exc, Integer num, C39836a aVar) {
        Integer num2;
        Context context2 = this.context;
        if (context2 == null) {
            C52711k.m112237a("context");
        }
        String a = YoutubeApi.m88595a(context2, exc, num, aVar);
        String str = "social_profile_check";
        C23089d a2 = new C23089d().mo47829a("platform", "youtube").mo47828a("is_success", (Object) Boolean.valueOf(z)).mo47826a("auto_unlink", C52711k.m112239a((Object) bool, (Object) Boolean.valueOf(true)) ? 1 : 0);
        String str2 = "error_code";
        if (aVar != null) {
            num2 = aVar.f101655a;
        } else {
            num2 = null;
        }
        C26890h.m65011a(str, a2.mo47829a(str2, String.valueOf(num2)).mo47829a("error_desc", a).f61491a);
    }

    static /* synthetic */ void logEvent$default(YoutubeRefreshTask youtubeRefreshTask, boolean z, Boolean bool, Exception exc, Integer num, C39836a aVar, int i, Object obj) {
        Boolean bool2;
        Exception exc2;
        Integer num2;
        C39836a aVar2;
        if ((i & 2) != 0) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        if ((i & 4) != 0) {
            exc2 = null;
        } else {
            exc2 = exc;
        }
        if ((i & 8) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i & 16) != 0) {
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        youtubeRefreshTask.logEvent(z, bool2, exc2, num2, aVar2);
    }
}
