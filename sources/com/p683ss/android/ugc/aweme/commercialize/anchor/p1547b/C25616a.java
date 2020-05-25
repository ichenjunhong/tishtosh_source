package com.p683ss.android.ugc.aweme.commercialize.anchor.p1547b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.miniapp_api.C36949e;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.b.a */
public final class C25616a {

    /* renamed from: a */
    public static final C25616a f67807a = new C25616a();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.b.a$a */
    public static final class C25617a {

        /* renamed from: a */
        public final String f67808a;

        /* renamed from: b */
        public final String f67809b;

        /* renamed from: c */
        public final String f67810c;

        /* renamed from: d */
        public final String f67811d;

        /* renamed from: e */
        public final String f67812e;

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
            if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f67812e, (java.lang.Object) r3.f67812e) != false) goto L_0x003d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x003d
                boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.commercialize.anchor.p1547b.C25616a.C25617a
                if (r0 == 0) goto L_0x003b
                com.ss.android.ugc.aweme.commercialize.anchor.b.a$a r3 = (com.p683ss.android.ugc.aweme.commercialize.anchor.p1547b.C25616a.C25617a) r3
                java.lang.String r0 = r2.f67808a
                java.lang.String r1 = r3.f67808a
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x003b
                java.lang.String r0 = r2.f67809b
                java.lang.String r1 = r3.f67809b
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x003b
                java.lang.String r0 = r2.f67810c
                java.lang.String r1 = r3.f67810c
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x003b
                java.lang.String r0 = r2.f67811d
                java.lang.String r1 = r3.f67811d
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x003b
                java.lang.String r0 = r2.f67812e
                java.lang.String r3 = r3.f67812e
                boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
                if (r3 == 0) goto L_0x003b
                goto L_0x003d
            L_0x003b:
                r3 = 0
                return r3
            L_0x003d:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.anchor.p1547b.C25616a.C25617a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f67808a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f67809b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f67810c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f67811d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.f67812e;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return hashCode4 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PreviewArticleInfo(id=");
            sb.append(this.f67808a);
            sb.append(", startPage=");
            sb.append(this.f67809b);
            sb.append(", enterFrom=");
            sb.append(this.f67810c);
            sb.append(", scene=");
            sb.append(this.f67811d);
            sb.append(", webUrl=");
            sb.append(this.f67812e);
            sb.append(")");
            return sb.toString();
        }

        public C25617a(String str, String str2, String str3, String str4, String str5) {
            C52711k.m112240b(str, "id");
            this.f67808a = str;
            this.f67809b = str2;
            this.f67810c = str3;
            this.f67811d = str4;
            this.f67812e = str5;
        }
    }

    private C25616a() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022 A[Catch:{ Exception -> 0x0042 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023 A[Catch:{ Exception -> 0x0042 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.p683ss.android.ugc.aweme.commercialize.anchor.p1547b.C25616a.C25617a m62149a(java.lang.String r8) {
        /*
            java.lang.String r0 = "infoString"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0042 }
            r1.<init>(r8)     // Catch:{ Exception -> 0x0042 }
            java.lang.String r8 = "micro_app_id"
            java.lang.String r3 = r1.optString(r8)     // Catch:{ Exception -> 0x0042 }
            r8 = r3
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ Exception -> 0x0042 }
            if (r8 == 0) goto L_0x001f
            int r8 = r8.length()     // Catch:{ Exception -> 0x0042 }
            if (r8 != 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r8 = 0
            goto L_0x0020
        L_0x001f:
            r8 = 1
        L_0x0020:
            if (r8 == 0) goto L_0x0023
            return r0
        L_0x0023:
            com.ss.android.ugc.aweme.commercialize.anchor.b.a$a r8 = new com.ss.android.ugc.aweme.commercialize.anchor.b.a$a     // Catch:{ Exception -> 0x0042 }
            java.lang.String r2 = "article_start_page_url"
            java.lang.String r4 = r1.optString(r2)     // Catch:{ Exception -> 0x0042 }
            java.lang.String r2 = "enterFrom"
            java.lang.String r5 = r1.optString(r2)     // Catch:{ Exception -> 0x0042 }
            java.lang.String r2 = "scene"
            java.lang.String r6 = r1.optString(r2)     // Catch:{ Exception -> 0x0042 }
            java.lang.String r2 = "article_web_url"
            java.lang.String r7 = r1.optString(r2)     // Catch:{ Exception -> 0x0042 }
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0042 }
            return r8
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.anchor.p1547b.C25616a.m62149a(java.lang.String):com.ss.android.ugc.aweme.commercialize.anchor.b.a$a");
    }

    /* renamed from: a */
    public static final void m62150a(Context context, C25617a aVar) {
        IMiniAppService a = C36983a.m83185b().mo76294a();
        if (a != null && aVar != null) {
            String a2 = C36949e.m83165a(aVar.f67809b, aVar.f67808a, false, aVar.f67812e);
            C36960b bVar = new C36960b();
            bVar.f94363b = aVar.f67810c;
            bVar.f94364c = aVar.f67811d;
            a.openMiniApp(context, a2, bVar);
        }
    }

    /* renamed from: a */
    public static final void m62151a(Context context, String str) {
        if (str != null && context != null) {
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            intent.putExtra("hide_nav_bar", true);
            intent.putExtra("hide_status_bar", false);
            intent.putExtra("status_bar_color", "FFFFFF");
            intent.putExtra("status_font_dark", true);
            intent.putExtra("bundle_webview_background", C11010c.m22280a().getResources().getColor(R.color.aso));
            intent.putExtra("need_bottom_out", true);
            intent.setData(Uri.parse(str));
            context.startActivity(intent);
        }
    }
}
