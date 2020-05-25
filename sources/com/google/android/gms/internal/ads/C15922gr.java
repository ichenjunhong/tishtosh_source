package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* renamed from: com.google.android.gms.internal.ads.gr */
public abstract class C15922gr implements C16163pp {
    /* renamed from: a */
    public abstract C16135oo mo31076a(brw<?> brw, Map<String, String> map) throws IOException, C15560a;

    /* renamed from: b */
    public final HttpResponse mo31084b(brw<?> brw, Map<String, String> map) throws IOException, C15560a {
        C16135oo a = mo31076a(brw, map);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), a.f45385a, ""));
        ArrayList arrayList = new ArrayList();
        for (blz blz : a.mo31237a()) {
            arrayList.add(new BasicHeader(blz.f42900a, blz.f42901b));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[arrayList.size()]));
        InputStream inputStream = a.f45387c;
        if (inputStream != null) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(inputStream);
            basicHttpEntity.setContentLength((long) a.f45386b);
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }
}
