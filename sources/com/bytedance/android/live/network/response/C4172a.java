package com.bytedance.android.live.network.response;

import com.bytedance.android.live.base.model.Extra;
import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.bytedance.android.live.network.response.a */
public class C4172a<T, R extends Extra> {
    @C17952c(mo34828a = "status_code")

    /* renamed from: a */
    public int f11364a;
    @C17952c(mo34828a = "data")

    /* renamed from: b */
    public List<T> f11365b;
    @C17952c(mo34828a = "extra")

    /* renamed from: c */
    public R f11366c;

    /* renamed from: d */
    public transient RequestError f11367d;
}
