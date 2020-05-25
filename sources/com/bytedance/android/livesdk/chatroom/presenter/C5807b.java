package com.bytedance.android.livesdk.chatroom.presenter;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.event.C5166al;
import com.bytedance.android.livesdk.chatroom.event.C5167am;
import com.bytedance.android.livesdk.chatroom.event.C5168an;
import com.bytedance.android.livesdk.chatroom.event.C5195o;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.chatroom.p306bl.C5012g;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.android.livesdk.chatroom.viewmodule.p326a.p327a.C6435e;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6597a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6605h;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6610k;
import com.bytedance.android.livesdk.message.model.C7859c;
import com.bytedance.android.livesdk.message.model.C7868ci;
import com.bytedance.android.livesdk.message.model.C8001m;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.b */
public final class C5807b extends C5868cl<C5809a> implements OnMessageListener {

    /* renamed from: a */
    boolean f15257a = true;

    /* renamed from: b */
    boolean f15258b = true;

    /* renamed from: c */
    Room f15259c;

    /* renamed from: d */
    private boolean f15260d = true;

    /* renamed from: e */
    private boolean f15261e = true;

    /* renamed from: f */
    private C1689b f15262f;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.b$1 */
    static /* synthetic */ class C58081 {

        /* renamed from: a */
        static final /* synthetic */ int[] f15263a = new int[C8629a.values().length];

        static {
            try {
                f15263a[C8629a.ROOM_VERIFY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.b$a */
    public interface C5809a extends C6463ay {
        /* renamed from: a */
        void mo11690a(Barrage barrage);

        /* renamed from: a */
        void mo11691a(C8001m mVar);

        /* renamed from: a */
        void mo11692a(Exception exc);

        /* renamed from: a */
        void mo11693a(boolean z);

        /* renamed from: b */
        void mo11694b(Exception exc);
    }

    /* renamed from: a */
    public final void mo8247a() {
        super.mo8247a();
        if (this.f15262f != null) {
            this.f15262f.dispose();
        }
        this.f15262f = null;
    }

    /* renamed from: b */
    private static void m12676b(int i) {
        C6435e eVar = new C6435e(i);
        C6610k.m13987c().mo12667a(C6605h.EMOTION, (C6597a) eVar);
        C6610k.m13987c().mo12667a(C6605h.DIVIDER, (C6597a) eVar);
    }

    /* renamed from: a */
    private static void m12675a(int i) {
        boolean z;
        C6610k.m13987c().mo12667a(C6605h.GIFT, (C6597a) new C6435e(i));
        C8064d.m16005b();
        String str = "ttlive_gift";
        StringBuilder sb = new StringBuilder("Gift icon status changed, visiable:");
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(", reason:CommentPresenter sendGiftVisibilityCommand");
        C8064d.m9720b(str, sb.toString());
    }

    /* renamed from: a */
    public final void mo11687a(C5166al alVar) {
        if (this.f15262f == null || TextUtils.isEmpty(alVar.f13846a) || !this.f15257a) {
            C4495a.m10823a().mo10301a((Object) new C5167am(alVar, false));
            return;
        }
        String str = null;
        if (alVar.mo11040a().get("live.intent.extra.ENTER_LIVE_SOURCE") instanceof String) {
            str = (String) alVar.mo11040a().get("live.intent.extra.ENTER_LIVE_SOURCE");
        }
        String str2 = str;
        this.f15257a = false;
        this.f15262f.mo6181a(C5012g.m11504b(alVar.f13846a, this.f15259c.getId(), this.f15259c.getRequestId(), this.f15259c.getLabels(), str2).mo6505a((C1710e<? super T>) new C5871f<Object>(this, alVar), (C1710e<? super Throwable>) new C5872g<Object>(this, alVar)));
    }

    /* renamed from: a */
    public final void mo11688a(C5168an anVar) {
        if (this.f15262f == null || TextUtils.isEmpty(anVar.f13851a) || !this.f15258b) {
            C4495a.m10823a().mo10301a((Object) new C5167am(anVar, false));
            return;
        }
        String str = null;
        if (anVar.mo11047a().get("live.intent.extra.ENTER_LIVE_SOURCE") instanceof String) {
            str = (String) anVar.mo11047a().get("live.intent.extra.ENTER_LIVE_SOURCE");
        }
        String str2 = str;
        this.f15258b = false;
        this.f15262f.mo6181a(C5012g.m11503a(anVar.f13851a, this.f15259c.getId(), this.f15259c.getRequestId(), this.f15259c.getLabels(), str2).mo6505a((C1710e<? super T>) new C5869d<Object>(this, anVar), (C1710e<? super Throwable>) new C5870e<Object>(this, anVar)));
    }

    /* renamed from: a */
    public final void mo8520a(C5809a aVar) {
        super.mo8520a(aVar);
        this.f15259c = (Room) this.f15366s.get("data_room");
        this.f15257a = true;
        this.f15258b = true;
        if (this.f15367t != null) {
            this.f15367t.addMessageListener(C8629a.ROOM_VERIFY.getIntType(), this);
        }
        if (this.f15262f != null) {
            this.f15262f.dispose();
        }
        this.f15262f = new C1689b();
        this.f15262f.mo6181a(C4495a.m10823a().mo10300a(C5195o.class).mo6545f((C1710e<? super T>) new C5849c<Object>(this)));
    }

    public final void onMessage(IMessage iMessage) {
        if (!(mo8518c() == null || iMessage == null || !(iMessage instanceof C7859c))) {
            if (C58081.f15263a[((C7859c) iMessage).getMessageType().ordinal()] == 1 && (iMessage instanceof C7868ci)) {
                switch (((C7868ci) iMessage).f21784a) {
                    case 3:
                        this.f15260d = false;
                        if (!(this.f15259c == null || this.f15259c.mRoomAuthStatus == null)) {
                            this.f15259c.mRoomAuthStatus.enableChat = false;
                        }
                        return;
                    case 4:
                        this.f15260d = true;
                        if (!(this.f15259c == null || this.f15259c.mRoomAuthStatus == null)) {
                            this.f15259c.mRoomAuthStatus.enableChat = true;
                        }
                        return;
                    case 5:
                        this.f15261e = false;
                        if (!(this.f15259c == null || this.f15259c.mRoomAuthStatus == null)) {
                            this.f15259c.mRoomAuthStatus.enableDanmaku = false;
                        }
                        ((C5809a) mo8518c()).mo11693a(this.f15261e);
                        return;
                    case 6:
                        this.f15261e = true;
                        if (!(this.f15259c == null || this.f15259c.mRoomAuthStatus == null)) {
                            this.f15259c.mRoomAuthStatus.enableDanmaku = true;
                        }
                        ((C5809a) mo8518c()).mo11693a(this.f15261e);
                        return;
                    case 7:
                        if (!(this.f15259c == null || this.f15259c.mRoomAuthStatus == null)) {
                            this.f15259c.mRoomAuthStatus.enableGift = false;
                        }
                        m12675a(8);
                        return;
                    case 8:
                        if (!(this.f15259c == null || this.f15259c.mRoomAuthStatus == null)) {
                            this.f15259c.mRoomAuthStatus.enableGift = true;
                        }
                        m12675a(0);
                        return;
                    case 12:
                        if (!(this.f15259c == null || this.f15259c.mRoomAuthStatus == null)) {
                            this.f15259c.mRoomAuthStatus.enableDigg = false;
                        }
                        m12676b(8);
                        return;
                    case 13:
                        if (!(this.f15259c == null || this.f15259c.mRoomAuthStatus == null)) {
                            this.f15259c.mRoomAuthStatus.enableDigg = true;
                        }
                        m12676b(0);
                        break;
                }
            }
        }
    }
}
