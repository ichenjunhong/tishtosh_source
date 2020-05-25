package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.common.C10678c;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p683ss.android.ugc.aweme.friends.service.C32619f;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendContactItemView */
public final class RecommendContactItemView extends IRecommendContactItemView {

    /* renamed from: a */
    public final Context f85051a;

    /* renamed from: b */
    public C52682m<? super RecommendContact, ? super Integer, C52860x> f85052b;

    /* renamed from: c */
    private final View f85053c;

    /* renamed from: d */
    private final AvatarImageWithVerify f85054d;

    /* renamed from: e */
    private final FansFollowUserBtn f85055e;

    /* renamed from: f */
    private final ImageView f85056f;

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendContactItemView$a */
    static final class C32662a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendContactItemView f85057a;

        /* renamed from: b */
        final /* synthetic */ RecommendContact f85058b;

        /* renamed from: c */
        final /* synthetic */ int f85059c;

        C32662a(RecommendContactItemView recommendContactItemView, RecommendContact recommendContact, int i) {
            this.f85057a = recommendContactItemView;
            this.f85058b = recommendContact;
            this.f85059c = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C32619f fVar = C32619f.f84867a;
            Context context = this.f85057a.f85051a;
            if (context != null) {
                fVar.enterContactActivity((Activity) context, new C52671b<Boolean, C52860x>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C32662a f85060a;

                    {
                        this.f85060a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        if (((Boolean) obj).booleanValue()) {
                            C52682m<? super RecommendContact, ? super Integer, C52860x> mVar = this.f85060a.f85057a.f85052b;
                            if (mVar != null) {
                                mVar.invoke(this.f85060a.f85058b, Integer.valueOf(this.f85060a.f85059c));
                            }
                        }
                        return C52860x.f131107a;
                    }
                });
                C32619f.f84867a.logRecommendContactEvent("click", this.f85057a.getEnterFrom());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.app.Activity");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendContactItemView$b */
    static final class C32664b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendContactItemView f85061a;

        /* renamed from: b */
        final /* synthetic */ RecommendContact f85062b;

        /* renamed from: c */
        final /* synthetic */ int f85063c;

        C32664b(RecommendContactItemView recommendContactItemView, RecommendContact recommendContact, int i) {
            this.f85061a = recommendContactItemView;
            this.f85062b = recommendContact;
            this.f85063c = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C52682m<? super RecommendContact, ? super Integer, C52860x> mVar = this.f85061a.f85052b;
            if (mVar != null) {
                mVar.invoke(this.f85062b, Integer.valueOf(this.f85063c));
            }
            C32619f.f84867a.dislike(this.f85061a.getEnterFrom());
        }
    }

    public final void setDislikeListener(C52682m<? super RecommendContact, ? super Integer, C52860x> mVar) {
        this.f85052b = mVar;
    }

    /* renamed from: a */
    public final void mo66180a(RecommendContact recommendContact, int i) {
        C52711k.m112240b(recommendContact, "contact");
        this.f85054d.setPlaceHolder(R.drawable.cyj);
        if (C52711k.m112239a((Object) getEnterFrom(), (Object) "find_friends")) {
            this.f85055e.mo66154a();
        }
        FansFollowUserBtn fansFollowUserBtn = this.f85055e;
        String string = this.f85051a.getResources().getString(R.string.acd);
        C52711k.m112236a((Object) string, "mContext.resources.getSt….string.common_check_btn)");
        fansFollowUserBtn.setText(string);
        this.f85055e.setOnClickListener(new C32662a(this, recommendContact, i));
        this.f85056f.setOnClickListener(new C32664b(this, recommendContact, i));
    }

    public RecommendContactItemView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f85051a = context;
        this.f85053c = LayoutInflater.from(context).inflate(R.layout.bbc, this);
        this.f85054d = (AvatarImageWithVerify) this.f85053c.findViewById(R.id.ay2);
        this.f85055e = (FansFollowUserBtn) this.f85053c.findViewById(R.id.st);
        this.f85056f = (ImageView) this.f85053c.findViewById(R.id.a6a);
        setBackground(C10678c.m21505e(context));
    }

    public /* synthetic */ RecommendContactItemView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, null, 0);
    }
}
