package android.support.p030v4.app;

import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.C0159aa;
import android.arch.lifecycle.C0160ab;
import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0185l;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.LiveData;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.p030v4.p038f.C0783e;
import android.support.p030v4.p038f.C0800n;
import android.support.p030v4.view.C1042g;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

/* renamed from: android.support.v4.app.Fragment */
public class Fragment implements C0160ab, C0184k, ComponentCallbacks, OnCreateContextMenuListener {
    static final Object USE_DEFAULT_TRANSITION = new Object();
    private static final C0800n<String, Class<?>> sClassMap = new C0800n<>();
    boolean mAdded;
    C0584a mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mCalled;
    C0658m mChildFragmentManager;
    C0676o mChildNonConfig;
    ViewGroup mContainer;
    int mContainerId;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    C0658m mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    C0653j mHost;
    boolean mInLayout;
    int mIndex = -1;
    View mInnerView;
    boolean mIsCreated;
    boolean mIsNewlyAdded;
    LayoutInflater mLayoutInflater;
    C0185l mLifecycleRegistry = new C0185l(this);
    boolean mMenuVisible = true;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    float mPostponedAlpha;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetaining;
    Bundle mSavedFragmentState;
    Boolean mSavedUserVisibleHint;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetIndex = -1;
    int mTargetRequestCode;
    boolean mUserVisibleHint = true;
    View mView;
    C0184k mViewLifecycleOwner;
    C0198r<C0184k> mViewLifecycleOwnerLiveData = new C0198r<>();
    C0185l mViewLifecycleRegistry;
    C0159aa mViewModelStore;
    String mWho;

    /* renamed from: android.support.v4.app.Fragment$SavedState */
    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a */
        final Bundle f2086a;

        public int describeContents() {
            return 0;
        }

