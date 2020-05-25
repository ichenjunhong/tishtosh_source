package com.p683ss.android.ugc.aweme.crossplatform.platform;

import com.p683ss.android.ugc.aweme.app.C23131p;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.a */
public final class C27202a {

    /* renamed from: a */
    public static final C27202a f71828a = new C27202a();

    private C27202a() {
    }

    /* renamed from: a */
    public static final void m65622a(String str, boolean z, boolean z2) {
        String str2 = "h5_block_app_url";
        JSONObject put = new JSONObject().put("jump_url", str).put("jump_has_click", z).put("jump_block_by", "blocked");
        if (z2) {
            put.put("container_type", "bullet");
        }
        C23131p.m57776a(str2, 0, put);
    }

    /* renamed from: b */
    public static final void m65623b(String str, boolean z, boolean z2) {
        String str2 = "h5_block_app_url";
        JSONObject put = new JSONObject().put("jump_url", str).put("jump_has_click", z).put("jump_block_by", "apk_download");
        if (z2) {
            put.put("container_type", "bullet");
        }
        C23131p.m57776a(str2, 0, put);
    }

    /* renamed from: c */
    public static final void m65624c(String str, boolean z, boolean z2) {
        String str2 = "h5_block_app_url";
        JSONObject put = new JSONObject().put("jump_url", str).put("jump_has_click", z);
        if (z2) {
            put.put("container_type", "bullet");
        }
        C23131p.m57776a(str2, 1, put);
    }
}
