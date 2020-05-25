package com.bytedance.android.p140a.p141a.p146e;

import android.text.TextUtils;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.a.e.b */
public final class C2788b extends C2787a {

    /* renamed from: j */
    public int f8372j;

    /* renamed from: k */
    public String f8373k;

    /* renamed from: a */
    public final String mo7390a() {
        return this.f8373k;
    }

    public final String toString() {
        int i;
        String str;
        StringBuilder sb = new StringBuilder("C2STrackEvent{adid:");
        sb.append(this.f8365c);
        sb.append(",non_std_adid:");
        sb.append(this.f8367e);
        sb.append(",usize:");
        if (this.f8368f == null) {
            i = 0;
        } else {
            i = this.f8368f.size();
        }
        sb.append(i);
        sb.append(",key:");
        if (TextUtils.isEmpty(this.f8364b)) {
            str = "empty";
        } else {
            str = this.f8364b;
        }
        sb.append(str);
        sb.append(",label:");
        sb.append(this.f8373k);
        sb.append("}");
        return sb.toString();
    }

    public C2788b(long j, List<String> list, String str, boolean z, long j2, String str2, JSONObject jSONObject) {
        this(UUID.randomUUID().toString(), "c2s", j, list, str, z, j2, str2, jSONObject, 0);
    }

    public C2788b(String str, String str2, long j, List<String> list, String str3, boolean z, long j2, String str4, JSONObject jSONObject, int i) {
        super(str, str2, j, list, z, j2, str4, jSONObject);
        this.f8373k = "";
        this.f8373k = str3;
        this.f8372j = i;
    }
}
