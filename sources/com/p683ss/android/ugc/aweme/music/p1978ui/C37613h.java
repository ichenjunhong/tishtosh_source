package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.ui.h */
public final class C37613h extends ProgressDialog implements OnKeyListener {

    /* renamed from: d */
    public static final C37615b f95920d = new C37615b(null);

    /* renamed from: a */
    public ImageView f95921a;

    /* renamed from: b */
    public int f95922b;

    /* renamed from: c */
    public C37616c f95923c;

    /* renamed from: e */
    private ViewGroup f95924e;

    /* renamed from: f */
    private DmtTextView f95925f;

    /* renamed from: g */
    private DmtStatusView f95926g;

    /* renamed from: h */
    private boolean f95927h;

    /* renamed from: i */
    private CharSequence f95928i;

    /* renamed from: j */
    private final C37614a f95929j;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.h$a */
    public enum C37614a {
        GONE,
        VISIBLE,
        VISIBLE_AFTER_5S
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.h$b */
    public static final class C37615b {
        private C37615b() {
        }

        public /* synthetic */ C37615b(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        private static C37613h m84063a(Context context, C37613h hVar) {
            hVar.setCancelable(false);
            if ((context instanceof Activity) && ((!(context instanceof AbsActivity) || ((AbsActivity) context).isActive()) && !((Activity) context).isFinishing())) {
                hVar.show();
            }
            return hVar;
        }

        /* renamed from: a */
        public final C37613h mo77128a(Context context, C37614a aVar, C37616c cVar) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(aVar, "cancelType");
            C52711k.m112240b(cVar, "cancelListener");
            C37613h hVar = new C37613h(context, aVar);
            hVar.f95923c = cVar;
            return m84063a(context, hVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.h$c */
    public interface C37616c {
        /* renamed from: a */
        void mo76956a();
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.h$d */
    static final class C37617d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C37613h f95931a;

        C37617d(C37613h hVar) {
            this.f95931a = hVar;
        }

        public final void run() {
            ImageView imageView = this.f95931a.f95921a;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.h$e */
    static final class C37618e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37613h f95932a;

        C37618e(C37613h hVar) {
            this.f95932a = hVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C37616c cVar = this.f95932a.f95923c;
            if (cVar != null) {
                cVar.mo76956a();
            }
            this.f95932a.dismiss();
            this.f95932a.f95922b = 0;
        }
    }

    /* renamed from: a */
    public static final C37613h m84062a(Context context, C37614a aVar, C37616c cVar) {
        return f95920d.mo77128a(context, aVar, cVar);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return false;
    }

    public final void setMessage(CharSequence charSequence) {
        int i;
        super.setMessage(charSequence);
        if (this.f95927h) {
            DmtTextView dmtTextView = this.f95925f;
            if (dmtTextView != null) {
                dmtTextView.setText(charSequence);
            }
            DmtTextView dmtTextView2 = this.f95925f;
            if (dmtTextView2 != null) {
                if (TextUtils.isEmpty(charSequence)) {
                    i = 8;
                } else {
                    i = 0;
                }
                dmtTextView2.setVisibility(i);
            }
        }
        this.f95928i = charSequence;
    }

    public final void setProgress(int i) {
        if (i >= this.f95922b) {
            if (this.f95927h) {
                DmtTextView dmtTextView = this.f95925f;
                if (dmtTextView == null) {
                    C52711k.m112234a();
                }
                StringBuilder sb = new StringBuilder();
                Context context = getContext();
                C52711k.m112236a((Object) context, "context");
                sb.append(context.getResources().getString(R.string.dnt));
                sb.append(i);
                sb.append("%");
                dmtTextView.setText(sb.toString());
            }
            this.f95922b = i;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.bjq);
        this.f95924e = (ViewGroup) findViewById(R.id.cfc);
        this.f95921a = (ImageView) findViewById(R.id.q8);
        this.f95925f = (DmtTextView) findViewById(R.id.c6e);
        this.f95926g = (DmtStatusView) findViewById(R.id.csv);
        switch (C37619i.f95933a[this.f95929j.ordinal()]) {
            case 1:
                ImageView imageView = this.f95921a;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    break;
                }
                break;
            case 2:
                ImageView imageView2 = this.f95921a;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    break;
                }
                break;
            case 3:
                ViewGroup viewGroup = this.f95924e;
                if (viewGroup != null) {
                    viewGroup.postDelayed(new C37617d(this), 5000);
                    break;
                }
                break;
        }
        this.f95927h = true;
        setProgress(this.f95922b);
        DmtStatusView dmtStatusView = this.f95926g;
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(new C10719a(getContext()).mo19223a());
        }
        DmtStatusView dmtStatusView2 = this.f95926g;
        if (dmtStatusView2 != null) {
            dmtStatusView2.mo19212f();
        }
        setCanceledOnTouchOutside(false);
        ImageView imageView3 = this.f95921a;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new C37618e(this));
        }
    }

    public C37613h(Context context, C37614a aVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "cancelType");
        this(context, R.style.a7f, aVar);
    }

    private C37613h(Context context, int i, C37614a aVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "cancelType");
        super(context, R.style.a7f);
        this.f95929j = aVar;
    }
}
