package com.bytedance.android.livesdk.chatroom.presenter;

import android.os.Message;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.p309e.C5084b;
import com.bytedance.android.livesdk.chatroom.p309e.C5095i;
import com.bytedance.android.livesdk.chatroom.p309e.C5097k;
import com.bytedance.android.livesdk.chatroom.p309e.C5099l;
import com.bytedance.android.livesdk.chatroom.p309e.C5113y;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.message.model.C7810ao;
import com.bytedance.android.livesdk.message.model.C7833bh;
import com.bytedance.android.livesdk.message.model.C7835bj;
import com.bytedance.android.livesdk.message.model.C7856by;
import com.bytedance.android.livesdk.message.model.C7859c;
import com.bytedance.android.livesdk.message.model.C7869cj;
import com.bytedance.android.livesdk.message.model.C8001m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p435c.C8618a;
import com.bytedance.android.livesdkapi.depend.p435c.C8618a.C8619a;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.android.livesdkapi.message.C8844a;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.bytedance.android.message.C8868a;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.OnInterceptListener;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.cd */
public class C5854cd extends C5868cl<C5858a> implements C8868a, OnInterceptListener, OnMessageListener {

    /* renamed from: i */
    private static final String f15324i = "cd";

    /* renamed from: a */
    public int f15325a = ((Integer) LiveSettingKeys.LIVE_TEXT_WIDGET_SHOW_MSG_PER_SIZE.mo9431a()).intValue();

    /* renamed from: b */
    public int f15326b = ((Integer) LiveSettingKeys.LIVE_TEXT_WIDGET_SHOW_MSG_PER_MILLIS.mo9431a()).intValue();

    /* renamed from: c */
    public final Queue<C5084b> f15327c = new ArrayDeque(100);

    /* renamed from: d */
    public final Queue<C5084b> f15328d = new ArrayDeque(100);

    /* renamed from: e */
    public final List<C5084b> f15329e = new ArrayList(200);

    /* renamed from: f */
    public C8618a f15330f = new C8618a(new C8619a() {
        /* renamed from: a */
        public final void mo11060a(Message message) {
        }
    });

    /* renamed from: g */
    public Runnable f15331g = new Runnable() {
        public final void run() {
            if (C5854cd.this.mo8518c() != null) {
                Stack stack = new Stack();
                while (stack.size() < C5854cd.this.f15325a && (C5854cd.this.f15328d.size() != 0 || C5854cd.this.f15327c.size() != 0)) {
                    if (C5854cd.this.f15328d.size() > 0) {
                        stack.push(C5854cd.this.f15328d.poll());
                    } else if (C5854cd.this.f15327c.size() > 0) {
                        stack.push(C5854cd.this.f15327c.poll());
                    }
                }
                Iterator it = stack.iterator();
                while (it.hasNext()) {
                    C5854cd.this.mo11725a((C5084b) it.next());
                }
                C5854cd.this.f15330f.postDelayed(C5854cd.this.f15331g, (long) C5854cd.this.f15326b);
            }
        }
    };

    /* renamed from: h */
    private C5084b f15332h;

    /* renamed from: j */
    private boolean f15333j = ((Boolean) LiveSettingKeys.ENABLE_LIVE_TEXT_SCROLL_OPTIMIZE.mo9431a()).booleanValue();

    /* renamed from: k */
    private long f15334k;

    /* renamed from: l */
    private Room f15335l;

    /* renamed from: m */
    private final List<C5084b> f15336m = new ArrayList(200);

    /* renamed from: n */
    private List<ImageModel> f15337n = null;

    /* renamed from: o */
    private boolean f15338o = false;

    /* renamed from: p */
    private long f15339p;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.cd$a */
    public interface C5858a extends C6463ay {
        /* renamed from: a */
        void mo11730a(int i);

        /* renamed from: a */
        void mo11731a(int i, boolean z);

        /* renamed from: a */
        void mo11732a(C7869cj cjVar);

        /* renamed from: b */
        void mo11733b(int i, boolean z);

        /* renamed from: c */
        void mo11734c(int i, boolean z);
    }

    /* renamed from: b */
    public final List<C5084b> mo11727b() {
        return this.f15336m;
    }

    /* renamed from: a */
    public final void mo8247a() {
        super.mo8247a();
        if (this.f15367t != null) {
            this.f15367t.removeOnInterceptListener(this);
        }
        if (this.f15330f != null) {
            this.f15330f.removeCallbacks(this.f15331g);
        }
    }

