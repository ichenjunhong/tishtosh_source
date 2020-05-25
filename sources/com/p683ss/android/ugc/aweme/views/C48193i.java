package com.p683ss.android.ugc.aweme.views;

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

/* renamed from: com.ss.android.ugc.aweme.views.i */
public final class C48193i extends ProgressDialog implements OnKeyListener {

    /* renamed from: d */
    public static final C48195b f121258d = new C48195b(null);

    /* renamed from: a */
    public ImageView f121259a;

    /* renamed from: b */
    public int f121260b;

    /* renamed from: c */
    public C48196c f121261c;

    /* renamed from: e */
    private ViewGroup f121262e;

    /* renamed from: f */
    private DmtTextView f121263f;

    /* renamed from: g */
    private DmtStatusView f121264g;

    /* renamed from: h */
    private boolean f121265h;

    /* renamed from: i */
    private CharSequence f121266i;

    /* renamed from: j */
    private final C48194a f121267j;

    /* renamed from: com.ss.android.ugc.aweme.views.i$a */
    public enum C48194a {
        GONE,
        VISIBLE,
        VISIBLE_AFTER_5S
    }

    /* renamed from: com.ss.android.ugc.aweme.views.i$b */
    public static final class C48195b {
        private C48195b() {
        }

        public /* synthetic */ C48195b(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        private static C48193i m104429a(Context context, C48193i iVar) {
            iVar.setCancelable(false);
            if ((context instanceof Activity) && ((!(context instanceof AbsActivity) || ((AbsActivity) context).isActive()) && !((Activity) context).isFinishing())) {
                iVar.show();
            }
            return iVar;
        }

        /* renamed from: a */
        public final C48193i mo95625a(Context context, C48194a aVar, C48196c cVar) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(aVar, "cancelType");
            C52711k.m112240b(cVar, "cancelListener");
            C48193i iVar = new C48193i(context, aVar);
            iVar.f121261c = cVar;
            return m104429a(context, iVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.i$c */
    public interface C48196c {
        /* renamed from: a */
        void mo94271a();
    }

    /* renamed from: com.ss.android.ugc.aweme.views.i$d */
    static final class C48197d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C48193i f121269a;

        C48197d(C48193i iVar) {
            this.f121269a = iVar;
        }

        public final void run() {
            ImageView imageView = this.f121269a.f121259a;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.i$e */
    static final class C48198e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C48193i f121270a;

        C48198e(C48193i iVar) {
            this.f121270a = iVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C48196c cVar = this.f121270a.f121261c;
            if (cVar != null) {
                cVar.mo94271a();
            }
            this.f121270a.dismiss();
            this.f121270a.f121260b = 0;
        }
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return false;
    }

    public final void setMessage(CharSequence charSequence) {
        int i;
        super.setMessage(charSequence);
        if (this.f121265h) {
            DmtTextView dmtTextView = this.f121263f;
            if (dmtTextView != null) {
                dmtTextView.setText(charSequence);
            }
            DmtTextView dmtTextView2 = this.f121263f;
            if (dmtTextView2 != null) {
                if (TextUtils.isEmpty(charSequence)) {
                    i = 8;
                } else {
                    i = 0;
                }
                dmtTextView2.setVisibility(i);
            }
        }
        this.f121266i = charSequence;
    }

    public final void setProgress(int i) {
        if (i >= this.f121260b) {
            if (this.f121265h) {
                DmtTextView dmtTextView = this.f121263f;
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
            this.f121260b = i;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.bjq);
        this.f121262e = (ViewGroup) findViewById(R.id.cfc);
        this.f121259a = (ImageView) findViewById(R.id.q8);
        this.f121263f = (DmtTextView) findViewById(R.id.c6e);
        this.f121264g = (DmtStatusView) findViewById(R.id.csv);
        switch (C48199j.f121271a[this.f121267j.ordinal()]) {
            case 1:
                ImageView imageView = this.f121259a;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    break;
                }
                break;
            case 2:
                ImageView imageView2 = this.f121259a;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    break;
                }
                break;
            case 3:
                ViewGroup viewGroup = this.f121262e;
                if (viewGroup != null) {
                    viewGroup.postDelayed(new C48197d(this), 5000);
                    break;
                }
                break;
        }
        this.f121265h = true;
        setProgress(this.f121260b);
        DmtStatusView dmtStatusView = this.f121264g;
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(new C10719a(getContext()).mo19223a());
        }
        DmtStatusView dmtStatusView2 = this.f121264g;
        if (dmtStatusView2 != null) {
            dmtStatusView2.mo19212f();
        }
        setCanceledOnTouchOutside(false);
        ImageView imageView3 = this.f121259a;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new C48198e(this));
        }
    }

    public C48193i(Context context, C48194a aVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "cancelType");
        this(context, R.style.a4y, aVar);
    }

    private C48193i(Context context, int i, C48194a aVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "cancelType");
        super(context, R.style.a4y);
        this.f121267j = aVar;
    }
}
