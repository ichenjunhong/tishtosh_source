package com.bytedance.apm.agent.instrumentation.okhttp3;

import com.bytedance.apm.C8976c;
import com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord.DnsInfo;
import com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord.RecordResponse;
import com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord.SocketInfo;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.apm.p501q.C9193j;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.C53498ab;
import okhttp3.C53504ad;
import okhttp3.C53524e;
import okhttp3.C53532i;
import okhttp3.C53664p;
import okhttp3.C53670r;
import okhttp3.C53685z;
import org.json.JSONException;
import org.json.JSONObject;

public class OkHttpEventListener extends C53664p {
    private static String sIgnoreMonitorLabel;
    private boolean needToDeal = true;
    private OkHttpRecord okHttpRecord;
    public C53664p originListener;
    private long requestHeadersEndTime;
    private String url;

    private void record() {
        if (this.needToDeal) {
            this.okHttpRecord.timeRequest.duration = System.currentTimeMillis() - this.okHttpRecord.timeRequest.start_time;
            try {
                JSONObject jSONObject = new JSONObject(this.okHttpRecord.toString());
                jSONObject.put("net_consume_type", "okhttp");
                jSONObject.put("timing_totalSendBytes", this.okHttpRecord.recordResponse.sent_bytes);
                jSONObject.put("timing_totalReceivedBytes", this.okHttpRecord.recordResponse.received_bytes);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("request_log", jSONObject);
                MonitorTool.monitorSLA(this.okHttpRecord.timeRequest.duration, this.okHttpRecord.timeRequest.start_time, this.url, "", "", this.okHttpRecord.recordResponse.code, jSONObject2);
            } catch (JSONException unused) {
            }
        }
    }

    public static void setIgnoreMonitorLabel(String str) {
        sIgnoreMonitorLabel = str;
    }

    public OkHttpEventListener(C53664p pVar) {
        this.originListener = pVar;
        this.okHttpRecord = new OkHttpRecord();
    }

    public void callEnd(C53524e eVar) {
        super.callEnd(eVar);
        if (this.originListener != null) {
            this.originListener.callEnd(eVar);
        }
        record();
    }

    public void requestBodyStart(C53524e eVar) {
        super.requestBodyStart(eVar);
        if (this.originListener != null) {
            this.originListener.requestBodyStart(eVar);
        }
    }

    public void responseBodyStart(C53524e eVar) {
        super.responseBodyStart(eVar);
        if (this.originListener != null) {
            this.originListener.responseBodyStart(eVar);
        }
    }

    public void secureConnectStart(C53524e eVar) {
        super.secureConnectStart(eVar);
        if (this.originListener != null) {
            this.originListener.secureConnectStart(eVar);
        }
    }

    public void callStart(C53524e eVar) {
        super.callStart(eVar);
        if (this.originListener != null) {
            this.originListener.callStart(eVar);
        }
        this.okHttpRecord.timeRequest.start_time = System.currentTimeMillis();
    }

    public void requestHeadersStart(C53524e eVar) {
        super.requestHeadersStart(eVar);
        if (this.originListener != null) {
            this.originListener.requestHeadersStart(eVar);
        }
        this.okHttpRecord.timeRequest.request_sent_time = System.currentTimeMillis();
    }

