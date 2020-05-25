package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p936c.C13791d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LoadingAnimView */
public class LoadingAnimView extends FrameLayout {

    /* renamed from: a */
    public Animatable f15556a;

    /* renamed from: b */
    public Animatable f15557b;

    /* renamed from: c */
    public Drawable f15558c;

    /* renamed from: d */
    public Drawable f15559d;

    /* renamed from: e */
    private HSImageView f15560e;

    /* renamed from: f */
    private HSImageView f15561f;

    /* renamed from: g */
    private TextView f15562g;

    /* renamed from: h */
    private String f15563h = "asset://com.ss.android.ies.live.sdk/ttlive_ic_loading_center.webp";

    /* renamed from: i */
    private String f15564i = "asset://com.ss.android.ies.live.sdk/ttlive_ic_loading_point.webp";

    /* renamed from: j */
    private int f15565j = -1;

    /* renamed from: k */
    private boolean f15566k;

    /* renamed from: c */
    public final void mo11842c() {
        this.f15566k = false;
        m12897f();
    }

    /* renamed from: b */
    public final void mo11841b() {
        this.f15566k = true;
        this.f15562g.setVisibility(4);
        m12896e();
    }

    /* renamed from: e */
    private void m12896e() {
        if (this.f15556a != null && !this.f15556a.isRunning()) {
            this.f15556a.start();
            this.f15562g.setVisibility(0);
        }
        if (this.f15557b != null && !this.f15557b.isRunning()) {
            this.f15557b.start();
            this.f15562g.setVisibility(0);
        }
    }

    /* renamed from: f */
    private void m12897f() {
        if (this.f15556a != null && this.f15556a.isRunning()) {
            this.f15556a.stop();
        }
        if (this.f15557b != null && this.f15557b.isRunning()) {
            this.f15557b.stop();
        }
    }

    /* renamed from: a */
    public final void mo11840a() {
        m12894a(this.f15565j);
        if (this.f15566k) {
            m12896e();
        } else {
            m12897f();
        }
    }

    /* renamed from: d */
    private void m12895d() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.aqk, this, true);
        this.f15562g = (TextView) inflate.findViewById(R.id.bht);
        this.f15560e = (HSImageView) inflate.findViewById(R.id.bh8);
        this.f15560e.setController(((C13773e) C13771c.m27870a().mo25723a(this.f15563h).mo25751a((C13791d<? super INFO>) new C13790c() {
            public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
                super.onFinalImageSet(str, obj, animatable);
                LoadingAnimView.this.f15556a = animatable;
                if (animatable instanceof Drawable) {
                    LoadingAnimView.this.f15558c = (Drawable) animatable;
                }
                LoadingAnimView.this.mo11840a();
            }
        })).mo25763d());
        this.f15561f = (HSImageView) inflate.findViewById(R.id.bhf);
        this.f15561f.setController(((C13773e) C13771c.m27870a().mo25723a(this.f15564i).mo25751a((C13791d<? super INFO>) new C13790c() {
            public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
                super.onFinalImageSet(str, obj, animatable);
                LoadingAnimView.this.f15557b = animatable;
                if (animatable instanceof Drawable) {
                    LoadingAnimView.this.f15559d = (Drawable) animatable;
                }
                LoadingAnimView.this.mo11840a();
            }
        })).mo25763d());
    }

    public void setColor(int i) {
        if (i != 0) {
            this.f15565j = i;
            m12894a(i);
        }
    }

    public LoadingAnimView(Context context) {
        super(context);
        m12895d();
    }

    /* renamed from: a */
    private void m12894a(int i) {
        if (this.f15558c != null) {
            this.f15558c.setColorFilter(i, Mode.SRC_ATOP);
        }
        if (this.f15559d != null) {
            this.f15559d.setColorFilter(i, Mode.SRC_ATOP);
        }
        if (this.f15562g != null) {
            this.f15562g.setTextColor(i);
        }
    }

    public LoadingAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12895d();
    }

    public LoadingAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m12895d();
    }
}
