package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.p191a.C3001b;
import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.bytedance.android.live.base.model.user.m */
public class C3014m implements C3001b {
    @C17952c(mo34828a = "diamond_icon")

    /* renamed from: a */
    public ImageModel f8855a;
    @C17952c(mo34828a = "icon")

    /* renamed from: b */
    public ImageModel f8856b;
    @C17952c(mo34828a = "next_icon")

    /* renamed from: c */
    public ImageModel f8857c;
    @C17952c(mo34828a = "next_name")

    /* renamed from: d */
    public String f8858d;
    @C17952c(mo34828a = "name")

    /* renamed from: e */
    public String f8859e;
    @C17952c(mo34828a = "total_diamond_count")

    /* renamed from: f */
    public long f8860f;
    @C17952c(mo34828a = "now_diamond")

    /* renamed from: g */
    public long f8861g;
    @C17952c(mo34828a = "next_diamond")

    /* renamed from: h */
    public long f8862h;
    @C17952c(mo34828a = "im_icon")

    /* renamed from: i */
    public ImageModel f8863i;
    @C17952c(mo34828a = "im_icon_with_level")

    /* renamed from: j */
    public ImageModel f8864j;
    @C17952c(mo34828a = "new_im_icon_with_level")

    /* renamed from: k */
    public ImageModel f8865k;
    @C17952c(mo34828a = "live_icon")

    /* renamed from: l */
    public ImageModel f8866l;
    @C17952c(mo34828a = "new_live_icon")

    /* renamed from: m */
    public ImageModel f8867m;
    @C17952c(mo34828a = "level")

    /* renamed from: n */
    public int f8868n;
    @C17952c(mo34828a = "grade_icon_list")

    /* renamed from: o */
    public List<C3008h> f8869o;
    @C17952c(mo34828a = "grade_describe")

    /* renamed from: p */
    public String f8870p;
    @C17952c(mo34828a = "this_grade_max_diamond")

    /* renamed from: q */
    public long f8871q;
    @C17952c(mo34828a = "this_grade_min_diamond")

    /* renamed from: r */
    public long f8872r;
    @C17952c(mo34828a = "background")

    /* renamed from: s */
    public ImageModel f8873s;
    @C17952c(mo34828a = "background_back")

    /* renamed from: t */
    public ImageModel f8874t;
    @C17952c(mo34828a = "upgrade_need_consume")

    /* renamed from: u */
    long f8875u;
    @C17952c(mo34828a = "grade_banner")

    /* renamed from: v */
    String f8876v;
    @C17952c(mo34828a = "pay_diamond_bak")

    /* renamed from: w */
    long f8877w;
    @C17952c(mo34828a = "next_privileges")

    /* renamed from: x */
    String f8878x;
    @C17952c(mo34828a = "score")

    /* renamed from: y */
    long f8879y;
    @C17952c(mo34828a = "screen_chat_type")

    /* renamed from: z */
    long f8880z;

    /* renamed from: a */
    public final long mo8179a() {
        return this.f8879y;
    }

    /* renamed from: b */
    public final ImageModel mo8147b() {
        return this.f8855a;
    }

    /* renamed from: c */
    public final ImageModel mo8148c() {
        return this.f8856b;
    }

    /* renamed from: d */
    public final ImageModel mo8149d() {
        return this.f8857c;
    }

    /* renamed from: e */
    public final String mo8150e() {
        return this.f8858d;
    }

    /* renamed from: f */
    public final String mo8151f() {
        return this.f8859e;
    }

    /* renamed from: g */
    public final long mo8152g() {
        return this.f8860f;
    }

    /* renamed from: h */
    public final long mo8153h() {
        return this.f8861g;
    }

    /* renamed from: i */
    public final long mo8154i() {
        return this.f8862h;
    }

    /* renamed from: j */
    public final ImageModel mo8155j() {
        return this.f8863i;
    }

    /* renamed from: m */
    public final ImageModel mo8158m() {
        return this.f8864j;
    }

    /* renamed from: n */
    public final int mo8159n() {
        return this.f8868n;
    }

    /* renamed from: o */
    public final ImageModel mo8160o() {
        return this.f8866l;
    }

    /* renamed from: p */
    public final List<C3008h> mo8161p() {
        return this.f8869o;
    }

    /* renamed from: q */
    public final String mo8162q() {
        return this.f8870p;
    }

    /* renamed from: r */
    public final long mo8163r() {
        return this.f8871q;
    }

    /* renamed from: s */
    public final long mo8164s() {
        return this.f8872r;
    }

    /* renamed from: t */
    public final ImageModel mo8165t() {
        return this.f8873s;
    }

    /* renamed from: u */
    public final ImageModel mo8166u() {
        return this.f8874t;
    }

    /* renamed from: k */
    public final ImageModel mo8156k() {
        if (this.f8865k != null) {
            return this.f8865k;
        }
        return this.f8864j;
    }

