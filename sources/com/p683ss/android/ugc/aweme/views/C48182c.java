package com.p683ss.android.ugc.aweme.views;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.views.c */
public final class C48182c extends Dialog {

    /* renamed from: a */
    public C48184a f121212a;

    /* renamed from: b */
    private TextView f121213b;

    /* renamed from: c */
    private TextView f121214c;

    /* renamed from: d */
    private TextView f121215d;

    /* renamed from: e */
    private TextView f121216e;

    /* renamed from: f */
    private ImageView f121217f;

    /* renamed from: g */
    private TextView f121218g;

    /* renamed from: h */
    private TextView f121219h;

    /* renamed from: i */
    private ViewGroup f121220i;

    /* renamed from: j */
    private OnClickListener f121221j = new OnClickListener() {
        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C48182c.this.dismiss();
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.views.c$a */
    public static class C48184a {

        /* renamed from: a */
        public String f121223a;

        /* renamed from: b */
        public String f121224b;

        /* renamed from: c */
        public CharSequence f121225c;

        /* renamed from: d */
        public boolean f121226d;

        /* renamed from: e */
        public int f121227e;

        /* renamed from: f */
        public int f121228f = -1;

        /* renamed from: g */
        public int f121229g = -1;

        /* renamed from: h */
        public String f121230h;

        /* renamed from: i */
        public SpannableString f121231i;

        /* renamed from: j */
        public int f121232j = -1;

        /* renamed from: k */
        public int f121233k;

        /* renamed from: l */
        public String f121234l;

        /* renamed from: m */
        public String f121235m;

        /* renamed from: n */
        public boolean f121236n;

        /* renamed from: o */
        public int f121237o = -1;

        /* renamed from: p */
        public OnClickListener f121238p;

        /* renamed from: q */
        public OnClickListener f121239q;

        /* renamed from: r */
        public OnClickListener f121240r;
    }

    public C48182c(Context context) {
        super(context, R.style.vb);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.avp);
        this.f121215d = (TextView) findViewById(R.id.dkb);
        this.f121216e = (TextView) findViewById(R.id.r4);
        this.f121213b = (TextView) findViewById(R.id.dl0);
        this.f121214c = (TextView) findViewById(R.id.dkw);
        this.f121218g = (TextView) findViewById(R.id.dkp);
        this.f121219h = (TextView) findViewById(R.id.dl3);
        this.f121217f = (ImageView) findViewById(R.id.arz);
        this.f121220i = (ViewGroup) findViewById(R.id.cfl);
        if (this.f121212a.f121237o != -1) {
            LayoutParams layoutParams = this.f121220i.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = (int) C9432q.m18687b(getContext(), (float) this.f121212a.f121237o);
                this.f121220i.setLayoutParams(layoutParams);
            }
        }
        this.f121218g.setOnClickListener(this.f121221j);
        this.f121219h.setOnClickListener(this.f121221j);
        if (!TextUtils.isEmpty(this.f121212a.f121223a)) {
            this.f121213b.setText(this.f121212a.f121223a);
        }
        if (!TextUtils.isEmpty(this.f121212a.f121224b)) {
            this.f121214c.setText(this.f121212a.f121224b);
            this.f121214c.setVisibility(0);
        } else {
            this.f121214c.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f121212a.f121225c)) {
            this.f121215d.setText(this.f121212a.f121225c);
            this.f121215d.setMaxLines(this.f121212a.f121227e);
            if (this.f121212a.f121226d) {
                this.f121215d.setVerticalScrollBarEnabled(false);
                this.f121215d.setHorizontalScrollBarEnabled(false);
            }
            this.f121215d.setMovementMethod(new ScrollingMovementMethod());
            if (this.f121212a.f121229g != -1) {
                this.f121215d.setTextColor(this.f121212a.f121229g);
            }
            if (this.f121212a.f121228f != -1) {
                this.f121215d.setGravity(this.f121212a.f121228f);
            }
        } else {
            this.f121215d.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f121212a.f121230h) || !TextUtils.isEmpty(this.f121212a.f121231i)) {
            this.f121216e.setVisibility(0);
            if (TextUtils.isEmpty(this.f121212a.f121231i)) {
                this.f121216e.setText(this.f121212a.f121230h);
            } else {
                this.f121216e.setText(this.f121212a.f121231i);
                this.f121216e.setMovementMethod(LinkMovementMethod.getInstance());
            }
            if (this.f121212a.f121232j != -1) {
                this.f121216e.setTextColor(this.f121212a.f121232j);
            }
            if (this.f121212a.f121238p != null) {
                this.f121216e.setOnClickListener(this.f121212a.f121238p);
            }
        } else {
            this.f121216e.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f121212a.f121234l)) {
            this.f121218g.setText(this.f121212a.f121234l);
        } else {
            this.f121218g.setVisibility(8);
            if (!this.f121212a.f121236n) {
                this.f121219h.setBackgroundResource(R.drawable.qh);
            }
        }
        if (!TextUtils.isEmpty(this.f121212a.f121235m)) {
            this.f121219h.setText(this.f121212a.f121235m);
        }
        this.f121217f.setImageResource(this.f121212a.f121233k);
        if (this.f121212a.f121233k == 0) {
            findViewById(R.id.as0).setVisibility(8);
            this.f121217f.setVisibility(8);
            View findViewById = findViewById(R.id.ze);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams2.setMargins(layoutParams2.leftMargin, 0, layoutParams2.rightMargin, layoutParams2.bottomMargin);
            findViewById.setLayoutParams(layoutParams2);
        }
        if (this.f121212a.f121239q != null) {
            this.f121218g.setOnClickListener(this.f121212a.f121239q);
        }
        if (this.f121212a.f121240r != null) {
            this.f121219h.setOnClickListener(this.f121212a.f121240r);
        }
    }
}
