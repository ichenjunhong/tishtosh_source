package com.p683ss.android.ugc.aweme.initializer;

import android.content.Intent;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.familiar.service.C29655g;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1797h.C32938a;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.port.internal.C39661j;
import com.p683ss.android.ugc.aweme.port.internal.C39662k;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.libra.CloseClientWatermarkExperiment;
import com.p683ss.android.ugc.aweme.utils.C47950q;

/* renamed from: com.ss.android.ugc.aweme.initializer.n */
final /* synthetic */ class C35705n implements Runnable {

    /* renamed from: a */
    private final Aweme f91665a;

    /* renamed from: b */
    private final FragmentActivity f91666b;

    /* renamed from: c */
    private final Intent f91667c;

    C35705n(Aweme aweme, FragmentActivity fragmentActivity, Intent intent) {
        this.f91665a = aweme;
        this.f91666b = fragmentActivity;
        this.f91667c = intent;
    }

    public final void run() {
        Aweme aweme = this.f91665a;
        FragmentActivity fragmentActivity = this.f91666b;
        Intent intent = this.f91667c;
        if (aweme.getStatus().getPrivateStatus() == 1 || C47950q.m103754c(aweme)) {
            if (!C29655g.f77512b.tryShowPublishSyncToDuoshanDialog(fragmentActivity.getSupportFragmentManager(), aweme.getAid())) {
                C41979aq.m91946a().sharePrivateAfterPublishDialog(fragmentActivity, aweme, 0);
            }
            if (intent.getIntExtra("video_type", -1) == 5 && !C32938a.m75836a(aweme)) {
                AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().processService().savePhoto((PhotoContext) intent.getSerializableExtra("photoContext"), true, null);
            }
        } else {
            PhotoContext photoContext = (PhotoContext) intent.getSerializableExtra("photoContext");
            if (!C29655g.f77512b.tryShowPublishSyncToDuoshanDialog(fragmentActivity.getSupportFragmentManager(), aweme.getAid())) {
                IAVProcessService processService = AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().processService();
                if (CloseClientWatermarkExperiment.m92635a()) {
                    processService.savePhoto(photoContext, false, new C39661j(fragmentActivity, aweme));
                    return;
                }
                processService.savePhoto(photoContext, true, new C39662k(fragmentActivity, aweme));
            }
        }
    }
}
