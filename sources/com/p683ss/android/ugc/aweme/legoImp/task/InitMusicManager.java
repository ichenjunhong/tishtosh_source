package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.external.ICacheService;
import com.p683ss.android.ugc.p2425e.C48557d;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitMusicManager */
public class InitMusicManager implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.MAIN;
    }

    static final /* synthetic */ String lambda$run$0$InitMusicManager(ICacheService iCacheService) {
        StringBuilder sb = new StringBuilder();
        sb.append(iCacheService.musicDir());
        sb.append("cache/");
        return sb.toString();
    }

    static final /* synthetic */ String lambda$run$1$InitMusicManager(ICacheService iCacheService) {
        StringBuilder sb = new StringBuilder();
        sb.append(iCacheService.musicDir());
        sb.append("download/");
        return sb.toString();
    }

    public void run(Context context) {
        ICacheService cacheConfig = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().cacheConfig();
        C48557d a = C48557d.m105031a();
        C35978e eVar = new C35978e(cacheConfig);
        C35979f fVar = new C35979f(cacheConfig);
        a.f122020c = context;
        a.f122018a = fVar;
        a.f122019b = eVar;
        C48557d.m105031a().f122021d = false;
    }
}
