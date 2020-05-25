package com.p683ss.android.ugc.aweme.p2391v;

import android.content.Context;
import com.bytedance.android.p161c.C2835a;
import com.bytedance.android.p161c.p162a.C2843b;
import com.bytedance.android.p161c.p167f.C2851a;
import com.bytedance.android.p161c.p167f.C2852b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.v.d */
public final class C47970d {

    /* renamed from: a */
    public static final C47970d f120591a = new C47970d();

    /* renamed from: com.ss.android.ugc.aweme.v.d$a */
    public interface C47971a {
        /* renamed from: a */
        void mo95127a(long j);

        /* renamed from: a */
        void mo95128a(String str, long j);
    }

    /* renamed from: com.ss.android.ugc.aweme.v.d$b */
    public static final class C47972b implements C2851a {
        C47972b() {
        }

        /* renamed from: a */
        public final void mo7480a(String str, String str2) {
            StringBuilder sb = new StringBuilder("So decompress: in LibraryDecompresser : ");
            sb.append(str);
            sb.append(",  ");
            sb.append(str2);
            C45407ay.m98973d(sb.toString());
        }

        /* renamed from: b */
        public final void mo7481b(String str, String str2) {
            StringBuilder sb = new StringBuilder("So decompress: in LibraryDecompresser : ");
            sb.append(str);
            sb.append(",  ");
            sb.append(str2);
            C45407ay.m98968a(sb.toString());
        }

        /* renamed from: c */
        public final void mo7482c(String str, String str2) {
            StringBuilder sb = new StringBuilder("So decompress: in LibraryDecompresser : ");
            sb.append(str);
            sb.append(",  ");
            sb.append(str2);
            C45407ay.m98972c(sb.toString());
        }

        /* renamed from: d */
        public final void mo7483d(String str, String str2) {
            StringBuilder sb = new StringBuilder("So decompress: in LibraryDecompresser : ");
            sb.append(str);
            sb.append(",  ");
            sb.append(str2);
            C45407ay.m98971b(sb.toString());
        }

