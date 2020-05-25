package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.aweme.ttsetting.C11036a;
import com.bytedance.ies.ugc.aweme.ttsetting.C11043b;
import com.bytedance.ies.ugc.aweme.ttsetting.FetchTTSettingTask;
import com.p683ss.android.newmedia.C19561i;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.lego.C35857a.C35868f;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.services.IExternalService;
import com.p683ss.android.ugc.aweme.setting.AsyncSettingsExperiment;
import com.p683ss.android.ugc.aweme.setting.model.VerifyActionManager;
import com.p683ss.android.ugc.aweme.update.UpdateHelper;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.BaseInitServiceSettingTask */
public class BaseInitServiceSettingTask implements LegoTask {

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.BaseInitServiceSettingTask$a */
    public static final class C35933a implements C11043b {

        /* renamed from: a */
        final /* synthetic */ BaseInitServiceSettingTask f92162a;

        /* renamed from: com.ss.android.ugc.aweme.legoImp.task.BaseInitServiceSettingTask$a$a */
        static final class C35934a<V> implements Callable<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C35933a f92163a;

            /* renamed from: b */
            final /* synthetic */ JSONObject f92164b;

            C35934a(C35933a aVar, JSONObject jSONObject) {
                this.f92163a = aVar;
                this.f92164b = jSONObject;
            }

            public final /* synthetic */ Object call() {
                UpdateHelper a = UpdateHelper.m102902a();
                if (a != null) {
                    a.mo94794a(this.f92164b);
                }
                this.f92163a.f92162a.handleConfig(this.f92164b);
                return C52860x.f131107a;
            }
        }

        /* renamed from: a */
        public final void mo19949a(Throwable th) {
            C52711k.m112240b(th, "throwable");
        }

        C35933a(BaseInitServiceSettingTask baseInitServiceSettingTask) {
            this.f92162a = baseInitServiceSettingTask;
        }

        /* renamed from: a */
        public final void mo19950a(JSONObject jSONObject) {
            if (C10181b.m20511a().mo18172a(AsyncSettingsExperiment.class, true, "is_async_setting", 31744, true)) {
                C0013i.m18a((Callable<TResult>) new C35934a<TResult>(this, jSONObject), (Executor) C24076h.m58902c());
                return;
            }
            UpdateHelper a = UpdateHelper.m102902a();
            if (a != null) {
                a.mo94794a(jSONObject);
            }
            this.f92162a.handleConfig(jSONObject);
        }
    }

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    public void run(Context context) {
        C52711k.m112240b(context, "context");
        C35868f b = C35857a.m81001b();
        String str = Api.f61282b;
        C52711k.m112236a((Object) str, "Api.API_URL_PREFIX_SI");
        b.mo74526a(new FetchTTSettingTask(str)).mo74527a();
        C11036a.m22354a((C11043b) new C35933a(this));
    }

    /* access modifiers changed from: protected */
    public void handleConfig(JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("aweme_uniqueid_settings");
            VerifyActionManager.INSTANCE.saveVerifyAction(jSONObject.optJSONObject("user_badge_click_settings"));
            JSONObject optJSONObject2 = jSONObject.optJSONObject("aweme_music_ailab");
            IExternalService aVServiceImpl_Monster = AVExternalServiceImpl.getAVServiceImpl_Monster();
            if (optJSONObject2 != null) {
                aVServiceImpl_Monster.initService().initTask(2, optJSONObject2.toString());
            } else {
                aVServiceImpl_Monster.initService().initTask(2, "");
            }
            if (optJSONObject != null) {
                boolean z = true;
                if (optJSONObject.optInt("enable_push_deduplication", 1) <= 0) {
                    z = false;
                }
                C19561i.f53944a = z;
            }
        }
    }
}
