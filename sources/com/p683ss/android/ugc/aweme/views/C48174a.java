package com.p683ss.android.ugc.aweme.views;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.base.widget.CircularProgressView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.views.a */
public final class C48174a extends ProgressDialog implements OnKeyListener {

    /* renamed from: e */
    public static final C48176b f121195e = new C48176b(null);

    /* renamed from: a */
    public ImageView f121196a;

    /* renamed from: b */
    public CircularProgressView f121197b;

    /* renamed from: c */
    public int f121198c;

    /* renamed from: d */
    public C48177c f121199d;

    /* renamed from: f */
    private ViewGroup f121200f;

    /* renamed from: g */
    private DmtTextView f121201g;

    /* renamed from: h */
    private DmtTextView f121202h;

    /* renamed from: i */
    private boolean f121203i;

    /* renamed from: j */
    private int f121204j;

    /* renamed from: k */
    private CharSequence f121205k;

    /* renamed from: l */
    private final C48175a f121206l;

    /* renamed from: com.ss.android.ugc.aweme.views.a$a */
    public enum C48175a {
        GONE,
        VISIBLE,
        VISIBLE_AFTER_5S
    }

    /* renamed from: com.ss.android.ugc.aweme.views.a$b */
    public static final class C48176b {
        private C48176b() {
        }

        public /* synthetic */ C48176b(C52707g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C48174a m104423a(Context context, C48175a aVar, C48177c cVar, CharSequence charSequence) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(aVar, "cancelType");
            C52711k.m112240b(cVar, "cancelListener");
            C52711k.m112240b(charSequence, "message");
            C48174a aVar2 = new C48174a(context, aVar);
            aVar2.f121199d = cVar;
            aVar2.setCancelable(false);
            aVar2.setMax(100);
            aVar2.setIndeterminate(false);
            aVar2.setMessage(charSequence);
            if ((context instanceof Activity) && ((!(context instanceof AbsActivity) || ((AbsActivity) context).isActive()) && !((Activity) context).isFinishing())) {
                aVar2.show();
            }
            return aVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.a$c */
    public interface C48177c {
        /* renamed from: a */
        void mo94272a();
    }

    /* renamed from: com.ss.android.ugc.aweme.views.a$d */
    static final class C48178d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C48174a f121208a;

        C48178d(C48174a aVar) {
            this.f121208a = aVar;
        }

        public final void run() {
            if (this.f121208a.f121197b == null) {
                this.f121208a.f121197b = (CircularProgressView) this.f121208a.findViewById(R.id.b25);
            }
            CircularProgressView circularProgressView = this.f121208a.f121197b;
            if (circularProgressView != null) {
                circularProgressView.mo49173b();
            }
            C48174a.super.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.a$e */
    static final class C48179e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C48174a f121209a;

        C48179e(C48174a aVar) {
            this.f121209a = aVar;
        }

        public final void run() {
            if (this.f121209a.isShowing()) {
                ImageView imageView = this.f121209a.f121196a;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.a$f */
    static final class C48180f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C48174a f121210a;

        C48180f(C48174a aVar) {
            this.f121210a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C48177c cVar = this.f121210a.f121199d;
            if (cVar != null) {
                cVar.mo94272a();
            }
            this.f121210a.dismiss();
            this.f121210a.f121198c = 0;
        }
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return false;
    }

    public final void dismiss() {
        Runnable dVar = new C48178d(this);
        if (C52711k.m112239a((Object) Looper.myLooper(), (Object) Looper.getMainLooper())) {
            dVar.run();
        } else {
            C18842a.m45934b(dVar);
        }
    }

    public final void setMax(int i) {
        if (this.f121203i) {
            CircularProgressView circularProgressView = this.f121197b;
            if (circularProgressView != null) {
                circularProgressView.setMaxProgress((float) i);
            }
        }
        this.f121204j = i;
    }

    public final void setIndeterminate(boolean z) {
        int i;
        if (this.f121203i) {
            CircularProgressView circularProgressView = this.f121197b;
            if (circularProgressView != null) {
                circularProgressView.setIndeterminate(z);
            }
            DmtTextView dmtTextView = this.f121201g;
            if (dmtTextView == null) {
                C52711k.m112234a();
            }
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            dmtTextView.setVisibility(i);
        }
    }

    public final void setMessage(CharSequence charSequence) {
        int i;
        super.setMessage(charSequence);
        if (this.f121203i) {
            DmtTextView dmtTextView = this.f121201g;
            if (dmtTextView != null) {
                dmtTextView.setText(charSequence);
            }
            DmtTextView dmtTextView2 = this.f121201g;
            if (dmtTextView2 != null) {
                if (TextUtils.isEmpty(charSequence)) {
                    i = 8;
                } else {
                    i = 0;
                }
                dmtTextView2.setVisibility(i);
            }
        }
        this.f121205k = charSequence;
    }

    public final void setProgress(int i) {
        if (i >= this.f121198c) {
            if (this.f121203i) {
                DmtTextView dmtTextView = this.f121202h;
                if (dmtTextView == null) {
                    C52711k.m112234a();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("%");
                dmtTextView.setText(sb.toString());
                CircularProgressView circularProgressView = this.f121197b;
                if (circularProgressView != null) {
                    circularProgressView.setProgress((float) i);
                }
            }
            this.f121198c = i;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.b4z);
        this.f121200f = (ViewGroup) findViewById(R.id.cfc);
        this.f121196a = (ImageView) findViewById(R.id.q8);
        this.f121201g = (DmtTextView) findViewById(R.id.bld);
        this.f121197b = (CircularProgressView) findViewById(R.id.b25);
        this.f121202h = (DmtTextView) findViewById(R.id.c62);
        switch (C48181b.f121211a[this.f121206l.ordinal()]) {
            case 1:
                ImageView imageView = this.f121196a;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    break;
                }
                break;
            case 2:
                ImageView imageView2 = this.f121196a;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    break;
                }
                break;
            case 3:
                ViewGroup viewGroup = this.f121200f;
                if (viewGroup != null) {
                    viewGroup.postDelayed(new C48179e(this), 5000);
                    break;
                }
                break;
        }
        this.f121203i = true;
        DmtTextView dmtTextView = this.f121201g;
        if (dmtTextView != null) {
            dmtTextView.setText(getContext().getString(R.string.dnt));
        }
        setProgress(this.f121198c);
        setCanceledOnTouchOutside(false);
        ImageView imageView3 = this.f121196a;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new C48180f(this));
        }
    }

    public C48174a(Context context, C48175a aVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "cancelType");
        this(context, 3, aVar);
    }

    private C48174a(Context context, int i, C48175a aVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "cancelType");
        super(context, 3);
        this.f121206l = aVar;
        this.f121204j = 100;
    }
}