    public void responseHeadersStart(C53524e eVar) {
        super.responseHeadersStart(eVar);
        this.okHttpRecord.timeDetailedDuration.ttfb = (int) (System.currentTimeMillis() - this.requestHeadersEndTime);
        if (this.originListener != null) {
            this.originListener.responseHeadersStart(eVar);
        }
        if (this.needToDeal) {
            this.okHttpRecord.timeRequest.response_recv_time = System.currentTimeMillis();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void dealSpecialHeader(okhttp3.C53504ad r12) {
        /*
            r11 = this;
            java.lang.String r0 = "server-timing"
            java.util.List r12 = r12.mo111274a(r0)
            java.util.Iterator r12 = r12.iterator()
        L_0x000a:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x014e
            java.lang.Object r0 = r12.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x001d
            return
        L_0x001d:
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord r1 = r11.okHttpRecord
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$HeaderRequest r1 = r1.headerRequest
            java.util.List<java.lang.String> r1 = r1.serverTimings
            r1.add(r0)
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x002f:
            if (r3 >= r1) goto L_0x000a
            r4 = r0[r3]
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x014a
            java.lang.String r5 = ";"
            boolean r5 = r4.contains(r5)
            if (r5 == 0) goto L_0x014a
            java.lang.String r5 = ";"
            java.lang.String[] r4 = r4.split(r5)
            int r5 = r4.length
            r6 = 2
            if (r5 < r6) goto L_0x014a
            r5 = r4[r2]
            java.lang.String r7 = " "
            java.lang.String r8 = ""
            java.lang.String r5 = r5.replace(r7, r8)
            r7 = 1
            r4 = r4[r7]
            java.lang.String r8 = " "
            java.lang.String r9 = ""
            java.lang.String r4 = r4.replace(r8, r9)
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            if (r8 != 0) goto L_0x014a
            r8 = -1
            int r9 = r5.hashCode()
            r10 = -1008619738(0xffffffffc3e1af26, float:-451.36835)
            if (r9 == r10) goto L_0x009e
            r10 = -138105374(0xfffffffff7c4ade2, float:-7.9782574E33)
            if (r9 == r10) goto L_0x0094
            r10 = 3108285(0x2f6dbd, float:4.355635E-39)
            if (r9 == r10) goto L_0x008a
            r10 = 100355670(0x5fb4e56, float:2.3632703E-35)
            if (r9 == r10) goto L_0x0080
            goto L_0x00a8
        L_0x0080:
            java.lang.String r9 = "inner"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x00a8
            r5 = 3
            goto L_0x00a9
        L_0x008a:
            java.lang.String r9 = "edge"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x00a8
            r5 = 1
            goto L_0x00a9
        L_0x0094:
            java.lang.String r9 = "cdn-cache"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x00a8
            r5 = 0
            goto L_0x00a9
        L_0x009e:
            java.lang.String r9 = "origin"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x00a8
            r5 = 2
            goto L_0x00a9
        L_0x00a8:
            r5 = -1
        L_0x00a9:
            switch(r5) {
                case 0: goto L_0x0121;
                case 1: goto L_0x00fb;
                case 2: goto L_0x00d5;
                case 3: goto L_0x00ae;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            goto L_0x014a
        L_0x00ae:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x014a
            java.lang.String r5 = "="
            java.lang.String[] r4 = r4.split(r5)
            int r5 = r4.length
            if (r5 < r6) goto L_0x014a
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord r5 = r11.okHttpRecord
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r5 = r5.timeDetailedDuration
            r6 = r4[r7]
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x00d0
            r4 = r4[r7]
            int r4 = java.lang.Integer.parseInt(r4)
            goto L_0x00d1
        L_0x00d0:
            r4 = 0
        L_0x00d1:
            r5.inner = r4
            goto L_0x014a
        L_0x00d5:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x014a
            java.lang.String r5 = "="
            java.lang.String[] r4 = r4.split(r5)
            int r5 = r4.length
            if (r5 < r6) goto L_0x014a
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord r5 = r11.okHttpRecord
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r5 = r5.timeDetailedDuration
            r6 = r4[r7]
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x00f7
            r4 = r4[r7]
            int r4 = java.lang.Integer.parseInt(r4)
            goto L_0x00f8
        L_0x00f7:
            r4 = 0
        L_0x00f8:
            r5.origin = r4
            goto L_0x014a
        L_0x00fb:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x014a
            java.lang.String r5 = "="
            java.lang.String[] r4 = r4.split(r5)
            int r5 = r4.length
            if (r5 < r6) goto L_0x014a
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord r5 = r11.okHttpRecord
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r5 = r5.timeDetailedDuration
            r6 = r4[r7]
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x011d
            r4 = r4[r7]
            int r4 = java.lang.Integer.parseInt(r4)
            goto L_0x011e
        L_0x011d:
            r4 = 0
        L_0x011e:
            r5.edge = r4
            goto L_0x014a
        L_0x0121:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x014a
            java.lang.String r5 = "="
            java.lang.String[] r4 = r4.split(r5)
            int r5 = r4.length
            if (r5 < r6) goto L_0x014a
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord r5 = r11.okHttpRecord
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r5 = r5.timeDetailedDuration
            r6 = r4[r7]
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0147
            r4 = r4[r7]
            java.lang.String r6 = "hit"
            boolean r4 = r4.equalsIgnoreCase(r6)
            if (r4 == 0) goto L_0x0147
            goto L_0x0148
        L_0x0147:
            r7 = 0
        L_0x0148:
            r5.cdn_hit_cache = r7
        L_0x014a:
            int r3 = r3 + 1
            goto L_0x002f
        L_0x014e:
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord r12 = r11.okHttpRecord
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r12 = r12.timeDetailedDuration
            int r12 = r12.ttfb
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord r0 = r11.okHttpRecord
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r0 = r0.timeDetailedDuration
            int r0 = r0.edge
            int r12 = r12 - r0
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord r0 = r11.okHttpRecord
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r0 = r0.timeDetailedDuration
            int r0 = r0.origin
            int r12 = r12 - r0
            if (r12 <= 0) goto L_0x016a
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord r0 = r11.okHttpRecord
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r0 = r0.timeDetailedDuration
            r0.rtt = r12
        L_0x016a:
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord r12 = r11.okHttpRecord
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r12 = r12.timeDetailedDuration
            int r12 = r12.origin
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord r0 = r11.okHttpRecord
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r0 = r0.timeDetailedDuration
            int r0 = r0.inner
            int r12 = r12 - r0
            if (r12 <= 0) goto L_0x017f
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord r0 = r11.okHttpRecord
            com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpRecord$DetailedDuration r0 = r0.timeDetailedDuration
            r0.origin = r12
        L_0x017f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpEventListener.dealSpecialHeader(okhttp3.ad):void");
    }

    public void callFailed(C53524e eVar, IOException iOException) {
        super.callFailed(eVar, iOException);
        if (this.originListener != null) {
            this.originListener.callFailed(eVar, iOException);
        }
        record();
    }

    public void connectionAcquired(C53524e eVar, C53532i iVar) {
        super.connectionAcquired(eVar, iVar);
        if (this.originListener != null) {
            this.originListener.connectionAcquired(eVar, iVar);
        }
    }

    public void connectionReleased(C53524e eVar, C53532i iVar) {
        super.connectionReleased(eVar, iVar);
        if (this.originListener != null) {
            this.originListener.connectionReleased(eVar, iVar);
        }
    }

    public void dnsStart(C53524e eVar, String str) {
        super.dnsStart(eVar, str);
        if (this.originListener != null) {
            this.originListener.dnsStart(eVar, str);
        }
    }

    public void secureConnectEnd(C53524e eVar, C53670r rVar) {
        super.secureConnectEnd(eVar, rVar);
        if (this.originListener != null) {
            this.originListener.secureConnectEnd(eVar, rVar);
        }
    }

    public void requestBodyEnd(C53524e eVar, long j) {
        super.requestBodyEnd(eVar, j);
        if (this.originListener != null) {
            this.originListener.requestBodyEnd(eVar, j);
        }
        if (this.needToDeal) {
            this.okHttpRecord.recordResponse.sent_bytes += j;
        }
    }

    public void responseBodyEnd(C53524e eVar, long j) {
        super.responseBodyEnd(eVar, j);
        if (this.originListener != null) {
            this.originListener.responseBodyEnd(eVar, j);
        }
        if (this.needToDeal) {
            this.okHttpRecord.recordResponse.received_bytes += j;
        }
    }

    public void requestHeadersEnd(C53524e eVar, C53498ab abVar) {
        this.requestHeadersEndTime = System.currentTimeMillis();
        super.requestHeadersEnd(eVar, abVar);
        if (this.originListener != null) {
            this.originListener.requestHeadersEnd(eVar, abVar);
        }
        String a = abVar.mo111255a("User-Agent");
        if (!(sIgnoreMonitorLabel == null || a == null || !a.contains(sIgnoreMonitorLabel))) {
            this.needToDeal = false;
        }
        this.okHttpRecord.recordResponse.sent_bytes += abVar.f132380c.mo111597c();
        this.url = abVar.f132378a.toString();
    }

    public void responseHeadersEnd(C53524e eVar, C53504ad adVar) {
        super.responseHeadersEnd(eVar, adVar);
        if (this.originListener != null) {
            this.originListener.responseHeadersEnd(eVar, adVar);
        }
        if (this.needToDeal) {
            this.okHttpRecord.recordResponse.code = adVar.f132400c;
            this.okHttpRecord.recordResponse.received_bytes += adVar.f132403f.mo111597c();
            this.okHttpRecord.recordResponse.network_accessed = C9193j.m18259b(C8976c.m17736a());
            this.okHttpRecord.headerRequest.x_tt_trace_id = adVar.mo111273a("x-tt-trace-id", "");
            this.okHttpRecord.headerRequest.x_tt_trace_host = adVar.mo111273a("x-tt-trace-host", "");
            this.okHttpRecord.headerRequest.x_tt_trace_tag = adVar.mo111273a("x-tt-trace-tag", "");
            this.okHttpRecord.headerRequest.x_tt_content_encoding = adVar.mo111273a("x-tt-content-encoding", "");
            try {
                dealSpecialHeader(adVar);
            } catch (Exception unused) {
            }
        }
    }

    public void connectStart(C53524e eVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(eVar, inetSocketAddress, proxy);
        if (this.originListener != null) {
            this.originListener.connectStart(eVar, inetSocketAddress, proxy);
        }
    }

    public void dnsEnd(C53524e eVar, String str, List<InetAddress> list) {
        super.dnsEnd(eVar, str, list);
        if (this.originListener != null) {
            this.originListener.dnsEnd(eVar, str, list);
        }
        if (list != null && list.size() > 0) {
            for (InetAddress inetAddress : list) {
                DnsInfo dnsInfo = new DnsInfo();
                dnsInfo.address = inetAddress.getHostAddress();
                this.okHttpRecord.addressList.add(dnsInfo);
            }
        }
    }

    public void connectEnd(C53524e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, C53685z zVar) {
        boolean z;
        super.connectEnd(eVar, inetSocketAddress, proxy, zVar);
        if (this.originListener != null) {
            this.originListener.connectEnd(eVar, inetSocketAddress, proxy, zVar);
        }
        RecordResponse recordResponse = this.okHttpRecord.recordResponse;
        if (proxy.address() != null) {
            z = true;
        } else {
            z = false;
        }
        recordResponse.via_Proxy = z;
        if (inetSocketAddress != null && inetSocketAddress.getAddress() != null) {
            SocketInfo socketInfo = this.okHttpRecord.socketInfo;
            StringBuilder sb = new StringBuilder();
            sb.append(inetSocketAddress.getAddress().getHostAddress());
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
            socketInfo.remote = sb.toString();
        }
    }

    public void connectFailed(C53524e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, C53685z zVar, IOException iOException) {
        super.connectFailed(eVar, inetSocketAddress, proxy, zVar, iOException);
        if (this.originListener != null) {
            this.originListener.connectFailed(eVar, inetSocketAddress, proxy, zVar, iOException);
        }
    }
}
