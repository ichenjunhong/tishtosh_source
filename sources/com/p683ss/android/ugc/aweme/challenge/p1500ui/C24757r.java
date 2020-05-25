package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.os.Build.VERSION;
import android.support.p030v4.p037e.C0761a;
import android.support.p030v4.view.C1056u;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.challenge.C24554b;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24681e;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24684f;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.ss.android.ugc.trill.R;
import java.text.Bidi;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.r */
public final class C24757r {
    /* renamed from: a */
    public static void m60290a(String str, TextView textView, boolean z) {
        int i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append("#");
        spannableStringBuilder.append(String.valueOf(str));
        if (VERSION.SDK_INT >= 17) {
            boolean z2 = true;
            if (((View) textView.getParent()).getLayoutDirection() != 1) {
                z2 = false;
            }
            if (z2) {
                i = 5;
            } else {
                i = 3;
            }
            textView.setGravity(i);
        }
        textView.setText(spannableStringBuilder);
        if (z) {
            textView.post(new C24760t(textView, spannableStringBuilder));
        }
    }

    /* renamed from: a */
    public static void m60289a(ChallengeDetailParam challengeDetailParam, Challenge challenge, TextView textView, ViewGroup viewGroup, TextView textView2, ImageView imageView, View view, boolean z) {
        boolean z2;
        int i;
        int i2;
        String str;
        String charSequence;
        int i3;
        int i4;
        int i5;
        TextView textView3 = textView;
        ViewGroup viewGroup2 = viewGroup;
        TextView textView4 = textView2;
        ImageView imageView2 = imageView;
        if (challenge != null) {
            Integer num = (Integer) SharePrefCache.inst().getShowHashTagBg().mo47782d();
            if (num == null || num.intValue() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String desc = challenge.getDesc();
            String challengeName = challenge.getChallengeName();
            String cid = challenge.getCid();
            if (!TextUtils.isEmpty(desc)) {
                if (C47918gj.m103682a(textView.getContext())) {
                    i = -1;
                } else {
                    i = -2;
                }
                boolean baseIsLeftToRight = new Bidi(desc, i).baseIsLeftToRight();
                boolean a = C47918gj.m103682a(viewGroup.getContext());
                C1056u.m3049c((View) (ViewGroup) textView.getParent(), baseIsLeftToRight ^ true ? 1 : 0);
                if (baseIsLeftToRight) {
                    i2 = 3;
                } else {
                    i2 = 5;
                }
                textView3.setGravity(i2);
                if (VERSION.SDK_INT >= 17) {
                    if (baseIsLeftToRight) {
                        i5 = 3;
                    } else {
                        i5 = 2;
                    }
                    textView3.setTextDirection(i5);
                    viewGroup2.setLayoutDirection(a ? 1 : 0);
                }
                String b = C0761a.m2156a(!baseIsLeftToRight).mo2428b(desc);
                if (baseIsLeftToRight) {
                    StringBuilder sb = new StringBuilder("‭");
                    sb.append(b);
                    sb.append(8237);
                    str = sb.toString();
                } else {
                    str = b.replaceAll("(?<!^)(#)([a-zA-Z0-9])", "‎$1‎$2");
                }
                if (!TextUtils.equals(textView.getText(), str)) {
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
                            i4 = (int) imageView.getResources().getDimension(R.dimen.y7);
                        }
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) viewGroup.getLayoutParams();
                        if (z2) {
                            marginLayoutParams.bottomMargin = i4;
                        } else {
                            marginLayoutParams.topMargin = i4;
                        }
                        viewGroup2.setLayoutParams(marginLayoutParams);
                    }
                    int i6 = 32;
                    if (z2) {
                        i6 = 64;
                    }
                    int a2 = ((int) (((float) C9432q.m18670a(textView.getContext())) - C9432q.m18687b(textView.getContext(), (float) i6))) + 0;
                    SpannableString spannableString = new SpannableString(str);
                    if (textView4 == null) {
                        charSequence = "";
                    } else {
                        charSequence = textView2.getText().toString();
                    }
                    C24719i iVar = r12;
                    C24719i iVar2 = new C24719i(textView.getPaint(), a2, true, charSequence, 4);
                    C24554b bVar = new C24554b(cid, challengeName, true);
                    bVar.f64945a = iVar;
                    SpannableString a3 = bVar.mo50296a(spannableString);
                    boolean z3 = iVar.f65461b;
                    if (bVar.f65009d) {
                        textView3.setText(C24684f.m60189a(textView.getContext(), a3.toString(), challenge.getCid(), challenge.getChallengeName()));
                        textView3.setOnTouchListener(C24681e.m60183a());
                    } else {
                        textView3.setText(a3);
                    }
                    int i7 = 8;
                    if (z3) {
                        if (!z3 || TextUtils.isEmpty(str)) {
                            i3 = 8;
                        } else {
                            i3 = 0;
                        }
                        textView4.setVisibility(i3);
                        if (z3 && !TextUtils.isEmpty(str)) {
                            i7 = 0;
                        }
                        imageView2.setVisibility(i7);
                        C24759s sVar = new C24759s(textView, spannableString, imageView, textView2, view, viewGroup, a3, challenge, z2);
                        textView3.post(sVar);
                        return;
                    }
                    imageView2.setVisibility(8);
                    textView4.setVisibility(8);
                }
            }
        }
    }
}
