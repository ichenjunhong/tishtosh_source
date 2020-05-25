package com.p683ss.android.ugc.effectmanager;

import android.content.res.AssetManager;
import com.p683ss.android.ugc.effectmanager.common.C48633d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.effectmanager.a */
public final class C48564a {

    /* renamed from: a */
    public final AssetManager f122045a;

    /* renamed from: b */
    private final Pattern f122046b;

    /* renamed from: a */
    public final boolean mo96083a(String str) {
        try {
            String a = C48633d.m105242a(str);
            if (this.f122046b != null) {
                if (this.f122046b.matcher(a).matches()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" manually excluded by DownloadableModelSupport.exclusionPattern");
                    throw new FileNotFoundException(sb.toString());
                }
            }
            InputStream open = this.f122045a.open(str, 2);
            if (open != null) {
                try {
                    open.close();
                } catch (IOException unused) {
                }
            }
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public C48564a(AssetManager assetManager, Pattern pattern) {
        this.f122045a = assetManager;
        this.f122046b = pattern;
    }
}
