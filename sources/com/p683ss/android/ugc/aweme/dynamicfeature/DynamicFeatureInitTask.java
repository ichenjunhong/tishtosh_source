package com.p683ss.android.ugc.aweme.dynamicfeature;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.common.utility.p523c.C9393e;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.p763l.C12152c;
import com.bytedance.p763l.p764a.C12140c;
import com.bytedance.p763l.p765b.C12150a;
import com.google.android.play.core.p1053e.C17338d;
import com.google.android.play.core.p1053e.C17339e;
import com.google.android.play.core.p1053e.p1055b.C17332b;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.dfbase.C27558m;
import com.p683ss.android.ugc.aweme.dfbase.p1629a.C27533a;
import com.p683ss.android.ugc.aweme.dynamicfeature.abmock.DFAggressiveDownloadExperiment;
import com.p683ss.android.ugc.aweme.dynamicfeature.abmock.DynamicFeatureFakeInstall;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.dynamicfeature.DynamicFeatureInitTask */
public class DynamicFeatureInitTask implements LegoTask {
    private List<String> livePlugins = Arrays.asList(new String[]{"df_live_byte_link", "df_live_zego_link", "df_live_quic", "df_live_cmaf"});
    private volatile Context mContext;
    private volatile SharedPreferences mSp;
    private volatile C17338d manager;

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    private void upLoadLivePluginStatus() {
        int i;
        if (this.mContext != null) {
            if (this.mSp == null) {
                this.mSp = C35807d.m80935a(this.mContext, "google_play_plugin_status", 0);
            }
            if (this.manager == null) {
                this.manager = C17339e.m42458a(this.mContext);
            }
            Set b = this.manager.mo33621b();
            for (String str : this.livePlugins) {
                boolean contains = b.contains(str);
                String string = this.mSp.getString(str, "");
                if (contains) {
                    i = 3;
                    if (TextUtils.equals("stage_installed", string)) {
                        i = 1;
                    } else if (TextUtils.equals("stage_start_install", string)) {
                        i = 2;
                    }
                } else if (TextUtils.equals("stage_start_install", string)) {
                    i = 4;
                } else {
                    i = 0;
                }
                JSONObject jSONObject = new JSONObject();
                safePutString(jSONObject, "plugin_name", str);
                safePutInt(jSONObject, "plugin_status", i);
                monitor("ttlive_plugin_installed_all", jSONObject);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$run$0$DynamicFeatureInitTask() {
        Map c = C12152c.m24597c();
        if (c != null) {
            try {
                for (C12150a aVar : c.values()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(LeakCanaryFileProvider.f132049i, C27558m.m66227b(aVar.f32069a));
                    if (aVar.f32071c == 5) {
                        jSONObject.put("is_installed", true);
                    } else {
                        jSONObject.put("is_installed", false);
                    }
                    C26890h.m65014b("df_installed_modules", jSONObject);
                    C23569o.m57776a("df_installed_modules", 0, jSONObject);
                }
            } catch (Exception unused) {
            }
        }
        upLoadLivePluginStatus();
        if (C27533a.f72383d) {
            C27558m.m66229c();
        }
    }

    private JSONObject generateFinalExtra(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", "ttlive_sdk");
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
            }
        } catch (Exception unused) {
        }
        return jSONObject2;
    }

    public void run(Context context) {
        if (VERSION.SDK_INT >= 21) {
            this.mContext = context.getApplicationContext();
            if (C10193n.m20607a().mo18204a(DynamicFeatureFakeInstall.class, "dynamic_feature_fake_install", C10181b.m20511a().mo18175c().getDynamicFeatureFakeInstall(), false)) {
                Context context2 = this.mContext;
                C12140c.m24571b().f32055c = C17332b.m42444a(context2, new File(context2.getExternalFilesDir(null), "fake_splits"));
                C12140c.m24571b().f32055c.mo33618a(C12140c.m24571b().f32054b);
            }
            if (C10181b.m20511a().mo18172a(DFAggressiveDownloadExperiment.class, true, "df_aggressive_download_mode", 31744, false)) {
                C27533a.f72383d = true;
            }
            C9393e.submitRunnable(new C29075c(this));
        }
    }

    private void monitor(String str, JSONObject jSONObject) {
        C23569o.m57780a(str, (JSONObject) null, generateFinalExtra(jSONObject));
    }

    private void safePutInt(JSONObject jSONObject, String str, int i) {
        try {
            jSONObject.put(str, i);
        } catch (Exception unused) {
        }
    }

    private void safePutString(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (Exception unused) {
        }
    }
}
