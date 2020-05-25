package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.p030v4.app.Fragment;
import android.text.Spannable;
import com.bytedance.android.live.base.model.user.C3007g;
import com.bytedance.android.live.broadcast.api.p197d.C3054d;
import com.bytedance.android.live.broadcast.model.C3459f;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.core.p225d.C3833a;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4182c;
import com.bytedance.android.live.room.C4182c.C4183a;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.chatroom.p309e.C5115z;
import com.bytedance.android.livesdk.message.model.C7861cb;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.widget.C8555i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import org.json.JSONObject;
import p064c.p065a.C1673aa;
import p064c.p065a.C1674ab;
import p064c.p065a.C1683ag;
import p064c.p065a.C1686aj;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.bytedance.android.live.broadcast.widget.o */
public final class C3781o implements C3054d, C4183a {

    /* renamed from: e */
    private static int f10683e = 1;

    /* renamed from: f */
    private static int f10684f = 1;

    /* renamed from: g */
    private static int f10685g = 750;

    /* renamed from: h */
    private static int f10686h = 750;

    /* renamed from: a */
    long f10687a;

    /* renamed from: b */
    Context f10688b;

    /* renamed from: c */
    C4182c f10689c;

    /* renamed from: d */
    public final C1689b f10690d = new C1689b();

    /* renamed from: i */
    private Room f10691i;

    /* renamed from: j */
    private long f10692j;

    /* renamed from: k */
    private int f10693k;

    /* renamed from: l */
    private OnClickListener f10694l = new C3784p(this);

    /* renamed from: m */
    private OnClickListener f10695m = new C3785q(this);

    /* renamed from: a */
    public final void mo8320a() {
        this.f10690d.dispose();
        if (this.f10689c != null) {
            this.f10689c.mo9579b();
        }
    }

    /* renamed from: b_ */
    public final void mo8916b_() {
        this.f10689c.mo9579b();
        this.f10690d.dispose();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public HashMap<String, String> mo9155b() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("room_id", String.valueOf(this.f10687a));
        hashMap.put("anchor_id", String.valueOf(this.f10692j));
        return hashMap;
    }

    /* renamed from: a */
    public final void mo9154a(Throwable th) {
        String str;
        if (th instanceof FileNotFoundException) {
            str = this.f10688b.getString(R.string.eyk);
        } else if (th instanceof C2949a) {
            str = ((C2949a) th).getErrorMsg();
        } else {
            str = this.f10688b.getString(R.string.f2z);
        }
        this.f10689c.mo9579b();
        C4204a.m10423a(this.f10688b, str);
    }

    /* renamed from: a */
    public final void mo8322a(C7861cb cbVar) {
        if (this.f10693k <= 0) {
            Spannable a = C5115z.m11756a(cbVar.f21741d, cbVar.f21741d.f24156b);
            Spannable a2 = C5115z.m11756a(cbVar.f21743f, cbVar.f21743f.f24156b);
            C8555i.m16887a();
            C8555i.m16886a(this.f10688b).mo15013d((CharSequence) a).mo15009c((CharSequence) a2).mo15004b(0, (CharSequence) this.f10688b.getString(R.string.e4g), this.f10694l).mo15004b(1, (CharSequence) this.f10688b.getString(R.string.eey), this.f10695m).mo15010c(false).mo15011d();
            this.f10693k++;
            C8049c.m15979a().mo14202a("livesdk_change_cover_window_show", mo9155b(), new Object[0]);
        }
    }

    public C3781o(Fragment fragment, Room room) {
        this.f10691i = room;
        this.f10688b = fragment.getContext();
        this.f10693k = 0;
        this.f10687a = this.f10691i.getId();
        this.f10692j = this.f10691i.getOwnerUserId();
        this.f10689c = ((ILiveSDKService) C4116c.m10249a(ILiveSDKService.class)).createImagePicker(fragment.getActivity(), fragment, "cover", f10683e, f10684f, f10685g, f10686h, this);
    }

    /* renamed from: a */
    public final void mo8915a(final String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            StringBuilder sb = new StringBuilder("avatar file don't exists in path");
            sb.append(str);
            mo9154a((Throwable) new FileNotFoundException(sb.toString()));
            return;
        }
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("file", new TypedFile("multipart/form-data", file));
        C3395f.m9156f().mo8742c().mo9021d().uploadAvatar(multipartTypedOutput).mo6149a((C1686aj<? super T, ? extends R>) C4064k.m10182a()).mo6159b((C1683ag<? super T>) new C1683ag<C4177d<C3007g>>() {
            public final void onSubscribe(C1690c cVar) {
                C3781o.this.f10690d.mo6181a(cVar);
            }

            public final void onError(Throwable th) {
                C3781o.this.mo9154a(th);
                JSONObject jSONObject = new JSONObject();
                C3833a.m9731a(jSONObject, "error_code", "1");
                C3833a.m9731a(jSONObject, "error_msg", th.toString());
                C3837e.m9744a("ttlive_upload_cover_all", 1, jSONObject);
                C3837e.m9744a("ttlive_upload_cover_error", 1, jSONObject);
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                C4177d dVar = (C4177d) obj;
                ((C3007g) dVar.data).f8842c = str;
                C3781o oVar = C3781o.this;
                C3007g gVar = (C3007g) dVar.data;
                C8049c.m15979a().mo14202a("livesdk_upload_cover_success", oVar.mo9155b(), new Object[0]);
                oVar.f10689c.mo9579b();
                C4204a.m10423a(oVar.f10688b, oVar.f10688b.getString(R.string.epy));
                C3395f.m9156f().mo8742c().mo9020c().updateRoomInfo(oVar.f10687a, gVar.f8840a).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6314a((C1674ab<? super T>) new C1674ab<C4177d<C3459f>>() {
                    public final void onComplete() {
                    }

                    public final void onError(Throwable th) {
                    }

                    public final void onSubscribe(C1690c cVar) {
                        C3781o.this.f10690d.mo6181a(cVar);
                    }

                    public final /* synthetic */ void onNext(Object obj) {
                        C4177d dVar = (C4177d) obj;
                        C3781o oVar = C3781o.this;
                        if (dVar != null) {
                            try {
                                if (dVar.data != null && ((C3459f) dVar.data).f9899a.booleanValue()) {
                                    C8049c.m15979a().mo14202a("livesdk_cover_pass_audit", oVar.mo9155b(), new Object[0]);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                });
                C3837e.m9744a("ttlive_upload_cover_all", 0, (JSONObject) null);
            }
        });
    }

    /* renamed from: a */
    public final void mo8321a(int i, int i2, Intent intent) {
        this.f10689c.mo9578a(i, i2, intent);
    }
}
