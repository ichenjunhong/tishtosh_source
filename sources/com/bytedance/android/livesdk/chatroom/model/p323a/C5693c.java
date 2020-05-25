package com.bytedance.android.livesdk.chatroom.model.p323a;

import com.bytedance.android.livesdk.message.model.C7859c;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.a.c */
public class C5693c extends C7859c {
    @C17952c(mo34828a = "mode")

    /* renamed from: a */
    public int f14935a;
    @C17952c(mo34828a = "steal_tower_data")

    /* renamed from: b */
    public C5694a f14936b;
    @C17952c(mo34828a = "now")

    /* renamed from: c */
    public long f14937c;

    /* renamed from: com.bytedance.android.livesdk.chatroom.model.a.c$a */
    public static class C5694a {
        @C17952c(mo34828a = "start_time")

        /* renamed from: a */
        public long f14938a;
        @C17952c(mo34828a = "finish_time")

        /* renamed from: b */
        public long f14939b;
        @C17952c(mo34828a = "duration")

        /* renamed from: c */
        public int f14940c;
        @C17952c(mo34828a = "open_score")

        /* renamed from: d */
        public int f14941d;
        @C17952c(mo34828a = "target_score")

        /* renamed from: e */
        public int f14942e;
        @C17952c(mo34828a = "attacker_id")

        /* renamed from: f */
        public long f14943f;
        @C17952c(mo34828a = "finish")

        /* renamed from: g */
        public boolean f14944g;
        @C17952c(mo34828a = "win")

        /* renamed from: h */
        public int f14945h;
        @C17952c(mo34828a = "trigger_time")

        /* renamed from: i */
        public int f14946i;
        @C17952c(mo34828a = "count")

        /* renamed from: j */
        public int f14947j;
    }

    public C5693c() {
        this.type = C8629a.BATTLE_MODE;
    }
}
