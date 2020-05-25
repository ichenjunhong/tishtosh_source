package com.p683ss.android.sdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.sdk.a */
public final class C19715a {

    /* renamed from: a */
    Dialog f54275a;

    /* renamed from: b */
    ImageView f54276b;

    /* renamed from: c */
    TextView f54277c;

    /* renamed from: d */
    View f54278d;

    /* renamed from: e */
    public boolean f54279e;

    /* renamed from: f */
    public boolean f54280f;

    /* renamed from: g */
    public boolean f54281g;

    /* renamed from: h */
    public final Handler f54282h = new Handler();

    /* renamed from: i */
    public final Runnable f54283i = new Runnable() {
        public final void run() {
            C19715a.this.mo41115a();
        }
    };

    /* renamed from: a */
    public final void mo41115a() {
        if (!this.f54279e) {
            try {
                if (this.f54275a.isShowing()) {
                    C19733b.m48230a(this.f54275a);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private void m48203b() {
        if (VERSION.SDK_INT >= 16) {
            this.f54275a.getWindow().getDecorView().setSystemUiVisibility(5380);
        } else {
            this.f54275a.getWindow().addFlags(PreloadTask.BYTE_UNIT_NUMBER);
        }
    }

    /* renamed from: a */
    public final void mo41117a(boolean z) {
        this.f54281g = z;
        if (this.f54281g) {
            m48203b();
        } else if (VERSION.SDK_INT >= 16) {
            int systemUiVisibility = this.f54275a.getWindow().getDecorView().getSystemUiVisibility();
            if ((systemUiVisibility & 5380) != 0) {
                this.f54275a.getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility ^ 5380);
            }
        } else {
            this.f54275a.getWindow().clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
        }
    }

    public C19715a(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        this.f54275a = new Dialog(context, R.style.w_);
        try {
            View inflate = from.inflate(R.layout.acw, null);
            this.f54278d = inflate;
            this.f54276b = (ImageView) inflate.findViewById(R.id.aqa);
            this.f54277c = (TextView) inflate.findViewById(R.id.text);
            this.f54275a.setContentView(this.f54278d);
            this.f54275a.getWindow().addFlags(8);
            this.f54275a.getWindow().addFlags(32);
            this.f54275a.getWindow().addFlags(16);
            this.f54275a.getWindow().setLayout(-2, -2);
            this.f54275a.getWindow().setGravity(17);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo41116a(View view, int i, int i2, String str, int i3, int i4) {
        if (!this.f54279e && i3 > 0) {
            boolean z = true;
            boolean z2 = false;
            if (i > 0) {
                this.f54276b.setImageResource(i);
                this.f54276b.setVisibility(0);
                z2 = true;
            } else {
                this.f54276b.setVisibility(8);
            }
            if (!C9431p.m18664a(str)) {
                this.f54277c.setText(str);
            } else {
                z = z2;
            }
            if (z) {
                this.f54282h.removeCallbacks(this.f54283i);
                mo41115a();
                try {
                    this.f54275a.getWindow().setGravity(i4);
                    if (this.f54281g) {
                        m48203b();
                    }
                    this.f54275a.show();
                    this.f54282h.postDelayed(this.f54283i, (long) i3);
                } catch (Exception unused) {
                }
            }
        }
    }
}
