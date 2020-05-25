package android.support.p030v4.app;

import android.arch.lifecycle.C0159aa;
import android.arch.lifecycle.C0160ab;
import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0178b;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.p030v4.app.C0636b.C0638a;
import android.support.p030v4.app.C0636b.C0639b;
import android.support.p030v4.app.C0636b.C0640c;
import android.support.p030v4.p038f.C0782d;
import android.support.p030v4.p038f.C0801o;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.FragmentActivity */
public class FragmentActivity extends SupportActivity implements C0160ab, C0638a, C0640c {
    boolean mCreated;
    final C0652i mFragments = new C0652i(new C0588a());
    final Handler mHandler = new Handler() {
        public final void handleMessage(Message message) {
            if (message.what != 2) {
                super.handleMessage(message);
                return;
            }
            FragmentActivity.this.onResumeFragments();
            FragmentActivity.this.mFragments.mo2220c();
        }
    };
    int mNextCandidateRequestIndex;
    C0801o<String> mPendingFragmentActivityResults;
    boolean mRequestedPermissionsFromFragment;
    boolean mResumed;
    boolean mStartedActivityFromFragment;
    boolean mStartedIntentSenderFromFragment;
    boolean mStopped = true;
    private C0159aa mViewModelStore;

    /* renamed from: android.support.v4.app.FragmentActivity$a */
    class C0588a extends C0653j<FragmentActivity> {
        /* renamed from: f */
        public final /* bridge */ /* synthetic */ Object mo2037f() {
            return FragmentActivity.this;
        }

        /* renamed from: c */
        public final void mo2034c() {
            FragmentActivity.this.supportInvalidateOptionsMenu();
        }

        /* renamed from: b */
        public final LayoutInflater mo2032b() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        /* renamed from: d */
        public final boolean mo2035d() {
            if (FragmentActivity.this.getWindow() != null) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public final int mo2036e() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        /* renamed from: a */
        public final boolean mo1969a() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null || window.peekDecorView() == null) {
                return false;
            }
            return true;
        }

        public C0588a() {
            super(FragmentActivity.this);
        }

