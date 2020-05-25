package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5703l;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.message.model.bb */
public class C7826bb extends C7859c {
    @C17952c(mo34828a = "message_type")

    /* renamed from: a */
    public int f21542a;
    @C17952c(mo34828a = "punish_effect_list")

    /* renamed from: b */
    public List<C5703l> f21543b;
    @C17952c(mo34828a = "prompts")

    /* renamed from: c */
    public String f21544c;
    @C17952c(mo34828a = "mvp")

    /* renamed from: d */
    public User f21545d;
    @C17952c(mo34828a = "medicine_count")

    /* renamed from: e */
    public int f21546e;
    @C17952c(mo34828a = "target_effect")

    /* renamed from: f */
    public C5703l f21547f;
    @C17952c(mo34828a = "start_time")

    /* renamed from: g */
    public long f21548g;
    @C17952c(mo34828a = "target_user")

    /* renamed from: h */
    public User f21549h;
    @C17952c(mo34828a = "speedy_gift_id")

    /* renamed from: i */
    public long f21550i;
    @C17952c(mo34828a = "duration")

    /* renamed from: j */
    public long f21551j;
    @C17952c(mo34828a = "channel_id")

    /* renamed from: k */
    public long f21552k;
    @C17952c(mo34828a = "battle_id")

    /* renamed from: l */
    public long f21553l;

    public C7826bb() {
        this.type = C8629a.LINK_MIC_BATTLE_PUNISH;
    }
}
