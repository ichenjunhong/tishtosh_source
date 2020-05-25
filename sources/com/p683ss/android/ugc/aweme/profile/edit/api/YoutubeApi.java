package com.p683ss.android.ugc.aweme.profile.edit.api;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.gson.p1076a.C17952c;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.p1140c.C18845b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi */
public final class YoutubeApi {

    /* renamed from: a */
    public static final YoutubeApi f101652a = new YoutubeApi();

    /* renamed from: b */
    private static final boolean f101653b = false;

    /* renamed from: c */
    private static final ServerApi f101654c;

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi$ServerApi */
    public interface ServerApi {
        @C53084o(mo110612a = "/aweme/v1/youtube/bind/")
        @C53074e
        C17832m<C39836a> link(@C53072c(mo110600a = "youtube_refresh_token") String str, @C53072c(mo110600a = "google_account") String str2, @C53072c(mo110600a = "youtube_channel_id") String str3, @C53072c(mo110600a = "youtube_channel_title") String str4, @C53072c(mo110600a = "user_agent") String str5, @C53072c(mo110600a = "token_type") String str6, @C53072c(mo110600a = "access_token") String str7);

        @C53075f(mo110603a = "/aweme/v1/youtube/unbind/")
        C17832m<C39836a> unlink();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi$a */
    public static final class C39836a {
        @C17952c(mo34828a = "status_code")

        /* renamed from: a */
        public final Integer f101655a;
        @C17952c(mo34828a = "error_msg")

        /* renamed from: b */
        public final String f101656b;
        @C17952c(mo34828a = "fail_reason")

        /* renamed from: c */
        public final C39837a f101657c;
        @C17952c(mo34828a = "bind_info")

        /* renamed from: d */
        public final C39838b f101658d;

        /* renamed from: com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi$a$a */
        public static final class C39837a {
            @C17952c(mo34828a = "code")

            /* renamed from: a */
            public final Integer f101659a;
            @C17952c(mo34828a = "message")

            /* renamed from: b */
            public final String f101660b;

