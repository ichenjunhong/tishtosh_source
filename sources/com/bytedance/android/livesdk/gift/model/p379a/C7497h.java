package com.bytedance.android.livesdk.gift.model.p379a;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.p272ad.C4525b;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.gift.model.a.h */
public final class C7497h extends C7490a<Prop> {
    /* renamed from: c */
    public final boolean mo13906c() {
        return false;
    }

    /* renamed from: a */
    public final int mo13904a() {
        return ((Prop) this.f20516d).diamond;
    }

    /* renamed from: g */
    public final String mo13910g() {
        return ((Prop) this.f20516d).manual;
    }

    /* renamed from: i */
    public final String mo13912i() {
        return ((Prop) this.f20516d).guideUrl;
    }

    /* renamed from: j */
    public final String mo13913j() {
        return ((Prop) this.f20516d).name;
    }

    /* renamed from: l */
    public final String mo13915l() {
        return ((Prop) this.f20516d).description;
    }

    /* renamed from: n */
    public final ImageModel mo13917n() {
        return ((Prop) this.f20516d).labelIcon;
    }

    /* renamed from: o */
    public final ImageModel mo13918o() {
        return ((Prop) this.f20516d).icon;
    }

    /* renamed from: p */
    public final long mo13919p() {
        return ((Prop) this.f20516d).f20511id;
    }

    /* renamed from: q */
    public final ImageModel mo13920q() {
        return ((Prop) this.f20516d).diamondLabel;
    }

    /* renamed from: b */
    public final boolean mo13905b() {
        if (((Prop) this.f20516d).gift == null) {
            return false;
        }
        return ((Prop) this.f20516d).gift.f20546g;
    }

    /* renamed from: k */
    public final int mo13914k() {
        if (((Prop) this.f20516d).gift == null) {
            return super.mo13914k();
        }
        return ((Prop) this.f20516d).gift.f20551l;
    }

    /* renamed from: m */
    public final int mo13916m() {
        if (((Prop) this.f20516d).gift == null) {
            return super.mo13916m();
        }
        return ((Prop) this.f20516d).gift.f20552m;
    }

    /* renamed from: e */
    public final boolean mo13908e() {
        if (((Prop) this.f20516d).gift == null || (((Prop) this.f20516d).gift.f20544e != 1 && ((Prop) this.f20516d).gift.f20544e != 5)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo13909f() {
        if (TextUtils.isEmpty(((Prop) this.f20516d).manual) || ((Set) C4525b.f12307C.mo10345a()).contains(Long.valueOf(((Prop) this.f20516d).f20511id))) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo13911h() {
        if (TextUtils.isEmpty(((Prop) this.f20516d).guideUrl) || ((Set) C4525b.f12308D.mo10345a()).contains(String.valueOf(((Prop) this.f20516d).f20511id))) {
            return false;
        }
        return true;
    }

    public C7497h(Prop prop) {
        super(2, prop);
    }
}
