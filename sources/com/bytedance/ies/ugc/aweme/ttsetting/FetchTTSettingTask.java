package com.bytedance.ies.ugc.aweme.ttsetting;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.ttsetting.C11036a.C11037a;
import com.bytedance.ies.ugc.aweme.ttsetting.TTSettingDataApi.SettingApi;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.TimeUnit;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;

public final class FetchTTSettingTask implements LegoTask {
    public static final C11035a Companion = new C11035a(null);
    private final String mHost;

    /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.FetchTTSettingTask$a */
    public static final class C11035a {
        private C11035a() {
        }

        public /* synthetic */ C11035a(C52707g gVar) {
            this();
        }
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public FetchTTSettingTask(String str) {
        C52711k.m112240b(str, "host");
        this.mHost = str;
    }

    public final void run(Context context) {
        C52711k.m112240b(context, "context");
        if (System.currentTimeMillis() - Keva.getRepo("TTSettingData").getLong("last_get_setting_time", 0) > TimeUnit.HOURS.toMillis(6)) {
            C11036a aVar = C11036a.f29642c;
            String str = this.mHost;
            C52711k.m112240b(str, "host");
            IRetrofit createNewRetrofit = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(str);
            C52727e eVar = new C52727e();
            eVar.element = "";
            ((SettingApi) createNewRetrofit.create(SettingApi.class)).getResponse(!TextUtils.isEmpty(Keva.getRepo("TTSettingData").getString("settingData", "")), 1, 1).enqueue(new C11037a(eVar));
            return;
        }
        C11036a.f29642c.mo19940a();
    }
}
