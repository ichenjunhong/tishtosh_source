package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.C5710ac;
import com.bytedance.android.livesdk.chatroom.model.C5714ag;
import com.bytedance.android.livesdk.chatroom.model.C5772z;
import com.bytedance.android.livesdk.chatroom.p309e.C5084b;
import com.bytedance.android.livesdk.p279af.p280a.C4551a;
import com.google.gson.p1076a.C17952c;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.message.model.bh */
public class C7833bh extends C7859c {
    @C17952c(mo34828a = "user")

    /* renamed from: a */
    public User f21606a;
    @C17952c(mo34828a = "box_id")

    /* renamed from: b */
    public long f21607b;
    @C17952c(mo34828a = "send_time")

    /* renamed from: c */
    public long f21608c;
    @C17952c(mo34828a = "delay_time")

    /* renamed from: d */
    public int f21609d;
    @C17952c(mo34828a = "box_type")

    /* renamed from: e */
    public int f21610e;
    @C17952c(mo34828a = "title")

    /* renamed from: f */
    public String f21611f;
    @C17952c(mo34828a = "diamond_count")

    /* renamed from: g */
    public int f21612g;
    @C17952c(mo34828a = "priority")

    /* renamed from: h */
    public int f21613h;
    @C17952c(mo34828a = "large")

    /* renamed from: i */
    public boolean f21614i;
    @C17952c(mo34828a = "description_list")

    /* renamed from: j */
    public List<C5710ac> f21615j;
    @C17952c(mo34828a = "background")

    /* renamed from: k */
    public ImageModel f21616k;
    @C17952c(mo34828a = "is_official")

    /* renamed from: l */
    public boolean f21617l;
    @C17952c(mo34828a = "lucky_icon")

    /* renamed from: m */
    public ImageModel f21618m;
    @C17952c(mo34828a = "meta")

    /* renamed from: n */
    public C5714ag f21619n;
    @C17952c(mo34828a = "display_duration")

    /* renamed from: o */
    public long f21620o;
    @C17952c(mo34828a = "box_status")

    /* renamed from: p */
    public int f21621p;
    @C17952c(mo34828a = "flat_duration")

    /* renamed from: q */
    public int f21622q;
    @C17952c(mo34828a = "unpack_type")

    /* renamed from: r */
    public int f21623r;
    @C17952c(mo34828a = "rush_condition")

    /* renamed from: s */
    public int f21624s;
    @C17952c(mo34828a = "business_type")

    /* renamed from: t */
    public long f21625t;
    @C17952c(mo34828a = "extra")

    /* renamed from: u */
    public C7860ca f21626u;

    /* renamed from: v */
    public transient boolean f21627v;

    /* renamed from: w */
    public transient boolean f21628w;

    /* renamed from: x */
    public transient C5772z f21629x;

    /* renamed from: y */
    public transient WeakReference<C5084b> f21630y;

    /* renamed from: z */
    public transient boolean f21631z = true;

    public boolean canText() {
        return true;
    }

    /* renamed from: a */
    public final long mo14146a() {
        return (this.f21608c + ((long) (this.f21609d * 1000))) - C4551a.m10939a();
    }
}
