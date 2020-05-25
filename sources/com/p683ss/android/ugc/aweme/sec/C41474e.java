package com.p683ss.android.ugc.aweme.sec;

import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p830a.C12688d;
import com.p683ss.android.common.util.NetworkUtils;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.C53504ad;
import okhttp3.C53506ae;
import okhttp3.C53678w;
import okio.BufferedSource;

/* renamed from: com.ss.android.ugc.aweme.sec.e */
public final class C41474e {
    /* renamed from: a */
    public static String m91290a(C12688d dVar) throws IOException {
        String str;
        TypedInput typedInput = dVar.f33350e;
        if (typedInput != null) {
            InputStream in = dVar.f33350e.mo9554in();
            C12685b a = dVar.mo23865a("Content-Type");
            try {
                C53678w a2 = C53678w.m114225a(typedInput.mimeType());
                String str2 = null;
                if (a2 != null) {
                    str = a2.toString();
                } else if (a == null) {
                    str = null;
                } else {
                    str = a.f33319b;
                }
                if (str == null) {
                    str = "";
                }
                boolean testIsSSBinary = NetworkUtils.testIsSSBinary(str);
                if (typedInput.length() > 2147483647L) {
                    return null;
                }
                if (a2 != null) {
                    if (a2.mo111640a() != null) {
                        str2 = a2.mo111640a().name();
                    }
                }
                if (str2 == null) {
                    str2 = "UTF-8";
                }
                String response2String = NetworkUtils.response2String(false, testIsSSBinary, 0, in, str2);
                in.reset();
                return response2String;
            } finally {
                in.reset();
            }
        } else {
            throw new IllegalArgumentException("HTTP body may not be null");
        }
    }

    /* renamed from: a */
    public static String m91291a(C53504ad adVar) throws IOException {
        boolean z;
        String str;
        C53506ae aeVar = adVar.f132404g;
        if (aeVar != null) {
            BufferedSource source = adVar.f132404g.source();
            source.request(Long.MAX_VALUE);
            InputStream inputStream = source.buffer().clone().inputStream();
            String b = adVar.mo111276b("Content-Encoding");
            if (b == null || !"gzip".equalsIgnoreCase(b)) {
                z = false;
            } else {
                z = true;
            }
            try {
                C53678w contentType = aeVar.contentType();
                if (contentType != null) {
                    str = contentType.toString();
                } else {
                    str = adVar.mo111276b("Content-Type");
                }
                if (str == null) {
                    str = "";
                }
                boolean testIsSSBinary = NetworkUtils.testIsSSBinary(str);
                long contentLength = aeVar.contentLength();
                String str2 = null;
                if (contentLength > 2147483647L) {
                    return null;
                }
                if (contentType != null) {
                    if (contentType.mo111640a() != null) {
                        str2 = contentType.mo111640a().name();
                    }
                }
                if (str2 == null) {
                    str2 = "UTF-8";
                }
                String response2String = NetworkUtils.response2String(z, testIsSSBinary, 0, inputStream, str2);
                NetworkUtils.safeClose(inputStream);
                return response2String;
            } finally {
                NetworkUtils.safeClose(inputStream);
            }
        } else {
            throw new IllegalArgumentException("HTTP body may not be null");
        }
    }
}
