package com.p683ss.android.p1103ad.splash.core.p1114c;

import com.p683ss.android.p1103ad.splash.p1123g.C18740f;
import com.p683ss.android.p1103ad.splash.p1123g.C18747l;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.c.n */
public final class C18617n {

    /* renamed from: a */
    public List<String> f51402a;

    /* renamed from: b */
    public List<String> f51403b;

    /* renamed from: c */
    public List<String> f51404c;

    /* renamed from: d */
    public String f51405d;

    /* renamed from: e */
    public long f51406e;

    /* renamed from: f */
    public boolean f51407f;

    /* renamed from: g */
    public int f51408g;

    /* renamed from: h */
    public int f51409h;

    /* renamed from: a */
    public final boolean mo38019a() {
        if (C18747l.m45742a(this.f51405d) || this.f51408g <= 0 || C18740f.m45691a(this.f51404c) || C18747l.m45742a((String) this.f51404c.get(0))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo38018a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("play_track_url_list");
        if (!(optJSONArray == null || optJSONArray.length() == 0)) {
            this.f51402a = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    this.f51402a.add(optJSONArray.getString(i));
                } catch (JSONException unused) {
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("playover_track_url_list");
        if (!(optJSONArray2 == null || optJSONArray2.length() == 0)) {
            this.f51403b = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                try {
                    this.f51403b.add(optJSONArray2.getString(i2));
                } catch (Exception unused2) {
                }
            }
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("video_url_list");
        if (!(optJSONArray3 == null || optJSONArray3.length() == 0)) {
            this.f51404c = new ArrayList();
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                try {
                    this.f51404c.add(optJSONArray3.getString(i3));
                } catch (Exception unused3) {
                }
            }
        }
        this.f51405d = jSONObject.optString("video_id");
        this.f51406e = jSONObject.optLong("video_group_id");
        this.f51407f = jSONObject.optBoolean("voice_switch");
        String optString = jSONObject.optString("video_density");
        int indexOf = optString.indexOf("x");
        if (indexOf >= 0) {
            int i4 = indexOf + 1;
            if (i4 < optString.length()) {
                this.f51409h = Integer.parseInt(optString.substring(0, indexOf));
                this.f51408g = Integer.parseInt(optString.substring(i4));
            }
        }
    }
}
