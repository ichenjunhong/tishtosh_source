package com.bytedance.android.livesdk.gift.effect.normal.p372d;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.message.model.C7810ao;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.gift.effect.normal.d.b */
public final class C7421b extends C7420a {

    /* renamed from: a */
    public int f20324a = 1;

    /* renamed from: b */
    public long f20325b;

    /* renamed from: c */
    public int f20326c;

    /* renamed from: d */
    public int f20327d;

    /* renamed from: e */
    public ImageModel f20328e;

    /* renamed from: f */
    public boolean f20329f;

    /* renamed from: g */
    public String f20330g;

    /* renamed from: h */
    public String f20331h;

    /* renamed from: p */
    public Map<String, Integer> f20332p;

    /* renamed from: q */
    public C7810ao f20333q;

    /* renamed from: r */
    public C7422a f20334r;

    /* renamed from: s */
    public boolean f20335s;

    /* renamed from: com.bytedance.android.livesdk.gift.effect.normal.d.b$a */
    public enum C7422a {
        normal,
        group
    }

    /* renamed from: b */
    public final void mo13712b() {
        if (this.f20335s) {
            this.f20326c += this.f20327d;
            this.f20327d = 0;
            return;
        }
        this.f20326c++;
        this.f20327d--;
    }

    /* renamed from: a */
    public final String mo13710a() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.f20320l.getId()));
        sb.append("-");
        sb.append(String.valueOf(this.f20318j));
        sb.append("-");
        sb.append(String.valueOf(this.f20324a));
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo13711a(C7421b bVar) {
        int i = (bVar.f20326c - this.f20326c) - this.f20327d;
        if (i > 0) {
            this.f20327d += i;
        }
    }

    public C7421b(long j, long j2) {
        super(j, j2);
    }
}
