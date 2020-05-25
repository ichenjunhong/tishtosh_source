package com.p683ss.android.message.sswo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.message.sswo.SswoActivity */
public class SswoActivity extends Activity {

    /* renamed from: a */
    private static WeakReference<SswoActivity> f53838a;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.message.sswo.SswoActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.message.sswo.SswoActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.message.sswo.SswoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onBackPressed() {
        try {
            super.onBackPressed();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (f53838a != null && ((SswoActivity) f53838a.get()) == this) {
            f53838a.clear();
            f53838a = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (!C19495a.m47729a(this).mo40653c() && !isFinishing()) {
            finish();
        }
    }

    /* renamed from: a */
    public static boolean m47728a() {
        try {
            if (f53838a != null) {
                SswoActivity sswoActivity = (SswoActivity) f53838a.get();
                if (sswoActivity != null) {
                    return sswoActivity.isFinishing();
                }
            }
        } catch (Throwable unused) {
        }
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isFinishing()) {
            finish();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isFinishing()) {
            finish();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public static void m47727a(Context context) {
        try {
            if (f53838a != null) {
                SswoActivity sswoActivity = (SswoActivity) f53838a.get();
                if (sswoActivity != null && !sswoActivity.isFinishing()) {
                    sswoActivity.finish();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.message.sswo.SswoActivity", "onCreate", true);
        super.onCreate(bundle);
        try {
            Window window = getWindow();
            window.setGravity(51);
            LayoutParams attributes = window.getAttributes();
            attributes.x = 35;
            attributes.y = 0;
            attributes.height = 1;
            attributes.width = 1;
            window.setAttributes(attributes);
        } catch (Throwable unused) {
        }
        f53838a = new WeakReference<>(this);
        ActivityInstrumentation.onTrace("com.ss.android.message.sswo.SswoActivity", "onCreate", false);
    }
}
