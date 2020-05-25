package com.p683ss.android.ugc.aweme.tools.beauty.p2351c;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.p683ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.io.File;
import java.io.IOException;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.c.c */
public final class C46833c {
    /* renamed from: a */
    public static final boolean m101688a(ComposerBeauty composerBeauty) {
        C52711k.m112240b(composerBeauty, "beautyBean");
        File file = new File(composerBeauty.getEffect().getUnzipPath());
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    CharSequence charSequence = FilterModel.CONFIG_FILE;
                    C52711k.m112236a((Object) file2, "it");
                    if (TextUtils.equals(charSequence, file2.getName())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final void m101689b(ComposerBeauty composerBeauty) {
        C52711k.m112240b(composerBeauty, "beautyBean");
        if (!m101688a(composerBeauty)) {
            Effect effect = composerBeauty.getEffect();
            File file = new File(effect.getZipPath());
            try {
                C48671i.f122310a.mo96264e(effect.getUnzipPath());
                C48671i.f122310a.mo96258b(effect.getZipPath(), effect.getUnzipPath());
            } catch (IOException e) {
                C50203g.m108361b(Log.getStackTraceString(e));
            } finally {
                file.delete();
            }
        }
    }
}
