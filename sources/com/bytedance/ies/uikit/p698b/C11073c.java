package com.bytedance.ies.uikit.p698b;

import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.uikit.b.c */
public final class C11073c {

    /* renamed from: a */
    public Dialog f29752a;

    /* renamed from: b */
    public ImageView f29753b;

    /* renamed from: c */
    public TextView f29754c;

    /* renamed from: d */
    View f29755d;

    /* renamed from: e */
    public boolean f29756e;

    /* renamed from: f */
    public boolean f29757f;

    /* renamed from: g */
    public boolean f29758g;

    /* renamed from: h */
    public final Handler f29759h = new Handler();

    /* renamed from: i */
    public final Runnable f29760i = new Runnable() {
        public final void run() {
            C11073c.this.mo20076a();
        }
    };

    /* renamed from: a */
    public final void mo20076a() {
        if (!this.f29756e) {
            try {
                if (this.f29752a.isShowing()) {
                    C11075d.m22420a(this.f29752a);
                }
            } catch (Exception unused) {
            }
        }
    }

    public C11073c(Context context, int i, int i2, int i3) {
        LayoutInflater from = LayoutInflater.from(context);
        this.f29752a = new Dialog(context, R.style.w_);
        try {
            View inflate = from.inflate(R.layout.acw, null);
            this.f29755d = inflate;
            this.f29753b = (ImageView) inflate.findViewById(R.id.aqa);
            this.f29754c = (TextView) inflate.findViewById(R.id.text);
            this.f29752a.setContentView(this.f29755d);
            this.f29752a.getWindow().addFlags(8);
            this.f29752a.getWindow().addFlags(32);
            this.f29752a.getWindow().addFlags(16);
            this.f29752a.getWindow().setLayout(-2, -2);
            this.f29752a.getWindow().setGravity(17);
        } catch (Throwable unused) {
        }
    }
}
