package com.bytedance.ies.sdk.widgets;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public class DataCenter extends C0209x {
    private Map<String, Object> dataStore = new HashMap();
    private Handler handler = new Handler(Looper.getMainLooper());
    public C0184k lifecycleOwner;
    private Map<String, NextLiveData<KVData>> liveDataMap = new HashMap();
    private Thread mainThread;

    private boolean notMainThread() {
        if (this.mainThread == null) {
            this.mainThread = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != this.mainThread) {
            return true;
        }
        return false;
    }

    public void onCleared() {
        this.dataStore.clear();
        this.liveDataMap.clear();
        this.lifecycleOwner = null;
        this.handler.removeCallbacksAndMessages(null);
    }

    public boolean has(String str) {
        return this.dataStore.containsKey(str);
    }

    public <T> T get(String str) {
        T t = this.dataStore.get(str);
        if (t != null) {
            return t;
        }
        return null;
    }

    public DataCenter removeObserver(C0199s<KVData> sVar) {
        if (sVar == null) {
            return this;
        }
        for (NextLiveData removeObserver : this.liveDataMap.values()) {
            removeObserver.removeObserver(sVar);
        }
        return this;
    }

    private NextLiveData<KVData> getLiveData(String str) {
        NextLiveData<KVData> nextLiveData = (NextLiveData) this.liveDataMap.get(str);
        if (nextLiveData == null) {
            nextLiveData = new NextLiveData<>();
            if (this.dataStore.containsKey(str)) {
                nextLiveData.setValue(new KVData(str, this.dataStore.get(str)));
            }
            this.liveDataMap.put(str, nextLiveData);
        }
        return nextLiveData;
    }

    /* renamed from: put */
    public DataCenter lambda$put$0$DataCenter(Bundle bundle) {
        if (notMainThread()) {
            this.handler.post(new DataCenter$$Lambda$0(this, bundle));
            return this;
        } else if (bundle == null) {
            return this;
        } else {
            for (String str : bundle.keySet()) {
                if (str != null) {
                    lambda$put$1$DataCenter(str, bundle.get(str));
                }
            }
            return this;
        }
    }

    public DataCenter observe(String str, C0199s<KVData> sVar) {
        return observe(str, sVar, false);
    }

    public DataCenter observeForever(String str, C0199s<KVData> sVar) {
        return observeForever(str, sVar, false);
    }

    public static DataCenter create(C0210y yVar, C0184k kVar) {
        DataCenter dataCenter = (DataCenter) yVar.mo359a(DataCenter.class);
        dataCenter.lifecycleOwner = kVar;
        return dataCenter;
    }

    static <T> T get(Object obj, T t) {
        if (obj == null) {
            return null;
        }
        if (t == null || (((obj instanceof Number) && (t instanceof Number)) || t.getClass().isAssignableFrom(obj.getClass()))) {
            return obj;
        }
        return t;
    }

    public <T> T get(String str, T t) {
        if (!this.dataStore.containsKey(str)) {
            return t;
        }
        return get(this.dataStore.get(str), t);
    }

    public DataCenter removeObserver(String str, C0199s<KVData> sVar) {
        if (TextUtils.isEmpty(str) || sVar == null) {
            return this;
        }
        NextLiveData nextLiveData = (NextLiveData) this.liveDataMap.get(str);
        if (nextLiveData != null) {
            nextLiveData.removeObserver(sVar);
        }
        return this;
    }

    /* renamed from: put */
    public DataCenter lambda$put$1$DataCenter(String str, Object obj) {
        if (notMainThread()) {
            this.handler.post(new DataCenter$$Lambda$1(this, str, obj));
            return this;
        }
        this.dataStore.put(str, obj);
        C0198r rVar = (C0198r) this.liveDataMap.get(str);
        if (rVar != null) {
            rVar.setValue(new KVData(str, obj));
        }
        return this;
    }

    public DataCenter observe(String str, C0199s<KVData> sVar, boolean z) {
        if (TextUtils.isEmpty(str) || sVar == null) {
            return this;
        }
        getLiveData(str).observe(this.lifecycleOwner, sVar, z);
        return this;
    }

    public DataCenter observeForever(String str, C0199s<KVData> sVar, boolean z) {
        if (TextUtils.isEmpty(str) || sVar == null) {
            return this;
        }
        getLiveData(str).observeForever(sVar, z);
        return this;
    }
}
