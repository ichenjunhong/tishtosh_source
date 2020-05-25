package com.p683ss.android.ugc.aweme.live;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.p439g.C8632a;
import com.bytedance.android.livesdkapi.depend.p439g.C8633b;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.newmedia.C19555f;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.app.C23137q;
import com.p683ss.android.ugc.aweme.app.DeepLinkHandlerActivity;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.detail.p1628ui.LiveDetailActivity;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30346o;
import com.p683ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.p683ss.android.ugc.aweme.i18n.language.C33106b;
import com.p683ss.android.ugc.aweme.live.ILiveHostOuterService.C36000a;
import com.p683ss.android.ugc.aweme.live.model.C36141b;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.net.C37797o;
import com.p683ss.android.ugc.aweme.net.C37798p;
import com.p683ss.android.ugc.aweme.p1632di.C27624bk;
import com.p683ss.android.ugc.aweme.p1797h.C32948d;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39955ae;
import com.p683ss.android.ugc.aweme.profile.presenter.UserResponse;
import com.p683ss.android.ugc.aweme.share.improve.C42044a;
import com.p683ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage;
import com.p683ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage.C42183a;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.userservice.C47588a;
import com.p683ss.android.ugc.aweme.userservice.api.C47590b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47888fj;
import com.p683ss.android.ugc.aweme.web.AmeJsMessageHandlerServiceImpl;
import com.p683ss.android.ugc.aweme.web.C48372k;
import com.p683ss.android.ugc.aweme.web.C48380q;
import com.p683ss.android.ugc.aweme.web.IAmeJsMessageHandlerService;
import com.ss.android.ugc.trill.R;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.live.r */
public final class C36148r implements ILiveHostOuterService {

    /* renamed from: a */
    private Handler f92558a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static ILiveHostOuterService m81573a() {
        if (C27991b.f73509e == null) {
            synchronized (ILiveHostOuterService.class) {
                if (C27991b.f73509e == null) {
                    C27991b.f73509e = C27624bk.m66304a();
                }
            }
        }
        return (ILiveHostOuterService) C27991b.f73509e;
    }

    public final String getApiHost() {
        return "api.tiktokv.com";
    }

    public final List<String> getSafeJsbHostList() {
        return C48372k.f121668a;
    }

    public final boolean isFreeFlow() {
        return false;
    }

    public final boolean isFull() {
        return false;
    }

    public final void setLiveEntranceAnimEnable(boolean z) {
    }

    public final boolean isEnableShowTeenageTip() {
        return TimeLockRuler.isEnableShowTeenageTip(R.string.dw0);
    }

    public final boolean isNeedProtectUnderage() {
        return TimeLockRuler.isContentFilterOn();
    }

    public final boolean isOfflineCacheEnable() {
        return C48380q.m104673f();
    }

    public final Locale currentLocale() {
        return C33106b.m76104a(C11010c.m22280a());
    }

    public final String getOfflineRootDir() {
        return C19555f.m47851a().mo40808f().mo41208b();
    }

    public final void initNetworkInterceptor() {
        this.f92558a.post(new Runnable() {
            public final void run() {
                if (C37797o.m84398a().getConfig() == null) {
                    new C37798p().run();
                }
            }
        });
    }

    public final long getAutoLiveStateIntervalMills() {
        try {
            return SettingsManagerProxy.inst().get().getAutoLiveStateIntervalMills().longValue();
        } catch (C10174a unused) {
            return 60000;
        }
    }

    public final boolean getEnableAutoLiveState() {
        try {
            return SettingsManagerProxy.inst().get().getEnableAutoLiveState().booleanValue();
        } catch (C10174a unused) {
            return false;
        }
    }

    public final void hideStatusBar(Activity activity) {
        C47888fj.m103586a(activity);
    }

    public final boolean isDeepLinkHandlerActivity(Context context) {
        return context instanceof DeepLinkHandlerActivity;
    }

