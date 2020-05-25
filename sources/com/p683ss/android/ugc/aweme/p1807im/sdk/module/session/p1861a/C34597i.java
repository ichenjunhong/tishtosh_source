package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.p1596h.C26891a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.ChatRoomActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.stranger.C34679a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.stranger.C34684c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34030j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35233bh;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35457c;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import org.greenrobot.eventbus.C53755c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.a.i */
public class C34597i extends C34567a {

    /* renamed from: d */
    public IMUser f89142d;

    /* renamed from: b */
    public int mo72634b() {
        return 1;
    }

    /* renamed from: c */
    public final IMUser mo72635c() {
        return this.f89142d;
    }

    /* renamed from: a */
    public C35457c mo72633a() {
        return new C35457c() {
            /* renamed from: a */
            public final void mo72636a(Context context, final C35456b bVar, int i) {
                if (i == 1) {
                    IMUser c = C34597i.this.mo72635c();
                    c.setType(4);
                    ChatRoomActivity.m76450a(context, c, 2);
                    C35190af.m79442a();
                    C35190af.m79461a(bVar.bm_(), "stranger");
                } else if (i == 2) {
                    C34030j.f87981c.mo71978c(C34597i.this.mo72635c().getUid());
                    C35233bh.m79635a(C34597i.this.bm_());
                } else {
                    if (i == 0) {
                        C26891a aVar = new C26891a(context);
                        aVar.mo54844a((CharSequence[]) new String[]{context.getResources().getString(R.string.bge)}, (OnClickListener) new OnClickListener() {
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                                if (i == 0) {
                                    C34684c a = C34684c.m78664a();
                                    String bm_ = bVar.bm_();
                                    if (bm_ != null) {
                                        C23566n.m57766a().mo48750a(a.f89353a, new Callable(Long.parseLong(bm_)) {

                                            /* renamed from: a */
                                            final /* synthetic */ long f90629a;

                                            public final Object call() throws Exception {
                                                try {
                                                    return C35286u.f90624a.deleteStrangerSingleSession(this.f90629a).get();
                                                } catch (ExecutionException e) {
                                                    throw C35202ap.m79581a(e);
                                                }
                                            }

                                            {
                                                this.f90629a = r1;
                                            }
                                        }, 6);
                                    }
                                    C53755c.m114319a().mo112960d(new C34679a(0, bm_));
                                    C35190af.m79442a();
                                    C35190af.m79482b(bVar.bm_());
                                }
                            }
                        });
                        aVar.mo54845b();
                    }
                }
            }
        };
    }
}
