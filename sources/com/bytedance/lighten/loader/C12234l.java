package com.bytedance.lighten.loader;

import android.net.Uri;
import com.bytedance.lighten.p766a.C12165c;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.imagepipeline.p964d.C13978j;
import com.facebook.imagepipeline.p965e.C14017k;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.p913b.C13613a;
import com.facebook.p913b.C13614b;
import com.facebook.p914c.p915a.C13619c;
import java.io.File;

/* renamed from: com.bytedance.lighten.loader.l */
final class C12234l implements C12165c {
    C12234l() {
    }

    /* renamed from: a */
    public final File mo23082a(Uri uri) {
        C13619c c = C13978j.m28504a().mo26147c(C14229b.fromUri(uri), null);
        C13613a a = C13771c.m27874b().mo26210d().mo25504a(c);
        if (a == null) {
            a = C13771c.m27874b().mo26213g().mo25504a(c);
        }
        if (a instanceof C13614b) {
            File file = ((C13614b) a).f35532a;
            if (file == null || !file.exists()) {
                return null;
            }
            return file;
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo23083b(Uri uri) {
        C13619c c = C13978j.m28504a().mo26147c(C14229b.fromUri(uri), null);
        if (C14017k.m28587a().mo26210d().mo25512d(c) || C14017k.m28587a().mo26213g().mo25512d(c)) {
            return true;
        }
        return false;
    }
}
