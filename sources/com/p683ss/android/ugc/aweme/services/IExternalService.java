package com.p683ss.android.ugc.aweme.services;

import com.p683ss.android.ugc.aweme.services.cutvideo.ICutVideoService;
import com.p683ss.android.ugc.aweme.services.external.IAVDraftService;
import com.p683ss.android.ugc.aweme.services.external.IAVScreenAdaptService;
import com.p683ss.android.ugc.aweme.services.external.IAVTypeFaceService;
import com.p683ss.android.ugc.aweme.services.external.IConfigService;
import com.p683ss.android.ugc.aweme.services.external.IInfoService;
import com.p683ss.android.ugc.aweme.services.external.IInitTaskService;
import com.p683ss.android.ugc.aweme.services.external.ability.IAbilityService;
import com.p683ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.p683ss.android.ugc.aweme.services.performance.ICrashReportService;
import com.p683ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import com.p683ss.android.ugc.aweme.services.superentrance.ISuperEntranceService;
import com.p683ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p683ss.android.ugc.aweme.services.video.IActivityNameService;

/* renamed from: com.ss.android.ugc.aweme.services.IExternalService */
public interface IExternalService {

    /* renamed from: com.ss.android.ugc.aweme.services.IExternalService$AsyncServiceLoader */
    public interface AsyncServiceLoader {
        void onLoad(AsyncAVService asyncAVService, long j);
    }

    IAbilityService abilityService();

    void asyncService(AsyncServiceLoader asyncServiceLoader);

    IActivityNameService classnameService();

    IConfigService configService();

    IAVDraftService draftService();

    IAVFilterService filterService();

    IAVMobService getAVMobService();

    ICutVideoService getCutVideoService();

    IInfoService infoService();

    void initASVE();

    IInitTaskService initService();

    IAVPerformance provideAVPerformance();

    ICrashReportService provideErrorReporter();

    ITakeInSameOptimize provideTakeInSameOptimize();

    IAVPublishService publishService();

    IAVScreenAdaptService screenAdaptService();

    ISpecialPlusService specialPlusService();

    ISuperEntranceService superEntranceService();

    IAVTypeFaceService typeFaceService();
}
