package com.p683ss.android.ugc.aweme.global.config.settings;

import android.content.Context;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.C10198b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.discover.model.SameCityModel;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35468e;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.a */
public abstract class C32808a implements C32811d {

    /* renamed from: c */
    private static volatile C32808a f85410c;

    /* renamed from: a */
    public C35468e f85411a;

    /* renamed from: b */
    protected C17971f f85412b = new C17971f();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo66389a(IESSettingsProxy iESSettingsProxy);

    /* renamed from: a */
    public static C32808a m75701a() {
        if (f85410c == null) {
            synchronized (C32808a.class) {
                if (f85410c == null) {
                    f85410c = I18nBridgeService.getBridgeService_Monster().getSettingsWatcher();
                }
            }
        }
        return f85410c;
    }

    /* renamed from: b */
    static final /* synthetic */ Object m75702b(IESSettingsProxy iESSettingsProxy) throws Exception {
        Context a = C11010c.m22280a();
        C10198b.m20655a(a, iESSettingsProxy.getSettings(), C10198b.m20654a(a));
        return null;
    }

    public final void change(IESSettingsProxy iESSettingsProxy) {
        C0013i.m16a((Callable<TResult>) new C32809b<TResult>(iESSettingsProxy));
        try {
            SameCityModel.sImageUrl = iESSettingsProxy.getDiscoveryLocationBackgroundUrl();
        } catch (C10174a unused) {
        }
        this.f85411a = C33194e.m76262a(SharePrefCache.inst().getSharePref().edit(), iESSettingsProxy);
        AVExternalServiceImpl.getAVServiceImpl_Monster().configService().dmtAvSettingConfig().updateServerSettings(iESSettingsProxy);
        C32818i.m75717a().mo66398a(true);
        mo66389a(iESSettingsProxy);
    }
}
