package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.translation.C47352a;
import com.p683ss.android.ugc.aweme.translation.p2371a.C47354b;
import com.p683ss.android.ugc.aweme.translation.p2371a.C47356c;
import com.p683ss.android.ugc.aweme.translation.p2371a.C47357d;
import com.p683ss.android.ugc.aweme.translation.p2372b.C47358a;
import com.p683ss.android.ugc.aweme.translation.p2373ui.C47364a;
import com.p683ss.android.ugc.aweme.translation.p2373ui.TranslationStatusView;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.dl */
public final class C40329dl implements C47364a {

    /* renamed from: a */
    public TranslationStatusView f102935a;

    /* renamed from: b */
    public TextView f102936b;

    /* renamed from: c */
    public User f102937c;

    /* renamed from: d */
    public C47358a f102938d = new C47358a(new C47354b(), this);

    /* renamed from: e */
    public String f102939e;

    /* renamed from: f */
    private Context f102940f;

    /* renamed from: a */
    public final void mo63628a(Exception exc) {
        C22971a.m56493a(this.f102940f, (Throwable) exc);
        this.f102935a.setStatus(0);
    }

    /* renamed from: a */
    public final void mo63623a(C47356c cVar) {
        this.f102935a.setStatus(2);
        C47357d dVar = new C47357d();
        dVar.f119516b = 2;
        dVar.f119515a = cVar.f119513a;
        dVar.f119517c = new ArrayList();
        C47352a.m102708a().mo94635a(this.f102939e, dVar);
        mo82585a(this.f102936b, dVar.f119515a);
    }

    /* renamed from: a */
    public final void mo82585a(final TextView textView, final String str) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(textView, "alpha", new float[]{0.0f}).setDuration(150);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(textView, "alpha", new float[]{0.0f, 1.0f}).setDuration(150);
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                textView.setText(str);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{duration, duration2});
        animatorSet.start();
    }

    public C40329dl(Context context, TranslationStatusView translationStatusView, TextView textView) {
        this.f102940f = context;
        this.f102935a = translationStatusView;
        this.f102936b = textView;
    }
}
