package android.support.p030v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.Handler;
import android.support.p030v4.p038f.C0799m;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.j */
public abstract class C0653j<E> extends C0651h {

    /* renamed from: a */
    private final int f2342a;

    /* renamed from: b */
    public final Activity f2343b;

    /* renamed from: c */
    public final Context f2344c;

    /* renamed from: d */
    public final Handler f2345d;

    /* renamed from: e */
    public final C0658m f2346e;

    /* renamed from: a */
    public View mo1968a(int i) {
        return null;
    }

    /* renamed from: a */
    public void mo2028a(Fragment fragment, String[] strArr, int i) {
    }

    /* renamed from: a */
    public void mo2029a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: a */
    public boolean mo1969a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo2030a(Fragment fragment) {
        return true;
    }

    /* renamed from: a */
    public boolean mo2031a(String str) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2033b(Fragment fragment) {
    }

    /* renamed from: c */
    public void mo2034c() {
    }

    /* renamed from: d */
    public boolean mo2035d() {
        return true;
    }

    /* renamed from: e */
    public int mo2036e() {
        return this.f2342a;
    }

    /* renamed from: f */
    public abstract E mo2037f();

    /* renamed from: b */
    public LayoutInflater mo2032b() {
        return LayoutInflater.from(this.f2344c);
    }

    C0653j(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, fragmentActivity.mHandler, 0);
    }

    /* renamed from: a */
    public void mo2026a(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            this.f2344c.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    private C0653j(Activity activity, Context context, Handler handler, int i) {
        this.f2346e = new C0658m();
        this.f2343b = activity;
        this.f2344c = (Context) C0799m.m2268a(context, "context == null");
        this.f2345d = (Handler) C0799m.m2268a(handler, "handler == null");
        this.f2342a = 0;
    }

    /* renamed from: a */
    public void mo2027a(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        if (i == -1) {
            C0636b.m1717a(this.f2343b, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
    }
}
