package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29288d;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29290f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35221bc.C35225a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.a */
public abstract class C33475a<IV extends C29290f, P extends C29288d> extends C35225a implements OnAttachStateChangeListener {

    /* renamed from: a */
    public IV f86750a;

    /* renamed from: b */
    protected P f86751b;

    /* renamed from: c */
    public View f86752c;

    /* renamed from: a */
    public View mo70881a() {
        return this.f86752c;
    }

    /* renamed from: a */
    public void mo70882a(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo70883b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo70885d();

    /* renamed from: e */
    public void mo70886e() {
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo70884c() {
        this.f86752c.addOnAttachStateChangeListener(this);
    }

    public C33475a(IV iv, P p, ViewGroup viewGroup) {
        this.f86750a = iv;
        this.f86751b = p;
        if (this.f86752c == null) {
            this.f86752c = LayoutInflater.from(viewGroup.getContext()).inflate(mo70885d(), viewGroup, false);
        }
        mo70883b();
        mo70884c();
    }
}
