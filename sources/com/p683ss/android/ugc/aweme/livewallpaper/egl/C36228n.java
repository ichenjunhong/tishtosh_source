package com.p683ss.android.ugc.aweme.livewallpaper.egl;

import android.opengl.GLES20;
import android.util.AndroidRuntimeException;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.n */
public class C36228n implements C36221h {

    /* renamed from: a */
    protected C36231b f92739a;

    /* renamed from: b */
    private int f92740b;

    /* renamed from: c */
    private int f92741c;

    /* renamed from: d */
    private int f92742d;

    /* renamed from: e */
    private int f92743e;

    /* renamed from: f */
    private C36220g f92744f = new C36227m(0);

    /* renamed from: g */
    private ReentrantLock f92745g = new ReentrantLock();

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.n$a */
    class C36230a implements C36231b {
        private C36230a() {
        }

        /* renamed from: a */
        public final void mo75011a(C36221h hVar) {
            C36228n.this.f92739a = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.n$b */
    public interface C36231b {
        /* renamed from: a */
        void mo75011a(C36221h hVar);
    }

    /* renamed from: a */
    public final int mo74989a() {
        return this.f92744f.mo74989a();
    }

    /* renamed from: d */
    public final void mo74992d() {
        this.f92745g.unlock();
    }

    /* renamed from: c */
    public final int mo74991c() {
        if (!this.f92745g.isHeldByCurrentThread()) {
            this.f92745g.lock();
            return this.f92740b;
        }
        throw new AndroidRuntimeException("Dead lock!!");
    }

    /* renamed from: b */
    public final int mo74990b() {
        int b = this.f92744f.mo74990b();
        if (b == 1) {
            this.f92739a.mo75011a(this);
        } else if (b <= 0) {
            StringBuilder sb = new StringBuilder("reference idx ");
            sb.append(b - 1);
            sb.append(" app abort!!");
            throw new RuntimeException(new Exception(sb.toString()));
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo75010e() {
        mo74991c();
        if (this.f92740b > 0) {
            GLES20.glDeleteTextures(1, new int[]{this.f92740b}, 0);
        }
        if (this.f92741c > 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{this.f92741c}, 0);
        }
        this.f92741c = 0;
        this.f92740b = 0;
        this.f92739a = new C36230a();
        mo74992d();
    }

    public C36228n(int i, int i2, int i3, C36231b bVar) {
        this.f92740b = i;
        this.f92742d = i2;
        this.f92743e = i3;
        if (bVar == null) {
            bVar = new C36230a();
        }
        this.f92739a = bVar;
    }
}
