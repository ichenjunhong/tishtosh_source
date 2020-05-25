package com.p683ss.android.ugc.aweme.account.utils;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.utils.j */
public final class C22304j {

    /* renamed from: a */
    public String f60067a;

    /* renamed from: b */
    public String f60068b;

    /* renamed from: c */
    public String f60069c;

    /* renamed from: d */
    public String f60070d;

    /* renamed from: e */
    public String f60071e;

    /* renamed from: f */
    public boolean f60072f;

    /* renamed from: g */
    public String f60073g;

    /* renamed from: h */
    public String f60074h;

    /* renamed from: i */
    public int f60075i;

    /* renamed from: j */
    public String f60076j;

    /* renamed from: k */
    public String f60077k;

    /* renamed from: l */
    public String f60078l;

    /* renamed from: m */
    public String f60079m;

    /* renamed from: n */
    private boolean f60080n;

    /* renamed from: o */
    private int f60081o = -1;

    /* renamed from: a */
    public final Map<String, String> mo46385a() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.f60067a)) {
            hashMap.put("nickname", this.f60067a);
        }
        if (this.f60068b != null) {
            hashMap.put("signature", this.f60068b);
        }
        if (!TextUtils.isEmpty(this.f60069c)) {
            hashMap.put("unique_id", this.f60069c);
        }
        if (!TextUtils.isEmpty(this.f60070d)) {
            hashMap.put("avatar_uri", this.f60070d);
        }
        if (this.f60080n) {
            hashMap.put("video_icon_virtual_URI", "");
        } else if (!TextUtils.isEmpty(this.f60071e)) {
            hashMap.put("video_icon_virtual_URI", this.f60071e);
        }
        if (!TextUtils.isEmpty(this.f60073g)) {
            hashMap.put("school_name", this.f60073g);
        }
        if (!TextUtils.isEmpty(this.f60074h)) {
            hashMap.put("poi_id", this.f60074h);
        }
        hashMap.put("school_type", String.valueOf(this.f60075i));
        if (!TextUtils.isEmpty(this.f60076j)) {
            hashMap.put("ins_id", this.f60076j);
        }
        if (!TextUtils.isEmpty(this.f60077k)) {
            hashMap.put("google_account", this.f60077k);
        }
        if (!TextUtils.isEmpty(this.f60078l)) {
            hashMap.put("youtube_channel_id", this.f60078l);
        }
        if (!TextUtils.isEmpty(this.f60079m)) {
            hashMap.put("youtube_channel_title", this.f60079m);
        }
        hashMap.put("is_binded_weibo", String.valueOf(this.f60072f ? 1 : 0));
        if (this.f60081o != -1) {
            hashMap.put("secret", String.valueOf(this.f60081o));
        }
        return hashMap;
    }
}
