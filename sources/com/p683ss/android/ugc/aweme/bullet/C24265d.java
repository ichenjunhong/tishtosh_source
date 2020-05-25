package com.p683ss.android.ugc.aweme.bullet;

import android.content.Context;
import com.bytedance.ies.bullet.kit.p644rn.C10471g;
import com.bytedance.ies.bullet.kit.p644rn.C10473i;
import com.bytedance.ies.bullet.kit.p644rn.p645a.C10455c;
import com.bytedance.ies.bullet.kit.web.C10525h;
import com.bytedance.ies.bullet.kit.web.C10527j;
import com.bytedance.ies.bullet.kit.web.p648a.C10490g;
import com.bytedance.ies.bullet.p625a.C10222b;
import com.bytedance.ies.bullet.p625a.C10222b.C10223a;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10255a;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10269a;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10275i;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10327c;
import com.bytedance.ies.bullet.p628b.p637g.p640c.C10333d;
import com.bytedance.ies.bullet.p628b.p643i.C10423r;
import com.bytedance.ies.bullet.p653ui.common.C10577d;
import com.bytedance.ies.bullet.p653ui.common.p655b.C10565b;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.sdk.webview.p1210b.C19741b;
import com.p683ss.android.sdk.webview.p1210b.C19742c;
import com.p683ss.android.sdk.webview.p1210b.C19746f;
import com.p683ss.android.sdk.webview.p1210b.C19747g;
import com.p683ss.android.ugc.aweme.app.download.p1374a.C23077b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.commerce.AdInfoMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.commerce.AsyncGoodsEditInfoMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.commerce.FetchFeedsAwemeDataMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.commerce.GetGoodsInfoMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.commerce.JumpToTaobaoBindMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.commerce.JumpToTaobaoCouponMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.commerce.MakeCallMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.commerce.OpenECommerceLegalModalMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.commerce.OpenGoodDetailMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.commerce.OpenTaobaoGoodMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.commerce.PayMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.commerce.SelectFilterMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.commerce.SetExtraDataMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.commerce.TaoCommandMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.commerce.WXMiniPayMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.common.BindPhoneMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.common.BroadcastMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.common.CloseCurrentPanelMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.common.FetchMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.common.FileSelectionMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.common.GalleryPreviewMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.common.GetLocationMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.common.GetNativeItemMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.common.GetSettingsMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.common.IsAppInstalledMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.common.LoginMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.common.LoginWithPlatform;
import com.p683ss.android.ugc.aweme.bullet.bridge.common.LogoutMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.common.MiniAppPreloadMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.common.NoticePermissionMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.common.OpenPhoneAreaMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.common.OpenPorAccountMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.common.OpenScanMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.common.RequestMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.common.SetNativeItemMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.common.ShowDmtToastMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.common.UploadFileMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.AppInfoMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.BulletGetAppInfoMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.BulletUserInfoMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.CloseMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.ComponentDidMountMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.DarkModeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.GetAppInfoMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsFlowMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.MonitorLogMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.OpenAwemeDetailMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.OpenBrowserMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.OpenFeedsFlowMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.OpenHalfDialogMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.OpenLongVideoMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.OpenSchemaMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.OpenShortVideoMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.ReportCustomEventMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.RoutePopMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.RoutePushMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.SelectLocationMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.SendLogMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.SendLogV3Method;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.ShareMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.ShowEasterEggMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.ShowToastMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.framework.UserInfoMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.jsdownload.C24225a.C24226a;
import com.p683ss.android.ugc.aweme.bullet.bridge.jsdownload.C24225a.C24229b;
import com.p683ss.android.ugc.aweme.bullet.bridge.jsdownload.CancelDownloadAppAdMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.jsdownload.DownloadAppAdMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.jsdownload.GetDownloadPauseTaskMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.jsdownload.GetDownloadingTaskMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.jsdownload.GetInstallStatusMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.jsdownload.SubscribeAppAdMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.jsdownload.UnSubScribeAppAdMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.main.CardRelayoutMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.main.OpenMediumChallengeDetailMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.p1473ad.AdThirdTrackMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.p1473ad.FeedLearnMoreButtonClick;
import com.p683ss.android.ugc.aweme.bullet.bridge.p1473ad.MessageTipMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.p1473ad.OpenAdUrlMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.p1473ad.SendAdLogMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.p1473ad.StartFeedButtonAnimationMethod;
import com.p683ss.android.ugc.aweme.bullet.module.base.C24331b;
import com.p683ss.android.ugc.aweme.bullet.module.p1476a.C24282a;
import com.p683ss.android.ugc.aweme.bullet.module.p1476a.C24283b;
import com.p683ss.android.ugc.aweme.bullet.module.p1476a.C24286c;
import com.p683ss.android.ugc.aweme.bullet.module.p1476a.C24287d;
import com.p683ss.android.ugc.aweme.bullet.module.p1476a.C24290e;
import com.p683ss.android.ugc.aweme.bullet.utils.C24347a;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.bullet.EnterPOIThemeFeedMethod;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.bullet.PlayMusicBridge;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.bullet.SearchKeywordChangeMethod;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.bullet.UpdateGeneralSearchBackgroundMethod;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48331ae;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48343e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.d */
public final class C24265d implements C10222b, C10455c, C10490g {
    /* renamed from: a */
    public final List<C10275i> mo18254a(C10326b bVar) {
        C52711k.m112240b(bVar, "providerFactory");
        return C10223a.m20697a(this, bVar);
    }

