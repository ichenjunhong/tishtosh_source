package com.bytedance.android.livesdk.chatroom.p325ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.eu */
public final class C6164eu extends Dialog {

    /* renamed from: a */
    public C6170b f16544a;

    /* renamed from: b */
    public C6171c f16545b;

    /* renamed from: c */
    private Context f16546c;

    /* renamed from: d */
    private RelativeLayout f16547d;

    /* renamed from: e */
    private LiveRoundImageView f16548e;

    /* renamed from: f */
    private HSImageView f16549f;

    /* renamed from: g */
    private View f16550g;

    /* renamed from: h */
    private TextView f16551h;

    /* renamed from: i */
    private TextView f16552i;

    /* renamed from: j */
    private Button f16553j;

    /* renamed from: k */
    private TextView f16554k;

    /* renamed from: l */
    private LinearLayout f16555l;

    /* renamed from: m */
    private Button f16556m;

    /* renamed from: n */
    private Button f16557n;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.eu$a */
    public static class C6169a {

        /* renamed from: a */
        public C6172d f16565a = new C6172d();

        /* renamed from: b */
        public final C6164eu mo12215b() {
            C6164eu a = mo12211a();
            a.show();
            return a;
        }

        /* renamed from: a */
        public final C6164eu mo12211a() {
            return new C6164eu(this.f16565a.f16566a, this.f16565a);
        }

        /* renamed from: a */
        public final C6169a mo12207a(OnCancelListener onCancelListener) {
            this.f16565a.f16580o = onCancelListener;
            return this;
        }

        /* renamed from: b */
        public final C6169a mo12213b(CharSequence charSequence) {
            this.f16565a.f16571f = charSequence;
            return this;
        }

        /* renamed from: a */
        public final C6169a mo12206a(int i) {
            return mo12208a(this.f16565a.f16566a.getText(R.string.f37));
        }

        /* renamed from: b */
        public final C6169a mo12212b(int i) {
            return mo12213b(this.f16565a.f16566a.getText(i));
        }

        /* renamed from: a */
        public final C6169a mo12208a(CharSequence charSequence) {
            this.f16565a.f16570e = charSequence;
            return this;
        }

        /* renamed from: a */
        public final C6169a mo12210a(boolean z) {
            this.f16565a.f16583r = z;
            return this;
        }

        public C6169a(Context context, int i) {
            this.f16565a.f16566a = context;
            this.f16565a.f16567b = 2;
        }

        /* renamed from: b */
        public final C6169a mo12214b(CharSequence charSequence, OnClickListener onClickListener) {
            this.f16565a.f16576k = charSequence;
            this.f16565a.f16577l = onClickListener;
            return this;
        }

