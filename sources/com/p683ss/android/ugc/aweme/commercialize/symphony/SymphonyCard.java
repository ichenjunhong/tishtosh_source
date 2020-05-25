package com.p683ss.android.ugc.aweme.commercialize.symphony;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard */
public final class SymphonyCard extends FrameLayout {

    /* renamed from: a */
    public boolean f69385a;

    /* renamed from: b */
    public boolean f69386b;

    /* renamed from: c */
    private HashMap f69387c;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard$a */
    static final class C26280a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52670a f69388a;

        C26280a(C52670a aVar) {
            this.f69388a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f69388a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard$b */
    static final class C26281b implements OnClickListener {

        /* renamed from: a */
        public static final C26281b f69389a = new C26281b();

        C26281b() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard$c */
    static final class C26282c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SymphonyCard f69390a;

        C26282c(SymphonyCard symphonyCard) {
            this.f69390a = symphonyCard;
        }

        public final void run() {
            this.f69390a.f69385a = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard$d */
    static final class C26283d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SymphonyCard f69391a;

        C26283d(SymphonyCard symphonyCard) {
            this.f69391a = symphonyCard;
        }

        public final void run() {
            this.f69391a.f69385a = false;
            this.f69391a.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard$e */
    static final class C26284e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SymphonyCard f69392a;

        C26284e(SymphonyCard symphonyCard) {
            this.f69392a = symphonyCard;
        }

        public final void run() {
            this.f69392a.setVisibility(0);
            this.f69392a.f69385a = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard$f */
    static final class C26285f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SymphonyCard f69393a;

        C26285f(SymphonyCard symphonyCard) {
            this.f69393a = symphonyCard;
        }

        public final void run() {
            this.f69393a.f69385a = false;
        }
    }

    public SymphonyCard(Context context) {
        this(context, null, 0, 6, null);
    }

    public SymphonyCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final View mo53959a(int i) {
        if (this.f69387c == null) {
            this.f69387c = new HashMap();
        }
        View view = (View) this.f69387c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f69387c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo53960a() {
        setVisibility(8);
        this.f69386b = false;
        setAlpha(1.0f);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
    }

    public final ViewGroup getAddOtherLayout() {
        FrameLayout frameLayout = (FrameLayout) mo53959a(R.id.qu);
        C52711k.m112236a((Object) frameLayout, "cardOthersTagLayout");
        return frameLayout;
    }

    /* renamed from: b */
    public final void mo53961b() {
        this.f69386b = false;
        animate().alpha(0.0f).withStartAction(new C26282c(this)).setDuration(200).withEndAction(new C26283d(this)).start();
    }

    public final void setShowing(boolean z) {
        this.f69386b = z;
    }

    public SymphonyCard(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.a8n, this, true);
    }

    public /* synthetic */ SymphonyCard(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
