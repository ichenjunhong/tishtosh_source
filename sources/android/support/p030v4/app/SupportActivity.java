package android.support.p030v4.app;

import android.app.Activity;
import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0185l;
import android.arch.lifecycle.C0205v;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.p038f.C0800n;
import android.support.p030v4.view.C1040f;
import android.support.p030v4.view.C1040f.C1041a;
import android.view.KeyEvent;
import android.view.View;
import com.p683ss.android.ugc.aweme.lancet.C18968a;

/* renamed from: android.support.v4.app.SupportActivity */
public class SupportActivity extends Activity implements C0184k, C1041a {
    private C0800n<Class<? extends C0606a>, C0606a> mExtraDataMap = new C0800n<>();
    private C0185l mLifecycleRegistry = new C0185l(this);

    /* renamed from: android.support.v4.app.SupportActivity$a */
    public static class C0606a {
    }

    public C0176h getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public void setRequestedOrientation$___twin___(int i) {
        super.setRequestedOrientation(i);
    }

    /* access modifiers changed from: private */
    public void onCreate$___twin___(Bundle bundle) {
        super.onCreate(bundle);
        C0205v.m426a((Activity) this);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public <T extends C0606a> T getExtraData(Class<T> cls) {
        return (C0606a) this.mExtraDataMap.get(cls);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C18968a.m46139a(this);
        onCreate$___twin___(bundle);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.mo333a(C0178b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    public void putExtraData(C0606a aVar) {
        this.mExtraDataMap.put(aVar.getClass(), aVar);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C1040f.m2975a(decorView, keyEvent)) {
            return C1040f.m2974a(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C1040f.m2975a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public void setRequestedOrientation(int i) {
        if (VERSION.SDK_INT != 26) {
            setRequestedOrientation$___twin___(i);
            return;
        }
        TypedArray obtainStyledAttributes = obtainStyledAttributes(new int[]{16842840});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        if (!z) {
            setRequestedOrientation$___twin___(i);
        }
    }
}
