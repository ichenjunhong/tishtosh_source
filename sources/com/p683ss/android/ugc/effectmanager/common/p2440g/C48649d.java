package com.p683ss.android.ugc.effectmanager.common.p2440g;

import android.accounts.NetworkErrorException;
import com.p683ss.android.ugc.effectmanager.common.C48622c;
import com.p683ss.android.ugc.effectmanager.common.p2437d.C48634a;
import com.p683ss.android.ugc.effectmanager.common.p2437d.C48635b;
import com.p683ss.android.ugc.effectmanager.common.p2437d.C48636c;
import com.p683ss.android.ugc.effectmanager.common.p2437d.C48637d;
import com.p683ss.android.ugc.effectmanager.common.p2437d.C48638e;
import java.io.IOException;
import org.json.JSONException;

/* renamed from: com.ss.android.ugc.effectmanager.common.g.d */
public final class C48649d {

    /* renamed from: a */
    public int f122279a;

    /* renamed from: b */
    public String f122280b;

    /* renamed from: c */
    public Exception f122281c;

    /* renamed from: d */
    private String f122282d;

    /* renamed from: e */
    private String f122283e;

    /* renamed from: f */
    private String f122284f;

    public final String toString() {
        if (this.f122281c != null) {
            StringBuilder sb = new StringBuilder("ExceptionResult{errorCode=");
            sb.append(this.f122279a);
            sb.append(", msg='");
            sb.append(this.f122280b);
            sb.append('\'');
            sb.append(", requestUrl='");
            sb.append(this.f122282d);
            sb.append('\'');
            sb.append(", selectedHost='");
            sb.append(this.f122283e);
            sb.append('\'');
            sb.append(", remoteIp='");
            sb.append(this.f122284f);
            sb.append('\'');
            sb.append(", exception=");
            sb.append(this.f122281c.getMessage());
            sb.append('}');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("ExceptionResult{errorCode=");
        sb2.append(this.f122279a);
        sb2.append(", msg='");
        sb2.append(this.f122280b);
        sb2.append(", requestUrl='");
        sb2.append(this.f122282d);
        sb2.append('\'');
        sb2.append(", selectedHost='");
        sb2.append(this.f122283e);
        sb2.append('\'');
        sb2.append(", remoteIp='");
        sb2.append(this.f122284f);
        sb2.append('\'');
        sb2.append('}');
        return sb2.toString();
    }

    public C48649d(Exception exc) {
        this(exc, null, null, null);
    }

    public C48649d(int i) {
        this.f122279a = -1;
        this.f122279a = i;
        this.f122280b = C48622c.m105226a(i);
        this.f122281c = null;
    }

    public C48649d(int i, Exception exc) {
        this.f122279a = -1;
        this.f122279a = -1;
        this.f122280b = C48622c.m105226a(-1);
        this.f122281c = exc;
    }

    /* renamed from: a */
    public final void mo96230a(String str, String str2, String str3) {
        this.f122282d = str;
        this.f122283e = str2;
        this.f122284f = str3;
    }

    private C48649d(Exception exc, String str, String str2, String str3) {
        this.f122279a = -1;
        this.f122282d = null;
        this.f122283e = null;
        this.f122284f = null;
        this.f122281c = exc;
        if (exc instanceof C48635b) {
            this.f122279a = ((C48635b) exc).getStatus_code();
            this.f122280b = exc.getMessage();
        } else if (exc instanceof C48636c) {
            this.f122279a = ((C48636c) exc).getStatusCode();
            this.f122280b = exc.getMessage();
        } else if (exc instanceof JSONException) {
            this.f122279a = 10008;
            this.f122280b = exc.getMessage();
        } else if (exc instanceof NetworkErrorException) {
            this.f122279a = 10002;
            this.f122280b = exc.getMessage();
        } else if (exc instanceof C48638e) {
            this.f122279a = 10015;
            this.f122280b = exc.getMessage();
        } else if (exc instanceof C48637d) {
            this.f122279a = 10013;
            this.f122280b = exc.getMessage();
        } else if (exc instanceof C48634a) {
            this.f122279a = 10010;
            this.f122280b = exc.getMessage();
        } else if (exc instanceof IOException) {
            this.f122279a = 10012;
            this.f122280b = exc.getMessage();
        } else if (exc != null) {
            if ("network unavailable".equals(exc.getMessage())) {
                this.f122279a = 10011;
            } else {
                this.f122279a = 10005;
            }
            this.f122280b = exc.getMessage();
        } else {
            this.f122279a = 1;
            this.f122280b = C48622c.m105226a(this.f122279a);
        }
    }
}
