package com.p683ss.android.ugc.aweme.longvideo.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.facebook.p982j.C14433c;
import com.facebook.p982j.C14433c.C14436c;
import com.facebook.p982j.C14455e;
import com.facebook.p982j.p984b.C14430k;
import com.p683ss.android.ugc.aweme.anim.C22681b;
import com.p683ss.android.ugc.aweme.anim.C22686c;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.feed.utils.C31199l;
import com.p683ss.android.ugc.aweme.festival.christmas.C31357a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView */
public class LongVideoDiggAnimationView extends AppCompatImageView {

    /* renamed from: a */
    C14433c f93180a;

    /* renamed from: b */
    public C14436c f93181b = new C14436c() {
        /* renamed from: a */
        public final void mo26606a() {
            LongVideoDiggAnimationView longVideoDiggAnimationView = LongVideoDiggAnimationView.this;
            longVideoDiggAnimationView.setImageAlpha(254);
            boolean a = C31357a.m73095a();
            longVideoDiggAnimationView.setImageDrawable(C0726c.m2091a(LongVideoDiggAnimationView.this.getContext(), (int) R.drawable.cvp));
        }
    };

    public LongVideoDiggAnimationView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo75316a(View view) {
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
            animate().scaleY(0.0f).scaleX(0.0f).setDuration(200).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new Runnable() {
                public final void run() {
                    C22681b.m55896a().mo47056a(AwemeApplication.m56199a(), "new_follow_anim_likes_explode", new C22686c() {
                        /* renamed from: a */
                        public final void mo47060a(C14430k kVar, String str) {
                            boolean a = C31357a.m73095a();
                            Drawable a2 = C0726c.m2091a(LongVideoDiggAnimationView.this.getContext(), (int) R.drawable.df8);
                            if (a2 != null) {
                                a2.setBounds(0, 0, 120, 114);
                                LongVideoDiggAnimationView.this.f93180a = new C14455e().mo26617a(kVar).f37546c.mo26619a(Pair.create("keyframes", Pair.create(a2, new Matrix()))).mo26618a();
                            }
                            LongVideoDiggAnimationView longVideoDiggAnimationView = LongVideoDiggAnimationView.this;
                            longVideoDiggAnimationView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(1).start();
                            longVideoDiggAnimationView.setVisibility(0);
                            longVideoDiggAnimationView.setLayerType(1, null);
                            longVideoDiggAnimationView.setImageDrawable(LongVideoDiggAnimationView.this.f93180a);
                            longVideoDiggAnimationView.setImageAlpha(0);
                            LongVideoDiggAnimationView.this.f93180a.mo26591a();
                            LongVideoDiggAnimationView.this.f93180a.mo26594b();
                            LongVideoDiggAnimationView.this.f93180a.mo26593a(LongVideoDiggAnimationView.this.f93181b);
                        }
                    });
                }
            }).start();
        } else {
            C31199l.m72855a(view);
        }
    }

    public LongVideoDiggAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LongVideoDiggAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
