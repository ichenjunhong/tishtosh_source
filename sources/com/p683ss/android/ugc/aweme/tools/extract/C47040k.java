package com.p683ss.android.ugc.aweme.tools.extract;

import com.p683ss.android.ugc.aweme.photo.C38706r;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.k */
public final class C47040k implements C38706r {

    /* renamed from: a */
    public String f118792a = C39618d.f101160a.getFilesDir().getAbsolutePath();

    /* renamed from: a */
    public final String mo78585a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f118792a);
        sb.append(File.separator);
        sb.append("extract-frame-");
        sb.append(System.currentTimeMillis());
        sb.append(".jpg");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo94333a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(C39618d.f101160a.getFilesDir());
        sb.append(File.separator);
        sb.append(str);
        sb.append(File.separator);
        sb.append(str2);
        this.f118792a = sb.toString();
        File file = new File(this.f118792a);
        if (!file.exists()) {
            file.mkdirs();
        }
    }
}
