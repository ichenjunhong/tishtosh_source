package com.p683ss.android.ugc.aweme.homepage.p1801ui.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.p030v4.content.C0726c;
import android.view.LayoutInflater;
import android.view.View;
import com.C2240a;
import com.bytedance.ies.dmt.p664ui.p667c.C10672b;
import com.bytedance.ies.dmt.p664ui.p667c.C10673c;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.feed.api.C30151i;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.main.C36483a;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.a */
public final class C33030a extends C36483a {

    /* renamed from: a */
    public final Context f85812a;

    /* renamed from: b */
    public final List<C30151i> f85813b;

    /* renamed from: c */
    public final int f85814c;

    /* renamed from: e */
    private CircleImageView f85815e;

    /* renamed from: f */
    private CircleImageView f85816f;

    /* renamed from: g */
    private CircleImageView f85817g;

    /* renamed from: h */
    private View f85818h;

    /* renamed from: i */
    private View f85819i;

    /* renamed from: j */
    private DmtTextView f85820j;

    /* renamed from: k */
    private AnimatorSet f85821k;

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.a$a */
    static final class C33031a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f85822a;

        C33031a(View view) {
            this.f85822a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f85822a;
            C52711k.m112236a((Object) view, "rootView");
            C52711k.m112236a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                view.setAlpha(((Float) animatedValue).floatValue());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.a$b */
    public static final class C33032b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f85823a;

        C33032b(View view) {
            this.f85823a = view;
        }

        public final void onAnimationStart(Animator animator) {
            C52711k.m112240b(animator, "animation");
            View view = this.f85823a;
            C52711k.m112236a((Object) view, "rootView");
            view.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.a$c */
    static final class C33033c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f85824a;

        C33033c(View view) {
            this.f85824a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f85824a;
            C52711k.m112236a((Object) view, "rootView");
            C52711k.m112236a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                view.setAlpha(((Float) animatedValue).floatValue());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.a$d */
    public static final class C33034d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C33030a f85825a;

        C33034d(C33030a aVar) {
            this.f85825a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C52711k.m112240b(animator, "animation");
            this.f85825a.mo69995a();
        }
    }

    /* renamed from: a */
    public final void mo69995a() {
        if (this.f85821k != null && isShowing()) {
            getContentView().clearAnimation();
            AnimatorSet animatorSet = this.f85821k;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            try {
                dismiss();
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo69996a(View view) {
        boolean z;
        C52711k.m112240b(view, "anchorView");
        Collection collection = this.f85813b;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            dismiss();
            return false;
        }
        if (!isShowing()) {
            if (!this.f85813b.isEmpty()) {
                UrlModel avatarThumb = ((C30151i) this.f85813b.get(0)).getUser().getAvatarThumb();
                CircleImageView circleImageView = this.f85815e;
                if (circleImageView == null) {
                    C52711k.m112237a("cover1");
                }
                C23515d.m57669a((RemoteImageView) circleImageView, avatarThumb);
                if (this.f85813b.size() >= 2) {
                    UrlModel avatarThumb2 = ((C30151i) this.f85813b.get(1)).getUser().getAvatarThumb();
                    CircleImageView circleImageView2 = this.f85816f;
                    if (circleImageView2 == null) {
                        C52711k.m112237a("cover2");
                    }
                    C23515d.m57669a((RemoteImageView) circleImageView2, avatarThumb2);
                    CircleImageView circleImageView3 = this.f85816f;
                    if (circleImageView3 == null) {
                        C52711k.m112237a("cover2");
                    }
                    circleImageView3.setVisibility(0);
                    View view2 = this.f85819i;
                    if (view2 == null) {
                        C52711k.m112237a("coverMask2");
                    }
                    view2.setVisibility(0);
                }
                if (this.f85813b.size() >= 3) {
                    UrlModel avatarThumb3 = ((C30151i) this.f85813b.get(2)).getUser().getAvatarThumb();
                    CircleImageView circleImageView4 = this.f85817g;
                    if (circleImageView4 == null) {
                        C52711k.m112237a("cover3");
                    }
                    C23515d.m57669a((RemoteImageView) circleImageView4, avatarThumb3);
                    CircleImageView circleImageView5 = this.f85817g;
                    if (circleImageView5 == null) {
                        C52711k.m112237a("cover3");
                    }
                    circleImageView5.setVisibility(0);
                }
                DmtTextView dmtTextView = this.f85820j;
                if (dmtTextView == null) {
                    C52711k.m112237a("sharedVideoTextView");
                }
                String quantityString = this.f85812a.getResources().getQuantityString(R.plurals.an, this.f85814c);
                C52711k.m112236a((Object) quantityString, "context.resources.getQua…e_number_multi, videoNum)");
                String a = C2240a.m6772a(quantityString, Arrays.copyOf(new Object[]{Integer.valueOf(this.f85814c)}, 1));
                C52711k.m112236a((Object) a, "java.lang.String.format(this, *args)");
                dmtTextView.setText(a);
            }
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            showAtLocation(view, 48, C23728o.m58241a(12.0d), (iArr[1] + view.getHeight()) - C23728o.m58241a(10.0d));
        }
        View contentView = getContentView();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        C52711k.m112236a((Object) ofFloat, "fadeIn");
        ofFloat.setDuration(200);
        ofFloat.setInterpolator(new C10673c());
        ofFloat.addUpdateListener(new C33031a(contentView));
        ofFloat.addListener(new C33032b(contentView));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        C52711k.m112236a((Object) ofFloat2, "fadeOut");
        ofFloat2.setDuration(300);
        ofFloat2.setStartDelay(3000);
        ofFloat2.setInterpolator(new C10672b());
        ofFloat2.addUpdateListener(new C33033c(contentView));
        ofFloat2.addListener(new C33034d(this));
        this.f85821k = new AnimatorSet();
        AnimatorSet animatorSet = this.f85821k;
        if (animatorSet != null) {
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        }
        AnimatorSet animatorSet2 = this.f85821k;
        if (animatorSet2 != null) {
            animatorSet2.start();
        }
        return true;
    }

    public C33030a(Context context, List<C30151i> list, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(list, "interestUsers");
        super(context);
        this.f85812a = context;
        this.f85813b = list;
        this.f85814c = i;
        View inflate = LayoutInflater.from(this.f85812a).inflate(R.layout.bbn, null, false);
        C52711k.m112236a((Object) inflate, "contentView");
        setContentView(inflate);
        setBackgroundDrawable(new ColorDrawable(C0726c.m2098c(this.f85812a, R.color.arz)));
        setOutsideTouchable(false);
        setWidth(-2);
        setHeight(-2);
        update();
        View findViewById = inflate.findViewById(R.id.eeh);
        C52711k.m112236a((Object) findViewById, "contentView.findViewById(R.id.iv_cover_1)");
        this.f85815e = (CircleImageView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.eek);
        C52711k.m112236a((Object) findViewById2, "contentView.findViewById(R.id.iv_cover_mask_1)");
        this.f85818h = findViewById2;
        View findViewById3 = inflate.findViewById(R.id.eei);
        C52711k.m112236a((Object) findViewById3, "contentView.findViewById(R.id.iv_cover_2)");
        this.f85816f = (CircleImageView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.eel);
        C52711k.m112236a((Object) findViewById4, "contentView.findViewById(R.id.iv_cover_mask_2)");
        this.f85819i = findViewById4;
        CircleImageView circleImageView = this.f85816f;
        if (circleImageView == null) {
            C52711k.m112237a("cover2");
        }
        circleImageView.setVisibility(8);
        View view = this.f85819i;
        if (view == null) {
            C52711k.m112237a("coverMask2");
        }
        view.setVisibility(8);
        View findViewById5 = inflate.findViewById(R.id.eej);
        C52711k.m112236a((Object) findViewById5, "contentView.findViewById(R.id.iv_cover_3)");
        this.f85817g = (CircleImageView) findViewById5;
        CircleImageView circleImageView2 = this.f85817g;
        if (circleImageView2 == null) {
            C52711k.m112237a("cover3");
        }
        circleImageView2.setVisibility(8);
        View findViewById6 = inflate.findViewById(R.id.f4c);
        C52711k.m112236a((Object) findViewById6, "contentView.findViewById(R.id.tv_shared_videos)");
        this.f85820j = (DmtTextView) findViewById6;
    }
}
