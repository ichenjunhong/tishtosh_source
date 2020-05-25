package com.p683ss.android.ugc.aweme.live.livehostimpl;

import android.content.Context;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.android.livesdkapi.host.IHostPlugin.C8768a;
import com.bytedance.android.livesdkapi.p456j.C8828a;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.bytedance.p723j.C11511a;
import com.p683ss.android.ugc.aweme.live.C36148r;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.m */
public final class C36122m implements IHostPlugin {
    public final void check(Context context, C8828a aVar, String str, C8768a aVar2) {
    }

    public final boolean checkPluginInstalled(String str) {
        return true;
    }

    public final String getHostModeFilePath() {
        return null;
    }

    public final String getHostPackageName() {
        return null;
    }

    public final int getPluginAttributeMinVersion(String str) {
        return 0;
    }

    public final void preload(String str) {
    }

    public C36122m() {
        C4116c.m10251a(IHostPlugin.class, this);
    }

    public final boolean isFull() {
        return C36148r.m81573a().isFull();
    }

    public final boolean loadLibrary(int i, Context context, String str, String str2, ClassLoader classLoader) {
        JSONObject jSONObject;
        try {
            C11511a.m23578a(str2);
            return true;
        } catch (Throwable unused) {
        }
        C9951d.m19996a("plugin_bug_track", 1, jSONObject);
        return false;
    }
}
