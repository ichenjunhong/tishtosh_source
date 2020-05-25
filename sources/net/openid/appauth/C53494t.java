package net.openid.appauth;

import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: net.openid.appauth.t */
final class C53494t {
    /* renamed from: b */
    public static void m113595b(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static String m113594a(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        char[] cArr = new char[PreloadTask.BYTE_UNIT_NUMBER];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }
}
