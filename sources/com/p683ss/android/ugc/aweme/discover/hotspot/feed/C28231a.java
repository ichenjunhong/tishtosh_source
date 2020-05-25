package com.p683ss.android.ugc.aweme.discover.hotspot.feed;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.discover.hotspot.feed.SpotCurSpotChangeCallBack.C28228a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.discover.hotspot.feed.a */
public final class C28231a extends C1352v {

    /* renamed from: a */
    public Aweme f74099a;

    /* renamed from: b */
    public View f74100b;

    /* renamed from: c */
    public final SpotCurSpotChangeCallBack f74101c;

    /* renamed from: d */
    public FragmentActivity f74102d;

    /* renamed from: e */
    private TextView f74103e;

    /* renamed from: f */
    private TextView f74104f;

    /* renamed from: com.ss.android.ugc.aweme.discover.hotspot.feed.a$a */
    public static final class C28233a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C28231a f74106a;

        public C28233a(C28231a aVar) {
            this.f74106a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f74106a.f74100b.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.hotspot.feed.a$b */
    public static final class C28234b implements AnimatorUpdateListener {

        /* renamed from: a */
        public static final C28234b f74107a = new C28234b();

        C28234b() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.hotspot.feed.a$c */
    static final class C28235c extends C52712l implements C52682m<Aweme, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C28231a f74108a;

        C28235c(C28231a aVar) {
            this.f74108a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Aweme aweme = (Aweme) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            if (aweme != null && !(!C52711k.m112239a((Object) this.f74108a.f74099a, (Object) aweme))) {
                this.f74108a.mo56655a(booleanValue);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final void mo56655a(boolean z) {
        String str;
        CharSequence charSequence;
        StringBuilder sb = new StringBuilder("SpotWork() called with: isPre = [");
        Aweme aweme = this.f74099a;
        String str2 = null;
        if (aweme != null) {
            str = aweme.getDesc();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(']');
        this.f74100b.setVisibility(0);
        this.f74100b.setAlpha(1.0f);
        TextView textView = this.f74103e;
        if (z) {
            charSequence = "上一个热点";
        } else {
            charSequence = "下一个热点";
        }
        textView.setText(charSequence);
        TextView textView2 = this.f74104f;
        Aweme aweme2 = this.f74099a;
        if (aweme2 != null) {
            str2 = aweme2.getHotSpot();
        }
        textView2.setText(str2);
    }

    public C28231a(View view, FragmentActivity fragmentActivity) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(fragmentActivity, "context");
        super(view);
        this.f74102d = fragmentActivity;
        View findViewById = view.findViewById(R.id.cr2);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.spot_back_guide)");
        this.f74100b = findViewById;
        View findViewById2 = view.findViewById(R.id.cr3);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.spot_back_guide_pre)");
        this.f74103e = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.cr4);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.spot_back_guide_title)");
        this.f74104f = (TextView) findViewById3;
        C0209x a = C0214z.m440a(this.f74102d).mo359a(SpotCurSpotChangeCallBack.class);
        C52711k.m112236a((Object) a, "ViewModelProviders\n     …angeCallBack::class.java)");
        this.f74101c = (SpotCurSpotChangeCallBack) a;
        C28228a aVar = SpotCurSpotChangeCallBack.f74094c;
        FragmentActivity fragmentActivity2 = this.f74102d;
        C0184k kVar = this.f74102d;
        C52682m cVar = new C28235c(this);
        C52711k.m112240b(fragmentActivity2, "context");
        C52711k.m112240b(kVar, "owner");
        C52711k.m112240b(cVar, "listener");
        C52711k.m112240b(fragmentActivity2, "context");
        ((SpotCurSpotChangeCallBack) C0214z.m440a(fragmentActivity2).mo359a(SpotCurSpotChangeCallBack.class)).f74095a.mo48247a(kVar, new C28229a(cVar), true);
        C52711k.m112240b(fragmentActivity2, "context");
        ((SpotCurSpotChangeCallBack) C0214z.m440a(fragmentActivity2).mo359a(SpotCurSpotChangeCallBack.class)).f74096b.mo48247a(kVar, new C28230b(cVar), true);
        this.f74100b.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C28231a f74105a;

            {
                this.f74105a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f74105a.f74100b.setVisibility(8);
            }
        });
    }
}