        /* renamed from: a */
        public final View mo1968a(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        /* renamed from: b */
        public final void mo2033b(Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        /* renamed from: a */
        public final boolean mo2030a(Fragment fragment) {
            if (!FragmentActivity.this.isFinishing()) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo2031a(String str) {
            return C0636b.m1719a(FragmentActivity.this, str);
        }

        /* renamed from: a */
        public final void mo2028a(Fragment fragment, String[] strArr, int i) {
            FragmentActivity.this.requestPermissionsFromFragment(fragment, strArr, i);
        }

        /* renamed from: a */
        public final void mo2026a(Fragment fragment, Intent intent, int i, Bundle bundle) {
            FragmentActivity.this.startActivityFromFragment(fragment, intent, i, bundle);
        }

        /* renamed from: a */
        public final void mo2029a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, null, printWriter, strArr);
        }

        /* renamed from: a */
        public final void mo2027a(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
            FragmentActivity.this.startIntentSenderFromFragment(fragment, intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    /* renamed from: android.support.v4.app.FragmentActivity$b */
    static final class C0589b {

        /* renamed from: a */
        Object f2108a;

        /* renamed from: b */
        C0159aa f2109b;

        /* renamed from: c */
        C0676o f2110c;

        C0589b() {
        }
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public void supportFinishAfterTransition() {
        C0636b.m1715a(this);
    }

    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        C0636b.m1720b(this);
    }

    public void supportStartPostponedEnterTransition() {
        C0636b.m1721c(this);
    }

    public C0176h getLifecycle() {
        return super.getLifecycle();
    }

    public C0654k getSupportFragmentManager() {
        return this.mFragments.mo2218a();
    }

    public C0699x getSupportLoaderManager() {
        return C0699x.m2021a(this);
    }

    public void onStateNotSaved() {
        this.mFragments.mo2219b();
    }

    private void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), C0178b.CREATED));
    }

    public Object getLastCustomNonConfigurationInstance() {
        C0589b bVar = (C0589b) getLastNonConfigurationInstance();
        if (bVar != null) {
            return bVar.f2108a;
        }
        return null;
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.f2341a.f2346e.mo2292t();
    }

    /* access modifiers changed from: protected */
    public void onResumeFragments() {
        this.mFragments.f2341a.f2346e.mo2288p();
    }

    public void onBackPressed() {
        C0654k a = this.mFragments.mo2218a();
        boolean h = a.mo2240h();
        if (!h || VERSION.SDK_INT > 25) {
            if (h || !a.mo2236d()) {
                super.onBackPressed();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.mViewModelStore != null && !isChangingConfigurations()) {
            this.mViewModelStore.mo301a();
        }
        this.mFragments.f2341a.f2346e.mo2291s();
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        this.mHandler.removeMessages(2);
        onResumeFragments();
        this.mFragments.mo2220c();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.mHandler.sendEmptyMessage(2);
        this.mResumed = true;
        this.mFragments.mo2220c();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.f2341a.f2346e.mo2290r();
    }

    public C0159aa getViewModelStore() {
        if (getApplication() != null) {
            if (this.mViewModelStore == null) {
                C0589b bVar = (C0589b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.mViewModelStore = bVar.f2109b;
                }
                if (this.mViewModelStore == null) {
                    this.mViewModelStore = new C0159aa();
                }
            }
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        if (this.mHandler.hasMessages(2)) {
            this.mHandler.removeMessages(2);
            onResumeFragments();
        }
        this.mFragments.f2341a.f2346e.mo2289q();
    }

    public final Object onRetainNonConfigurationInstance() {
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C0658m mVar = this.mFragments.f2341a.f2346e;
        C0658m.m1827a(mVar.f2356D);
        C0676o oVar = mVar.f2356D;
        if (oVar == null && this.mViewModelStore == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0589b bVar = new C0589b();
        bVar.f2108a = onRetainCustomNonConfigurationInstance;
        bVar.f2109b = this.mViewModelStore;
        bVar.f2110c = oVar;
        return bVar;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.f2341a.f2346e.mo2284n();
        }
        this.mFragments.mo2219b();
        this.mFragments.mo2220c();
        this.mFragments.f2341a.f2346e.mo2285o();
    }

    static void checkForValidRequestCode(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.f2341a.f2346e.mo2261a(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.mo2219b();
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.f2341a.f2346e.mo2271b(z);
    }

    public final void validateRequestPermissionsRequestCode(int i) {
        if (!this.mRequestedPermissionsFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.mo2219b();
        this.mFragments.f2341a.f2346e.mo2254a(configuration);
    }

    public void setEnterSharedElementCallback(C0631ah ahVar) {
        C0641d dVar;
        if (VERSION.SDK_INT >= 21) {
            if (ahVar != null) {
                dVar = new C0641d(ahVar);
            } else {
                dVar = null;
            }
            setEnterSharedElementCallback(dVar);
        }
    }

    public void setExitSharedElementCallback(C0631ah ahVar) {
        C0641d dVar;
        if (VERSION.SDK_INT >= 21) {
            if (ahVar != null) {
                dVar = new C0641d(ahVar);
            } else {
                dVar = null;
            }
            setExitSharedElementCallback(dVar);
        }
    }

    private int allocateRequestIndex(Fragment fragment) {
        if (this.mPendingFragmentActivityResults.mo2596c() < 65534) {
            while (true) {
                C0801o<String> oVar = this.mPendingFragmentActivityResults;
                int i = this.mNextCandidateRequestIndex;
                if (oVar.f2724b) {
                    oVar.mo2593b();
                }
                if (C0782d.m2219a(oVar.f2725c, oVar.f2727e, i) >= 0) {
                    this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % 65534;
                } else {
                    int i2 = this.mNextCandidateRequestIndex;
                    this.mPendingFragmentActivityResults.mo2595b(i2, fragment.mWho);
                    this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % 65534;
                    return i2;
                }
            }
        } else {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        markFragmentsCreated();
        Parcelable k = this.mFragments.f2341a.f2346e.mo2281k();
        if (k != null) {
            bundle.putParcelable("android:support:fragments", k);
        }
        if (this.mPendingFragmentActivityResults.mo2596c() > 0) {
            bundle.putInt("android:support:next_request_index", this.mNextCandidateRequestIndex);
            int[] iArr = new int[this.mPendingFragmentActivityResults.mo2596c()];
            String[] strArr = new String[this.mPendingFragmentActivityResults.mo2596c()];
            for (int i = 0; i < this.mPendingFragmentActivityResults.mo2596c(); i++) {
                iArr[i] = this.mPendingFragmentActivityResults.mo2597c(i);
                strArr[i] = (String) this.mPendingFragmentActivityResults.mo2600d(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C0652i iVar = this.mFragments;
        C0676o oVar = null;
        iVar.f2341a.f2346e.mo2259a((C0653j) iVar.f2341a, (C0651h) iVar.f2341a, (Fragment) null);
        super.onCreate(bundle);
        C0589b bVar = (C0589b) getLastNonConfigurationInstance();
        if (!(bVar == null || bVar.f2109b == null || this.mViewModelStore != null)) {
            this.mViewModelStore = bVar.f2109b;
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            C0652i iVar2 = this.mFragments;
            if (bVar != null) {
                oVar = bVar.f2110c;
            }
            iVar2.f2341a.f2346e.mo2255a(parcelable, oVar);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.mNextCandidateRequestIndex = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (!(intArray == null || stringArray == null || intArray.length != stringArray.length)) {
                    this.mPendingFragmentActivityResults = new C0801o<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.mPendingFragmentActivityResults.mo2595b(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.mPendingFragmentActivityResults == null) {
            this.mPendingFragmentActivityResults = new C0801o<>();
            this.mNextCandidateRequestIndex = 0;
        }
        this.mFragments.f2341a.f2346e.mo2283m();
    }

    /* access modifiers changed from: protected */
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.mFragments.f2341a.f2346e.mo2270b(menu);
        }
        super.onPanelClosed(i, menu);
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i);
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        C0652i iVar = this.mFragments;
        return onCreatePanelMenu | iVar.f2341a.f2346e.mo2263a(menu, getMenuInflater());
    }

    private static boolean markState(C0654k kVar, C0178b bVar) {
        boolean z = false;
        for (Fragment fragment : kVar.mo2238f()) {
            if (fragment != null) {
                if (fragment.getLifecycle().mo323a().isAtLeast(C0178b.STARTED)) {
                    fragment.mLifecycleRegistry.mo333a(bVar);
                    z = true;
                }
                C0654k peekChildFragmentManager = fragment.peekChildFragmentManager();
                if (peekChildFragmentManager != null) {
                    z |= markState(peekChildFragmentManager, bVar);
                }
            }
        }
        return z;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mFragments.f2341a.f2346e.mo2264a(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.mFragments.f2341a.f2346e.mo2272b(menuItem);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, null);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        if (dispatchFragmentsOnCreateView == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return dispatchFragmentsOnCreateView;
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        return onPrepareOptionsPanel(view, menu) | this.mFragments.f2341a.f2346e.mo2262a(menu);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.mo2219b();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String str = (String) this.mPendingFragmentActivityResults.mo2591a(i4);
            this.mPendingFragmentActivityResults.mo2594b(i4);
            if (str != null) {
                Fragment a = this.mFragments.mo2217a(str);
                if (a != null) {
                    a.onActivityResult(i & 65535, i2, intent);
                }
                return;
            }
            return;
        }
        C0639b bVar = C0636b.f2302a;
        if (bVar == null || !bVar.mo2162a(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.mo2219b();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String str = (String) this.mPendingFragmentActivityResults.mo2591a(i3);
            this.mPendingFragmentActivityResults.mo2594b(i3);
            if (str != null) {
                Fragment a = this.mFragments.mo2217a(str);
                if (a != null) {
                    a.onRequestPermissionsResult(i & 65535, strArr, iArr);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void requestPermissionsFromFragment(Fragment fragment, String[] strArr, int i) {
        if (i == -1) {
            C0636b.m1718a(this, strArr, i);
            return;
        }
        checkForValidRequestCode(i);
        try {
            this.mRequestedPermissionsFromFragment = true;
            C0636b.m1718a(this, strArr, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535));
        } finally {
            this.mRequestedPermissionsFromFragment = false;
        }
    }

    /* access modifiers changed from: 0000 */
    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f2341a.f2346e.onCreateView(view, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        if (dispatchFragmentsOnCreateView == null) {
            return super.onCreateView(view, str, context, attributeSet);
        }
        return dispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        this.mStartedActivityFromFragment = true;
        if (i == -1) {
            try {
                C0636b.m1716a(this, intent, -1, bundle);
            } finally {
                this.mStartedActivityFromFragment = false;
            }
        } else {
            checkForValidRequestCode(i);
            C0636b.m1716a(this, intent, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535), bundle);
            this.mStartedActivityFromFragment = false;
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("  ");
        String sb2 = sb.toString();
        printWriter.print(sb2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            C0699x.m2021a(this).mo2084a(sb2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.mo2218a().mo2232a(str, fileDescriptor, printWriter, strArr);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws SendIntentException {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        int i5 = i;
        this.mStartedIntentSenderFromFragment = true;
        if (i5 == -1) {
            try {
                C0636b.m1717a(this, intentSender, i, intent, i2, i3, i4, bundle);
            } finally {
                this.mStartedIntentSenderFromFragment = false;
            }
        } else {
            checkForValidRequestCode(i);
            C0636b.m1717a(this, intentSender, ((allocateRequestIndex(fragment) + 1) << 16) + (i5 & 65535), intent, i2, i3, i4, bundle);
            this.mStartedIntentSenderFromFragment = false;
        }
    }
}
