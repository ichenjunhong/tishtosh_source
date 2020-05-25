package com.p683ss.android.common.util;

import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.Toast;
import com.bytedance.common.utility.C9423k;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.common.utility.p523c.C9393e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.util.EventsSender */
public class EventsSender implements C9382a, Runnable {
    private static NotificationManager mNotifyMgr;
    private static int notifyId;
    private static EventsSender sEventsSender;
    private Handler handler = new C9381g(Looper.getMainLooper(), this);
    private String mAppId = "";
    private final List<String> mEventBlackList = new ArrayList();
    private BlockingQueue<JSONObject> mEventQueue = new LinkedBlockingQueue();
    private String mHost;
    private boolean mIsFilterDemand = true;
    private boolean mSenderEnable;
    private C9393e mThreadPlus;
    private boolean mVerifySendEnable = false;
    private String mVerifyUrl;
    private Queue<String> msgQueue = new LinkedList();
    long nextTime;
    private Context sApplicationContext;
    private String sDemandId;
    private String sDemandName;
    private List<String> sDemandV1Events;
    private List<String> sDemandV3Events;
    private String sUserName;
    private Toast toast;

    private boolean isVerifySendEnable() {
        return this.mVerifySendEnable;
    }

    public boolean isSenderEnable() {
        return this.mSenderEnable;
    }

    public static EventsSender inst() {
        if (sEventsSender == null) {
            synchronized (EventsSender.class) {
                if (sEventsSender == null) {
                    sEventsSender = new EventsSender();
                }
            }
        }
        return sEventsSender;
    }