        /* renamed from: e */
        public final void mo7484e(String str, String str2) {
            StringBuilder sb = new StringBuilder("So decompress: in LibraryDecompresser : ");
            sb.append(str);
            sb.append(",  ");
            sb.append(str2);
            C45407ay.m98968a(sb.toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.v.d$c */
    public static final class C47973c implements C2843b {

        /* renamed from: a */
        final /* synthetic */ long f120592a;

        /* renamed from: b */
        final /* synthetic */ C47971a f120593b;

        /* renamed from: c */
        final /* synthetic */ int f120594c;

        /* renamed from: a */
        public final void mo7477a(String str) {
            C52711k.m112240b(str, "libPath");
            long currentTimeMillis = System.currentTimeMillis() - this.f120592a;
            this.f120593b.mo95128a(str, currentTimeMillis);
            int i = this.f120594c;
            C52711k.m112240b(str, "libPath");
            StringBuilder sb = new StringBuilder("So decompress: in CompressedLibraryLoader : Decompress success, lib path: ");
            sb.append(str);
            sb.append(", duration: ");
            sb.append(currentTimeMillis);
            C45407ay.m98968a(sb.toString());
            C23569o.m57776a("so_decompress", 2, C23088c.m56631a().mo47823a("duration", Long.valueOf(currentTimeMillis)).mo47824a("libPath", str).mo47825b());
            C26890h.m65011a("finish_decompress", C23089d.m56640a().mo47826a("type", i).mo47827a("duration", currentTimeMillis).mo47826a("status", 0).f61491a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a5, code lost:
            if (r7 == null) goto L_0x00a7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b9, code lost:
            if (r9 == null) goto L_0x00bb;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo7476a(com.bytedance.android.p161c.p163b.C2845a r9) {
            /*
                r8 = this;
                long r0 = java.lang.System.currentTimeMillis()
                long r2 = r8.f120592a
                long r0 = r0 - r2
                com.ss.android.ugc.aweme.v.d$a r2 = r8.f120593b
                r2.mo95127a(r0)
                int r2 = r8.f120594c
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "So decompress: in CompressedLibraryLoader : Decompress fail, errorCode: "
                r3.<init>(r4)
                r4 = 0
                if (r9 == 0) goto L_0x001f
                int r5 = r9.f8478a
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                goto L_0x0020
            L_0x001f:
                r5 = r4
            L_0x0020:
                r3.append(r5)
                java.lang.String r5 = ", msg: "
                r3.append(r5)
                if (r9 == 0) goto L_0x002d
                java.lang.String r5 = r9.f8479b
                goto L_0x002e
            L_0x002d:
                r5 = r4
            L_0x002e:
                r3.append(r5)
                java.lang.String r5 = ", duration: "
                r3.append(r5)
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay.m98968a(r3)
                if (r9 == 0) goto L_0x0045
                java.lang.Throwable r3 = r9.f8480c
                goto L_0x0046
            L_0x0045:
                r3 = r4
            L_0x0046:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "Decompress fail, error code: "
                r5.<init>(r6)
                if (r9 == 0) goto L_0x0056
                int r6 = r9.f8478a
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                goto L_0x0057
            L_0x0056:
                r6 = r4
            L_0x0057:
                r5.append(r6)
                java.lang.String r6 = ", error msg: "
                r5.append(r6)
                if (r9 == 0) goto L_0x0063
                java.lang.String r4 = r9.f8479b
            L_0x0063:
                r5.append(r4)
                java.lang.String r4 = ", duration: "
                r5.append(r4)
                r5.append(r0)
                java.lang.String r4 = ", type: "
                r5.append(r4)
                r5.append(r2)
                java.lang.String r4 = r5.toString()
                com.bytedance.p502b.p503a.p506b.p508b.C9220a.m18312a(r3, r4)
                java.lang.String r3 = "so_decompress"
                r4 = 3
                com.ss.android.ugc.aweme.app.f.c r5 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()
                java.lang.String r6 = "duration"
                java.lang.Long r7 = java.lang.Long.valueOf(r0)
                com.ss.android.ugc.aweme.app.f.c r5 = r5.mo47823a(r6, r7)
                java.lang.String r6 = "errorCode"
                if (r9 == 0) goto L_0x0099
                int r7 = r9.f8478a
            L_0x0094:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                goto L_0x009b
            L_0x0099:
                r7 = -1
                goto L_0x0094
            L_0x009b:
                com.ss.android.ugc.aweme.app.f.c r5 = r5.mo47822a(r6, r7)
                java.lang.String r6 = "errorMsg"
                if (r9 == 0) goto L_0x00a7
                java.lang.String r7 = r9.f8479b
                if (r7 != 0) goto L_0x00a9
            L_0x00a7:
                java.lang.String r7 = "unknown"
            L_0x00a9:
                com.ss.android.ugc.aweme.app.f.c r5 = r5.mo47824a(r6, r7)
                java.lang.String r6 = "exception"
                if (r9 == 0) goto L_0x00bb
                java.lang.Throwable r9 = r9.f8480c
                if (r9 == 0) goto L_0x00bb
                java.lang.String r9 = r9.getMessage()
                if (r9 != 0) goto L_0x00bd
            L_0x00bb:
                java.lang.String r9 = "unknown"
            L_0x00bd:
                com.ss.android.ugc.aweme.app.f.c r9 = r5.mo47824a(r6, r9)
                org.json.JSONObject r9 = r9.mo47825b()
                com.p683ss.android.ugc.aweme.base.C23569o.m57776a(r3, r4, r9)
                java.lang.String r9 = "finish_decompress"
                com.ss.android.ugc.aweme.app.f.d r3 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r4 = "type"
                com.ss.android.ugc.aweme.app.f.d r2 = r3.mo47826a(r4, r2)
                java.lang.String r3 = "duration"
                com.ss.android.ugc.aweme.app.f.d r0 = r2.mo47827a(r3, r0)
                java.lang.String r1 = "status"
                r2 = 1
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47826a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r9, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p2391v.C47970d.C47973c.mo7476a(com.bytedance.android.c.b.a):void");
        }

        C47973c(long j, C47971a aVar, int i) {
            this.f120592a = j;
            this.f120593b = aVar;
            this.f120594c = i;
        }
    }

    private C47970d() {
    }

    static {
        Context a = C11010c.m22280a();
        C52711k.m112240b(a, "context");
        C2835a.m8096a(a);
        C2852b.f8485a = new C47972b();
    }

    /* renamed from: a */
    public static String m103787a(Context context) {
        C52711k.m112240b(context, "context");
        String a = C2835a.m8096a(context).mo7471a();
        C52711k.m112236a((Object) a, "DecompressableSoLoader.g…getDefaultDecompressDir()");
        return a;
    }

    /* renamed from: a */
    public static String m103788a(String str, Context context) {
        C52711k.m112240b(str, "metadata");
        C52711k.m112240b(context, "context");
        String a = C2835a.m8096a(context).mo7472a(str);
        C52711k.m112236a((Object) a, "DecompressableSoLoader.g…MetadataFastMd5(metadata)");
        return a;
    }
}