        /* renamed from: a */
        public final C6169a mo12209a(CharSequence charSequence, OnClickListener onClickListener) {
            this.f16565a.f16574i = charSequence;
            this.f16565a.f16575j = onClickListener;
            return this;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.eu$b */
    public interface C6170b {
        /* renamed from: a */
        void mo8462a();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.eu$c */
    public interface C6171c {
        /* renamed from: a */
        void mo8463a();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.eu$d */
    public static class C6172d {

        /* renamed from: a */
        Context f16566a;

        /* renamed from: b */
        int f16567b;

        /* renamed from: c */
        public int f16568c;

        /* renamed from: d */
        Drawable f16569d;

        /* renamed from: e */
        CharSequence f16570e;

        /* renamed from: f */
        CharSequence f16571f;

        /* renamed from: g */
        CharSequence f16572g;

        /* renamed from: h */
        OnClickListener f16573h;

        /* renamed from: i */
        CharSequence f16574i;

        /* renamed from: j */
        OnClickListener f16575j;

        /* renamed from: k */
        CharSequence f16576k;

        /* renamed from: l */
        OnClickListener f16577l;

        /* renamed from: m */
        CharSequence f16578m;

        /* renamed from: n */
        View.OnClickListener f16579n;

        /* renamed from: o */
        OnCancelListener f16580o;

        /* renamed from: p */
        OnDismissListener f16581p;

        /* renamed from: q */
        OnShowListener f16582q;

        /* renamed from: r */
        boolean f16583r;

        private C6172d() {
            this.f16583r = true;
        }
    }

    public final void dismiss() {
        super.dismiss();
    }

    public final void onBackPressed() {
        if (this.f16544a != null) {
            this.f16544a.mo8462a();
        }
        super.onBackPressed();
    }

    public final void show() {
        super.show();
        Window window = getWindow();
        if (window != null) {
            LayoutParams layoutParams = new LayoutParams();
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = (int) this.f16546c.getResources().getDimension(R.dimen.ro);
            layoutParams.height = -2;
            window.setAttributes(layoutParams);
        }
    }

    /* renamed from: b */
    public final void mo12197b(CharSequence charSequence) {
        this.f16552i.setText(charSequence);
    }

    /* renamed from: a */
    public final void mo12193a(View.OnClickListener onClickListener) {
        this.f16553j.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public final void mo12194a(CharSequence charSequence) {
        this.f16551h.setText(charSequence);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        if (1 == motionEvent.getAction()) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int scaledWindowTouchSlop = ViewConfiguration.get(getContext()).getScaledWindowTouchSlop();
            if (!(getWindow() == null || getWindow().getDecorView() == null)) {
                View decorView = getWindow().getDecorView();
                int i = -scaledWindowTouchSlop;
                if (x >= i && y >= i && x <= decorView.getWidth() + scaledWindowTouchSlop && y <= decorView.getHeight() + scaledWindowTouchSlop) {
                    z = false;
                }
            }
            if (z && this.f16545b != null) {
                this.f16545b.mo8463a();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private void m13344a(int i) {
        this.f16547d = (RelativeLayout) this.f16550g.findViewById(R.id.d30);
        this.f16548e = (LiveRoundImageView) this.f16550g.findViewById(R.id.d2z);
        this.f16549f = (HSImageView) this.f16550g.findViewById(R.id.d2t);
        this.f16551h = (TextView) this.f16550g.findViewById(R.id.cf0);
        this.f16552i = (TextView) this.f16550g.findViewById(R.id.cez);
        this.f16553j = (Button) this.f16550g.findViewById(R.id.cev);
        this.f16554k = (TextView) this.f16550g.findViewById(R.id.ceu);
        this.f16555l = (LinearLayout) this.f16550g.findViewById(R.id.cew);
        this.f16556m = (Button) this.f16550g.findViewById(R.id.cex);
        this.f16557n = (Button) this.f16550g.findViewById(R.id.cey);
        if (i == 1) {
            this.f16553j.setVisibility(0);
            this.f16555l.setVisibility(8);
            return;
        }
        if (i == 2) {
            this.f16553j.setVisibility(8);
            this.f16555l.setVisibility(0);
        }
    }

    /* renamed from: a */
    public static C6164eu m13343a(Context context, int i) {
        return new C6164eu(context, 1);
    }

    private C6164eu(Context context, int i) {
        super(context, R.style.yz);
        this.f16546c = context;
        this.f16550g = LayoutInflater.from(getContext()).inflate(R.layout.aj9, null);
        setContentView(this.f16550g);
        m13344a(i);
    }

    /* renamed from: a */
    public final void mo12196a(boolean z, String str) {
        this.f16553j.setEnabled(z);
        this.f16553j.setText(str);
    }

    private C6164eu(Context context, final C6172d dVar) {
        int i;
        super(context, R.style.yz);
        this.f16546c = context;
        if (dVar.f16568c > 0) {
            i = dVar.f16568c;
        } else {
            i = R.layout.aj9;
        }
        this.f16550g = LayoutInflater.from(getContext()).inflate(i, null);
        setContentView(this.f16550g);
        m13344a(dVar.f16567b);
        this.f16551h.setText(dVar.f16570e);
        this.f16552i.setText(dVar.f16571f);
        if (TextUtils.isEmpty(dVar.f16571f)) {
            this.f16552i.setVisibility(8);
        } else {
            this.f16552i.setVisibility(0);
        }
        if (dVar.f16567b == 1) {
            this.f16553j.setVisibility(0);
            this.f16555l.setVisibility(8);
            this.f16553j.setText(dVar.f16572g);
            this.f16553j.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    dVar.f16573h.onClick(C6164eu.this, 0);
                }
            });
        } else if (dVar.f16567b == 2) {
            this.f16553j.setVisibility(8);
            this.f16555l.setVisibility(0);
            this.f16556m.setText(dVar.f16574i);
            this.f16557n.setText(dVar.f16576k);
            this.f16556m.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    dVar.f16575j.onClick(C6164eu.this, 1);
                }
            });
            this.f16557n.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    dVar.f16577l.onClick(C6164eu.this, 2);
                }
            });
        }
        if (dVar.f16569d != null) {
            this.f16547d.setVisibility(0);
            this.f16548e.setImageDrawable(dVar.f16569d);
            this.f16548e.setOnClickListener(dVar.f16579n);
            this.f16549f.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C6164eu.this.dismiss();
                }
            });
        }
        if (!TextUtils.isEmpty(dVar.f16578m)) {
            this.f16554k.setVisibility(0);
            this.f16554k.setText(dVar.f16578m);
            this.f16554k.setOnClickListener(dVar.f16579n);
        }
        setCancelable(dVar.f16583r);
        setOnCancelListener(dVar.f16580o);
        setOnDismissListener(dVar.f16581p);
        setOnShowListener(dVar.f16582q);
    }

    /* renamed from: a */
    public final void mo12195a(boolean z, CharSequence charSequence, View.OnClickListener onClickListener) {
        if (z) {
            this.f16554k.setVisibility(0);
            this.f16554k.setText(charSequence);
            this.f16554k.setOnClickListener(onClickListener);
            return;
        }
        this.f16554k.setVisibility(8);
    }
}
