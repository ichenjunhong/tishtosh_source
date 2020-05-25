package com.p683ss.android.ugc.aweme.app.download.p1374a;

import com.p683ss.android.ugc.aweme.app.C23060d;
import java.util.LinkedList;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.download.a.a */
public final class C23076a {

    /* renamed from: a */
    public String f61456a;

    /* renamed from: b */
    public String f61457b;

    /* renamed from: c */
    public String f61458c;

    /* renamed from: d */
    public String f61459d;

    /* renamed from: e */
    public String f61460e;

    /* renamed from: f */
    public String f61461f;

    /* renamed from: g */
    public JSONObject f61462g;

    /* renamed from: h */
    public boolean f61463h;

    /* renamed from: i */
    public String f61464i;

    /* renamed from: j */
    public String f61465j;

    /* renamed from: k */
    public boolean f61466k;

    /* renamed from: l */
    public String f61467l;

    /* renamed from: m */
    public String f61468m;

    /* renamed from: n */
    public int f61469n;

    /* renamed from: o */
    public String f61470o;

    /* renamed from: p */
    public String f61471p;

    /* renamed from: q */
    public int f61472q;

    /* renamed from: r */
    public boolean f61473r;

    /* renamed from: s */
    public boolean f61474s;

    /* renamed from: t */
    public int f61475t;

    /* renamed from: u */
    public List<String> f61476u = new LinkedList();

    /* renamed from: v */
    private String f61477v;

    /* renamed from: a */
    public final void mo47812a(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        boolean z3;
        Object obj;
        if (jSONObject != null) {
            this.f61456a = jSONObject.optString("id", null);
            this.f61457b = jSONObject.optString("source", null);
            this.f61458c = jSONObject.optString("card_type", null);
            this.f61459d = jSONObject.optString("pkg_name", null);
            this.f61460e = jSONObject.optString(LeakCanaryFileProvider.f132049i, null);
            this.f61461f = jSONObject.optString("download_url", null);
            boolean z4 = true;
            if (jSONObject.optInt("is_ad", 0) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f61463h = z;
            this.f61477v = jSONObject.optString("log_extra", null);
            this.f61464i = jSONObject.optString("event_tag", "game_room_app_ad");
            this.f61465j = jSONObject.optString("event_refer", null);
            this.f61462g = jSONObject.optJSONObject("extra");
            if (jSONObject.optInt("support_multiple", 0) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f61466k = z2;
            this.f61467l = jSONObject.optString("group_id", null);
            this.f61468m = jSONObject.optString("quick_app_url", "");
            this.f61469n = jSONObject.optInt("download_mode", 0);
            this.f61470o = jSONObject.optString(C23060d.f61428b, null);
            this.f61471p = jSONObject.optString("source_avatar", null);
            this.f61472q = jSONObject.optInt("auto_open", 0);
            if (jSONObject.optInt("is_landing_page_ad", 0) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f61473r = z3;
            if (jSONObject.optInt("disable_download_dialog", 1) != 1) {
                z4 = false;
            }
            this.f61474s = z4;
            this.f61475t = jSONObject.optInt("download_scene", 0);
            JSONArray optJSONArray = jSONObject.optJSONArray("click_track_url_list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    try {
                        obj = optJSONArray.get(i);
                    } catch (Exception unused) {
                        obj = null;
                    }
                    if (obj instanceof String) {
                        this.f61476u.add((String) obj);
                    }
                }
            }
        }
    }
}
