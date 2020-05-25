package com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.p1860d;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0199s;
import android.support.p030v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import com.p683ss.android.ugc.aweme.p1807im.sdk.C33298c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.viewmodel.MediaPreviewViewModel;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.d.a */
public abstract class C34524a extends C33298c<C34409a> {

    /* renamed from: b */
    public C34409a f89006b;

    /* renamed from: c */
    public final MediaPreviewViewModel f89007c;

    /* renamed from: d */
    private int f89008d = -1;

    /* renamed from: e */
    private int f89009e = -1;

    /* renamed from: f */
    private final C0199s<C0177a> f89010f = new C34525a(this);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.d.a$a */
    static final class C34525a<T> implements C0199s<C0177a> {

        /* renamed from: a */
        final /* synthetic */ C34524a f89011a;

        C34525a(C34524a aVar) {
            this.f89011a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C0177a aVar = (C0177a) obj;
            if (aVar != null && C34526b.f89012a[aVar.ordinal()] == 1) {
                this.f89011a.mo72540g();
            }
        }
    }

    /* renamed from: c */
    public void mo70629c() {
    }

    /* renamed from: g */
    public void mo72540g() {
    }

    /* renamed from: f */
    public void mo72539f() {
        this.f89007c.mo72559o().removeObserver(this.f89010f);
    }

    /* renamed from: e */
    public void mo72538e() {
        FragmentActivity d = mo70630d();
        if (d != null) {
            this.f89007c.mo72559o().observe(d, this.f89010f);
        }
    }

    /* renamed from: a */
    public void mo70626a(C34409a aVar) {
        C52711k.m112240b(aVar, "data");
        this.f89006b = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C52847n<Integer, Integer> mo72536a(View view) {
        int i;
        int i2;
        C52711k.m112240b(view, "toResizeView");
        C34409a aVar = this.f89006b;
        if (aVar == null || aVar.getWidth() <= 0 || aVar.getHeight() <= 0) {
            return null;
        }
        boolean z = true;
        if (this.f89008d <= 0 || this.f89009e <= 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            FragmentActivity d = mo70630d();
            if (d != null) {
                WindowManager windowManager = d.getWindowManager();
                if (windowManager != null) {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    if (defaultDisplay != null) {
                        defaultDisplay.getMetrics(displayMetrics);
                    }
                }
            }
            this.f89008d = displayMetrics.widthPixels;
            this.f89009e = displayMetrics.heightPixels;
            if (this.f89008d <= 0 || this.f89009e <= 0) {
                z = false;
            }
        }
        if (!z) {
            return null;
        }
        float height = ((float) aVar.getHeight()) / ((float) aVar.getWidth());
        if (height > ((float) this.f89009e) / ((float) this.f89008d)) {
            i2 = this.f89009e;
            i = (int) (((float) this.f89009e) / height);
        } else {
            int i3 = (int) (((float) this.f89008d) * height);
            i = this.f89008d;
            i2 = i3;
        }
        LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
        return new C52847n<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public C34524a(View view, MediaPreviewViewModel mediaPreviewViewModel) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(mediaPreviewViewModel, "viewModel");
        super(view);
        this.f89007c = mediaPreviewViewModel;
    }
}
