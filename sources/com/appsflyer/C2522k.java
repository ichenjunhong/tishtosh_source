package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetPreloadTimeoutExperiment;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.appsflyer.k */
final class C2522k extends AsyncTask<String, Void, String> {

    /* renamed from: ʻ */
    private WeakReference<Context> f7831;

    /* renamed from: ʼ */
    private boolean f7832;

    /* renamed from: ʽ */
    private boolean f7833;

    /* renamed from: ˊ */
    private boolean f7834;

    /* renamed from: ˋ */
    Map<String, String> f7835;

    /* renamed from: ˎ */
    private boolean f7836;

    /* renamed from: ˏ */
    private String f7837 = "";

    /* renamed from: ॱ */
    String f7838;

    /* renamed from: ॱॱ */
    private URL f7839;

    /* renamed from: ᐝ */
    public HttpURLConnection f7840;

    /* access modifiers changed from: protected */
    public final void onCancelled() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˏ */
    public final void mo7022() {
        this.f7833 = false;
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        if (this.f7838 == null) {
            this.f7838 = new JSONObject(this.f7835).toString();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ॱ */
    public final void onPostExecute(String str) {
        if (this.f7834) {
            AFLogger.afInfoLog("Connection error: ".concat(String.valueOf(str)));
        } else {
            AFLogger.afInfoLog("Connection call succeeded: ".concat(String.valueOf(str)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ॱ */
    public final String doInBackground(String... strArr) {
        String str;
        if (this.f7836) {
            return null;
        }
        try {
            this.f7839 = new URL(strArr[0]);
            if (this.f7833) {
                C2537s.m7429().mo7048(this.f7839.toString(), this.f7838);
                int length = this.f7838.getBytes("UTF-8").length;
                StringBuilder sb = new StringBuilder("call = ");
                sb.append(this.f7839);
                sb.append("; size = ");
                sb.append(length);
                sb.append(" byte");
                if (length > 1) {
                    str = "s";
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append("; body = ");
                sb.append(this.f7838);
                C25134.m7371(sb.toString());
            }
            this.f7840 = (HttpURLConnection) this.f7839.openConnection();
            this.f7840.setReadTimeout(VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT);
            this.f7840.setConnectTimeout(VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT);
            this.f7840.setRequestMethod("POST");
            this.f7840.setDoInput(true);
            this.f7840.setDoOutput(true);
            this.f7840.setRequestProperty("Content-Type", "application/json");
            OutputStream outputStream = this.f7840.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            bufferedWriter.write(this.f7838);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
            this.f7840.connect();
            int responseCode = this.f7840.getResponseCode();
            if (this.f7832) {
                AppsFlyerLib.getInstance();
                this.f7837 = AppsFlyerLib.m7287(this.f7840);
            }
            if (this.f7833) {
                C2537s.m7429().mo7047(this.f7839.toString(), responseCode, this.f7837);
            }
            if (responseCode == 200) {
                AFLogger.afInfoLog("Status 200 ok");
                Context context = (Context) this.f7831.get();
                if (this.f7839.toString().startsWith(ServerConfigHandler.getUrl(AppsFlyerLib.f7708)) && context != null) {
                    Editor edit = C35807d.m80935a(context, "appsflyer-data", 0).edit();
                    edit.putBoolean("sentRegisterRequestToAF", true);
                    edit.apply();
                    AFLogger.afDebugLog("Successfully registered for Uninstall Tracking");
                }
            } else {
                this.f7834 = true;
            }
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("Error while calling ");
            sb2.append(this.f7839.toString());
            AFLogger.afErrorLog(sb2.toString(), th);
            this.f7834 = true;
        }
        return this.f7837;
    }

    C2522k(Context context, boolean z) {
        this.f7831 = new WeakReference<>(context);
        this.f7833 = true;
        this.f7832 = true;
        this.f7836 = z;
    }
}
