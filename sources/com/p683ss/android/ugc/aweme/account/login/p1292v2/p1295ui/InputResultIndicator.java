package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.support.p030v4.content.C0726c;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator */
public final class InputResultIndicator extends LinearLayout {

    /* renamed from: d */
    public static final C21858a f59159d = new C21858a(null);

    /* renamed from: a */
    public View f59160a;

    /* renamed from: b */
    public View f59161b;

    /* renamed from: c */
    public int f59162c;

    /* renamed from: e */
    private ImageView f59163e;

    /* renamed from: f */
    private TextView f59164f;

    /* renamed from: g */
    private int f59165g;

    /* renamed from: h */
    private int f59166h;

    /* renamed from: i */
    private int f59167i;

    /* renamed from: j */
    private int f59168j;

    /* renamed from: k */
    private boolean f59169k;

    /* renamed from: l */
    private int f59170l;

    /* renamed from: m */
    private int f59171m;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator$a */
    public static final class C21858a {
        private C21858a() {
        }

        public /* synthetic */ C21858a(C52707g gVar) {
            this();
        }
    }

    public InputResultIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo45986a() {
        this.f59160a.setBackgroundColor(this.f59166h);
        this.f59161b.setVisibility(8);
    }

    /* renamed from: a */
    private final boolean m54536a(int i) {
        try {
            return C52711k.m112239a((Object) getResources().getResourceTypeName(i), (Object) "drawable");
        } catch (NotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo45987a(String str) {
        C52711k.m112240b(str, "text");
        m54535a(str, 0, this.f59169k);
    }

    /* renamed from: a */
    private void m54535a(String str, int i, boolean z) {
        C52711k.m112240b(str, "text");
        if (m54536a(0)) {
            this.f59163e.setImageResource(0);
        }
        if (z) {
            this.f59160a.setVisibility(0);
            this.f59160a.setBackgroundColor(this.f59162c);
        } else {
            this.f59160a.setVisibility(8);
        }
        this.f59161b.setVisibility(0);
        this.f59164f.setText(str);
    }

    public InputResultIndicator(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f59169k = true;
        this.f59170l = -1;
        this.f59171m = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842901, R.attr.ac2, R.attr.ac3, R.attr.ac4, R.attr.acx, R.attr.add, R.attr.ade, R.attr.adj});
        this.f59165g = obtainStyledAttributes.getDimensionPixelSize(1, C23728o.m58241a(0.5d));
        this.f59166h = obtainStyledAttributes.getColor(2, C0726c.m2098c(context, R.color.n));
        this.f59162c = obtainStyledAttributes.getColor(3, C0726c.m2098c(context, R.color.xn));
        this.f59167i = obtainStyledAttributes.getColor(6, C0726c.m2098c(context, R.color.xn));
        this.f59168j = obtainStyledAttributes.getResourceId(5, R.drawable.cfv);
        this.f59169k = obtainStyledAttributes.getBoolean(7, true);
        this.f59170l = obtainStyledAttributes.getDimensionPixelSize(4, -1);
        int i2 = 0;
        this.f59171m = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
        View.inflate(context, R.layout.b0h, this);
        View findViewById = findViewById(R.id.es6);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.result_indicator_group_line)");
        this.f59160a = findViewById;
        View findViewById2 = findViewById(R.id.es4);
        C52711k.m112236a((Object) findViewById2, "findViewById(R.id.result_indicator_group_content)");
        this.f59161b = findViewById2;
        View findViewById3 = findViewById(R.id.es5);
        C52711k.m112236a((Object) findViewById3, "findViewById(R.id.result_indicator_group_image)");
        this.f59163e = (ImageView) findViewById3;
        View findViewById4 = findViewById(R.id.es7);
        C52711k.m112236a((Object) findViewById4, "findViewById(R.id.result_indicator_group_text)");
        this.f59164f = (TextView) findViewById4;
        if (this.f59170l != -1) {
            LayoutParams layoutParams = this.f59161b.getLayoutParams();
            if (layoutParams != null) {
                ((MarginLayoutParams) layoutParams).topMargin = this.f59170l;
            } else {
                throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        if (this.f59171m != -1) {
            this.f59164f.setTextSize(0, (float) this.f59171m);
        }
        View view = this.f59160a;
        int i3 = this.f59165g;
        if (view != null) {
            LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.height = i3;
            view.setLayoutParams(layoutParams2);
        }
        if (m54536a(this.f59168j)) {
            this.f59163e.setImageResource(this.f59168j);
        }
        this.f59164f.setTextColor(this.f59167i);
        View view2 = this.f59160a;
        if (!this.f59169k) {
            i2 = 8;
        }
        view2.setVisibility(i2);
        mo45986a();
    }

    public /* synthetic */ InputResultIndicator(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
