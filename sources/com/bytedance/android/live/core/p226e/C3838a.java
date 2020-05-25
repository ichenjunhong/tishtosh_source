package com.bytedance.android.live.core.p226e;

import android.text.TextUtils;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;

/* renamed from: com.bytedance.android.live.core.e.a */
public final class C3838a extends C2949a {

    /* renamed from: a */
    private String f10810a;

    /* renamed from: b */
    private String f10811b;

    public final String getUrl() {
        return this.f10810a;
    }

    public final String getMessage() {
        StringBuilder sb = new StringBuilder(" TYPE = CustomApiServerException, url = ");
        sb.append(this.f10810a);
        sb.append(", xTtLogId = ");
        sb.append(this.f10811b);
        sb.append("  ");
        sb.append(super.getMessage());
        return sb.toString();
    }

    public C3838a(int i, String str, String str2) {
        super(i);
        if (TextUtils.isEmpty(str)) {
            this.f10810a = "";
        } else {
            this.f10810a = str;
        }
        if (TextUtils.isEmpty(str2)) {
            this.f10811b = "";
        } else {
            this.f10811b = str2;
        }
    }
}