    public void onIntercept(IMessage iMessage) {
        m12738c(C5113y.m11752a((C7859c) iMessage));
    }

    /* renamed from: a */
    private static boolean m12736a(C8844a aVar) {
        if (aVar instanceof C8001m) {
            if (((C8001m) aVar).f21870c == TTLiveSDKContext.getHostService().mo10315h().mo14521a()) {
                return true;
            }
            return false;
        } else if (!(aVar instanceof C7810ao) || ((C7810ao) aVar).f21492a != TTLiveSDKContext.getHostService().mo10315h().mo14521a()) {
            return false;
        } else {
            return true;
        }
    }

    public C5854cd(long j) {
        this.f15334k = j;
    }

    /* renamed from: c */
    private void m12738c(C5084b<?> bVar) {
        long b = TTLiveSDKContext.getHostService().mo10315h().mo14529b();
        if (b != 0 && b == bVar.mo10991p()) {
            T t = bVar.f13643a;
            if (t.getMessageType() == C8629a.CHAT || t.getMessageType() == C8629a.GIFT || t.getMessageType() == C8629a.DOODLE_GIFT || t.getMessageType() == C8629a.GIFT_GROUP || t.getMessageType() == C8629a.DIGG || t.getMessageType() == C8629a.MEMBER || t.getMessageType() == C8629a.SCREEN) {
                this.f15337n = bVar.mo10987j();
            }
        }
    }

    /* renamed from: a */
    public final void mo11725a(C5084b bVar) {
        if (this.f15329e.size() >= 200) {
            this.f15329e.subList(0, 70).clear();
            ((C5858a) mo8518c()).mo11730a(70);
        }
        m12737b(bVar);
    }

    /* renamed from: b */
    private void m12737b(C5084b bVar) {
        if ((!(bVar instanceof C5099l) && !(bVar instanceof C5097k) && !(bVar instanceof C5095i)) || !((Boolean) LiveConfigSettingKeys.SUPPRESS_GIFT_TEXT_MESSAGES.mo9431a()).booleanValue() || this.f15335l.giftMessageStyle != 1) {
            if (m12736a((C8844a) bVar.f13643a)) {
                bVar.f13650h = this.f15337n;
            } else {
                m12738c(bVar);
            }
            if (bVar.f13643a instanceof C7856by) {
                C7856by byVar = (C7856by) bVar.f13643a;
                if (byVar.f21715j && byVar.f21716k != null && byVar.f21716k.get() != null) {
                    int indexOf = this.f15329e.indexOf((C5084b) byVar.f21716k.get());
                    if (indexOf >= 0) {
                        this.f15329e.remove(indexOf);
                        ((C5858a) mo8518c()).mo11731a(indexOf, false);
                    }
                } else if (!byVar.f21715j) {
                    byVar.f21716k = new WeakReference<>(bVar);
                }
            }
            if (bVar.f13643a instanceof C7833bh) {
                C7833bh bhVar = (C7833bh) bVar.f13643a;
                if (bhVar.f21627v && bhVar.f21630y != null) {
                    int indexOf2 = this.f15329e.indexOf((C5084b) bhVar.f21630y.get());
                    if (indexOf2 >= 0) {
                        this.f15329e.remove(indexOf2);
                        ((C5858a) mo8518c()).mo11731a(indexOf2, false);
                    }
                } else if (!bhVar.f21627v) {
                    bhVar.f21630y = new WeakReference<>(bVar);
                }
            }
            if (bVar.f13643a.getMessageType() == C8629a.DIGG || (bVar.f13643a.getMessageType() == C8629a.MEMBER && ((C7835bj) bVar.f13643a).mo14147a() == 1)) {
                this.f15329e.add(bVar);
                if (!this.f15338o || this.f15339p == 0 || System.currentTimeMillis() - this.f15339p >= 3000) {
                    ((C5858a) mo8518c()).mo11733b(this.f15329e.size() - 1, true);
                } else {
                    if (((C5084b) this.f15329e.get(this.f15329e.size() - 2)).mo10991p() != TTLiveSDKContext.getHostService().mo10315h().mo14529b()) {
                        this.f15329e.remove(this.f15329e.size() - 2);
                    }
                    ((C5858a) mo8518c()).mo11734c(this.f15329e.size() - 1, false);
                }
                this.f15339p = System.currentTimeMillis();
                this.f15338o = true;
            } else if (this.f15338o) {
                this.f15329e.add(this.f15329e.size() - 1, bVar);
                ((C5858a) mo8518c()).mo11733b(this.f15329e.size() - 2, true);
            } else {
                this.f15329e.add(bVar);
                ((C5858a) mo8518c()).mo11733b(this.f15329e.size() - 1, true);
            }
        }
    }

