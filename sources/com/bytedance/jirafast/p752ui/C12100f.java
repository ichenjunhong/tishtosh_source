package com.bytedance.jirafast.p752ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.jirafast.ui.f */
public final class C12100f extends Dialog {

    /* renamed from: a */
    public Button f32029a;

    /* renamed from: b */
    public Button f32030b;

    /* renamed from: c */
    public Button f32031c;

    /* renamed from: d */
    public Button f32032d;

    /* renamed from: e */
    public Button f32033e;

    /* renamed from: f */
    public C12102a f32034f;

    /* renamed from: g */
    private OnClickListener f32035g = new OnClickListener() {
        public final void onClick(View view) {
            int i;
            if (view == C12100f.this.f32029a) {
                i = 1;
            } else if (view == C12100f.this.f32030b) {
                i = 2;
            } else if (view == C12100f.this.f32031c) {
                i = 3;
            } else if (view == C12100f.this.f32032d) {
                i = 4;
            } else if (view == C12100f.this.f32033e) {
                i = 5;
            } else {
                i = 0;
            }
            if (C12100f.this.f32034f != null && (view instanceof Button)) {
                C12100f.this.f32034f.mo22846a(((Button) view).getText().toString(), i);
            }
            C12100f.this.dismiss();
        }
    };

    /* renamed from: com.bytedance.jirafast.ui.f$a */
    public interface C12102a {
        /* renamed from: a */
        void mo22846a(String str, int i);
    }

    public C12100f(Context context) {
        super(context, R.style.a7j);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.bj8);
        Window window = getWindow();
        window.setLayout(-1, -2);
        window.setGravity(80);
        window.setWindowAnimations(R.style.a7k);
        this.f32029a = (Button) findViewById(R.id.eh7);
        this.f32029a.setOnClickListener(this.f32035g);
        this.f32030b = (Button) findViewById(R.id.eh8);
        this.f32030b.setOnClickListener(this.f32035g);
        this.f32031c = (Button) findViewById(R.id.eh9);
        this.f32031c.setOnClickListener(this.f32035g);
        this.f32032d = (Button) findViewById(R.id.eh_);
        this.f32032d.setOnClickListener(this.f32035g);
        this.f32033e = (Button) findViewById(R.id.eh_);
        this.f32032d.setOnClickListener(this.f32035g);
        this.f32033e = (Button) findViewById(R.id.ehb);
        this.f32033e.setOnClickListener(this.f32035g);
    }
}
