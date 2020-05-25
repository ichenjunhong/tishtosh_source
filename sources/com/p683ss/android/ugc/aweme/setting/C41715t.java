package com.p683ss.android.ugc.aweme.setting;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.google.gson.C17971f;
import com.google.gson.C18082l;
import com.p683ss.android.ugc.aweme.account.util.C22282t;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.C23052bg;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.p1417h.C23542f;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.SettingsUtil;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;
import com.p683ss.android.ugc.aweme.main.p1942e.C36622e;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.setting.model.AwemeSettings;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45460w;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.setting.t */
public final class C41715t extends C41549aq {

    /* renamed from: a */
    C17971f f105573a;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Object mo85558b(AwemeSettings awemeSettings) throws Exception {
        mo85332a(awemeSettings);
        C47718bf.m103288a(new C36622e());
        return null;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m91588a(long j) throws Exception {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cost_duration", j);
            C23131p.m57776a("settings_response_cost_duration", 1, C23088c.m56632a(jSONObject).mo47825b());
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public final void mo85332a(AwemeSettings awemeSettings) {
        if (awemeSettings != null) {
            super.mo85332a(awemeSettings);
            m91590a(awemeSettings, (String) null);
        }
    }

    /* renamed from: a */
    public final void mo85333a(Object obj) {
        Object obj2 = obj;
        if (obj2 instanceof Exception) {
            m91590a((AwemeSettings) null, ((Exception) obj2).getMessage());
            C41556av.m91389a().mo85340a(1, false);
            return;
        }
        C41556av.m91389a().mo85340a(1, true);
        if (obj2 instanceof C18082l) {
            AtomicReference atomicReference = new AtomicReference();
            AtomicReference atomicReference2 = new AtomicReference();
            AtomicReference atomicReference3 = new AtomicReference();
            AtomicReference atomicReference4 = new AtomicReference();
            AtomicReference atomicReference5 = new AtomicReference();
            AtomicReference atomicReference6 = new AtomicReference();
            C41716u uVar = new C41716u(this, obj, atomicReference3, atomicReference, atomicReference2, atomicReference4, atomicReference5, atomicReference6);
            C0013i a = C0013i.m18a((Callable<TResult>) uVar, (Executor) C24076h.m58902c());
            C41901v vVar = new C41901v(this, atomicReference4, atomicReference3, atomicReference, atomicReference5, atomicReference6, atomicReference2);
            a.mo20a((C0011g<TResult, TContinuationResult>) vVar, C0013i.f25b);
        }
    }

    /* renamed from: a */
    public final void mo85329a(int i, Context context) {
        super.mo85329a(i, context);
    }

    /* renamed from: a */
    private static void m91590a(AwemeSettings awemeSettings, String str) {
        C0013i.m18a((Callable<TResult>) new C41909x<TResult>(str, awemeSettings), (Executor) C26890h.m65003a());
    }

    /* renamed from: a */
    static final /* synthetic */ Object m91589a(String str, AwemeSettings awemeSettings) throws Exception {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("error_log", str);
            }
            boolean z = true;
            if (awemeSettings != null) {
                i = 0;
            } else {
                i = 1;
            }
            if (awemeSettings != null) {
                jSONObject.put("can_be_live_podcast", awemeSettings.canLive);
                jSONObject.put("cpu_is_x86", C45460w.m99064a());
                String str2 = "is_5.0_device";
                if (VERSION.SDK_INT < 21) {
                    z = false;
                }
                jSONObject.put(str2, z);
            }
            C23569o.m57776a("service_setting_log", i, jSONObject);
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public final void mo85307a(Editor editor, AwemeSettings awemeSettings) {
        if (awemeSettings != null) {
            C22282t.m55151f().edit().putInt("disable_age_gate", awemeSettings.disableAgeGate).apply();
            C22282t.m55151f().edit().putInt("ftc_age_enable", awemeSettings.enableFtcAgeGate).apply();
            SharePrefCache.inst().getDeviceInfoUrl().mo47776a(awemeSettings.deviceInfoUrl);
            C17971f fVar = new C17971f();
            SharePrefCache.inst().getHttpRetryInterval().mo47776a(Long.valueOf(awemeSettings.httpRetryInterval));
            SharePrefCache.inst().getHttpTimeOut().mo47776a(Long.valueOf(awemeSettings.httpTimeOut));
            SharePrefCache.inst().getVideoBitrate().mo47776a(Float.valueOf(awemeSettings.videoBitrate));
            if (awemeSettings.videoCompose > 0) {
                SharePrefCache.inst().getVideoCompose().mo47776a(Integer.valueOf(awemeSettings.videoCompose));
            }
            if (awemeSettings.videoCommit > 0) {
                SharePrefCache.inst().getVideoCommit().mo47776a(Integer.valueOf(awemeSettings.videoCommit));
            }
            C23183v.m56778a().mo47900K().mo47776a(Integer.valueOf(awemeSettings.isShowGifButton));
            SharePrefCache.inst().getWeakNetPreLoadSwitch().mo47776a(Integer.valueOf(awemeSettings.weakNetPreLoadSwitch));
            SharePrefCache.inst().getSyntheticVideoBitrate().mo47776a(Float.valueOf(awemeSettings.syntheticVideoBitrate));
            SharePrefCache.inst().getIsPrivateAvailable().mo47776a(Boolean.valueOf(awemeSettings.isPrivateAvailable));
            SharePrefCache.inst().getLongVideoPermitted().mo47776a(Boolean.valueOf(awemeSettings.longVideoPermitted));
            SharePrefCache.inst().getLongVideoThreshold().mo47776a(Long.valueOf(awemeSettings.longVideoThreshold));
            SharePrefCache.inst().getProgressbarThreshold().mo47776a(Long.valueOf(awemeSettings.progressBarThreshold));
            SharePrefCache.inst().getUserResidence().mo47776a(awemeSettings.regionOfResidence);
            SharePrefCache.inst().getUserCurrentRegion().mo47776a(awemeSettings.currentRegion);
            SharePrefCache.inst().getAdLandingPageConfig().mo47776a(fVar.mo34889b(awemeSettings.adLandingPageConfig));
            SharePrefCache.inst().getEnableBindItemCallOMSDK().mo47776a(Integer.valueOf(awemeSettings.enableBindItemCallOMSDK));
            SharePrefCache.inst().getDownloadSdkConfig().mo47776a(fVar.mo34889b(awemeSettings.downloadSdkConfig));
            SharePrefCache.inst().getFollowUserThreshold().mo47776a(Integer.valueOf(awemeSettings.followPopularThreshold));
            SharePrefCache.inst().setShowInvitedContactsFriends(Boolean.valueOf(awemeSettings.mShowInviteFriends));
            SharePrefCache.inst().getShowPromoteLicense().mo47776a(Integer.valueOf(awemeSettings.showPromoteLicense));
            SharePrefCache.inst().getIsEuropeCountry().mo47776a(Boolean.valueOf(awemeSettings.isEuropeCountry));
            SharePrefCache.inst().getUseLiveWallpaper().mo47776a(Integer.valueOf(awemeSettings.useLiveWallpaper));
            SharePrefCache.inst().getIsEnableLocalMusicEntrance().mo47776a(Boolean.valueOf(awemeSettings.enableLocalMusicEntrance));
            SharePrefCache.inst().getReferralEntrance().mo47776a(awemeSettings.referralProgramUrl);
            C23183v a = C23183v.m56778a();
            if (a.f61633o == null) {
                a.f61633o = new C23051bf<>("cookies_policy", "");
            }
            a.f61633o.mo47776a(awemeSettings.mGDPRCookiesUrl);
            C23183v a2 = C23183v.m56778a();
            if (a2.f61635q == null) {
                a2.f61635q = new C23051bf<>("privacy_policy", "");
            }
            a2.f61635q.mo47776a(awemeSettings.mGDPRPrivacyUrl);
            C23051bf C = C23183v.m56778a().mo47892C();
            boolean z = true;
            if (awemeSettings.commentSettingEnable != 1) {
                z = false;
            }
            C.mo47776a(Boolean.valueOf(z));
            C23183v.m56778a().mo47917m().mo47776a(Boolean.valueOf(awemeSettings.policyNoticeEnanble));
            if (awemeSettings.needChooseLanguages != null) {
                SharePrefCache.inst().getNeedChooseLanguages().mo47776a(fVar.mo34889b(awemeSettings.needChooseLanguages));
            } else {
                SharePrefCache.inst().getNeedChooseLanguages().mo47776a("");
            }
            C23183v a3 = C23183v.m56778a();
            if (a3.f61634p == null) {
                a3.f61634p = new C23052bg(String.class, "bind_fg_guide_texts", new ArrayList(0));
            }
            a3.f61634p.mo47776a(awemeSettings.bindFGGuideTexts);
            if (awemeSettings.globalTips != null) {
                C23542f.m57720e().mo48709b("place_holder", this.f105250d.search_tips);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo85556a(Object obj, AtomicReference atomicReference, AtomicReference atomicReference2, AtomicReference atomicReference3, AtomicReference atomicReference4, AtomicReference atomicReference5, AtomicReference atomicReference6) throws Exception {
        try {
            C18082l lVar = (C18082l) obj;
            atomicReference.set(SettingsManagerProxy.inst().getGson().mo34881a(lVar, IESSettings.class));
            atomicReference2.set(lVar.toString());
            atomicReference3.set(obj.toString());
        } catch (Throwable th) {
            atomicReference4.set(th);
        }
        try {
            if (this.f105573a == null) {
                this.f105573a = C47759cc.m103382a().getGson();
            }
            atomicReference5.set(this.f105573a.mo34881a((C18082l) obj, AwemeSettings.class));
        } catch (Throwable th2) {
            atomicReference6.set(th2);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo85557a(AtomicReference atomicReference, AtomicReference atomicReference2, AtomicReference atomicReference3, AtomicReference atomicReference4, AtomicReference atomicReference5, AtomicReference atomicReference6, C0013i iVar) throws Exception {
        long currentTimeMillis = System.currentTimeMillis();
        if (C10181b.m20511a().mo18172a(AsyncSettingsExperiment.class, true, "is_async_setting", 31744, true)) {
            C0013i.m18a((Callable<TResult>) new C41910y<TResult>(atomicReference, atomicReference2, atomicReference3), (Executor) C24076h.m58902c());
        } else {
            SettingsManagerProxy.inst().notifySettingsChange((Throwable) atomicReference.get(), (IESSettings) atomicReference2.get(), (String) atomicReference3.get());
        }
        AwemeSettings awemeSettings = (AwemeSettings) atomicReference4.get();
        if (atomicReference5.get() != null) {
            SettingsUtil.m75695a((Throwable) atomicReference5.get());
            SettingsUtil.m75696a((Throwable) atomicReference5.get(), "I18nSettingManager", (String) atomicReference6.get());
            return null;
        }
        SettingsUtil.m75696a((Throwable) null, "I18nSettingManager", (String) atomicReference6.get());
        if (awemeSettings == null) {
            return null;
        }
        if (C10181b.m20511a().mo18172a(AsyncSettingsExperiment.class, true, "is_async_setting", 31744, true)) {
            C0013i.m18a((Callable<TResult>) new C41911z<TResult>(this, awemeSettings), (Executor) C24076h.m58902c());
        } else {
            mo85332a(awemeSettings);
            C47718bf.m103288a(new C36622e());
        }
        if (awemeSettings.globalTips != null) {
            this.f105250d = awemeSettings.globalTips;
        }
        C0013i.m18a((Callable<TResult>) new C41908w<TResult>(System.currentTimeMillis() - currentTimeMillis), (Executor) C26890h.m65003a());
        return null;
    }
}
