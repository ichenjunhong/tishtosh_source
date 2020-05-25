package com.p683ss.android.ugc.aweme.openauthorize;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.sdk.account.bdplatform.impl.C13065c;
import com.bytedance.sdk.account.bdplatform.impl.view.BaseBDAuthorizeActivity;
import com.bytedance.sdk.account.bdplatform.p854a.C13039b;
import com.bytedance.sdk.account.bdplatform.p855b.C13043b;
import com.bytedance.sdk.account.bdplatform.p855b.C13044c;
import com.bytedance.sdk.account.bdplatform.p855b.C13044c.C13046a;
import com.bytedance.sdk.account.p849b.p852c.C13027a;
import com.bytedance.sdk.account.p849b.p852c.C13028b;
import com.bytedance.sdk.account.p849b.p852c.C13029c.C13030a;
import com.bytedance.sdk.account.p849b.p852c.C13029c.C13031b;
import com.bytedance.sdk.account.p849b.p853d.C13033b;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.account.util.C22265g;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.C23515d.C23520a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1411c.C23486e;
import com.p683ss.android.ugc.aweme.i18n.language.C33106b;
import com.p683ss.android.ugc.aweme.i18n.language.p1805a.C33102c;
import com.p683ss.android.ugc.aweme.openauthorize.C38474b.C38475a;
import com.p683ss.android.ugc.aweme.openauthorize.network.C38481a;
import com.p683ss.android.ugc.aweme.openauthorize.p2035a.C38472a;
import com.p683ss.android.ugc.aweme.openauthorize.p2036b.C38476a;
import com.p683ss.android.ugc.aweme.openauthorize.p2036b.C38477b;
import com.p683ss.android.ugc.aweme.openauthorize.p2037c.C38479a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48342d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import p064c.p065a.C1683ag;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity */
public class BaseI18nAuthorizedActivity extends BaseBDAuthorizeActivity implements C38480d {
    public static final C38466a Companion = new C38466a(null);
    public static C48342d mAuthCallbackForWeb;
    private HashMap _$_findViewCache;
    private String mCallerSignature;
    private String mCommonSdkName;
    private String mCommonSdkVersion;
    private String mEnterFromFlag;
    private boolean mIsUserBanned;
    private Handler mMainHandler = new Handler(Looper.getMainLooper());
    private String mTikTokSdkName;
    private String mTikTokSdkVersion;
    private boolean mUserClickBtnToAuthorize;
    private C38476a ttPlatformApi;

    /* renamed from: com.ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity$a */
    public static final class C38466a {
        private C38466a() {
        }

        public /* synthetic */ C38466a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity$b */
    public static final class C38467b implements C23520a {

        /* renamed from: a */
        final /* synthetic */ BaseI18nAuthorizedActivity f97876a;

        /* renamed from: a */
        public final void mo48680a(Exception exc) {
        }

