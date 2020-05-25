package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.android.livesdkapi.service.C8862e;
import com.p683ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p683ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.live.C36173w;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitLiveServiceTask */
public class InitLiveServiceTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public InitLiveServiceTask() {
        ServiceManager.get().bind(C8862e.class, new ServiceProvider<C8862e>() {
            public final /* synthetic */ Object get() {
                return C36173w.m81665a().getLive();
            }
        });
    }

    public void run(Context context) {
        try {
            C36173w.m81665a().getLiveInitService().mo74819b();
        } catch (Exception unused) {
        }
    }
}
