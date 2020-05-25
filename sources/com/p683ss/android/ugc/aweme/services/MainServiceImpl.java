package com.p683ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.app.AwemeAppData;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.experiment.RelationLabelClickEnterExperiment;
import com.p683ss.android.ugc.aweme.experiment.UseHandlerExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.longvideonew.LongVideoActivity;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.music.C37385f;
import com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTNotificationTabMergeExperiment;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.music.IMusicService;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.setting.model.MigrateABTestModel;
import com.p683ss.android.ugc.aweme.update.UpdateHelper;
import com.p683ss.android.ugc.aweme.video.local.C48059c;

/* renamed from: com.ss.android.ugc.aweme.services.MainServiceImpl */
public class MainServiceImpl implements IMainService {
    private IBusinessGoodsService businessGoodsService;
    private IMusicService chooseMusicService;
    private ILocalVideoCacheService localVideoCacheService;

    public String getApiUrlPrefix() {
        return Api.f61282b;
    }

    public boolean isUseJediAwemelistFragment() {
        return false;
    }

    public boolean isNotificationTabMStyle() {
        return MTNotificationTabMergeExperiment.m85061a();
    }

    public int getAppVersionCode() {
        return UpdateHelper.m102902a().mo94797d();
    }

    public IBusinessGoodsService getBusinessGoodsService() {
        if (this.businessGoodsService == null) {
            this.businessGoodsService = new BusinessGoodsServiceImpl();
        }
        return this.businessGoodsService;
    }

    public ILocalVideoCacheService getLocalVideoCacheService() {
        if (this.localVideoCacheService == null) {
            this.localVideoCacheService = new C48059c();
        }
        return this.localVideoCacheService;
    }

    public boolean isContainsKeyWithLruEntries() {
        C41589c.m91432a();
        return MigrateABTestModel.getInstance().isContainsKeyWithLruEntries();
    }

    public boolean isReplaceAwemeCache() {
        C41589c.m91432a();
        return MigrateABTestModel.getInstance().isReplaceAwemeManagerWithLRUCache();
    }

    public IMusicService musicService() {
        if (this.chooseMusicService == null) {
            this.chooseMusicService = new C37385f();
        }
        return this.chooseMusicService;
    }

    public static IMainService createIMainServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IMainService.class);
        if (a != null) {
            return (IMainService) a;
        }
        return new MainServiceImpl();
    }

    public boolean isRelationLabelClickEnter() {
        return C10181b.m20511a().mo18172a(RelationLabelClickEnterExperiment.class, true, "relation_label_click_enter", 31744, false);
    }

    public boolean isMainPage(Context context) {
        return context instanceof MainActivity;
    }

    public void setStartWithoutSplash(boolean z) {
        AwemeAppData.m47851a().f61131i = z;
    }

    public boolean shouldChangeToHandle(String str) {
        return UseHandlerExperiment.m69633a(str);
    }

    public void updateIMUserFollowStatus(User user) {
        C33194e.m76279d().updateIMUserFollowStatus(C33194e.m76261a(user));
    }

    public String getStoryEnterFromForMain(Activity activity) {
        if (!(activity instanceof MainActivity)) {
            return "";
        }
        if (((MainActivity) activity).isUnderMainTab()) {
            return "homepage_hot";
        }
        return "homepage_friends";
    }

    public void trackAppsFlyerEvent(String str, String str2) {
        I18nBridgeService.getBridgeService_Monster().trackAppsFlyerEvent(str, str2);
    }

    public void startActivity(Context context, Aweme aweme, String str, int i, int i2, String str2, boolean z) {
        LongVideoActivity.f93195a.mo75332a(context, aweme, str, i, i2, str2, z);
    }
}
