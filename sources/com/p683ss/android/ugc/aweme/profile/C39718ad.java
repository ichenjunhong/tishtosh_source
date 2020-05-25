package com.p683ss.android.ugc.aweme.profile;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.ad */
public final class C39718ad {

    /* renamed from: a */
    public String f101356a;

    /* renamed from: b */
    public String f101357b;

    /* renamed from: c */
    public String f101358c;

    /* renamed from: d */
    public String f101359d;

    /* renamed from: e */
    public String f101360e;

    /* renamed from: f */
    public boolean f101361f;

    /* renamed from: g */
    public String f101362g;

    /* renamed from: h */
    public String f101363h;

    /* renamed from: i */
    public int f101364i;

    /* renamed from: j */
    public String f101365j;

    /* renamed from: k */
    public String f101366k;

    /* renamed from: l */
    public String f101367l;

    /* renamed from: m */
    public String f101368m;

    /* renamed from: n */
    public String f101369n;

    /* renamed from: o */
    public String f101370o;

    /* renamed from: p */
    private boolean f101371p;

    /* renamed from: q */
    private int f101372q = -1;

    /* renamed from: a */
    public final Map<String, String> mo80822a() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.f101356a)) {
            hashMap.put("nickname", this.f101356a);
        }
        if (this.f101357b != null) {
            hashMap.put("signature", this.f101357b);
        }
        if (!TextUtils.isEmpty(this.f101358c)) {
            hashMap.put("unique_id", this.f101358c);
        }
        if (!TextUtils.isEmpty(this.f101359d)) {
            hashMap.put("avatar_uri", this.f101359d);
        }
        if (this.f101371p) {
            hashMap.put("video_icon_virtual_URI", "");
        } else if (!TextUtils.isEmpty(this.f101360e)) {
            hashMap.put("video_icon_virtual_URI", this.f101360e);
        }
        if (!TextUtils.isEmpty(this.f101362g)) {
            hashMap.put("school_name", this.f101362g);
        }
        if (!TextUtils.isEmpty(this.f101363h)) {
            hashMap.put("poi_id", this.f101363h);
        }
        hashMap.put("school_type", String.valueOf(this.f101364i));
        if (!TextUtils.isEmpty(this.f101365j)) {
            hashMap.put("ins_id", this.f101365j);
        }
        if (!TextUtils.isEmpty(this.f101366k)) {
            hashMap.put("google_account", this.f101366k);
        }
        if (!TextUtils.isEmpty(this.f101367l)) {
            hashMap.put("youtube_channel_id", this.f101367l);
        }
        if (!TextUtils.isEmpty(this.f101368m)) {
            hashMap.put("youtube_channel_title", this.f101368m);
        }
        hashMap.put("is_binded_weibo", String.valueOf(this.f101361f ? 1 : 0));
        if (this.f101372q != -1) {
            hashMap.put("secret", String.valueOf(this.f101372q));
        }
        if (this.f101369n != null) {
            hashMap.put("bio_url", this.f101369n);
        }
        if (this.f101370o != null) {
            hashMap.put("bio_email", this.f101370o);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo80823a(String str) {
        this.f101371p = TextUtils.isEmpty(str);
        this.f101360e = str;
    }
}
