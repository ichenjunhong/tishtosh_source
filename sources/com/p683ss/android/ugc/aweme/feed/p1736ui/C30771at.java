package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.feed.api.C30151i;
import com.p683ss.android.ugc.aweme.feed.experiment.C30225e;
import com.p683ss.android.ugc.aweme.feed.experiment.FollowLiveSkylightExperiment;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30495q;
import com.p683ss.android.ugc.aweme.main.experiment.ReleaseWindowBackgroundExperiment;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.at */
public final class C30771at {

    /* renamed from: f */
    public static final C30772a f80644f = new C30772a(null);

    /* renamed from: a */
    C30495q f80645a;

    /* renamed from: b */
    C30776au f80646b;

    /* renamed from: c */
    List<C30151i> f80647c = new ArrayList();

    /* renamed from: d */
    public WeakReference<FragmentActivity> f80648d;

    /* renamed from: e */
    public final AnimatorSet f80649e = new AnimatorSet();

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.at$a */
    public static final class C30772a {
        private C30772a() {
        }

        public /* synthetic */ C30772a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.at$b */
    public static final class C30773b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f80650a;

        C30773b(View view) {
            this.f80650a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            C52711k.m112240b(animator, "animation");
            this.f80650a.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.at$c */
    public static final class C30774c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f80651a;

        C30774c(View view) {
            this.f80651a = view;
        }

        public final void onAnimationStart(Animator animator) {
            C52711k.m112240b(animator, "animation");
            this.f80651a.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.at$d */
    public static final class C30775d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C30771at f80652a;

        /* renamed from: b */
        final /* synthetic */ float f80653b;

        /* renamed from: c */
        final /* synthetic */ float f80654c;

        /* renamed from: d */
        final /* synthetic */ View f80655d;

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f80653b > this.f80654c && C10181b.m20511a().mo18172a(ReleaseWindowBackgroundExperiment.class, true, "is_release_window_background", 31744, true)) {
                WeakReference<FragmentActivity> weakReference = this.f80652a.f80648d;
                if (weakReference != null) {
                    FragmentActivity fragmentActivity = (FragmentActivity) weakReference.get();
                    if (fragmentActivity != null) {
                        Window window = fragmentActivity.getWindow();
                        if (window != null) {
                            window.setBackgroundDrawable(new ColorDrawable(C0726c.m2098c(this.f80655d.getContext(), R.color.ip)));
                        }
                    }
                }
            }
        }

        C30775d(C30771at atVar, float f, float f2, View view) {
            this.f80652a = atVar;
            this.f80653b = f;
            this.f80654c = f2;
            this.f80655d = view;
        }
    }

    /* renamed from: b */
    public static int m72148b() {
        return C23728o.m58241a(173.0d) + C23724k.m58225c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo63477a() {
        C30776au auVar = this.f80646b;
        if (auVar == null) {
            C52711k.m112237a("mListView");
        }
        auVar.setData(this.f80647c);
    }

    /* renamed from: a */
    public final void mo63481a(List<C30151i> list) {
        C52711k.m112240b(list, "followingInterestUsers");
        this.f80647c = list;
        mo63477a();
    }

    /* renamed from: a */
    public final void mo63480a(String str) {
        C52711k.m112240b(str, "enterFrom");
        if (C30225e.m70969a() || C10181b.m20511a().mo18168a(FollowLiveSkylightExperiment.class, true, "i18n_following_live_skylight_type", 31744, 0) != 0) {
            C30495q qVar = this.f80645a;
            if (qVar == null) {
                C52711k.m112237a("mPresenter");
            }
            qVar.mo60918a(str);
        }
    }

    /* renamed from: b */
    public final int mo63482b(String str) {
        C52711k.m112240b(str, "uid");
        int size = this.f80647c.size();
        Iterable iterable = this.f80647c;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            String uid = ((C30151i) next).getUser().getUid();
            boolean z = true;
            if (uid != null && TextUtils.equals(uid, str)) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        this.f80647c = C52575l.m112139e((Collection<? extends T>) (List) arrayList);
        if (this.f80647c.size() != size) {
            mo63477a();
        }
        return this.f80647c.size();
    }

    /* renamed from: a */
    public final void mo63479a(View view, boolean z) {
        C52711k.m112240b(view, "view");
        this.f80649e.cancel();
        this.f80649e.removeAllListeners();
        if (z) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleX", new float[]{0.0f, 1.0f});
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{0.0f, 1.0f});
            this.f80649e.setDuration(300);
            this.f80649e.setInterpolator(new DecelerateInterpolator());
            this.f80649e.addListener(new C30774c(view));
            this.f80649e.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
            this.f80649e.start();
            return;
        }
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    /* renamed from: b */
    public final void mo63483b(View view, boolean z) {
        C52711k.m112240b(view, "view");
        this.f80649e.cancel();
        this.f80649e.removeAllListeners();
        if (z) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleX", new float[]{1.0f, 0.0f});
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{1.0f, 0.0f});
            this.f80649e.setDuration(300);
            this.f80649e.setInterpolator(new DecelerateInterpolator());
            this.f80649e.addListener(new C30773b(view));
            this.f80649e.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
            this.f80649e.start();
            return;
        }
        view.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo63478a(View view, float f, float f2, boolean z) {
        C52711k.m112240b(view, "container");
        if (z) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", new float[]{f, f2});
            C52711k.m112236a((Object) ofFloat, "animator");
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.setDuration(300);
            ofFloat.addListener(new C30775d(this, f, f2, view));
            ofFloat.start();
            return;
        }
        view.setTranslationY(f2);
    }
}
