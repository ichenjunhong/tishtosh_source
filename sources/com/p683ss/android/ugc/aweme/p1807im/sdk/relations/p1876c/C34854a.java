package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.common.C10678c;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.c.a */
public abstract class C34854a<ITEM> extends C1352v {

    /* renamed from: a */
    private final int f89781a;

    /* renamed from: b */
    public C52686q<? super Integer, ? super Integer, ? super View, C52860x> f89782b;

    /* renamed from: c */
    public final View f89783c = this.itemView.findViewById(R.id.ze);

    /* renamed from: d */
    public final AvatarImageView f89784d = ((AvatarImageView) this.itemView.findViewById(R.id.i0));

    /* renamed from: e */
    public final ImageView f89785e = ((ImageView) this.itemView.findViewById(R.id.doe));

    /* renamed from: f */
    public final DmtTextView f89786f = ((DmtTextView) this.itemView.findViewById(R.id.bpu));

    /* renamed from: g */
    public final DmtTextView f89787g = ((DmtTextView) this.itemView.findViewById(R.id.a51));

    /* renamed from: h */
    public final DmtTextView f89788h = ((DmtTextView) this.itemView.findViewById(R.id.ath));

    /* renamed from: i */
    public final ImageView f89789i = ((ImageView) this.itemView.findViewById(R.id.sy));

    /* renamed from: j */
    private final int f89790j;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.c.a$a */
    static final class C34858a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C34854a f89794a;

        C34858a(C34854a aVar) {
            this.f89794a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (this.f89794a.f89789i != null) {
                C52711k.m112236a((Object) valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    int intValue = ((Integer) animatedValue).intValue();
                    LayoutParams layoutParams = this.f89794a.f89789i.getLayoutParams();
                    if (layoutParams != null) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMargins(intValue, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        if (VERSION.SDK_INT >= 17) {
                            marginLayoutParams.setMarginStart(intValue);
                        }
                        this.f89794a.f89789i.setLayoutParams(marginLayoutParams);
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Int");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.c.a$b */
    static final class C34859b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C34854a f89795a;

        C34859b(C34854a aVar) {
            this.f89795a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (this.f89795a.f89789i != null) {
                C52711k.m112236a((Object) valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    int intValue = ((Integer) animatedValue).intValue();
                    LayoutParams layoutParams = this.f89795a.f89789i.getLayoutParams();
                    if (layoutParams != null) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMargins(intValue, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        if (VERSION.SDK_INT >= 17) {
                            marginLayoutParams.setMarginStart(intValue);
                        }
                        this.f89795a.f89789i.setLayoutParams(marginLayoutParams);
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Int");
            }
        }
    }

    /* renamed from: a */
    public abstract void mo72219a(ITEM item, ITEM item2, int i);

    /* renamed from: c */
    public final Animator mo72971c() {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f89790j, this.f89781a});
        ofInt.addUpdateListener(new C34859b(this));
        C52711k.m112236a((Object) ofInt, "showValueAnimator");
        return ofInt;
    }

    /* renamed from: d */
    public final Animator mo72972d() {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f89781a, this.f89790j});
        ofInt.addUpdateListener(new C34858a(this));
        C52711k.m112236a((Object) ofInt, "hideValueAnimator");
        return ofInt;
    }

    /* renamed from: e */
    public final void mo72973e() {
        if (this.f89789i != null) {
            LayoutParams layoutParams = this.f89789i.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                if (VERSION.SDK_INT >= 17) {
                    marginLayoutParams.setMarginStart(this.f89781a);
                }
                marginLayoutParams.leftMargin = this.f89781a;
                this.f89789i.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: f */
    public final void mo72974f() {
        if (this.f89789i != null) {
            LayoutParams layoutParams = this.f89789i.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                if (VERSION.SDK_INT >= 17) {
                    marginLayoutParams.setMarginStart(this.f89790j);
                }
                marginLayoutParams.leftMargin = this.f89790j;
                this.f89789i.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public C34854a(View view) {
        C52711k.m112240b(view, "view");
        super(view);
        View view2 = this.itemView;
        C52711k.m112236a((Object) view2, "itemView");
        this.f89781a = (int) C9432q.m18687b(view2.getContext(), 16.0f);
        View view3 = this.itemView;
        C52711k.m112236a((Object) view3, "itemView");
        this.f89790j = (int) C9432q.m18687b(view3.getContext(), -24.0f);
        View view4 = this.f89783c;
        if (view4 != null) {
            View view5 = this.itemView;
            C52711k.m112236a((Object) view5, "itemView");
            view4.setBackground(C10678c.m21505e(view5.getContext()));
        }
        View view6 = this.f89783c;
        if (view6 != null) {
            view6.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C34854a f89791a;

                {
                    this.f89791a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C52686q<? super Integer, ? super Integer, ? super View, C52860x> qVar = this.f89791a.f89782b;
                    if (qVar != null) {
                        Integer valueOf = Integer.valueOf(2);
                        Integer valueOf2 = Integer.valueOf(this.f89791a.getAdapterPosition());
                        C52711k.m112236a((Object) view, "it");
                        qVar.invoke(valueOf, valueOf2, view);
                    }
                }
            });
        }
        AvatarImageView avatarImageView = this.f89784d;
        if (avatarImageView != null) {
            avatarImageView.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C34854a f89792a;

                {
                    this.f89792a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C52686q<? super Integer, ? super Integer, ? super View, C52860x> qVar = this.f89792a.f89782b;
                    if (qVar != null) {
                        Integer valueOf = Integer.valueOf(1);
                        Integer valueOf2 = Integer.valueOf(this.f89792a.getAdapterPosition());
                        C52711k.m112236a((Object) view, "it");
                        qVar.invoke(valueOf, valueOf2, view);
                    }
                }
            });
        }
        ImageView imageView = this.f89789i;
        if (imageView != null) {
            imageView.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C34854a f89793a;

                {
                    this.f89793a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C52686q<? super Integer, ? super Integer, ? super View, C52860x> qVar = this.f89793a.f89782b;
                    if (qVar != null) {
                        Integer valueOf = Integer.valueOf(0);
                        Integer valueOf2 = Integer.valueOf(this.f89793a.getAdapterPosition());
                        C52711k.m112236a((Object) view, "it");
                        qVar.invoke(valueOf, valueOf2, view);
                    }
                }
            });
        }
    }
}
