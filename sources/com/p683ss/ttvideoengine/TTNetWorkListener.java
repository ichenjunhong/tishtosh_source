package com.p683ss.ttvideoengine;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18978d;
import com.p683ss.ttvideoengine.utils.EngineThreadPool;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.ttvideoengine.TTNetWorkListener */
public class TTNetWorkListener extends BroadcastReceiver {
    private static TTNetWorkListener mInst;
    private final String TAG = "TTNetWorkListener";
    private int mCurrentAccessType = -1;
    private int mInited = 0;
    private ArrayList<TTNetworkStateCallback> mListeners = new ArrayList<>();
    private Lock mLock = new ReentrantLock();

    /* renamed from: com.ss.ttvideoengine.TTNetWorkListener$TTNetworkChangeAction */
    static class TTNetworkChangeAction implements Runnable {
        private Context ctx;
        private TTNetWorkListener handler;

        public void run() {
            if (this.handler != null) {
                this.handler._handelNetworkChange(this.ctx);
            }
        }

        public TTNetworkChangeAction(TTNetWorkListener tTNetWorkListener, Context context) {
            this.ctx = context;
            this.handler = tTNetWorkListener;
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTNetWorkListener$_lancet */
    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo */
        static NetworkInfo m110638xea89a0b0(ConnectivityManager connectivityManager) {
            try {
                return connectivityManager.getActiveNetworkInfo();
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
                return C18978d.m46154a();
            }
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getNetworkInfo */
        static NetworkInfo m110639x228a3316(ConnectivityManager connectivityManager, int i) {
            try {
                return connectivityManager.getNetworkInfo(i);
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
                return C18978d.m46154a();
            }
        }
    }

    public synchronized int getCurrentAccessType() {
        return this.mCurrentAccessType;
    }

    private TTNetWorkListener() {
    }

    public static synchronized TTNetWorkListener getInstance(Context context) {
        TTNetWorkListener tTNetWorkListener;
        synchronized (TTNetWorkListener.class) {
            if (mInst == null) {
                TTNetWorkListener tTNetWorkListener2 = new TTNetWorkListener();
                mInst = tTNetWorkListener2;
                tTNetWorkListener2.init(context);
            }
            tTNetWorkListener = mInst;
        }
        return tTNetWorkListener;
    }

    public void startListen(TTNetworkStateCallback tTNetworkStateCallback) {
        if (tTNetworkStateCallback != null) {
            this.mLock.lock();
            this.mListeners.add(tTNetworkStateCallback);
            this.mLock.unlock();
        }
    }

    public void stopListen(TTNetworkStateCallback tTNetworkStateCallback) {
        if (tTNetworkStateCallback != null) {
            this.mLock.lock();
            this.mListeners.remove(tTNetworkStateCallback);
            this.mLock.unlock();
        }
    }

    private int getNetworkType(Context context) {
        if (context == null) {
            return -1;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return -1;
        }
        NetworkInfo com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo = _lancet.m110638xea89a0b0(connectivityManager);
        if (com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo == null || !com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo.isAvailable()) {
            return -1;
        }
        NetworkInfo com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getNetworkInfo = _lancet.m110639x228a3316(connectivityManager, 1);
        if (com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getNetworkInfo != null) {
            State state = com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getNetworkInfo.getState();
            if (state != null && (state == State.CONNECTED || state == State.CONNECTING)) {
                return 0;
            }
        }
        return 1;
    }

    private void init(Context context) {
        if (this.mInited == 0) {
            try {
                TTVideoEngineLog.m110644d("TTNetWorkListener", "enter start listen");
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(this, intentFilter);
                this.mCurrentAccessType = getNetworkType(context);
                this.mInited = 1;
            } catch (Exception unused) {
                TTVideoEngineLog.m110644d("TTNetWorkListener", "start listen network state failed");
            }
        }
    }

    public void _handelNetworkChange(Context context) {
        int networkType = getNetworkType(context);
        if (networkType != this.mCurrentAccessType) {
            this.mLock.lock();
            int i = this.mCurrentAccessType;
            this.mCurrentAccessType = networkType;
            StringBuilder sb = new StringBuilder("access changed, from: ");
            sb.append(i);
            sb.append(" to: ");
            sb.append(this.mCurrentAccessType);
            sb.append(" callback list size: ");
            sb.append(this.mListeners.size());
            TTVideoEngineLog.m110644d("TTNetWorkListener", sb.toString());
            Iterator it = this.mListeners.iterator();
            while (it.hasNext()) {
                ((TTNetworkStateCallback) it.next()).onAccessChanged(i, this.mCurrentAccessType);
            }
            this.mLock.unlock();
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (!isInitialStickyBroadcast() && "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            EngineThreadPool.addExecuteTask(new TTNetworkChangeAction(this, context));
        }
    }
}
