package com.p683ss.android.ugc.aweme.profile.util;

import android.os.Build.VERSION;
import android.support.p030v4.p037e.C0761a;
import android.support.p030v4.view.C1056u;
import android.text.DynamicLayout;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.C24719i;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.ss.android.ugc.trill.R;
import java.text.Bidi;

/* renamed from: com.ss.android.ugc.aweme.profile.util.j */
public final class C40549j {
    /* renamed from: a */
    public static void m89966a(String str, TextView textView, ViewGroup viewGroup, TextView textView2, ImageView imageView, boolean z) {
        boolean z2;
        int i;
        int i2;
        String str2;
        String charSequence;
        int i3;
        int i4;
        String str3 = str;
        TextView textView3 = textView;
        ViewGroup viewGroup2 = viewGroup;
        TextView textView4 = textView2;
        ImageView imageView2 = imageView;
        if (!TextUtils.isEmpty(str)) {
            Integer num = (Integer) SharePrefCache.inst().getShowHashTagBg().mo47782d();
            if (num == null || num.intValue() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (C47918gj.m103682a(textView.getContext())) {
                i = -1;
            } else {
                i = -2;
            }
            boolean baseIsLeftToRight = new Bidi(str3, i).baseIsLeftToRight();
            boolean a = C47918gj.m103682a(viewGroup.getContext());
            C1056u.m3049c((View) (ViewGroup) textView.getParent(), baseIsLeftToRight ^ true ? 1 : 0);
            int i5 = 3;
            if (baseIsLeftToRight) {
                i2 = 3;
            } else {
                i2 = 5;
            }
            textView3.setGravity(i2);
            if (VERSION.SDK_INT >= 17) {
                if (!baseIsLeftToRight) {
                    i5 = 2;
                }
                textView3.setTextDirection(i5);
                viewGroup2.setLayoutDirection(a ? 1 : 0);
            }
            String b = C0761a.m2156a(!baseIsLeftToRight).mo2428b(str3);
            if (baseIsLeftToRight) {
                StringBuilder sb = new StringBuilder("‭");
                sb.append(b);
                sb.append(8237);
                str2 = sb.toString();
            } else {
                str2 = b.replaceAll("(?<!^)(#)([a-zA-Z0-9])", "‎$1‎$2");
            }
            if (!TextUtils.equals(textView.getText(), str2)) {
                if (!TextUtils.isEmpty(textView.getText())) {
                    imageView2.setSelected(false);
                    if (textView4 != null) {
                        textView4.setText(C23723j.m58219b(R.string.azy));
                    }
                    imageView2.setRotation(0.0f);
                    textView.getLayoutParams().height = -2;
                    if (z2) {
                        i4 = (int) C9432q.m18687b(imageView.getContext(), 20.0f);
                    } else {
                        i4 = (int) imageView.getResources().getDimension(R.dimen.hl);
                    }
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) viewGroup.getLayoutParams();
                    if (z2) {
                        marginLayoutParams.bottomMargin = i4;
                    } else {
                        marginLayoutParams.topMargin = i4;
                    }
                    viewGroup2.setLayoutParams(marginLayoutParams);
                }
                int b2 = (int) C9432q.m18687b(textView.getContext(), 240.0f);
                SpannableString spannableString = new SpannableString(str2);
                if (textView4 == null) {
                    charSequence = "";
                } else {
                    charSequence = textView2.getText().toString();
                }
                C24719i iVar = new C24719i(textView.getPaint(), b2, true, charSequence, 3);
                SpannableString a2 = iVar.mo50296a(spannableString);
                textView3.setText(a2);
                boolean z3 = iVar.f65461b;
                if (z3) {
                    int i6 = b2;
                    int i7 = 8;
                    DynamicLayout dynamicLayout = new DynamicLayout(spannableString.toString(), textView.getPaint(), i6, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                    int height = dynamicLayout.getHeight();
                    if (!z3 || TextUtils.isEmpty(str2)) {
                        i3 = 8;
                    } else {
                        i3 = 0;
                    }
                    textView4.setVisibility(i3);
                    if (z3 && !TextUtils.isEmpty(str2)) {
                        i7 = 0;
                    }
                    imageView2.setVisibility(i7);
                    C40552k kVar = new C40552k(textView, height, dynamicLayout, spannableString, imageView, textView2, viewGroup, z2, a2);
                    textView3.post(kVar);
                    return;
                }
                imageView2.setVisibility(8);
                textView4.setVisibility(8);
            }
        }
    }
}
