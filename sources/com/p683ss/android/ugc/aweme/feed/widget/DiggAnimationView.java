package com.p683ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.facebook.p982j.C14433c;
import com.facebook.p982j.C14433c.C14436c;
import com.facebook.p982j.C14455e;
import com.facebook.p982j.p984b.C14430k;
import com.p683ss.android.ugc.aweme.anim.C22681b;
import com.p683ss.android.ugc.aweme.anim.C22686c;
import com.p683ss.android.ugc.aweme.feed.utils.C31199l;
import com.p683ss.android.ugc.aweme.festival.christmas.C31357a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.DiggAnimationView */
public class DiggAnimationView extends AppCompatImageView {

    /* renamed from: a */
    C14433c f81687a;

    /* renamed from: b */
    public C14436c f81688b = new C14436c() {
        /* renamed from: a */
        public final void mo26606a() {
            DiggAnimationView diggAnimationView = DiggAnimationView.this;
            diggAnimationView.setImageAlpha(254);
            boolean a = C31357a.m73095a();
            diggAnimationView.setImageDrawable(C0726c.m2091a(DiggAnimationView.this.getContext(), (int) R.drawable.de4));
        }
    };

    /* renamed from: a */
    public final void mo64027a() {
        animate().scaleY(0.0f).scaleX(0.0f).setDuration(200).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new Runnable() {
            public final void run() {
                C22681b.m55896a().mo47056a(C11010c.m22280a(), "anim_likes_explode", new C22686c() {
                    /* renamed from: a */
                    public final void mo47060a(C14430k kVar, String str) {
                        boolean a = C31357a.m73095a();
                        Drawable a2 = C0726c.m2091a(DiggAnimationView.this.getContext(), (int) R.drawable.df8);
                        if (a2 != null) {
                            a2.setBounds(0, 0, 120, 120);
                            DiggAnimationView.this.f81687a = new C14455e().mo26617a(kVar).f37546c.mo26619a(Pair.create("keyframes", Pair.create(a2, new Matrix()))).mo26618a();
                        }
                        DiggAnimationView diggAnimationView = DiggAnimationView.this;
                        diggAnimationView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(1).start();
                        diggAnimationView.setVisibility(0);
                        diggAnimationView.setLayerType(1, null);
                        diggAnimationView.setImageDrawable(DiggAnimationView.this.f81687a);
                        diggAnimationView.setImageAlpha(0);
                        DiggAnimationView.this.f81687a.mo26591a();
                        DiggAnimationView.this.f81687a.mo26594b();
                        DiggAnimationView.this.f81687a.mo26593a(DiggAnimationView.this.f81688b);
                    }
                });
            }
        }).start();
    }

    public DiggAnimationView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo64028a(View view) {
        boolean z;
        Boolean bool = (Boolean) getTag(C31357a.co7);
        if (bool == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        if (z) {
            C31199l.m72855a(view);
        } else if (!isSelected()) {
            mo64027a();
        } else {
            C31199l.m72855a(view);
        }
    }

    public DiggAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DiggAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