            public C39837a() {
                this(null, null, 3, null);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
                if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f101660b, (java.lang.Object) r3.f101660b) != false) goto L_0x001f;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean equals(java.lang.Object r3) {
                /*
                    r2 = this;
                    if (r2 == r3) goto L_0x001f
                    boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.profile.edit.api.YoutubeApi.C39836a.C39837a
                    if (r0 == 0) goto L_0x001d
                    com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi$a$a r3 = (com.p683ss.android.ugc.aweme.profile.edit.api.YoutubeApi.C39836a.C39837a) r3
                    java.lang.Integer r0 = r2.f101659a
                    java.lang.Integer r1 = r3.f101659a
                    boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                    if (r0 == 0) goto L_0x001d
                    java.lang.String r0 = r2.f101660b
                    java.lang.String r3 = r3.f101660b
                    boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
                    if (r3 == 0) goto L_0x001d
                    goto L_0x001f
                L_0x001d:
                    r3 = 0
                    return r3
                L_0x001f:
                    r3 = 1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.edit.api.YoutubeApi.C39836a.C39837a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                Integer num = this.f101659a;
                int i = 0;
                int hashCode = (num != null ? num.hashCode() : 0) * 31;
                String str = this.f101660b;
                if (str != null) {
                    i = str.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("YouTubeErrorStruct(code=");
                sb.append(this.f101659a);
                sb.append(", message=");
                sb.append(this.f101660b);
                sb.append(")");
                return sb.toString();
            }

            private C39837a(Integer num, String str) {
                this.f101659a = num;
                this.f101660b = str;
            }

            private /* synthetic */ C39837a(Integer num, String str, int i, C52707g gVar) {
                this(Integer.valueOf(0), "");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi$a$b */
        public static final class C39838b {
            @C17952c(mo34828a = "google_account")

            /* renamed from: a */
            public final String f101661a;
            @C17952c(mo34828a = "channel_id")

            /* renamed from: b */
            public final String f101662b;
            @C17952c(mo34828a = "channel_title")

            /* renamed from: c */
            public final String f101663c;

            public C39838b() {
                this(null, null, null, 7, null);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
                if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f101663c, (java.lang.Object) r3.f101663c) != false) goto L_0x0029;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean equals(java.lang.Object r3) {
                /*
                    r2 = this;
                    if (r2 == r3) goto L_0x0029
                    boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.profile.edit.api.YoutubeApi.C39836a.C39838b
                    if (r0 == 0) goto L_0x0027
                    com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi$a$b r3 = (com.p683ss.android.ugc.aweme.profile.edit.api.YoutubeApi.C39836a.C39838b) r3
                    java.lang.String r0 = r2.f101661a
                    java.lang.String r1 = r3.f101661a
                    boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                    if (r0 == 0) goto L_0x0027
                    java.lang.String r0 = r2.f101662b
                    java.lang.String r1 = r3.f101662b
                    boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                    if (r0 == 0) goto L_0x0027
                    java.lang.String r0 = r2.f101663c
                    java.lang.String r3 = r3.f101663c
                    boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
                    if (r3 == 0) goto L_0x0027
                    goto L_0x0029
                L_0x0027:
                    r3 = 0
                    return r3
                L_0x0029:
                    r3 = 1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.edit.api.YoutubeApi.C39836a.C39838b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                String str = this.f101661a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.f101662b;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.f101663c;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                return hashCode2 + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("YoutubeChannelStruct(googleAccount=");
                sb.append(this.f101661a);
                sb.append(", channelId=");
                sb.append(this.f101662b);
                sb.append(", channelTitle=");
                sb.append(this.f101663c);
                sb.append(")");
                return sb.toString();
            }

            private C39838b(String str, String str2, String str3) {
                this.f101661a = str;
                this.f101662b = str2;
                this.f101663c = str3;
            }

            private /* synthetic */ C39838b(String str, String str2, String str3, int i, C52707g gVar) {
                this(null, null, null);
            }
        }

        public C39836a() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
            if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f101658d, (java.lang.Object) r3.f101658d) != false) goto L_0x0033;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0033
                boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.profile.edit.api.YoutubeApi.C39836a
                if (r0 == 0) goto L_0x0031
                com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi$a r3 = (com.p683ss.android.ugc.aweme.profile.edit.api.YoutubeApi.C39836a) r3
                java.lang.Integer r0 = r2.f101655a
                java.lang.Integer r1 = r3.f101655a
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x0031
                java.lang.String r0 = r2.f101656b
                java.lang.String r1 = r3.f101656b
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x0031
                com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi$a$a r0 = r2.f101657c
                com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi$a$a r1 = r3.f101657c
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x0031
                com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi$a$b r0 = r2.f101658d
                com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi$a$b r3 = r3.f101658d
                boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
                if (r3 == 0) goto L_0x0031
                goto L_0x0033
            L_0x0031:
                r3 = 0
                return r3
            L_0x0033:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.edit.api.YoutubeApi.C39836a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            Integer num = this.f101655a;
            int i = 0;
            int hashCode = (num != null ? num.hashCode() : 0) * 31;
            String str = this.f101656b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            C39837a aVar = this.f101657c;
            int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
            C39838b bVar = this.f101658d;
            if (bVar != null) {
                i = bVar.hashCode();
            }
            return hashCode3 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("YouTubeResponse(statusCode=");
            sb.append(this.f101655a);
            sb.append(", errorMessage=");
            sb.append(this.f101656b);
            sb.append(", errorStruct=");
            sb.append(this.f101657c);
            sb.append(", youtubeData=");
            sb.append(this.f101658d);
            sb.append(")");
            return sb.toString();
        }

        private C39836a(Integer num, String str, C39837a aVar, C39838b bVar) {
            this.f101655a = num;
            this.f101656b = str;
            this.f101657c = aVar;
            this.f101658d = bVar;
        }

        private /* synthetic */ C39836a(Integer num, String str, C39837a aVar, C39838b bVar, int i, C52707g gVar) {
            this(Integer.valueOf(0), "", null, null);
        }
    }

