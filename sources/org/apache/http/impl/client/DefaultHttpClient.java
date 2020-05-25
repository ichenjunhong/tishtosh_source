package org.apache.http.impl.client;

import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import org.apache.http.HttpVersion;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.VersionInfo;

public class DefaultHttpClient extends AbstractHttpClient {
    public DefaultHttpClient() {
        super(null, null);
    }

    /* access modifiers changed from: protected */
    public HttpParams createHttpParams() {
        String str;
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(basicHttpParams, "ISO-8859-1");
        HttpProtocolParams.setUseExpectContinue(basicHttpParams, true);
        HttpConnectionParams.setTcpNoDelay(basicHttpParams, true);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, VideoCacheReadBuffersizeExperiment.DEFAULT);
        VersionInfo loadVersionInfo = VersionInfo.loadVersionInfo("org.apache.http.client", getClass().getClassLoader());
        if (loadVersionInfo != null) {
            str = loadVersionInfo.getRelease();
        } else {
            str = "UNAVAILABLE";
        }
        StringBuilder sb = new StringBuilder("Apache-HttpClient/");
        sb.append(str);
        sb.append(" (java 1.5)");
        HttpProtocolParams.setUserAgent(basicHttpParams, sb.toString());
        return basicHttpParams;
    }

    public DefaultHttpClient(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        super(clientConnectionManager, httpParams);
    }
}
