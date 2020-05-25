package com.google.p997a.p998a.p1009d.p1010a;

import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.google.p997a.p998a.p1009d.C14769i;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.net.ProxySelector;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.conn.ProxySelectorRoutePlanner;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

/* renamed from: com.google.a.a.d.a.a */
public final class C14757a extends C14769i {

    /* renamed from: b */
    public final HttpClient f38254b;

    public C14757a() {
        SSLSocketFactory socketFactory = SSLSocketFactory.getSocketFactory();
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, false);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, VideoCacheReadBuffersizeExperiment.DEFAULT);
        ConnManagerParams.setMaxTotalConnections(basicHttpParams, 200);
        ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new ConnPerRouteBean(20));
        ProxySelector proxySelector = ProxySelector.getDefault();
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme(WebKitApi.SCHEME_HTTP, PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme(WebKitApi.SCHEME_HTTPS, socketFactory, 443));
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
        defaultHttpClient.setHttpRequestRetryHandler(new DefaultHttpRequestRetryHandler(0, false));
        if (proxySelector != null) {
            defaultHttpClient.setRoutePlanner(new ProxySelectorRoutePlanner(schemeRegistry, proxySelector));
        }
        this(defaultHttpClient);
    }

    private C14757a(HttpClient httpClient) {
        this.f38254b = httpClient;
        HttpParams params = httpClient.getParams();
        HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
        params.setBooleanParameter("http.protocol.handle-redirects", false);
    }
}
