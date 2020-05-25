package com.p683ss.android.ugc.aweme.homepage.p1801ui.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.adaptation.C22453b;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p683ss.android.ugc.aweme.main.TabAlphaController;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.MainBottomTabView */
public class MainBottomTabView extends LinearLayout {

    /* renamed from: a */
    public C33071k f85744a;

    /* renamed from: b */
    public C33071k f85745b;

    /* renamed from: c */
    public C33071k f85746c;

    /* renamed from: d */
    public C33071k f85747d;

    /* renamed from: e */
    public HashMap<String, C33071k> f85748e;

    /* renamed from: f */
    private C33071k f85749f;

    /* renamed from: g */
    private C33055ar f85750g;

    /* renamed from: h */
    private LinearLayout f85751h;

    /* renamed from: i */
    private boolean f85752i;

    public C33055ar getMode() {
        return this.f85750g;
    }

    /* renamed from: a */
    public final void mo69940a() {
        this.f85749f.mo70024r();
        this.f85744a.mo70024r();
        this.f85746c.mo70024r();
        this.f85747d.mo70024r();
    }

    /* renamed from: b */
    public final void mo69944b() {
        if (C22453b.m55510c() && this.f85750g == C33055ar.MODE_MATERIAL) {
            int b = (int) C9432q.m18687b(getContext(), 4.0f);
            int b2 = (int) C9432q.m18687b(getContext(), 6.0f);
            View[] viewArr = {this.f85749f, this.f85744a, this.f85746c, this.f85747d};
            for (int i = 0; i < 4; i++) {
                viewArr[i].setPadding(0, b, 0, b2);
            }
        }
    }

    public MainBottomTabView(Context context) {
        this(context, null, 0);
    }

    /* renamed from: c */
    public final C33071k mo69946c(String str) {
        return (C33071k) this.f85748e.get(str);
    }

    public void setAlpha(float f) {
        if (!TabAlphaController.m82394a().f93534b) {
            super.setAlpha(f);
        }
    }

    /* renamed from: b */
    public final void mo69945b(String str) {
        if (this.f85748e.containsKey(str)) {
            ((C33071k) this.f85748e.get(str)).mo70066q();
        }
    }

    /* renamed from: a */
    public final void mo69941a(String str) {
        C22574a.m55738f().mo46914a();
        C22574a.m55738f().mo46919b();
        ScrollSwitchStateManager.m75876a((FragmentActivity) C23729p.m58248a(getContext())).mo69881g(str);
    }

    /* renamed from: d */
    public void mo69947d(String str) {
        boolean z = !TextUtils.equals(str, "HOME");
        if (!this.f85752i || !TextUtils.equals(str, "HOME")) {
            this.f85752i = false;
            if (!z || !C22453b.m55505a().f60473k) {
                if (z) {
                    setBackgroundColor(C0726c.m2098c(getContext(), R.color.x3));
                } else {
                    setBackgroundColor(C0726c.m2098c(getContext(), R.color.arz));
                }
                mo69940a();
                this.f85749f.mo70060a(str);
                return;
            }
            setBackgroundColor(C0726c.m2098c(getContext(), R.color.x3));
            mo69940a();
            return;
        }
        this.f85752i = false;
    }

