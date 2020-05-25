package com.p683ss.android.ugc.aweme.base.component;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Toast;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.analysis.C22582c;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.commercialize.coupon.C25668a;
import com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25687b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.experiment.C29508i;
import com.p683ss.android.ugc.aweme.familiar.service.C29655g;
import com.p683ss.android.ugc.aweme.feed.C30433j;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1731n.C30536d;
import com.p683ss.android.ugc.aweme.festival.christmas.C31357a;
import com.p683ss.android.ugc.aweme.festival.christmas.api.ChristmasApi;
import com.p683ss.android.ugc.aweme.festival.christmas.p1740a.C31360b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.poi.PoiServiceImpl;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.poi.p2060c.C39051a.C39052a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.share.C41934a;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.C41985as;
import com.p683ss.android.ugc.aweme.share.p2151c.C41996b;
import com.p683ss.android.ugc.aweme.shortvideo.C42421al;
import com.p683ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43891e;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45417bc;
import com.p683ss.android.ugc.aweme.utils.ActivityStack;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47819dn;
import com.p683ss.android.ugc.aweme.utils.C47824do;
import com.p683ss.android.ugc.aweme.utils.C47825dp;
import com.p683ss.android.ugc.aweme.utils.C47826dq;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import com.p683ss.android.ugc.aweme.utils.C47950q;
import com.p683ss.android.ugc.aweme.utils.notification.ExperimentNotificationGuide;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.C53755c;
import org.greenrobot.eventbus.C53771m;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.ss.android.ugc.aweme.base.component.EventActivityComponent */
public class EventActivityComponent implements GenericLifecycleObserver {

    /* renamed from: b */
    static C23506h f62570b;

    /* renamed from: e */
    private static boolean f62571e;

    /* renamed from: a */
    AbsActivity f62572a;

    /* renamed from: c */
    private C41996b f62573c;

    /* renamed from: d */
    private WeakReference<C22582c> f62574d;

    public EventActivityComponent(AbsActivity absActivity) {
        this.f62572a = absActivity;
    }

    /* renamed from: a */
    private static boolean m57649a(C43891e eVar) {
        Aweme aweme = (Aweme) eVar.f111150d;
        if (aweme == null) {
            return false;
        }
        Activity g = C11016e.m22312g();
        C0654k kVar = null;
        if (g instanceof FragmentActivity) {
            kVar = ((FragmentActivity) g).getSupportFragmentManager();
        }
        if (kVar == null) {
            return false;
        }
        return C29655g.f77512b.tryShowPublishSyncToDuoshanDialog(kVar, aweme.getAid());
    }

