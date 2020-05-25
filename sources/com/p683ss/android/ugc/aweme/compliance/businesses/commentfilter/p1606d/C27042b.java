package com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.p1606d;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28515aw;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.d.b */
public final class C27042b extends C1352v {

    /* renamed from: a */
    public long f71369a;

    /* renamed from: b */
    public final ImageView f71370b;

    /* renamed from: c */
    public final EditText f71371c;

    /* renamed from: d */
    public final TextView f71372d;

    /* renamed from: e */
    public int f71373e = -1;

    /* renamed from: f */
    public final View f71374f;

    /* renamed from: g */
    public final View f71375g;

    /* renamed from: h */
    public final C27048c f71376h;

    /* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.d.b$a */
    static final class C27047a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C27042b f71381a;

        C27047a(C27042b bVar) {
            this.f71381a = bVar;
        }

        public final void run() {
            this.f71381a.f71371c.requestFocus();
            this.f71381a.f71371c.setSelection(this.f71381a.f71371c.getText().length());
            Object systemService = this.f71381a.f71371c.getContext().getSystemService("input_method");
            if (systemService != null) {
                ((InputMethodManager) systemService).showSoftInput(this.f71381a.f71371c, 0);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    /* renamed from: a */
    public final void mo55273a() {
        if (!this.f71376h.mo55260a(this.f71373e)) {
            AnimationSet animationSet = new AnimationSet(true);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300);
            animationSet.addAnimation(alphaAnimation);
            TranslateAnimation translateAnimation = new TranslateAnimation(-((float) C23728o.m58241a(16.0d)), 0.0f, 0.0f, 0.0f);
            translateAnimation.setDuration(300);
            animationSet.addAnimation(translateAnimation);
            this.f71371c.setText(this.f71372d.getText());
            if (C52711k.m112239a((Object) this.f71372d.getText().toString(), (Object) this.f71372d.getContext().getString(R.string.ffo))) {
                this.f71371c.setText("");
            }
            this.f71370b.setVisibility(0);
            this.f71371c.setVisibility(0);
            this.f71372d.setVisibility(8);
            EditText editText = this.f71371c;
            TranslateAnimation translateAnimation2 = new TranslateAnimation(-((float) C23728o.m58241a(24.0d)), 0.0f, 0.0f, 0.0f);
            translateAnimation2.setDuration(300);
            editText.startAnimation(translateAnimation2);
            TextView textView = this.f71372d;
            TranslateAnimation translateAnimation3 = new TranslateAnimation(0.0f, (float) C23728o.m58241a(24.0d), 0.0f, 0.0f);
            translateAnimation3.setDuration(300);
            textView.startAnimation(translateAnimation3);
            this.f71370b.startAnimation(animationSet);
            this.f71371c.postDelayed(new C27047a(this), 300);
            this.f71376h.mo55258a(this.f71373e, (View) this.f71371c);
        }
    }

    public C27042b(View view, C27048c cVar) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(cVar, "listener");
        super(view);
        this.f71375g = view;
        this.f71376h = cVar;
        View findViewById = this.f71375g.findViewById(R.id.aqa);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.icon)");
        this.f71370b = (ImageView) findViewById;
        View findViewById2 = this.f71375g.findViewById(R.id.text);
        C52711k.m112236a((Object) findViewById2, "view.findViewById(R.id.text)");
        this.f71371c = (EditText) findViewById2;
        View findViewById3 = this.f71375g.findViewById(R.id.czc);
        C52711k.m112236a((Object) findViewById3, "view.findViewById(R.id.text_view)");
        this.f71372d = (TextView) findViewById3;
        View findViewById4 = this.f71375g.findViewById(R.id.a6e);
        C52711k.m112236a((Object) findViewById4, "view.findViewById(R.id.div)");
        this.f71374f = findViewById4;
        View view2 = this.f71374f;
        Context context = this.f71375g.getContext();
        C52711k.m112236a((Object) context, "view.context");
        view2.setBackgroundColor(context.getResources().getColor(R.color.j1));
        this.f71371c.addTextChangedListener(new TextWatcher(this) {

            /* renamed from: a */
            final /* synthetic */ C27042b f71377a;

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            {
                this.f71377a = r1;
            }

            public final void afterTextChanged(Editable editable) {
                this.f71377a.f71376h.mo55259a(this.f71377a.f71373e, String.valueOf(editable));
            }
        });
        this.f71371c.setOnFocusChangeListener(new OnFocusChangeListener(this) {

            /* renamed from: a */
            final /* synthetic */ C27042b f71378a;

            {
                this.f71378a = r1;
            }

            public final void onFocusChange(View view, boolean z) {
                if (!z) {
                    this.f71378a.f71376h.mo55259a(this.f71378a.f71373e, this.f71378a.f71371c.getText().toString());
                    this.f71378a.f71371c.setSelection(0);
                    AnimationSet animationSet = new AnimationSet(true);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(300);
                    animationSet.addAnimation(alphaAnimation);
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, -((float) C23728o.m58241a(16.0d)), 0.0f, 0.0f);
                    translateAnimation.setDuration(300);
                    animationSet.addAnimation(translateAnimation);
                    this.f71378a.f71372d.setText(this.f71378a.f71371c.getText());
                    String obj = this.f71378a.f71371c.getText().toString();
                    if (obj != null) {
                        if (C52711k.m112239a((Object) C52830p.m112457c(obj).toString(), (Object) "")) {
                            TextView textView = this.f71378a.f71372d;
                            Context context = this.f71378a.f71372d.getContext();
                            C52711k.m112236a((Object) context, "textView.context");
                            textView.setTextColor(context.getResources().getColor(R.color.k));
                            this.f71378a.f71372d.setText(this.f71378a.f71372d.getContext().getString(R.string.ffo));
                        } else {
                            TextView textView2 = this.f71378a.f71372d;
                            Context context2 = this.f71378a.f71372d.getContext();
                            C52711k.m112236a((Object) context2, "textView.context");
                            textView2.setTextColor(context2.getResources().getColor(R.color.a7y));
                        }
                        this.f71378a.f71370b.setVisibility(8);
                        this.f71378a.f71371c.setVisibility(8);
                        this.f71378a.f71372d.setVisibility(0);
                        EditText editText = this.f71378a.f71371c;
                        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, -((float) C23728o.m58241a(24.0d)), 0.0f, 0.0f);
                        translateAnimation2.setDuration(300);
                        editText.startAnimation(translateAnimation2);
                        TextView textView3 = this.f71378a.f71372d;
                        TranslateAnimation translateAnimation3 = new TranslateAnimation((float) C23728o.m58241a(24.0d), 0.0f, 0.0f, 0.0f);
                        translateAnimation3.setDuration(300);
                        textView3.startAnimation(translateAnimation3);
                        this.f71378a.f71370b.startAnimation(animationSet);
                        this.f71378a.f71376h.mo55257a();
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
        });
        this.f71375g.setOnTouchListener(new C28515aw(this) {

            /* renamed from: a */
            final /* synthetic */ C27042b f71379a;

            {
                this.f71379a = r1;
            }

            /* renamed from: b */
            public final void mo55272b(View view, MotionEvent motionEvent) {
                C52711k.m112240b(view, "view");
                C52711k.m112240b(motionEvent, "event");
                if (System.currentTimeMillis() - this.f71379a.f71369a >= 500) {
                    this.f71379a.f71369a = System.currentTimeMillis();
                    this.f71379a.mo55273a();
                }
            }
        });
        this.f71370b.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C27042b f71380a;

            {
                this.f71380a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f71380a.f71371c.clearFocus();
                Object systemService = this.f71380a.f71371c.getContext().getSystemService("input_method");
                if (systemService != null) {
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(this.f71380a.f71375g.getWindowToken(), 0);
                    this.f71380a.f71376h.mo55261b(this.f71380a.f71373e);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
        });
    }
}