    private EventsSender() {
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:45:0x0000, LOOP_START, SYNTHETIC, Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
        L_0x0000:
            boolean r0 = java.lang.Thread.interrupted()     // Catch:{ Exception -> 0x00dd }
            if (r0 != 0) goto L_0x00dc
            boolean r0 = r4.mSenderEnable     // Catch:{ Exception -> 0x00dd }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = r4.mHost     // Catch:{ Exception -> 0x00dd }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00dd }
            if (r0 != 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            boolean r3 = r4.mVerifySendEnable     // Catch:{ Exception -> 0x00dd }
            if (r3 == 0) goto L_0x0024
            java.lang.String r3 = r4.mVerifyUrl     // Catch:{ Exception -> 0x00dd }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x00dd }
            if (r3 != 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            if (r0 != 0) goto L_0x0029
            if (r1 == 0) goto L_0x00dc
        L_0x0029:
            java.util.concurrent.BlockingQueue<org.json.JSONObject> r2 = r4.mEventQueue     // Catch:{ Exception -> 0x00dd }
            java.lang.Object r2 = r2.take()     // Catch:{ Exception -> 0x00dd }
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch:{ Exception -> 0x00dd }
            if (r2 == 0) goto L_0x0000
            if (r1 == 0) goto L_0x0038
            r4.verify(r2)     // Catch:{ Exception -> 0x00dd }
        L_0x0038:
            java.lang.String r1 = "__demandName__"
            boolean r1 = r2.has(r1)     // Catch:{ Exception -> 0x00dd }
            if (r1 == 0) goto L_0x0045
            java.lang.String r1 = "__demandName__"
            r2.remove(r1)     // Catch:{ Exception -> 0x00dd }
        L_0x0045:
            java.lang.String r1 = "__demandSendTime__"
            boolean r1 = r2.has(r1)     // Catch:{ Exception -> 0x00dd }
            if (r1 == 0) goto L_0x0052
            java.lang.String r1 = "__demandSendTime__"
            r2.remove(r1)     // Catch:{ Exception -> 0x00dd }
        L_0x0052:
            java.lang.String r1 = "__demandTestUserName__"
            boolean r1 = r2.has(r1)     // Catch:{ Exception -> 0x00dd }
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = "__demandTestUserName__"
            r2.remove(r1)     // Catch:{ Exception -> 0x00dd }
        L_0x005f:
            java.lang.String r1 = "__demandNotThisDemand__"
            boolean r1 = r2.has(r1)     // Catch:{ Exception -> 0x00dd }
            if (r1 == 0) goto L_0x006c
            java.lang.String r1 = "__demandNotThisDemand__"
            r2.remove(r1)     // Catch:{ Exception -> 0x00dd }
        L_0x006c:
            if (r0 == 0) goto L_0x0000
            java.lang.String r0 = r4.mHost     // Catch:{ Exception -> 0x0000 }
            if (r0 == 0) goto L_0x0098
            java.lang.String r0 = r4.mHost     // Catch:{ Exception -> 0x0000 }
            java.lang.String r1 = "http"
            boolean r0 = r0.startsWith(r1)     // Catch:{ Exception -> 0x0000 }
            if (r0 == 0) goto L_0x0098
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0000 }
            r0.<init>()     // Catch:{ Exception -> 0x0000 }
            java.lang.String r1 = r4.mHost     // Catch:{ Exception -> 0x0000 }
            r0.append(r1)     // Catch:{ Exception -> 0x0000 }
            java.lang.String r1 = "/"
            r0.append(r1)     // Catch:{ Exception -> 0x0000 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0000 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x0000 }
            android.net.Uri$Builder r0 = r0.buildUpon()     // Catch:{ Exception -> 0x0000 }
            goto L_0x00b5
        L_0x0098:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0000 }
            java.lang.String r1 = "https://"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0000 }
            java.lang.String r1 = r4.mHost     // Catch:{ Exception -> 0x0000 }
            r0.append(r1)     // Catch:{ Exception -> 0x0000 }
            java.lang.String r1 = "/"
            r0.append(r1)     // Catch:{ Exception -> 0x0000 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0000 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x0000 }
            android.net.Uri$Builder r0 = r0.buildUpon()     // Catch:{ Exception -> 0x0000 }
        L_0x00b5:
            java.lang.String r1 = "parameter"
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0000 }
            r0.appendQueryParameter(r1, r2)     // Catch:{ Exception -> 0x0000 }
            com.bytedance.common.utility.k r1 = com.bytedance.common.utility.C9423k.m18637a()     // Catch:{ Exception -> 0x0000 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0000 }
            java.lang.String r0 = r1.mo17060a(r0)     // Catch:{ Exception -> 0x0000 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0000 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0000 }
            java.lang.String r0 = "success"
            java.lang.String r2 = "data"
            java.lang.Object r1 = r1.opt(r2)     // Catch:{ Exception -> 0x0000 }
            r0.equals(r1)     // Catch:{ Exception -> 0x0000 }
            goto L_0x0000
        L_0x00dc:
            return
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.common.util.EventsSender.run():void");
    }

    private void setVerifySendEnable(boolean z) {
        this.mVerifySendEnable = z;
    }

    public void setAppId(String str) {
        this.mAppId = str;
    }

    public void setHost(String str) {
        this.mHost = str;
    }

    public void setVerifyUrl(String str) {
        this.mVerifyUrl = str;
    }

    public void interceptEvent(String str) {
        this.mEventBlackList.add(str);
    }

    public void toast(String str) {
        Message obtain = Message.obtain();
        obtain.what = 3;
        obtain.obj = str;
        this.handler.sendMessage(obtain);
    }

    public String recheckDemandIdAndGetDemandName(String str) {
        if (this.sDemandId == null || !this.sDemandId.equals(str)) {
            return null;
        }
        return this.sDemandName;
    }

    public void setApplicationContext(Context context) {
        if (context != null) {
            this.sApplicationContext = context.getApplicationContext();
            mNotifyMgr = (NotificationManager) this.sApplicationContext.getSystemService("notification");
        }
    }

    public synchronized void setSenderEnable(boolean z) {
        if (this.mSenderEnable != z) {
            this.mSenderEnable = z;
            if (!this.mSenderEnable || sEventsSender == null) {
                this.mThreadPlus = null;
                return;
            }
            this.mThreadPlus = new C9393e(sEventsSender, "EventSender", true);
            this.mThreadPlus.start();
        }
    }

    public void setVerifyEnable(boolean z) {
        this.handler.removeMessages(1);
        this.handler.removeMessages(2);
        this.msgQueue.clear();
        if (isSenderEnable()) {
            setVerifySendEnable(z);
        } else if (z) {
            setSenderEnable(true);
            setVerifySendEnable(true);
        } else {
            setVerifySendEnable(false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0042 A[Catch:{ Exception -> 0x0045 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void putEvent(org.json.JSONObject r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x004b
            boolean r0 = r3.mSenderEnable
            if (r0 != 0) goto L_0x000b
            boolean r0 = r3.mVerifySendEnable
            if (r0 != 0) goto L_0x000b
            goto L_0x004b
        L_0x000b:
            boolean r0 = r3.mVerifySendEnable
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r3.mVerifyUrl
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0045
            java.lang.String r0 = "__demandId__"
            java.lang.String r0 = r4.optString(r0)     // Catch:{ Exception -> 0x0045 }
            r1 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0045 }
            if (r0 == 0) goto L_0x003c
            boolean r0 = r3.mIsFilterDemand     // Catch:{ Exception -> 0x0045 }
            if (r0 != 0) goto L_0x0029
            goto L_0x003c
        L_0x0029:
            java.lang.String r0 = "category"
            java.lang.String r0 = r4.optString(r0)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r2 = "event_v3"
            boolean r0 = r2.equals(r0)     // Catch:{ Exception -> 0x0045 }
            if (r0 != 0) goto L_0x0040
            boolean r1 = r3.recheckEventAndFillDemandIdAndNameForV1Event(r4)     // Catch:{ Exception -> 0x0045 }
            goto L_0x0040
        L_0x003c:
            boolean r1 = r3.recheckEventAndFillDemandIdAndNameForV3Event(r4)     // Catch:{ Exception -> 0x0045 }
        L_0x0040:
            if (r1 != 0) goto L_0x0045
            r3.recheckEventAndFillDemandIdAndNameForOtherDemand(r4)     // Catch:{ Exception -> 0x0045 }
        L_0x0045:
            java.util.concurrent.BlockingQueue<org.json.JSONObject> r0 = r3.mEventQueue
            r0.add(r4)
            return
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.common.util.EventsSender.putEvent(org.json.JSONObject):void");
    }

    public boolean recheckEventAndFillDemandIdAndNameForOtherDemand(JSONObject jSONObject) {
        if (jSONObject == null || TextUtils.isEmpty(this.sUserName) || TextUtils.isEmpty(this.sDemandId) || TextUtils.isEmpty(this.sDemandName)) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(jSONObject.optString("tag"))) {
                return false;
            }
            String str = this.sDemandId;
            String str2 = this.sDemandName;
            jSONObject.put("__demandId__", str);
            jSONObject.put("__demandName__", str2);
            jSONObject.put("__demandSendTime__", System.currentTimeMillis());
            jSONObject.put("__demandNotThisDemand__", false);
            jSONObject.put("__demandTestUserName__", this.sUserName);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0055 A[Catch:{ Exception -> 0x0074 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean recheckEventAndFillDemandIdAndNameForV1Event(org.json.JSONObject r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L_0x0075
            java.lang.String r1 = r6.sDemandId
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0075
            java.lang.String r1 = r6.sDemandName
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0075
            java.lang.String r1 = r6.sUserName
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0075
            java.util.List<java.lang.String> r1 = r6.sDemandV1Events
            if (r1 == 0) goto L_0x0075
            java.util.List<java.lang.String> r1 = r6.sDemandV1Events
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0028
            goto L_0x0075
        L_0x0028:
            java.lang.String r1 = "tag"
            java.lang.String r1 = r7.optString(r1)     // Catch:{ Exception -> 0x0074 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0074 }
            if (r2 == 0) goto L_0x0035
            return r0
        L_0x0035:
            java.util.List<java.lang.String> r2 = r6.sDemandV1Events     // Catch:{ Exception -> 0x0074 }
            r3 = 1
            if (r2 == 0) goto L_0x0052
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0074 }
        L_0x003e:
            boolean r4 = r2.hasNext()     // Catch:{ Exception -> 0x0074 }
            if (r4 == 0) goto L_0x0052
            java.lang.Object r4 = r2.next()     // Catch:{ Exception -> 0x0074 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0074 }
            boolean r4 = r1.equals(r4)     // Catch:{ Exception -> 0x0074 }
            if (r4 == 0) goto L_0x003e
            r1 = 1
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            if (r1 == 0) goto L_0x0074
            java.lang.String r1 = r6.sDemandId     // Catch:{ Exception -> 0x0074 }
            java.lang.String r2 = r6.sDemandName     // Catch:{ Exception -> 0x0074 }
            java.lang.String r4 = "__demandId__"
            r7.put(r4, r1)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r1 = "__demandName__"
            r7.put(r1, r2)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r1 = "__demandSendTime__"
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0074 }
            r7.put(r1, r4)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r1 = "__demandTestUserName__"
            java.lang.String r2 = r6.sUserName     // Catch:{ Exception -> 0x0074 }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x0074 }
            return r3
        L_0x0074:
            return r0
        L_0x0075:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.common.util.EventsSender.recheckEventAndFillDemandIdAndNameForV1Event(org.json.JSONObject):boolean");
    }

    public boolean recheckEventAndFillDemandIdAndNameForV3Event(JSONObject jSONObject) {
        boolean z;
        if (jSONObject == null || TextUtils.isEmpty(this.sDemandId) || TextUtils.isEmpty(this.sDemandName) || TextUtils.isEmpty(this.sUserName) || this.sDemandV3Events == null || this.sDemandV3Events.isEmpty()) {
            return false;
        }
        try {
            String optString = jSONObject.optString("tag");
            if (TextUtils.isEmpty(optString)) {
                return false;
            }
            if (!this.sDemandId.equals(jSONObject.optString("__demandId__")) && this.mIsFilterDemand) {
                return false;
            }
            List<String> list = this.sDemandV3Events;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (optString.equals((String) it.next())) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                String str = this.sDemandId;
                String str2 = this.sDemandName;
                jSONObject.put("__demandId__", str);
                jSONObject.put("__demandName__", str2);
                jSONObject.put("__demandSendTime__", System.currentTimeMillis());
                jSONObject.put("__demandTestUserName__", this.sUserName);
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    private void verify(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
            String str = null;
            if (jSONObject2.has("tag")) {
                str = jSONObject2.optString("tag");
                jSONObject2.put("event", str);
                jSONObject2.remove("tag");
            }
            String str2 = str;
            String optString = jSONObject2.optString("__demandId__");
            String optString2 = jSONObject2.optString("__demandName__");
            if (optString2 != null) {
                jSONObject2.remove("__demandName__");
            }
            long optLong = jSONObject2.optLong("__demandSendTime__");
            if (jSONObject2.has("__demandSendTime__")) {
                jSONObject2.remove("__demandSendTime__");
            }
            boolean optBoolean = jSONObject2.optBoolean("__demandNotThisDemand__", true);
            if (jSONObject2.has("__demandNotThisDemand__")) {
                jSONObject2.remove("__demandNotThisDemand__");
            }
            String optString3 = jSONObject2.optString("__demandTestUserName__");
            if (jSONObject2.has("__demandTestUserName__")) {
                jSONObject2.remove("__demandTestUserName__");
            }
            if (!this.mEventBlackList.contains(str2) && !TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3)) {
                Builder buildUpon = Uri.parse(this.mVerifyUrl).buildUpon();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Pair("parameter", jSONObject2.toString()));
                arrayList.add(new Pair("demandID", optString));
                arrayList.add(new Pair("demandName", optString2));
                arrayList.add(new Pair("userName", optString3));
                StringBuilder sb = new StringBuilder();
                sb.append(optLong);
                arrayList.add(new Pair("clientSendTime", sb.toString()));
                if (!TextUtils.isEmpty(this.mAppId)) {
                    arrayList.add(new Pair("appID", this.mAppId));
                }
                if ("event_v3".equals(jSONObject2.optString("category"))) {
                    executeVerify(str2, buildUpon.toString(), arrayList, true, optBoolean);
                    return;
                }
                executeVerify(str2, buildUpon.toString(), arrayList, false, optBoolean);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r4v0, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r5v6, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: type inference failed for: r4v19, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r5v11, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: type inference failed for: r4v22 */
    /* JADX WARNING: type inference failed for: r4v23 */
    /* JADX WARNING: type inference failed for: r4v24 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v7
      assigns: []
      uses: []
      mth insns count: 131
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0129  */
    /* JADX WARNING: Unknown variable types count: 9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMsg(android.os.Message r8) {
        /*
            r7 = this;
            int r0 = r8.what
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L_0x002a
            int r0 = r8.what
            if (r0 != r1) goto L_0x000b
            goto L_0x002a
        L_0x000b:
            int r0 = r8.what
            r1 = 3
            if (r0 != r1) goto L_0x0141
            java.lang.Object r0 = r8.obj
            if (r0 == 0) goto L_0x0141
            java.lang.Object r0 = r8.obj
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L_0x0141
            java.lang.Object r8 = r8.obj
            java.lang.String r8 = (java.lang.String) r8
            java.util.Queue<java.lang.String> r0 = r7.msgQueue
            r0.offer(r8)
            android.os.Handler r8 = r7.handler
            r8.sendEmptyMessage(r2)
            goto L_0x0141
        L_0x002a:
            android.os.Handler r8 = r7.handler
            r8.removeMessages(r2)
            android.content.Context r8 = r7.sApplicationContext
            if (r8 == 0) goto L_0x0141
            boolean r8 = r7.mVerifySendEnable
            if (r8 == 0) goto L_0x0141
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r7.nextTime
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 < 0) goto L_0x0141
            java.util.Queue<java.lang.String> r8 = r7.msgQueue
            java.lang.Object r8 = r8.poll()
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x0140
            r0 = 0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x006e }
            r3.<init>(r8)     // Catch:{ Exception -> 0x006e }
            java.lang.String r8 = "toast"
            java.lang.String r8 = r3.optString(r8)     // Catch:{ Exception -> 0x006e }
            java.lang.String r4 = "raw"
            org.json.JSONObject r4 = r3.optJSONObject(r4)     // Catch:{ Exception -> 0x006c }
            java.lang.String r5 = "event"
            java.lang.String r5 = r3.optString(r5)     // Catch:{ Exception -> 0x006a }
            java.lang.String r0 = "v3"
            boolean r0 = r3.optBoolean(r0, r2)     // Catch:{ Exception -> 0x0071 }
            goto L_0x0072
        L_0x006a:
            r5 = r0
            goto L_0x0071
        L_0x006c:
            r4 = r0
            goto L_0x0070
        L_0x006e:
            r8 = r0
            r4 = r8
        L_0x0070:
            r5 = r4
        L_0x0071:
            r0 = 1
        L_0x0072:
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            if (r3 != 0) goto L_0x0081
            android.content.Context r3 = r7.sApplicationContext
            r6 = 0
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r8, r6)
            r7.toast = r3
        L_0x0081:
            android.app.NotificationManager r3 = mNotifyMgr
            if (r3 == 0) goto L_0x0121
            if (r4 == 0) goto L_0x0121
            if (r8 == 0) goto L_0x0121
            int r3 = notifyId
            int r3 = r3 + r2
            int r3 = r3 % 512
            notifyId = r3
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r6 = "ttmain_applog_verify_result_action"
            r3.setAction(r6)
            java.lang.String r6 = "android.intent.category.DEFAULT"
            r3.addCategory(r6)
            java.lang.String r6 = "json"
            java.lang.String r4 = r4.toString()
            r3.putExtra(r6, r4)
            java.lang.String r4 = "toast"
            r3.putExtra(r4, r8)
            java.lang.String r4 = "v3"
            r3.putExtra(r4, r0)
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r3.setFlags(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "event: "
            r4.<init>(r6)
            if (r5 != 0) goto L_0x00c2
            java.lang.String r5 = ""
        L_0x00c2:
            r4.append(r5)
            if (r0 == 0) goto L_0x00ca
            java.lang.String r0 = ""
            goto L_0x00cc
        L_0x00ca:
            java.lang.String r0 = "(1.0 埋点)"
        L_0x00cc:
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 16
            if (r4 < r5) goto L_0x0121
            android.content.Context r4 = r7.sApplicationContext
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            android.content.ComponentName r4 = r3.resolveActivity(r4)
            if (r4 == 0) goto L_0x0121
            android.content.Context r4 = r7.sApplicationContext
            int r5 = notifyId
            r6 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r3 = android.app.PendingIntent.getActivity(r4, r5, r3, r6)
            android.app.Notification$Builder r4 = new android.app.Notification$Builder
            android.content.Context r5 = r7.sApplicationContext
            r4.<init>(r5)
            android.app.Notification$Builder r0 = r4.setContentTitle(r0)
            android.app.Notification$BigTextStyle r4 = new android.app.Notification$BigTextStyle
            r4.<init>()
            android.app.Notification$BigTextStyle r8 = r4.bigText(r8)
            android.app.Notification$Builder r8 = r0.setStyle(r8)
            r0 = 17301651(0x1080093, float:2.4979667E-38)
            android.app.Notification$Builder r8 = r8.setSmallIcon(r0)
            android.app.Notification$Builder r8 = r8.setContentIntent(r3)
            android.app.Notification$Builder r8 = r8.setAutoCancel(r2)
            android.app.Notification r8 = r8.build()
            android.app.NotificationManager r0 = mNotifyMgr
            int r2 = notifyId
            r0.notify(r2, r8)
        L_0x0121:
            android.widget.Toast r8 = r7.toast
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 25
            if (r0 != r2) goto L_0x012f
            r0 = r8
            android.widget.Toast r0 = (android.widget.Toast) r0
            com.p683ss.android.ugc.aweme.utils.C47905fy.m103630a(r0)
        L_0x012f:
            r8.show()
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 2000(0x7d0, double:9.88E-321)
            long r2 = r2 + r4
            r7.nextTime = r2
            android.os.Handler r8 = r7.handler
            r8.sendEmptyMessageDelayed(r1, r4)
        L_0x0140:
            return
        L_0x0141:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.common.util.EventsSender.handleMsg(android.os.Message):void");
    }

    private void v1Event(String str, JSONObject jSONObject) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (1.0 埋点) ");
        msg(str, sb.toString(), jSONObject, false);
    }

    private void v3Event(String str, JSONObject jSONObject) throws Exception {
        JSONObject optJSONObject = jSONObject.optJSONObject("matchResult");
        if (optJSONObject != null) {
            if ("success".equals(optJSONObject.optString("check"))) {
                matchResultOk(str, optJSONObject, jSONObject, true);
            } else {
                matchResultNotOk(str, optJSONObject, jSONObject);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" : error");
            msg(str, sb.toString(), jSONObject, true);
        }
    }

    public boolean verify(String str, JSONObject jSONObject) {
        if (!this.mVerifySendEnable || this.sDemandId == null || this.sDemandName == null || this.sDemandV3Events == null || str == null || jSONObject == null) {
            return false;
        }
        if (!this.sDemandId.equals(jSONObject.optString("__demandId__"))) {
            return false;
        }
        for (String equals : this.sDemandV3Events) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private void matchResultNotOk(String str, JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        JSONArray optJSONArray = jSONObject.optJSONArray("check");
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" : 错误已发送至验证平台");
        arrayList.add(sb2.toString());
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.getString(i));
            }
        }
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            if (!"check".equals(str2) && !"platform".equals(str2) && !"warning".equals(str2)) {
                Object opt = jSONObject.opt(str2);
                if (opt != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str2);
                    sb3.append(" : ");
                    sb3.append(opt);
                    arrayList.add(sb3.toString());
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("warning");
        if (optJSONArray2 != null) {
            arrayList.add("warning:");
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                arrayList.add(optJSONArray2.getString(i2));
            }
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            sb.append((String) arrayList.get(i3));
            if (i3 != arrayList.size() - 1) {
                sb.append("\n");
            }
        }
        msg(str, sb.toString(), jSONObject2, true);
    }

    public void setTestVerifyDemandItem(String str, String str2, List<String> list, List<String> list2) {
        setTestVerifyDemandItem(str, str2, list, list2, true, null);
    }

    private void msg(String str, String str2, JSONObject jSONObject, boolean z) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("toast", str2);
            jSONObject2.put("raw", jSONObject);
            jSONObject2.put("event", str);
            jSONObject2.put("v3", z);
            toast(jSONObject2.toString());
        } catch (Exception unused) {
        }
    }

    private void matchResultOk(String str, JSONObject jSONObject, JSONObject jSONObject2, boolean z) throws Exception {
        StringBuilder sb = new StringBuilder();
        Iterator keys = jSONObject.keys();
        ArrayList arrayList = new ArrayList();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            if (!"check".equals(str2) && !"platform".equals(str2)) {
                Object opt = jSONObject.opt(str2);
                if (opt != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(" : ");
                    sb2.append(opt);
                    arrayList.add(sb2.toString());
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append((String) arrayList.get(i));
            if (i != arrayList.size() - 1) {
                sb.append("\n");
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(" : success \n");
        sb3.append(sb.toString());
        msg(str, sb3.toString(), jSONObject2, z);
    }

    private void executeVerify(String str, String str2, List<Pair<String, String>> list, boolean z, boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject(C9423k.m18637a().mo17061a(str2, list));
            if (z2) {
                if (z) {
                    v3Event(str, jSONObject);
                    return;
                }
                v1Event(str, jSONObject);
            }
        } catch (Exception unused) {
            if (z2) {
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" : error");
                    msg(str, sb.toString(), null, true);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("(1.0 埋点) : error");
                msg(str, sb2.toString(), null, false);
            }
        }
    }

    public void setTestVerifyDemandItem(String str, String str2, List<String> list, List<String> list2, boolean z, String str3) {
        this.sDemandId = str;
        this.sDemandName = str2;
        this.sDemandV3Events = list;
        this.sDemandV1Events = list2;
        this.mIsFilterDemand = z;
        this.sUserName = str3;
    }
}
