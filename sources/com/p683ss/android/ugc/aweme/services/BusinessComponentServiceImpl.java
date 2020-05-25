package com.p683ss.android.ugc.aweme.services;

import android.app.Dialog;
import android.content.Context;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.antiaddic.C22688a;
import com.p683ss.android.ugc.aweme.antiaddic.C22690b;
import com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22703a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22724i;
import com.p683ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformServiceImpl;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23689d;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23699m;
import com.p683ss.android.ugc.aweme.base.p1420ui.ScrollableViewPager;
import com.p683ss.android.ugc.aweme.bridgeservice.C23975a;
import com.p683ss.android.ugc.aweme.bridgeservice.C23981f;
import com.p683ss.android.ugc.aweme.detail.operators.C27423an;
import com.p683ss.android.ugc.aweme.detail.operators.C27471v;
import com.p683ss.android.ugc.aweme.favorites.viewholder.C29766b;
import com.p683ss.android.ugc.aweme.favorites.viewholder.C29767c;
import com.p683ss.android.ugc.aweme.feed.experiment.DOptionsDialogStyleExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer.C31039a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer.C31043d;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31083i;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31086j;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.live.feedpage.C36082a;
import com.p683ss.android.ugc.aweme.main.C36544by;
import com.p683ss.android.ugc.aweme.main.C36636ed;
import com.p683ss.android.ugc.aweme.main.C36670n;
import com.p683ss.android.ugc.aweme.main.service.C36696q;
import com.p683ss.android.ugc.aweme.p1336ak.C22565c;
import com.p683ss.android.ugc.aweme.p1336ak.C22566d;
import com.p683ss.android.ugc.aweme.p1807im.C33198i;
import com.p683ss.android.ugc.aweme.p1807im.C33199j;
import com.p683ss.android.ugc.aweme.profile.C39940m;
import com.p683ss.android.ugc.aweme.recommend.C41108d;
import com.p683ss.android.ugc.aweme.recommend.C41109e;
import com.p683ss.android.ugc.aweme.story.live.C46639b;

/* renamed from: com.ss.android.ugc.aweme.services.BusinessComponentServiceImpl */
public class BusinessComponentServiceImpl implements IBusinessComponentService {
    private C23981f businessBridgeService;
    private C27423an detailPageOperatorProvider;
    private C22565c labService;
    private C33198i mIMBusinessService;
    private IParentalPlatformService mParentalPlatformService;
    private C22703a mTimeLockHelperService;

    public C41109e getFeedRecommendUserManager() {
        return C41108d.f104474b;
    }

    public C29766b getMediumWebViewRefHolder() {
        return C29767c.f77760b;
    }

    public C22690b getAppStateReporter() {
        return C22688a.m55899d();
    }

    public C36696q getMainHelperService() {
        return new C36544by();
    }

    public Class<? extends C23689d> getProfilePageClass() {
        return C39940m.m88696f();
    }

    public C23981f getBusinessBridgeService() {
        if (this.businessBridgeService == null) {
            this.businessBridgeService = new C23975a();
        }
        return this.businessBridgeService;
    }

    public C27423an getDetailPageOperatorProvider() {
        if (this.detailPageOperatorProvider == null) {
            this.detailPageOperatorProvider = new C27471v();
        }
        return this.detailPageOperatorProvider;
    }

    public C33198i getIMBusinessService() {
        if (this.mIMBusinessService == null) {
            this.mIMBusinessService = new C33199j();
        }
        return this.mIMBusinessService;
    }

    public C22565c getLabService() {
        if (this.labService == null) {
            this.labService = new C22566d();
        }
        return this.labService;
    }

    public C46639b getLiveAllService() {
        return C36173w.m81665a().getILiveAllService();
    }

    public C36082a getLiveStateManager() {
        return C36173w.m81665a().getLiveStateManager();
    }

    public IParentalPlatformService getParentalPlatformService() {
        if (this.mParentalPlatformService == null) {
            this.mParentalPlatformService = new ParentalPlatformServiceImpl();
        }
        return this.mParentalPlatformService;
    }

    public C22703a getTimeLockHelperService() {
        if (this.mTimeLockHelperService == null) {
            this.mTimeLockHelperService = new C22724i();
        }
        return this.mTimeLockHelperService;
    }

    public static IBusinessComponentService createIBusinessComponentServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IBusinessComponentService.class);
        if (a != null) {
            return (IBusinessComponentService) a;
        }
        if (C27991b.f73442Z == null) {
            synchronized (IBusinessComponentService.class) {
                if (C27991b.f73442Z == null) {
                    C27991b.f73442Z = new BusinessComponentServiceImpl();
                }
            }
        }
        return (BusinessComponentServiceImpl) C27991b.f73442Z;
    }

    public C31039a getMaskLayerOptionsAdapter(Context context) {
        return new C31043d(context);
    }

    public C36670n newScrollSwitchHelper(Context context, ScrollableViewPager scrollableViewPager, C23699m mVar) {
        return new C36636ed(context, scrollableViewPager, mVar);
    }

    public Dialog newOptionsDialog(Context context, Aweme aweme, String str) {
        if (C10181b.m20511a().mo18172a(DOptionsDialogStyleExperiment.class, true, "long_press_using_new_style_menu", 31744, false)) {
            return new C31086j(context, aweme, str);
        }
        return new C31083i(context, aweme, str);
    }
}
