package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.chatroom.interact.p318g.C5382c;
import com.bytedance.android.livesdkapi.depend.model.live.C8697c;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.message.model.bd */
public class C7829bd extends C7859c {
    @C17952c(mo34828a = "sub_type")

    /* renamed from: A */
    public long f21557A;
    @C17952c(mo34828a = "confluence_type")

    /* renamed from: B */
    public int f21558B;
    @C17952c(mo34828a = "inviter_rival_extra")

    /* renamed from: C */
    public C5382c f21559C;
    @C17952c(mo34828a = "rival_anchor_id")

    /* renamed from: D */
    long f21560D;
    @C17952c(mo34828a = "rival_linkmic_id")

    /* renamed from: E */
    long f21561E;
    @C17952c(mo34828a = "rival_linkmic_id_str")

    /* renamed from: F */
    String f21562F;
    @C17952c(mo34828a = "message_type")

    /* renamed from: a */
    public int f21563a;
    @C17952c(mo34828a = "app_id")

    /* renamed from: b */
    public String f21564b;
    @C17952c(mo34828a = "app_sign")

    /* renamed from: c */
    public String f21565c;
    @C17952c(mo34828a = "access_key")

    /* renamed from: d */
    public String f21566d;
    @C17952c(mo34828a = "anchor_linkmic_id")

    /* renamed from: e */
    public int f21567e;
    @C17952c(mo34828a = "anchor_linkmic_id_str")

    /* renamed from: f */
    public String f21568f;
    @C17952c(mo34828a = "user_id")

    /* renamed from: g */
    public long f21569g;
    @C17952c(mo34828a = "fan_ticket")

    /* renamed from: h */
    public long f21570h;
    @C17952c(mo34828a = "total_linkmic_fan_ticket")

    /* renamed from: i */
    long f21571i;
    @C17952c(mo34828a = "channel_id")

    /* renamed from: j */
    public long f21572j;
    @C17952c(mo34828a = "layout")

    /* renamed from: k */
    public int f21573k;
    @C17952c(mo34828a = "vendor")

    /* renamed from: l */
    public int f21574l;
    @C17952c(mo34828a = "dimension")

    /* renamed from: m */
    public int f21575m;
    @C17952c(mo34828a = "theme")

    /* renamed from: n */
    public String f21576n;
    @C17952c(mo34828a = "invite_uid")

    /* renamed from: o */
    public long f21577o;
    @C17952c(mo34828a = "answer")

    /* renamed from: p */
    public int f21578p;
    @C17952c(mo34828a = "start_time_ms")

    /* renamed from: q */
    public long f21579q;
    @C17952c(mo34828a = "duration")

    /* renamed from: r */
    public int f21580r;
    @C17952c(mo34828a = "user_scores")

    /* renamed from: s */
    public List<C8697c> f21581s;
    @C17952c(mo34828a = "match_type")

    /* renamed from: t */
    public int f21582t;
    @C17952c(mo34828a = "win")

    /* renamed from: u */
    public boolean f21583u;
    @C17952c(mo34828a = "prompts")

    /* renamed from: v */
    public String f21584v;
    @C17952c(mo34828a = "to_user_id")

    /* renamed from: w */
    public long f21585w;
    @C17952c(mo34828a = "from_room_id")

    /* renamed from: x */
    public long f21586x;
    @C17952c(mo34828a = "tips")

    /* renamed from: y */
    public String f21587y;
    @C17952c(mo34828a = "invite_type")

    /* renamed from: z */
    public int f21588z;

    public C7829bd() {
        this.type = C8629a.LINK_MIC;
    }
}
