package com.p683ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.graphics.Rect;
import android.view.View;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31854k;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.f */
public class C28363f extends C31854k {

    /* renamed from: a */
    protected final C28364a f74462a;

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.f$a */
    public interface C28364a {
        void aN_();

        void aO_();

        View aP_();

        /* renamed from: h */
        int mo56779h();

        /* renamed from: i */
        boolean mo56780i();
    }

    /* renamed from: e */
    public final void mo56771e() {
    }

    /* renamed from: i */
    public final boolean mo56775i() {
        return false;
    }

    /* renamed from: f */
    public final int mo56772f() {
        return this.f74462a.mo56779h();
    }

    /* renamed from: g */
    public final View mo56773g() {
        return this.f74462a.aP_();
    }

    /* renamed from: b */
    public void mo56768b() {
        super.mo56768b();
        this.f74462a.aN_();
    }

    /* renamed from: c */
    public final void mo56769c() {
        super.mo56769c();
        this.f74462a.aO_();
    }

    /* renamed from: d */
    public final void mo56770d() {
        super.mo56770d();
        this.f74462a.aO_();
    }

    /* renamed from: h */
    public final boolean mo56774h() {
        if (!super.mo56774h() || !this.f74462a.mo56780i()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final Rect mo56766a() {
        int[] iArr = new int[2];
        Rect rect = new Rect();
        View aP_ = this.f74462a.aP_();
        aP_.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + aP_.getWidth(), iArr[1] + aP_.getHeight());
        return rect;
    }

    public C28363f(C28364a aVar) {
        this.f74462a = aVar;
    }

    /* renamed from: a */
    public void mo56767a(int i) {
        super.mo56767a(i);
        this.f74462a.aN_();
    }
}
