package com.bytedance.android.livesdk.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.widget.C8555i.C8556a;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.widget.h */
public final class C8548h extends Dialog {

    /* renamed from: a */
    public TextView f23443a;

    /* renamed from: b */
    public TextView f23444b;

    /* renamed from: c */
    public View f23445c;

    /* renamed from: d */
    public Animation f23446d;

    /* renamed from: e */
    private HSImageView f23447e;

    /* renamed from: f */
    private Button f23448f;

    /* renamed from: g */
    private Button f23449g;

    /* renamed from: h */
    private Button f23450h;

    /* renamed from: com.bytedance.android.livesdk.widget.h$a */
    public static class C8552a implements C8556a {

        /* renamed from: a */
        public C8554c f23458a;

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C8556a mo14998a(View view) {
            this.f23458a.f23469h = view;
            return this;
        }

        /* renamed from: a */
        public final Context mo14989a() {
            return this.f23458a.f23464c;
        }

        /* renamed from: c */
        public final C8548h mo15011d() {
            C8548h b = mo15001b();
            b.show();
            return b;
        }

        /* renamed from: b */
        public final C8548h mo15001b() {
            return new C8548h(this.f23458a.f23464c, this.f23458a);
        }

        public C8552a(Context context) {
            this(context, 0);
        }

        /* renamed from: b */
        public final C8552a mo15009c(CharSequence charSequence) {
            this.f23458a.f23467f = charSequence;
            return this;
        }

        /* renamed from: a */
        public final C8552a mo15012d(int i) {
            return mo15013d(this.f23458a.f23464c.getText(i));
        }

        /* renamed from: b */
        public final C8552a mo15008c(int i) {
            return mo15009c(this.f23458a.f23464c.getText(i));
        }

        /* renamed from: b */
        public final C8548h mo15002b(boolean z) {
            if (!z) {
                return mo15011d();
            }
            C8548h b = mo15001b();
            if (VERSION.SDK_INT >= 26) {
                b.getWindow().setType(2038);
            } else {
                b.getWindow().setType(2002);
            }
            b.show();
            return b;
        }

        /* renamed from: c */
        public final /* synthetic */ C8556a mo15010c(boolean z) {
            return mo14996a(false);
        }

        /* renamed from: a */
        public final C8552a mo15005b(OnDismissListener onDismissListener) {
            this.f23458a.f23472k = onDismissListener;
            return this;
        }

        /* renamed from: a */
        public final C8552a mo15006b(OnShowListener onShowListener) {
            this.f23458a.f23473l = onShowListener;
            return this;
        }

        /* renamed from: a */
        public final C8552a mo15013d(CharSequence charSequence) {
            this.f23458a.f23466e = charSequence;
            return this;
        }

        /* renamed from: a */
        public final C8552a mo14996a(boolean z) {
            this.f23458a.f23474m = z;
            return this;
        }

        /* renamed from: a */
        public final C8556a mo14997a(float f) {
            this.f23458a.f23475n = Float.valueOf(f);
            return this;
        }

        public C8552a(Context context, int i) {
            this.f23458a = new C8554c();
            this.f23458a.f23464c = context;
            this.f23458a.f23462a = i;
            this.f23458a.f23463b = false;
        }

        /* renamed from: a */
        public final C8552a mo15003b(int i, int i2, OnClickListener onClickListener) {
            return mo15004b(i, this.f23458a.f23464c.getText(i2), onClickListener);
        }

