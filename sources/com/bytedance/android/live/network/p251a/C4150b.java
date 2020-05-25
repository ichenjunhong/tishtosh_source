package com.bytedance.android.live.network.p251a;

import android.text.TextUtils;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;

/* renamed from: com.bytedance.android.live.network.a.b */
public final class C4150b extends C2949a {

    /* renamed from: a */
    private String f11330a;

    /* renamed from: b */
    private String f11331b;

    public final String getUrl() {
        return this.f11330a;
    }

    public final String getMessage() {
        StringBuilder sb = new StringBuilder(" TYPE = CustomApiServerException, url = ");
        sb.append(this.f11330a);
        sb.append(", xTtLogId = ");
        sb.append(this.f11331b);
        sb.append("  ");
        sb.append(super.getMessage());
        return sb.toString();
    }

    public C4150b(int i, String str, String str2) {
        super(i);
        if (TextUtils.isEmpty(str)) {
            this.f11330a = "";
        } else {
            this.f11330a = str;
        }
        if (TextUtils.isEmpty(str2)) {
            this.f11331b = "";
        } else {
            this.f11331b = str2;
        }
    }
}
