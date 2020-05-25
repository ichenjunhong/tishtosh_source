package com.p2615tt.appbrandimpl;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteRoundImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.tt.appbrandimpl.a */
public final class C51921a extends Dialog {

    /* renamed from: a */
    public C51923a f129565a;

    /* renamed from: b */
    private TextView f129566b;

    /* renamed from: c */
    private TextView f129567c;

    /* renamed from: d */
    private TextView f129568d;

    /* renamed from: e */
    private TextView f129569e;

    /* renamed from: f */
    private RemoteRoundImageView f129570f;

    /* renamed from: g */
    private TextView f129571g;

    /* renamed from: h */
    private TextView f129572h;

    /* renamed from: i */
    private RemoteImageView f129573i;

    /* renamed from: j */
    private OnClickListener f129574j = new OnClickListener() {
        public final void onClick(View view) {
            C51921a.this.dismiss();
        }
    };

    /* renamed from: com.tt.appbrandimpl.a$a */
    public static class C51923a {

        /* renamed from: a */
        public String f129576a;

        /* renamed from: b */
        public String f129577b;

        /* renamed from: c */
        public String f129578c;

        /* renamed from: d */
        public String f129579d;

        /* renamed from: e */
        public String f129580e;

        /* renamed from: f */
        public String f129581f;

        /* renamed from: g */
        public String f129582g;

        /* renamed from: h */
        public String f129583h;

        /* renamed from: i */
        public C51924b f129584i;

        /* renamed from: j */
        public C51924b f129585j;

        /* renamed from: k */
        public C51924b f129586k;

        /* renamed from: l */
        public C51924b f129587l;

        /* renamed from: m */
        public C51924b f129588m;

        /* renamed from: n */
        public boolean f129589n = true;

        /* renamed from: o */
        public OnClickListener f129590o;

        /* renamed from: p */
        public OnClickListener f129591p;

        /* renamed from: q */
        public OnClickListener f129592q;
    }

    /* renamed from: com.tt.appbrandimpl.a$b */
    public static class C51924b {

        /* renamed from: d */
        public static final C51924b f129593d = null;

        /* renamed from: a */
        public boolean f129594a;

        /* renamed from: b */
        public int f129595b = -1;

        /* renamed from: c */
        public int f129596c;

        public C51924b(boolean z, int i, int i2) {
            this.f129594a = z;
            this.f129596c = i2;
        }
    }

