package com.bytedance.apm.net;

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
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.net.b */
public final class C9147b {

    /* renamed from: a */
    private final String f25056a;

    /* renamed from: b */
    private HttpURLConnection f25057b;

    /* renamed from: c */
    private String f25058c;

    /* renamed from: d */
    private boolean f25059d = false;

    /* renamed from: e */
    private DataOutputStream f25060e;

    /* renamed from: f */
    private GZIPOutputStream f25061f;

    /* renamed from: a */
    public final String mo16519a() throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        StringBuilder sb = new StringBuilder("\r\n--");
        sb.append(this.f25056a);
        sb.append("--\r\n");
        byte[] bytes = sb.toString().getBytes();
        if (this.f25059d) {
            this.f25061f.write(bytes);
            this.f25061f.finish();
            this.f25061f.close();
        } else {
            this.f25060e.write(bytes);
            this.f25060e.flush();
            this.f25060e.close();
        }
        int responseCode = this.f25057b.getResponseCode();
        if (responseCode == 200) {
            HttpURLConnection httpURLConnection = this.f25057b;
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
            this.f25057b.disconnect();
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
    public final void mo16522a(JSONObject jSONObject) throws IOException {
        String str;
        StringBuilder sb = new StringBuilder(100);
        sb.append("--");
        sb.append(this.f25056a);
        sb.append("\r\nContent-Disposition: form-data; name=\"params.txt\"; filetype=\"common_params\"; logtype=\"env\"; filename=\"params.txt\"\r\n");
        sb.append("Content-Type: text/plain\r\n");
        sb.append("\r\n");
        if (this.f25059d) {
            this.f25061f.write(sb.toString().getBytes());
        } else {
            this.f25060e.write(sb.toString().getBytes());
        }
        if (jSONObject != null) {
            str = jSONObject.toString();
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("defaultData", "none commonParams");
            } catch (JSONException unused) {
            }
            str = jSONObject2.toString();
        }
        if (this.f25059d) {
            this.f25061f.write(str.getBytes());
        } else {
            this.f25060e.write(str.getBytes());
        }
        if (this.f25059d) {
            this.f25061f.write("\r\n".getBytes());
            return;
        }
        this.f25060e.write("\r\n".getBytes());
        this.f25060e.flush();
    }

    /* renamed from: a */
    public final void mo16521a(String str, String str2) {
        StringBuilder sb = new StringBuilder(100);
        sb.append("--");
        sb.append(this.f25056a);
        sb.append("\r\nContent-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"\r\n");
        sb.append("Content-Type: text/plain; charset=");
        sb.append(this.f25058c);
        sb.append("\r\n\r\n");
        sb.append(str2);
        sb.append("\r\n");
        try {
            if (this.f25059d) {
                this.f25061f.write(sb.toString().getBytes());
            } else {
                this.f25060e.write(sb.toString().getBytes());
            }
        } catch (IOException unused) {
        }
    }

    public C9147b(String str, String str2, boolean z) throws IOException {
        this.f25058c = str2;
        StringBuilder sb = new StringBuilder("AAA");
        sb.append(System.currentTimeMillis());
        sb.append("AAA");
        this.f25056a = sb.toString();
        this.f25057b = (HttpURLConnection) new URL(str).openConnection();
        this.f25057b.setUseCaches(false);
        this.f25057b.setDoOutput(true);
        this.f25057b.setDoInput(true);
        this.f25057b.setRequestMethod("POST");
        HttpURLConnection httpURLConnection = this.f25057b;
        String str3 = "Content-Type";
        StringBuilder sb2 = new StringBuilder("multipart/form-data; boundary=");
        sb2.append(this.f25056a);
        String sb3 = sb2.toString();
        URLConnection uRLConnection = httpURLConnection;
        if (C18982g.m46160a(uRLConnection)) {
            C18976b.m46151a(uRLConnection.getURL(), str3, sb3, "");
        }
        httpURLConnection.setRequestProperty(str3, sb3);
        this.f25060e = new DataOutputStream(this.f25057b.getOutputStream());
    }

    /* renamed from: a */
    public final void mo16520a(String str, File file, Map<String, String> map) throws IOException {
        String name = file.getName();
        StringBuilder sb = new StringBuilder(100);
        sb.append("--");
        sb.append(this.f25056a);
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
        if (this.f25059d) {
            this.f25061f.write(sb.toString().getBytes());
        } else {
            this.f25060e.write(sb.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                break;
            } else if (this.f25059d) {
                this.f25061f.write(bArr, 0, read);
            } else {
                this.f25060e.write(bArr, 0, read);
            }
        }
        fileInputStream.close();
        if (this.f25059d) {
            this.f25061f.write("\r\n".getBytes());
            return;
        }
        this.f25060e.write("\r\n".getBytes());
        this.f25060e.flush();
    }
}
