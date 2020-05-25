package com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.widget.CircularProgressView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a */
public final class C43092a extends AlertDialog {

    /* renamed from: a */
    public C43093a f108788a;

    /* renamed from: b */
    private boolean f108789b;

    /* renamed from: c */
    private CharSequence f108790c;

    /* renamed from: d */
    private boolean f108791d;

    /* renamed from: e */
    private boolean f108792e;

    /* renamed from: f */
    private int f108793f;

    /* renamed from: g */
    private int f108794g = 100;

    /* renamed from: h */
    private TextView f108795h;

    /* renamed from: i */
    private CircularProgressView f108796i;

    /* renamed from: j */
    private ImageView f108797j;

    /* renamed from: k */
    private TextView f108798k;

    /* renamed from: l */
    private View f108799l;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a$a */
    public interface C43093a {
        /* renamed from: a */
        void mo87412a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.a$b */
    static final class C43094b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C43092a f108800a;

        C43094b(C43092a aVar) {
            this.f108800a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C43093a aVar = this.f108800a.f108788a;
            if (aVar != null) {
                aVar.mo87412a();
            }
        }
    }

    public final void dismiss() {
        CircularProgressView circularProgressView = this.f108796i;
        if (circularProgressView == null) {
            C52711k.m112237a("mLodingProgressView");
        }
        circularProgressView.mo49173b();
        super.dismiss();
    }

    /* renamed from: a */
    public final void mo87486a(C43093a aVar) {
        C52711k.m112240b(aVar, "onCancelViewListener");
        this.f108788a = aVar;
    }

    public C43092a(Context context) {
        C52711k.m112240b(context, "context");
        super(context, 3);
    }

    /* renamed from: a */
    public final void mo87485a(int i) {
        if (this.f108789b) {
            TextView textView = this.f108798k;
            if (textView == null) {
                C52711k.m112237a("mProgressTextView");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append('%');
            textView.setText(sb.toString());
            CircularProgressView circularProgressView = this.f108796i;
            if (circularProgressView == null) {
                C52711k.m112237a("mLodingProgressView");
            }
            circularProgressView.setProgress((float) i);
        }
        this.f108793f = i;
    }

    public final void setMessage(CharSequence charSequence) {
        int i;
        if (this.f108789b) {
            TextView textView = this.f108795h;
            if (textView == null) {
                C52711k.m112237a("mMessageView");
            }
            textView.setText(charSequence);
            TextView textView2 = this.f108795h;
            if (textView2 == null) {
                C52711k.m112237a("mMessageView");
            }
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
            }
            textView2.setVisibility(i);
        }
        this.f108790c = charSequence;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView(R.layout.a8c);
        View findViewById = findViewById(R.id.cfc);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.root)");
        this.f108799l = findViewById;
        View findViewById2 = findViewById(R.id.bld);
        C52711k.m112236a((Object) findViewById2, "findViewById(R.id.message)");
        this.f108795h = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.b25);
        C52711k.m112236a((Object) findViewById3, "findViewById(R.id.iv_loading)");
        this.f108796i = (CircularProgressView) findViewById3;
        View findViewById4 = findViewById(R.id.q8);
        C52711k.m112236a((Object) findViewById4, "findViewById(R.id.cancelImageView)");
        this.f108797j = (ImageView) findViewById4;
        View findViewById5 = findViewById(R.id.c62);
        C52711k.m112236a((Object) findViewById5, "findViewById(R.id.progress)");
        this.f108798k = (TextView) findViewById5;
        ImageView imageView = this.f108797j;
        if (imageView == null) {
            C52711k.m112237a("mCancelView");
        }
        imageView.setOnClickListener(new C43094b(this));
        this.f108789b = true;
        setMessage(this.f108790c);
        boolean z = this.f108791d;
        int i2 = 0;
        if (this.f108789b) {
            CircularProgressView circularProgressView = this.f108796i;
            if (circularProgressView == null) {
                C52711k.m112237a("mLodingProgressView");
            }
            circularProgressView.setIndeterminate(z);
            TextView textView = this.f108798k;
            if (textView == null) {
                C52711k.m112237a("mProgressTextView");
            }
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
        }
        this.f108791d = z;
        int i3 = this.f108794g;
        if (this.f108789b) {
            CircularProgressView circularProgressView2 = this.f108796i;
            if (circularProgressView2 == null) {
                C52711k.m112237a("mLodingProgressView");
            }
            circularProgressView2.setMaxProgress((float) i3);
        }
        this.f108794g = i3;
        mo87485a(this.f108793f);
        setCanceledOnTouchOutside(false);
        boolean z2 = this.f108792e;
        if (this.f108789b) {
            ImageView imageView2 = this.f108797j;
            if (imageView2 == null) {
                C52711k.m112237a("mCancelView");
            }
            if (!z2) {
                i2 = 8;
            }
            imageView2.setVisibility(i2);
        }
        this.f108792e = z2;
    }
}