    /* renamed from: a */
    public final void mo8520a(C5858a aVar) {
        super.mo8520a(aVar);
        this.f15335l = (Room) this.f15366s.get("data_room", null);
        if (this.f15367t != null) {
            this.f15367t.addMessageListener(C8629a.CHAT.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.GIFT.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.FREE_CELL_GIFT_MESSAGE.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.MEMBER.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.DIGG.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.ROOM.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.SOCIAL.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.CONTROL.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.SCREEN.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.DOODLE_GIFT.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.DEFAULT.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.ROOM_RICH_CHAT_MESSAGE.getIntType(), this);
            if (!C8607a.f23572a) {
                this.f15367t.addMessageListener(C8629a.PROMOTION_CARD_MESSAGE.getIntType(), this);
            }
            this.f15367t.addMessageListener(C8629a.LOTTERY_EVENT.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.COMMENT_IMAGE.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.FANS_CLUB.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.GOODS_ORDER.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.ASSET_MESSAGE.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.IM_DELETE.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.GAME_GIFT_MESSAGE.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.NOBLE_UPGRADE_MESSAGE.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.PORTAL_MESSAGE.getIntType(), this);
            this.f15367t.addOnInterceptListener(this);
        }
        if (this.f15333j) {
            this.f15330f.postDelayed(this.f15331g, (long) this.f15326b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f8, code lost:
        if (r8.f15335l.isOfficial() != false) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010b, code lost:
        if (r0.baseMessage.f24139j != null) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0116, code lost:
        if (r0.baseMessage.f24139j != null) goto L_0x016c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMessage(com.p683ss.ugc.live.sdk.message.data.IMessage r9) {
        /*
            r8 = this;
            r0 = r9
            com.bytedance.android.livesdk.message.model.c r0 = (com.bytedance.android.livesdk.message.model.C7859c) r0
            boolean r1 = r0 instanceof com.bytedance.android.livesdk.message.model.C7810ao
            if (r1 == 0) goto L_0x002c
            java.lang.Class<com.bytedance.android.live.gift.IGiftService> r1 = com.bytedance.android.live.gift.IGiftService.class
            com.bytedance.android.live.base.b r1 = com.bytedance.android.live.p245d.C4116c.m10249a(r1)
            com.bytedance.android.live.gift.IGiftService r1 = (com.bytedance.android.live.gift.IGiftService) r1
            r2 = r0
            com.bytedance.android.livesdk.message.model.ao r2 = (com.bytedance.android.livesdk.message.model.C7810ao) r2
            long r3 = r2.f21494c
            com.bytedance.android.livesdk.gift.model.d r1 = r1.findGiftById(r3)
            if (r1 == 0) goto L_0x0023
            boolean r3 = r1.f20546g
            if (r3 == 0) goto L_0x0023
            int r2 = r2.f21498g
            if (r2 != 0) goto L_0x0023
            return
        L_0x0023:
            if (r1 == 0) goto L_0x002c
            int r1 = r1.f20544e
            r2 = 11
            if (r1 != r2) goto L_0x002c
            return
        L_0x002c:
            com.bytedance.android.livesdk.ad.c<java.lang.Boolean> r1 = com.bytedance.android.livesdk.p272ad.C4525b.f12330Z
            java.lang.Object r1 = r1.mo10345a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            com.bytedance.android.livesdk.chatroom.e.b r2 = com.bytedance.android.livesdk.chatroom.p309e.C5113y.m11752a(r0)
            if (r2 != 0) goto L_0x003f
            return
        L_0x003f:
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r8.f15335l
            if (r3 == 0) goto L_0x004b
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r8.f15335l
            int r3 = r3.getOrientation()
            r2.f13645c = r3
        L_0x004b:
            com.bytedance.ies.sdk.widgets.DataCenter r3 = r8.f15366s
            java.lang.String r4 = "data_is_anchor"
            r5 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            java.lang.Object r3 = r3.get(r4, r6)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.f13646d = r3
            if (r1 == 0) goto L_0x007e
            com.bytedance.android.livesdk.ad.c<java.lang.Boolean> r1 = com.bytedance.android.livesdk.p272ad.C4525b.f12364ag
            java.lang.Object r1 = r1.mo10345a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x007e
            T r1 = r2.f13643a
            int r1 = r1.getIntType()
            com.bytedance.android.livesdkapi.depend.e.a r3 = com.bytedance.android.livesdkapi.depend.p437e.C8629a.CHAT
            int r3 = r3.getIntType()
            if (r1 == r3) goto L_0x0080
        L_0x007e:
            r8.f15332h = r2
        L_0x0080:
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r1 = r8.f15336m
            int r1 = r1.size()
            r3 = 200(0xc8, float:2.8E-43)
            if (r1 < r3) goto L_0x0095
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r1 = r8.f15336m
            r3 = 70
            java.util.List r1 = r1.subList(r5, r3)
            r1.clear()
        L_0x0095:
            T r1 = r2.f13643a
            int r1 = r1.getIntType()
            com.bytedance.android.livesdkapi.depend.e.a r3 = com.bytedance.android.livesdkapi.depend.p437e.C8629a.GIFT
            int r3 = r3.getIntType()
            if (r1 == r3) goto L_0x00c3
            com.bytedance.android.livesdkapi.depend.e.a r3 = com.bytedance.android.livesdkapi.depend.p437e.C8629a.DOODLE_GIFT
            int r3 = r3.getIntType()
            if (r1 == r3) goto L_0x00c3
            com.bytedance.android.livesdkapi.depend.e.a r3 = com.bytedance.android.livesdkapi.depend.p437e.C8629a.CHAT
            int r3 = r3.getIntType()
            if (r1 == r3) goto L_0x00c3
            com.bytedance.android.livesdkapi.depend.e.a r3 = com.bytedance.android.livesdkapi.depend.p437e.C8629a.MEMBER
            int r3 = r3.getIntType()
            if (r1 == r3) goto L_0x00c3
            com.bytedance.android.livesdkapi.depend.e.a r3 = com.bytedance.android.livesdkapi.depend.p437e.C8629a.SCREEN
            int r3 = r3.getIntType()
            if (r1 != r3) goto L_0x00c8
        L_0x00c3:
            java.util.List<com.bytedance.android.livesdk.chatroom.e.b> r1 = r8.f15336m
            r1.add(r2)
        L_0x00c8:
            com.bytedance.ies.a.a r1 = r8.mo8518c()
            if (r1 == 0) goto L_0x01bd
            r1 = 1
            if (r0 == 0) goto L_0x016d
            long r3 = r8.f15334k
            boolean r3 = r0.isCurrentRoom(r3)
            if (r3 == 0) goto L_0x016d
            boolean r3 = r0.canText()
            if (r3 != 0) goto L_0x00e1
            goto L_0x016d
        L_0x00e1:
            int[] r3 = com.bytedance.android.livesdk.chatroom.presenter.C5854cd.C58573.f15342a
            com.bytedance.android.livesdkapi.depend.e.a r4 = r0.getMessageType()
            int r4 = r4.ordinal()
            r3 = r3[r4]
            switch(r3) {
                case 1: goto L_0x0152;
                case 2: goto L_0x0119;
                case 3: goto L_0x010e;
                case 4: goto L_0x00fc;
                case 5: goto L_0x00f2;
                default: goto L_0x00f0;
            }
        L_0x00f0:
            goto L_0x016c
        L_0x00f2:
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r8.f15335l
            boolean r3 = r3.isOfficial()
            if (r3 == 0) goto L_0x016c
            goto L_0x016d
        L_0x00fc:
            r3 = r0
            com.bytedance.android.livesdk.message.model.a r3 = (com.bytedance.android.livesdk.message.model.C7793a) r3
            boolean r4 = r3.f21428c
            if (r4 == 0) goto L_0x016d
            com.bytedance.android.livesdkapi.message.b r3 = r3.baseMessage
            if (r3 == 0) goto L_0x016d
            com.bytedance.android.livesdkapi.message.b r3 = r0.baseMessage
            com.bytedance.android.livesdkapi.message.g r3 = r3.f24139j
            if (r3 != 0) goto L_0x016c
            goto L_0x016d
        L_0x010e:
            com.bytedance.android.livesdkapi.message.b r3 = r0.baseMessage
            if (r3 == 0) goto L_0x016d
            com.bytedance.android.livesdkapi.message.b r3 = r0.baseMessage
            com.bytedance.android.livesdkapi.message.g r3 = r3.f24139j
            if (r3 != 0) goto L_0x016c
            goto L_0x016d
        L_0x0119:
            r3 = r0
            com.bytedance.android.livesdk.message.model.bs r3 = (com.bytedance.android.livesdk.message.model.C7850bs) r3
            java.lang.String r3 = r3.f21690a
            r4 = -1
            int r6 = r3.hashCode()
            r7 = -984622807(0xffffffffc54fd929, float:-3325.5725)
            if (r6 == r7) goto L_0x0138
            r5 = -407856239(0xffffffffe7b09b91, float:-1.6680124E24)
            if (r6 == r5) goto L_0x012e
            goto L_0x0141
        L_0x012e:
            java.lang.String r5 = "enter_by_card"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0141
            r4 = 1
            goto L_0x0141
        L_0x0138:
            java.lang.String r6 = "buy_card"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x0141
            r4 = 0
        L_0x0141:
            switch(r4) {
                case 0: goto L_0x0145;
                case 1: goto L_0x0145;
                default: goto L_0x0144;
            }
        L_0x0144:
            goto L_0x016d
        L_0x0145:
            com.bytedance.android.live.core.setting.p<java.lang.Boolean> r1 = com.bytedance.android.livesdk.config.C6718b.f18328Y
            java.lang.Object r1 = r1.mo9431a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r5 = r1.booleanValue()
            goto L_0x016a
        L_0x0152:
            r3 = r0
            com.bytedance.android.livesdk.message.model.ao r3 = (com.bytedance.android.livesdk.message.model.C7810ao) r3
            java.lang.Class<com.bytedance.android.live.gift.IGiftService> r4 = com.bytedance.android.live.gift.IGiftService.class
            com.bytedance.android.live.base.b r4 = com.bytedance.android.live.p245d.C4116c.m10249a(r4)
            com.bytedance.android.live.gift.IGiftService r4 = (com.bytedance.android.live.gift.IGiftService) r4
            long r6 = r3.f21494c
            com.bytedance.android.livesdk.gift.model.d r3 = r4.findGiftById(r6)
            if (r3 == 0) goto L_0x016a
            boolean r3 = r3.f20546g
            if (r3 == 0) goto L_0x016a
            r5 = 1
        L_0x016a:
            r1 = r5
            goto L_0x016d
        L_0x016c:
            r1 = 0
        L_0x016d:
            if (r1 == 0) goto L_0x0170
            goto L_0x01bd
        L_0x0170:
            boolean r0 = r0 instanceof com.bytedance.android.livesdk.message.model.C7869cj
            if (r0 == 0) goto L_0x017f
            com.bytedance.android.livesdk.message.model.cj r9 = (com.bytedance.android.livesdk.message.model.C7869cj) r9
            com.bytedance.ies.a.a r0 = r8.mo8518c()
            com.bytedance.android.livesdk.chatroom.presenter.cd$a r0 = (com.bytedance.android.livesdk.chatroom.presenter.C5854cd.C5858a) r0
            r0.mo11732a(r9)
        L_0x017f:
            boolean r9 = r8.f15333j
            if (r9 == 0) goto L_0x01b9
            long r0 = r2.mo10991p()
            java.lang.Class<com.bytedance.android.live.user.a> r9 = com.bytedance.android.live.user.C4282a.class
            com.bytedance.android.live.base.b r9 = com.bytedance.android.live.p245d.C4116c.m10249a(r9)
            com.bytedance.android.live.user.a r9 = (com.bytedance.android.live.user.C4282a) r9
            com.bytedance.android.livesdk.user.e r9 = r9.user()
            long r3 = r9.mo14529b()
            r9 = 100
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x01ab
            java.util.Queue<com.bytedance.android.livesdk.chatroom.e.b> r0 = r8.f15328d
            int r0 = r0.size()
            if (r0 >= r9) goto L_0x01b8
            java.util.Queue<com.bytedance.android.livesdk.chatroom.e.b> r9 = r8.f15328d
            r9.add(r2)
            goto L_0x01bc
        L_0x01ab:
            java.util.Queue<com.bytedance.android.livesdk.chatroom.e.b> r0 = r8.f15327c
            int r0 = r0.size()
            if (r0 >= r9) goto L_0x01b8
            java.util.Queue<com.bytedance.android.livesdk.chatroom.e.b> r9 = r8.f15327c
            r9.add(r2)
        L_0x01b8:
            return
        L_0x01b9:
            r8.mo11725a(r2)
        L_0x01bc:
            return
        L_0x01bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.presenter.C5854cd.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }
}
