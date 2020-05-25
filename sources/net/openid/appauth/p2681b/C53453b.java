package net.openid.appauth.p2681b;

import android.net.Uri;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import net.openid.appauth.C53487p;

/* renamed from: net.openid.appauth.b.b */
public final class C53453b implements C53452a {

    /* renamed from: a */
    public static final C53453b f132181a = new C53453b();

    /* renamed from: b */
    private static final int f132182b = ((int) TimeUnit.SECONDS.toMillis(15));

    /* renamed from: c */
    private static final int f132183c = ((int) TimeUnit.SECONDS.toMillis(10));

    private C53453b() {
    }

    /* renamed from: a */
    public final HttpURLConnection mo111205a(Uri uri) throws IOException {
        C53487p.m113585a(uri, (Object) "url must not be null");
        C53487p.m113587a(WebKitApi.SCHEME_HTTPS.equals(uri.getScheme()), (Object) "only https connections are permitted");
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(f132182b);
        httpURLConnection.setReadTimeout(f132183c);
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }
}
