package com.p683ss.android.ugc.aweme.utils;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.view.WindowManager.BadTokenException;
import android.widget.Toast;
import com.bytedance.common.utility.C9406f;
import com.bytedance.common.utility.C9432q.C9435b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.utils.fy */
public final class C47905fy implements C9435b {

    /* renamed from: a */
    private static Field f120500a;

    /* renamed from: b */
    private static Field f120501b;

    /* renamed from: com.ss.android.ugc.aweme.utils.fy$a */
    public static class C47906a extends Handler {

        /* renamed from: a */
        private Handler f120502a;

        public C47906a(Handler handler) {
            this.f120502a = handler;
        }

        public final void handleMessage(Message message) {
            this.f120502a.handleMessage(message);
        }

        public final void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
            } catch (BadTokenException e) {
                C32458a.m75148a((Throwable) e);
            }
        }
    }

    static {
        try {
            Field declaredField = Toast.class.getDeclaredField("mTN");
            f120500a = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = f120500a.getType().getDeclaredField("mHandler");
            f120501b = declaredField2;
            declaredField2.setAccessible(true);
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
        }
    }

    /* renamed from: a */
    public static void m103630a(Toast toast) {
        try {
            Object obj = f120500a.get(toast);
            f120501b.set(obj, new C47906a((Handler) f120501b.get(obj)));
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
        }
    }

    /* renamed from: a */
    public final boolean mo17069a(Context context, int i, CharSequence charSequence, long j, int i2) {
        if ((context instanceof C9406f) || VERSION.SDK_INT != 25) {
            return false;
        }
        Toast makeText = Toast.makeText(context, charSequence, (int) j);
        m103630a(makeText);
        if (VERSION.SDK_INT == 25) {
            m103630a(makeText);
        }
        makeText.show();
        return true;
    }
}
