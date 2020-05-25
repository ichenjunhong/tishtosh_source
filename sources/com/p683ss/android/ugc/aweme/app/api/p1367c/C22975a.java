package com.p683ss.android.ugc.aweme.app.api.p1367c;

import android.text.TextUtils;
import com.bytedance.retrofit2.C12744f;
import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedInput;
import com.google.gson.C17971f;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.app.api.C23011p;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.ss.android.ugc.aweme.app.api.c.a */
public final class C22975a implements C12744f<TypedInput, C22977c> {

    /* renamed from: a */
    static String f61306a = "wire_convert";

    /* renamed from: c */
    private static AtomicBoolean f61307c = new AtomicBoolean(true);

    /* renamed from: b */
    public final Type f61308b;

    /* renamed from: d */
    private final C17971f f61309d;

    /* renamed from: e */
    private final C23011p f61310e;

    /* renamed from: a */
    private C22977c m56498a(TypedInput typedInput) throws IOException {
        String str = "UTF-8";
        if (typedInput.mimeType() != null) {
            str = MimeUtil.parseCharset(typedInput.mimeType(), str);
        }
        InputStreamReader inputStreamReader = new InputStreamReader(typedInput.mo9554in(), str);
        try {
            return new C22977c(this.f61309d.mo34877a(C17956a.m44007a(this.f61308b)).read(this.f61309d.mo34873a((Reader) inputStreamReader)), null);
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9557a(Object obj) throws IOException {
        boolean z;
        int i;
        TypedInput typedInput = (TypedInput) obj;
        Type type = this.f61308b;
        boolean z2 = true;
        if (!(type == null || type != FeedItemList.class || typedInput == null)) {
            String mimeType = typedInput.mimeType();
            if (TextUtils.isEmpty(mimeType) || !mimeType.contains("json")) {
                z = false;
            } else {
                z = true;
            }
            C22574a f = C22574a.m55738f();
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            if (f.f60706g == -1) {
                f.f60706g = i;
            }
        }
        String mimeType2 = typedInput.mimeType();
        if (TextUtils.isEmpty(mimeType2) || !mimeType2.contains("json")) {
            z2 = false;
        }
        if (f61307c.get()) {
            f61307c.getAndSet(false);
            C2201v.m6614b("").mo6514a(C2168a.m6521b()).mo6545f((C1710e<? super T>) new C22976b<Object>(z2));
        }
        if (!z2) {
            return new C22977c(null, this.f61310e.mo9557a(typedInput));
        }
        C32458a.m75150b("ComposePbAndJson", "response json");
        return m56498a(typedInput);
    }

    public C22975a(ParameterizedType parameterizedType, C17971f fVar) {
        this.f61309d = fVar;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        this.f61310e = new C23011p(ProtoAdapter.get((Class) actualTypeArguments[0]));
        this.f61308b = actualTypeArguments[1];
    }
}
