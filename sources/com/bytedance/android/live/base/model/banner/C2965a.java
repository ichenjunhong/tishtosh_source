package com.bytedance.android.live.base.model.banner;

import com.bytedance.android.live.base.model.C2973f;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.common.utility.C9431p;
import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.bytedance.android.live.base.model.banner.a */
public class C2965a implements C2973f {
    @C17952c(mo34828a = "id")

    /* renamed from: a */
    public long f8673a;
    @C17952c(mo34828a = "title")

    /* renamed from: b */
    public String f8674b;
    @C17952c(mo34828a = "url_list")

    /* renamed from: c */
    public List<String> f8675c;
    @C17952c(mo34828a = "uri")

    /* renamed from: d */
    public String f8676d;
    @C17952c(mo34828a = "height")

    /* renamed from: e */
    public int f8677e;
    @C17952c(mo34828a = "width")

    /* renamed from: f */
    public int f8678f;
    @C17952c(mo34828a = "schema_url")

    /* renamed from: g */
    public String f8679g;
    @C17952c(mo34828a = "text")

    /* renamed from: h */
    public String f8680h;
    @C17952c(mo34828a = "action_type")

    /* renamed from: i */
    public int f8681i;
    @C17952c(mo34828a = "priority")

    /* renamed from: j */
    public int f8682j;
    @C17952c(mo34828a = "extra")

    /* renamed from: k */
    String f8683k;
    @C17952c(mo34828a = "avg_color")

    /* renamed from: l */
    public String f8684l;
    @C17952c(mo34828a = "banner_type")

    /* renamed from: m */
    public int f8685m;

    /* renamed from: n */
    private ImageModel f8686n;

    public long getId() {
        return this.f8673a;
    }

    public String getMixId() {
        return String.valueOf(getId());
    }

    /* renamed from: a */
    public final ImageModel mo7671a() {
        if (!(this.f8686n != null || this.f8675c == null || this.f8676d == null)) {
            this.f8686n = new ImageModel(this.f8676d, this.f8675c);
        }
        return this.f8686n;
    }

    /* renamed from: a */
    public final boolean mo7672a(C2965a aVar) {
        if (this == aVar) {
            return true;
        }
        if (aVar == null || this.f8673a != aVar.f8673a || !C9431p.m18665a(this.f8674b, aVar.f8674b) || !C9431p.m18665a(this.f8676d, aVar.f8676d) || !C9431p.m18665a(this.f8679g, aVar.f8679g) || !C9431p.m18665a(this.f8680h, aVar.f8680h) || this.f8678f != aVar.f8678f || this.f8677e != aVar.f8677e) {
            return false;
        }
        if (this.f8675c == null && aVar.f8675c != null) {
            return false;
        }
        if (this.f8675c != null && aVar.f8675c == null) {
            return false;
        }
        if (this.f8675c == null && aVar.f8675c == null) {
            return true;
        }
        if (this.f8675c.size() != aVar.f8675c.size() || this.f8681i != aVar.f8681i || this.f8682j != aVar.f8682j) {
            return false;
        }
        for (int i = 0; i < this.f8675c.size(); i++) {
            if (!C9431p.m18665a((String) this.f8675c.get(i), (String) aVar.f8675c.get(i))) {
                return false;
            }
        }
        if (!C9431p.m18665a(this.f8683k, aVar.f8683k)) {
            return false;
        }
        return true;
    }
}