    /* renamed from: c */
    public final C10333d<C10255a> mo18256c(C10326b bVar) {
        C52711k.m112240b(bVar, "providerFactory");
        return C10223a.m20698b(this, bVar);
    }

    /* renamed from: d */
    public final C10565b mo18257d(C10326b bVar) {
        C52711k.m112240b(bVar, "providerFactory");
        return new C24331b(bVar, null, 2, null);
    }

    /* renamed from: e */
    public final List<C10423r> mo18258e(C10326b bVar) {
        C52711k.m112240b(bVar, "providerFactory");
        return C10223a.m20699c(this, bVar);
    }

    /* renamed from: f */
    public final C10473i mo18514f(C10326b bVar) {
        C52711k.m112240b(bVar, "providerFactory");
        return new C24286c(bVar);
    }

    /* renamed from: g */
    public final C10471g mo18515g(C10326b bVar) {
        C52711k.m112240b(bVar, "providerFactory");
        return new C24283b(bVar);
    }

    /* renamed from: h */
    public final C10527j mo18616h(C10326b bVar) {
        C52711k.m112240b(bVar, "providerFactory");
        return new C24290e(bVar);
    }

    /* renamed from: i */
    public final C10525h mo18617i(C10326b bVar) {
        C52711k.m112240b(bVar, "providerFactory");
        return new C24287d(bVar);
    }

