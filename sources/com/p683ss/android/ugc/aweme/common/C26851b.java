package com.p683ss.android.ugc.aweme.common;

import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26865e;

/* renamed from: com.ss.android.ugc.aweme.common.b */
public class C26851b<T extends C26832a, K extends C26865e> implements C26874f {

    /* renamed from: f */
    public T f70700f;

    /* renamed from: g */
    public K f70701g;

    /* access modifiers changed from: protected */
    /* renamed from: R_ */
    public void mo44834R_() {
    }

    /* renamed from: b */
    public void mo44838b() {
    }

    /* renamed from: c_ */
    public void mo44840c_(Exception exc) {
    }

    /* renamed from: n */
    public T mo54803n() {
        return this.f70700f;
    }

    /* renamed from: S_ */
    public void mo46991S_() {
        this.f70701g = null;
        aq_();
    }

    public final boolean av_() {
        if (this.f70701g != null) {
            return true;
        }
        return false;
    }

    public void aq_() {
        if (this.f70700f != null) {
            this.f70700f.clearNotifyListener(this);
            this.f70700f = null;
        }
    }

    /* renamed from: o */
    public final boolean mo54804o() {
        if (this.f70700f == null || !this.f70700f.mIsLoading) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo54800a(K k) {
        this.f70701g = k;
    }

    /* renamed from: a */
    public void mo54799a(T t) {
        this.f70700f = t;
        this.f70700f.addNotifyListener(this);
    }

    /* renamed from: a_ */
    public boolean mo44934a_(Object... objArr) {
        if (this.f70700f == null || mo54804o() || !this.f70700f.sendRequest(objArr)) {
            return false;
        }
        mo44834R_();
        return true;
    }
}
