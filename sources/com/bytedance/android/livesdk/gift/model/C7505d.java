package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.p1076a.C17952c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.gift.model.d */
public final class C7505d {
    @C17952c(mo34828a = "noble_level")

    /* renamed from: A */
    public long f20532A;
    @C17952c(mo34828a = "item_type")

    /* renamed from: B */
    public int f20533B;
    @C17952c(mo34828a = "scheme_url")

    /* renamed from: C */
    public String f20534C;
    @C17952c(mo34828a = "gift_operation")

    /* renamed from: D */
    public GiftOperation f20535D;
    @C17952c(mo34828a = "event_name")

    /* renamed from: E */
    public String f20536E;
    @C17952c(mo34828a = "for_portal")

    /* renamed from: F */
    public boolean f20537F;
    @C17952c(mo34828a = "business_text")

    /* renamed from: G */
    public String f20538G;
    @C17952c(mo34828a = "cny_gift")

    /* renamed from: H */
    public boolean f20539H;
    @C17952c(mo34828a = "name")

    /* renamed from: a */
    public String f20540a;
    @C17952c(mo34828a = "image")

    /* renamed from: b */
    public ImageModel f20541b;
    @C17952c(mo34828a = "describe")

    /* renamed from: c */
    public String f20542c;
    @C17952c(mo34828a = "id")

    /* renamed from: d */
    public long f20543d;
    @C17952c(mo34828a = "type")

    /* renamed from: e */
    public int f20544e;
    @C17952c(mo34828a = "diamond_count")

    /* renamed from: f */
    public int f20545f;
    @C17952c(mo34828a = "combo")

    /* renamed from: g */
    public boolean f20546g;
    @C17952c(mo34828a = "subs")

    /* renamed from: h */
    public List<Object> f20547h = new ArrayList();
    @C17952c(mo34828a = "doodle")

    /* renamed from: i */
    public boolean f20548i;
    @C17952c(mo34828a = "duration")

    /* renamed from: j */
    public int f20549j;
    @C17952c(mo34828a = "for_linkmic")

    /* renamed from: k */
    public boolean f20550k = true;
    @C17952c(mo34828a = "nameColor")

    /* renamed from: l */
    public int f20551l = -1;
    @C17952c(mo34828a = "describeColor")

    /* renamed from: m */
    public int f20552m = -1711276033;
    @C17952c(mo34828a = "action_type")

    /* renamed from: n */
    public int f20553n;
    @C17952c(mo34828a = "watermelon_seeds")

    /* renamed from: o */
    public int f20554o;
    @C17952c(mo34828a = "gift_label_icon")

    /* renamed from: p */
    public ImageModel f20555p;
    @C17952c(mo34828a = "is_displayed_on_panel")

    /* renamed from: q */
    public boolean f20556q = true;
    @C17952c(mo34828a = "special_effects")

    /* renamed from: r */
    public Map<String, Integer> f20557r;
    @C17952c(mo34828a = "primary_effect_id")

    /* renamed from: s */
    public long f20558s;
    @C17952c(mo34828a = "manual")

    /* renamed from: t */
    public String f20559t;
    @C17952c(mo34828a = "guide_url")

    /* renamed from: u */
    public String f20560u;
    @C17952c(mo34828a = "gold_effect")

    /* renamed from: v */
    public String f20561v;
    @C17952c(mo34828a = "golden_beans")

    /* renamed from: w */
    public long f20562w;
    @C17952c(mo34828a = "honor_level")

    /* renamed from: x */
    public long f20563x;
    @C17952c(mo34828a = "for_fansclub")

    /* renamed from: y */
    public boolean f20564y;
    @C17952c(mo34828a = "fansclub_info")

    /* renamed from: z */
    public C7510i f20565z;

    /* renamed from: b */
    public final boolean mo13923b() {
        if (this.f20563x > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo13924c() {
        if (this.f20532A > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo13922a() {
        if (this.f20544e == 2 || this.f20544e == 4 || this.f20544e == 8) {
            return true;
        }
        return false;
    }
}
