package com.p683ss.android.ugc.aweme.homepage.experiment;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.main.experiment.IHomepageExperimentService;

/* renamed from: com.ss.android.ugc.aweme.homepage.experiment.HomepageExperimentServiceImpl */
public final class HomepageExperimentServiceImpl implements IHomepageExperimentService {
    public final boolean isFamiliarInMainTab() {
        return false;
    }

    public final boolean isFamiliarInMainTabLeft() {
        return false;
    }

    public final boolean isFamiliarInMainTabMiddle() {
        return false;
    }

    public final boolean isShowFamiliarIn2TabWithNearBy() {
        return false;
    }

    public final boolean isShowFamiliarIn2TabWithOutNearBy() {
        return false;
    }

    public final boolean showNewFollowFeedStyle() {
        return false;
    }

    public static IHomepageExperimentService createIHomepageExperimentServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IHomepageExperimentService.class);
        if (a != null) {
            return (IHomepageExperimentService) a;
        }
        return new HomepageExperimentServiceImpl();
    }
}
