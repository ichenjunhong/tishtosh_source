package com.bytedance.android.livesdkapi.depend.model.live;

import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData.Quality;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.google.gson.p1076a.C17952c;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StreamUrl {
    @C17952c(mo34828a = "id")

    /* renamed from: a */
    public long f23773a;
    @C17952c(mo34828a = "id_str")

    /* renamed from: b */
    public String f23774b;
    @C17952c(mo34828a = "provider")

    /* renamed from: c */
    public int f23775c;
    @C17952c(mo34828a = "rtmp_push_url")

    /* renamed from: d */
    public String f23776d;
    @C17952c(mo34828a = "push_urls")

    /* renamed from: e */
    public List<String> f23777e;
    @C17952c(mo34828a = "rtmp_pull_url")

    /* renamed from: f */
    public String f23778f;
    @C17952c(mo34828a = "flv_pull_url")

    /* renamed from: g */
    public Map<String, String> f23779g;
    @C17952c(mo34828a = "resolution_name")

    /* renamed from: h */
    public Map<String, String> f23780h;
    @C17952c(mo34828a = "flv_pull_url_params")

    /* renamed from: i */
    Map<String, String> f23781i;
    @C17952c(mo34828a = "candidate_resolution")

    /* renamed from: j */
    public List<String> f23782j;
    @C17952c(mo34828a = "default_resolution")

    /* renamed from: k */
    public String f23783k;
    @C17952c(mo34828a = "extra")

    /* renamed from: l */
    public C8725y f23784l;
    @C17952c(mo34828a = "rtmp_pull_url_params")

    /* renamed from: m */
    String f23785m;
    @C17952c(mo34828a = "rtmp_push_url_params")

    /* renamed from: n */
    public String f23786n;
    @C17952c(mo34828a = "live_core_sdk_data")

    /* renamed from: o */
    public LiveCoreSDKData f23787o;

    /* renamed from: p */
    public String f23788p;

    /* renamed from: q */
    public String f23789q;
    public final LinkedList<Quality> qualityList = new LinkedList<>();
    final LinkedHashMap<String, String> qualityMap = new LinkedHashMap<>();

    /* renamed from: r */
    public String f23790r = null;

    /* renamed from: s */
    public String f23791s = null;
    final LinkedHashMap<String, String> sdkParamsMap = new LinkedHashMap<>();

    /* renamed from: t */
    Quality f23792t = null;

    /* renamed from: u */
    public Quality f23793u = null;

    /* renamed from: d */
    public final Set<String> mo15384d() {
        return this.qualityMap.keySet();
    }

    /* renamed from: a */
    public final String mo15381a() {
        if (C9431p.m18664a(this.f23788p)) {
            return this.f23776d;
        }
        return this.f23788p;
    }

    /* renamed from: e */
    public final String mo15385e() {
        if (this.f23792t == null) {
            return "";
        }
        return this.f23792t.name;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo15383c() {
        this.f23792t = null;
        this.f23793u = null;
        this.qualityList.clear();
        if (this.f23787o != null) {
            if (!C9414h.m18630a(this.f23787o.getQualityList())) {
                for (Quality quality : this.f23787o.getQualityList()) {
                    this.qualityList.add(quality);
                    if (this.f23793u == null) {
                        this.f23793u = quality;
                    }
                }
            }
            this.f23792t = this.f23787o.getDefaultQuality();
            if (this.qualityList.isEmpty()) {
                this.f23793u = this.f23792t;
                this.qualityList.add(this.f23792t);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo15382b() {
        Object obj;
        this.qualityMap.clear();
        this.sdkParamsMap.clear();
        this.f23790r = null;
        this.f23791s = null;
        if (!(this.f23782j == null || this.f23780h == null || this.f23779g == null)) {
            for (String str : this.f23782j) {
                String str2 = (String) this.f23780h.get(str);
                if (str2 != null) {
                    String str3 = (String) this.f23779g.get(str);
                    if (str3 != null) {
                        if (this.f23781i == null) {
                            obj = null;
                        } else {
                            obj = (String) this.f23781i.get(str);
                        }
                        this.qualityMap.put(str2, str3);
                        this.sdkParamsMap.put(str2, obj);
                        if (str.equals(this.f23783k)) {
                            this.f23790r = str2;
                        } else if (this.f23790r == null) {
                            this.f23790r = str2;
                        }
                        if (this.f23791s == null) {
                            this.f23791s = str2;
                        }
                    }
                }
            }
        }
        if (this.qualityMap.isEmpty() && !TextUtils.isEmpty(this.f23778f)) {
            this.f23790r = "default";
            this.f23791s = this.f23790r;
            this.qualityMap.put(this.f23790r, this.f23778f);
            this.sdkParamsMap.put(this.f23790r, this.f23785m);
        }
    }
}
