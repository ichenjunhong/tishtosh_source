package com.p683ss.android.ugc.aweme.shortvideo.p2208k;

import android.text.TextUtils;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.k.l */
public final class C43929l {

    /* renamed from: a */
    public String f111228a;

    /* renamed from: b */
    public boolean f111229b;

    /* renamed from: c */
    public String f111230c;

    /* renamed from: d */
    public long f111231d;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f111228a);
        sb.append(": ");
        sb.append(this.f111230c);
        sb.append("  存在?");
        sb.append(this.f111229b);
        sb.append(" size: ");
        sb.append(this.f111231d);
        return sb.toString();
    }

    public C43929l(String str, String str2) {
        this.f111228a = str;
        this.f111230c = str2;
        if (!TextUtils.isEmpty(str2)) {
            File file = new File(str2);
            if (file.exists() && file.isFile()) {
                this.f111229b = true;
                this.f111231d = file.length();
                return;
            }
        }
        this.f111229b = false;
        this.f111231d = 0;
    }
}
