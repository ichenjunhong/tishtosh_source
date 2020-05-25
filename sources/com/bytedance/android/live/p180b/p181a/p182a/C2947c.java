package com.bytedance.android.live.p180b.p181a.p182a;

import com.bytedance.android.live.network.response.C4175b;

/* renamed from: com.bytedance.android.live.b.a.a.c */
public final class C2947c extends C2945a {

    /* renamed from: a */
    private C4175b f8650a;

    public final C4175b getResponse() {
        return this.f8650a;
    }

    public C2947c() {
        super(-2);
    }

    public final String getMessage() {
        StringBuilder sb = new StringBuilder(" TYPE = ResponseNoDataException ");
        sb.append(super.getMessage());
        return sb.toString();
    }

    public C2947c(C4175b bVar) {
        super(-2);
        this.f8650a = bVar;
    }
}
