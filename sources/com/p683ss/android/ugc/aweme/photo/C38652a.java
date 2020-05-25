package com.p683ss.android.ugc.aweme.photo;

import android.content.Context;
import com.C2240a;
import com.p683ss.android.ugc.aweme.p1463br.C23967a;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.photo.a */
public final class C38652a implements C38706r {

    /* renamed from: a */
    private final String f98324a;

    /* renamed from: b */
    private final SimpleDateFormat f98325b;

    /* renamed from: a */
    public final String mo78585a() {
        return C2240a.m6773a(Locale.getDefault(), "%s/IMG_%s.png", new Object[]{this.f98324a, this.f98325b.format(new Date())});
    }

    public C38652a(Context context) {
        File file = new File(C23967a.m58772a(context));
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f98324a = file.getAbsolutePath();
        this.f98325b = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
    }
}
