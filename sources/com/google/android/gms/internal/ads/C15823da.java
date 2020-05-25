package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.p1027a.C14886d;
import java.util.List;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.da */
public final class C15823da extends RelativeLayout {

    /* renamed from: a */
    private static final float[] f44817a = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: b */
    private AnimationDrawable f44818b;

    public C15823da(Context context, C15819cx cxVar, LayoutParams layoutParams) {
        super(context);
        C15464q.m32123a(cxVar);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f44817a, null, null));
        shapeDrawable.getPaint().setColor(cxVar.f44802b);
        setLayoutParams(layoutParams);
        C14963ax.m30832b().mo28689a((View) this, (Drawable) shapeDrawable);
        LayoutParams layoutParams2 = new LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(cxVar.mo30912a())) {
            LayoutParams layoutParams3 = new LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(cxVar.mo30912a());
            textView.setTextColor(cxVar.f44803c);
            textView.setTextSize((float) cxVar.f44804d);
            textView.setPadding(aes.m32748a(context, 4), 0, aes.m32748a(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<C15827de> list = cxVar.f44801a;
        if (list != null && list.size() > 1) {
            this.f44818b = new AnimationDrawable();
            for (C15827de a : list) {
                try {
                    this.f44818b.addFrame((Drawable) C14886d.m30545a(a.mo30929a()), cxVar.f44805e);
                } catch (Exception e) {
                    abv.m32793b("Error while getting drawable.", e);
                }
            }
            C14963ax.m30832b().mo28689a((View) imageView, (Drawable) this.f44818b);
        } else if (list.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) C14886d.m30545a(((C15827de) list.get(0)).mo30929a()));
            } catch (Exception e2) {
                abv.m32793b("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    public final void onAttachedToWindow() {
        if (this.f44818b != null) {
            this.f44818b.start();
        }
        super.onAttachedToWindow();
    }
}
