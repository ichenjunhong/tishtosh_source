package com.p683ss.android.ugc.aweme.p1807im.sdk.widget.p1898c;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.PopupWindow;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35242bk;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.c.b */
public final class C35396b extends PopupWindow {

    /* renamed from: a */
    public C35395a f90965a;

    /* renamed from: b */
    int f90966b;

    /* renamed from: c */
    int f90967c;

    /* renamed from: d */
    public View f90968d;

    /* renamed from: e */
    Activity f90969e;

    /* renamed from: f */
    boolean f90970f = true;

    /* renamed from: g */
    private View f90971g;

    /* renamed from: b */
    public final void mo73672b() {
        this.f90965a = null;
        dismiss();
    }

    /* renamed from: a */
    public final void mo73670a() {
        if (!isShowing() && this.f90971g.getWindowToken() != null) {
            setBackgroundDrawable(new ColorDrawable(0));
            showAtLocation(this.f90971g, 0, 0, 0);
        }
    }

    public C35396b(Activity activity) {
        super(activity);
        this.f90969e = activity;
        this.f90968d = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(R.layout.bh0, null, false);
        setContentView(this.f90968d);
        setSoftInputMode(21);
        setInputMethodMode(1);
        this.f90971g = activity.findViewById(16908290);
        setWidth(0);
        setHeight(-1);
        this.f90968d.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                int i;
                boolean z;
                if (C35396b.this.f90968d != null) {
                    C35396b bVar = C35396b.this;
                    bVar.f90969e.getWindowManager().getDefaultDisplay().getSize(new Point());
                    Rect rect = new Rect();
                    bVar.f90968d.getWindowVisibleDisplayFrame(rect);
                    int i2 = bVar.f90969e.getResources().getConfiguration().orientation;
                    int height = bVar.f90969e.getWindow().getDecorView().getHeight();
                    int a = C35242bk.m79687a(bVar.f90969e);
                    int c = C23724k.m58225c();
                    if (bVar.f90970f) {
                        i = ((height - rect.bottom) - a) + c;
                    } else {
                        i = (height - rect.bottom) - a;
                    }
                    if (i >= (((height - a) - C11065a.m22390a((Context) bVar.f90969e)) / 10) * 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z && i == c) {
                        bVar.f90970f = false;
                    }
                    if (i == 0) {
                        bVar.mo73671a(z, 0, i2);
                    } else if (i2 == 1) {
                        bVar.f90967c = i;
                        bVar.mo73671a(z, bVar.f90967c, i2);
                    } else {
                        bVar.f90966b = i;
                        bVar.mo73671a(z, bVar.f90966b, i2);
                    }
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo73671a(boolean z, int i, int i2) {
        if (this.f90965a != null) {
            this.f90965a.mo73188a(z, i, i2);
        }
    }
}
