package com.p683ss.android.ugc.aweme.feed.unread;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.feed.p1736ui.AbstractUnReadSunRoofTouchEventFrameLayout;
import com.p683ss.android.ugc.aweme.feed.p1736ui.AbstractUnReadSunRoofView;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30786ba;
import com.p683ss.android.ugc.aweme.feed.unread.UnReadFeedSunRoofViewModel.C31151a;
import com.p683ss.android.ugc.aweme.main.C36512b;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2084b.C39797a;
import com.p683ss.android.ugc.aweme.unread.C47496d;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.Collection;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.feed.unread.UnReadSunRoofViewDelegate */
public final class UnReadSunRoofViewDelegate implements GenericLifecycleObserver, C30786ba {

    /* renamed from: h */
    public static final C31165a f81567h = new C31165a(null);

    /* renamed from: a */
    public UnReadFeedSunRoofViewModel f81568a = C31151a.m72790a(this.f81572e);

    /* renamed from: b */
    ValueAnimator f81569b = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});

    /* renamed from: c */
    ValueAnimator f81570c = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});

    /* renamed from: d */
    public final float f81571d = (C9432q.m18687b((Context) this.f81572e, 156.5f) + ((float) C9432q.m18695e(this.f81572e)));

    /* renamed from: e */
    public final FragmentActivity f81572e;

    /* renamed from: f */
    public final AbstractUnReadSunRoofView f81573f;

    /* renamed from: g */
    public final AbstractUnReadSunRoofTouchEventFrameLayout f81574g;

    /* renamed from: com.ss.android.ugc.aweme.feed.unread.UnReadSunRoofViewDelegate$a */
    public static final class C31165a {
        private C31165a() {
        }

        public /* synthetic */ C31165a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.unread.UnReadSunRoofViewDelegate$b */
    static final class C31166b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ UnReadSunRoofViewDelegate f81581a;

        C31166b(UnReadSunRoofViewDelegate unReadSunRoofViewDelegate) {
            this.f81581a = unReadSunRoofViewDelegate;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f81581a.f81568a.mo63988a(new C31169c(false, false));
            return C52860x.f131107a;
        }
    }

    /* renamed from: b */
    public final void mo63500b() {
        this.f81568a.mo63988a(new C31169c(false, false));
    }

    /* renamed from: a */
    public final boolean mo63499a() {
        ValueAnimator valueAnimator = this.f81569b;
        C52711k.m112236a((Object) valueAnimator, "showSunRoofAnim");
        if (!valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.f81570c;
            C52711k.m112236a((Object) valueAnimator2, "hideSunRoofAnim");
            if (!valueAnimator2.isRunning()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static void m72796a(boolean z) {
        C36512b a = C36512b.m82421a();
        C52711k.m112236a((Object) a, "CleanModeManager.inst()");
        a.mo75641a(z);
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void onFollowStatusChange(FollowStatus followStatus) {
        C52711k.m112240b(followStatus, "followStatus");
        TextUtils.isEmpty(followStatus.userId);
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void onBlockChange(C39797a aVar) {
        C52711k.m112240b(aVar, "blockEvent");
        if (aVar.f101571a != null) {
            User user = aVar.f101571a;
            C52711k.m112236a((Object) user, "blockEvent.user");
            if (!TextUtils.isEmpty(user.getUid())) {
                User user2 = aVar.f101571a;
                C52711k.m112236a((Object) user2, "blockEvent.user");
                user2.getUid();
            }
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void onUnReadVideoCountChange(C47496d dVar) {
        C52711k.m112240b(dVar, "event");
        UnReadFeedSunRoofViewModel unReadFeedSunRoofViewModel = this.f81568a;
        if (C52575l.m112125a((Iterable<? extends T>) unReadFeedSunRoofViewModel.f81547d, dVar.f119793a)) {
            if (dVar.f119794b == 0) {
                this.f81573f.mo63280a(dVar.f119793a, new C31166b(this));
            } else {
                this.f81573f.mo63279a(dVar.f119793a);
            }
        }
        UnReadFeedSunRoofViewModel unReadFeedSunRoofViewModel2 = this.f81568a;
        String str = dVar.f119793a;
        if (str == null) {
            str = "";
        }
        int i = dVar.f119794b;
        C52711k.m112240b(str, "uid");
        if (!TextUtils.isEmpty(str)) {
            if (unReadFeedSunRoofViewModel2.f81547d.contains(str) && i == 0) {
                unReadFeedSunRoofViewModel2.f81547d.remove(str);
            }
            if (unReadFeedSunRoofViewModel2.f81545b.containsKey(str)) {
                unReadFeedSunRoofViewModel2.f81545b.put(str, Integer.valueOf(i));
            }
        }
    }

    /* renamed from: a */
    public final void mo265a(C0184k kVar, C0177a aVar) {
        if (aVar != null) {
            switch (C31171e.f81586a[aVar.ordinal()]) {
                case 1:
                    C47718bf.m103290c(this);
                    return;
                case 2:
                    C47718bf.m103291d(this);
                    this.f81569b.removeAllListeners();
                    this.f81569b.removeAllUpdateListeners();
                    this.f81570c.removeAllListeners();
                    this.f81570c.removeAllUpdateListeners();
                    break;
            }
        }
    }

    public UnReadSunRoofViewDelegate(FragmentActivity fragmentActivity, AbstractUnReadSunRoofView abstractUnReadSunRoofView, AbstractUnReadSunRoofTouchEventFrameLayout abstractUnReadSunRoofTouchEventFrameLayout) {
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(abstractUnReadSunRoofView, "sunRoofView");
        C52711k.m112240b(abstractUnReadSunRoofTouchEventFrameLayout, "touchLayout");
        this.f81572e = fragmentActivity;
        this.f81573f = abstractUnReadSunRoofView;
        this.f81574g = abstractUnReadSunRoofTouchEventFrameLayout;
        this.f81572e.getLifecycle().mo324a(this);
        UnReadFeedSunRoofViewModel unReadFeedSunRoofViewModel = this.f81568a;
        C0184k kVar = this.f81572e;
        C52686q r5 = new C52686q<Boolean, Boolean, List<? extends User>, C52860x>(this) {

            /* renamed from: a */
            final /* synthetic */ UnReadSunRoofViewDelegate f81575a;

            {
                this.f81575a = r1;
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                boolean z;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                List list = (List) obj3;
                if (((Boolean) obj2).booleanValue()) {
                    Collection collection = list;
                    if (collection == null || collection.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        UnReadSunRoofViewDelegate.m72796a(true);
                        this.f81575a.f81573f.setData(list);
                        this.f81575a.f81568a.mo63988a(new C31169c(booleanValue, true));
                        return C52860x.f131107a;
                    }
                }
                UnReadSunRoofViewDelegate.m72796a(false);
                this.f81575a.f81568a.mo63988a(new C31169c(booleanValue, false));
                return C52860x.f131107a;
            }
        };
        C52711k.m112240b(kVar, "lifecycleOwner");
        unReadFeedSunRoofViewModel.f81548e.observe(kVar, new C31152b(unReadFeedSunRoofViewModel, r5));
        this.f81568a.mo63496a((C0184k) this.f81572e, (C52682m<? super Boolean, ? super Boolean, C52860x>) new C52682m<Boolean, Boolean, C52860x>(this) {

            /* renamed from: a */
            final /* synthetic */ UnReadSunRoofViewDelegate f81576a;

            {
                this.f81576a = r1;
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                UnReadSunRoofViewDelegate unReadSunRoofViewDelegate = this.f81576a;
                if (booleanValue2) {
                    unReadSunRoofViewDelegate.f81573f.mo63281b();
                    if (booleanValue) {
                        ValueAnimator valueAnimator = unReadSunRoofViewDelegate.f81569b;
                        C52711k.m112236a((Object) valueAnimator, "showSunRoofAnim");
                        if (!valueAnimator.isRunning() && unReadSunRoofViewDelegate.f81574g.getTranslationY() != unReadSunRoofViewDelegate.f81571d) {
                            unReadSunRoofViewDelegate.f81569b.start();
                        }
                    } else {
                        unReadSunRoofViewDelegate.f81574g.setTranslationY(unReadSunRoofViewDelegate.f81571d);
                        UnReadSunRoofViewDelegate.m72796a(true);
                    }
                } else {
                    ValueAnimator valueAnimator2 = unReadSunRoofViewDelegate.f81570c;
                    C52711k.m112236a((Object) valueAnimator2, "hideSunRoofAnim");
                    if (!valueAnimator2.isRunning() && unReadSunRoofViewDelegate.f81574g.getTranslationY() != 0.0f) {
                        unReadSunRoofViewDelegate.f81570c.start();
                    }
                }
                return C52860x.f131107a;
            }
        });
        ValueAnimator valueAnimator = this.f81569b;
        C52711k.m112236a((Object) valueAnimator, "showSunRoofAnim");
        valueAnimator.setDuration(300);
        this.f81569b.addUpdateListener(new AnimatorUpdateListener(this) {

            /* renamed from: a */
            final /* synthetic */ UnReadSunRoofViewDelegate f81577a;

            {
                this.f81577a = r1;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C52711k.m112240b(valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    this.f81577a.f81574g.setTranslationY(this.f81577a.f81571d * ((Float) animatedValue).floatValue());
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Float");
            }
        });
        this.f81569b.addListener(new AnimatorListenerAdapter(this) {

            /* renamed from: a */
            final /* synthetic */ UnReadSunRoofViewDelegate f81578a;

            {
                this.f81578a = r1;
            }

            public final void onAnimationEnd(Animator animator) {
                C52711k.m112240b(animator, "animation");
                super.onAnimationEnd(animator);
                this.f81578a.f81574g.setTranslationY(this.f81578a.f81571d);
                UnReadSunRoofViewDelegate.m72796a(true);
            }
        });
        ValueAnimator valueAnimator2 = this.f81570c;
        C52711k.m112236a((Object) valueAnimator2, "hideSunRoofAnim");
        valueAnimator2.setDuration(300);
        this.f81570c.addUpdateListener(new AnimatorUpdateListener(this) {

            /* renamed from: a */
            final /* synthetic */ UnReadSunRoofViewDelegate f81579a;

            {
                this.f81579a = r1;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C52711k.m112240b(valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    this.f81579a.f81574g.setTranslationY(this.f81579a.f81571d * ((Float) animatedValue).floatValue());
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Float");
            }
        });
        this.f81570c.addListener(new AnimatorListenerAdapter(this) {

            /* renamed from: a */
            final /* synthetic */ UnReadSunRoofViewDelegate f81580a;

            {
                this.f81580a = r1;
            }

            public final void onAnimationEnd(Animator animator) {
                C52711k.m112240b(animator, "animation");
                super.onAnimationEnd(animator);
                this.f81580a.f81574g.setTranslationY(0.0f);
                UnReadSunRoofViewDelegate.m72796a(false);
                this.f81580a.f81573f.mo63278a();
            }
        });
    }
}
