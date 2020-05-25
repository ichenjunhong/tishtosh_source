package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35214b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.cn */
public final class C33820cn {

    /* renamed from: a */
    private C11207p f87757a;

    /* renamed from: b */
    private Animation f87758b;

    /* renamed from: c */
    private ImageView f87759c;

    /* renamed from: d */
    private OnAttachStateChangeListener f87760d;

    /* renamed from: c */
    private void m77532c() {
        if (this.f87759c != null) {
            C35214b.m79603a(this.f87759c);
            this.f87759c.setVisibility(8);
        }
    }

    /* renamed from: d */
    private void m77533d() {
        if (this.f87759c != null) {
            C35214b.m79603a(this.f87759c);
            this.f87759c.setImageResource(R.drawable.az6);
            this.f87759c.setVisibility(0);
        }
    }

    /* renamed from: b */
    private void m77531b() {
        if (this.f87758b == null) {
            this.f87758b = C35214b.m79601a(800, null);
        }
        if (this.f87759c != null) {
            this.f87759c.setImageResource(R.drawable.d__);
            this.f87759c.setVisibility(0);
            C35214b.m79603a(this.f87759c);
            this.f87759c.startAnimation(this.f87758b);
        }
    }

    /* renamed from: a */
    public final void mo71861a() {
        if (this.f87757a != null) {
            this.f87759c.setClickable(true);
            int msgStatus = this.f87757a.getMsgStatus();
            if (msgStatus != 5) {
                switch (msgStatus) {
                    case 0:
                        this.f87759c.setClickable(false);
                        m77531b();
                        return;
                    case 1:
                        this.f87759c.setClickable(false);
                        m77531b();
                        return;
                    case 2:
                        break;
                    case 3:
                        m77533d();
                        return;
                }
            }
            m77532c();
        }
    }

    public C33820cn(ImageView imageView) {
        this.f87759c = imageView;
        if (this.f87760d == null) {
            this.f87760d = new OnAttachStateChangeListener() {
                public final void onViewDetachedFromWindow(View view) {
                }

                public final void onViewAttachedToWindow(View view) {
                    C33820cn.this.mo71861a();
                }
            };
        }
        this.f87759c.removeOnAttachStateChangeListener(this.f87760d);
        this.f87759c.addOnAttachStateChangeListener(this.f87760d);
    }

    /* renamed from: a */
    public final void mo71862a(C11207p pVar) {
        this.f87759c.setTag(50331648, Integer.valueOf(6));
        this.f87759c.setTag(67108864, pVar);
        this.f87757a = pVar;
        mo71861a();
    }
}
