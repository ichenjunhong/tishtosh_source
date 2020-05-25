package com.p683ss.android.ugc.aweme.commercialize.model;

import com.p683ss.android.ugc.aweme.commercialize.utils.C26427bl;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.c */
public final class C26116c {

    /* renamed from: a */
    public long f68955a;

    /* renamed from: b */
    public String f68956b;

    /* renamed from: c */
    public long f68957c;

    /* renamed from: d */
    public String f68958d;

    /* renamed from: e */
    public String f68959e;

    /* renamed from: f */
    public String f68960f;

    /* renamed from: g */
    public String f68961g;

    /* renamed from: h */
    public String f68962h;

    /* renamed from: i */
    public String f68963i;

    /* renamed from: j */
    public String f68964j;

    /* renamed from: k */
    public int f68965k;

    /* renamed from: l */
    public Aweme f68966l;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.c$a */
    public static final class C26117a extends C26427bl<C26116c> {

        /* renamed from: com.ss.android.ugc.aweme.commercialize.model.c$a$a */
        static final class C26118a extends C52712l implements C52671b<C26116c, C52860x> {

            /* renamed from: a */
            final /* synthetic */ Aweme f68967a;

            C26118a(Aweme aweme) {
                this.f68967a = aweme;
                super(1);
            }

            /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
            /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
            /* JADX WARNING: Removed duplicated region for block: B:29:0x0064  */
            /* JADX WARNING: Removed duplicated region for block: B:35:0x0076  */
            /* JADX WARNING: Removed duplicated region for block: B:41:0x0088  */
            /* JADX WARNING: Removed duplicated region for block: B:47:0x009a  */
            /* JADX WARNING: Removed duplicated region for block: B:53:0x00ac  */
            /* JADX WARNING: Removed duplicated region for block: B:59:0x00be  */
            /* JADX WARNING: Removed duplicated region for block: B:64:0x00ce  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.Object invoke(java.lang.Object r6) {
                /*
                    r5 = this;
                    com.ss.android.ugc.aweme.commercialize.model.c r6 = (com.p683ss.android.ugc.aweme.commercialize.model.C26116c) r6
                    java.lang.String r0 = "$receiver"
                    p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f68967a
                    r6.f68966l = r0
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f68967a
                    r1 = 0
                    if (r0 == 0) goto L_0x0022
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
                    if (r0 == 0) goto L_0x0022
                    java.lang.Long r0 = r0.getCreativeId()
                    if (r0 == 0) goto L_0x0022
                    long r3 = r0.longValue()
                    goto L_0x0023
                L_0x0022:
                    r3 = r1
                L_0x0023:
                    r6.f68955a = r3
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f68967a
                    r3 = 0
                    if (r0 == 0) goto L_0x0035
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
                    if (r0 == 0) goto L_0x0035
                    java.lang.String r0 = r0.getLogExtra()
                    goto L_0x0036
                L_0x0035:
                    r0 = r3
                L_0x0036:
                    r6.f68956b = r0
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f68967a
                    if (r0 == 0) goto L_0x004c
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
                    if (r0 == 0) goto L_0x004c
                    java.lang.Long r0 = r0.getGroupId()
                    if (r0 == 0) goto L_0x004c
                    long r1 = r0.longValue()
                L_0x004c:
                    r6.f68957c = r1
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f68967a
                    if (r0 == 0) goto L_0x005d
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
                    if (r0 == 0) goto L_0x005d
                    java.lang.String r0 = r0.getOpenUrl()
                    goto L_0x005e
                L_0x005d:
                    r0 = r3
                L_0x005e:
                    r6.f68958d = r0
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f68967a
                    if (r0 == 0) goto L_0x006f
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
                    if (r0 == 0) goto L_0x006f
                    java.lang.String r0 = r0.getWebUrl()
                    goto L_0x0070
                L_0x006f:
                    r0 = r3
                L_0x0070:
                    r6.f68959e = r0
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f68967a
                    if (r0 == 0) goto L_0x0081
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
                    if (r0 == 0) goto L_0x0081
                    java.lang.String r0 = r0.getWebTitle()
                    goto L_0x0082
                L_0x0081:
                    r0 = r3
                L_0x0082:
                    r6.f68960f = r0
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f68967a
                    if (r0 == 0) goto L_0x0093
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
                    if (r0 == 0) goto L_0x0093
                    java.lang.String r0 = r0.getDownloadUrl()
                    goto L_0x0094
                L_0x0093:
                    r0 = r3
                L_0x0094:
                    r6.f68961g = r0
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f68967a
                    if (r0 == 0) goto L_0x00a5
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
                    if (r0 == 0) goto L_0x00a5
                    java.lang.String r0 = r0.getPackageName()
                    goto L_0x00a6
                L_0x00a5:
                    r0 = r3
                L_0x00a6:
                    r6.f68962h = r0
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f68967a
                    if (r0 == 0) goto L_0x00b7
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
                    if (r0 == 0) goto L_0x00b7
                    java.lang.String r0 = r0.getAppName()
                    goto L_0x00b8
                L_0x00b7:
                    r0 = r3
                L_0x00b8:
                    r6.f68963i = r0
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f68967a
                    if (r0 == 0) goto L_0x00c8
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
                    if (r0 == 0) goto L_0x00c8
                    java.lang.String r3 = r0.getType()
                L_0x00c8:
                    r6.f68964j = r3
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f68967a
                    if (r0 == 0) goto L_0x00d9
                    com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
                    if (r0 == 0) goto L_0x00d9
                    int r0 = r0.getSystemOrigin()
                    goto L_0x00da
                L_0x00d9:
                    r0 = 0
                L_0x00da:
                    r6.f68965k = r0
                    d.x r6 = p2628d.C52860x.f131107a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.model.C26116c.C26117a.C26118a.invoke(java.lang.Object):java.lang.Object");
            }
        }

        public C26117a() {
            C26116c cVar = r0;
            C26116c cVar2 = new C26116c(0, null, 0, null, null, null, null, null, null, null, 0, null, 4095, null);
            super(cVar);
        }

        /* renamed from: a */
        public final C26117a mo53633a(Aweme aweme) {
            C26117a aVar = this;
            aVar.mo54142a(new C26118a(aweme));
            return aVar;
        }
    }

    private C26116c(long j, String str, long j2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Aweme aweme) {
        this.f68955a = j;
        this.f68956b = str;
        this.f68957c = j2;
        this.f68958d = str2;
        this.f68959e = str3;
        this.f68960f = str4;
        this.f68961g = str5;
        this.f68962h = str6;
        this.f68963i = str7;
        this.f68964j = str8;
        this.f68965k = i;
        this.f68966l = aweme;
    }

    /* synthetic */ C26116c(long j, String str, long j2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Aweme aweme, int i2, C52707g gVar) {
        this(0, null, 0, null, null, null, null, null, null, null, 0, null);
    }
}
