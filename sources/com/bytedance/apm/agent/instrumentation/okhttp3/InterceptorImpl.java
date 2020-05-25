package com.bytedance.apm.agent.instrumentation.okhttp3;

import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.transaction.TransactionState;
import java.io.IOException;
import okhttp3.C53498ab;
import okhttp3.C53504ad;
import okhttp3.C53506ae;
import okhttp3.C53676u;
import okhttp3.C53676u.C53677a;
import okhttp3.C53678w;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

public class InterceptorImpl implements C53676u {

    class ResponseBodyWrapper extends C53506ae {
        private BufferedSource bufferedSource;
        private final C53504ad response;
        private final C53506ae responseBody;
        public long totalBytesRead;
        private final TransactionState transactionState;

        public long contentLength() {
            return this.responseBody.contentLength();
        }

        public C53678w contentType() {
            return this.responseBody.contentType();
        }

        public void close() {
            this.responseBody.close();
            end();
        }

        public void end() {
            if (!this.transactionState.isComplete()) {
                this.transactionState.setBytesReceived(this.totalBytesRead);
                MonitorRecorder.reportMonitorData(this.transactionState, this.response);
            }
        }

        public BufferedSource source() {
            if (this.bufferedSource == null) {
                this.bufferedSource = Okio.buffer(source(this.responseBody.source()));
            }
            return this.bufferedSource;
        }

        private Source source(Source source) {
            return new ForwardingSource(source) {
                public void close() throws IOException {
                    super.close();
                    ResponseBodyWrapper.this.end();
                }

                public long read(Buffer buffer, long j) throws IOException {
                    long read = super.read(buffer, j);
                    if (read >= 0) {
                        ResponseBodyWrapper.this.totalBytesRead += read;
                    }
                    return read;
                }
            };
        }

        public ResponseBodyWrapper(C53504ad adVar, TransactionState transactionState2) {
            this.response = adVar;
            this.responseBody = adVar.f132404g;
            this.transactionState = transactionState2;
        }
    }

    public C53504ad intercept(C53677a aVar) throws IOException {
        C53498ab a = aVar.mo111416a();
        String a2 = a.mo111255a("User-Agent");
        if (a2 != null && a2.contains("tt")) {
            return aVar.mo111417a(a);
        }
        TransactionState transactionState = new TransactionState();
        MonitorRecorder.recordRequest(a, transactionState);
        try {
            C53504ad a3 = aVar.mo111417a(a);
            MonitorRecorder.recordResponse(a3, transactionState);
            if (transactionState.getReceivedBytes() >= 0 || TextUtils.isEmpty(a3.mo111276b("Transfer-Encoding"))) {
                MonitorRecorder.reportMonitorData(transactionState, a3);
                return a3;
            }
            transactionState.addAssistData("Transfer-Encoding", a3.mo111276b("Transfer-Encoding"));
            return a3.mo111277b().mo111287a((C53506ae) new ResponseBodyWrapper(a3, transactionState)).mo111291a();
        } catch (IOException e) {
            MonitorRecorder.reportExceptionMonitor(transactionState, e);
            throw e;
        }
    }
}
