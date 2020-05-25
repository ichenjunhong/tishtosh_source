package com.p683ss.android.ugc.aweme.app;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.buildconfigdiff.C24095a;
import com.p683ss.android.ugc.aweme.router.C41312z;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.app.r */
public abstract class C23138r {

    /* renamed from: a */
    protected Context f61569a;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract Uri mo47771a(Uri uri);

    public C23138r(Context context) {
        this.f61569a = context;
    }

    /* renamed from: a */
    public final Uri mo47856a(Uri uri, int i, String str) {
        Uri uri2;
        if (TextUtils.isEmpty(str) && i != 9 && i != 14 && i != 15 && i != 16) {
            return null;
        }
        String str2 = "";
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(C24095a.m58944a());
                sb.append("://detail?id=");
                sb.append(str);
                str2 = sb.toString();
                break;
            case 1:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C24095a.m58944a());
                sb2.append("://live?room_id=");
                sb2.append(str);
                str2 = sb2.toString();
                break;
            case 2:
                StringBuilder sb3 = new StringBuilder();
                sb3.append(C24095a.m58944a());
                sb3.append("://profile?unique_id=");
                sb3.append(str);
                str2 = sb3.toString();
                break;
            case 3:
                StringBuilder sb4 = new StringBuilder();
                sb4.append(C24095a.m58944a());
                sb4.append("://challenge/detail/");
                sb4.append(str);
                str2 = sb4.toString();
                break;
            case 4:
                StringBuilder sb5 = new StringBuilder();
                sb5.append(C24095a.m58944a());
                sb5.append("://music/detail/");
                sb5.append(str);
                str2 = sb5.toString();
                break;
            case 5:
                StringBuilder sb6 = new StringBuilder();
                sb6.append(C24095a.m58944a());
                sb6.append("://stickers/detail/");
                sb6.append(str);
                str2 = sb6.toString();
                break;
            case 6:
                StringBuilder sb7 = new StringBuilder();
                sb7.append(C24095a.m58944a());
                sb7.append("://profile?id=");
                sb7.append(str);
                str2 = sb7.toString();
                if (uri != null) {
                    String queryParameter = uri.getQueryParameter(C22835a.f61196a);
                    if (!TextUtils.isEmpty(queryParameter)) {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(str2);
                        sb8.append("&sec_uid=");
                        sb8.append(queryParameter);
                        str2 = sb8.toString();
                        break;
                    }
                }
                break;
            case 7:
                StringBuilder sb9 = new StringBuilder();
                sb9.append(C24095a.m58944a());
                sb9.append("://item?id=");
                sb9.append(str);
                str2 = sb9.toString();
                break;
            case 8:
                StringBuilder sb10 = new StringBuilder();
                sb10.append(C24095a.m58944a());
                sb10.append("://tag?id=");
                sb10.append(str);
                str2 = sb10.toString();
                break;
            case 9:
                StringBuilder sb11 = new StringBuilder();
                sb11.append(C24095a.m58944a());
                sb11.append("://game?game_id=");
                sb11.append(str);
                str2 = sb11.toString();
                break;
            case 10:
                StringBuilder sb12 = new StringBuilder();
                sb12.append(C24095a.m58944a());
                sb12.append("://mix_video/detail/");
                sb12.append(str);
                str2 = sb12.toString();
                break;
            case 11:
                StringBuilder sb13 = new StringBuilder();
                sb13.append(C24095a.m58944a());
                sb13.append("://poi?id=");
                sb13.append(str);
                str2 = sb13.toString();
                break;
            case 12:
                String b = C41312z.m91072b(uri.toString(), "id");
                if (!TextUtils.isEmpty(b)) {
                    String b2 = C41312z.m91072b(uri.toString(), "edition_uid");
                    StringBuilder sb14 = new StringBuilder();
                    sb14.append(C24095a.m58944a());
                    sb14.append("://search/trending?type=");
                    sb14.append(b);
                    sb14.append("&trending=");
                    sb14.append(b2);
                    str2 = sb14.toString();
                    break;
                }
                break;
            case 13:
                StringBuilder sb15 = new StringBuilder();
                sb15.append(C24095a.m58944a());
                sb15.append("://challenge/detail?id=");
                sb15.append(str);
                sb15.append("&group=0&is_commerce=1");
                str2 = sb15.toString();
                break;
            case 14:
                C41312z.m91072b(uri.toString(), "object_id");
                break;
            case 15:
                String b3 = C41312z.m91072b(uri.toString(), "object_id");
                StringBuilder sb16 = new StringBuilder();
                sb16.append(C24095a.m58944a());
                sb16.append("://goods/shop/?uid=");
                sb16.append(b3);
                str2 = sb16.toString();
                break;
            case 16:
                String b4 = C41312z.m91072b(uri.toString(), "object_id");
                StringBuilder sb17 = new StringBuilder();
                sb17.append(C24095a.m58944a());
                sb17.append("://openRecord?recordParam=sticker&id=");
                sb17.append(b4);
                str2 = sb17.toString();
                break;
            case 17:
                StringBuilder sb18 = new StringBuilder();
                sb18.append(C24095a.m58944a());
                sb18.append("://webview");
                str2 = Uri.parse(sb18.toString()).buildUpon().appendQueryParameter("url", uri.toString()).build().toString();
                break;
        }
        if (!TextUtils.isEmpty(str2)) {
            uri2 = Uri.parse(str2);
        } else {
            uri2 = null;
        }
        if (uri2 == null) {
            return null;
        }
        if (uri != null && !TextUtils.equals(Uri.parse(str2).getHost(), C23060d.f61427a)) {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            Builder buildUpon = uri2.buildUpon();
            if (!(queryParameterNames == null || buildUpon == null)) {
                for (String str3 : queryParameterNames) {
                    buildUpon.appendQueryParameter(str3, uri.getQueryParameter(str3));
                }
            }
            uri2 = buildUpon.build();
        }
        return uri2;
    }
}
