package com.bytedance.android.live.broadcast.effect.sticker;

import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.livesdk.p399o.p400a.C8029a;
import com.bytedance.android.livesdk.p399o.p400a.C8030b;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.d */
public final class C3285d extends C3286e {
    /* renamed from: a */
    public final void mo8653a() {
        C3837e.m9742a("ttlive_load_sticker_list_all", 0, mo8658d(), new JSONObject());
    }

    /* renamed from: b */
    public final void mo8655b() {
        C3837e.m9742a("ttlive_download_sticker_all", 0, mo8660f(), new JSONObject());
    }

    /* renamed from: a */
    public final void mo8654a(int i, String str) {
        mo8658d();
        JSONObject jSONObject = new JSONObject();
        m9730a(jSONObject, "error_code", (long) i);
        m9731a(jSONObject, "error_msg", str);
        C3837e.m9749b("ttlive_load_sticker_list_all", 1, jSONObject);
        C3837e.m9744a("ttlive_load_sticker_list_error", 1, jSONObject);
        C8029a.m15933a().mo14190a(C8030b.Room.info, "ttlive_load_sticker_list", 1, jSONObject);
    }

    /* renamed from: b */
    public final void mo8656b(int i, String str) {
        mo8660f();
        JSONObject jSONObject = new JSONObject();
        m9730a(jSONObject, "error_code", (long) i);
        m9731a(jSONObject, "error_msg", str);
        C3837e.m9749b("ttlive_download_sticker_all", 1, jSONObject);
        C3837e.m9744a("ttlive_download_sticker_error", 1, jSONObject);
        C8029a.m15933a().mo14190a(C8030b.Room.info, "ttlive_download_sticker", 1, jSONObject);
    }
}
