package com.p683ss.android.ugc.aweme.music.p1978ui;

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

/* renamed from: com.ss.android.ugc.aweme.music.ui.c */
public final class C37589c extends ProgressDialog implements OnKeyListener {

    /* renamed from: e */
    public static final C37591b f95875e = new C37591b(null);

    /* renamed from: a */
    public ImageView f95876a;

    /* renamed from: b */
    public CircularProgressView f95877b;

    /* renamed from: c */
    public int f95878c;

    /* renamed from: d */
    public C37592c f95879d;

    /* renamed from: f */
    private ViewGroup f95880f;

    /* renamed from: g */
    private DmtTextView f95881g;

    /* renamed from: h */
    private DmtTextView f95882h;

    /* renamed from: i */
    private boolean f95883i;

    /* renamed from: j */
    private int f95884j;

    /* renamed from: k */
    private CharSequence f95885k;

    /* renamed from: l */
    private final C37590a f95886l;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.c$a */
    public enum C37590a {
        GONE,
        VISIBLE,
        VISIBLE_AFTER_5S
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.c$b */
    public static final class C37591b {
        private C37591b() {
        }

        public /* synthetic */ C37591b(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        private static C37589c m84032a(Context context, C37589c cVar, CharSequence charSequence) {
            cVar.setCancelable(false);
            cVar.setMax(100);
            cVar.setIndeterminate(false);
            cVar.setMessage(charSequence);
            if ((context instanceof Activity) && ((!(context instanceof AbsActivity) || ((AbsActivity) context).isActive()) && !((Activity) context).isFinishing())) {
                cVar.show();
            }
            return cVar;
        }

        /* renamed from: a */
        public final C37589c mo77109a(Context context, C37590a aVar, C37592c cVar, CharSequence charSequence) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(aVar, "cancelType");
            C52711k.m112240b(cVar, "cancelListener");
            C52711k.m112240b(charSequence, "message");
            C37589c cVar2 = new C37589c(context, aVar);
            cVar2.f95879d = cVar;
            return m84032a(context, cVar2, charSequence);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.c$c */
    public interface C37592c {
        /* renamed from: a */
        void mo76957a();
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.c$d */
    static final class C37593d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C37589c f95888a;

        C37593d(C37589c cVar) {
            this.f95888a = cVar;
        }

        public final void run() {
            if (this.f95888a.f95877b == null) {
                this.f95888a.f95877b = (CircularProgressView) this.f95888a.findViewById(R.id.b25);
            }
            CircularProgressView circularProgressView = this.f95888a.f95877b;
            if (circularProgressView != null) {
                circularProgressView.mo49173b();
            }
            C37589c.super.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.c$e */
    static final class C37594e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C37589c f95889a;

        C37594e(C37589c cVar) {
            this.f95889a = cVar;
        }

        public final void run() {
            if (this.f95889a.isShowing()) {
                ImageView imageView = this.f95889a.f95876a;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.c$f */
    static final class C37595f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37589c f95890a;

        C37595f(C37589c cVar) {
            this.f95890a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C37592c cVar = this.f95890a.f95879d;
            if (cVar != null) {
                cVar.mo76957a();
            }
            this.f95890a.dismiss();
            this.f95890a.f95878c = 0;
        }
    }

    /* renamed from: a */
    public static final C37589c m84030a(Context context, C37590a aVar, C37592c cVar, CharSequence charSequence) {
        return f95875e.mo77109a(context, aVar, cVar, charSequence);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return false;
    }

    public final void dismiss() {
        Runnable dVar = new C37593d(this);
        if (C52711k.m112239a((Object) Looper.myLooper(), (Object) Looper.getMainLooper())) {
            dVar.run();
        } else {
            C18842a.m45934b(dVar);
        }
    }

    public final void setMax(int i) {
        if (this.f95883i) {
            CircularProgressView circularProgressView = this.f95877b;
            if (circularProgressView != null) {
                circularProgressView.setMaxProgress((float) i);
            }
        }
        this.f95884j = i;
    }

    public final void setIndeterminate(boolean z) {
        int i;
        if (this.f95883i) {
            CircularProgressView circularProgressView = this.f95877b;
            if (circularProgressView != null) {
                circularProgressView.setIndeterminate(z);
            }
            DmtTextView dmtTextView = this.f95881g;
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
        if (this.f95883i) {
            DmtTextView dmtTextView = this.f95881g;
            if (dmtTextView != null) {
                dmtTextView.setText(charSequence);
            }
            DmtTextView dmtTextView2 = this.f95881g;
            if (dmtTextView2 != null) {
                if (TextUtils.isEmpty(charSequence)) {
                    i = 8;
                } else {
                    i = 0;
                }
                dmtTextView2.setVisibility(i);
            }
        }
        this.f95885k = charSequence;
    }

    public final void setProgress(int i) {
        if (i >= this.f95878c) {
            if (this.f95883i) {
                DmtTextView dmtTextView = this.f95882h;
                if (dmtTextView == null) {
                    C52711k.m112234a();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("%");
                dmtTextView.setText(sb.toString());
                CircularProgressView circularProgressView = this.f95877b;
                if (circularProgressView != null) {
                    circularProgressView.setProgress((float) i);
                }
            }
            this.f95878c = i;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ble);
        this.f95880f = (ViewGroup) findViewById(R.id.cfc);
        this.f95876a = (ImageView) findViewById(R.id.q8);
        this.f95881g = (DmtTextView) findViewById(R.id.bld);
        this.f95877b = (CircularProgressView) findViewById(R.id.b25);
        this.f95882h = (DmtTextView) findViewById(R.id.c62);
        switch (C37599d.f95894a[this.f95886l.ordinal()]) {
            case 1:
                ImageView imageView = this.f95876a;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    break;
                }
                break;
            case 2:
                ImageView imageView2 = this.f95876a;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    break;
                }
                break;
            case 3:
                ViewGroup viewGroup = this.f95880f;
                if (viewGroup != null) {
                    viewGroup.postDelayed(new C37594e(this), 5000);
                    break;
                }
                break;
        }
        this.f95883i = true;
        DmtTextView dmtTextView = this.f95881g;
        if (dmtTextView != null) {
            dmtTextView.setText(getContext().getString(R.string.dnt));
        }
        setProgress(this.f95878c);
        setCanceledOnTouchOutside(false);
        ImageView imageView3 = this.f95876a;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new C37595f(this));
        }
    }

    public C37589c(Context context, C37590a aVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "cancelType");
        this(context, 3, aVar);
    }

    private C37589c(Context context, int i, C37590a aVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "cancelType");
        super(context, 3);
        this.f95886l = aVar;
        this.f95884j = 100;
    }
}
