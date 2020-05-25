package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.common.utility.C9414h;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.bz */
public class C7857bz {
    @C17952c(mo34828a = "red_packet_group_id")

    /* renamed from: a */
    public long f21717a;
    @C17952c(mo34828a = "bonus_type")

    /* renamed from: b */
    public long f21718b;
    @C17952c(mo34828a = "combo_count")

    /* renamed from: c */
    public long f21719c;
    @C17952c(mo34828a = "bonus_count")

    /* renamed from: d */
    public long f21720d;
    @C17952c(mo34828a = "count_down")

    /* renamed from: e */
    public long f21721e;
    @C17952c(mo34828a = "rush_time")

    /* renamed from: f */
    public long f21722f;
    @C17952c(mo34828a = "icon_url")

    /* renamed from: g */
    public String f21723g;
    @C17952c(mo34828a = "disappear_time")

    /* renamed from: h */
    public long f21724h;
    @C17952c(mo34828a = "owner")

    /* renamed from: i */
    public C7858a f21725i;
    @C17952c(mo34828a = "total_count_down")

    /* renamed from: j */
    public long f21726j;
    @C17952c(mo34828a = "red_packet_source")

    /* renamed from: k */
    public String f21727k;

    /* renamed from: com.bytedance.android.livesdk.message.model.bz$a */
    public static class C7858a {
        @C17952c(mo34828a = "id")

        /* renamed from: a */
        public long f21728a;
        @C17952c(mo34828a = "nickname")

        /* renamed from: b */
        public String f21729b;

        /* renamed from: c */
        public transient String f21730c;

        /* renamed from: d */
        ImageModel f21731d;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo14155a() {
            if (this.f21731d != null && !C9414h.m18630a(this.f21731d.mUrls)) {
                this.f21730c = (String) this.f21731d.mUrls.get(0);
            }
        }
    }
}
