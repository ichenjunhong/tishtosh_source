package com.bytedance.android.livesdkapi.depend.model.live;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.C2973f;
import com.google.gson.p1076a.C17952c;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.l */
public class C8706l implements C2973f {
    @C17952c(mo34828a = "title")

    /* renamed from: A */
    public String f23848A;
    @C17952c(mo34828a = "label")

    /* renamed from: B */
    public String f23849B;
    @C17952c(mo34828a = "display_type")

    /* renamed from: C */
    public int f23850C;
    @C17952c(mo34828a = "play_track_url_list")

    /* renamed from: D */
    public List<String> f23851D;
    @C17952c(mo34828a = "playover_track_url_list")

    /* renamed from: E */
    public List<String> f23852E;
    @C17952c(mo34828a = "effective_play_track_url_list")

    /* renamed from: F */
    public List<String> f23853F;
    @C17952c(mo34828a = "effective_play_time")

    /* renamed from: G */
    public int f23854G;
    @C17952c(mo34828a = "use_compound_land_page")

    /* renamed from: H */
    public boolean f23855H;

    /* renamed from: I */
    public String f23856I;

    /* renamed from: J */
    public String f23857J;

    /* renamed from: K */
    public long f23858K;
    @C17952c(mo34828a = "id")

    /* renamed from: a */
    public long f23859a;
    @C17952c(mo34828a = "type")

    /* renamed from: b */
    public String f23860b;
    @C17952c(mo34828a = "log_extra")

    /* renamed from: c */
    public String f23861c;
    @C17952c(mo34828a = "image_list")

    /* renamed from: d */
    public List<C8708b> f23862d;
    @C17952c(mo34828a = "author")

    /* renamed from: e */
    public C8707a f23863e;
    @C17952c(mo34828a = "open_url")

    /* renamed from: f */
    public String f23864f;
    @C17952c(mo34828a = "web_url")

    /* renamed from: g */
    public String f23865g;
    @C17952c(mo34828a = "web_title")

    /* renamed from: h */
    public String f23866h;
    @C17952c(mo34828a = "appleid")

    /* renamed from: i */
    public String f23867i;
    @C17952c(mo34828a = "package")

    /* renamed from: j */
    public String f23868j;
    @C17952c(mo34828a = "app_name")

    /* renamed from: k */
    public String f23869k;
    @C17952c(mo34828a = "download_url")

    /* renamed from: l */
    public String f23870l;
    @C17952c(mo34828a = "hide_if_exists")

    /* renamed from: m */
    public int f23871m;
    @C17952c(mo34828a = "auto_open")

    /* renamed from: n */
    public int f23872n;
    @C17952c(mo34828a = "button_text")

    /* renamed from: o */
    public String f23873o;
    @C17952c(mo34828a = "track_url_list")

    /* renamed from: p */
    public List<String> f23874p;
    @C17952c(mo34828a = "click_track_url_list")

    /* renamed from: q */
    public List<String> f23875q;
    @C17952c(mo34828a = "allow_comment")

    /* renamed from: r */
    public boolean f23876r;
    @C17952c(mo34828a = "allow_dislike")

    /* renamed from: s */
    public boolean f23877s;
    @C17952c(mo34828a = "allow_share")

    /* renamed from: t */
    public boolean f23878t;
    @C17952c(mo34828a = "digg_count")

    /* renamed from: u */
    public long f23879u;
    @C17952c(mo34828a = "video_info")

    /* renamed from: v */
    public C8709c f23880v;
    @C17952c(mo34828a = "filter_words")

    /* renamed from: w */
    public List<Object> f23881w;
    @C17952c(mo34828a = "show_button_seconds")

    /* renamed from: x */
    public int f23882x;
    @C17952c(mo34828a = "learn_more_bg_color")

    /* renamed from: y */
    public String f23883y;
    @C17952c(mo34828a = "show_mask_times")

    /* renamed from: z */
    public int f23884z;

    /* renamed from: com.bytedance.android.livesdkapi.depend.model.live.l$a */
    public static class C8707a {
        @C17952c(mo34828a = "nickname")

        /* renamed from: a */
        public String f23885a;
        @C17952c(mo34828a = "avatar")

        /* renamed from: b */
        public C8708b f23886b;
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.model.live.l$b */
    public static class C8708b {
        @C17952c(mo34828a = "width")

        /* renamed from: a */
        public int f23887a;
        @C17952c(mo34828a = "height")

        /* renamed from: b */
        public int f23888b;
        @C17952c(mo34828a = "url_list")

        /* renamed from: c */
        public List<String> f23889c;
        @C17952c(mo34828a = "uri")

        /* renamed from: d */
        public String f23890d;
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.model.live.l$c */
    public static class C8709c {
        @C17952c(mo34828a = "video_duration")

        /* renamed from: a */
        public int f23891a;
        @C17952c(mo34828a = "video_transpose")

        /* renamed from: b */
        public int f23892b;
        @C17952c(mo34828a = "thumb_width")

        /* renamed from: c */
        public int f23893c;
        @C17952c(mo34828a = "thumb_height")

        /* renamed from: d */
        public int f23894d;
        @C17952c(mo34828a = "url_list")

        /* renamed from: e */
        public List<String> f23895e;
        @C17952c(mo34828a = "video_id")

        /* renamed from: f */
        public String f23896f;
    }

    public long getId() {
        return this.f23859a;
    }

    public String getMixId() {
        return String.valueOf(this.f23859a);
    }

    /* renamed from: a */
    public final JSONObject mo15387a() {
        return mo15388a("", 0);
    }

    /* renamed from: a */
    public final String mo15386a(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.f23859a));
        sb.append("_");
        sb.append(String.valueOf(this.f23858K));
        sb.append("_");
        sb.append(String.valueOf(i));
        return sb.toString();
    }

    /* renamed from: a */
    public final JSONObject mo15388a(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_ad_event", 1);
            jSONObject.put("log_extra", this.f23861c);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("refer", str);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
