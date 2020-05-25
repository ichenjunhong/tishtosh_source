package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@C16299uq
public final class afg implements aev {

    /* renamed from: a */
    private final String f40399a;

    public afg() {
        this(null);
    }

    public afg(String str) {
        this.f40399a = str;
    }

    /* renamed from: a */
    public final void mo28681a(String str) {
        HttpURLConnection httpURLConnection;
        String str2 = "Pinging URL: ";
        try {
            String valueOf = String.valueOf(str);
            afc.m32792b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            aes.m32756a(true, httpURLConnection, this.f40399a);
            aew aew = new aew();
            aew.mo28767a(httpURLConnection, (byte[]) null);
            int responseCode = httpURLConnection.getResponseCode();
            aew.mo28766a(httpURLConnection, responseCode);
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
                sb.append("Received non-success response code ");
                sb.append(responseCode);
                sb.append(" from pinging URL: ");
                sb.append(str);
                afc.m32798e(sb.toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message).length());
            sb2.append("Error while parsing ping URL: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            afc.m32798e(sb2.toString());
        } catch (IOException e2) {
            String message2 = e2.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message2).length());
            sb3.append("Error while pinging URL: ");
            sb3.append(str);
            sb3.append(". ");
            sb3.append(message2);
            afc.m32798e(sb3.toString());
        } catch (RuntimeException e3) {
            String message3 = e3.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length());
            sb4.append("Error while pinging URL: ");
            sb4.append(str);
            sb4.append(". ");
            sb4.append(message3);
            afc.m32798e(sb4.toString());
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
