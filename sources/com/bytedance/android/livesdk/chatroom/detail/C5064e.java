package com.bytedance.android.livesdk.chatroom.detail;

import android.os.Looper;
import android.os.Message;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.model.C5748f;
import com.bytedance.android.livesdk.chatroom.p306bl.C5001aa;
import com.bytedance.android.livesdk.chatroom.p306bl.C5002ab;
import com.bytedance.android.livesdk.chatroom.p306bl.C5014i;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4550a;
import com.bytedance.android.livesdk.p279af.C4605o;
import com.bytedance.android.livesdk.p279af.C4610t;
import com.bytedance.android.livesdkapi.C8728e;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C8844a;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import p064c.p065a.C1673aa;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.e */
public final class C5064e implements C9382a {

    /* renamed from: a */
    public final C9381g f13545a;

    /* renamed from: b */
    public final Queue<C8844a> f13546b = new LinkedList();

    /* renamed from: c */
    public boolean f13547c = false;

    /* renamed from: d */
    public C5748f f13548d;

    /* renamed from: e */
    private final C5066a f13549e;

    /* renamed from: f */
    private final long f13550f;

    /* renamed from: g */
    private final String f13551g;

    /* renamed from: h */
    private final String f13552h;

    /* renamed from: i */
    private final String f13553i;

    /* renamed from: j */
    private final String f13554j;

    /* renamed from: k */
    private final String f13555k;

    /* renamed from: l */
    private final C8728e f13556l = new C8728e() {
    };

    /* renamed from: m */
    private boolean f13557m = false;

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.e$a */
    public interface C5066a {
        /* renamed from: a */
        void mo10940a(int i, String str, String str2);

        /* renamed from: a */
        void mo10941a(C5748f fVar);
    }

    /* renamed from: b */
    public final void mo10939b() {
        this.f13547c = false;
        this.f13557m = true;
        this.f13548d = null;
        this.f13545a.removeCallbacksAndMessages(null);
        this.f13546b.clear();
    }

    /* renamed from: a */
    public final void mo10938a() {
        long j;
        if (!this.f13547c) {
            this.f13557m = false;
            this.f13547c = true;
            C5014i a = C5014i.m11508a();
            C9381g gVar = this.f13545a;
            long j2 = this.f13550f;
            String str = this.f13551g;
            String str2 = this.f13552h;
            String str3 = this.f13553i;
            String str4 = this.f13555k;
            if ("draw".equals(str2) && "live_detail-hourly_rank".equals(str4)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str4);
                sb.append(str2);
                str4 = sb.toString();
            }
            HashMap<String, String> hashMap = new C4605o().mo10399a("common_label_list", str3).mo10399a("enter_source", str4).mo10399a("request_id", str).mo10399a("enter_type", str2).f12568a;
            C4610t.m11071b(C8830k.m17329c(), C4550a.CMAF);
            if (TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
                j = 1;
            } else {
                j = 0;
            }
            ((RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class)).enterRoom(j2, 1, j, hashMap).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C5001aa<Object>(a, gVar, j2), (C1710e<? super Throwable>) new C5002ab<Object>(a, gVar, j2));
            this.f13546b.clear();
        }
    }

    public final void handleMsg(Message message) {
        if (message.what == 32 && !this.f13557m) {
            mo10938a();
        } else if (message.what == 4 && this.f13547c) {
            if (message.obj instanceof C2949a) {
                C2949a aVar = (C2949a) message.obj;
                m11572a(aVar.getErrorCode(), aVar.getErrorMsg(), aVar.getPrompt());
            } else if (message.obj instanceof Exception) {
                m11572a(0, message.obj.toString(), null);
            } else if (!(message.obj instanceof C5748f) || ((C5748f) message.obj).f15110a == null || !Room.isValid(((C5748f) message.obj).f15110a)) {
                String str = "invalid room data";
                if (!(message.obj instanceof C5748f)) {
                    str = "response unexpected";
                } else if (((C5748f) message.obj).f15110a == null) {
                    str = "room is null";
                }
                m11572a(0, str, null);
            } else {
                C5748f fVar = (C5748f) message.obj;
                this.f13548d = fVar;
                this.f13547c = false;
                this.f13549e.mo10941a(fVar);
            }
        }
    }

    /* renamed from: a */
    private void m11572a(int i, String str, String str2) {
        this.f13547c = false;
        this.f13549e.mo10940a(i, str, str2);
    }

    public C5064e(C5066a aVar, long j, String str, String str2, String str3, String str4, String str5) {
        this.f13549e = aVar;
        this.f13550f = j;
        this.f13551g = str;
        this.f13552h = str2;
        this.f13545a = new C9381g(Looper.getMainLooper(), this);
        this.f13553i = str3;
        this.f13554j = str4;
        this.f13555k = str5;
    }
}
