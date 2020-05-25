package com.bytedance.ies.ugc.aweme.network;

import com.bytedance.retrofit2.C12744f;
import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.google.gson.C17971f;
import com.google.gson.C18095w;
import com.p683ss.android.ugc.aweme.app.api.C22974c;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/* renamed from: com.bytedance.ies.ugc.aweme.network.d */
final class C11028d<T> implements C12744f<TypedInput, T> {

    /* renamed from: a */
    private final C17971f f29629a;

    /* renamed from: b */
    private final C18095w<T> f29630b;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public T mo9557a(TypedInput typedInput) throws IOException {
        String str = "UTF-8";
        if (typedInput.mimeType() != null) {
            str = MimeUtil.parseCharset(typedInput.mimeType(), str);
        }
        InputStreamReader inputStreamReader = new InputStreamReader(typedInput.mo9554in(), str);
        try {
            T read = this.f29630b.read(this.f29629a.mo34873a((Reader) inputStreamReader));
            if ((read instanceof C22974c) && (typedInput instanceof TypedByteArray)) {
                ((C22974c) read).mo47748a(new String(((TypedByteArray) typedInput).getBytes(), str));
            }
            return read;
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException unused) {
            }
        }
    }

    C11028d(C17971f fVar, C18095w<T> wVar) {
        this.f29629a = fVar;
        this.f29630b = wVar;
    }
}
