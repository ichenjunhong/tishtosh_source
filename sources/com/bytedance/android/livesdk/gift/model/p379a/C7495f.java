package com.bytedance.android.livesdk.gift.model.p379a;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.p272ad.C4525b;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.gift.model.a.f */
public class C7495f extends C7490a<C7505d> {
    /* renamed from: a */
    public int mo13904a() {
        return ((C7505d) this.f20516d).f20545f;
    }

    /* renamed from: b */
    public final boolean mo13905b() {
        return ((C7505d) this.f20516d).f20546g;
    }

    /* renamed from: c */
    public final boolean mo13906c() {
        return ((C7505d) this.f20516d).f20548i;
    }

    /* renamed from: g */
    public final String mo13910g() {
        return ((C7505d) this.f20516d).f20559t;
    }

    /* renamed from: i */
    public final String mo13912i() {
        return ((C7505d) this.f20516d).f20560u;
    }

    /* renamed from: j */
    public final String mo13913j() {
        return ((C7505d) this.f20516d).f20540a;
    }

    /* renamed from: k */
    public final int mo13914k() {
        return ((C7505d) this.f20516d).f20551l;
    }

    /* renamed from: l */
    public final String mo13915l() {
        return ((C7505d) this.f20516d).f20542c;
    }

    /* renamed from: m */
    public final int mo13916m() {
        return ((C7505d) this.f20516d).f20552m;
    }

    /* renamed from: n */
    public final ImageModel mo13917n() {
        return ((C7505d) this.f20516d).f20555p;
    }

    /* renamed from: o */
    public final ImageModel mo13918o() {
        return ((C7505d) this.f20516d).f20541b;
    }

    /* renamed from: p */
    public final long mo13919p() {
        return ((C7505d) this.f20516d).f20543d;
    }

    /* renamed from: r */
    public final C7505d mo13921r() {
        return (C7505d) this.f20516d;
    }

    /* renamed from: d */
    public final boolean mo13907d() {
        if (((C7505d) this.f20516d).f20544e != 10 || ((C7505d) this.f20516d).f20562w <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo13908e() {
        if (((C7505d) this.f20516d).f20544e == 1 || ((C7505d) this.f20516d).f20544e == 5 || ((C7505d) this.f20516d).f20544e == 10) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo13909f() {
        if (TextUtils.isEmpty(((C7505d) this.f20516d).f20559t) || ((Set) C4525b.f12307C.mo10345a()).contains(Long.valueOf(((C7505d) this.f20516d).f20543d))) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo13911h() {
        if (TextUtils.isEmpty(((C7505d) this.f20516d).f20560u) || ((Set) C4525b.f12308D.mo10345a()).contains(String.valueOf(((C7505d) this.f20516d).f20543d))) {
            return false;
        }
        return true;
    }

    public C7495f(C7505d dVar) {
        super(1, dVar);
    }

    C7495f(int i, C7505d dVar) {
        super(i, dVar);
    }
}
