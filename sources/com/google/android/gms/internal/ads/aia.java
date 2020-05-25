package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
public final class aia {

    /* renamed from: a */
    public final boolean f40552a;

    /* renamed from: b */
    public final int f40553b;

    /* renamed from: c */
    public final int f40554c;

    /* renamed from: d */
    public final int f40555d;

    /* renamed from: e */
    public final String f40556e;

    /* renamed from: f */
    public final int f40557f;

    /* renamed from: g */
    public final int f40558g;

    /* renamed from: h */
    public final int f40559h;

    /* renamed from: i */
    public final int f40560i;

    /* renamed from: j */
    public final boolean f40561j;

    public aia(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f40552a = m32960a(jSONObject, "aggressive_media_codec_release", C15740bx.f44191E);
        this.f40553b = m32962b(jSONObject, "byte_buffer_precache_limit", C15740bx.f44485o);
        this.f40554c = m32962b(jSONObject, "exo_cache_buffer_size", C15740bx.f44489s);
        this.f40555d = m32962b(jSONObject, "exo_connect_timeout_millis", C15740bx.f44481k);
        this.f40556e = m32963c(jSONObject, "exo_player_version", C15740bx.f44480j);
        this.f40557f = m32962b(jSONObject, "exo_read_timeout_millis", C15740bx.f44482l);
        this.f40558g = m32962b(jSONObject, "load_check_interval_bytes", C15740bx.f44483m);
        this.f40559h = m32962b(jSONObject, "player_precache_limit", C15740bx.f44484n);
        this.f40560i = m32962b(jSONObject, "socket_receive_buffer_size", C15740bx.f44486p);
        this.f40561j = m32960a(jSONObject, "use_cache_data_source", C15740bx.f44358cm);
    }

    /* renamed from: a */
    private static boolean m32960a(JSONObject jSONObject, String str, C15726bl<Boolean> blVar) {
        return m32961a(jSONObject, str, ((Boolean) caf.m37099d().mo30717a(blVar)).booleanValue());
    }

    /* renamed from: a */
    private static boolean m32961a(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return z;
    }

    /* renamed from: b */
    private static int m32962b(JSONObject jSONObject, String str, C15726bl<Integer> blVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) caf.m37099d().mo30717a(blVar)).intValue();
    }

    /* renamed from: c */
    private static String m32963c(JSONObject jSONObject, String str, C15726bl<String> blVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getString(str);
            } catch (JSONException unused) {
            }
        }
        return (String) caf.m37099d().mo30717a(blVar);
    }
}