    public void setMode(C33055ar arVar) {
        this.f85750g = arVar;
        switch (arVar) {
            case MODE_ICON:
                C33056b bVar = new C33056b(getContext(), "HOME", this, true, false);
                this.f85749f = bVar;
                this.f85749f.setSelected(true);
                C33056b bVar2 = new C33056b(getContext(), "DISCOVER", this, false, false);
                this.f85744a = bVar2;
                C33056b bVar3 = new C33056b(getContext(), "PUBLISH", this, false, false);
                this.f85745b = bVar3;
                C33056b bVar4 = new C33056b(getContext(), "NOTIFICATION", this, false, false);
                this.f85746c = bVar4;
                C33056b bVar5 = new C33056b(getContext(), "USER", this, false, false);
                this.f85747d = bVar5;
                break;
            case MODE_MATERIAL:
                C33042ah ahVar = new C33042ah(getContext(), "HOME", this, true, false);
                this.f85749f = ahVar;
                this.f85749f.setSelected(true);
                C33042ah ahVar2 = new C33042ah(getContext(), "DISCOVER", this, false, false);
                this.f85744a = ahVar2;
                C33056b bVar6 = new C33056b(getContext(), "PUBLISH", this, false, false);
                this.f85745b = bVar6;
                C33042ah ahVar3 = new C33042ah(getContext(), "NOTIFICATION", this, false, false);
                this.f85746c = ahVar3;
                C33042ah ahVar4 = new C33042ah(getContext(), "USER", this, false, false);
                this.f85747d = ahVar4;
                break;
        }
        this.f85749f.setBackground(getContext().getResources().getDrawable(R.drawable.cyr));
        this.f85744a.setBackground(getContext().getResources().getDrawable(R.drawable.cyr));
        this.f85746c.setBackground(getContext().getResources().getDrawable(R.drawable.cyr));
        this.f85747d.setBackground(getContext().getResources().getDrawable(R.drawable.cyr));
        if (this.f85751h.getChildCount() > 0) {
            this.f85751h.removeAllViews();
        }
        this.f85749f.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                MainBottomTabView.this.mo69941a("HOME");
            }
        });
        this.f85744a.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                MainBottomTabView.this.mo69941a("DISCOVER");
            }
        });
        this.f85745b.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                MainBottomTabView.this.f85745b.mo70016h();
                MainBottomTabView.this.mo69941a("PUBLISH");
            }
        });
        this.f85746c.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                MainBottomTabView.this.mo69941a("NOTIFICATION");
            }
        });
        this.f85747d.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                MainBottomTabView.this.mo69941a("USER");
            }
        });
        Context context = getContext();
        C33071k kVar = this.f85749f;
        C33071k kVar2 = this.f85744a;
        C33071k kVar3 = this.f85745b;
        C33071k kVar4 = this.f85746c;
        C33071k kVar5 = this.f85747d;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(kVar, "homeBtn");
        C52711k.m112240b(kVar2, "secondBtn");
        C52711k.m112240b(kVar3, "addBtn");
        C52711k.m112240b(kVar4, "notificationBtn");
        C52711k.m112240b(kVar5, "profileBtn");
        this.f85751h.addView(this.f85749f);
        this.f85751h.addView(this.f85744a);
        this.f85751h.addView(this.f85745b);
        this.f85751h.addView(this.f85746c);
        this.f85751h.addView(this.f85747d);
        Context context2 = getContext();
        int i = 0;
        if (context2 != null) {
            if (VERSION.SDK_INT >= 17) {
                WindowManager windowManager = (WindowManager) context2.getSystemService("window");
                if (windowManager != null) {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getRealMetrics(displayMetrics);
                    i = displayMetrics.widthPixels;
                    int i2 = displayMetrics.heightPixels;
                    if (i > i2) {
                        i = i2;
                    }
                }
            }
            if (i == 0) {
                i = C23724k.m58224b(context2);
            }
        }
        int i3 = (int) (((float) i) / 5.0f);
        this.f85749f.setLayoutParams(new LayoutParams(i3, -1));
        this.f85744a.setLayoutParams(new LayoutParams(i3, -1));
        this.f85745b.setLayoutParams(new LayoutParams(i3, -1));
        this.f85746c.setLayoutParams(new LayoutParams(i3, -1));
        this.f85747d.setLayoutParams(new LayoutParams(i3, -1));
        this.f85748e.put("HOME", this.f85749f);
        this.f85748e.put("DISCOVER", this.f85744a);
        this.f85748e.put("NOTIFICATION", this.f85746c);
        this.f85748e.put("USER", this.f85747d);
        this.f85748e.put("PUBLISH", this.f85745b);
    }

    public MainBottomTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo69942a(String str, int i) {
        ((C33071k) this.f85748e.get(str)).mo70007a(i);
    }

    /* renamed from: a */
    public final void mo69943a(boolean z, String str) {
        C33071k kVar = (C33071k) this.f85748e.get(str);
        if (z) {
            kVar.mo70013f();
        } else {
            kVar.mo70014g();
        }
    }

    public MainBottomTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f85752i = true;
        this.f85748e = new HashMap<>();
        this.f85751h = this;
        setOrientation(0);
    }
}
