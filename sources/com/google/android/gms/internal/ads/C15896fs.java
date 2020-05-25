package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.google.android.gms.internal.ads.fs */
final class C15896fs extends C15922gr {

    /* renamed from: a */
    private final C16163pp f44994a;

    C15896fs(C16163pp ppVar) {
        this.f44994a = ppVar;
    }

    /* renamed from: a */
    public final C16135oo mo31076a(brw<?> brw, Map<String, String> map) throws IOException, C15560a {
        try {
            HttpResponse b = this.f44994a.mo31084b(brw, map);
            int statusCode = b.getStatusLine().getStatusCode();
            Header[] allHeaders = b.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new blz(header.getName(), header.getValue()));
            }
            if (b.getEntity() == null) {
                return new C16135oo(statusCode, arrayList);
            }
            long contentLength = b.getEntity().getContentLength();
            if (((long) ((int) contentLength)) == contentLength) {
                return new C16135oo(statusCode, arrayList, (int) b.getEntity().getContentLength(), b.getEntity().getContent());
            }
            StringBuilder sb = new StringBuilder(40);
            sb.append("Response too large: ");
            sb.append(contentLength);
            throw new IOException(sb.toString());
        } catch (ConnectTimeoutException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}
