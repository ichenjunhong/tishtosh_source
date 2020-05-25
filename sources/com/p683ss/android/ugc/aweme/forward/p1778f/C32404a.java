package com.p683ss.android.ugc.aweme.forward.p1778f;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.facebook.p982j.C14433c;
import com.facebook.p982j.C14433c.C14436c;
import com.facebook.p982j.C14455e;
import com.facebook.p982j.p984b.C14430k;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.anim.C22681b;
import com.p683ss.android.ugc.aweme.anim.C22686c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.flowfeed.p1753b.C31753a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.CommentLikeListView;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47789cu;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.forward.f.a */
public final class C32404a {

    /* renamed from: a */
    public ImageView f84319a;

    /* renamed from: b */
    public CommentLikeListView f84320b;

    /* renamed from: c */
    public long f84321c;

    /* renamed from: d */
    public C14433c f84322d;

    /* renamed from: e */
    public C31754a f84323e;

    /* renamed from: f */
    public boolean f84324f;

    /* renamed from: g */
    public Context f84325g;

    /* renamed from: h */
    public Aweme f84326h;

    /* renamed from: i */
    public C14436c f84327i = new C14436c() {
        /* renamed from: a */
        public final void mo26606a() {
            ImageView imageView = C32404a.this.f84319a;
            imageView.setImageAlpha(254);
            imageView.setImageDrawable(C0726c.m2091a(C32404a.this.f84325g, (int) R.drawable.cx4));
        }
    };

    /* renamed from: j */
    private TextView f84328j;

    /* renamed from: k */
    private long f84329k;

    /* renamed from: l */
    private int f84330l;

    /* renamed from: m */
    private int f84331m;

    /* renamed from: n */
    private int f84332n;

    /* renamed from: o */
    private int f84333o;

    /* renamed from: p */
    private int f84334p;

    /* renamed from: q */
    private boolean f84335q;

    /* renamed from: a */
    public void mo65601a(boolean z) {
        if (this.f84326h != null) {
            this.f84324f = z;
            this.f84319a.setSelected(z);
            if (!this.f84335q) {
                if (z) {
                    if (this.f84330l == 1) {
                        this.f84328j.setText(m74926a(this.f84329k));
                    } else {
                        this.f84328j.setText(m74926a(this.f84329k + 1));
                    }
                } else if (this.f84330l == 1) {
                    this.f84328j.setText(m74926a(this.f84329k - 1));
                } else {
                    this.f84328j.setText(m74926a(this.f84329k));
                }
            } else if (this.f84320b != null) {
                if (z) {
                    if (this.f84330l != 1) {
                        this.f84320b.mo64896a(this.f84329k + 1);
                        return;
                    }
                } else if (this.f84330l == 1) {
                    this.f84320b.mo64896a(this.f84329k - 1);
                    return;
                }
                this.f84320b.mo64896a(this.f84329k);
            }
        }
    }

