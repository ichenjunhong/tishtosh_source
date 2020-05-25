package com.p683ss.android.ugc.aweme.setting.api;

import com.bytedance.ies.abmock.C10181b;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.component.music.MusicService;
import com.p683ss.android.ugc.aweme.discover.p1659ui.GetABTest;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.setting.C41515a;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.setting.api.AbTestApi.AbTestResponse;
import com.p683ss.android.ugc.aweme.share.C41934a;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;

/* renamed from: com.ss.android.ugc.aweme.setting.api.c */
public final /* synthetic */ class C41548c implements C2205y {

    /* renamed from: a */
    private final C18082l f105246a;

    public C41548c(C18082l lVar) {
        this.f105246a = lVar;
    }

    public final void subscribe(C2204x xVar) {
        C18082l lVar = this.f105246a;
        try {
            AbTestResponse abTestResponse = (AbTestResponse) C47759cc.m103382a().getGson().mo34881a(lVar, AbTestResponse.class);
            if (abTestResponse != null) {
                if (abTestResponse.data != null) {
                    C18085o m = lVar.mo35009m();
                    AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().updateABTestModel(m);
                    MusicService.createIMusicServicebyMonsterPlugin().updateMusicAbTestModel(m);
                    C41934a.m91879a(m);
                    GetABTest.f74754d.mo58049a(m);
                    I18nBridgeService.getBridgeService_Monster().updateTTAbTest(abTestResponse.data);
                    C41589c.m91432a().mo85368a(abTestResponse.data);
                    C18085o e = lVar.mo35009m().mo35025e("data");
                    if (e != null) {
                        C22574a.m55738f().mo46917a("method_save_abtest_keva", false);
                        C10181b.m20511a();
                        C10181b.m20521a(e);
                        C22574a.m55738f().mo46921b("method_save_abtest_keva", false);
                        C41515a.f105192a.mo85299a();
                    }
                    xVar.mo6282a(Boolean.valueOf(true));
                }
            }
        } catch (Exception unused) {
        }
    }
}
