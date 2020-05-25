package com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.p683ss.android.ugc.tools.utils.C50203g;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.d */
public final class C46747d {

    /* renamed from: a */
    public View f118053a;

    /* renamed from: b */
    public int f118054b;

    /* renamed from: c */
    public C46749a f118055c;

    /* renamed from: d */
    private OnGlobalLayoutListener f118056d = new OnGlobalLayoutListener() {
        public final void onGlobalLayout() {
            Rect rect = new Rect();
            C46747d.this.f118053a.getWindowVisibleDisplayFrame(rect);
            int height = rect.height();
            if (C46747d.this.f118054b != height) {
                StringBuilder sb = new StringBuilder("softKeyBoard old Height:");
                sb.append(C46747d.this.f118054b);
                sb.append(", new Height:");
                sb.append(height);
                C50203g.m108358a(sb.toString());
            }
            if (C46747d.this.f118054b == 0) {
                C46747d.this.f118054b = height;
            } else if (C46747d.this.f118054b != height) {
                if (C46747d.this.f118055c != null) {
                    if (C46747d.this.f118054b - height > 200) {
                        C46747d.this.f118055c.mo73970a(C46747d.this.f118054b - height);
                    } else if (C46747d.this.f118054b > height) {
                        C46747d.this.f118055c.mo73972c(C46747d.this.f118054b - height);
                    } else if (height - C46747d.this.f118054b > 200) {
                        C46747d.this.f118055c.mo73971b(height - C46747d.this.f118054b);
                    }
                }
                C46747d.this.f118054b = height;
            }
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.d$a */
    public interface C46749a {
        /* renamed from: a */
        void mo73970a(int i);

        /* renamed from: b */
        void mo73971b(int i);

        /* renamed from: c */
        void mo73972c(int i);
    }

    /* renamed from: a */
    public final void mo93877a() {
        if (!(this.f118053a == null || this.f118056d == null)) {
            this.f118053a.getViewTreeObserver().removeOnGlobalLayoutListener(this.f118056d);
        }
        this.f118055c = null;
    }

    public C46747d(Activity activity) {
        this.f118053a = activity.getWindow().getDecorView();
    }

    /* renamed from: a */
    public final void mo93878a(C46749a aVar) {
        this.f118055c = aVar;
        if (this.f118053a != null && this.f118056d != null) {
            this.f118053a.getViewTreeObserver().addOnGlobalLayoutListener(this.f118056d);
        }
    }
}
