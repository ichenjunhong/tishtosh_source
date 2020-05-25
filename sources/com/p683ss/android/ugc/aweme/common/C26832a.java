package com.p683ss.android.ugc.aweme.common;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.common.a */
public abstract class C26832a<T> implements C9382a {
    public T mData;
    public C9381g mHandler = new C9381g(Looper.getMainLooper(), this);
    public boolean mIsLoading;
    public List<C26874f> mNotifyListeners;

    /* access modifiers changed from: protected */
    public abstract boolean checkParams(Object... objArr);

    public T getData() {
        return this.mData;
    }

    /* access modifiers changed from: protected */
    public void handleData(T t) {
        this.mData = t;
    }

    /* access modifiers changed from: protected */
    public void resetLoadingStatus(Message message) {
        this.mIsLoading = false;
    }

    public void clearNotifyListener(C26874f fVar) {
        if (!(fVar == null || this.mNotifyListeners == null)) {
            this.mNotifyListeners.remove(fVar);
        }
    }

    /* access modifiers changed from: protected */
    public boolean sendRequest(Object... objArr) {
        if (!checkParams(objArr)) {
            return false;
        }
        this.mIsLoading = true;
        return true;
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
        resetLoadingStatus(message);
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
