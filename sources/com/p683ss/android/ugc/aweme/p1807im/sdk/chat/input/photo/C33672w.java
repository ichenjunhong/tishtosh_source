package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.photo;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.utils.C47764ch;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.w */
public final class C33672w {

    /* renamed from: a */
    public static int f87298a = 9;

    /* renamed from: d */
    private static int f87299d = 2000;

    /* renamed from: g */
    private static C33672w f87300g = new C33672w();

    /* renamed from: b */
    public boolean f87301b;

    /* renamed from: c */
    public List<C33654h> f87302c = new ArrayList();

    /* renamed from: e */
    private LinkedHashMap<String, C33654h> f87303e = new LinkedHashMap<>();

    /* renamed from: f */
    private long f87304f = 0;

    /* renamed from: a */
    public static C33672w m77098a() {
        return f87300g;
    }

    /* renamed from: c */
    public final int mo71152c() {
        return this.f87303e.size();
    }

    /* renamed from: b */
    public final List<C33654h> mo71150b() {
        return new ArrayList(this.f87303e.values());
    }

    /* renamed from: e */
    public final void mo71154e() {
        this.f87303e.clear();
        this.f87301b = false;
    }

    /* renamed from: f */
    public final void mo71155f() {
        this.f87303e.clear();
        this.f87302c.clear();
        this.f87301b = false;
    }

    /* renamed from: d */
    public final String mo71153d() {
        if (this.f87303e.size() <= 0) {
            return C11010c.m22280a().getString(R.string.bn5);
        }
        return C11010c.m22280a().getString(R.string.bn7, new Object[]{Integer.valueOf(this.f87303e.size())});
    }

    /* renamed from: a */
    public final boolean mo71148a(String str) {
        return this.f87303e.containsKey(str);
    }

    /* renamed from: a */
    public final void mo71147a(C33654h hVar) {
        if (hVar != null) {
            this.f87303e.put(hVar.f87272a.f50916b, hVar);
        }
    }

    /* renamed from: b */
    public final void mo71151b(C33654h hVar) {
        if (hVar != null) {
            this.f87303e.remove(hVar.f87272a.f50916b);
        }
    }

    /* renamed from: c */
    private int m77099c(String str) {
        int i = 1;
        for (String equals : this.f87303e.keySet()) {
            if (str.equals(equals)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public final C33654h mo71149b(String str) {
        if (!C23715d.m58202a((Collection<T>) this.f87302c)) {
            for (C33654h hVar : this.f87302c) {
                if (hVar.f87272a.f50916b.equals(str)) {
                    return hVar;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo71146a(TextView textView, ImageView imageView, View view, String str) {
        if (textView != null && imageView != null && !TextUtils.isEmpty(str)) {
            if (mo71148a(str)) {
                imageView.setSelected(true);
                textView.setText(String.valueOf(m77099c(str)));
                imageView.setImageResource(R.drawable.da6);
                if (view != null) {
                    view.setBackgroundResource(R.color.rr);
                    view.setVisibility(0);
                }
            } else {
                imageView.setSelected(false);
                textView.setText("");
                imageView.setImageResource(R.drawable.az9);
                if (view != null) {
                    if (mo71152c() >= f87298a) {
                        view.setBackgroundResource(R.color.a2o);
                        view.setVisibility(0);
                        return;
                    }
                    view.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo71145a(View view, View view2, TextView textView, ImageView imageView, View view3, String str) {
        final View view4 = view2;
        view2.clearAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "scaleX", new float[]{1.0f, 0.3f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, "scaleY", new float[]{1.0f, 0.3f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        animatorSet.setDuration(50);
        final TextView textView2 = textView;
        final ImageView imageView2 = imageView;
        final View view5 = view3;
        final String str2 = str;
        final View view6 = view;
        C336731 r0 = new AnimatorListener() {
            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationCancel(Animator animator) {
                C33672w.this.mo71146a(textView2, imageView2, view5, str2);
            }

            public final void onAnimationEnd(Animator animator) {
                Animator animator2;
                Animator animator3;
                C33672w.this.mo71146a(textView2, imageView2, view5, str2);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view4, "alpha", new float[]{0.0f, 1.0f});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view4, "scaleX", new float[]{0.3f, 1.0f});
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view4, "scaleY", new float[]{0.3f, 1.0f});
                ObjectAnimator objectAnimator = null;
                if (view6 == null || view5 == null) {
                    animator3 = null;
                    animator2 = null;
                } else {
                    view6.clearAnimation();
                    view5.clearAnimation();
                    if (C33672w.this.mo71148a(str2)) {
                        objectAnimator = ObjectAnimator.ofFloat(view6, "scaleX", new float[]{1.0f, 1.1f});
                        animator3 = ObjectAnimator.ofFloat(view6, "scaleY", new float[]{1.0f, 1.1f});
                        animator2 = ObjectAnimator.ofFloat(view5, "alpha", new float[]{0.0f, 1.0f});
                    } else {
                        objectAnimator = ObjectAnimator.ofFloat(view6, "scaleX", new float[]{1.1f, 1.0f});
                        animator3 = ObjectAnimator.ofFloat(view6, "scaleY", new float[]{1.1f, 1.0f});
                        animator2 = ObjectAnimator.ofFloat(view5, "alpha", new float[]{1.0f, 0.0f});
                    }
                }
                AnimatorSet animatorSet = new AnimatorSet();
                if (objectAnimator == null || animator3 == null || animator2 == null) {
                    animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
                } else {
                    animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, objectAnimator, animator3, animator2});
                }
                animatorSet.setInterpolator(C47764ch.m103394a(2, 0.32f, 0.94f, 0.6f, 1.0f));
                animatorSet.setDuration(300);
                animatorSet.start();
            }
        };
        animatorSet.addListener(r0);
        animatorSet.start();
    }
}
