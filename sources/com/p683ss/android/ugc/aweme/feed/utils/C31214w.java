package com.p683ss.android.ugc.aweme.feed.utils;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.mix.C37008ab;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.utils.w */
public final class C31214w {
    /* renamed from: a */
    public static boolean m72900a() {
        return C31181ae.m72810a();
    }

    /* renamed from: a */
    public static boolean m72901a(Aweme aweme) {
        if (aweme.isHotSearchAweme() || aweme.isHotVideoAweme() || (aweme.getHotListStruct() != null && !TextUtils.isEmpty(aweme.getHotListStruct().getTitile()))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m72902a(String str) {
        return Keva.getRepo("mix_repo").getBoolean(str, false);
    }

    /* renamed from: a */
    public static void m72898a(TextView textView, CharSequence charSequence) {
        try {
            textView.setText(charSequence);
        } catch (Exception e) {
            C32458a.m75143a(e);
        }
    }

    /* renamed from: a */
    public static void m72899a(String str, boolean z) {
        Keva.getRepo("mix_repo").storeBoolean(str, true);
    }

    /* renamed from: a */
    public static void m72897a(Context context, Aweme aweme, TextView textView) {
        String str;
        boolean z;
        if (m72900a() && aweme.getMixInfo() != null && aweme.getMixInfo().statis != null) {
            if (TextUtils.isEmpty(aweme.getDesc())) {
                aweme.setDesc(" ");
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (textView.getText() == null || TextUtils.isEmpty(textView.getText().toString().trim())) {
                str = context.getResources().getString(R.string.c6u, new Object[]{String.valueOf(aweme.getMixInfo().statis.currentEpisode)});
                z = false;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(context.getResources().getString(R.string.c6u, new Object[]{String.valueOf(aweme.getMixInfo().statis.currentEpisode)}));
                sb.append(" | ");
                str = sb.toString();
                z = true;
            }
            spannableStringBuilder.append(str);
            spannableStringBuilder.append(textView.getText());
            if (z) {
                spannableStringBuilder.setSpan(new C37008ab((float) C23728o.m58246c(14.0d), context.getResources().getColor(R.color.asw)), str.length() - 2, str.length() - 1, 34);
            }
            m72898a(textView, (CharSequence) spannableStringBuilder);
            textView.setVisibility(0);
        }
    }
}
