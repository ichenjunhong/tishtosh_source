package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.support.p030v4.app.Fragment;
import com.bytedance.android.live.base.model.user.C3011j;
import com.bytedance.android.live.core.p226e.p228b.C3844a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.room.C4182c.C4183a;
import com.bytedance.android.livesdk.browser.p292f.C4750d;
import com.bytedance.android.livesdk.chatroom.api.UploadApi;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4606p;
import com.bytedance.ies.p675g.p677b.C10779d;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;
import java.io.File;
import p064c.p065a.C1683ag;
import p064c.p065a.C1686aj;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bc */
public final class C4865bc extends C10779d<C4867a, C4868b> implements C4183a {

    /* renamed from: a */
    public C4606p f13097a;

    /* renamed from: b */
    public Fragment f13098b;

    /* renamed from: c */
    public C1690c f13099c;

    /* renamed from: d */
    private int f13100d;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bc$a */
    static final class C4867a {
        @C17952c(mo34828a = "aspect_x")

        /* renamed from: a */
        int f13103a;
        @C17952c(mo34828a = "aspect_y")

        /* renamed from: b */
        int f13104b;
        @C17952c(mo34828a = "min_width")

        /* renamed from: c */
        int f13105c;
        @C17952c(mo34828a = "min_height")

        /* renamed from: d */
        int f13106d;
        @C17952c(mo34828a = "max_size")

        /* renamed from: e */
        int f13107e;

        C4867a() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bc$b */
    static final class C4868b {
        @C17952c(mo34828a = "uri")

        /* renamed from: a */
        String f13108a;
        @C17952c(mo34828a = "url")

        /* renamed from: b */
        String f13109b;

        private C4868b(String str, String str2) {
            this.f13108a = str;
            this.f13109b = str2;
        }
    }

    /* renamed from: b_ */
    public final void mo8916b_() {
        mo10628b();
    }

    /* renamed from: b */
    public final void mo10628b() {
        if (this.f13097a != null) {
            this.f13097a.mo9579b();
            this.f13097a = null;
        }
        finishWithFailure();
    }

    public final void onTerminate() {
        if (this.f13099c != null) {
            this.f13099c.dispose();
        }
        this.f13098b = null;
        this.f13097a.mo9579b();
    }

    public C4865bc(Fragment fragment) {
        this.f13098b = fragment;
    }

    public final /* synthetic */ void invoke(Object obj, C10783f fVar) throws Exception {
        int i;
        C4867a aVar = (C4867a) obj;
        if (aVar.f13107e > 0) {
            i = aVar.f13107e;
        } else {
            i = Integer.MAX_VALUE;
        }
        this.f13100d = i;
        C4606p pVar = new C4606p(null, this.f13098b, "upload_photo_method", aVar.f13103a, aVar.f13104b, aVar.f13105c, aVar.f13106d, this);
        this.f13097a = pVar;
        this.f13097a.mo9580c();
    }

    /* renamed from: a */
    public final void mo8915a(final String str, String str2) {
        this.f13097a.mo9577a();
        File file = new File(str);
        if (!file.exists()) {
            mo10628b();
        } else if (file.length() >= ((long) this.f13100d)) {
            C4575an.m10987a(C3922z.m9905a((int) R.string.eo4, Integer.valueOf((this.f13100d / PreloadTask.BYTE_UNIT_NUMBER) / PreloadTask.BYTE_UNIT_NUMBER)));
        } else {
            MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
            multipartTypedOutput.addPart("data", new TypedFile("multipart/form-data", file));
            ((UploadApi) C4514j.m10883j().mo10321b().mo9550a(UploadApi.class)).upload(multipartTypedOutput).mo6149a((C1686aj<? super T, ? extends R>) C4064k.m10182a()).mo6159b((C1683ag<? super T>) new C1683ag<C4177d<C3011j>>() {
                public final void onSubscribe(C1690c cVar) {
                    C4865bc.this.f13099c = cVar;
                }

                public final void onError(Throwable th) {
                    Context context = C4865bc.this.f13098b.getContext();
                    if (context != null) {
                        C3844a.m9755a(context, th);
                    }
                    C4865bc.this.mo10628b();
                }

                public final /* synthetic */ void onSuccess(Object obj) {
                    C4177d dVar = (C4177d) obj;
                    ((C3011j) dVar.data).f8849b = str;
                    C4865bc bcVar = C4865bc.this;
                    C3011j jVar = (C3011j) dVar.data;
                    String str = str;
                    if (bcVar.f13097a != null) {
                        bcVar.f13097a.mo9579b();
                        bcVar.f13097a = null;
                    }
                    String str2 = jVar.f8848a;
                    C4514j.m10883j().mo10323d().mo10332d();
                    bcVar.finishWithResult(new C4868b(str2, C4750d.m11316a(str)));
                }
            });
        }
    }
}
