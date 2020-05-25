package com.p683ss.android.ugc.aweme.discover.hitrank;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.widget.TextView;
import com.C2240a;
import com.p683ss.android.ugc.aweme.message.model.SimpleUser;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.hitrank.ProfileHitRankHelper */
public final class ProfileHitRankHelper implements C0183j, C0199s<C28218e> {

    /* renamed from: a */
    public View f74067a;

    /* renamed from: b */
    public C0184k f74068b;

    /* renamed from: c */
    public TextView f74069c;

    /* renamed from: d */
    private boolean f74070d;

    /* renamed from: e */
    private FragmentActivity f74071e;

    /* renamed from: com.ss.android.ugc.aweme.discover.hitrank.ProfileHitRankHelper$a */
    public static final class C28213a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ProfileHitRankHelper f74072a;

        /* renamed from: b */
        final /* synthetic */ float f74073b;

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C0184k kVar = this.f74072a.f74068b;
            if (kVar == null) {
                C52711k.m112237a("owner");
            }
            C0176h lifecycle = kVar.getLifecycle();
            C52711k.m112236a((Object) lifecycle, "owner.lifecycle");
            if (lifecycle.mo323a().isAtLeast(C0178b.RESUMED)) {
                View view = this.f74072a.f74067a;
                if (view == null) {
                    C52711k.m112237a("view");
                }
                ObjectAnimator duration = ObjectAnimator.ofFloat(view, "translationX", new float[]{this.f74073b, 0.0f}).setDuration(300);
                C52711k.m112236a((Object) duration, "show");
                duration.setStartDelay(200);
                duration.start();
                TextView textView = this.f74072a.f74069c;
                if (textView == null) {
                    C52711k.m112237a("textView");
                }
                textView.setText(R.string.bag);
            }
        }

        C28213a(ProfileHitRankHelper profileHitRankHelper, float f) {
            this.f74072a = profileHitRankHelper;
            this.f74073b = f;
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        C28218e eVar = (C28218e) obj;
        if (eVar != null && eVar.f74080a != -2 && eVar.f74080a != -1) {
            SimpleUser simpleUser = (SimpleUser) C52575l.m112140f((List<? extends T>) eVar.f74081b.getUserList());
            if (simpleUser != null) {
                C28214a taskInfo = simpleUser.getTaskInfo();
                View view = this.f74067a;
                if (view == null) {
                    C52711k.m112237a("view");
                }
                view.setVisibility(0);
                if (taskInfo.getCompeletedTaskCnt() != taskInfo.getTotalTaskCnt()) {
                    this.f74070d = true;
                    TextView textView = this.f74069c;
                    if (textView == null) {
                        C52711k.m112237a("textView");
                    }
                    FragmentActivity fragmentActivity = this.f74071e;
                    if (fragmentActivity == null) {
                        C52711k.m112237a("activity");
                    }
                    String string = fragmentActivity.getString(R.string.e1c);
                    C52711k.m112236a((Object) string, "activity.getString(R.string.today_hitrank)");
                    String a = C2240a.m6772a(string, Arrays.copyOf(new Object[]{Integer.valueOf(taskInfo.getCompeletedTaskCnt()), Integer.valueOf(taskInfo.getTotalTaskCnt())}, 2));
                    C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
                    textView.setText(a);
                } else if (this.f74070d) {
                    this.f74070d = false;
                    View view2 = this.f74067a;
                    if (view2 == null) {
                        C52711k.m112237a("view");
                    }
                    float width = ((float) view2.getWidth()) * 1.0f;
                    View view3 = this.f74067a;
                    if (view3 == null) {
                        C52711k.m112237a("view");
                    }
                    ObjectAnimator duration = ObjectAnimator.ofFloat(view3, "translationX", new float[]{0.0f, width}).setDuration(300);
                    duration.addListener(new C28213a(this, width));
                    C52711k.m112236a((Object) duration, "hide");
                    duration.setStartDelay(600);
                    duration.start();
                } else {
                    TextView textView2 = this.f74069c;
                    if (textView2 == null) {
                        C52711k.m112237a("textView");
                    }
                    textView2.setText(R.string.bag);
                }
            }
        }
    }
}