    /* renamed from: a */
    public void mo65598a() {
        this.f84319a.animate().scaleY(0.0f).scaleX(0.0f).setDuration(200).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new Runnable() {
            public final void run() {
                C22681b.m55896a().mo47056a(C11010c.m22280a(), "new_follow_anim_likes_explode", new C22686c() {
                    /* renamed from: a */
                    public final void mo47060a(C14430k kVar, String str) {
                        Drawable a = C0726c.m2091a(C32404a.this.f84325g, (int) R.drawable.df8);
                        if (a != null) {
                            a.setBounds(0, 0, 120, 114);
                            C32404a.this.f84322d = new C14455e().mo26617a(kVar).f37546c.mo26619a(Pair.create("keyframes", Pair.create(a, new Matrix()))).mo26618a();
                        }
                        ImageView imageView = C32404a.this.f84319a;
                        imageView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(1).start();
                        imageView.setVisibility(0);
                        imageView.setLayerType(1, null);
                        imageView.setImageDrawable(C32404a.this.f84322d);
                        imageView.setImageAlpha(0);
                        C32404a.this.f84322d.mo26591a();
                        C32404a.this.f84322d.mo26594b();
                        C32404a.this.f84322d.mo26593a(C32404a.this.f84327i);
                    }
                });
            }
        }).start();
    }

    /* renamed from: a */
    private static String m74926a(long j) {
        if (j > 0) {
            return C33095b.m76068a(j);
        }
        if (!C47789cu.m103418a()) {
            return "0";
        }
        return C11010c.m22280a().getString(R.string.apm);
    }

    /* renamed from: a */
    private void m74927a(final View view) {
        if (view != null) {
            view.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80).withEndAction(new Runnable() {
                public final void run() {
                    view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start();
                }
            }).start();
        }
    }

    /* renamed from: b */
    public final void mo65602b(Aweme aweme) {
        if (this.f84325g != null && aweme != null) {
            if (!this.f84324f) {
                this.f84321c++;
                mo65601a(true);
                return;
            }
            if (this.f84324f) {
                this.f84321c--;
                mo65601a(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo65599a(Aweme aweme) {
        long j;
        this.f84326h = aweme;
        if (!this.f84335q) {
            String e = C31753a.m73745e(this.f84326h);
            if (!TextUtils.isEmpty(e)) {
                this.f84328j.setText(e);
            }
        }
        if (this.f84326h.getStatistics() == null) {
            j = 0;
        } else {
            j = this.f84326h.getStatistics().getDiggCount();
        }
        this.f84321c = j;
        this.f84329k = this.f84321c;
        this.f84330l = this.f84326h.getUserDigg();
        boolean z = true;
        if (this.f84326h.getUserDigg() != 1) {
            z = false;
        }
        mo65601a(z);
    }

    /* renamed from: a */
    private void m74928a(Aweme aweme, long j) {
        if (this.f84325g != null && aweme != null) {
            boolean z = true;
            if (!this.f84324f && aweme.getUserDigg() == 0) {
                this.f84321c++;
                mo65601a(true);
                if (this.f84323e != null) {
                    this.f84323e.mo64652a(this.f84326h, 1, "click_like", j);
                }
            } else if (!this.f84324f || aweme.getUserDigg() == 0) {
                if (aweme.getUserDigg() != 1) {
                    z = false;
                }
                this.f84324f = z;
                mo65601a(this.f84324f);
                if (this.f84324f) {
                    this.f84321c++;
                    return;
                }
                this.f84321c--;
            } else {
                this.f84321c--;
                mo65601a(false);
                if (this.f84323e != null) {
                    this.f84323e.mo64652a(this.f84326h, 0, "click_like", j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m74929a(Aweme aweme, View view) {
        if (aweme != null) {
            if (this.f84324f || aweme.getUserDigg() != 0) {
                m74927a(view);
            } else {
                mo65598a();
            }
        }
    }

    /* renamed from: a */
    public final void mo65600a(String str, long j) {
        String str2;
        if (!C20854a.m53167g().isLogin()) {
            if (this.f84326h != null) {
                str2 = this.f84326h.getAid();
            } else {
                str2 = "";
            }
            C27965f.m66720a(C11016e.m22312g(), str, "click_like", C47661ab.m103163a().mo94972a("group_id", str2).mo94972a("log_pb", C23198ae.m56874k(str2)).f120139a);
            return;
        }
        m74929a(this.f84326h, (View) this.f84319a);
        if (!C32409b.m74937a(this.f84325g)) {
            C10691a.m21542b(this.f84325g, (int) R.string.cg1).mo19066a();
        } else {
            m74928a(this.f84326h, j);
        }
    }

    public C32404a(Context context, ImageView imageView, TextView textView, C31754a aVar, boolean z) {
        this.f84325g = context;
        this.f84323e = aVar;
        this.f84335q = z;
        this.f84319a = imageView;
        this.f84328j = textView;
        this.f84331m = (int) C9432q.m18687b(this.f84325g, 25.0f);
        this.f84332n = (int) C9432q.m18687b(this.f84325g, 25.0f);
        this.f84333o = (int) C9432q.m18687b(this.f84325g, 25.0f);
        this.f84334p = this.f84333o;
        LayoutParams layoutParams = this.f84319a.getLayoutParams();
        if (layoutParams.width != this.f84331m || layoutParams.height != this.f84332n) {
            layoutParams.width = this.f84331m;
            layoutParams.height = this.f84332n;
            this.f84319a.setScaleType(ScaleType.CENTER_INSIDE);
            this.f84319a.setLayoutParams(layoutParams);
        } else if (!(layoutParams.width == this.f84333o && layoutParams.height == this.f84334p)) {
            layoutParams.width = this.f84333o;
            layoutParams.height = this.f84334p;
            this.f84319a.setLayoutParams(layoutParams);
        }
        this.f84319a.setImageResource(R.drawable.cx4);
    }
}
