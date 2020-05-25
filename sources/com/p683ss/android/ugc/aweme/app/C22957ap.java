package com.p683ss.android.ugc.aweme.app;

import com.p683ss.android.ugc.aweme.i18n.language.C33106b;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.legoImp.task.InitAbTest;
import com.p683ss.android.ugc.aweme.legoImp.task.InstallEventBus;
import com.p683ss.android.ugc.aweme.legoImp.task.PolarisInitTask;
import com.p683ss.android.ugc.aweme.legoImp.task.RegisterLifecycle;
import com.p683ss.android.ugc.aweme.legoImp.task.SymphonySdkInitTask;
import com.p683ss.android.ugc.aweme.legoImp.task.YoutubeRefreshTask;

/* renamed from: com.ss.android.ugc.aweme.app.ap */
public final class C22957ap extends C23139s {
    /* renamed from: s */
    public final void mo47735s() {
        PolarisInitTask.ensuareInit();
    }

    /* renamed from: r */
    public final LegoTask mo47734r() {
        return new PolarisInitTask();
    }

    /* renamed from: t */
    public final boolean mo47736t() {
        return PolarisInitTask.isPolarisInit();
    }

    /* renamed from: u */
    public final LegoTask mo47737u() {
        return new InitAbTest();
    }

    /* renamed from: v */
    public final LegoTask mo47738v() {
        return new SymphonySdkInitTask();
    }

    /* renamed from: w */
    public final LegoTask mo47739w() {
        return new RegisterLifecycle();
    }

    /* renamed from: x */
    public final void mo47740x() {
        C33106b.m76111b(null);
    }

    /* renamed from: y */
    public final LegoTask mo47741y() {
        return new YoutubeRefreshTask();
    }

    /* renamed from: z */
    public final LegoTask mo47742z() {
        return new InstallEventBus();
    }
}
