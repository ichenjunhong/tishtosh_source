package com.p683ss.ttvideoengine.net;

import android.os.Handler;
import android.os.Message;
import com.p683ss.ttvideoengine.utils.Error;
import com.p683ss.ttvideoengine.utils.TTHelper;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.net.BaseDNS */
public class BaseDNS {
    protected boolean mCancelled;
    protected Handler mHandler = new MyHandler(this);
    protected String mHostname;
    protected DNSCompletionListener mListener;
    protected TTVNetClient mNetClient;

    /* renamed from: com.ss.ttvideoengine.net.BaseDNS$MyHandler */
    static class MyHandler extends Handler {
        private final WeakReference<BaseDNS> mDNSRef;

        public MyHandler(BaseDNS baseDNS) {
            super(TTHelper.getLooper());
            this.mDNSRef = new WeakReference<>(baseDNS);
        }

        public void handleMessage(Message message) {
            BaseDNS baseDNS = (BaseDNS) this.mDNSRef.get();
            if (baseDNS != null) {
                DNSCompletionListener dNSCompletionListener = baseDNS.mListener;
                if (dNSCompletionListener != null && !baseDNS.mCancelled) {
                    switch (message.what) {
                        case 0:
                            dNSCompletionListener.onCancelled();
                            return;
                        case 1:
                            baseDNS.close();
                            dNSCompletionListener.onRetry((Error) message.obj);
                            return;
                        case 2:
                            baseDNS.close();
                            dNSCompletionListener.onCompletion(null, (Error) message.obj);
                            return;
                        case 3:
                            baseDNS.close();
                            dNSCompletionListener.onCompletion((JSONObject) message.obj, null);
                            break;
                    }
                }
            }
        }
    }

    public void cancel() {
    }

    public void close() {
    }

    public void start() {
    }

    /* access modifiers changed from: protected */
    public void notifyCancelled() {
        this.mHandler.sendEmptyMessage(0);
    }

    public void setCompletionListener(DNSCompletionListener dNSCompletionListener) {
        this.mListener = dNSCompletionListener;
    }

    public BaseDNS(String str) {
        this.mHostname = str;
    }

    /* access modifiers changed from: protected */
    public void notifyError(Error error) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(2, error));
    }

    /* access modifiers changed from: protected */
    public void notifyRetry(Error error) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1, error));
    }

    /* access modifiers changed from: protected */
    public void notifySuccess(JSONObject jSONObject) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(3, jSONObject));
    }

    public BaseDNS(String str, TTVNetClient tTVNetClient) {
        this.mHostname = str;
        if (tTVNetClient == null) {
            tTVNetClient = new TTHTTPNetwork();
        }
        this.mNetClient = tTVNetClient;
    }
}
