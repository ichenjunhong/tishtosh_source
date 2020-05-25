package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.p191a.C3000a;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.live.base.model.user.c */
public class C3003c implements C3000a {
    @C17952c(mo34828a = "level")

    /* renamed from: a */
    public int f8816a;
    @C17952c(mo34828a = "experience")

    /* renamed from: b */
    public long f8817b;
    @C17952c(mo34828a = "lowest_experience_this_level")

    /* renamed from: c */
    public long f8818c;
    @C17952c(mo34828a = "highest_experience_this_level")

    /* renamed from: d */
    public long f8819d;
    @C17952c(mo34828a = "task_start_experience")

    /* renamed from: e */
    public long f8820e;
    @C17952c(mo34828a = "task_start_time")

    /* renamed from: f */
    public long f8821f;
    @C17952c(mo34828a = "task_decrease_experience")

    /* renamed from: g */
    public long f8822g;
    @C17952c(mo34828a = "task_target_experience")

    /* renamed from: h */
    public long f8823h;
    @C17952c(mo34828a = "task_end_time")

    /* renamed from: i */
    public long f8824i;
    @C17952c(mo34828a = "profile_dialog_bg")

    /* renamed from: j */
    public ImageModel f8825j;
    @C17952c(mo34828a = "profile_dialog_bg_back")

    /* renamed from: k */
    public ImageModel f8826k;
    @C17952c(mo34828a = "stage_level")

    /* renamed from: l */
    public ImageModel f8827l;
    @C17952c(mo34828a = "small_icon")

    /* renamed from: m */
    public ImageModel f8828m;

    /* renamed from: a */
    public final int mo8134a() {
        return this.f8816a;
    }

    /* renamed from: b */
    public final long mo8135b() {
        return this.f8817b;
    }

    /* renamed from: c */
    public final long mo8136c() {
        return this.f8818c;
    }

    /* renamed from: d */
    public final long mo8137d() {
        return this.f8819d;
    }

    /* renamed from: e */
    public final long mo8138e() {
        return this.f8820e;
    }

    /* renamed from: f */
    public final long mo8139f() {
        return this.f8821f;
    }

    /* renamed from: g */
    public final long mo8140g() {
        return this.f8822g;
    }

    /* renamed from: h */
    public final long mo8141h() {
        return this.f8823h;
    }

    /* renamed from: i */
    public final long mo8142i() {
        return this.f8824i;
    }

    /* renamed from: j */
    public final ImageModel mo8143j() {
        return this.f8825j;
    }

    /* renamed from: k */
    public final ImageModel mo8144k() {
        return this.f8826k;
    }

    /* renamed from: l */
    public final ImageModel mo8145l() {
        return this.f8827l;
    }

    /* renamed from: m */
    public final ImageModel mo8146m() {
        return this.f8828m;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (this.f8828m != null) {
            i = this.f8828m.hashCode();
        } else {
            i = 0;
        }
        int i6 = ((((((((((((((((((i * 31) + this.f8816a) * 31) + ((int) (this.f8817b ^ (this.f8817b >>> 32)))) * 31) + ((int) (this.f8818c ^ (this.f8818c >>> 32)))) * 31) + ((int) (this.f8819d ^ (this.f8819d >>> 32)))) * 31) + ((int) (this.f8820e ^ (this.f8820e >>> 32)))) * 31) + ((int) (this.f8821f ^ (this.f8821f >>> 32)))) * 31) + ((int) (this.f8822g ^ (this.f8822g >>> 32)))) * 31) + ((int) (this.f8823h ^ (this.f8823h >>> 32)))) * 31) + ((int) (this.f8824i ^ (this.f8824i >>> 32)))) * 31;
        if (this.f8825j != null) {
            i2 = this.f8825j.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        if (this.f8826k != null) {
            i3 = this.f8826k.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        if (this.f8827l != null) {
            i4 = this.f8827l.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        if (this.f8828m != null) {
            i5 = this.f8828m.hashCode();
        }
        return i9 + i5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3003c cVar = (C3003c) obj;
        if (this.f8816a != cVar.f8816a || this.f8817b != cVar.f8817b || this.f8818c != cVar.f8818c || this.f8819d != cVar.f8819d || this.f8820e != cVar.f8820e || this.f8821f != cVar.f8821f || this.f8822g != cVar.f8822g || this.f8823h != cVar.f8823h || this.f8824i != cVar.f8824i) {
            return false;
        }
        if (this.f8825j == null ? cVar.f8825j != null : !this.f8825j.equals(cVar.f8825j)) {
            return false;
        }
        if (this.f8826k == null ? cVar.f8826k != null : !this.f8826k.equals(cVar.f8826k)) {
            return false;
        }
        if (this.f8827l == null ? cVar.f8827l != null : !this.f8827l.equals(cVar.f8827l)) {
            return false;
        }
        if (this.f8828m != null) {
            return this.f8828m.equals(cVar.f8828m);
        }
        if (cVar.f8828m == null) {
            return true;
        }
        return false;
    }
}
