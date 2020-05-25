package android.arch.lifecycle;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0176h.C0178b;
import android.arch.p006a.p007a.C0040a;
import android.arch.p006a.p008b.C0046b;
import android.arch.p006a.p008b.C0046b.C0051d;
import java.util.Iterator;
import java.util.Map.Entry;

public abstract class LiveData<T> {
    public static final Object NOT_SET = new Object();
    public int mActiveCount = 0;
    private volatile Object mData = NOT_SET;
    public final Object mDataLock = new Object();
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private C0046b<C0199s<T>, C0155b> mObservers = new C0046b<>();
    public volatile Object mPendingData = NOT_SET;
    private final Runnable mPostValueRunnable = new Runnable() {
        public final void run() {
            Object obj;
            synchronized (LiveData.this.mDataLock) {
                obj = LiveData.this.mPendingData;
                LiveData.this.mPendingData = LiveData.NOT_SET;
            }
            LiveData.this.setValue(obj);
        }
    };
    public int mVersion = -1;

    class LifecycleBoundObserver extends C0155b implements GenericLifecycleObserver {

        /* renamed from: a */
        final C0184k f393a;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo287b() {
            this.f393a.getLifecycle().mo325b(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo285a() {
            return this.f393a.getLifecycle().mo323a().isAtLeast(C0178b.STARTED);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo286a(C0184k kVar) {
            if (this.f393a == kVar) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo265a(C0184k kVar, C0177a aVar) {
            if (this.f393a.getLifecycle().mo323a() == C0178b.DESTROYED) {
                LiveData.this.removeObserver(this.f396c);
            } else {
                mo288a(mo285a());
            }
        }

        LifecycleBoundObserver(C0184k kVar, C0199s<T> sVar) {
            super(sVar);
            this.f393a = kVar;
        }
    }

    /* renamed from: android.arch.lifecycle.LiveData$a */
    class C0154a extends C0155b {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo285a() {
            return true;
        }

        C0154a(C0199s<T> sVar) {
            super(sVar);
        }
    }

    /* renamed from: android.arch.lifecycle.LiveData$b */
    abstract class C0155b {

        /* renamed from: c */
        final C0199s<T> f396c;

        /* renamed from: d */
        boolean f397d;

        /* renamed from: e */
        int f398e = -1;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo285a();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo286a(C0184k kVar) {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo287b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo288a(boolean z) {
            boolean z2;
            if (z != this.f397d) {
                this.f397d = z;
                int i = 1;
                if (LiveData.this.mActiveCount == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                LiveData liveData = LiveData.this;
                int i2 = liveData.mActiveCount;
                if (!this.f397d) {
                    i = -1;
                }
                liveData.mActiveCount = i2 + i;
                if (z2 && this.f397d) {
                    LiveData.this.onActive();
                }
                if (LiveData.this.mActiveCount == 0 && !this.f397d) {
                    LiveData.this.onInactive();
                }
                if (this.f397d) {
                    LiveData.this.dispatchingValue(this);
                }
            }
        }

        C0155b(C0199s<T> sVar) {
            this.f396c = sVar;
        }
    }

    /* access modifiers changed from: protected */
    public void onActive() {
    }

    /* access modifiers changed from: protected */
    public void onInactive() {
    }

    public boolean hasActiveObservers() {
        if (this.mActiveCount > 0) {
            return true;
        }
        return false;
    }

    public T getValue() {
        T t = this.mData;
        if (t != NOT_SET) {
            return t;
        }
        return null;
    }

    public boolean hasObservers() {
        if (this.mObservers.f116e > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void postValue(T t) {
        boolean z;
        synchronized (this.mDataLock) {
            if (this.mPendingData == NOT_SET) {
                z = true;
            } else {
                z = false;
            }
            this.mPendingData = t;
        }
        if (z) {
            C0040a.m62a().mo56b(this.mPostValueRunnable);
        }
    }

    public void removeObserver(C0199s<T> sVar) {
        assertMainThread("removeObserver");
        C0155b bVar = (C0155b) this.mObservers.mo63b(sVar);
        if (bVar != null) {
            bVar.mo287b();
            bVar.mo288a(false);
        }
    }

    /* access modifiers changed from: protected */
    public void setValue(T t) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t;
        dispatchingValue(null);
    }

    private static void assertMainThread(String str) {
        if (!C0040a.m62a().mo57c()) {
            StringBuilder sb = new StringBuilder("Cannot invoke ");
            sb.append(str);
            sb.append(" on a background thread");
            throw new IllegalStateException(sb.toString());
        }
    }

    private void considerNotify(C0155b bVar) {
        if (bVar.f397d) {
            if (!bVar.mo285a()) {
                bVar.mo288a(false);
            } else if (bVar.f398e < this.mVersion) {
                bVar.f398e = this.mVersion;
                bVar.f396c.onChanged(this.mData);
            }
        }
    }

    public void dispatchingValue(C0155b bVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (bVar == null) {
                C0051d a = this.mObservers.mo65a();
                while (a.hasNext()) {
                    considerNotify((C0155b) ((Entry) a.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            } else {
                considerNotify(bVar);
                bVar = null;
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public void observeForever(C0199s<T> sVar) {
        C0154a aVar = new C0154a(sVar);
        C0155b bVar = (C0155b) this.mObservers.mo62a(sVar, aVar);
        if (bVar != null && (bVar instanceof LifecycleBoundObserver)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (bVar == null) {
            aVar.mo288a(true);
        }
    }

    public void removeObservers(C0184k kVar) {
        assertMainThread("removeObservers");
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (((C0155b) entry.getValue()).mo286a(kVar)) {
                removeObserver((C0199s) entry.getKey());
            }
        }
    }

    public void observe(C0184k kVar, C0199s<T> sVar) {
        if (kVar.getLifecycle().mo323a() != C0178b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(kVar, sVar);
            C0155b bVar = (C0155b) this.mObservers.mo62a(sVar, lifecycleBoundObserver);
            if (bVar != null && !bVar.mo286a(kVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (bVar == null) {
                kVar.getLifecycle().mo324a(lifecycleBoundObserver);
            }
        }
    }
}
