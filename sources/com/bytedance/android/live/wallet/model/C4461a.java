package com.bytedance.android.live.wallet.model;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.host.C8807k;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.wallet.model.a */
public abstract class C4461a {

    /* renamed from: b */
    public ViewGroup f12171b;

    /* renamed from: c */
    public ImageView f12172c;

    /* renamed from: d */
    public TextView f12173d;

    /* renamed from: e */
    public TextView f12174e;

    /* renamed from: f */
    public TextView f12175f;

    /* renamed from: g */
    public TextView f12176g;

    /* renamed from: h */
    public CheckBox f12177h;

    /* renamed from: i */
    public View f12178i;

    /* renamed from: j */
    public long f12179j;

    /* renamed from: k */
    int f12180k;

    /* renamed from: l */
    int f12181l;

    /* renamed from: m */
    String f12182m;

    /* renamed from: n */
    public String f12183n;

    /* renamed from: o */
    public String f12184o;

    /* renamed from: p */
    public boolean f12185p;

    /* renamed from: q */
    public C8807k f12186q;

    /* renamed from: r */
    public C4462a f12187r;

    /* renamed from: com.bytedance.android.live.wallet.model.a$a */
    public interface C4462a {
        /* renamed from: a */
        void mo10146a(C4461a aVar, boolean z);
    }

    /* renamed from: a */
    public abstract boolean mo10137a();

    /* renamed from: b */
    public abstract void mo10138b();

    /* renamed from: a */
    public final void mo10275a(boolean z) {
        int childCount = this.f12171b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.f12171b.getChildAt(i).setEnabled(false);
        }
        if (z) {
            this.f12172c.setImageResource(this.f12180k);
        } else {
            this.f12172c.setImageResource(this.f12181l);
        }
    }

    /* renamed from: a */
    public final void mo10274a(ViewGroup viewGroup) {
        this.f12171b = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.amn, viewGroup, false);
        this.f12172c = (ImageView) this.f12171b.findViewById(R.id.b2y);
        this.f12173d = (TextView) this.f12171b.findViewById(R.id.dde);
        this.f12174e = (TextView) this.f12171b.findViewById(R.id.dda);
        this.f12175f = (TextView) this.f12171b.findViewById(R.id.ddd);
        this.f12176g = (TextView) this.f12171b.findViewById(R.id.deh);
        this.f12177h = (CheckBox) this.f12171b.findViewById(R.id.sx);
        this.f12178i = this.f12171b.findViewById(R.id.a6h);
        this.f12172c.setBackgroundResource(this.f12180k);
        this.f12173d.setText(this.f12182m);
        this.f12174e.setText(this.f12183n);
        if (!TextUtils.isEmpty(this.f12184o)) {
            this.f12175f.setVisibility(0);
            this.f12175f.setText(this.f12184o);
        }
        if (this.f12185p) {
            this.f12176g.setVisibility(0);
        }
        if (!mo10137a()) {
            mo10275a(false);
        }
        this.f12171b.setOnClickListener(new C4463b(this));
        mo10138b();
        viewGroup.addView(this.f12171b);
    }

    public C4461a(long j, int i, int i2, String str, C8807k kVar) {
        this.f12179j = j;
        this.f12180k = i;
        this.f12181l = i2;
        this.f12182m = str;
        this.f12186q = kVar;
    }
}
