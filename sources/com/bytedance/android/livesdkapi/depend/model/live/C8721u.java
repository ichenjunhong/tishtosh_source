package com.bytedance.android.livesdkapi.depend.model.live;

import android.text.TextUtils;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.u */
public class C8721u {
    @C17952c(mo34828a = "image")

    /* renamed from: a */
    public ImageModel f23940a;
    @C17952c(mo34828a = "text_color")

    /* renamed from: b */
    public String f23941b;
    @C17952c(mo34828a = "text_size")

    /* renamed from: c */
    public int f23942c;
    @C17952c(mo34828a = "content")

    /* renamed from: d */
    public String f23943d;
    @C17952c(mo34828a = "max_length")

    /* renamed from: e */
    public int f23944e;
    @C17952c(mo34828a = "input_rect")

    /* renamed from: f */
    public int[] f23945f;
    @C17952c(mo34828a = "type")

    /* renamed from: g */
    public int f23946g;
    @C17952c(mo34828a = "id")

    /* renamed from: h */
    public long f23947h;
    @C17952c(mo34828a = "x")

    /* renamed from: i */
    public int f23948i = -1;
    @C17952c(mo34828a = "y")

    /* renamed from: j */
    public int f23949j = -1;
    @C17952c(mo34828a = "w")

    /* renamed from: k */
    public int f23950k;
    @C17952c(mo34828a = "h")

    /* renamed from: l */
    public int f23951l;
    @C17952c(mo34828a = "status")

    /* renamed from: m */
    public int f23952m;
    @C17952c(mo34828a = "kind")

    /* renamed from: n */
    public int f23953n;
    @C17952c(mo34828a = "sit_rect")

    /* renamed from: o */
    public List<Double> f23954o;

    public C8721u() {
    }

    /* renamed from: a */
    public final C8719s mo15389a() {
        if (this.f23946g == 3 && !TextUtils.isEmpty(this.f23943d)) {
            try {
                return (C8719s) C2942b.m8369a().mo34884a(this.f23943d, C8719s.class);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public C8721u(C8721u uVar) {
        this.f23940a = uVar.f23940a;
        this.f23941b = uVar.f23941b;
        this.f23942c = uVar.f23942c;
        this.f23943d = uVar.f23943d;
        this.f23944e = uVar.f23944e;
        this.f23945f = uVar.f23945f;
        this.f23946g = uVar.f23946g;
        this.f23947h = uVar.f23947h;
        this.f23948i = uVar.f23948i;
        this.f23949j = uVar.f23949j;
        this.f23950k = uVar.f23950k;
        this.f23951l = uVar.f23951l;
        this.f23952m = uVar.f23952m;
    }
}
