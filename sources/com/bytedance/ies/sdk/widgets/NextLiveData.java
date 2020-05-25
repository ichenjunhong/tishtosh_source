package com.bytedance.ies.sdk.widgets;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class NextLiveData<T> extends C0198r<T> {
    public int mLatestVersion = -1;
    private Map<C0199s, NextObserver> nextObserverMap = new HashMap();

    class NextObserver<T> implements C0199s<T> {
        private int initVersion;
        private boolean notifyWhenObserve;
        private C0199s<T> observer;

        public void onChanged(T t) {
            if (this.notifyWhenObserve || this.initVersion < NextLiveData.this.mLatestVersion) {
                this.observer.onChanged(t);
            }
        }

        NextObserver(int i, C0199s<T> sVar, boolean z) {
            this.initVersion = i;
            this.observer = sVar;
            this.notifyWhenObserve = z;
        }
    }

    public void observeForever(C0199s<T> sVar) {
        observeForever(sVar, false);
    }

    public void setValue(T t) {
        this.mLatestVersion++;
        super.setValue(t);
    }

    public void removeObserver(C0199s<T> sVar) {
        NextObserver nextObserver = (NextObserver) this.nextObserverMap.remove(sVar);
        if (nextObserver != null) {
            super.removeObserver(nextObserver);
            return;
        }
        super.removeObserver(sVar);
        if (sVar instanceof NextObserver) {
            C0199s sVar2 = null;
            Iterator it = this.nextObserverMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                if (sVar.equals(entry.getValue())) {
                    sVar2 = (C0199s) entry.getKey();
                    break;
                }
            }
            if (sVar2 != null) {
                this.nextObserverMap.remove(sVar2);
            }
        }
    }

    public void observe(C0184k kVar, C0199s<T> sVar) {
        observe(kVar, sVar, false);
    }

    public void observeForever(C0199s<T> sVar, boolean z) {
        if (!this.nextObserverMap.containsKey(sVar)) {
            NextObserver nextObserver = new NextObserver(this.mLatestVersion, sVar, z);
            this.nextObserverMap.put(sVar, nextObserver);
            super.observeForever(nextObserver);
        }
    }

    public void observe(C0184k kVar, C0199s<T> sVar, boolean z) {
        if (!this.nextObserverMap.containsKey(sVar)) {
            NextObserver nextObserver = new NextObserver(this.mLatestVersion, sVar, z);
            this.nextObserverMap.put(sVar, nextObserver);
            super.observe(kVar, nextObserver);
        }
    }
}
