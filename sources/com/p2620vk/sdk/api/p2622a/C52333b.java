package com.p2620vk.sdk.api.p2622a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Pair;
import com.C2240a;
import com.p2620vk.sdk.C52421d;
import com.p2620vk.sdk.api.C52352c;
import com.p2620vk.sdk.api.model.VKAttachments;
import com.p2620vk.sdk.p2621a.C52325c;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import java.util.zip.GZIPInputStream;

/* renamed from: com.vk.sdk.api.a.b */
public final class C52333b {

    /* renamed from: a */
    static final ExecutorService f130315a = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(3).mo49847a());

    /* renamed from: b */
    public static final ExecutorService f130316b = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(1).mo49847a());

    /* renamed from: com.vk.sdk.api.a.b$a */
    public static class C52337a {

        /* renamed from: a */
        public URL f130319a;

        /* renamed from: b */
        public int f130320b = 20000;

        /* renamed from: c */
        public List<Pair<String, String>> f130321c;

        /* renamed from: d */
        public C52350h f130322d;

        /* renamed from: e */
        public Map<String, String> f130323e;

        /* renamed from: f */
        public boolean f130324f;

        /* renamed from: g */
        public HttpURLConnection f130325g;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final HttpURLConnection mo109149a() throws IOException {
            this.f130325g = (HttpURLConnection) this.f130319a.openConnection();
            this.f130325g.setReadTimeout(this.f130320b);
            this.f130325g.setConnectTimeout(this.f130320b + 5000);
            this.f130325g.setRequestMethod("POST");
            this.f130325g.setUseCaches(false);
            this.f130325g.setDoInput(true);
            this.f130325g.setDoOutput(true);
            try {
                Context a = C52421d.m111976a();
                if (a != null) {
                    PackageManager packageManager = a.getPackageManager();
                    if (packageManager != null) {
                        PackageInfo packageInfo = packageManager.getPackageInfo(a.getPackageName(), 0);
                        C52340c.m111811a(this.f130325g, "User-Agent", C2240a.m6773a(Locale.US, "%s/%s (%s; Android %d; Scale/%.2f; VK SDK %s; %s)", new Object[]{C52325c.m111792a(a), packageInfo.versionName, Build.MODEL, Integer.valueOf(VERSION.SDK_INT), Float.valueOf(a.getResources().getDisplayMetrics().density), "1.6.9", packageInfo.packageName}));
                    }
                }
            } catch (Exception unused) {
            }
            C52340c.m111811a(this.f130325g, "Connection", "Keep-Alive");
            if (this.f130323e != null) {
                for (Entry entry : this.f130323e.entrySet()) {
                    C52340c.m111812b(this.f130325g, (String) entry.getKey(), (String) entry.getValue());
                }
            }
            if (this.f130322d != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f130322d.mo109159a());
                C52340c.m111812b(this.f130325g, "Content-length", sb.toString());
                Pair pair = new Pair("Content-Type", C2240a.m6772a("multipart/form-data; boundary=%s", new Object[]{this.f130322d.f130344a}));
                C52340c.m111812b(this.f130325g, (String) pair.first, (String) pair.second);
            }
            OutputStream outputStream = this.f130325g.getOutputStream();
            m111808a(outputStream);
            outputStream.close();
            this.f130325g.connect();
            return this.f130325g;
        }

        public C52337a(String str) {
            if (str != null) {
                try {
                    this.f130319a = new URL(str);
                } catch (MalformedURLException unused) {
                }
            }
        }

        /* renamed from: a */
        private void m111808a(OutputStream outputStream) throws IOException {
            String str;
            if (this.f130322d != null) {
                this.f130322d.mo109160a(outputStream);
                return;
            }
            if (this.f130321c == null) {
                str = null;
            } else {
                ArrayList arrayList = new ArrayList(this.f130321c.size());
                for (Pair pair : this.f130321c) {
                    if (!(pair.first == null || pair.second == null)) {
                        arrayList.add(C2240a.m6772a("%s=%s", new Object[]{URLEncoder.encode((String) pair.first, "UTF-8"), URLEncoder.encode((String) pair.second, "UTF-8")}));
                    }
                }
                str = TextUtils.join("&", arrayList);
            }
            if (str != null && str.length() > 0) {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                bufferedWriter.write(str);
                bufferedWriter.flush();
                bufferedWriter.close();
            }
        }

        /* renamed from: a */
        public final void mo109150a(C52352c cVar) {
            String str;
            ArrayList arrayList = new ArrayList(cVar.size());
            for (Entry entry : cVar.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof VKAttachments) {
                    arrayList.add(new Pair(entry.getKey(), ((VKAttachments) value).mo109340a()));
                } else if (value instanceof Collection) {
                    arrayList.add(new Pair(entry.getKey(), TextUtils.join(",", (Collection) value)));
                } else {
                    Object key = entry.getKey();
                    if (value == null) {
                        str = null;
                    } else {
                        str = String.valueOf(value);
                    }
                    arrayList.add(new Pair(key, str));
                }
            }
            this.f130321c = arrayList;
        }
    }

    /* renamed from: com.vk.sdk.api.a.b$b */
    public interface C52338b {
    }

    /* renamed from: com.vk.sdk.api.a.b$c */
    public static class C52339c {

        /* renamed from: a */
        public final int f130326a;

        /* renamed from: b */
        public final long f130327b;

        /* renamed from: c */
        public Map<String, String> f130328c;

        /* renamed from: d */
        public final byte[] f130329d;

        public C52339c(HttpURLConnection httpURLConnection, C52338b bVar) throws IOException {
            this.f130326a = httpURLConnection.getResponseCode();
            this.f130327b = (long) httpURLConnection.getContentLength();
            if (httpURLConnection.getHeaderFields() != null) {
                this.f130328c = new HashMap();
                for (Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
                    this.f130328c.put(entry.getKey(), TextUtils.join(",", (Iterable) entry.getValue()));
                }
            }
            URLConnection uRLConnection = httpURLConnection;
            if (C18982g.m46160a(uRLConnection)) {
                C18976b.m46151a(uRLConnection.getURL(), null, null, uRLConnection.getContentType());
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            if (this.f130328c != null) {
                String str = (String) this.f130328c.get("Content-Encoding");
                if (str != null && str.equalsIgnoreCase("gzip")) {
                    inputStream = new GZIPInputStream(inputStream);
                }
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    inputStream.close();
                    byteArrayOutputStream.flush();
                    this.f130329d = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m111807a(final C52327a aVar) {
        f130315a.execute(new Runnable() {
            public final void run() {
                aVar.mo109141a(C52333b.f130316b);
            }
        });
    }
}
