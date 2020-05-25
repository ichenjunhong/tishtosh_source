package com.p683ss.android.ugc.aweme.bullet.module.base.p1479a;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a.b */
public final class C24330b {

    /* renamed from: a */
    public PopupWindow f64587a;

    /* renamed from: b */
    public View f64588b;

    /* renamed from: c */
    public View f64589c;

    /* renamed from: d */
    public View f64590d;

    /* renamed from: e */
    public List<Integer> f64591e;

    /* renamed from: f */
    private Activity f64592f;

    /* renamed from: a */
    public final PopupWindow mo50122a(OnClickListener onClickListener) {
        if (this.f64587a == null) {
            View inflate = LayoutInflater.from(this.f64592f).inflate(R.layout.b80, null, false);
            this.f64588b = inflate.findViewById(R.id.f133595cat);
            this.f64589c = inflate.findViewById(R.id.a0m);
            this.f64590d = inflate.findViewById(R.id.buz);
            this.f64588b.setOnClickListener(onClickListener);
            this.f64589c.setOnClickListener(onClickListener);
            this.f64590d.setOnClickListener(onClickListener);
            this.f64587a = new PopupWindow(inflate, -2, -2, true);
            this.f64587a.setTouchable(true);
            this.f64587a.setAnimationStyle(R.style.a54);
            this.f64587a.setBackgroundDrawable(new ColorDrawable(0));
        }
        return this.f64587a;
    }

    public C24330b(Activity activity, OnClickListener onClickListener) {
        this.f64592f = activity;
        mo50122a(onClickListener);
    }
}
