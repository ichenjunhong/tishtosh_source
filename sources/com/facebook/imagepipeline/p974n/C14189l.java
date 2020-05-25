package com.facebook.imagepipeline.p974n;

import android.net.Uri;
import android.util.Base64;
import com.facebook.common.p918b.C13660a;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p923g.C13711i;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p975o.C14229b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.imagepipeline.n.l */
public final class C14189l extends C14108ac {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo26348a() {
        return "DataFetchProducer";
    }

    public C14189l(C13711i iVar) {
        super(C13660a.m27612a(), iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C14044e mo26347a(C14229b bVar) throws IOException {
        boolean z;
        byte[] bArr;
        String uri = bVar.mSourceUri.toString();
        C13689i.m27655a(uri.substring(0, 5).equals("data:"));
        int indexOf = uri.indexOf(44);
        String substring = uri.substring(indexOf + 1, uri.length());
        String substring2 = uri.substring(0, indexOf);
        if (!substring2.contains(";")) {
            z = false;
        } else {
            String[] split = substring2.split(";");
            z = split[split.length - 1].equals("base64");
        }
        if (z) {
            bArr = Base64.decode(substring, 0);
        } else {
            bArr = Uri.decode(substring).getBytes();
        }
        return mo26353a((InputStream) new ByteArrayInputStream(bArr), bArr.length);
    }
}