    public C51921a(Context context) {
        super(context, R.style.vb);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.avo);
        this.f129568d = (TextView) findViewById(R.id.dkb);
        this.f129569e = (TextView) findViewById(R.id.r4);
        this.f129566b = (TextView) findViewById(R.id.dl0);
        this.f129567c = (TextView) findViewById(R.id.dkw);
        this.f129571g = (TextView) findViewById(R.id.dkp);
        this.f129572h = (TextView) findViewById(R.id.dl3);
        this.f129570f = (RemoteRoundImageView) findViewById(R.id.arz);
        this.f129573i = (RemoteImageView) findViewById(R.id.d2s);
        this.f129571g.setOnClickListener(this.f129574j);
        this.f129572h.setOnClickListener(this.f129574j);
        if (!TextUtils.isEmpty(this.f129565a.f129576a)) {
            this.f129566b.setText(this.f129565a.f129576a);
            C51924b bVar = this.f129565a.f129584i;
            if (bVar != C51924b.f129593d) {
                if (bVar.f129594a) {
                    this.f129566b.setTypeface(Typeface.DEFAULT_BOLD);
                }
                if (bVar.f129596c != -1) {
                    this.f129566b.setTextColor(bVar.f129596c);
                }
                if (bVar.f129595b != -1) {
                    this.f129566b.setTextSize((float) bVar.f129595b);
                }
            }
        } else {
            this.f129566b.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f129565a.f129577b)) {
            this.f129567c.setText(this.f129565a.f129577b);
            this.f129567c.setVisibility(0);
            C51924b bVar2 = this.f129565a.f129585j;
            if (bVar2 != C51924b.f129593d) {
                if (bVar2.f129594a) {
                    this.f129567c.setTypeface(Typeface.DEFAULT_BOLD);
                }
                if (bVar2.f129596c != -1) {
                    this.f129567c.setTextColor(bVar2.f129596c);
                }
                if (bVar2.f129595b != -1) {
                    this.f129567c.setTextSize((float) bVar2.f129595b);
                }
            }
        } else {
            this.f129567c.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f129565a.f129578c)) {
            this.f129568d.setText(this.f129565a.f129578c);
            this.f129568d.setMovementMethod(new ScrollingMovementMethod());
            C51924b bVar3 = this.f129565a.f129586k;
            if (bVar3 != C51924b.f129593d) {
                if (bVar3.f129594a) {
                    this.f129568d.setTypeface(Typeface.DEFAULT_BOLD);
                }
                if (bVar3.f129596c != -1) {
                    this.f129568d.setTextColor(bVar3.f129596c);
                }
                if (bVar3.f129595b != -1) {
                    this.f129568d.setTextSize((float) bVar3.f129595b);
                }
            }
        } else {
            this.f129568d.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f129565a.f129581f)) {
            this.f129571g.setText(this.f129565a.f129581f);
            C51924b bVar4 = this.f129565a.f129587l;
            if (bVar4 != C51924b.f129593d) {
                if (bVar4.f129594a) {
                    this.f129571g.setTypeface(Typeface.DEFAULT_BOLD);
                }
                if (bVar4.f129596c != -1) {
                    this.f129571g.setTextColor(bVar4.f129596c);
                }
                if (bVar4.f129595b != -1) {
                    this.f129571g.setTextSize((float) bVar4.f129595b);
                }
            }
        } else {
            this.f129571g.setVisibility(8);
            this.f129572h.setBackgroundResource(R.drawable.qh);
        }
        if (!TextUtils.isEmpty(this.f129565a.f129582g)) {
            this.f129572h.setText(this.f129565a.f129582g);
            C51924b bVar5 = this.f129565a.f129588m;
            if (bVar5 != C51924b.f129593d) {
                if (bVar5.f129594a) {
                    this.f129572h.setTypeface(Typeface.DEFAULT_BOLD);
                }
                if (bVar5.f129596c != -1) {
                    this.f129572h.setTextColor(bVar5.f129596c);
                }
                if (bVar5.f129595b != -1) {
                    this.f129572h.setTextSize((float) bVar5.f129595b);
                }
            }
        } else {
            this.f129572h.setVisibility(8);
        }
        if (this.f129565a.f129589n) {
            C23515d.m57677a((RemoteImageView) this.f129570f, this.f129565a.f129580e);
        } else {
            this.f129570f.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f129565a.f129583h)) {
            C23515d.m57677a(this.f129573i, this.f129565a.f129583h);
            LayoutParams layoutParams = (LayoutParams) this.f129570f.getLayoutParams();
            layoutParams.topMargin = (int) C9432q.m18687b(getContext(), 80.0f);
            this.f129570f.setLayoutParams(layoutParams);
            this.f129573i.setVisibility(0);
        } else {
            this.f129573i.setVisibility(8);
            LayoutParams layoutParams2 = (LayoutParams) this.f129570f.getLayoutParams();
            layoutParams2.topMargin = (int) C9432q.m18687b(getContext(), 20.0f);
            this.f129570f.setLayoutParams(layoutParams2);
        }
        if (!TextUtils.isEmpty(this.f129565a.f129579d)) {
            this.f129569e.setVisibility(0);
            this.f129569e.setText(this.f129565a.f129579d);
            if (this.f129565a.f129590o != null) {
                this.f129569e.setOnClickListener(this.f129565a.f129590o);
            }
        } else {
            this.f129569e.setVisibility(8);
        }
        if (this.f129565a.f129591p != null) {
            this.f129571g.setOnClickListener(this.f129565a.f129591p);
        }
        if (this.f129565a.f129592q != null) {
            this.f129572h.setOnClickListener(this.f129565a.f129592q);
        }
    }
}
