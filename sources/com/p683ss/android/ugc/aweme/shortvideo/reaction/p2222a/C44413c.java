package com.p683ss.android.ugc.aweme.shortvideo.reaction.p2222a;

import android.text.TextUtils;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.a.c */
public class C44413c extends C44410a {

    /* renamed from: a */
    private final List<String> f112356a;

    /* renamed from: b */
    public final String mo90291b() {
        if (this.f112356a != null) {
            return TextUtils.join(", ", this.f112356a);
        }
        return "";
    }

    public C44413c(List<String> list, String str) {
        super(str);
        this.f112356a = list;
    }
}
