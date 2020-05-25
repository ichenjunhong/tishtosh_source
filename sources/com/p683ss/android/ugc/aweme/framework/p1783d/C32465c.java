package com.p683ss.android.ugc.aweme.framework.p1783d;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.framework.d.c */
public final class C32465c {

    /* renamed from: a */
    Dialog f84538a;

    /* renamed from: b */
    ImageView f84539b;

    /* renamed from: c */
    TextView f84540c;

    /* renamed from: d */
    View f84541d;

    /* renamed from: e */
    public boolean f84542e;

    /* renamed from: f */
    boolean f84543f;

    /* renamed from: g */
    public boolean f84544g;

    /* renamed from: h */
    final Handler f84545h = new Handler();

    /* renamed from: i */
    final Runnable f84546i = new Runnable() {
        public final void run() {
            C32465c.this.mo65742d();
        }
    };

    /* renamed from: c */
    public final void mo65741c() {
        this.f84543f = false;
    }

    /* renamed from: a */
    public final void mo65733a() {
        if (!this.f84542e && !this.f84543f) {
            this.f84545h.removeCallbacks(this.f84546i);
            mo65742d();
            this.f84542e = true;
        }
    }

    /* renamed from: b */
    public final void mo65739b() {
        if (!this.f84542e && !this.f84543f) {
            this.f84545h.removeCallbacks(this.f84546i);
            mo65742d();
            this.f84543f = true;
        }
    }

    /* renamed from: d */
    public final void mo65742d() {
        if (!this.f84542e) {
            try {
                if (this.f84538a.isShowing()) {
                    C32467d.m75175a(this.f84538a);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    private void m75164e() {
        if (VERSION.SDK_INT >= 16) {
            this.f84538a.getWindow().getDecorView().setSystemUiVisibility(5380);
        } else {
            this.f84538a.getWindow().setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
        }
    }

    /* renamed from: b */
    public final void mo65740b(String str) {
        mo65736a(null, 0, 0, str, 3500, 17);
    }

    public C32465c(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        this.f84538a = new Dialog(context, R.style.w_);
        try {
            View inflate = from.inflate(R.layout.acw, null);
            this.f84541d = inflate;
            this.f84539b = (ImageView) inflate.findViewById(R.id.aqa);
            this.f84540c = (TextView) inflate.findViewById(R.id.text);
            double width = (double) ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth();
            Double.isNaN(width);
            this.f84540c.setMaxWidth((int) ((width * 0.68d) - 80.0d));
            this.f84538a.setContentView(this.f84541d);
            this.f84538a.getWindow().setBackgroundDrawable(new ColorDrawable(context.getResources().getColor(R.color.auz)));
            this.f84538a.getWindow().addFlags(8);
            this.f84538a.getWindow().addFlags(32);
            this.f84538a.getWindow().addFlags(16);
            this.f84538a.getWindow().setLayout(-2, -2);
            this.f84538a.getWindow().setGravity(17);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo65737a(String str) {
        mo65736a(null, 0, 0, str, 2000, 17);
    }

    /* renamed from: a */
    public final void mo65734a(int i, String str) {
        mo65736a(null, i, 0, str, 3500, 17);
    }

    /* renamed from: a */
    public final void mo65738a(String str, int i, int i2) {
        mo65736a(null, 0, 0, str, i, i2);
    }

    /* renamed from: a */
    public final void mo65735a(int i, String str, int i2, int i3) {
        mo65736a(null, i, 0, str, i2, i3);
    }

    /* renamed from: a */
    public void mo65736a(View view, int i, int i2, String str, int i3, int i4) {
        if (!this.f84542e && i3 > 0) {
            boolean z = true;
            boolean z2 = false;
            if (i > 0) {
                this.f84539b.setImageResource(i);
                this.f84539b.setVisibility(0);
                z2 = true;
            } else {
                this.f84539b.setVisibility(8);
            }
            if (!C9431p.m18664a(str)) {
                this.f84540c.setText(str);
            } else {
                z = z2;
            }
            if (z) {
                this.f84545h.removeCallbacks(this.f84546i);
                mo65742d();
                try {
                    this.f84538a.getWindow().setGravity(17);
                    if (this.f84544g) {
                        m75164e();
                    }
                    this.f84538a.show();
                    this.f84545h.postDelayed(this.f84546i, (long) i3);
                } catch (Exception unused) {
                }
            }
        }
    }
}
