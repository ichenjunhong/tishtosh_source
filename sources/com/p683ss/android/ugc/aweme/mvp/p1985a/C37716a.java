package com.p683ss.android.ugc.aweme.mvp.p1985a;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.ugc.aweme.common.C26874f;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.mvp.a.a */
public abstract class C37716a<T> implements C9382a, C37718c {
    public T mData;
    protected C9381g mHandler = new C9381g(Looper.getMainLooper(), this);
    public boolean mIsLoading;
    protected List<C26874f> mNotifyListeners;
    public int mQueryType = 1;

    public void onDestroy() {
        clearAllNotifyListener();
    }

    public void clearAllNotifyListener() {
        if (this.mNotifyListeners != null) {
            this.mNotifyListeners.clear();
        }
    }

    /* access modifiers changed from: protected */
    public void handleData(T t) {
        this.mData = t;
    }

    public void clearNotifyListener(C26874f fVar) {
        if (!(fVar == null || this.mNotifyListeners == null)) {
            this.mNotifyListeners.remove(fVar);
        }
    }

    public void addNotifyListener(C26874f fVar) {
        if (fVar != null) {
            if (this.mNotifyListeners == null) {
                this.mNotifyListeners = new LinkedList();
            }
            this.mNotifyListeners.add(fVar);
            return;
        }
        throw new NullPointerException("INotifyListener could not be null");
    }

    public void handleMsg(Message message) {
        this.mIsLoading = false;
        if (message.obj instanceof Exception) {
            if (this.mNotifyListeners != null) {
                for (C26874f c_ : this.mNotifyListeners) {
                    c_.mo44840c_((Exception) message.obj);
                }
            }
            return;
        }
        handleData(message.obj);
        if (this.mNotifyListeners != null) {
            for (C26874f b : this.mNotifyListeners) {
                b.mo44838b();
            }
        }
    }
}