    @C53771m(mo112976b = true)
    public void onPublishStatus(final C43891e eVar) {
        final AbsActivity absActivity = this.f62572a;
        if (absActivity != null && absActivity.isViewValid()) {
            f62571e = false;
            if (eVar.f111148b == 12) {
                if (absActivity == C11016e.m22312g()) {
                    C10691a.m21542b((Context) this.f62572a, (int) R.string.b3q).mo19066a();
                }
                C32458a.m75148a((Throwable) new Exception(eVar.toString()));
            } else if (eVar.f111148b == 9) {
                if (absActivity == C11016e.m22312g() && (!AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().getPublishProgressOptimize() || eVar.f111158l)) {
                    String str = eVar.f111151e;
                    if (TextUtils.isEmpty(str)) {
                        str = absActivity.getResources().getString(R.string.d0v);
                    }
                    Toast makeText = Toast.makeText(this.f62572a, str, 1);
                    if (VERSION.SDK_INT == 25) {
                        C47905fy.m103630a(makeText);
                    }
                    makeText.show();
                }
                C32458a.m75148a((Throwable) new Exception(eVar.toString()));
            } else if (eVar.f111148b == 10 && !eVar.f111157k) {
                m57648a((Activity) this.f62572a, eVar.f111154h, (Runnable) new Runnable() {
                    public final void run() {
                        boolean z;
                        boolean z2;
                        boolean z3;
                        Activity[] activityStack = ActivityStack.getActivityStack();
                        int length = activityStack.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            Activity activity = activityStack[i];
                            if (activity instanceof MainActivity) {
                                ((MainActivity) activity).changeTabToFollowAfterPublish(false);
                                break;
                            }
                            i++;
                        }
                        Aweme aweme = (Aweme) eVar.f111150d;
                        aweme.getStatus().getPrivateStatus();
                        if (aweme.getStatus().getPrivateStatus() == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z || C47950q.m103754c(aweme)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2 || !((Boolean) SharePrefCache.inst().getIsPrivateAvailable().mo47782d()).booleanValue()) {
                            User curUser = C20902b.m53242a().getCurUser();
                            if (curUser == null || !curUser.isSecret()) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (z3) {
                                if (eVar.f111155i) {
                                    EventActivityComponent.this.mo48664a(eVar, absActivity, true);
                                }
                                EventActivityComponent.this.mo48666d(eVar, absActivity);
                            } else {
                                int a = C10181b.m20511a().mo18168a(ExperimentNotificationGuide.class, false, "push_open_guidance", 31744, 0);
                                if ((a == 3 || a == 2) && C47819dn.m103466a(1)) {
                                    AbsActivity absActivity = absActivity;
                                    if (C47819dn.m103466a(1)) {
                                        String string = absActivity.getString(R.string.h7x);
                                        String string2 = absActivity.getString(R.string.h7v);
                                        C47824do doVar = new C47824do(absActivity, 1);
                                        Dialog c = new C10643a(absActivity).mo18907c(R.drawable.cqd).mo18892a(string).mo18902b(string2).mo18887a((int) R.string.h7t, (OnClickListener) doVar, true).mo18901b((int) R.string.h7u, (OnClickListener) new C47825dp(1), true).mo18897a().mo18883c();
                                        c.setCanceledOnTouchOutside(false);
                                        c.setCancelable(false);
                                        c.setOnDismissListener(new C47826dq(null));
                                        C47819dn.f120368a = true;
                                        C26890h.m65011a("push_pre_permission_show", C23089d.m56640a().f61491a);
                                    }
                                } else if (eVar.f111155i) {
                                    EventActivityComponent.this.mo48664a(eVar, absActivity, false);
                                } else if (eVar.f111154h instanceof CreateAwemeResponse) {
                                    if (!I18nBridgeService.getBridgeService_Monster().isUserMaterialDialogDealing()) {
                                        EventActivityComponent.this.mo48663a(eVar, absActivity);
                                    } else {
                                        I18nBridgeService.getBridgeService_Monster().registerComponentAndStatus(EventActivityComponent.this, eVar);
                                    }
                                }
                            }
                        } else {
                            EventActivityComponent.this.mo48666d(eVar, absActivity);
                        }
                        C43891e eVar = (C43891e) C53755c.m114319a().mo112954a(C43891e.class);
                        if (eVar != null) {
                            C53755c.m114319a().mo112963g(eVar);
                        }
                    }
                });
            }
            AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().setPublishStatus(eVar.f111148b);
        }
    }

    /* renamed from: a */
    public final void mo48663a(C43891e eVar, AbsActivity absActivity) {
        if (!m57650b(eVar, absActivity) && !m57649a(eVar)) {
            mo48665c(eVar, absActivity);
            C45417bc.m98986a(eVar.f111154h, absActivity);
        }
    }

    /* renamed from: d */
    public final void mo48666d(C43891e eVar, AbsActivity absActivity) {
        if (!m57649a(eVar)) {
            C41979aq.m91946a().sharePrivateAfterPublishDialog(absActivity, (Aweme) eVar.f111150d, eVar.f111147a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo48665c(C43891e eVar, AbsActivity absActivity) {
        this.f62573c = C41979aq.m91946a().shareAfterPublishDialog(absActivity, (Aweme) eVar.f111150d, eVar.f111147a);
        String curUserId = C20902b.m53242a().getCurUserId();
        final long a = C29508i.m69646a(curUserId, 0);
        this.f62573c.setOnDismissListener(new OnDismissListener() {
            public final void onDismiss() {
                User curUser = C20902b.m53242a().getCurUser();
                if (!C29508i.m69649c() || (curUser != null && curUser.nicknameUpdateReminder())) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis > a) {
                        long j = a;
                        Calendar instance = Calendar.getInstance();
                        instance.setTimeInMillis(currentTimeMillis);
                        boolean z = false;
                        instance.set(11, 0);
                        instance.set(12, 0);
                        instance.set(13, 0);
                        instance.set(14, 0);
                        if (instance.getTimeInMillis() < j) {
                            z = true;
                        }
                        if (!z) {
                            boolean nicknameUpdateReminder = curUser.nicknameUpdateReminder();
                            Activity g = C11016e.m22312g();
                            if (g != null && (EventActivityComponent.f62570b == null || !EventActivityComponent.f62570b.isShowing())) {
                                C23506h hVar = new C23506h(g, curUser, nicknameUpdateReminder ? 1 : 0);
                                EventActivityComponent.f62570b = hVar;
                                hVar.show();
                                C26890h.onEventV3("modify_username_notify");
                            }
                        }
                    }
                }
            }
        });
        this.f62573c.mo63556b();
        C29508i.m69648b(curUserId, System.currentTimeMillis());
        C45407ay.m98968a("PublishDurationMonitor MANUAL_END showSuccessWindow");
    }

    /* renamed from: a */
    public final void mo265a(C0184k kVar, C0177a aVar) {
        switch (aVar) {
            case ON_CREATE:
                if (this.f62572a instanceof C22582c) {
                    this.f62574d = new WeakReference<>((C22582c) this.f62572a);
                }
                return;
            case ON_START:
                C47718bf.m103290c(this);
                return;
            case ON_STOP:
                C47718bf.m103291d(this);
                return;
            case ON_DESTROY:
                if (this.f62573c != null) {
                    this.f62573c.mo63557c();
                    break;
                }
                break;
        }
    }

    /* renamed from: b */
    static boolean m57650b(C43891e eVar, AbsActivity absActivity) {
        if (!C41934a.m91880a()) {
            return false;
        }
        AVUploadSaveModel aVUploadSaveModel = ((CreateAwemeResponse) eVar.f111154h).mSaveModel;
        if (aVUploadSaveModel == null) {
            return false;
        }
        Aweme aweme = ((CreateAwemeResponse) eVar.f111154h).aweme;
        String str = "short";
        if (!(aweme == null || aweme.getDistributeType() == 1)) {
            str = "long";
        }
        if (aweme != null && !f62571e && aVUploadSaveModel.getSaveToAlbum()) {
            C41979aq.m91947b().monitorWaterMarkStatus(aweme.getAid(), "video_post_page", "download", str, null, aVUploadSaveModel.isWaterMark() ? 1 : 0);
        }
        int saveType = aVUploadSaveModel.getSaveType();
        C41985as asVar = null;
        Iterator it = C41985as.supportChannels(absActivity).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C41985as asVar2 = (C41985as) it.next();
            if (asVar2.getSaveType() == saveType) {
                asVar = asVar2;
                break;
            }
        }
        if (asVar == null) {
            f62571e = true;
            return false;
        }
        UrlModel cover = ((CreateAwemeResponse) eVar.f111154h).aweme.getVideo().getCover();
        C23515d.m57687b((String) cover.getUrlList().get(0));
        C30536d dVar = new C30536d(absActivity, asVar.getLabel(), cover);
        dVar.setOnDismissListener(new C23502d(eVar, asVar, aVUploadSaveModel, absActivity));
        dVar.mo62733a();
        C26890h.m65011a("share_notice_after_post", C23089d.m56640a().mo47829a("enter_from", "video_post_page").mo47829a("platform", asVar.getKey()).f61491a);
        if (aweme != null && !f62571e) {
            C41979aq.m91947b().monitorWaterMarkStatus(aweme.getAid(), "video_post_page", asVar.getKey(), str, null, aVUploadSaveModel.isWaterMark() ? 1 : 0);
            f62571e = true;
        }
        return true;
    }

    /* renamed from: a */
    public static void m57648a(Activity activity, C42421al alVar, Runnable runnable) {
        PoiStruct poiStruct;
        String str;
        if (alVar != null && (alVar instanceof CreateAwemeResponse)) {
            C25687b bVar = ((CreateAwemeResponse) alVar).couponInfo;
            if (bVar != null) {
                try {
                    str = ((CreateAwemeResponse) alVar).aweme.getPoiStruct().getPoiId();
                    try {
                        poiStruct = ((CreateAwemeResponse) alVar).aweme.getPoiStruct();
                    } catch (NullPointerException unused) {
                        poiStruct = null;
                        String str2 = str;
                        PoiServiceImpl.createIPoiServicebyMonsterPlugin().mobClickCouponEvent(new C39052a().mo79210b(str2).mo79208a("homepage_follow").mo79213e("homepage_follow").mo79215g(String.valueOf(bVar.getCouponId())).mo79214f("click_publish").mo79216h(C25668a.m62225a(activity, bVar.getStatus(), true)).mo79218j(C25668a.m62226a(bVar)).mo79207a(poiStruct).mo79209a());
                        C30433j.m71355b(true);
                        PoiServiceImpl.createIPoiServicebyMonsterPlugin().showGotCouponDialog(activity, str2, bVar, poiStruct, new C23503e(runnable));
                        C26890h.m65011a("show_coupon_toast", C23089d.m56640a().mo47829a("enter_from", "homepage_follow").mo47829a("enter_method", "click_publish").mo47826a("coupon_id", bVar.getCouponId()).mo47829a("poi_id", str2).f61491a);
                        return;
                    }
                } catch (NullPointerException unused2) {
                    str = null;
                    poiStruct = null;
                    String str22 = str;
                    PoiServiceImpl.createIPoiServicebyMonsterPlugin().mobClickCouponEvent(new C39052a().mo79210b(str22).mo79208a("homepage_follow").mo79213e("homepage_follow").mo79215g(String.valueOf(bVar.getCouponId())).mo79214f("click_publish").mo79216h(C25668a.m62225a(activity, bVar.getStatus(), true)).mo79218j(C25668a.m62226a(bVar)).mo79207a(poiStruct).mo79209a());
                    C30433j.m71355b(true);
                    PoiServiceImpl.createIPoiServicebyMonsterPlugin().showGotCouponDialog(activity, str22, bVar, poiStruct, new C23503e(runnable));
                    C26890h.m65011a("show_coupon_toast", C23089d.m56640a().mo47829a("enter_from", "homepage_follow").mo47829a("enter_method", "click_publish").mo47826a("coupon_id", bVar.getCouponId()).mo47829a("poi_id", str22).f61491a);
                    return;
                }
                String str222 = str;
                PoiServiceImpl.createIPoiServicebyMonsterPlugin().mobClickCouponEvent(new C39052a().mo79210b(str222).mo79208a("homepage_follow").mo79213e("homepage_follow").mo79215g(String.valueOf(bVar.getCouponId())).mo79214f("click_publish").mo79216h(C25668a.m62225a(activity, bVar.getStatus(), true)).mo79218j(C25668a.m62226a(bVar)).mo79207a(poiStruct).mo79209a());
                C30433j.m71355b(true);
                PoiServiceImpl.createIPoiServicebyMonsterPlugin().showGotCouponDialog(activity, str222, bVar, poiStruct, new C23503e(runnable));
                C26890h.m65011a("show_coupon_toast", C23089d.m56640a().mo47829a("enter_from", "homepage_follow").mo47829a("enter_method", "click_publish").mo47826a("coupon_id", bVar.getCouponId()).mo47829a("poi_id", str222).f61491a);
                return;
            }
        }
        runnable.run();
    }

    /* renamed from: a */
    public final void mo48664a(final C43891e eVar, final AbsActivity absActivity, final boolean z) {
        int i;
        Object obj = eVar.f111150d;
        if (obj instanceof Aweme) {
            Aweme aweme = (Aweme) obj;
            if (aweme.getUploadMiscInfoStruct() != null && aweme.getUploadMiscInfoStruct().mvThemeId != null) {
                String str = aweme.getUploadMiscInfoStruct().mvThemeId;
                List<String> list = null;
                if (C31357a.m73104e() != null) {
                    list = C31357a.m73104e().f29311l;
                }
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (TextUtils.equals((String) it.next(), str)) {
                                i = 1;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            i = 2;
            ChristmasApi.m73109a().participateFestivalActivity(aweme.getAid(), i, C31357a.m73098b()).mo6514a(C1667a.m5940a()).mo6529b(C2168a.m6521b()).mo6314a((C1674ab<? super T>) new C1674ab<C31360b>() {
                public final void onComplete() {
                }

                public final void onSubscribe(C1690c cVar) {
                }

                public final void onError(Throwable th) {
                    if (!z) {
                        EventActivityComponent.this.mo48663a(eVar, absActivity);
                    }
                }

                public final /* synthetic */ void onNext(Object obj) {
                    C31360b bVar = (C31360b) obj;
                    if (!z) {
                        EventActivityComponent eventActivityComponent = EventActivityComponent.this;
                        C43891e eVar = eVar;
                        AbsActivity absActivity = absActivity;
                        if (!EventActivityComponent.m57650b(eVar, absActivity) && !C45417bc.m98986a(eVar.f111154h, absActivity) && !I18nBridgeService.getBridgeService_Monster().festivalShareVideoAfterPublish(absActivity, bVar, (Aweme) eVar.f111150d)) {
                            eventActivityComponent.mo48665c(eVar, absActivity);
                        }
                    }
                }
            });
        }
    }
}
