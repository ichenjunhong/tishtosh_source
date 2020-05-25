package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.comment.services.C25281a.C25282a;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.p1334ai.C22546a;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45549f;
import com.p683ss.android.ugc.aweme.views.MentionTextView;
import com.p683ss.android.ugc.aweme.views.MentionTextView.C48160d;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.aa */
public final class C25330aa implements C25336ae {

    /* renamed from: a */
    public MentionTextView f66999a;

    /* renamed from: b */
    public Context f67000b;

    /* renamed from: a */
    public final C0184k mo51880a() {
        return (C0184k) C23729p.m58248a(this.f67000b);
    }

    public C25330aa(Context context, MentionTextView mentionTextView) {
        this.f67000b = context;
        this.f66999a = mentionTextView;
    }

    /* renamed from: a */
    public final void mo51881a(final String str, final List<TextExtraStruct> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f66999a, "alpha", new float[]{0.0f}).setDuration(100);
        duration.setInterpolator(new C22546a());
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f66999a, "alpha", new float[]{0.0f, 1.0f}).setDuration(100);
        duration2.setInterpolator(new C22546a());
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C25330aa.this.f66999a.setText(str);
                C29408b.m69342a((TextView) C25330aa.this.f66999a);
                C25330aa.this.f66999a.mo95551a(list, (C48160d) new C45549f(C25282a.m61494a().isChallengeToHashTag()));
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{duration, duration2});
        animatorSet.start();
    }
}
