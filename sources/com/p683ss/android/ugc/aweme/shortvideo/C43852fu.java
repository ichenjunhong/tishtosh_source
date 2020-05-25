package com.p683ss.android.ugc.aweme.shortvideo;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.C23453a;
import com.p683ss.android.ugc.aweme.base.api.C23460b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fu */
public final class C43852fu extends C23453a {
    @C17952c(mo34828a = "captionAppKey")

    /* renamed from: A */
    public String f111060A;
    @C17952c(mo34828a = "captionAuthorization")

    /* renamed from: B */
    public String f111061B;
    @C17952c(mo34828a = "userStoreRegion")

    /* renamed from: C */
    public String f111062C;
    @C17952c(mo34828a = "aiCutAuthorization")

    /* renamed from: D */
    public String f111063D;
    @C17952c(mo34828a = "aiCutAppKey")

    /* renamed from: E */
    public String f111064E;
    @C23460b
    @C17952c(mo34828a = "appKey")

    /* renamed from: a */
    public String f111065a;
    @C23460b
    @C17952c(mo34828a = "fileHostName")

    /* renamed from: b */
    public String f111066b;
    @C23460b
    @C17952c(mo34828a = "videoHostName")

    /* renamed from: c */
    public String f111067c;
    @C17952c(mo34828a = "sliceTimeout")

    /* renamed from: d */
    public int f111068d;
    @C17952c(mo34828a = "sliceRetryCount")

    /* renamed from: e */
    public int f111069e;
    @C17952c(mo34828a = "sliceSize")

    /* renamed from: f */
    public int f111070f;
    @C17952c(mo34828a = "fileRetryCount")

    /* renamed from: g */
    public int f111071g = 1;
    @C17952c(mo34828a = "maxFailTime")

    /* renamed from: h */
    public int f111072h;
    @C23460b
    @C17952c(mo34828a = "authorization")

    /* renamed from: i */
    public String f111073i;
    @C17952c(mo34828a = "enableHttps")

    /* renamed from: j */
    public int f111074j;
    @C17952c(mo34828a = "enableExternDNS")

    /* renamed from: k */
    public int f111075k;
    @C17952c(mo34828a = "aliveMaxFailTime")

    /* renamed from: l */
    public int f111076l = 6;
    @C17952c(mo34828a = "enableTTNetDNS")

    /* renamed from: m */
    public int f111077m;
    @C17952c(mo34828a = "enablePostMethod")

    /* renamed from: n */
    public int f111078n;
    @C17952c(mo34828a = "openTimeOut")

    /* renamed from: o */
    public int f111079o = 5000;
    @C17952c(mo34828a = "uploadRegion")

    /* renamed from: p */
    public String f111080p;
    @C17952c(mo34828a = "enableExternNet")

    /* renamed from: q */
    public int f111081q;
    @C17952c(mo34828a = "enableQuic")

    /* renamed from: r */
    public int f111082r;
    @C17952c(mo34828a = "enableMutitask")

    /* renamed from: s */
    public int f111083s;
    @C17952c(mo34828a = "ttnetConfigValue")

    /* renamed from: t */
    public int f111084t;
    @C17952c(mo34828a = "enable_tt_uploader_log_callback")

    /* renamed from: u */
    public boolean f111085u;
    @C17952c(mo34828a = "is_stream_upload_enable")

    /* renamed from: v */
    public int f111086v;
    @C17952c(mo34828a = "enable_client_network_judgement")

    /* renamed from: w */
    public boolean f111087w;
    @C17952c(mo34828a = "enable_tt_uploader_ev_state")

    /* renamed from: x */
    public boolean f111088x;
    @C17952c(mo34828a = "testSpeedAppKey")

    /* renamed from: y */
    public String f111089y;
    @C17952c(mo34828a = "testSpeedAuthorization")

    /* renamed from: z */
    public String f111090z;

    public final String toString() {
        StringBuilder sb = new StringBuilder("UploadVideoConfig{appKey='");
        sb.append(this.f111065a);
        sb.append('\'');
        sb.append(", fileHostName='");
        sb.append(this.f111066b);
        sb.append('\'');
        sb.append(", videoHostName='");
        sb.append(this.f111067c);
        sb.append('\'');
        sb.append(", sliceTimeout=");
        sb.append(this.f111068d);
        sb.append(", sliceRetryCount=");
        sb.append(this.f111069e);
        sb.append(", sliceSize=");
        sb.append(this.f111070f);
        sb.append(", fileRetryCount=");
        sb.append(this.f111071g);
        sb.append(", maxFailTime=");
        sb.append(this.f111072h);
        sb.append(", authorization='");
        sb.append(this.f111073i);
        sb.append('\'');
        sb.append(", enableHttps=");
        sb.append(this.f111074j);
        sb.append(", enableExternDNS=");
        sb.append(this.f111075k);
        sb.append(", aliveMaxFailTime=");
        sb.append(this.f111076l);
        sb.append(", enableTTNetDNS=");
        sb.append(this.f111077m);
        sb.append(", enablePostMethod=");
        sb.append(this.f111078n);
        sb.append(", openTimeOut=");
        sb.append(this.f111079o);
        sb.append(", uploadRegion='");
        sb.append(this.f111080p);
        sb.append('\'');
        sb.append(", enableExternNet=");
        sb.append(this.f111081q);
        sb.append(", enableQuic=");
        sb.append(this.f111082r);
        sb.append(", enableMutitask=");
        sb.append(this.f111083s);
        sb.append(", ttnetConfigValue=");
        sb.append(this.f111084t);
        sb.append(", enableTTUploaderLogCallback=");
        sb.append(this.f111085u);
        sb.append(", isStreamUploadEnable=");
        sb.append(this.f111086v);
        sb.append(", enableClientNetworkJudgement=");
        sb.append(this.f111087w);
        sb.append(", testSpeedAppKey='");
        sb.append(this.f111089y);
        sb.append('\'');
        sb.append(", testSpeedAuthorization='");
        sb.append(this.f111090z);
        sb.append('\'');
        sb.append(", captionAppKey='");
        sb.append(this.f111060A);
        sb.append('\'');
        sb.append(", captionAuthorization='");
        sb.append(this.f111061B);
        sb.append('\'');
        sb.append(", aiCutAuthorization='");
        sb.append(this.f111063D);
        sb.append('\'');
        sb.append(", aiCutAppKey='");
        sb.append(this.f111064E);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