    public final Intent getCrossPlatformActivityIntent(Context context) {
        return new Intent(context, CrossPlatformActivity.class);
    }

    public final Intent getDeepLinkHandlerActivityIntent(Context context) {
        return new Intent(context, DeepLinkHandlerActivity.class);
    }

    public final Intent getSubmitFeedbackActivityIntent(Context context) {
        return new Intent(context, I18nBridgeService.getBridgeService_Monster().getSubmitFeedbackActivity());
    }

    public final void monitorImageNetwork(Object obj) {
        C36173w.m81665a().monitorImageNetwork(obj);
    }

    public final void notifyShowLiveEntrance(boolean z) {
        C47718bf.m103288a(new C30346o(z));
    }

    public final void sendLiveRoomScrollEvent(long j) {
        C47718bf.m103288a(new C36141b(j));
    }

    public final void setCustomStatusBarInLayout(Activity activity) {
        I18nBridgeService.getBridgeService_Monster().setCustomStatusBarInLayout(activity);
    }

    public final void startLiveDetailActivity(Context context) {
        context.startActivity(new Intent(context, LiveDetailActivity.class));
    }

    public final void updateIMUser(User user) {
        C33194e.m76279d().updateIMUser(C33194e.m76261a(user));
    }

    public final boolean isSafeDomain(String str) {
        IAmeJsMessageHandlerService createIAmeJsMessageHandlerServicebyMonsterPlugin = AmeJsMessageHandlerServiceImpl.createIAmeJsMessageHandlerServicebyMonsterPlugin();
        if (createIAmeJsMessageHandlerServicebyMonsterPlugin == null || !createIAmeJsMessageHandlerServicebyMonsterPlugin.isSafeDomain(str)) {
            return false;
        }
        return true;
    }

    public final FollowStatus getFollowStatus(User user) throws Exception {
        C47590b c = C47588a.m103036c();
        String uid = user.getUid();
        int i = 0;
        if (user != null && (user.getFollowStatus() == 1 || user.getFollowStatus() == 2)) {
            i = 1;
        }
        return c.mo94909a(uid, 1 ^ i, -1, -1, "", user.getSecUid());
    }

    public final void showH5QuickShop(Context context, String str) {
        C26540w.m64206a(context, str);
    }

    public final TextView getBindMobileTitleView(Context context, int i) {
        return C32948d.m75852a(context, i);
    }

    public final void showShareDialog(Activity activity, C8633b bVar, C8632a aVar) {
        LiveSharePackage.m92558a(activity, bVar, aVar);
    }

    public final void requestUser(String str, String str2, final C36000a aVar) {
        C361491 r0 = new C39955ae() {
            /* renamed from: b */
            public final void mo44838b() {
                UserResponse userResponse = (UserResponse) this.f70700f.getData();
                if (userResponse == null) {
                    aVar.mo74700a((User) null);
                    return;
                }
                aVar.mo74700a(userResponse.getUser());
            }

            /* renamed from: c_ */
            public final void mo44840c_(Exception exc) {
                aVar.mo74701a(exc);
                super.mo44840c_(exc);
            }
        };
        r0.mo81856e();
        r0.mo44934a_(str, str2);
    }

    public final void startMainActivity(Activity activity, boolean z, boolean z2) {
        if (z && z2 && !C23137q.m56698a().mo47855c()) {
            activity.startActivity(new Intent(activity, MainActivity.class));
        }
    }

    public final void share(Activity activity, C8633b bVar, C8632a aVar) {
        C42307b a = C42044a.m92009a(bVar.f23622a, activity);
        if (a != null && a.mo86141a(activity)) {
            if (a.mo49947a(C42183a.m92561a(bVar, (Context) activity, aVar).mo73884a(a), (Context) activity)) {
                aVar.mo8970a(bVar.f23622a, "link");
                return;
            }
            aVar.mo8971a(new Throwable());
        }
    }
}
