package android.support.p030v4.app;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment.SavedState;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: android.support.v4.app.k */
public abstract class C0654k {

    /* renamed from: android.support.v4.app.k$a */
    public static abstract class C0655a {
        public void onFragmentActivityCreated(C0654k kVar, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentAttached(C0654k kVar, Fragment fragment, Context context) {
        }

        public void onFragmentCreated(C0654k kVar, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentDestroyed(C0654k kVar, Fragment fragment) {
        }

        public void onFragmentDetached(C0654k kVar, Fragment fragment) {
        }

        public void onFragmentPaused(C0654k kVar, Fragment fragment) {
        }

        public void onFragmentPreAttached(C0654k kVar, Fragment fragment, Context context) {
        }

        public void onFragmentPreCreated(C0654k kVar, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentResumed(C0654k kVar, Fragment fragment) {
        }

        public void onFragmentSaveInstanceState(C0654k kVar, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentStarted(C0654k kVar, Fragment fragment) {
        }

        public void onFragmentStopped(C0654k kVar, Fragment fragment) {
        }

        public void onFragmentViewCreated(C0654k kVar, Fragment fragment, View view, Bundle bundle) {
        }

        public void onFragmentViewDestroyed(C0654k kVar, Fragment fragment) {
        }
    }

    /* renamed from: android.support.v4.app.k$b */
    public interface C0656b {
        /* renamed from: a */
        void mo2251a();
    }

    /* renamed from: a */
    public abstract SavedState mo2221a(Fragment fragment);

    /* renamed from: a */
    public abstract Fragment mo2222a(int i);

    /* renamed from: a */
    public abstract Fragment mo2223a(Bundle bundle, String str);

    /* renamed from: a */
    public abstract Fragment mo2224a(String str);

    /* renamed from: a */
    public abstract C0679r mo2225a();

    /* renamed from: a */
    public abstract void mo2226a(int i, int i2);

    /* renamed from: a */
    public abstract void mo2227a(Bundle bundle, String str, Fragment fragment);

    /* renamed from: a */
    public abstract void mo2228a(C0655a aVar);

    /* renamed from: a */
    public abstract void mo2229a(C0655a aVar, boolean z);

    /* renamed from: a */
    public abstract void mo2230a(C0656b bVar);

    /* renamed from: a */
    public abstract void mo2231a(String str, int i);

    /* renamed from: a */
    public abstract void mo2232a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: b */
    public abstract void mo2233b(C0656b bVar);

    /* renamed from: b */
    public abstract boolean mo2234b();

    /* renamed from: c */
    public abstract void mo2235c();

    /* renamed from: d */
    public abstract boolean mo2236d();

    /* renamed from: e */
    public abstract int mo2237e();

    /* renamed from: f */
    public abstract List<Fragment> mo2238f();

    /* renamed from: g */
    public abstract boolean mo2239g();

    /* renamed from: h */
    public abstract boolean mo2240h();
}