    /* renamed from: l */
    public final ImageModel mo8157l() {
        if (this.f8867m != null) {
            return this.f8867m;
        }
        return this.f8866l;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (this.f8855a != null) {
            i = this.f8855a.hashCode();
        } else {
            i = 0;
        }
        int i15 = i * 31;
        if (this.f8856b != null) {
            i2 = this.f8856b.hashCode();
        } else {
            i2 = 0;
        }
        int i16 = (i15 + i2) * 31;
        if (this.f8857c != null) {
            i3 = this.f8857c.hashCode();
        } else {
            i3 = 0;
        }
        int i17 = (i16 + i3) * 31;
        if (this.f8858d != null) {
            i4 = this.f8858d.hashCode();
        } else {
            i4 = 0;
        }
        int i18 = (i17 + i4) * 31;
        if (this.f8859e != null) {
            i5 = this.f8859e.hashCode();
        } else {
            i5 = 0;
        }
        int i19 = (((((((i18 + i5) * 31) + ((int) (this.f8860f ^ (this.f8860f >>> 32)))) * 31) + ((int) (this.f8861g ^ (this.f8861g >>> 32)))) * 31) + ((int) (this.f8862h ^ (this.f8862h >>> 32)))) * 31;
        if (this.f8863i != null) {
            i6 = this.f8863i.hashCode();
        } else {
            i6 = 0;
        }
        int i20 = (i19 + i6) * 31;
        if (this.f8864j != null) {
            i7 = this.f8864j.hashCode();
        } else {
            i7 = 0;
        }
        int i21 = (i20 + i7) * 31;
        if (this.f8865k != null) {
            i8 = this.f8865k.hashCode();
        } else {
            i8 = 0;
        }
        int i22 = (i21 + i8) * 31;
        if (this.f8866l != null) {
            i9 = this.f8866l.hashCode();
        } else {
            i9 = 0;
        }
        int i23 = (i22 + i9) * 31;
        if (this.f8867m != null) {
            i10 = this.f8867m.hashCode();
        } else {
            i10 = 0;
        }
        int i24 = (((i23 + i10) * 31) + this.f8868n) * 31;
        if (this.f8869o != null) {
            i11 = this.f8869o.hashCode();
        } else {
            i11 = 0;
        }
        int i25 = (i24 + i11) * 31;
        if (this.f8870p != null) {
            i12 = this.f8870p.hashCode();
        } else {
            i12 = 0;
        }
        int i26 = (((((i25 + i12) * 31) + ((int) (this.f8871q ^ (this.f8871q >>> 32)))) * 31) + ((int) (this.f8872r ^ (this.f8872r >>> 32)))) * 31;
        if (this.f8873s != null) {
            i13 = this.f8873s.hashCode();
        } else {
            i13 = 0;
        }
        int i27 = (i26 + i13) * 31;
        if (this.f8874t != null) {
            i14 = this.f8874t.hashCode();
        }
        return i27 + i14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3014m mVar = (C3014m) obj;
        if (this.f8860f != mVar.f8860f || this.f8861g != mVar.f8861g || this.f8862h != mVar.f8862h || this.f8868n != mVar.f8868n) {
            return false;
        }
        if (this.f8855a == null ? mVar.f8855a != null : !this.f8855a.equals(mVar.f8855a)) {
            return false;
        }
        if (this.f8856b == null ? mVar.f8856b != null : !this.f8856b.equals(mVar.f8856b)) {
            return false;
        }
        if (this.f8857c == null ? mVar.f8857c != null : !this.f8857c.equals(mVar.f8857c)) {
            return false;
        }
        if (this.f8858d == null ? mVar.f8858d != null : !this.f8858d.equals(mVar.f8858d)) {
            return false;
        }
        if (this.f8859e == null ? mVar.f8859e != null : !this.f8859e.equals(mVar.f8859e)) {
            return false;
        }
        if (this.f8863i == null ? mVar.f8863i != null : !this.f8863i.equals(mVar.f8863i)) {
            return false;
        }
        if (this.f8864j == null ? mVar.f8864j != null : !this.f8864j.equals(mVar.f8864j)) {
            return false;
        }
        if (this.f8865k == null ? mVar.f8865k != null : !this.f8865k.equals(mVar.f8865k)) {
            return false;
        }
        if (this.f8866l == null ? mVar.f8866l != null : !this.f8866l.equals(mVar.f8866l)) {
            return false;
        }
        if (this.f8867m == null ? mVar.f8867m != null : !this.f8867m.equals(mVar.f8867m)) {
            return false;
        }
        if (this.f8869o == null ? mVar.f8869o != null : !this.f8869o.equals(mVar.f8869o)) {
            return false;
        }
        if (this.f8872r != mVar.f8872r || this.f8871q != mVar.f8871q) {
            return false;
        }
        if (this.f8873s == null ? mVar.f8873s != null : !this.f8873s.equals(mVar.f8873s)) {
            return false;
        }
        if (this.f8874t == null ? mVar.f8874t != null : !this.f8874t.equals(mVar.f8874t)) {
            return false;
        }
        if (this.f8870p != null) {
            return this.f8870p.equals(mVar.f8870p);
        }
        if (mVar.f8870p == null) {
            return true;
        }
        return false;
    }
}
