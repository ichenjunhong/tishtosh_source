package com.bytedance.apm.agent.instrumentation.okhttp3;

import com.bytedance.apm.C8976c;
import com.bytedance.apm.agent.instrumentation.transaction.TransactionData;
import com.bytedance.apm.agent.instrumentation.transaction.TransactionState;
import com.bytedance.apm.agent.monitor.MonitorTool;
import java.io.IOException;
import okhttp3.C53498ab;
import okhttp3.C53500ac;
import okhttp3.C53504ad;
import okhttp3.C53668q;
import okhttp3.C53679x;
import org.json.JSONObject;

public class MonitorRecorder {
    public static void reportExceptionMonitor(TransactionState transactionState, Exception exc) {
    }

    public static void reportMonitorData(TransactionState transactionState, C53504ad adVar) {
        if (transactionState != null && adVar != null) {
            reportMonitorData(transactionState, "okhttp");
        }
    }

    public static void recordResponse(C53504ad adVar, TransactionState transactionState) {
        if (adVar != null && transactionState != null) {
            transactionState.setStatusCode(adVar.f132400c);
            if (adVar.f132404g != null) {
                transactionState.setBytesReceived(adVar.f132404g.contentLength());
            }
        }
    }

    public static void recordRequest(C53498ab abVar, TransactionState transactionState) {
        boolean z;
        if (abVar != null && transactionState != null) {
            transactionState.addAssistData("NetworkLib", "OkHttp3");
            transactionState.setUrl(abVar.f132378a.toString());
            transactionState.setMethod(abVar.f132379b);
            transactionState.setStartTime(System.currentTimeMillis());
            transactionState.setCarrier("");
            transactionState.setWanType("");
            C53500ac acVar = abVar.f132381d;
            if (acVar != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (acVar instanceof C53668q) {
                    transactionState.setBytesSent(((C53668q) acVar).contentLength());
                } else if (acVar instanceof C53679x) {
                    try {
                        transactionState.setBytesSent(acVar.contentLength());
                    } catch (IOException unused) {
                    }
                }
            }
        }
    }

    public static void reportMonitorData(TransactionState transactionState, String str) {
        long j;
        if (transactionState != null) {
            TransactionData end = transactionState.end();
            if (C8976c.m17751g()) {
                StringBuilder sb = new StringBuilder("auto plugin, reportMonitorData: ");
                sb.append(end.toString());
                String[] strArr = {sb.toString()};
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("net_consume_type", str);
                jSONObject.put("timing_totalSendBytes", end.getBytesSent());
                jSONObject.put("timing_totalReceivedBytes", end.getBytesReceived());
                jSONObject.put("instruct_error_code", end.getErrorCode());
                long totalTime = end.getTotalTime();
                if (transactionState.getStartTime() == 0) {
                    j = end.getRequestStart();
                } else {
                    j = transactionState.getStartTime();
                }
                MonitorTool.monitorSLA(totalTime, j, end.getUrl(), "", "", end.getStatusCode(), jSONObject);
            } catch (Exception unused) {
            }
        }
    }
}
