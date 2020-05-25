package com.p683ss.android.ugc.tools.view.p2512e;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.tools.view.p2510c.C50221d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.tools.view.e.a */
public final class C50224a {

    /* renamed from: a */
    public Context f125799a;

    /* renamed from: b */
    public TextView f125800b;

    /* renamed from: c */
    public TextView f125801c;

    /* renamed from: d */
    public TextView f125802d;

    /* renamed from: e */
    public TextView f125803e;

    /* renamed from: f */
    public TextView f125804f;

    /* renamed from: g */
    public ImageView f125805g;

    /* renamed from: h */
    public View f125806h;

    /* renamed from: i */
    public View f125807i;

    /* renamed from: j */
    public RelativeLayout f125808j;

    /* renamed from: k */
    public RelativeLayout f125809k;

    /* renamed from: l */
    public String f125810l;

    /* renamed from: m */
    public String f125811m;

    /* renamed from: n */
    public String f125812n;

    /* renamed from: o */
    public String f125813o;

    /* renamed from: p */
    public int f125814p;

    /* renamed from: q */
    public OnClickListener f125815q;

    /* renamed from: r */
    public OnClickListener f125816r;

    /* renamed from: com.ss.android.ugc.tools.view.e.a$a */
    public static class C50232a {

        /* renamed from: a */
        public String f125828a;

        /* renamed from: b */
        public String f125829b;

        /* renamed from: c */
        public String f125830c;

        /* renamed from: d */
        public String f125831d;

        /* renamed from: e */
        public int f125832e;

        /* renamed from: f */
        public OnClickListener f125833f;

        /* renamed from: g */
        public OnClickListener f125834g;

        /* renamed from: h */
        public Context f125835h;

        /* renamed from: i */
        public View f125836i;

        /* renamed from: a */
        public final C50224a mo98009a() {
            return new C50224a(this);
        }

        public C50232a(Context context) {
            this.f125835h = context;
        }

        /* renamed from: a */
        public final C50232a mo98007a(int i) {
            this.f125828a = this.f125835h.getString(i);
            return this;
        }

        /* renamed from: b */
        public final C50232a mo98010b(int i) {
            this.f125829b = this.f125835h.getString(R.string.f9h);
            return this;
        }

        /* renamed from: a */
        public final C50232a mo98008a(int i, OnClickListener onClickListener) {
            this.f125830c = this.f125835h.getString(i);
            this.f125833f = onClickListener;
            return this;
        }

        /* renamed from: b */
        public final C50232a mo98011b(int i, OnClickListener onClickListener) {
            this.f125831d = this.f125835h.getString(R.string.wf);
            this.f125834g = onClickListener;
            return this;
        }
    }

    /* renamed from: a */
    public final Dialog mo97997a() {
        Builder builder = new Builder(this.f125799a);
        if (!TextUtils.isEmpty(this.f125810l)) {
            builder.setTitle(this.f125810l);
        }
        if (!TextUtils.isEmpty(this.f125811m)) {
            builder.setMessage(this.f125811m);
        }
        builder.setPositiveButton(this.f125812n, new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C50224a.m108411a(dialogInterface);
                if (C50224a.this.f125815q != null) {
                    C50224a.this.f125815q.onClick(dialogInterface, i);
                }
            }
        });
        if (!TextUtils.isEmpty(this.f125813o)) {
            builder.setNegativeButton(this.f125813o, new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C50224a.m108411a(dialogInterface);
                    if (C50224a.this.f125816r != null) {
                        C50224a.this.f125816r.onClick(dialogInterface, i);
                    }
                }
            });
        }
        AlertDialog create = builder.create();
        m108412b(create);
        return create;
    }

    /* renamed from: a */
    public static void m108411a(DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private static void m108412b(Dialog dialog) {
        try {
            dialog.show();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo97998a(Dialog dialog) {
        try {
            mo97999a(true);
            dialog.show();
            Window window = dialog.getWindow();
            window.setBackgroundDrawableResource(17170445);
            LayoutParams attributes = window.getAttributes();
            attributes.gravity = 1;
            attributes.width = C9432q.m18670a(this.f125799a);
            attributes.horizontalMargin = C9432q.m18687b(this.f125799a, 30.0f);
            window.setAttributes(attributes);
        } catch (Exception unused) {
        }
    }

    private C50224a(C50232a aVar) {
        this.f125799a = aVar.f125835h;
        this.f125814p = aVar.f125832e;
        this.f125810l = aVar.f125828a;
        this.f125811m = aVar.f125829b;
        this.f125813o = aVar.f125831d;
        this.f125812n = aVar.f125830c;
        this.f125815q = aVar.f125833f;
        this.f125816r = aVar.f125834g;
        this.f125807i = aVar.f125836i;
        this.f125806h = LayoutInflater.from(this.f125799a).inflate(R.layout.bv7, null);
        this.f125800b = (TextView) this.f125806h.findViewById(R.id.dhb);
        this.f125801c = (TextView) this.f125806h.findViewById(R.id.d8j);
        this.f125805g = (ImageView) this.f125806h.findViewById(R.id.aq6);
        this.f125802d = (TextView) this.f125806h.findViewById(R.id.dax);
        this.f125803e = (TextView) this.f125806h.findViewById(R.id.dez);
        this.f125804f = (TextView) this.f125806h.findViewById(R.id.db8);
        this.f125808j = (RelativeLayout) this.f125806h.findViewById(R.id.cfn);
        this.f125809k = (RelativeLayout) this.f125806h.findViewById(R.id.cdg);
    }

    /* renamed from: a */
    public final void mo97999a(final boolean z) {
        int i;
        float f;
        final int b = (int) C9432q.m18687b(this.f125799a, 10.0f);
        if (z) {
            i = 300;
        } else {
            i = 100;
        }
        RelativeLayout relativeLayout = this.f125808j;
        String str = "alpha";
        float[] fArr = new float[2];
        float f2 = 1.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (!z) {
            f2 = 0.0f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, str, fArr);
        ofFloat.setDuration((long) i);
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float f;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                int i = (int) (((float) b) - (((float) b) * animatedFraction));
                RelativeLayout relativeLayout = C50224a.this.f125808j;
                if (z) {
                    f = (float) i;
                } else {
                    f = animatedFraction * ((float) (-b));
                }
                relativeLayout.setTranslationY(f);
            }
        });
        ofFloat.setInterpolator(new C50221d());
        ofFloat.start();
    }
}
