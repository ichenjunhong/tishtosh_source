package com.p683ss.android.ugc.aweme.emoji.p1680a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29288d;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29290f;
import com.p683ss.android.ugc.aweme.emoji.utils.C29484l.C29486a;

/* renamed from: com.ss.android.ugc.aweme.emoji.a.c */
public abstract class C29287c<IV extends C29290f, P extends C29288d> extends C29486a implements OnAttachStateChangeListener {

    /* renamed from: a */
    protected IV f76670a;

    /* renamed from: b */
    protected P f76671b;

    /* renamed from: c */
    protected View f76672c;

    /* renamed from: a */
    public View mo59227a() {
        return this.f76672c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo59228b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo59230d();

    /* renamed from: e */
    public void mo59232e() {
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo59229c() {
        this.f76672c.addOnAttachStateChangeListener(this);
    }

    /* renamed from: d_ */
    public final void mo59231d_(int i) {
        this.f76672c.setVisibility(i);
    }

    public C29287c(IV iv, P p, ViewGroup viewGroup) {
        this.f76670a = iv;
        this.f76671b = p;
        if (this.f76672c == null) {
            this.f76672c = LayoutInflater.from(viewGroup.getContext()).inflate(mo59230d(), viewGroup, false);
        }
        mo59228b();
        mo59229c();
    }
}
