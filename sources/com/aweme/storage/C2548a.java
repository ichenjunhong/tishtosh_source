package com.aweme.storage;

import com.google.gson.p1076a.C17952c;
import java.util.Arrays;

/* renamed from: com.aweme.storage.a */
public class C2548a {
    @C17952c(mo34828a = "interval")

    /* renamed from: a */
    public int f7912a;
    @C17952c(mo34828a = "force")

    /* renamed from: b */
    public String[] f7913b;
    @C17952c(mo34828a = "file_limit")

    /* renamed from: c */
    public int f7914c;
    @C17952c(mo34828a = "dir_limit")

    /* renamed from: d */
    public int f7915d;
    @C17952c(mo34828a = "non_active_duration")

    /* renamed from: e */
    public int f7916e;
    @C17952c(mo34828a = "non_active_count")

    /* renamed from: f */
    public int f7917f;
    @C17952c(mo34828a = "non_active_times")

    /* renamed from: g */
    public int f7918g;
    @C17952c(mo34828a = "too_large_limit")

    /* renamed from: h */
    public int f7919h;
    @C17952c(mo34828a = "non_active_limit")

    /* renamed from: i */
    public int f7920i;

    public String toString() {
        StringBuilder sb = new StringBuilder("CacheStrategy{interval=");
        sb.append(this.f7912a);
        sb.append(", forceList=");
        sb.append(Arrays.toString(this.f7913b));
        sb.append(", fileLimit=");
        sb.append(this.f7914c);
        sb.append(", dirLimit=");
        sb.append(this.f7915d);
        sb.append(", nonActiveDuration=");
        sb.append(this.f7916e);
        sb.append(", nonActiveLimit=");
        sb.append(this.f7920i);
        sb.append('}');
        return sb.toString();
    }
}