        C38467b(BaseI18nAuthorizedActivity baseI18nAuthorizedActivity) {
            this.f97876a = baseI18nAuthorizedActivity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
        /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo48679a(com.facebook.p929d.C13745c<com.facebook.common.p924h.C13715a<com.facebook.imagepipeline.p970j.C14042c>> r4) {
            /*
                r3 = this;
                if (r4 == 0) goto L_0x0011
                java.lang.Object r4 = r4.mo25674d()
                com.facebook.common.h.a r4 = (com.facebook.common.p924h.C13715a) r4
                if (r4 == 0) goto L_0x0011
                java.lang.Object r4 = r4.mo25630a()
                com.facebook.imagepipeline.j.c r4 = (com.facebook.imagepipeline.p970j.C14042c) r4
                goto L_0x0012
            L_0x0011:
                r4 = 0
            L_0x0012:
                boolean r0 = r4 instanceof com.facebook.imagepipeline.p970j.C14043d
                if (r0 == 0) goto L_0x002e
                com.facebook.imagepipeline.j.d r4 = (com.facebook.imagepipeline.p970j.C14043d) r4
                android.graphics.Bitmap r4 = r4.mo26257d()
                com.ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity r0 = r3.f97876a
                android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
                com.ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity r2 = r3.f97876a
                android.content.res.Resources r2 = r2.getResources()
                r1.<init>(r2, r4)
                android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
                r0.setUserAvatar(r1)
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity.C38467b.mo48679a(com.facebook.d.c):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity$c */
    public static final class C38468c implements C23520a {

        /* renamed from: a */
        final /* synthetic */ BaseI18nAuthorizedActivity f97877a;

        /* renamed from: a */
        public final void mo48680a(Exception exc) {
        }

        C38468c(BaseI18nAuthorizedActivity baseI18nAuthorizedActivity) {
            this.f97877a = baseI18nAuthorizedActivity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
        /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo48679a(com.facebook.p929d.C13745c<com.facebook.common.p924h.C13715a<com.facebook.imagepipeline.p970j.C14042c>> r4) {
            /*
                r3 = this;
                if (r4 == 0) goto L_0x0011
                java.lang.Object r4 = r4.mo25674d()
                com.facebook.common.h.a r4 = (com.facebook.common.p924h.C13715a) r4
                if (r4 == 0) goto L_0x0011
                java.lang.Object r4 = r4.mo25630a()
                com.facebook.imagepipeline.j.c r4 = (com.facebook.imagepipeline.p970j.C14042c) r4
                goto L_0x0012
            L_0x0011:
                r4 = 0
            L_0x0012:
                boolean r0 = r4 instanceof com.facebook.imagepipeline.p970j.C14043d
                if (r0 == 0) goto L_0x002e
                com.facebook.imagepipeline.j.d r4 = (com.facebook.imagepipeline.p970j.C14043d) r4
                android.graphics.Bitmap r4 = r4.mo26257d()
                com.ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity r0 = r3.f97877a
                android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
                com.ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity r2 = r3.f97877a
                android.content.res.Resources r2 = r2.getResources()
                r1.<init>(r2, r4)
                android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
                r0.setAppIcon(r1)
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity.C38468c.mo48679a(com.facebook.d.c):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity$d */
    static final class C38469d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BaseI18nAuthorizedActivity f97878a;

        C38469d(BaseI18nAuthorizedActivity baseI18nAuthorizedActivity) {
            this.f97878a = baseI18nAuthorizedActivity;
        }

        public final void run() {
            C47718bf.m103290c(this.f97878a);
            Activity activity = this.f97878a;
            ArrayList arrayList = new ArrayList();
            Intent intent = new Intent(activity, AwemeAuthorizeLoginActivity.class);
            intent.putStringArrayListExtra("authorize_hide_platforms", arrayList);
            activity.startActivityForResult(intent, 2001);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity$e */
    public static final class C38470e implements C1683ag<C38472a> {

        /* renamed from: a */
        final /* synthetic */ BaseI18nAuthorizedActivity f97879a;

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        C38470e(BaseI18nAuthorizedActivity baseI18nAuthorizedActivity) {
            this.f97879a = baseI18nAuthorizedActivity;
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            this.f97879a.onLoginResult(-1);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onSuccess(java.lang.Object r3) {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.openauthorize.a.a r3 = (com.p683ss.android.ugc.aweme.openauthorize.p2035a.C38472a) r3
                java.lang.String r0 = "t"
                p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
                java.lang.String r0 = r3.message
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                java.lang.String r1 = "success"
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r0 = android.text.TextUtils.equals(r0, r1)
                r1 = -1
                if (r0 == 0) goto L_0x0059
                com.ss.android.ugc.aweme.openauthorize.a.b r3 = r3.f97880a
                r0 = 0
                if (r3 == 0) goto L_0x0024
                java.lang.Boolean r3 = r3.f97885e
                if (r3 == 0) goto L_0x0024
                boolean r3 = r3.booleanValue()
                goto L_0x0025
            L_0x0024:
                r3 = 0
            L_0x0025:
                if (r3 != 0) goto L_0x0047
                r3 = 1
                com.p683ss.android.ugc.aweme.account.util.C22282t.m55152f(r3)
                com.ss.android.ugc.aweme.IAccountUserService r3 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
                com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
                java.lang.String r1 = "AccountUserProxyService.get()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                java.lang.String r0 = r0.getCurUserId()
                java.lang.String r1 = "authorize"
                r3.delete(r0, r1)
                com.ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity r3 = r2.f97879a
                r3.onNeedLogin()
                return
            L_0x0047:
                boolean r3 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103651b()
                if (r3 != 0) goto L_0x0053
                com.ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity r3 = r2.f97879a
                r3.onLoginResult(r0)
                goto L_0x005e
            L_0x0053:
                com.ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity r3 = r2.f97879a
                r3.onLoginResult(r1)
                return
            L_0x0059:
                com.ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity r3 = r2.f97879a
                r3.onLoginResult(r1)
            L_0x005e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity.C38470e.onSuccess(java.lang.Object):void");
        }
    }

    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public Drawable getLoadingProgressBar() {
        return null;
    }

    public void onCancel() {
    }

    public void onLogEvent(String str, String str2, int i, String str3) {
    }

    public C13039b createDepend() {
        return new AwemeAuthorizePlatformDepend(null);
    }

    public void finish() {
        super.finish();
        C47718bf.m103291d(this);
        overridePendingTransition(0, 0);
        mAuthCallbackForWeb = null;
    }

    public String getClientKey() {
        C13030a aVar = this.mLastRequest;
        if (aVar != null) {
            String str = aVar.f34046c;
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    public void onNeedLogin() {
        this.mMainHandler.postDelayed(new C38469d(this), 1500);
    }

    public BaseI18nAuthorizedActivity() {
        Context context = this;
        this.ttPlatformApi = new C38477b(context, C13065c.m26245a(context));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r3 == null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLoginClick() {
        /*
            r4 = this;
            r0 = 1
            r4.mUserClickBtnToAuthorize = r0
            java.lang.String r0 = "auth_submit"
            com.ss.android.ugc.aweme.app.f.d r1 = new com.ss.android.ugc.aweme.app.f.d
            r1.<init>()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "native"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "channel"
            com.bytedance.sdk.account.b.c.c$a r3 = r4.mLastRequest
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = r3.f34046c
            if (r3 != 0) goto L_0x001e
        L_0x001c:
            java.lang.String r3 = ""
        L_0x001e:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "platform"
            java.lang.String r3 = "native_click"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity.onLoginClick():void");
    }

    public void updateLoginStatus() {
        C38481a.f97898a.getLoginStatus(getClientKey()).mo6155b(C2168a.m6521b()).mo6148a(C1667a.m5940a()).mo6159b((C1683ag<? super T>) new C38470e<Object>(this));
    }

    public C13044c initPlatformConfiguration() {
        C13046a aVar = new C13046a();
        aVar.f34090a.f34065b = getResources().getColor(R.color.au2);
        aVar.f34090a.f34068e = false;
        aVar.f34090a.f34071h = Color.parseColor("#32343D");
        aVar.f34090a.f34075l = Color.parseColor("#32343D");
        aVar.f34090a.f34077n = getResources().getColor(R.color.j5);
        aVar.f34090a.f34086w = getResources().getColor(R.color.z_);
        aVar.f34090a.f34085v = getResources().getColor(R.color.jf);
        aVar.f34090a.f34080q = getResources().getColor(R.color.jl);
        Context context = this;
        aVar.f34090a.f34081r = C0726c.m2091a(context, (int) R.drawable.ajf);
        aVar.f34090a.f34082s = C0726c.m2091a(context, (int) R.drawable.aje);
        aVar.f34090a.f34083t = C0726c.m2091a(context, (int) R.drawable.ajg);
        aVar.f34090a.f34079p = getResources().getColor(R.color.jj);
        aVar.f34090a.f34067d = getResources().getColor(R.color.jj);
        aVar.f34090a.f34072i = getResources().getColor(R.color.jj);
        aVar.f34090a.f34076m = getResources().getColor(R.color.jj);
        aVar.f34090a.f34074k = getResources().getColor(R.color.jl);
        String string = getString(R.string.dnt);
        C52711k.m112236a((Object) string, "getString(R.string.ss_loading)");
        aVar.f34090a.f34062B = new C38479a(context, string);
        String string2 = getString(R.string.mc);
        if (!TextUtils.isEmpty(string2)) {
            aVar.f34090a.f34084u = string2;
            aVar.f34090a.f34073j = getString(R.string.me, new Object[]{getString(R.string.ip)});
            aVar.f34090a.f34087x = C22265g.m55114c();
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            User curUser = a.getCurUser();
            C52711k.m112236a((Object) curUser, "AccountUserProxyService.get().curUser");
            aVar.f34090a.f34088y = curUser.getUid();
            C13044c cVar = aVar.f34090a;
            C52711k.m112236a((Object) cVar, "BDPlatformConfiguration.…                .create()");
            return cVar;
        }
        throw new IllegalArgumentException("loginButtonText is empty");
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(C33102c.m76095b(context));
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C33106b.m76111b(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C33106b.m76111b(this);
    }

    @C53771m
    public final void onUserBannedEvent(C23486e eVar) {
        C52711k.m112240b(eVar, "event");
        this.mIsUserBanned = true;
    }

    private final void getCallerInfo(Intent intent) {
        if (intent != null) {
            String callingPackage = getCallingPackage();
            if (callingPackage != null) {
                intent.putExtra("_bytedance_params_type_caller_package", getCallingPackage());
                List a = C13033b.m26207a(this, callingPackage);
                if (a != null) {
                    if (a.isEmpty()) {
                        a = null;
                    }
                    if (a != null) {
                        this.mCallerSignature = (String) a.get(0);
                    }
                }
            }
        }
    }

    private final boolean isCallerValid(String str) {
        if (this.mCallerSignature == null) {
            return true;
        }
        Context context = this;
        String str2 = this.mCallerSignature;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        List<String> a = C13033b.m26207a(context, str);
        if (a != null && a.size() > 0) {
            for (String equalsIgnoreCase : a) {
                if (str2.equalsIgnoreCase(equalsIgnoreCase)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void onErrorIntent(Intent intent) {
        C23131p.m57779a("aweme_authorize_result", C23088c.m56631a().mo47824a("result", "failed").mo47824a("reason", "errorIntent").mo47825b());
        if (TextUtils.equals(this.mEnterFromFlag, "ENTER_FROM_INNER_WEB")) {
            C10691a.m21542b((Context) this, (int) R.string.md).mo19066a();
        }
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r2 == null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReq(com.bytedance.sdk.account.p849b.p852c.C13027a r4) {
        /*
            r3 = this;
            super.onReq(r4)
            java.lang.String r4 = "auth_notify"
            com.ss.android.ugc.aweme.app.f.d r0 = new com.ss.android.ugc.aweme.app.f.d
            r0.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = "native"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "channel"
            com.bytedance.sdk.account.b.c.c$a r2 = r3.mLastRequest
            if (r2 == 0) goto L_0x001c
            java.lang.String r2 = r2.f34046c
            if (r2 != 0) goto L_0x001e
        L_0x001c:
            java.lang.String r2 = ""
        L_0x001e:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity.onReq(com.bytedance.sdk.account.b.c.a):void");
    }

    public void onCancel(C13031b bVar) {
        C38475a aVar = C38474b.f97895e;
        int i = C38474b.f97894d;
        String str = "";
        String clientKey = getClientKey();
        String str2 = this.mTikTokSdkName;
        if (str2 == null) {
            C52711k.m112237a("mTikTokSdkName");
        }
        String str3 = this.mTikTokSdkVersion;
        if (str3 == null) {
            C52711k.m112237a("mTikTokSdkVersion");
        }
        String str4 = this.mCommonSdkName;
        if (str4 == null) {
            C52711k.m112237a("mCommonSdkName");
        }
        String str5 = this.mCommonSdkVersion;
        if (str5 == null) {
            C52711k.m112237a("mCommonSdkVersion");
        }
        aVar.mo78384a(i, 0, str, clientKey, str2, str3, str4, str5);
        C23131p.m57779a("aweme_authorize_result", C23088c.m56631a().mo47824a("result", "failed").mo47824a("reason", "cancel").mo47825b());
        if (!TextUtils.equals(this.mEnterFromFlag, "ENTER_FROM_INNER_WEB")) {
            sendResponse(this.mLastRequest, bVar);
        } else {
            C48342d dVar = mAuthCallbackForWeb;
            if (dVar != null) {
                dVar.onError("-2", "TiktokOpenPlatformErrorCodeUserCanceled");
            }
        }
        finish();
    }

    public void onAuthLogin(C13043b bVar) {
        String str;
        IAccountUserService a = C20902b.m53242a();
        C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
        User curUser = a.getCurUser();
        C52711k.m112236a((Object) curUser, "AccountUserProxyService.get().curUser");
        setUserName(curUser.getNickname());
        setAppIcon(C0726c.m2091a((Context) this, (int) R.drawable.ajb));
        if (bVar != null) {
            str = bVar.f34057a;
        } else {
            str = null;
        }
        setAppName(str);
        IAccountUserService a2 = C20902b.m53242a();
        C52711k.m112236a((Object) a2, "AccountUserProxyService.get()");
        User curUser2 = a2.getCurUser();
        C52711k.m112236a((Object) curUser2, "AccountUserProxyService.get().curUser");
        C23515d.m57667a(curUser2.getAvatarMedium(), (C23520a) new C38467b(this));
        if (bVar == null) {
            C52711k.m112234a();
        }
        String str2 = bVar.f34058b;
        C52711k.m112236a((Object) str2, "authInfoResponse!!.clientIcon");
        C23520a cVar = new C38468c(this);
        C52711k.m112240b(str2, "url");
        C52711k.m112240b(cVar, "callback");
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        urlModel.setUrlList(arrayList);
        C23515d.m57667a(urlModel, cVar);
        showView(bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (r4 == null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0072, code lost:
        if (r0 == null) goto L_0x0077;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(com.bytedance.sdk.account.p849b.p852c.C13029c.C13031b r13) {
        /*
            r12 = this;
            java.lang.String r0 = "aweme_authorize_result"
            com.ss.android.ugc.aweme.app.f.c r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()
            java.lang.String r2 = "result"
            java.lang.String r3 = "failed"
            com.ss.android.ugc.aweme.app.f.c r1 = r1.mo47824a(r2, r3)
            java.lang.String r2 = "reason"
            java.lang.String r3 = "sdk error"
            com.ss.android.ugc.aweme.app.f.c r1 = r1.mo47824a(r2, r3)
            org.json.JSONObject r1 = r1.mo47825b()
            com.p683ss.android.ugc.aweme.app.C23131p.m57779a(r0, r1)
            if (r13 == 0) goto L_0x002a
            android.os.Bundle r0 = r13.extras
            if (r0 == 0) goto L_0x002a
            java.lang.String r1 = "response_type"
            int r0 = r0.getInt(r1)
            goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            r1 = 3
            if (r0 == r1) goto L_0x0031
            r1 = 2
            if (r0 != r1) goto L_0x0065
        L_0x0031:
            java.lang.String r1 = "auth_success"
            com.ss.android.ugc.aweme.app.f.d r2 = new com.ss.android.ugc.aweme.app.f.d
            r2.<init>()
            java.lang.String r3 = "enter_from"
            java.lang.String r4 = "native"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "channel"
            com.bytedance.sdk.account.b.c.c$a r4 = r12.mLastRequest
            if (r4 == 0) goto L_0x004a
            java.lang.String r4 = r4.f34046c
            if (r4 != 0) goto L_0x004c
        L_0x004a:
            java.lang.String r4 = ""
        L_0x004c:
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "platform"
            java.lang.String r4 = "native_click"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "status"
            java.lang.String r4 = "0"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r1, r2)
        L_0x0065:
            com.ss.android.ugc.aweme.openauthorize.b$a r3 = com.p683ss.android.ugc.aweme.openauthorize.C38474b.f97895e
            int r4 = com.p683ss.android.ugc.aweme.openauthorize.C38474b.f97893c
            if (r13 == 0) goto L_0x006d
            int r0 = r13.errorCode
        L_0x006d:
            r5 = r0
            if (r13 == 0) goto L_0x0077
            java.lang.String r0 = r13.errorMsg
            if (r0 != 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r6 = r0
            goto L_0x007a
        L_0x0077:
            java.lang.String r0 = ""
            goto L_0x0075
        L_0x007a:
            java.lang.String r7 = r12.getClientKey()
            java.lang.String r8 = r12.mTikTokSdkName
            if (r8 != 0) goto L_0x0087
            java.lang.String r0 = "mTikTokSdkName"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0087:
            java.lang.String r9 = r12.mTikTokSdkVersion
            if (r9 != 0) goto L_0x0090
            java.lang.String r0 = "mTikTokSdkVersion"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0090:
            java.lang.String r10 = r12.mCommonSdkName
            if (r10 != 0) goto L_0x0099
            java.lang.String r0 = "mCommonSdkName"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0099:
            java.lang.String r11 = r12.mCommonSdkVersion
            if (r11 != 0) goto L_0x00a2
            java.lang.String r0 = "mCommonSdkVersion"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x00a2:
            r3.mo78384a(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r0 = r12.mEnterFromFlag
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "ENTER_FROM_INNER_WEB"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x00d7
            r0 = r12
            android.content.Context r0 = (android.content.Context) r0
            r1 = 2132542128(0x7f1c02b0, float:2.0737352E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r0, r1)
            r0.mo19066a()
            com.ss.android.ugc.aweme.web.jsbridge.d r0 = mAuthCallbackForWeb
            if (r0 == 0) goto L_0x00e0
            r1 = 0
            if (r13 == 0) goto L_0x00ce
            int r2 = r13.errorCode
            java.lang.String r2 = java.lang.String.valueOf(r2)
            goto L_0x00cf
        L_0x00ce:
            r2 = r1
        L_0x00cf:
            if (r13 == 0) goto L_0x00d3
            java.lang.String r1 = r13.errorMsg
        L_0x00d3:
            r0.onError(r2, r1)
            goto L_0x00e0
        L_0x00d7:
            com.bytedance.sdk.account.b.c.c$a r0 = r12.mLastRequest
            com.bytedance.sdk.account.b.c.a r0 = (com.bytedance.sdk.account.p849b.p852c.C13027a) r0
            com.bytedance.sdk.account.b.c.b r13 = (com.bytedance.sdk.account.p849b.p852c.C13028b) r13
            r12.sendResponse(r0, r13)
        L_0x00e0:
            r12.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity.onError(com.bytedance.sdk.account.b.c.c$b):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        if (r3 == null) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSuccess(com.bytedance.sdk.account.p849b.p852c.C13029c.C13031b r10) {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.openauthorize.b$a r0 = com.p683ss.android.ugc.aweme.openauthorize.C38474b.f97895e
            java.lang.String r3 = ""
            java.lang.String r4 = r9.getClientKey()
            java.lang.String r5 = r9.mTikTokSdkName
            if (r5 != 0) goto L_0x0011
            java.lang.String r1 = "mTikTokSdkName"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0011:
            java.lang.String r6 = r9.mTikTokSdkVersion
            if (r6 != 0) goto L_0x001a
            java.lang.String r1 = "mTikTokSdkVersion"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x001a:
            java.lang.String r7 = r9.mCommonSdkName
            if (r7 != 0) goto L_0x0023
            java.lang.String r1 = "mCommonSdkName"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0023:
            java.lang.String r8 = r9.mCommonSdkVersion
            if (r8 != 0) goto L_0x002c
            java.lang.String r1 = "mCommonSdkVersion"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x002c:
            r1 = 0
            r2 = 0
            r0.mo78384a(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = "aweme_authorize_result"
            com.ss.android.ugc.aweme.app.f.c r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()
            java.lang.String r2 = "result"
            java.lang.String r3 = "success"
            com.ss.android.ugc.aweme.app.f.c r1 = r1.mo47824a(r2, r3)
            org.json.JSONObject r1 = r1.mo47825b()
            com.p683ss.android.ugc.aweme.app.C23131p.m57779a(r0, r1)
            java.lang.String r0 = "auth_success"
            com.ss.android.ugc.aweme.app.f.d r1 = new com.ss.android.ugc.aweme.app.f.d
            r1.<init>()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "native"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "channel"
            com.bytedance.sdk.account.b.c.c$a r3 = r9.mLastRequest
            if (r3 == 0) goto L_0x005f
            java.lang.String r3 = r3.f34046c
            if (r3 != 0) goto L_0x0061
        L_0x005f:
            java.lang.String r3 = ""
        L_0x0061:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "platform"
            java.lang.String r3 = "native_click"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "status"
            java.lang.String r3 = "1"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
            java.lang.String r0 = r9.mEnterFromFlag
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "ENTER_FROM_INNER_WEB"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0096
            com.ss.android.ugc.aweme.web.jsbridge.d r0 = mAuthCallbackForWeb
            if (r0 == 0) goto L_0x009f
            if (r10 == 0) goto L_0x0091
            java.lang.String r10 = r10.f34052a
            goto L_0x0092
        L_0x0091:
            r10 = 0
        L_0x0092:
            r0.onClick(r10)
            goto L_0x009f
        L_0x0096:
            com.bytedance.sdk.account.b.c.c$a r0 = r9.mLastRequest
            com.bytedance.sdk.account.b.c.a r0 = (com.bytedance.sdk.account.p849b.p852c.C13027a) r0
            com.bytedance.sdk.account.b.c.b r10 = (com.bytedance.sdk.account.p849b.p852c.C13028b) r10
            r9.sendResponse(r0, r10)
        L_0x009f:
            r9.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity.onSuccess(com.bytedance.sdk.account.b.c.c$b):void");
    }

    private final void sendResponse(C13027a aVar, C13028b bVar) {
        if (aVar != null) {
            String callerPackage = aVar.getCallerPackage();
            String str = aVar.callerLocalEntry;
            if (!TextUtils.isEmpty(callerPackage) && bVar != null && !TextUtils.isEmpty(str) && bVar.checkArgs()) {
                C52711k.m112236a((Object) callerPackage, "openPackageName");
                if (isCallerValid(callerPackage)) {
                    Bundle bundle = new Bundle();
                    bVar.toBundle(bundle);
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName(callerPackage, str));
                    intent.putExtras(bundle);
                    intent.addFlags(67108864);
                    intent.addFlags(268435456);
                    try {
                        startActivity(intent);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        if (r0 == null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        if (r0 == null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (r0 == null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r0 == null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleIntent(android.content.Intent r3, com.bytedance.sdk.account.p849b.p850a.C13024a r4) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0008
            android.os.Bundle r1 = r3.getExtras()
            goto L_0x0009
        L_0x0008:
            r1 = r0
        L_0x0009:
            if (r1 == 0) goto L_0x0011
            java.lang.String r0 = "_aweme_params_enter_from_flag"
            java.lang.String r0 = r1.getString(r0)
        L_0x0011:
            r2.mEnterFromFlag = r0
            if (r1 == 0) goto L_0x001d
            java.lang.String r0 = "_aweme_params_caller_open_sdk_common_name"
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L_0x001f
        L_0x001d:
            java.lang.String r0 = ""
        L_0x001f:
            r2.mCommonSdkName = r0
            if (r1 == 0) goto L_0x002b
            java.lang.String r0 = "_aweme_params_caller_open_sdk_common_version"
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L_0x002d
        L_0x002b:
            java.lang.String r0 = ""
        L_0x002d:
            r2.mCommonSdkVersion = r0
            if (r1 == 0) goto L_0x0039
            java.lang.String r0 = "_aweme_params_caller_open_sdk_name"
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L_0x003b
        L_0x0039:
            java.lang.String r0 = ""
        L_0x003b:
            r2.mTikTokSdkName = r0
            if (r1 == 0) goto L_0x0047
            java.lang.String r0 = "_aweme_params_caller_open_sdk_version"
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L_0x0049
        L_0x0047:
            java.lang.String r0 = ""
        L_0x0049:
            r2.mTikTokSdkVersion = r0
            r2.getCallerInfo(r3)
            com.ss.android.ugc.aweme.openauthorize.b.a r0 = r2.ttPlatformApi
            boolean r3 = r0.mo78385a(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity.handleIntent(android.content.Intent, com.bytedance.sdk.account.b.a.a):boolean");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2001) {
            int i3 = -1;
            if (i2 == -1 && !this.mIsUserBanned && !C47915gg.m103651b()) {
                i3 = 0;
            }
            onLoginResult(i3);
        }
    }
}
