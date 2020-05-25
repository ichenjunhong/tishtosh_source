package com.bytedance.android.livesdk.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.ss.android.ugc.trill.R;

public class SendGiftAnimationView extends RelativeLayout implements C9382a {

    /* renamed from: a */
    public Context f23194a;

    /* renamed from: b */
    public TextView f23195b;

    /* renamed from: c */
    private TextView f23196c;

    /* renamed from: d */
    private HSImageView f23197d;

    /* renamed from: e */
    private TextView f23198e;

    /* renamed from: f */
    private Handler f23199f;

    /* renamed from: g */
    private Pair<Float, Animator> f23200g;

    /* renamed from: com.bytedance.android.livesdk.widget.SendGiftAnimationView$a */
    public static class C8480a {
    }

    public void handleMsg(Message message) {
    }

    /* renamed from: a */
    public final void mo14853a() {
        this.f23199f.removeCallbacksAndMessages(null);
        this.f23195b.setText(R.string.f0w);
    }

    public SendGiftAnimationView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo14854a(float f) {
        if (this.f23200g == null || this.f23200g.second == null || this.f23200g.first == null || ((Float) this.f23200g.first).floatValue() != f) {
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("scaleX", new float[]{1.0f, f, 1.0f});
            PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("scaleY", new float[]{1.0f, f, 1.0f});
            this.f23200g = new Pair<>(Float.valueOf(f), ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{ofFloat, ofFloat2}));
            ((Animator) this.f23200g.second).setDuration(200);
        }
        ((Animator) this.f23200g.second).start();
    }

    /* renamed from: a */
    public final void mo14855a(C7505d dVar) {
        if (dVar != null) {
            if (dVar.f20551l != 0) {
                this.f23196c.setTextColor(dVar.f20551l);
            } else {
                this.f23196c.setTextColor(this.f23194a.getResources().getColor(R.color.alt));
            }
            this.f23196c.setText(dVar.f20540a);
            if (dVar.f20552m != 0) {
                this.f23198e.setTextColor(dVar.f20552m);
            } else {
                this.f23198e.setTextColor(this.f23194a.getResources().getColor(R.color.ags));
            }
            if ((5 == dVar.f20544e || dVar.f20545f != 0) && !(5 == dVar.f20544e && dVar.f20554o == 0)) {
                C9432q.m18691b((View) this.f23198e, 0);
            } else {
                C9432q.m18691b((View) this.f23198e, 4);
            }
            if (5 == dVar.f20544e) {
                this.f23198e.setText(this.f23194a.getString(R.string.e8u, new Object[]{Integer.valueOf(dVar.f20554o)}));
            } else {
                this.f23198e.setText(this.f23194a.getString(R.string.e8v, new Object[]{Integer.valueOf(dVar.f20545f)}));
            }
            C5213c.m11820a(this.f23197d, dVar.f20541b);
        }
    }

    public SendGiftAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SendGiftAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23194a = context;
        this.f23199f = new C9381g(Looper.getMainLooper(), this);
        View.inflate(this.f23194a, R.layout.alx, this);
        this.f23196c = (TextView) findViewById(R.id.bpp);
        this.f23197d = (HSImageView) findViewById(R.id.a22);
        this.f23198e = (TextView) findViewById(R.id.a5f);
        this.f23195b = (TextView) findViewById(R.id.a6t);
    }
}
