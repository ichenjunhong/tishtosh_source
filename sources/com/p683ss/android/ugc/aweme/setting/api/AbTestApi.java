package com.p683ss.android.ugc.aweme.setting.api;

import android.content.Context;
import com.bytedance.ies.abmock.C10181b;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.discover.p1659ui.GetABTest;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.aweme.setting.C41515a;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.setting.api.ABApi.C41541a;
import com.p683ss.android.ugc.aweme.setting.model.AbTestModel;
import com.p683ss.android.ugc.aweme.share.C41934a;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.setting.api.AbTestApi */
public final class AbTestApi {

    /* renamed from: com.ss.android.ugc.aweme.setting.api.AbTestApi$AbTestResponse */
    public static class AbTestResponse {
        @C17952c(mo34828a = "data")
        public AbTestModel data;
    }

    /* renamed from: a */
    public static void m91373a(boolean z) {
        C41541a.m91370a().querySettings(C23859b.m58575b().mo49468b((Context) AwemeApplication.m56199a(), "last_ab_setting_version", "")).mo19a(C41546a.f105244a).mo20a((C0011g<TResult, TContinuationResult>) new C41547b<TResult,TContinuationResult>(z), C0013i.f25b);
    }

    /* renamed from: a */
    static final /* synthetic */ Boolean m91371a(C0013i iVar) throws Exception {
        try {
            if (iVar.mo31c()) {
                return Boolean.valueOf(false);
            }
            if (iVar.mo33d()) {
                return Boolean.valueOf(false);
            }
            AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().updateABTestModel((C18085o) iVar.mo34e());
            C41934a.m91879a((C18085o) iVar.mo34e());
            GetABTest.f74754d.mo58049a((C18085o) iVar.mo34e());
            AbTestResponse abTestResponse = null;
            if (C47759cc.m103382a() != null) {
                abTestResponse = (AbTestResponse) C47759cc.m103382a().getGson().mo34881a((C18082l) iVar.mo34e(), AbTestResponse.class);
            }
            if (abTestResponse != null) {
                if (abTestResponse.data != null) {
                    I18nBridgeService.getBridgeService_Monster().updateTTAbTest(abTestResponse.data);
                    C41589c.m91432a().mo85368a(abTestResponse.data);
                    C18085o e = ((C18085o) iVar.mo34e()).mo35009m().mo35025e("data");
                    if (e != null) {
                        C22574a.m55738f().mo46917a("method_save_abtest_keva", false);
                        C10181b.m20511a();
                        C10181b.m20521a(e);
                        C22574a.m55738f().mo46921b("method_save_abtest_keva", false);
                        C41515a.f105192a.mo85299a();
                    }
                    return Boolean.valueOf(true);
                }
            }
            return Boolean.valueOf(false);
        } catch (Exception unused) {
            return Boolean.valueOf(false);
        } catch (IncompatibleClassChangeError unused2) {
        }
    }
}
