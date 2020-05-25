package com.p683ss.android.medialib.presenter;

import com.p683ss.android.medialib.FaceBeautyInvoker;

/* renamed from: com.ss.android.medialib.presenter.e */
public final class C19378e {

    /* renamed from: a */
    private FaceBeautyInvoker f53581a;

    /* renamed from: com.ss.android.medialib.presenter.e$a */
    public interface C19379a {
        /* renamed from: a */
        void mo40428a();
    }

    /* renamed from: a */
    public final void mo40424a() {
        if (this.f53581a != null) {
            this.f53581a.setVideoBgStatus(0);
        }
    }

    /* renamed from: b */
    public final void mo40427b() {
        if (this.f53581a != null) {
            this.f53581a.setVideoBgStatus(2);
        }
    }

    C19378e(FaceBeautyInvoker faceBeautyInvoker) {
        this.f53581a = faceBeautyInvoker;
    }

    /* renamed from: a */
    public final void mo40425a(C19379a aVar) {
        if (this.f53581a != null) {
            this.f53581a.setVEOnVideoEOFListener(aVar);
        }
    }

    /* renamed from: a */
    public final void mo40426a(boolean z) {
        if (this.f53581a != null) {
            this.f53581a.setEnableEffCtrl(z);
        }
    }
}
