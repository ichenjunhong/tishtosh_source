package com.p683ss.android.ugc.aweme.journey;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.CardView;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23279d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.welcome.WelcomeVideoWidget;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52724b;

/* renamed from: com.ss.android.ugc.aweme.journey.o */
public final class C35769o extends C23526a {

    /* renamed from: a */
    public ObjectAnimator f91866a;

    /* renamed from: b */
    public long f91867b = System.currentTimeMillis();

    /* renamed from: c */
    public GestureDetector f91868c;

    /* renamed from: d */
    public float f91869d;

    /* renamed from: e */
    public float f91870e;

    /* renamed from: j */
    public View f91871j;

    /* renamed from: k */
    public TextView f91872k;

    /* renamed from: l */
    public String f91873l;

    /* renamed from: m */
    public String f91874m;

    /* renamed from: n */
    public String f91875n;

    /* renamed from: o */
    public boolean f91876o;

    /* renamed from: p */
    private HashMap f91877p;

    /* renamed from: com.ss.android.ugc.aweme.journey.o$a */
    static final class C35770a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35769o f91878a;

        C35770a(C35769o oVar) {
            this.f91878a = oVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f91878a.mo74430a("click");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.o$b */
    static final class C35771b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35769o f91879a;

        C35771b(C35769o oVar) {
            this.f91879a = oVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f91879a.f91876o = true;
            this.f91879a.mo74431b("click");
            C47718bf.m103288a(new C35790u(null, 1, null));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.o$c */
    static final class C35772c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C35769o f91880a;

        C35772c(C35769o oVar) {
            this.f91880a = oVar;
        }

        public final void run() {
            this.f91880a.mo74430a("auto");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.o$d */
    public static final class C35773d extends SimpleOnGestureListener {

        /* renamed from: a */
        final /* synthetic */ C35769o f91881a;

        C35773d(C35769o oVar) {
            this.f91881a = oVar;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C52711k.m112240b(motionEvent, "e1");
            C52711k.m112240b(motionEvent2, "e2");
            if (motionEvent2.getRawY() - motionEvent.getRawY() < 0.0f && Math.abs(motionEvent2.getRawY() - motionEvent.getRawY()) >= 25.0f && Math.abs(f2) >= 400.0f) {
                if (!this.f91881a.f91876o) {
                    this.f91881a.f91876o = true;
                    this.f91881a.mo74431b("slide_up");
                }
                C35769o.m80902a();
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.o$e */
    static final class C35774e implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C35769o f91882a;

        C35774e(C35769o oVar) {
            this.f91882a = oVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C52711k.m112236a((Object) motionEvent, "event");
            switch (motionEvent.getAction()) {
                case 0:
                    this.f91882a.f91869d = motionEvent.getRawY();
                    break;
                case 1:
                    if (Math.abs(C35769o.m80901a(this.f91882a).getTranslationY()) < ((float) (C35769o.m80901a(this.f91882a).getMeasuredHeight() / 3))) {
                        C35769o oVar = this.f91882a;
                        View view2 = oVar.f91871j;
                        if (view2 == null) {
                            C52711k.m112237a("viewRoot");
                        }
                        view2.clearAnimation();
                        View view3 = oVar.f91871j;
                        if (view3 == null) {
                            C52711k.m112237a("viewRoot");
                        }
                        ObjectAnimator.ofFloat(view3, View.TRANSLATION_Y, new float[]{0.0f}).start();
                        break;
                    } else {
                        if (!this.f91882a.f91876o) {
                            this.f91882a.mo74431b("slide_up");
                            this.f91882a.f91876o = true;
                        }
                        C35769o.m80902a();
                        break;
                    }
                case 2:
                    this.f91882a.f91870e = ((float) ((int) motionEvent.getRawY())) - this.f91882a.f91869d;
                    if (this.f91882a.f91870e < 0.0f) {
                        C35769o.m80901a(this.f91882a).setTranslationY(this.f91882a.f91870e);
                        break;
                    }
                    break;
            }
            GestureDetector gestureDetector = this.f91882a.f91868c;
            if (gestureDetector == null) {
                C52711k.m112237a("mGestureDetector");
            }
            gestureDetector.onTouchEvent(motionEvent);
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.o$f */
    static final class C35775f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C35769o f91883a;

        /* renamed from: b */
        final /* synthetic */ C52724b f91884b;

        C35775f(C35769o oVar, C52724b bVar) {
            this.f91883a = oVar;
            this.f91884b = bVar;
        }

        public final void run() {
            if (this.f91883a.isViewValid()) {
                TextView textView = this.f91883a.f91872k;
                if (textView == null) {
                    C52711k.m112237a("startWatchingView");
                }
                int top = textView.getTop();
                View a = this.f91883a.mo74429a((int) R.id.ao3);
                C52711k.m112236a((Object) a, "header");
                float bottom = ((float) (top - a.getBottom())) - C9432q.m18687b(this.f91883a.getContext(), 24.0f);
                if (bottom < this.f91884b.element) {
                    CardView cardView = (CardView) this.f91883a.mo74429a((int) R.id.doz);
                    C52711k.m112236a((Object) cardView, "video_container");
                    cardView.getLayoutParams().height = (int) bottom;
                    CardView cardView2 = (CardView) this.f91883a.mo74429a((int) R.id.doz);
                    C52711k.m112236a((Object) cardView2, "video_container");
                    LayoutParams layoutParams = cardView2.getLayoutParams();
                    CardView cardView3 = (CardView) this.f91883a.mo74429a((int) R.id.doz);
                    C52711k.m112236a((Object) cardView3, "video_container");
                    layoutParams.width = cardView3.getLayoutParams().height;
                    CardView cardView4 = (CardView) this.f91883a.mo74429a((int) R.id.doz);
                    C52711k.m112236a((Object) cardView4, "video_container");
                    CardView cardView5 = (CardView) this.f91883a.mo74429a((int) R.id.doz);
                    C52711k.m112236a((Object) cardView5, "video_container");
                    cardView4.setLayoutParams(cardView5.getLayoutParams());
                }
            }
        }
    }

    /* renamed from: a */
    public final View mo74429a(int i) {
        if (this.f91877p == null) {
            this.f91877p = new HashMap();
        }
        View view = (View) this.f91877p.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f91877p.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void onResume() {
        super.onResume();
        this.f91867b = System.currentTimeMillis();
    }

    public final void onStop() {
        if (!this.f91876o) {
            mo74431b("background");
        }
        super.onStop();
    }

    /* renamed from: a */
    public static void m80902a() {
        C47718bf.m103288a(new C35790u(null, 1, null));
    }

    public final void onDestroyView() {
        ObjectAnimator objectAnimator = this.f91866a;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.f91866a;
            if (objectAnimator2 == null) {
                C52711k.m112234a();
            }
            objectAnimator2.cancel();
        }
        super.onDestroyView();
        if (this.f91877p != null) {
            this.f91877p.clear();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ View m80901a(C35769o oVar) {
        View view = oVar.f91871j;
        if (view == null) {
            C52711k.m112237a("viewRoot");
        }
        return view;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C26890h.m65011a("welcomescreen_show", (Map<String, String>) new HashMap<String,String>());
    }

    /* renamed from: b */
    public final void mo74431b(String str) {
        C52711k.m112240b(str, "enterMethod");
        try {
            C26890h.m65011a("exit_welcomescreen", C23089d.m56640a().mo47829a("enter_method", str).mo47827a("duration", System.currentTimeMillis() - this.f91867b).mo47826a("if_send_fake_feed", C35781s.f91898c).mo47829a("debuginfo", C35781s.f91900e.toString()).f61491a);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo74430a(String str) {
        if (isViewValid()) {
            TextView textView = this.f91872k;
            if (textView == null) {
                C52711k.m112237a("startWatchingView");
            }
            if (textView.getVisibility() != 0) {
                TextView textView2 = this.f91872k;
                if (textView2 == null) {
                    C52711k.m112237a("startWatchingView");
                }
                textView2.setAlpha(0.0f);
                TextView textView3 = this.f91872k;
                if (textView3 == null) {
                    C52711k.m112237a("startWatchingView");
                }
                textView3.setVisibility(0);
                C26890h.m65011a("start_watching_button_show", C23089d.m56640a().mo47829a("start_watching_button_show", str).mo47827a("duration", System.currentTimeMillis() - this.f91867b).f61491a);
                TextView textView4 = this.f91872k;
                if (textView4 == null) {
                    C52711k.m112237a("startWatchingView");
                }
                this.f91866a = ObjectAnimator.ofFloat(textView4, "alpha", new float[]{0.0f, 1.0f});
                ObjectAnimator objectAnimator = this.f91866a;
                if (objectAnimator == null) {
                    C52711k.m112234a();
                }
                objectAnimator.setDuration(200);
                ObjectAnimator objectAnimator2 = this.f91866a;
                if (objectAnimator2 == null) {
                    C52711k.m112234a();
                }
                objectAnimator2.start();
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        float f;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        DmtTextView dmtTextView = (DmtTextView) mo74429a((int) R.id.ewy);
        C52711k.m112236a((Object) dmtTextView, "start_watching");
        this.f91872k = dmtTextView;
        if (TextUtils.isEmpty(this.f91873l)) {
            DmtTextView dmtTextView2 = (DmtTextView) mo74429a((int) R.id.title);
            C52711k.m112236a((Object) dmtTextView2, "title");
            dmtTextView2.setText(getString(R.string.gvh));
        } else {
            DmtTextView dmtTextView3 = (DmtTextView) mo74429a((int) R.id.title);
            C52711k.m112236a((Object) dmtTextView3, "title");
            dmtTextView3.setText(this.f91873l);
        }
        if (TextUtils.isEmpty(this.f91874m)) {
            DmtTextView dmtTextView4 = (DmtTextView) mo74429a((int) R.id.ck1);
            C52711k.m112236a((Object) dmtTextView4, "second_title");
            dmtTextView4.setText(getString(R.string.gvg));
        } else {
            DmtTextView dmtTextView5 = (DmtTextView) mo74429a((int) R.id.ck1);
            C52711k.m112236a((Object) dmtTextView5, "second_title");
            dmtTextView5.setText(this.f91874m);
        }
        if (!TextUtils.isEmpty(this.f91875n)) {
            TextView textView = this.f91872k;
            if (textView == null) {
                C52711k.m112237a("startWatchingView");
            }
            textView.setText(this.f91875n);
        }
        DmtTextView dmtTextView6 = (DmtTextView) mo74429a((int) R.id.cp4);
        C52711k.m112236a((Object) dmtTextView6, "skip");
        dmtTextView6.setAlpha(0.0f);
        DmtTextView dmtTextView7 = (DmtTextView) mo74429a((int) R.id.cp4);
        C52711k.m112236a((Object) dmtTextView7, "skip");
        boolean z = false;
        dmtTextView7.setEnabled(false);
        ConstraintLayout constraintLayout = (ConstraintLayout) mo74429a((int) R.id.cfc);
        C52711k.m112236a((Object) constraintLayout, "root");
        ViewParent parent = constraintLayout.getParent();
        if (parent != null) {
            this.f91871j = (View) parent;
            ((ConstraintLayout) mo74429a((int) R.id.cfc)).setOnClickListener(new C35770a(this));
            TextView textView2 = this.f91872k;
            if (textView2 == null) {
                C52711k.m112237a("startWatchingView");
            }
            textView2.setOnClickListener(new C35771b(this));
            ((ConstraintLayout) mo74429a((int) R.id.cfc)).postDelayed(new C35772c(this), 2000);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) mo74429a((int) R.id.cfc);
            C52711k.m112236a((Object) constraintLayout2, "root");
            this.f91868c = new GestureDetector(constraintLayout2.getContext(), new C35773d(this));
            FragmentActivity activity = getActivity();
            if (activity != null) {
                if (((NewUserJourneyActivity) activity).f91686e) {
                    ((ConstraintLayout) mo74429a((int) R.id.cfc)).setOnTouchListener(new C35774e(this));
                }
                C23279d.m57256a((Fragment) this, (View) (CardView) mo74429a((int) R.id.doz)).mo48251a((View) (CardView) mo74429a((int) R.id.doz), (Widget) new WelcomeVideoWidget());
                int a = C9432q.m18670a(getContext());
                float f2 = (float) a;
                if ((((float) C9432q.m18688b(getContext())) * 1.0f) / f2 < 1.7777778f) {
                    z = true;
                }
                Context context = getContext();
                if (z) {
                    f = 300.0f;
                } else {
                    f = 376.0f;
                }
                float b = C9432q.m18687b(context, f);
                C52724b bVar = new C52724b();
                bVar.element = b;
                if (f2 < b) {
                    bVar.element = f2;
                    CardView cardView = (CardView) mo74429a((int) R.id.doz);
                    C52711k.m112236a((Object) cardView, "video_container");
                    cardView.getLayoutParams().height = a;
                    CardView cardView2 = (CardView) mo74429a((int) R.id.doz);
                    C52711k.m112236a((Object) cardView2, "video_container");
                    LayoutParams layoutParams = cardView2.getLayoutParams();
                    CardView cardView3 = (CardView) mo74429a((int) R.id.doz);
                    C52711k.m112236a((Object) cardView3, "video_container");
                    layoutParams.width = cardView3.getLayoutParams().height;
                } else if (z) {
                    CardView cardView4 = (CardView) mo74429a((int) R.id.doz);
                    C52711k.m112236a((Object) cardView4, "video_container");
                    cardView4.getLayoutParams().height = (int) b;
                    CardView cardView5 = (CardView) mo74429a((int) R.id.doz);
                    C52711k.m112236a((Object) cardView5, "video_container");
                    LayoutParams layoutParams2 = cardView5.getLayoutParams();
                    CardView cardView6 = (CardView) mo74429a((int) R.id.doz);
                    C52711k.m112236a((Object) cardView6, "video_container");
                    layoutParams2.width = cardView6.getLayoutParams().height;
                }
                ((CardView) mo74429a((int) R.id.doz)).post(new C35775f(this, bVar));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.NewUserJourneyActivity");
        }
        throw new C52857u("null cannot be cast to non-null type android.view.View");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.bap, viewGroup, false);
    }
}
