package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.p309e.C5084b;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.android.livesdk.message.model.by */
public final class C7856by extends C7859c {
    @C17952c(mo34828a = "user")

    /* renamed from: a */
    public User f21706a;
    @C17952c(mo34828a = "luckymoney_id")

    /* renamed from: b */
    public long f21707b;
    @C17952c(mo34828a = "diamond_count")

    /* renamed from: c */
    public int f21708c;
    @C17952c(mo34828a = "send_time")

    /* renamed from: d */
    public int f21709d;
    @C17952c(mo34828a = "delay_time")

    /* renamed from: e */
    public int f21710e;
    @C17952c(mo34828a = "style")

    /* renamed from: f */
    public int f21711f;
    @C17952c(mo34828a = "lucky_icon")

    /* renamed from: g */
    public ImageModel f21712g;
    @C17952c(mo34828a = "is_official")

    /* renamed from: h */
    public boolean f21713h;
    @C17952c(mo34828a = "background")

    /* renamed from: i */
    public ImageModel f21714i;

    /* renamed from: j */
    public transient boolean f21715j;

    /* renamed from: k */
    public transient WeakReference<C5084b> f21716k;

    public final boolean canText() {
        return true;
    }

    public C7856by() {
        this.type = C8629a.LUCKY_BOX;
    }

    /* renamed from: a */
    public static C7856by m15881a(C7833bh bhVar) {
        C7856by byVar = new C7856by();
        byVar.baseMessage = bhVar.baseMessage;
        byVar.f21706a = bhVar.f21606a;
        byVar.f21707b = bhVar.f21607b;
        byVar.f21708c = bhVar.f21612g;
        byVar.f21709d = (int) (bhVar.f21608c / 1000);
        byVar.f21710e = bhVar.f21609d;
        byVar.f21712g = bhVar.f21618m;
        byVar.f21713h = bhVar.f21617l;
        byVar.f21714i = bhVar.f21616k;
        return byVar;
    }
}