    private YoutubeApi() {
    }

    static {
        Object a = RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19925a().mo19930a(ServerApi.class);
        C52711k.m112236a(a, "ServiceManager.get().get…te(ServerApi::class.java)");
        f101654c = (ServerApi) a;
    }

    /* renamed from: a */
    public static final boolean m88596a() {
        Object obj;
        boolean z = false;
        try {
            C39836a aVar = (C39836a) f101654c.unlink().get();
            Integer num = null;
            if (f101653b) {
                StringBuilder sb = new StringBuilder("Un-linking YouTube result: ");
                if (aVar != null) {
                    obj = aVar.f101655a;
                } else {
                    obj = null;
                }
                sb.append(obj);
            }
            if (aVar != null) {
                num = aVar.f101655a;
            }
            if (num != null) {
                if (num.intValue() == 0) {
                    z = true;
                }
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0068  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m88595a(android.content.Context r3, java.lang.Exception r4, java.lang.Integer r5, com.p683ss.android.ugc.aweme.profile.edit.api.YoutubeApi.C39836a r6) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Exception: "
            r1.<init>(r2)
            r2 = 0
            if (r4 == 0) goto L_0x0014
            java.lang.String r4 = r4.getMessage()
            goto L_0x0015
        L_0x0014:
            r4 = r2
        L_0x0015:
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.append(r4)
            java.lang.String r4 = ", gms_code: "
            r0.append(r4)
            int r3 = com.p683ss.android.ugc.trill.p2521f.C50322a.m108602b(r3)
            r0.append(r3)
            java.lang.String r3 = ", oauth_code: "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = ", resp_code: "
            r0.append(r3)
            if (r6 == 0) goto L_0x003d
            java.lang.Integer r3 = r6.f101655a
            goto L_0x003e
        L_0x003d:
            r3 = r2
        L_0x003e:
            r0.append(r3)
            java.lang.String r3 = ", resp_msg: "
            r0.append(r3)
            if (r6 == 0) goto L_0x004b
            java.lang.String r3 = r6.f101656b
            goto L_0x004c
        L_0x004b:
            r3 = r2
        L_0x004c:
            r0.append(r3)
            java.lang.String r3 = ", yt_code: "
            r0.append(r3)
            if (r6 == 0) goto L_0x005d
            com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi$a$a r3 = r6.f101657c
            if (r3 == 0) goto L_0x005d
            java.lang.Integer r3 = r3.f101659a
            goto L_0x005e
        L_0x005d:
            r3 = r2
        L_0x005e:
            r0.append(r3)
            java.lang.String r3 = ", yt_msg: "
            r0.append(r3)
            if (r6 == 0) goto L_0x006e
            com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi$a$a r3 = r6.f101657c
            if (r3 == 0) goto L_0x006e
            java.lang.String r2 = r3.f101660b
        L_0x006e:
            r0.append(r2)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "StringBuilder()\n        …              .toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.edit.api.YoutubeApi.m88595a(android.content.Context, java.lang.Exception, java.lang.Integer, com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi$a):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054 A[Catch:{ Exception -> 0x0092 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066 A[Catch:{ Exception -> 0x0092 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069 A[Catch:{ Exception -> 0x0092 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0074 A[Catch:{ Exception -> 0x0092 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0086 A[Catch:{ Exception -> 0x0092 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.p683ss.android.ugc.aweme.profile.edit.api.YoutubeApi.C39836a m88594a(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            r9 = 0
            if (r8 == 0) goto L_0x000f
            java.lang.String r0 = "J?I7iAd=3j9AM1P="
            java.lang.String r1 = "AES/CBC/PKCS7Padding"
            java.lang.String r2 = "J?I7iAd=3j9AM1P="
            java.lang.String r8 = com.p683ss.android.ugc.aweme.utils.C47683as.m103196a(r8, r0, r1, r2)     // Catch:{ Exception -> 0x0092 }
            r1 = r8
            goto L_0x0010
        L_0x000f:
            r1 = r9
        L_0x0010:
            com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi$ServerApi r0 = f101654c     // Catch:{ Exception -> 0x0092 }
            r2 = 0
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r14
            r7 = r13
            com.google.b.h.a.m r8 = r0.link(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0092 }
            java.lang.Object r8 = r8.get()     // Catch:{ Exception -> 0x0092 }
            com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi$a r8 = (com.p683ss.android.ugc.aweme.profile.edit.api.YoutubeApi.C39836a) r8     // Catch:{ Exception -> 0x0092 }
            boolean r10 = f101653b     // Catch:{ Exception -> 0x0092 }
            if (r10 == 0) goto L_0x0091
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0092 }
            java.lang.String r11 = "Link result"
            r10.<init>(r11)     // Catch:{ Exception -> 0x0092 }
            java.lang.String r11 = ", statusCode: "
            r10.append(r11)     // Catch:{ Exception -> 0x0092 }
            if (r8 == 0) goto L_0x0037
            java.lang.Integer r11 = r8.f101655a     // Catch:{ Exception -> 0x0092 }
            goto L_0x0038
        L_0x0037:
            r11 = r9
        L_0x0038:
            r10.append(r11)     // Catch:{ Exception -> 0x0092 }
            java.lang.String r11 = ", channelId: "
            r10.append(r11)     // Catch:{ Exception -> 0x0092 }
            if (r8 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi$a$b r11 = r8.f101658d     // Catch:{ Exception -> 0x0092 }
            if (r11 == 0) goto L_0x0049
            java.lang.String r11 = r11.f101662b     // Catch:{ Exception -> 0x0092 }
            goto L_0x004a
        L_0x0049:
            r11 = r9
        L_0x004a:
            r10.append(r11)     // Catch:{ Exception -> 0x0092 }
            java.lang.String r11 = ", channelTitle: "
            r10.append(r11)     // Catch:{ Exception -> 0x0092 }
            if (r8 == 0) goto L_0x005b
            com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi$a$b r11 = r8.f101658d     // Catch:{ Exception -> 0x0092 }
            if (r11 == 0) goto L_0x005b
            java.lang.String r11 = r11.f101663c     // Catch:{ Exception -> 0x0092 }
            goto L_0x005c
        L_0x005b:
            r11 = r9
        L_0x005c:
            r10.append(r11)     // Catch:{ Exception -> 0x0092 }
            java.lang.String r11 = ", errorMessage: "
            r10.append(r11)     // Catch:{ Exception -> 0x0092 }
            if (r8 == 0) goto L_0x0069
            java.lang.String r11 = r8.f101656b     // Catch:{ Exception -> 0x0092 }
            goto L_0x006a
        L_0x0069:
            r11 = r9
        L_0x006a:
            r10.append(r11)     // Catch:{ Exception -> 0x0092 }
            java.lang.String r11 = ", yt_code: "
            r10.append(r11)     // Catch:{ Exception -> 0x0092 }
            if (r8 == 0) goto L_0x007b
            com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi$a$a r11 = r8.f101657c     // Catch:{ Exception -> 0x0092 }
            if (r11 == 0) goto L_0x007b
            java.lang.Integer r11 = r11.f101659a     // Catch:{ Exception -> 0x0092 }
            goto L_0x007c
        L_0x007b:
            r11 = r9
        L_0x007c:
            r10.append(r11)     // Catch:{ Exception -> 0x0092 }
            java.lang.String r11 = ", yt_message: "
            r10.append(r11)     // Catch:{ Exception -> 0x0092 }
            if (r8 == 0) goto L_0x008d
            com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi$a$a r11 = r8.f101657c     // Catch:{ Exception -> 0x0092 }
            if (r11 == 0) goto L_0x008d
            java.lang.String r11 = r11.f101660b     // Catch:{ Exception -> 0x0092 }
            goto L_0x008e
        L_0x008d:
            r11 = r9
        L_0x008e:
            r10.append(r11)     // Catch:{ Exception -> 0x0092 }
        L_0x0091:
            return r8
        L_0x0092:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.edit.api.YoutubeApi.m88594a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi$a");
    }
}
