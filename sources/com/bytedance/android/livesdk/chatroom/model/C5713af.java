package com.bytedance.android.livesdk.chatroom.model;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.af */
public class C5713af {
    @C17952c(mo34828a = "high_light_color")

    /* renamed from: a */
    public String f15015a;
    @C17952c(mo34828a = "contents")

    /* renamed from: b */
    public List<C5712ae> f15016b;

    /* renamed from: a */
    public final CharSequence mo11639a() {
        if (this.f15016b == null || this.f15016b.size() <= 0) {
            return "";
        }
        int i = -1;
        boolean z = false;
        if (this.f15015a != null) {
            try {
                z = true;
                i = Color.parseColor(this.f15015a);
            } catch (IllegalArgumentException unused) {
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
        for (C5712ae aeVar : this.f15016b) {
            if (aeVar != null && !TextUtils.isEmpty(aeVar.f15013a)) {
                spannableStringBuilder.append(aeVar.f15013a);
                if (z && aeVar.f15014b) {
                    spannableStringBuilder.setSpan(foregroundColorSpan, spannableStringBuilder.length() - aeVar.f15013a.length(), spannableStringBuilder.length(), 33);
                }
            }
        }
        return spannableStringBuilder;
    }
}
