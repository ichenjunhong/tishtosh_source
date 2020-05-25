package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model.user.User;
import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.an */
public final class C5723an {
    @C17952c(mo34828a = "portals")

    /* renamed from: a */
    public List<C5724a> f15060a;

    /* renamed from: com.bytedance.android.livesdk.chatroom.model.an$a */
    public static class C5724a {
        @C17952c(mo34828a = "start_time")

        /* renamed from: a */
        public long f15061a;
        @C17952c(mo34828a = "enter_count")

        /* renamed from: b */
        public long f15062b;
        @C17952c(mo34828a = "sugar_daddy")

        /* renamed from: c */
        public User f15063c;
        @C17952c(mo34828a = "anchor")

        /* renamed from: d */
        public User f15064d;
        @C17952c(mo34828a = "room_id")

        /* renamed from: e */
        public long f15065e;
        @C17952c(mo34828a = "portal_id")

        /* renamed from: f */
        public long f15066f;
        @C17952c(mo34828a = "user_type")

        /* renamed from: g */
        public int f15067g;
        @C17952c(mo34828a = "invitee_count")

        /* renamed from: h */
        public long f15068h;
        @C17952c(mo34828a = "status")

        /* renamed from: i */
        public int f15069i;
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.model.an$b */
    public enum C5725b {
        NONE,
        CREATED,
        INVITED,
        REWARDED,
        FINISHED
    }
}