        SavedState(Bundle bundle) {
            this.f2086a = bundle;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f2086a);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            this.f2086a = parcel.readBundle();
            if (classLoader != null && this.f2086a != null) {
                this.f2086a.setClassLoader(classLoader);
            }
        }
    }

    /* renamed from: android.support.v4.app.Fragment$a */
    static class C0584a {

        /* renamed from: a */
        View f2087a;

        /* renamed from: b */
        Animator f2088b;

        /* renamed from: c */
        int f2089c;

        /* renamed from: d */
        int f2090d;

        /* renamed from: e */
        int f2091e;

        /* renamed from: f */
        int f2092f;

        /* renamed from: g */
        Object f2093g;

        /* renamed from: h */
        Object f2094h = Fragment.USE_DEFAULT_TRANSITION;

        /* renamed from: i */
        Object f2095i;

        /* renamed from: j */
        Object f2096j = Fragment.USE_DEFAULT_TRANSITION;

        /* renamed from: k */
        Object f2097k;

        /* renamed from: l */
        Object f2098l = Fragment.USE_DEFAULT_TRANSITION;

        /* renamed from: m */
        Boolean f2099m;

        /* renamed from: n */
        Boolean f2100n;

        /* renamed from: o */
        C0631ah f2101o;

        /* renamed from: p */
        C0631ah f2102p;

        /* renamed from: q */
        boolean f2103q;

        /* renamed from: r */
        C0586c f2104r;

        /* renamed from: s */
        boolean f2105s;

        C0584a() {
        }
    }

    /* renamed from: android.support.v4.app.Fragment$b */
    public static class C0585b extends RuntimeException {
        public C0585b(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: android.support.v4.app.Fragment$c */
    interface C0586c {
        /* renamed from: a */
        void mo1975a();

        /* renamed from: b */
        void mo1976b();
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final C0654k getFragmentManager() {
        return this.mFragmentManager;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public C0176h getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public final String getTag() {
        return this.mTag;
    }

    public final Fragment getTargetFragment() {
        return this.mTarget;
    }

    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public LiveData<C0184k> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        return this.mMenuVisible;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    /* access modifiers changed from: 0000 */
    public C0654k peekChildFragmentManager() {
        return this.mChildFragmentManager;
    }

    public C0699x getLoaderManager() {
        return C0699x.m2021a(this);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: 0000 */
    public final boolean isInBackStack() {
        if (this.mBackStackNesting > 0) {
            return true;
        }
        return false;
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f2103q = true;
    }

    private C0584a ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C0584a();
        }
        return this.mAnimationInfo;
    }

    public final FragmentActivity getActivity() {
        if (this.mHost == null) {
            return null;
        }
        return (FragmentActivity) this.mHost.f2343b;
    }

    /* access modifiers changed from: 0000 */
    public View getAnimatingAway() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f2087a;
    }

    /* access modifiers changed from: 0000 */
    public Animator getAnimator() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f2088b;
    }

    public Context getContext() {
        if (this.mHost == null) {
            return null;
        }
        return this.mHost.f2344c;
    }

    public Object getEnterTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f2093g;
    }

    /* access modifiers changed from: 0000 */
    public C0631ah getEnterTransitionCallback() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f2101o;
    }

    public Object getExitTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f2095i;
    }

    /* access modifiers changed from: 0000 */
    public C0631ah getExitTransitionCallback() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f2102p;
    }

    public final Object getHost() {
        if (this.mHost == null) {
            return null;
        }
        return this.mHost.mo2037f();
    }

    public final LayoutInflater getLayoutInflater() {
        if (this.mLayoutInflater == null) {
            return performGetLayoutInflater(null);
        }
        return this.mLayoutInflater;
    }

    /* access modifiers changed from: 0000 */
    public int getNextAnim() {
        if (this.mAnimationInfo == null) {
            return 0;
        }
        return this.mAnimationInfo.f2090d;
    }

    /* access modifiers changed from: 0000 */
    public int getNextTransition() {
        if (this.mAnimationInfo == null) {
            return 0;
        }
        return this.mAnimationInfo.f2091e;
    }

    /* access modifiers changed from: 0000 */
    public int getNextTransitionStyle() {
        if (this.mAnimationInfo == null) {
            return 0;
        }
        return this.mAnimationInfo.f2092f;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    public Object getSharedElementEnterTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f2097k;
    }

    /* access modifiers changed from: 0000 */
    public int getStateAfterAnimating() {
        if (this.mAnimationInfo == null) {
            return 0;
        }
        return this.mAnimationInfo.f2089c;
    }

    public C0184k getViewLifecycleOwner() {
        if (this.mViewLifecycleOwner != null) {
            return this.mViewLifecycleOwner;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public final boolean isAdded() {
        if (this.mHost == null || !this.mAdded) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public boolean isHideReplaced() {
        if (this.mAnimationInfo == null) {
            return false;
        }
        return this.mAnimationInfo.f2105s;
    }

    /* access modifiers changed from: 0000 */
    public boolean isPostponed() {
        if (this.mAnimationInfo == null) {
            return false;
        }
        return this.mAnimationInfo.f2103q;
    }

    public final boolean isResumed() {
        if (this.mState >= 4) {
            return true;
        }
        return false;
    }

    public final boolean isStateSaved() {
        if (this.mFragmentManager == null) {
            return false;
        }
        return this.mFragmentManager.mo2240h();
    }

    /* access modifiers changed from: 0000 */
    public void noteStateNotSaved() {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2282l();
        }
    }

    /* access modifiers changed from: 0000 */
    public void performLowMemory() {
        onLowMemory();
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2292t();
        }
    }

    /* access modifiers changed from: 0000 */
    public void callStartTransitionListener() {
        C0586c cVar;
        if (this.mAnimationInfo == null) {
            cVar = null;
        } else {
            this.mAnimationInfo.f2103q = false;
            cVar = this.mAnimationInfo.f2104r;
            this.mAnimationInfo.f2104r = null;
        }
        if (cVar != null) {
            cVar.mo1975a();
        }
    }

    public boolean getAllowEnterTransitionOverlap() {
        if (this.mAnimationInfo == null || this.mAnimationInfo.f2100n == null) {
            return true;
        }
        return this.mAnimationInfo.f2100n.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        if (this.mAnimationInfo == null || this.mAnimationInfo.f2099m == null) {
            return true;
        }
        return this.mAnimationInfo.f2099m.booleanValue();
    }

    public Object getReenterTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        if (this.mAnimationInfo.f2096j == USE_DEFAULT_TRANSITION) {
            return getExitTransition();
        }
        return this.mAnimationInfo.f2096j;
    }

    public Object getReturnTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        if (this.mAnimationInfo.f2094h == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return this.mAnimationInfo.f2094h;
    }

    public Object getSharedElementReturnTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        if (this.mAnimationInfo.f2098l == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return this.mAnimationInfo.f2098l;
    }

    public C0159aa getViewModelStore() {
        if (getContext() != null) {
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new C0159aa();
            }
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* access modifiers changed from: 0000 */
    public void instantiateChildFragmentManager() {
        if (this.mHost != null) {
            this.mChildFragmentManager = new C0658m();
            this.mChildFragmentManager.mo2259a(this.mHost, (C0651h) new C0651h() {
                /* renamed from: a */
                public final boolean mo1969a() {
                    if (Fragment.this.mView != null) {
                        return true;
                    }
                    return false;
                }

                /* renamed from: a */
                public final View mo1968a(int i) {
                    if (Fragment.this.mView != null) {
                        return Fragment.this.mView.findViewById(i);
                    }
                    throw new IllegalStateException("Fragment does not have a view");
                }

                /* renamed from: a */
                public final Fragment mo1967a(Context context, String str, Bundle bundle) {
                    return Fragment.this.mHost.mo1967a(context, str, bundle);
                }
            }, this);
            return;
        }
        throw new IllegalStateException("Fragment has not been attached yet.");
    }

    public void onDestroy() {
        boolean z = true;
        this.mCalled = true;
        FragmentActivity activity = getActivity();
        if (activity == null || !activity.isChangingConfigurations()) {
            z = false;
        }
        if (this.mViewModelStore != null && !z) {
            this.mViewModelStore.mo301a();
        }
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to an activity.");
        throw new IllegalStateException(sb.toString());
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to a context.");
        throw new IllegalStateException(sb.toString());
    }

    public final C0654k requireFragmentManager() {
        C0654k fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            return fragmentManager;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not associated with a fragment manager.");
        throw new IllegalStateException(sb.toString());
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to a host.");
        throw new IllegalStateException(sb.toString());
    }

    public final C0654k getChildFragmentManager() {
        if (this.mChildFragmentManager == null) {
            instantiateChildFragmentManager();
            if (this.mState >= 4) {
                this.mChildFragmentManager.mo2288p();
            } else if (this.mState >= 3) {
                this.mChildFragmentManager.mo2285o();
            } else if (this.mState >= 2) {
                this.mChildFragmentManager.mo2284n();
            } else if (this.mState > 0) {
                this.mChildFragmentManager.mo2283m();
            }
        }
        return this.mChildFragmentManager;
    }

    /* access modifiers changed from: 0000 */
    public void initState() {
        this.mIndex = -1;
        this.mWho = null;
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = null;
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
        this.mRetaining = false;
    }

    public final boolean isVisible() {
        if (!isAdded() || isHidden() || this.mView == null || this.mView.getWindowToken() == null || this.mView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void performDestroy() {
        this.mLifecycleRegistry.mo332a(C0177a.ON_DESTROY);
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2291s();
        }
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            this.mChildFragmentManager = null;
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroy()");
        throw new C0633ai(sb.toString());
    }

    public void startPostponedEnterTransition() {
        if (this.mFragmentManager == null || this.mFragmentManager.f2370m == null) {
            ensureAnimationInfo().f2103q = false;
        } else if (Looper.myLooper() != this.mFragmentManager.f2370m.f2345d.getLooper()) {
            this.mFragmentManager.f2370m.f2345d.postAtFrontOfQueue(new Runnable() {
                public final void run() {
                    Fragment.this.callStartTransitionListener();
                }
            });
        } else {
            callStartTransitionListener();
        }
    }

    /* access modifiers changed from: 0000 */
    public void performDestroyView() {
        if (this.mView != null) {
            this.mViewLifecycleRegistry.mo332a(C0177a.ON_DESTROY);
        }
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2267b(1);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            C0699x.m2021a(this).mo2082a();
            this.mPerformedCreateView = false;
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroyView()");
        throw new C0633ai(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void performDetach() {
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onDetach()");
            throw new C0633ai(sb.toString());
        } else if (this.mChildFragmentManager == null) {
        } else {
            if (this.mRetaining) {
                this.mChildFragmentManager.mo2291s();
                this.mChildFragmentManager = null;
                return;
            }
            StringBuilder sb2 = new StringBuilder("Child FragmentManager of ");
            sb2.append(this);
            sb2.append(" was not  destroyed and this fragment is not retaining instance");
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public void performPause() {
        if (this.mView != null) {
            this.mViewLifecycleRegistry.mo332a(C0177a.ON_PAUSE);
        }
        this.mLifecycleRegistry.mo332a(C0177a.ON_PAUSE);
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2289q();
        }
        this.mState = 3;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onPause()");
            throw new C0633ai(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public void performResume() {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2282l();
            this.mChildFragmentManager.mo2280j();
        }
        this.mState = 4;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.mo2288p();
                this.mChildFragmentManager.mo2280j();
            }
            this.mLifecycleRegistry.mo332a(C0177a.ON_RESUME);
            if (this.mView != null) {
                this.mViewLifecycleRegistry.mo332a(C0177a.ON_RESUME);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onResume()");
        throw new C0633ai(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void performStart() {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2282l();
            this.mChildFragmentManager.mo2280j();
        }
        this.mState = 3;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.mo2285o();
            }
            this.mLifecycleRegistry.mo332a(C0177a.ON_START);
            if (this.mView != null) {
                this.mViewLifecycleRegistry.mo332a(C0177a.ON_START);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onStart()");
        throw new C0633ai(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void performStop() {
        if (this.mView != null) {
            this.mViewLifecycleRegistry.mo332a(C0177a.ON_STOP);
        }
        this.mLifecycleRegistry.mo332a(C0177a.ON_STOP);
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2290r();
        }
        this.mState = 2;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onStop()");
            throw new C0633ai(sb.toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C0783e.m2224a(this, sb);
        if (this.mIndex >= 0) {
            sb.append(" #");
            sb.append(this.mIndex);
        }
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" ");
            sb.append(this.mTag);
        }
        sb.append('}');
        return sb.toString();
    }

    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    /* access modifiers changed from: 0000 */
    public void setAnimatingAway(View view) {
        ensureAnimationInfo().f2087a = view;
    }

    /* access modifiers changed from: 0000 */
    public void setAnimator(Animator animator) {
        ensureAnimationInfo().f2088b = animator;
    }

    public void setEnterSharedElementCallback(C0631ah ahVar) {
        ensureAnimationInfo().f2101o = ahVar;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f2093g = obj;
    }

    public void setExitSharedElementCallback(C0631ah ahVar) {
        ensureAnimationInfo().f2102p = ahVar;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f2095i = obj;
    }

    /* access modifiers changed from: 0000 */
    public void setHideReplaced(boolean z) {
        ensureAnimationInfo().f2105s = z;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f2096j = obj;
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f2094h = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f2097k = obj;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f2098l = obj;
    }

    /* access modifiers changed from: 0000 */
    public void setStateAfterAnimating(int i) {
        ensureAnimationInfo().f2089c = i;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    /* access modifiers changed from: 0000 */
    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2254a(configuration);
        }
    }

    /* access modifiers changed from: 0000 */
    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        this.mLayoutInflater = onGetLayoutInflater(bundle);
        return this.mLayoutInflater;
    }

    /* access modifiers changed from: 0000 */
    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2261a(z);
        }
    }

    /* access modifiers changed from: 0000 */
    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2271b(z);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().f2100n = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().f2099m = Boolean.valueOf(z);
    }

    /* access modifiers changed from: 0000 */
    public void setNextAnim(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            ensureAnimationInfo().f2090d = i;
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        if (this.mHost != null) {
            return this.mHost.mo2031a(str);
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        if (this.mChildFragmentManager != null) {
            return this.mChildFragmentManager.mo2266b(str);
        }
        return null;
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        if (this.mHost != null) {
            LayoutInflater b = this.mHost.mo2032b();
            getChildFragmentManager();
            C1042g.m2976a(b, this.mChildFragmentManager);
            return b;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void onAttach(Context context) {
        Activity activity;
        this.mCalled = true;
        if (this.mHost == null) {
            activity = null;
        } else {
            activity = this.mHost.f2343b;
        }
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z = true;
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (this.mChildFragmentManager != null) {
            if (this.mChildFragmentManager.f2369l <= 0) {
                z = false;
            }
            if (!z) {
                this.mChildFragmentManager.mo2283m();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean performContextItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (onContextItemSelected(menuItem)) {
                return true;
            }
            if (this.mChildFragmentManager != null && this.mChildFragmentManager.mo2272b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.mo2270b(menu);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        if (this.mChildFragmentManager != null) {
            return z | this.mChildFragmentManager.mo2262a(menu);
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        if (this.mChildFragmentManager != null) {
            Parcelable k = this.mChildFragmentManager.mo2281k();
            if (k != null) {
                bundle.putParcelable("android:support:fragments", k);
            }
        }
    }

    public void setArguments(Bundle bundle) {
        if (this.mIndex < 0 || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active and state has been saved");
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.mo2034c();
            }
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mIndex < 0) {
            if (savedState == null || savedState.f2086a == null) {
                bundle = null;
            } else {
                bundle = savedState.f2086a;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo2034c();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void performActivityCreated(Bundle bundle) {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2282l();
        }
        this.mState = 2;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onActivityCreated()");
            throw new C0633ai(sb.toString());
        } else if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2284n();
        }
    }

    /* access modifiers changed from: 0000 */
    public void performCreate(Bundle bundle) {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2282l();
        }
        this.mState = 1;
        this.mCalled = false;
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.mo332a(C0177a.ON_CREATE);
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onCreate()");
        throw new C0633ai(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
                return true;
            }
            if (this.mChildFragmentManager != null && this.mChildFragmentManager.mo2264a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void restoreChildFragmentState(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                if (this.mChildFragmentManager == null) {
                    instantiateChildFragmentManager();
                }
                this.mChildFragmentManager.mo2255a(parcelable, this.mChildNonConfig);
                this.mChildNonConfig = null;
                this.mChildFragmentManager.mo2283m();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void restoreViewState(Bundle bundle) {
        if (this.mSavedViewState != null) {
            this.mInnerView.restoreHierarchyState(this.mSavedViewState);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onViewStateRestored()");
            throw new C0633ai(sb.toString());
        } else if (this.mView != null) {
            this.mViewLifecycleRegistry.mo332a(C0177a.ON_CREATE);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setOnStartEnterTransitionListener(C0586c cVar) {
        ensureAnimationInfo();
        if (cVar != this.mAnimationInfo.f2104r) {
            if (cVar == null || this.mAnimationInfo.f2104r == null) {
                if (this.mAnimationInfo.f2103q) {
                    this.mAnimationInfo.f2104r = cVar;
                }
                if (cVar != null) {
                    cVar.mo1976b();
                }
                return;
            }
            StringBuilder sb = new StringBuilder("Trying to set a replacement startPostponedEnterTransition on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
    }

    public void setUserVisibleHint(boolean z) {
        boolean z2;
        if (!this.mUserVisibleHint && z && this.mState < 3 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            this.mFragmentManager.mo2268b(this);
        }
        this.mUserVisibleHint = z;
        if (this.mState >= 3 || z) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    static boolean isSupportFragmentClass(Context context, String str) {
        try {
            Class cls = (Class) sClassMap.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                sClassMap.put(str, cls);
            }
            return Fragment.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    /* access modifiers changed from: 0000 */
    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        if (this.mChildFragmentManager != null) {
            return z | this.mChildFragmentManager.mo2263a(menu, menuInflater);
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public void setNextTransition(int i, int i2) {
        if (this.mAnimationInfo != null || i != 0 || i2 != 0) {
            ensureAnimationInfo();
            this.mAnimationInfo.f2091e = i;
            this.mAnimationInfo.f2092f = i2;
        }
    }

    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost != null) {
            this.mHost.mo2028a(this, strArr, i);
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public final void setIndex(int i, Fragment fragment) {
        this.mIndex = i;
        if (fragment != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(fragment.mWho);
            sb.append(":");
            sb.append(this.mIndex);
            this.mWho = sb.toString();
            return;
        }
        StringBuilder sb2 = new StringBuilder("android:fragment:");
        sb2.append(this.mIndex);
        this.mWho = sb2.toString();
    }

    public void startActivity(Intent intent, Bundle bundle) {
        if (this.mHost != null) {
            this.mHost.mo2026a(this, intent, -1, bundle);
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public void setTargetFragment(Fragment fragment, int i) {
        C0654k kVar;
        C0654k fragmentManager = getFragmentManager();
        if (fragment != null) {
            kVar = fragment.getFragmentManager();
        } else {
            kVar = null;
        }
        if (fragmentManager == null || kVar == null || fragmentManager == kVar) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (fragment2 != this) {
                    fragment2 = fragment2.getTargetFragment();
                } else {
                    StringBuilder sb = new StringBuilder("Setting ");
                    sb.append(fragment);
                    sb.append(" as the target of ");
                    sb.append(this);
                    sb.append(" would create a target cycle");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.mTarget = fragment;
            this.mTargetRequestCode = i;
            return;
        }
        StringBuilder sb2 = new StringBuilder("Fragment ");
        sb2.append(fragment);
        sb2.append(" must share the same FragmentManager to be set as a target fragment");
        throw new IllegalArgumentException(sb2.toString());
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        getActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        Activity activity;
        this.mCalled = true;
        if (this.mHost == null) {
            activity = null;
        } else {
            activity = this.mHost.f2343b;
        }
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    /* access modifiers changed from: 0000 */
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2282l();
        }
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C0184k() {
            public final C0176h getLifecycle() {
                if (Fragment.this.mViewLifecycleRegistry == null) {
                    Fragment.this.mViewLifecycleRegistry = new C0185l(Fragment.this.mViewLifecycleOwner);
                }
                return Fragment.this.mViewLifecycleRegistry;
            }
        };
        this.mViewLifecycleRegistry = null;
        this.mView = onCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null) {
            this.mViewLifecycleOwner.getLifecycle();
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
        } else if (this.mViewLifecycleRegistry == null) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (this.mHost != null) {
            this.mHost.mo2026a(this, intent, i, bundle);
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Class cls = (Class) sClassMap.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                sClassMap.put(str, cls);
            }
            Fragment fragment = (Fragment) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder("Unable to instantiate fragment ");
            sb.append(str);
            sb.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new C0585b(sb.toString(), e);
        } catch (InstantiationException e2) {
            StringBuilder sb2 = new StringBuilder("Unable to instantiate fragment ");
            sb2.append(str);
            sb2.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new C0585b(sb2.toString(), e2);
        } catch (IllegalAccessException e3) {
            StringBuilder sb3 = new StringBuilder("Unable to instantiate fragment ");
            sb3.append(str);
            sb3.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new C0585b(sb3.toString(), e3);
        } catch (NoSuchMethodException e4) {
            StringBuilder sb4 = new StringBuilder("Unable to instantiate fragment ");
            sb4.append(str);
            sb4.append(": could not find Fragment constructor");
            throw new C0585b(sb4.toString(), e4);
        } catch (InvocationTargetException e5) {
            StringBuilder sb5 = new StringBuilder("Unable to instantiate fragment ");
            sb5.append(str);
            sb5.append(": calling Fragment constructor caused an exception");
            throw new C0585b(sb5.toString(), e5);
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mIndex=");
        printWriter.print(this.mIndex);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mRetaining=");
        printWriter.print(this.mRetaining);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mTarget != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.mTarget);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        if (getNextAnim() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(getNextAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (this.mInnerView != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(getStateAfterAnimating());
        }
        if (getContext() != null) {
            C0699x.m2021a(this).mo2084a(str, fileDescriptor, printWriter, strArr);
        }
        if (this.mChildFragmentManager != null) {
            printWriter.print(str);
            StringBuilder sb = new StringBuilder("Child ");
            sb.append(this.mChildFragmentManager);
            sb.append(":");
            printWriter.println(sb.toString());
            C0658m mVar = this.mChildFragmentManager;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            mVar.mo2232a(sb2.toString(), fileDescriptor, printWriter, strArr);
        }
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        if (this.mHost != null) {
            this.mHost.mo2027a(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }
}
