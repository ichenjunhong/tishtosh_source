package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.bo */
public class C7841bo extends C7859c {
    @C17952c(mo34828a = "popular_card_info")

    /* renamed from: a */
    public C7842a f21665a;

    /* renamed from: com.bytedance.android.livesdk.message.model.bo$a */
    public static class C7842a {
        @C17952c(mo34828a = "status")

        /* renamed from: a */
        public int f21666a;
        @C17952c(mo34828a = "startTime")

        /* renamed from: b */
        public long f21667b;
        @C17952c(mo34828a = "end_time")

        /* renamed from: c */
        public long f21668c;
        @C17952c(mo34828a = "enter_number")

        /* renamed from: d */
        public int f21669d;
    }

    public C7841bo() {
        this.type = C8629a.POPULAR_CARD_MESSAGE;
    }
}
