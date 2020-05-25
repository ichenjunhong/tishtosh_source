package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.aes;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.overlay.o */
public final class C15018o extends FrameLayout implements OnClickListener {

    /* renamed from: a */
    private final ImageButton f38817a;

    /* renamed from: b */
    private final C15026w f38818b;

    public C15018o(Context context, C15019p pVar, C15026w wVar) {
        super(context);
        this.f38818b = wVar;
        setOnClickListener(this);
        this.f38817a = new ImageButton(context);
        this.f38817a.setImageResource(17301527);
        this.f38817a.setBackgroundColor(0);
        this.f38817a.setOnClickListener(this);
        this.f38817a.setPadding(aes.m32748a(context, pVar.f38819a), aes.m32748a(context, 0), aes.m32748a(context, pVar.f38820b), aes.m32748a(context, pVar.f38822d));
        this.f38817a.setContentDescription("Interstitial close button");
        addView(this.f38817a, new LayoutParams(aes.m32748a(context, pVar.f38823e + pVar.f38819a + pVar.f38820b), aes.m32748a(context, pVar.f38823e + pVar.f38822d), 17));
    }

    public final void onClick(View view) {
        if (this.f38818b != null) {
            this.f38818b.mo27678c();
        }
    }

    /* renamed from: a */
    public final void mo27701a(boolean z) {
        if (z) {
            this.f38817a.setVisibility(8);
        } else {
            this.f38817a.setVisibility(0);
        }
    }
}
