package com.p683ss.sys.p2584ck;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.sys.ck.a */
public final class C51421a extends AlertDialog {

    /* renamed from: a */
    public C51425a f128581a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f128582b;

    /* renamed from: c */
    private TextView f128583c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ScrollView f128584d;

    /* renamed from: e */
    private TextView f128585e;

    /* renamed from: f */
    private Button f128586f;

    /* renamed from: g */
    private Button f128587g;

    /* renamed from: h */
    private String f128588h = "";

    /* renamed from: i */
    private String f128589i = "";

    /* renamed from: j */
    private String f128590j = "";

    /* renamed from: com.ss.sys.ck.a$a */
    public interface C51425a {
        /* renamed from: a */
        void mo102150a();

        /* renamed from: b */
        void mo102151b();
    }

    public C51421a(Context context, String str, String str2, String str3) {
        super(context, R.style.xd);
        setCanceledOnTouchOutside(false);
        this.f128582b = context;
        this.f128588h = str;
        this.f128589i = str2;
        this.f128590j = str3;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f5);
        this.f128583c = (TextView) findViewById(R.id.ei);
        this.f128584d = (ScrollView) findViewById(R.id.eg);
        this.f128585e = (TextView) findViewById(R.id.ef);
        this.f128586f = (Button) findViewById(R.id.eh);
        this.f128587g = (Button) findViewById(R.id.ee);
        if (!TextUtils.isEmpty(this.f128588h)) {
            this.f128585e.setText(this.f128588h);
        }
        if (!TextUtils.isEmpty(this.f128589i)) {
            this.f128586f.setText(this.f128589i);
        }
        if (!TextUtils.isEmpty(this.f128590j)) {
            this.f128587g.setText(this.f128590j);
        }
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        this.f128585e.setLayoutParams(layoutParams);
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) this.f128582b).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        if (displayMetrics.widthPixels <= 480) {
            this.f128585e.setTextSize(15.0f);
        }
        final int i = displayMetrics.heightPixels;
        this.f128584d.post(new Runnable() {
            public final void run() {
                ScrollView a;
                LinearLayout.LayoutParams layoutParams;
                new StringBuilder("mMsgScroll.getMeasuredHeight()=").append(C51421a.this.f128584d.getMeasuredHeight());
                if (C51421a.this.f128584d.getMeasuredHeight() > i / 2) {
                    a = C51421a.this.f128584d;
                    layoutParams = new LinearLayout.LayoutParams(displayMetrics.widthPixels - (C51421a.this.f128582b.getResources().getDimensionPixelOffset(R.dimen.bs) * 2), i / 2);
                } else {
                    a = C51421a.this.f128584d;
                    layoutParams = new LinearLayout.LayoutParams(displayMetrics.widthPixels - (C51421a.this.f128582b.getResources().getDimensionPixelOffset(R.dimen.bs) * 2), -2);
                }
                a.setLayoutParams(layoutParams);
            }
        });
        this.f128586f.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                C51421a.this.dismiss();
                if (C51421a.this.f128581a != null) {
                    C51421a.this.f128581a.mo102151b();
                }
            }
        });
        this.f128587g.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                C51421a.this.dismiss();
                if (C51421a.this.f128581a != null) {
                    C51421a.this.f128581a.mo102150a();
                }
            }
        });
    }
}
