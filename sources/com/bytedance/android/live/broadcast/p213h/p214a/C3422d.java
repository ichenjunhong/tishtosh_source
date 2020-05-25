package com.bytedance.android.live.broadcast.p213h.p214a;

import com.bytedance.android.live.broadcast.p213h.p214a.p215a.C3416c;
import com.p683ss.avframework.livestreamv2.filter.IFilterManager;

/* renamed from: com.bytedance.android.live.broadcast.h.a.d */
final class C3422d implements C3416c {

    /* renamed from: a */
    IFilterManager f9734a;

    /* renamed from: b */
    boolean f9735b;

    /* renamed from: a */
    public final void mo8774a() {
        this.f9735b = true;
    }

    /* renamed from: a */
    public final void mo8781a(String str, boolean z) {
        if (!this.f9735b) {
            this.f9734a.setEffect(str, z);
        }
    }

    /* renamed from: a */
    public final void mo8779a(String str, float f) {
        if (!this.f9735b) {
            IFilterManager iFilterManager = this.f9734a;
            if (str == null) {
                str = "";
            }
            iFilterManager.setFilter(str, 1.0f);
        }
    }

    /* renamed from: a */
    public final void mo8780a(String str, String str2, boolean z) {
        if (!this.f9735b) {
            this.f9734a.setCustomEffect(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo8782a(boolean z) {
        if (!this.f9735b) {
            this.f9734a.enableMockFace(z);
        }
    }

    public C3422d(IFilterManager iFilterManager) {
        this.f9734a = iFilterManager;
    }

    /* renamed from: a */
    public final void mo8778a(String str) {
        if (!this.f9735b) {
            this.f9734a.setEffect(null, false);
        }
    }

    /* renamed from: a */
    public final int mo8770a(int i, int i2) {
        if (this.f9735b) {
            return 0;
        }
        return this.f9734a.composerSetMode(i, i2);
    }

    /* renamed from: c */
    public final void mo8786c(float f, float f2) {
        if (!this.f9735b) {
            this.f9734a.processScaleEvent(f, f2);
        }
    }

    /* renamed from: b */
    public final void mo8784b(float f, float f2) {
        if (!this.f9735b) {
            this.f9734a.processLongPressEvent(f, f2);
        }
    }

    /* renamed from: a */
    public final int mo8772a(String[] strArr, int i) {
        if (this.f9735b) {
            return 0;
        }
        return this.f9734a.composerSetNodes(strArr, i);
    }

    /* renamed from: a */
    public final void mo8775a(float f, float f2) {
        if (!this.f9735b) {
            this.f9734a.processTouchEvent(f, f2);
        }
    }

    /* renamed from: b */
    public final int mo8783b(String str, String str2, float f) {
        if (this.f9735b) {
            return 0;
        }
        return this.f9734a.composerUpdateNode(str, str2, f);
    }

    /* renamed from: a */
    public final int mo8771a(String str, String str2, float f) {
        if (this.f9735b) {
            return 0;
        }
        return this.f9734a.setFilter(str, str2, f);
    }

    /* renamed from: b */
    public final void mo8785b(float f, float f2, int i) {
        if (!this.f9735b) {
            this.f9734a.processTouchUpEvent(f, f2, i);
        }
    }

    /* renamed from: a */
    public final int mo8773a(String[] strArr, int i, String[] strArr2) {
        if (this.f9735b) {
            return 0;
        }
        return this.f9734a.composerSetNodesWithTags(strArr, i, strArr2);
    }

    /* renamed from: a */
    public final void mo8777a(float f, float f2, int i) {
        if (!this.f9735b) {
            this.f9734a.processTouchDownEvent(f, f2, i);
        }
    }

    /* renamed from: a */
    public final void mo8776a(float f, float f2, float f3, float f4, float f5) {
        if (!this.f9735b) {
            this.f9734a.processPanEvent(f, f2, f3, f4, f5);
        }
    }
}