    /* renamed from: b */
    public final List<C10268e> mo18255b(C10326b bVar) {
        C10326b bVar2 = bVar;
        C52711k.m112240b(bVar2, "providerFactory");
        C52711k.m112240b(bVar2, "providerFactory");
        List<C10268e> arrayList = new ArrayList<>();
        arrayList.addAll(C52575l.m112099b((Object[]) new BaseBridgeMethod[]{new FetchMethod(bVar2), new RequestMethod(bVar2), new GetNativeItemMethod(bVar2), new SetNativeItemMethod(bVar2), new GetSettingsMethod(bVar2), new BroadcastMethod(bVar2), new ShowDmtToastMethod(bVar2), new OpenBrowserMethod(bVar2), new UploadFileMethod(bVar2), new GetLocationMethod(bVar2), new GalleryPreviewMethod(bVar2), new MakeCallMethod(bVar2), new OpenScanMethod(bVar2), new FileSelectionMethod(bVar2), new BindPhoneMethod(bVar2), new IsAppInstalledMethod(bVar2), new NoticePermissionMethod(bVar2), new LoginMethod(bVar2), new LoginWithPlatform(bVar2), new LogoutMethod(bVar2), new MiniAppPreloadMethod(bVar2), new OpenPhoneAreaMethod(bVar2), new OpenPorAccountMethod(bVar2)}));
        arrayList.addAll(C52575l.m112099b((Object[]) new BaseBridgeMethod[]{new CloseMethod(bVar2), new UserInfoMethod(bVar2), new SendLogMethod(bVar2), new SendLogV3Method(bVar2), new MonitorLogMethod(bVar2), new OpenSchemaMethod(bVar2), new ShareMethod(bVar2), new ShowToastMethod(bVar2), new OpenBrowserMethod(bVar2), new AppInfoMethod(bVar2), new GetAppInfoMethod(bVar2), new ComponentDidMountMethod(bVar2), new LoadFeedsFlowMethod(bVar2), new OpenFeedsFlowMethod(bVar2), new OpenAwemeDetailMethod(bVar2), new LoadFeedsMethod(bVar2), new DarkModeMethod(bVar2), new RoutePopMethod(bVar2), new RoutePushMethod(bVar2), new OpenShortVideoMethod(bVar2), new OpenLongVideoMethod(bVar2), new OpenHalfDialogMethod(bVar2), new SelectLocationMethod(bVar2), new ShowEasterEggMethod(bVar2), new BulletUserInfoMethod(bVar2), new BulletGetAppInfoMethod(bVar2), new ReportCustomEventMethod(bVar2)}));
        arrayList.addAll(C52575l.m112099b((Object[]) new BaseBridgeMethod[]{new OpenMediumChallengeDetailMethod(bVar2), new CardRelayoutMethod(bVar2)}));
        arrayList.addAll(C52575l.m112099b((Object[]) new BaseBridgeMethod[]{new SearchKeywordChangeMethod(bVar2), new PlayMusicBridge(bVar2), new EnterPOIThemeFeedMethod(bVar2), new UpdateGeneralSearchBackgroundMethod(bVar2)}));
        arrayList.addAll(C52575l.m112099b((Object[]) new BaseBridgeMethod[]{new AsyncGoodsEditInfoMethod(bVar2), new GetGoodsInfoMethod(bVar2), new OpenTaobaoGoodMethod(bVar2), new JumpToTaobaoBindMethod(bVar2), new MakeCallMethod(bVar2), new OpenGoodDetailMethod(bVar2), new FetchFeedsAwemeDataMethod(bVar2), new JumpToTaobaoCouponMethod(bVar2), new PayMethod(bVar2), new WXMiniPayMethod(bVar2), new OpenECommerceLegalModalMethod(bVar2), new TaoCommandMethod(bVar2), new AdInfoMethod(bVar2), new CloseCurrentPanelMethod(bVar2), new SelectFilterMethod(bVar2), new SetExtraDataMethod(bVar2)}));
        List arrayList2 = new ArrayList();
        C10757a aVar = (C10757a) bVar2.mo18401c(C10757a.class);
        Context context = (Context) bVar2.mo18401c(Context.class);
        if (!(aVar == null || context == null)) {
            arrayList2.add(C24347a.m59706a(bVar2, "openAweme", new C48343e(new WeakReference(context), aVar), C10269a.PROTECT));
            arrayList2.add(C24347a.m59706a(bVar2, "openRecord", new C48331ae(new WeakReference(context), aVar), C10269a.PROTECT));
        }
        arrayList.addAll(arrayList2);
        arrayList.addAll(C24282a.m59453a(bVar));
        List arrayList3 = new ArrayList();
        Context context2 = (Context) bVar2.mo18401c(Context.class);
        if (!(((C10757a) bVar2.mo18401c(C10757a.class)) == null || context2 == null)) {
            arrayList3.add(C24347a.m59706a(bVar2, "isAppInstalled", new C19741b(new WeakReference(context2)), C10269a.PROTECT));
            arrayList3.add(C24347a.m59706a(bVar2, "copyToClipboard", new C19742c(context2), C10269a.PROTECT));
            arrayList3.add(C24347a.m59706a(bVar2, "openThirdApp", new C19747g(context2), C10269a.PROTECT));
            arrayList3.add(C24347a.m59706a(bVar2, "open", new C19746f(new WeakReference(context2)), C10269a.PROTECT));
        }
        arrayList.addAll(arrayList3);
        arrayList.addAll(C52575l.m112099b((Object[]) new BaseBridgeMethod[]{new SendAdLogMethod(bVar2), new MessageTipMethod(bVar2), new OpenAdUrlMethod(bVar2), new AdThirdTrackMethod(bVar2), new StartFeedButtonAnimationMethod(bVar2), new FeedLearnMoreButtonClick(bVar2)}));
        C52711k.m112240b(bVar2, "providerFactory");
        C10326b b = bVar.mo18398b();
        b.mo18396a(C23077b.class, (C10327c<? extends T>) new C24226a<Object>(b));
        C10577d dVar = (C10577d) b.mo18401c(C10577d.class);
        if (dVar != null) {
            dVar.mo18715a(new C24229b(b));
        }
        arrayList.addAll(C52575l.m112099b((Object[]) new BaseBridgeMethod[]{new SubscribeAppAdMethod(b), new UnSubScribeAppAdMethod(b), new DownloadAppAdMethod(b), new CancelDownloadAppAdMethod(b), new GetDownloadPauseTaskMethod(b), new GetDownloadingTaskMethod(b), new GetInstallStatusMethod(b)}));
        return arrayList;
    }
}
