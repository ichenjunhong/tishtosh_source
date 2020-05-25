package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.message.model.aq */
public class C7812aq extends C7859c {
    @C17952c(mo34828a = "msg_type")

    /* renamed from: a */
    public long f21508a;
    @C17952c(mo34828a = "vote_id")

    /* renamed from: b */
    public long f21509b;
    @C17952c(mo34828a = "results")

    /* renamed from: c */
    public List<C7813ar> f21510c;
    @C17952c(mo34828a = "finish_time")

    /* renamed from: d */
    public long f21511d;

    public C7812aq() {
        this.type = C8629a.GIFT_VOTE_MESSAGE;
    }
}
