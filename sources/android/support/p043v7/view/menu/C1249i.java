package android.support.p043v7.view.menu;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.support.p043v7.app.C1160b;
import android.support.p043v7.view.menu.C1262o.C1263a;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

/* renamed from: android.support.v7.view.menu.i */
final class C1249i implements OnClickListener, OnDismissListener, OnKeyListener, C1263a {

    /* renamed from: a */
    C1246h f4240a;

    /* renamed from: b */
    C1160b f4241b;

    /* renamed from: c */
    C1243f f4242c;

    /* renamed from: d */
    public C1263a f4243d;

    public final void dismiss() {
        if (this.f4241b != null) {
            this.f4241b.dismiss();
        }
    }

    public C1249i(C1246h hVar) {
        this.f4240a = hVar;
    }

    /* renamed from: a */
    public final boolean mo3716a(C1246h hVar) {
        if (this.f4243d != null) {
            return this.f4243d.mo3716a(hVar);
        }
        return false;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f4242c.mo1084a(this.f4240a, true);
    }

    /* renamed from: a */
    public final void mo3715a(C1246h hVar, boolean z) {
        if (z || hVar == this.f4240a) {
            dismiss();
        }
        if (this.f4243d != null) {
            this.f4243d.mo3715a(hVar, z);
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f4240a.mo4113a((MenuItem) (C1250j) this.f4242c.mo4090d().getItem(i), 0);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window = this.f4241b.getWindow();
                if (window != null) {
                    View decorView = window.getDecorView();
                    if (decorView != null) {
                        DispatcherState keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, this);
                            return true;
                        }
                    }
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                Window window2 = this.f4241b.getWindow();
                if (window2 != null) {
                    View decorView2 = window2.getDecorView();
                    if (decorView2 != null) {
                        DispatcherState keyDispatcherState2 = decorView2.getKeyDispatcherState();
                        if (keyDispatcherState2 != null && keyDispatcherState2.isTracking(keyEvent)) {
                            this.f4240a.mo4126b(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.f4240a.performShortcut(i, keyEvent, 0);
    }
}
