package com.bytedance.android.livesdk.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.widget.f */
public final class C8545f extends Dialog implements OnClickListener {

    /* renamed from: a */
    private TextView f23430a;

    /* renamed from: b */
    private View f23431b;

    /* renamed from: c */
    private View f23432c;

    /* renamed from: d */
    private DialogInterface.OnClickListener f23433d;

    /* renamed from: e */
    private DialogInterface.OnClickListener f23434e;

    /* renamed from: a */
    public final C8545f mo14977a(DialogInterface.OnClickListener onClickListener) {
        this.f23433d = onClickListener;
        return this;
    }

    /* renamed from: b */
    public final C8545f mo14979b(DialogInterface.OnClickListener onClickListener) {
        this.f23434e = onClickListener;
        return this;
    }

    public C8545f(Context context) {
        this(context, R.style.yz);
    }

    /* renamed from: a */
    public final C8545f mo14978a(String str) {
        this.f23430a.setText(str);
        return this;
    }

    public final void onClick(View view) {
        if (view.getId() == R.id.amu) {
            if (this.f23434e != null) {
                this.f23434e.onClick(this, 1);
            }
        } else if (view.getId() == R.id.ams && this.f23433d != null) {
            this.f23433d.onClick(this, 2);
        }
    }

    private C8545f(Context context, int i) {
        super(context, R.style.yz);
        setContentView(LayoutInflater.from(getContext()).inflate(R.layout.aid, null));
        this.f23430a = (TextView) findViewById(R.id.amt);
        this.f23431b = findViewById(R.id.amu);
        this.f23432c = findViewById(R.id.ams);
        this.f23431b.setOnClickListener(this);
        this.f23432c.setOnClickListener(this);
    }
}
