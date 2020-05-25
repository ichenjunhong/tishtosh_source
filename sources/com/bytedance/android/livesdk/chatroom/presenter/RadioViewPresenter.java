package com.bytedance.android.livesdk.chatroom.presenter;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.rxutils.autodispose.C4005af;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.android.livesdk.message.model.C7863cd;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p831b.C12700b;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12724z;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.io.File;
import p064c.p065a.C1680ad;
import p064c.p065a.C1681ae;
import p064c.p065a.C2203w;

public final class RadioViewPresenter extends C5868cl<C5773a> implements OnMessageListener {

    /* renamed from: a */
    Context f15219a;

    /* renamed from: b */
    private C0199s<KVData> f15220b = new C5846bx(this);

    interface UploadCoverApi {
        @C12718t(mo23886a = "/webcast/room/upload/image_with_risk/")
        C1680ad<C4177d<Object>> upload(@C12700b TypedOutput typedOutput, @C12724z(mo23894a = "room_id") long j, @C12724z(mo23894a = "user_id") long j2);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.RadioViewPresenter$a */
    public interface C5773a extends C6463ay {
        /* renamed from: a */
        Room mo11657a();

        /* renamed from: a */
        void mo11658a(String str);

        /* renamed from: c */
        void mo11659c();

        /* renamed from: d */
        void mo11660d();

        /* renamed from: e */
        void mo11661e();

        /* renamed from: f */
        void mo11662f();

        /* renamed from: g */
        void mo11663g();
    }

    /* renamed from: a */
    public final void mo8247a() {
        this.f15366s.removeObserver(this.f15220b);
        super.mo8247a();
    }

    /* renamed from: b */
    public final void mo11654b() throws Exception {
        ((C4002ac) ((RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class)).removeRoomBackgroundImg(((C5773a) mo8518c()).mo11657a().getId(), ((C5773a) mo8518c()).mo11657a().getOwner().getId()).mo6525a((C2203w<T, ? extends R>) mo11753r())).mo9406a(C5847by.f15315a, new C5848bz(this));
    }

    /* renamed from: d */
    public final void mo11655d() {
        if (TextUtils.isEmpty(((C5773a) mo8518c()).mo11657a().getOwner().getBackgroundImgUrl())) {
            ((C5773a) mo8518c()).mo11659c();
        } else {
            ((C5773a) mo8518c()).mo11660d();
        }
        C8049c.m15979a().mo14203a("background_pic_select", new C8059j().mo14213a("live_take_detail").mo14214b("live_take"), Room.class);
    }

    public RadioViewPresenter(Context context) {
        this.f15219a = context;
    }

    /* renamed from: a */
    public final void mo8520a(C5773a aVar) {
        super.mo8520a(aVar);
        if (this.f15367t != null) {
            this.f15367t.addMessageListener(C8629a.ROOM_IMG_MESSAGE.getIntType(), this);
        }
        this.f15366s.observeForever("cmd_change_radio_cover", this.f15220b);
    }

    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof C7863cd) {
            C7863cd cdVar = (C7863cd) iMessage;
            switch ((int) cdVar.f21757a) {
                case 1:
                    ((C5773a) mo8518c()).mo11658a(cdVar.f21758b);
                    return;
                case 2:
                    ((C5773a) mo8518c()).mo11663g();
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo11653a(String str) {
        long j;
        File file = new File(str);
        if (file.exists()) {
            MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
            multipartTypedOutput.addPart("file", new TypedFile("image/jpeg", file));
            long longValue = ((Long) this.f15366s.get("data_room_id")).longValue();
            User user = (User) this.f15366s.get("data_user_in_room");
            UploadCoverApi uploadCoverApi = (UploadCoverApi) C4514j.m10883j().mo10321b().mo9550a(UploadCoverApi.class);
            if (user != null) {
                j = user.getId();
            } else {
                j = 0;
            }
            ((C4005af) uploadCoverApi.upload(multipartTypedOutput, longValue, j).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(new C5850ca(this), new C5851cb(this));
        }
    }
}
