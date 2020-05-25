package com.p683ss.android.ugc.aweme.photo;

import android.graphics.Bitmap.CompressFormat;
import com.C2240a;
import com.p683ss.android.ugc.aweme.out.AVServiceImpl;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.photo.c */
public final class C38655c implements C38706r {

    /* renamed from: a */
    public CompressFormat f98326a = CompressFormat.PNG;

    /* renamed from: b */
    private final String f98327b;

    /* renamed from: c */
    private final SimpleDateFormat f98328c;

    public C38655c() {
        File file = new File(AVServiceImpl.createIInternalAVServicebyMonsterPlugin().shortVideoDir(), "photo");
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f98327b = file.getAbsolutePath();
        this.f98328c = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
    }

    /* renamed from: a */
    public final String mo78585a() {
        String str = ".png";
        if (this.f98326a == CompressFormat.JPEG) {
            str = ".jpeg";
        }
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder("%s/IMG_%s");
        sb.append(str);
        return C2240a.m6773a(locale, sb.toString(), new Object[]{this.f98327b, this.f98328c.format(new Date())});
    }
}