        /* renamed from: a */
        public final C8552a mo15004b(int i, CharSequence charSequence, OnClickListener onClickListener) {
            if (i > 4) {
                return this;
            }
            C8553b bVar = this.f23458a.f23470i[i];
            if (bVar == null) {
                bVar = new C8553b();
                this.f23458a.f23470i[i] = bVar;
            }
            bVar.f23459a = i;
            bVar.f23460b = charSequence;
            bVar.f23461c = onClickListener;
            return this;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.h$b */
    static class C8553b {

        /* renamed from: a */
        int f23459a;

        /* renamed from: b */
        CharSequence f23460b;

        /* renamed from: c */
        OnClickListener f23461c;

        private C8553b() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.h$c */
    public static class C8554c {

        /* renamed from: a */
        int f23462a;

        /* renamed from: b */
        boolean f23463b;

        /* renamed from: c */
        Context f23464c;

        /* renamed from: d */
        Uri f23465d;

        /* renamed from: e */
        CharSequence f23466e;

        /* renamed from: f */
        CharSequence f23467f;

        /* renamed from: g */
        public View f23468g;

        /* renamed from: h */
        View f23469h;

        /* renamed from: i */
        C8553b[] f23470i;

        /* renamed from: j */
        OnCancelListener f23471j;

        /* renamed from: k */
        OnDismissListener f23472k;

        /* renamed from: l */
        OnShowListener f23473l;

        /* renamed from: m */
        boolean f23474m;

        /* renamed from: n */
        Float f23475n;

        private C8554c() {
            this.f23470i = new C8553b[5];
            this.f23474m = true;
        }
    }

    /* renamed from: a */
    private void m16857a(Uri uri) {
        if (this.f23447e != null) {
            this.f23447e.setImageURI(uri);
        }
    }

    public final void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public final void setTitle(CharSequence charSequence) {
        if (this.f23443a != null) {
            this.f23443a.setText(charSequence);
        }
    }

    /* renamed from: a */
    public final void mo14983a(CharSequence charSequence) {
        if (this.f23444b != null) {
            this.f23444b.setText(charSequence);
        }
    }

    /* renamed from: a */
    private void m16859a(C8554c cVar) {
        boolean z;
        this.f23447e = (HSImageView) findViewById(R.id.bcx);
        this.f23443a = (TextView) findViewById(R.id.bd1);
        this.f23444b = (TextView) findViewById(R.id.bd0);
        if (cVar.f23469h != null) {
            this.f23447e.setVisibility(8);
            this.f23443a.setVisibility(8);
            this.f23444b.setVisibility(8);
            findViewById(R.id.bd4).setVisibility(8);
            findViewById(R.id.bd3).setVisibility(8);
            findViewById(R.id.bcn).setVisibility(8);
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.bcv);
            frameLayout.addView(cVar.f23469h);
            frameLayout.setVisibility(0);
        } else {
            if (cVar.f23465d == null) {
                this.f23447e.setVisibility(8);
                findViewById(R.id.bcy).setVisibility(8);
            } else {
                m16857a(cVar.f23465d);
            }
            if (cVar.f23466e != null) {
                this.f23443a.setText(cVar.f23466e);
                this.f23443a.setVisibility(0);
            } else {
                this.f23443a.setVisibility(8);
                findViewById(R.id.bd3).setVisibility(8);
            }
            if (cVar.f23467f != null) {
                if (cVar.f23463b) {
                    this.f23444b.setGravity(8388611);
                }
                this.f23444b.setText(cVar.f23467f);
            } else {
                this.f23444b.setVisibility(8);
                findViewById(R.id.bd3).setVisibility(8);
            }
        }
        if (cVar.f23475n != null) {
            ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
            if (viewGroup != null) {
                View childAt = viewGroup.getChildAt(0);
                if (childAt != null && (childAt.getBackground() instanceof GradientDrawable)) {
                    GradientDrawable gradientDrawable = (GradientDrawable) childAt.getBackground().mutate();
                    gradientDrawable.setCornerRadius(C9432q.m18687b(getContext(), cVar.f23475n.floatValue()));
                    childAt.setBackground(gradientDrawable);
                }
            }
        }
        if (cVar.f23462a == 0 || 4 == cVar.f23462a ? !(cVar.f23470i[0] == null && cVar.f23470i[1] == null) : 1 != cVar.f23462a ? 3 == cVar.f23462a : !(cVar.f23470i[2] == null && cVar.f23470i[3] == null && cVar.f23470i[4] == null)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            findViewById(R.id.bcr).setVisibility(8);
        } else if (cVar.f23462a == 0 || 3 == cVar.f23462a || 4 == cVar.f23462a) {
            this.f23448f = (Button) findViewById(R.id.bco);
            m16858a(this.f23448f, 0, null, cVar);
            this.f23449g = (Button) findViewById(R.id.bcp);
            m16858a(this.f23449g, 1, findViewById(R.id.ej_), cVar);
            this.f23445c = findViewById(R.id.bd3);
        } else {
            this.f23448f = (Button) findViewById(R.id.bco);
            m16858a(this.f23448f, 2, findViewById(R.id.bcs), cVar);
            this.f23449g = (Button) findViewById(R.id.bcp);
            m16858a(this.f23449g, 3, findViewById(R.id.bct), cVar);
            this.f23450h = (Button) findViewById(R.id.bcq);
            m16858a(this.f23450h, 4, findViewById(R.id.bcu), cVar);
        }
        setCancelable(cVar.f23474m);
        setOnCancelListener(cVar.f23471j);
        setOnDismissListener(cVar.f23472k);
        setOnShowListener(cVar.f23473l);
    }

    private C8548h(Context context, final C8554c cVar) {
        super(context, R.style.yz);
        if (cVar.f23468g != null) {
            setContentView(cVar.f23468g);
        } else if (2 == cVar.f23462a) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.aho, null);
            setContentView(inflate);
            this.f23444b = (TextView) findViewById(R.id.bd0);
            if (!(this.f23444b == null || cVar.f23467f == null)) {
                this.f23444b.setText(cVar.f23467f);
            }
            setCancelable(cVar.f23474m);
            setOnCancelListener(cVar.f23471j);
            setOnDismissListener(new OnDismissListener() {
                public final void onDismiss(DialogInterface dialogInterface) {
                    if (cVar.f23472k != null) {
                        cVar.f23472k.onDismiss(dialogInterface);
                    }
                    if (C8548h.this.f23446d != null && !C8548h.this.f23446d.hasEnded()) {
                        C8548h.this.f23446d.cancel();
                    }
                }
            });
            setOnShowListener(new OnShowListener() {
                public final void onShow(DialogInterface dialogInterface) {
                    if (cVar.f23473l != null) {
                        cVar.f23473l.onShow(dialogInterface);
                    }
                    View findViewById = C8548h.this.findViewById(R.id.bcz);
                    if (findViewById != null) {
                        C8548h hVar = C8548h.this;
                        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                        hVar.f23446d = rotateAnimation;
                        C8548h.this.f23446d.setInterpolator(new LinearInterpolator());
                        C8548h.this.f23446d.setRepeatMode(1);
                        C8548h.this.f23446d.setRepeatCount(-1);
                        C8548h.this.f23446d.setDuration(1000);
                        findViewById.startAnimation(C8548h.this.f23446d);
                    }
                }
            });
            int b = (int) C9432q.m18687b(getContext(), 80.0f);
            LayoutParams layoutParams = inflate.getLayoutParams();
            layoutParams.width = b;
            layoutParams.height = b;
            inflate.setLayoutParams(layoutParams);
        } else if (1 == cVar.f23462a) {
            setContentView(LayoutInflater.from(getContext()).inflate(R.layout.ahp, null));
            m16859a(cVar);
        } else if (3 == cVar.f23462a) {
            View inflate2 = LayoutInflater.from(getContext()).inflate(R.layout.aj4, null);
            setContentView(inflate2);
            int b2 = (int) C9432q.m18687b(getContext(), 280.0f);
            LayoutParams layoutParams2 = inflate2.getLayoutParams();
            layoutParams2.width = b2;
            inflate2.setLayoutParams(layoutParams2);
            m16859a(cVar);
        } else if (cVar.f23462a == 4) {
            setContentView(LayoutInflater.from(getContext()).inflate(R.layout.bw0, null));
            m16859a(cVar);
        } else {
            setContentView(LayoutInflater.from(getContext()).inflate(R.layout.ahn, null));
            m16859a(cVar);
        }
    }

    /* renamed from: a */
    private void m16858a(Button button, final int i, View view, C8554c cVar) {
        final C8553b bVar = cVar.f23470i[i];
        if (bVar != null) {
            button.setText(bVar.f23460b);
            button.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (bVar.f23461c != null) {
                        bVar.f23461c.onClick(C8548h.this, i);
                    }
                }
            });
            return;
        }
        button.setVisibility(8);
        if (view != null) {
            view.setVisibility(8);
        }
    }
}
