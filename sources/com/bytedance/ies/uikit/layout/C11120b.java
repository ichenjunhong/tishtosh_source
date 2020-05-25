package com.bytedance.ies.uikit.layout;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.ies.uikit.p699c.C11089b;
import com.bytedance.ies.uikit.p699c.C11090c;
import java.util.HashMap;

/* renamed from: com.bytedance.ies.uikit.layout.b */
public final class C11120b extends FrameLayout {

    /* renamed from: com.bytedance.ies.uikit.layout.b$a */
    static class C11122a {

        /* renamed from: a */
        static Handler f29967a = new Handler(Looper.getMainLooper());
    }

    /* access modifiers changed from: 0000 */
    public final Handler getMainHandler() {
        return C11122a.f29967a;
    }

    /* renamed from: a */
    private static boolean m22514a() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public final void requestLayout() {
        if (m22514a()) {
            super.requestLayout();
            return;
        }
        m22513a(Thread.currentThread().getStackTrace());
        Handler mainHandler = getMainHandler();
        if (mainHandler != null) {
            mainHandler.post(new Runnable() {
                public final void run() {
                    C11120b.this.requestLayout();
                }
            });
        }
    }

    public C11120b(Context context) {
        super(context);
    }

    /* renamed from: a */
    private static void m22513a(StackTraceElement[] stackTraceElementArr) {
        if (C11089b.m22440a() != null && stackTraceElementArr != null && stackTraceElementArr.length != 0) {
            String a = C11090c.m22441a(stackTraceElementArr, 0);
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("stackTrace", a);
            hashMap.put("time", String.valueOf(currentTimeMillis));
            C11089b.m22440a().mo20221a(hashMap);
        }
    }

    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        if (m22514a()) {
            return super.invalidateChildInParent(iArr, rect);
        }
        m22513a(Thread.currentThread().getStackTrace());
        return null;
    }
}
