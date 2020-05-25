package com.p683ss.android.ugc.aweme.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p043v7.p044a.p045a.C1124a;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.common.C10674a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.utils.gh */
public final class C47916gh {

    /* renamed from: a */
    public static final C47916gh f120508a = new C47916gh();

    private C47916gh() {
    }

    /* renamed from: a */
    public static final boolean m103676a(UserVerify userVerify) {
        CharSequence charSequence;
        String str = null;
        if (userVerify != null) {
            charSequence = userVerify.getCustomVerify();
        } else {
            charSequence = null;
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (userVerify != null) {
                str = userVerify.getEnterpriseVerifyReason();
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m103677a(String str, String str2) {
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static int m103678b(Context context, Float f) {
        if (context == null || f == null) {
            return R.drawable.d0p;
        }
        int c = C9432q.m18692c(context, f.floatValue());
        if (c == 17) {
            return R.drawable.d0q;
        }
        if (c == 20) {
            return R.drawable.d0r;
        }
        switch (c) {
            case 12:
            case 13:
            case 14:
            case 15:
                return R.drawable.d0p;
            default:
                return R.drawable.d0r;
        }
    }

    /* renamed from: c */
    private static int m103679c(Context context, Float f) {
        if (context == null || f == null) {
            return (int) C9432q.m18687b(context, 4.0f);
        }
        int c = C9432q.m18692c(context, f.floatValue());
        if (c == 17 || c == 20) {
            return (int) C9432q.m18687b(context, 4.0f);
        }
        switch (c) {
            case 12:
            case 13:
            case 14:
            case 15:
                return (int) C9432q.m18687b(context, 3.0f);
            default:
                return (int) C9432q.m18687b(context, 4.0f);
        }
    }

    /* renamed from: a */
    private static Drawable m103673a(Context context, Float f) {
        if (context == null || f == null) {
            return null;
        }
        int c = C9432q.m18692c(context, f.floatValue());
        if (c == 17) {
            return C1124a.m3315b(context, R.drawable.d0q);
        }
        if (c == 20) {
            return C1124a.m3315b(context, R.drawable.d0r);
        }
        switch (c) {
            case 12:
            case 13:
            case 14:
            case 15:
                return C1124a.m3315b(context, R.drawable.d0p);
            default:
                return C1124a.m3315b(context, R.drawable.d0r);
        }
    }

    /* renamed from: a */
    public static final void m103674a(Context context, UserVerify userVerify, TextView textView) {
        if (!(context == null || userVerify == null || textView == null || !m103676a(userVerify))) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(textView.getText());
            String str = " T";
            spannableStringBuilder.append(str);
            spannableStringBuilder.setSpan(new C10674a(context, m103678b(context, Float.valueOf(textView.getTextSize()))), (spannableStringBuilder.length() - str.length()) + 1, spannableStringBuilder.length(), 17);
            textView.setText(spannableStringBuilder);
        }
    }

    /* renamed from: a */
    public static final void m103675a(Context context, String str, String str2, TextView textView) {
        if (context != null && textView != null) {
            Drawable a = m103673a(context, Float.valueOf(textView.getTextSize()));
            if (!m103677a(str, str2) || a == null) {
                if (VERSION.SDK_INT >= 17) {
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, null, null);
                } else {
                    textView.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
                }
            } else if (VERSION.SDK_INT >= 17) {
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, a, null);
                textView.setCompoundDrawablePadding(m103679c(context, Float.valueOf(textView.getTextSize())));
            } else {
                a.setBounds(0, 0, a.getIntrinsicWidth(), a.getIntrinsicHeight());
                textView.setCompoundDrawablesWithIntrinsicBounds(null, null, m103673a(context, Float.valueOf(textView.getTextSize())), null);
                textView.setCompoundDrawablePadding(m103679c(context, Float.valueOf(textView.getTextSize())));
            }
        }
    }
}
