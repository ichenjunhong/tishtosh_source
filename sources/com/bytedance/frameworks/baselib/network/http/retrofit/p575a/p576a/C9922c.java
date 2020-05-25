package com.bytedance.frameworks.baselib.network.http.retrofit.p575a.p576a;

import com.bytedance.retrofit2.C12744f;
import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedInput;
import com.google.gson.C17971f;
import com.google.gson.C18095w;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/* renamed from: com.bytedance.frameworks.baselib.network.http.retrofit.a.a.c */
final class C9922c<T> implements C12744f<TypedInput, T> {

    /* renamed from: a */
    private final C17971f f26993a;

    /* renamed from: b */
    private final C18095w<T> f26994b;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public T mo9557a(TypedInput typedInput) throws IOException {
        String str = "UTF-8";
        if (typedInput.mimeType() != null) {
            str = MimeUtil.parseCharset(typedInput.mimeType(), str);
        }
        InputStreamReader inputStreamReader = new InputStreamReader(typedInput.mo9554in(), str);
        try {
            return this.f26994b.read(this.f26993a.mo34873a((Reader) inputStreamReader));
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException unused) {
            }
        }
    }

    C9922c(C17971f fVar, C18095w<T> wVar) {
        this.f26993a = fVar;
        this.f26994b = wVar;
    }
}
