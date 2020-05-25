package com.bytedance.crash.p554m;

import com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.crash.m.g */
public final class C9679g {

    /* renamed from: a */
    final String f26392a;

    /* renamed from: b */
    boolean f26393b;

    /* renamed from: c */
    DataOutputStream f26394c;

    /* renamed from: d */
    C9684k f26395d;

    /* renamed from: e */
    private HttpURLConnection f26396e;

    /* renamed from: f */
    private String f26397f;

    /* renamed from: a */
    public final String mo17526a() throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        StringBuilder sb = new StringBuilder("\r\n--");
        sb.append(this.f26392a);
        sb.append("--\r\n");
        byte[] bytes = sb.toString().getBytes();
        if (this.f26393b) {
            this.f26395d.write(bytes);
            this.f26395d.mo17531b();
            this.f26395d.mo17530a();
        } else {
            this.f26394c.write(bytes);
            this.f26394c.flush();
            this.f26394c.close();
        }
        int responseCode = this.f26396e.getResponseCode();
        if (responseCode == 200) {
            HttpURLConnection httpURLConnection = this.f26396e;
            URLConnection uRLConnection = httpURLConnection;
            if (C18982g.m46160a(uRLConnection)) {
                C18976b.m46151a(uRLConnection.getURL(), null, null, uRLConnection.getContentType());
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine);
            }
            bufferedReader.close();
            this.f26396e.disconnect();
            StringBuilder sb2 = new StringBuilder();
            for (String append : arrayList) {
                sb2.append(append);
            }
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("Server returned non-OK status: ");
        sb3.append(responseCode);
        throw new IOException(sb3.toString());
    }

    /* renamed from: a */
    public final void mo17528a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f26392a);
        sb.append("\r\nContent-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"\r\n");
        sb.append("Content-Type: text/plain; charset=");
        sb.append(this.f26397f);
        sb.append("\r\n\r\n");
        sb.append(str2);
        sb.append("\r\n");
        try {
            if (this.f26393b) {
                this.f26395d.write(sb.toString().getBytes());
            } else {
                this.f26394c.write(sb.toString().getBytes());
            }
        } catch (IOException unused) {
        }
    }

    public C9679g(String str, String str2, boolean z) throws IOException {
        this.f26397f = str2;
        this.f26393b = z;
        StringBuilder sb = new StringBuilder("AAA");
        sb.append(System.currentTimeMillis());
        sb.append("AAA");
        this.f26392a = sb.toString();
        this.f26396e = (HttpURLConnection) new URL(str).openConnection();
        this.f26396e.setUseCaches(false);
        this.f26396e.setDoOutput(true);
        this.f26396e.setDoInput(true);
        this.f26396e.setRequestMethod("POST");
        StringBuilder sb2 = new StringBuilder("multipart/form-data; boundary=");
        sb2.append(this.f26392a);
        C9680h.m19306a(this.f26396e, "Content-Type", sb2.toString());
        if (z) {
            C9680h.m19306a(this.f26396e, "Content-Encoding", "gzip");
            this.f26395d = new C9684k(this.f26396e.getOutputStream());
            return;
        }
        this.f26394c = new DataOutputStream(this.f26396e.getOutputStream());
    }

    /* renamed from: a */
    public final void mo17527a(String str, File file, Map<String, String> map) throws IOException {
        String name = file.getName();
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f26392a);
        sb.append("\r\nContent-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"; filename=\"");
        sb.append(name);
        sb.append("\"");
        for (Entry entry : map.entrySet()) {
            sb.append("; ");
            sb.append((String) entry.getKey());
            sb.append("=\"");
            sb.append((String) entry.getValue());
            sb.append("\"");
        }
        sb.append("\r\nContent-Transfer-Encoding: binary");
        sb.append("\r\n\r\n");
        if (this.f26393b) {
            this.f26395d.write(sb.toString().getBytes());
        } else {
            this.f26394c.write(sb.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                break;
            } else if (this.f26393b) {
                this.f26395d.write(bArr, 0, read);
            } else {
                this.f26394c.write(bArr, 0, read);
            }
        }
        fileInputStream.close();
        if (this.f26393b) {
            this.f26395d.write("\r\n".getBytes());
            return;
        }
        this.f26394c.write("\r\n".getBytes());
        this.f26394c.flush();
    }
}
