package com.p683ss.android.p1103ad.p1104a.p1108c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ad.a.c.d */
public final class C18538d {

    /* renamed from: a */
    public static C18540e f51085a;

    /* renamed from: b */
    private static Handler f51086b = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static void m44856a(Context context, int i) {
        m44857a(context, i, 0);
    }

    /* renamed from: a */
    private static void m44857a(Context context, int i, int i2) {
        m44858a(context, i, 0, 1500);
    }

    /* renamed from: a */
    private static void m44858a(Context context, int i, int i2, int i3) {
        String str;
        Drawable drawable;
        if (context != null) {
            if (i > 0) {
                str = context.getString(i);
            } else {
                str = "";
            }
            if (i2 > 0) {
                drawable = context.getResources().getDrawable(i2);
            } else {
                drawable = null;
            }
            m44859a(context, str, drawable, 1500);
        }
    }

    /* renamed from: a */
    private static void m44859a(Context context, final String str, final Drawable drawable, final int i) {
        if (context != null) {
            final Context applicationContext = context.getApplicationContext();
            f51086b.post(new Runnable() {
                public final void run() {
                    try {
                        if (C18538d.f51085a != null) {
                            C18538d.f51085a.cancel();
                        }
                        Context context = applicationContext;
                        String str = str;
                        int i = i;
                        C18540e eVar = new C18540e(context);
                        View inflate = View.inflate(context, R.layout.aer, null);
                        inflate.setBackgroundResource(R.drawable.bbm);
                        int i2 = 8;
                        inflate.findViewById(R.id.aqa).setVisibility(8);
                        eVar.setView(inflate);
                        ((TextView) inflate.findViewById(R.id.text)).setText(str);
                        eVar.setDuration(i);
                        C18538d.f51085a = eVar;
                        eVar.mo37810a(17);
                        C18540e eVar2 = C18538d.f51085a;
                        Drawable drawable = drawable;
                        View view = eVar2.getView();
                        if (view != null) {
                            ImageView imageView = (ImageView) view.findViewById(R.id.aqa);
                            if (imageView != null) {
                                imageView.setImageDrawable(drawable);
                                if (drawable != null) {
                                    i2 = 0;
                                }
                                imageView.setVisibility(i2);
                                C18538d.f51085a.show();
                                return;
                            }
                            throw new RuntimeException("This Toast was not created with Toast.makeText()");
                        }
                        throw new RuntimeException("This Toast was not created with Toast.makeText()");
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }
}
