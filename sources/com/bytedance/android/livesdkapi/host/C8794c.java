package com.bytedance.android.livesdkapi.host;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.host.p451a.C8782e;

/* renamed from: com.bytedance.android.livesdkapi.host.c */
public interface C8794c extends C2952b, C8782e {

    /* renamed from: com.bytedance.android.livesdkapi.host.c$a */
    public static class C8795a {

        /* renamed from: a */
        public Throwable f24035a;
    }

    /* renamed from: com.bytedance.android.livesdkapi.host.c$b */
    public interface C8796b {
        /* renamed from: b */
        void mo14127b();

        /* renamed from: c */
        void mo14128c();
    }

    /* renamed from: com.bytedance.android.livesdkapi.host.c$c */
    public interface C8797c {
        /* renamed from: a */
        void mo9145a(Bitmap bitmap);

        /* renamed from: a */
        void mo9146a(C8795a aVar);
    }

    /* renamed from: a */
    C8795a mo15490a(ImageModel imageModel, C8797c cVar);

    /* renamed from: a */
    void mo15491a(String str);

    /* renamed from: a */
    void mo15492a(String str, C8796b bVar);

    /* renamed from: a */
    boolean mo15493a(ImageModel imageModel);

    /* renamed from: b */
    String mo15494b(ImageModel imageModel);

    /* renamed from: b */
    String mo15495b(String str);
}
