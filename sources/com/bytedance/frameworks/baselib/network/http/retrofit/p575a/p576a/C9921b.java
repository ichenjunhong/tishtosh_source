package com.bytedance.frameworks.baselib.network.http.retrofit.p575a.p576a;

import com.bytedance.retrofit2.C12744f;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.C17971f;
import com.google.gson.C18095w;
import com.google.gson.p1078c.C17961c;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

/* renamed from: com.bytedance.frameworks.baselib.network.http.retrofit.a.a.b */
final class C9921b<T> implements C12744f<T, TypedOutput> {

    /* renamed from: a */
    private static final Charset f26990a = Charset.forName("UTF-8");

    /* renamed from: b */
    private final C17971f f26991b;

    /* renamed from: c */
    private final C18095w<T> f26992c;

    /* renamed from: a */
    public final /* synthetic */ Object mo9557a(Object obj) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(PreloadTask.BYTE_UNIT_NUMBER);
        C17961c a = this.f26991b.mo34874a((Writer) new OutputStreamWriter(byteArrayOutputStream, f26990a));
        this.f26992c.write(a, obj);
        a.close();
        return new TypedByteArray("application/json; charset=UTF-8", byteArrayOutputStream.toByteArray(), new String[0]);
    }

    C9921b(C17971f fVar, C18095w<T> wVar) {
        this.f26991b = fVar;
        this.f26992c = wVar;
    }
}
