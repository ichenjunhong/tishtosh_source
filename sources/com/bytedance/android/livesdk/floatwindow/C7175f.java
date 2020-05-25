package com.bytedance.android.livesdk.floatwindow;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;

/* renamed from: com.bytedance.android.livesdk.floatwindow.f */
public final class C7175f extends C7170a {

    /* renamed from: a */
    final WindowManager f19477a;

    /* renamed from: b */
    final LayoutParams f19478b;

    /* renamed from: c */
    View f19479c;

    /* renamed from: d */
    int f19480d;

    /* renamed from: e */
    int f19481e;

    /* renamed from: f */
    private final Context f19482f;

    /* renamed from: g */
    private C7173d f19483g;

    /* renamed from: h */
    private boolean f19484h;

    /* renamed from: a */
    public final int mo13308a() {
        return this.f19480d;
    }

    /* renamed from: b */
    public final int mo13311b() {
        return this.f19481e;
    }

    /* access modifiers changed from: 0000 */
    public final void dismiss() {
        this.f19484h = true;
        this.f19477a.removeView(this.f19479c);
    }

    /* renamed from: a */
    public final void mo13309a(int i) {
        if (!this.f19484h) {
            this.f19478b.x = i;
            this.f19480d = i;
            this.f19477a.updateViewLayout(this.f19479c, this.f19478b);
        }
    }

    /* renamed from: b */
    public final void mo13312b(int i) {
        if (!this.f19484h) {
            this.f19478b.y = i;
            this.f19481e = i;
            this.f19477a.updateViewLayout(this.f19479c, this.f19478b);
        }
    }

    public C7175f(Context context, C7173d dVar) {
        this.f19482f = context;
        this.f19483g = dVar;
        this.f19477a = (WindowManager) context.getSystemService("window");
        this.f19478b = new LayoutParams();
        this.f19478b.format = 1;
        this.f19478b.flags = 552;
        this.f19478b.windowAnimations = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo13310a(int i, int i2) {
        if (!this.f19484h) {
            this.f19478b.x = i;
            this.f19480d = i;
            this.f19478b.y = i2;
            this.f19481e = i2;
            this.f19477a.updateViewLayout(this.f19479c, this.f19478b);
        }
    }

    /* renamed from: b */
    public final void mo13320b(int i, int i2) {
        this.f19478b.width = i;
        this.f19478b.height = i2;
        this.f19477a.updateViewLayout(this.f19479c, this.f19478b);
    }
}
