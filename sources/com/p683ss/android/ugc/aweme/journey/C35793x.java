package com.p683ss.android.ugc.aweme.journey;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C30436k;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.journey.x */
public final class C35793x extends C23526a {

    /* renamed from: a */
    public long f91939a = System.currentTimeMillis();

    /* renamed from: b */
    public View f91940b;

    /* renamed from: c */
    public TextView f91941c;

    /* renamed from: d */
    public View f91942d;

    /* renamed from: e */
    public boolean f91943e;

    /* renamed from: j */
    private HashMap f91944j;

    /* renamed from: com.ss.android.ugc.aweme.journey.x$a */
    static final class C35794a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C35793x f91945a;

        /* renamed from: b */
        final /* synthetic */ float f91946b;

        /* renamed from: c */
        final /* synthetic */ float f91947c;

        C35794a(C35793x xVar, float f, float f2) {
            this.f91945a = xVar;
            this.f91946b = f;
            this.f91947c = f2;
        }

        public final void run() {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f91945a.mo74454e(), "translationY", new float[]{this.f91946b, ((float) (-this.f91945a.mo74455f().getHeight())) + this.f91946b + ((float) this.f91945a.mo74454e().getHeight())});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f91945a.mo74453a(), "translationY", new float[]{((float) this.f91945a.mo74455f().getHeight()) - this.f91947c, -this.f91947c});
            C52711k.m112236a((Object) ofFloat, "obanim");
            ofFloat.setDuration(420);
            C52711k.m112236a((Object) ofFloat2, "obanim2");
            ofFloat2.setDuration(420);
            ofFloat2.setStartDelay(100);
            ofFloat.addListener(new AnimatorListener(this) {

                /* renamed from: a */
                final /* synthetic */ C35794a f91948a;

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                {
                    this.f91948a = r1;
                }

                public final void onAnimationStart(Animator animator) {
                    this.f91948a.f91945a.mo74454e().setAlpha(1.0f);
                }
            });
            ofFloat2.addListener(new AnimatorListener(this) {

                /* renamed from: a */
                final /* synthetic */ C35794a f91949a;

                /* renamed from: com.ss.android.ugc.aweme.journey.x$a$2$a */
                static final class C35797a implements Runnable {

                    /* renamed from: a */
                    final /* synthetic */ C357962 f91950a;

                    C35797a(C357962 r1) {
                        this.f91950a = r1;
                    }

                    public final void run() {
                        String str;
                        this.f91950a.f91949a.f91945a.f91943e = true;
                        C35793x xVar = this.f91950a.f91949a.f91945a;
                        String str2 = "exit_slogan_page";
                        C23089d a = C23089d.m56640a().mo47826a("is_background", xVar.mo20100Z_() ^ true ? 1 : 0).mo47827a("stay_time", System.currentTimeMillis() - xVar.f91939a);
                        String str3 = "if_send_fake_feed";
                        if (C30436k.f79560d) {
                            str = "1";
                        } else {
                            str = "0";
                        }
                        C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
                        C47718bf.m103288a(new C35790u(null, 1, null));
                    }
                }

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                {
                    this.f91949a = r1;
                }

                public final void onAnimationStart(Animator animator) {
                    this.f91949a.f91945a.mo74453a().setAlpha(1.0f);
                }

                public final void onAnimationEnd(Animator animator) {
                    new Handler().postDelayed(new C35797a(this), 1500);
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.start();
        }
    }

    /* renamed from: a */
    private View m80923a(int i) {
        if (this.f91944j == null) {
            this.f91944j = new HashMap();
        }
        View view = (View) this.f91944j.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f91944j.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final View mo74453a() {
        View view = this.f91940b;
        if (view == null) {
            C52711k.m112237a("logoView");
        }
        return view;
    }

    /* renamed from: e */
    public final TextView mo74454e() {
        TextView textView = this.f91941c;
        if (textView == null) {
            C52711k.m112237a("sloganView");
        }
        return textView;
    }

    /* renamed from: f */
    public final View mo74455f() {
        View view = this.f91942d;
        if (view == null) {
            C52711k.m112237a("rootView");
        }
        return view;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f91944j != null) {
            this.f91944j.clear();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C26890h.m65011a("show_slogan_page", (Map<String, String>) new HashMap<String,String>());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        ImageView imageView = (ImageView) m80923a(R.id.ekt);
        C52711k.m112236a((Object) imageView, "logo_icon");
        this.f91940b = imageView;
        DmtTextView dmtTextView = (DmtTextView) m80923a(R.id.ew_);
        C52711k.m112236a((Object) dmtTextView, "slogan");
        this.f91941c = dmtTextView;
        FrameLayout frameLayout = (FrameLayout) m80923a(R.id.ewa);
        C52711k.m112236a((Object) frameLayout, "slogan_root");
        this.f91942d = frameLayout;
        float b = C9432q.m18687b(view.getContext(), 60.0f);
        float b2 = C9432q.m18687b(view.getContext(), 46.0f);
        TextView textView = this.f91941c;
        if (textView == null) {
            C52711k.m112237a("sloganView");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.gvk));
        sb.append("\n");
        sb.append(getString(R.string.gvl));
        textView.setText(sb.toString());
        View view2 = this.f91940b;
        if (view2 == null) {
            C52711k.m112237a("logoView");
        }
        view2.postDelayed(new C35794a(this, b, b2), 1000);
        this.f91939a = System.currentTimeMillis();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.byt, viewGroup, false);
    }
}
