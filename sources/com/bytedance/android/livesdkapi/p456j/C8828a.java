package com.bytedance.android.livesdkapi.p456j;

import android.content.Context;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.android.livesdkapi.host.IHostPlugin.C8768a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdkapi.j.a */
public enum C8828a {
    LiveResource("live_engine", true, "com.ss.android.ies.live.liveresource") {
        public final void load(Context context, boolean z) {
            try {
                IHostPlugin iHostPlugin = (IHostPlugin) C4116c.m10249a(IHostPlugin.class);
                if (z) {
                    try {
                        iHostPlugin.loadLibrary(0, context, C8828a.LiveResource.getPackageName(), "lens", getClass().getClassLoader());
                    } catch (Throwable unused) {
                    }
                    try {
                        iHostPlugin.loadLibrary(0, context, C8828a.LiveResource.getPackageName(), "ttquic", getClass().getClassLoader());
                    } catch (Throwable unused2) {
                    }
                    iHostPlugin.loadLibrary(0, context, C8828a.LiveResource.getPackageName(), "avframework", getClass().getClassLoader());
                    iHostPlugin.loadLibrary(0, context, C8828a.LiveResource.getPackageName(), "ies_render", getClass().getClassLoader());
                    try {
                        iHostPlugin.loadLibrary(0, context, C8828a.LiveResource.getPackageName(), "agora-rtc-sdk-jni", getClass().getClassLoader());
                    } catch (Throwable unused3) {
                    }
                    try {
                        iHostPlugin.loadLibrary(0, context, C8828a.LiveResource.getPackageName(), "zegoliveroom", getClass().getClassLoader());
                    } catch (Throwable unused4) {
                    }
                    try {
                        iHostPlugin.loadLibrary(0, context, C8828a.LiveResource.getPackageName(), "bytertc", getClass().getClassLoader());
                    } catch (Throwable unused5) {
                    }
                }
            } catch (Throwable unused6) {
            }
        }
    },
    Camera("camera", true, "com.ss.android.ugc.live.liveshortvideo_so"),
    LiveSDK("live_sdk", true, "com.ss.android.ies.live.sdk"),
    Player("player", false, "com.ss.android.ugc.live.player"),
    XGPlayer("player", false, "com.ss.ttm"),
    LITE_PLAYER_CONTAINER("player", false, "com.bytedance.common.plugin.lite"),
    Live("liveplugin", false, "com.bytedance.android.liveplugin");
    

    /* renamed from: a */
    private final String f24106a;

    /* renamed from: b */
    private final String f24107b;

    /* renamed from: c */
    private final boolean f24108c;

    public String getPackageName() {
        return this.f24107b;
    }

    public String getType() {
        return this.f24106a;
    }

    public boolean isNeedPreload() {
        return this.f24108c;
    }

    public void load(Context context, boolean z) {
    }

    public void preload() {
        ((IHostPlugin) C4116c.m10249a(IHostPlugin.class)).preload(getPackageName());
    }

    public boolean isInstalled() {
        IHostPlugin iHostPlugin = (IHostPlugin) C4116c.m10249a(IHostPlugin.class);
        if (iHostPlugin.isFull() || iHostPlugin.checkPluginInstalled(getPackageName())) {
            return true;
        }
        return false;
    }

    public static JSONObject generateFinalExtra(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", "ttlive_sdk");
            jSONObject2.put("ttlive_sdk_version", "1510");
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
            }
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public void checkInstall(Context context, C8768a aVar) {
        checkInstall(context, "", aVar);
    }

    public void checkInstall(Context context, String str, C8768a aVar) {
        if (isInstalled()) {
            if (aVar != null) {
                aVar.mo8214a(getPackageName());
            }
            return;
        }
        ((IHostPlugin) C4116c.m10249a(IHostPlugin.class)).check(context, this, str, aVar);
    }

    private C8828a(String str, boolean z, String str2) {
        this.f24106a = str;
        this.f24108c = z;
        this.f24107b = str2;
    }
}
