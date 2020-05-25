package com.bytedance.widget;

import android.arch.lifecycle.C0167d;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0197q;

public class Widget_LifecycleAdapter implements C0167d {

    /* renamed from: a */
    final Widget f34868a;

    Widget_LifecycleAdapter(Widget widget) {
        this.f34868a = widget;
    }

    /* renamed from: a */
    public final void mo313a(C0184k kVar, C0177a aVar, boolean z, C0197q qVar) {
        boolean z2;
        if (qVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z) {
            if (aVar == C0177a.ON_CREATE) {
                if (!z2 || qVar.mo344a("create$widget_release", 1)) {
                    this.f34868a.create$widget_release();
                }
            } else if (aVar == C0177a.ON_START) {
                if (!z2 || qVar.mo344a("start$widget_release", 1)) {
                    this.f34868a.start$widget_release();
                }
            } else if (aVar == C0177a.ON_RESUME) {
                if (!z2 || qVar.mo344a("resume$widget_release", 1)) {
                    this.f34868a.resume$widget_release();
                }
            } else if (aVar == C0177a.ON_PAUSE) {
                if (!z2 || qVar.mo344a("pause$widget_release", 1)) {
                    this.f34868a.pause$widget_release();
                }
            } else if (aVar == C0177a.ON_STOP) {
                if (!z2 || qVar.mo344a("stop$widget_release", 1)) {
                    this.f34868a.stop$widget_release();
                }
            } else if (aVar == C0177a.ON_DESTROY) {
                if (!z2 || qVar.mo344a("destroy$widget_release", 1)) {
                    this.f34868a.destroy$widget_release();
                }
            }
        }
    }
}
