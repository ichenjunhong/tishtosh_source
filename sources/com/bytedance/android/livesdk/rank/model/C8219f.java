package com.bytedance.android.livesdk.rank.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.p284b.C4643a;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.rank.model.f */
public class C8219f implements C4643a<C8219f> {
    @C17952c(mo34828a = "user")

    /* renamed from: a */
    public User f22442a;
    @C17952c(mo34828a = "score")

    /* renamed from: b */
    public long f22443b;
    @C17952c(mo34828a = "rank")

    /* renamed from: c */
    public int f22444c;
    @C17952c(mo34828a = "gap_description")

    /* renamed from: d */
    public String f22445d;
    @C17952c(mo34828a = "delta")

    /* renamed from: e */
    public long f22446e;
    @C17952c(mo34828a = "rich_description")

    /* renamed from: f */
    public String f22447f;
    @C17952c(mo34828a = "city_code")

    /* renamed from: g */
    public String f22448g;
    @C17952c(mo34828a = "gap_rich_description")

    /* renamed from: h */
    public String f22449h;

    /* renamed from: i */
    public transient boolean f22450i;

    /* renamed from: j */
    public transient boolean f22451j;

    /* renamed from: a */
    public final long mo14364a() {
        if (this.f22442a == null) {
            return 0;
        }
        return this.f22442a.getLiveRoomId();
    }

    public int hashCode() {
        int a = (((((int) (((long) (((int) this.f22443b) * 37)) + mo14364a())) * 37) + this.f22442a.hashCode()) * 37) + this.f22444c;
        if (this.f22445d != null) {
            return (a * 37) + this.f22445d.hashCode();
        }
        return a;
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo10430a(Object obj) {
        if (this.f22442a.getId() == ((C8219f) obj).f22442a.getId()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals */
    public boolean mo10431b(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8219f)) {
            return false;
        }
        C8219f fVar = (C8219f) obj;
        long a = mo14364a();
        if (this.f22443b == fVar.f22443b && a == fVar.mo14364a() && this.f22444c == fVar.f22444c && this.f22442a.equals(fVar.f22442a) && this.f22445d != null) {
            return this.f22445d.equals(fVar.f22445d);
        }
        return true;
    }
}
