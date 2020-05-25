package com.bytedance.sdk.account.bdplatform.impl.view;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.sdk.account.bdplatform.p854a.C13040c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.sdk.account.bdplatform.impl.view.b */
public final class C13071b extends Dialog implements C13040c {

    /* renamed from: a */
    static Drawable f34139a;

    /* renamed from: b */
    private Context f34140b;

    /* renamed from: c */
    private ProgressBar f34141c;

    /* renamed from: d */
    private TextView f34142d;

    /* renamed from: a */
    public final void mo24706a(String str) {
        this.f34142d.setText(str);
        show();
    }

    public C13071b(Context context) {
        super(context, R.style.xw);
        this.f34140b = context;
        View inflate = LayoutInflater.from(this.f34140b).inflate(R.layout.gw, null);
        this.f34141c = (ProgressBar) inflate.findViewById(R.id.c67);
        this.f34142d = (TextView) inflate.findViewById(R.id.bhe);
        Drawable drawable = f34139a;
        if (drawable != null) {
            this.f34141c.setIndeterminateDrawable(drawable);
        }
        setContentView(inflate);
        setCancelable(true);
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        LayoutParams attributes = window.getAttributes();
        window.setGravity(17);
        attributes.width = m26249a(this.f34140b, 144.0f);
        attributes.height = m26249a(this.f34140b, 96.0f);
        window.setAttributes(attributes);
    }

    /* renamed from: a */
    private static int m26249a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
