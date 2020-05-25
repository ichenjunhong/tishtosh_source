package com.bytedance.android.live.broadcast.preview.p219a.p220a;

import android.content.Context;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel;
import com.bytedance.android.livesdkapi.C8747h;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.bytedance.android.live.broadcast.preview.a.a.d */
public final class C3499d implements C8747h {

    /* renamed from: b */
    public static final C3500a f9974b = new C3500a(null);

    /* renamed from: a */
    public StartLiveViewModel f9975a;

    /* renamed from: c */
    private String f9976c;

    /* renamed from: d */
    private String f9977d;

    /* renamed from: e */
    private long f9978e;

    /* renamed from: f */
    private C8710m f9979f;

    /* renamed from: g */
    private int f9980g;

    /* renamed from: h */
    private boolean f9981h;

    /* renamed from: i */
    private Context f9982i;

    /* renamed from: j */
    private Boolean f9983j = Boolean.valueOf(false);

    /* renamed from: k */
    private HashMap<String, String> f9984k = new HashMap<>();

    /* renamed from: com.bytedance.android.live.broadcast.preview.a.a.d$a */
    public static final class C3500a {
        private C3500a() {
        }

        public /* synthetic */ C3500a(C52707g gVar) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r0 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        if (r0 == null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ac, code lost:
        if (r0 == null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r0 == null) goto L_0x0017;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8890a(com.bytedance.android.livesdkapi.C8747h.C8748a r10) {
        /*
            r9 = this;
            java.lang.String r0 = "chain"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r9.f9975a
            if (r0 == 0) goto L_0x0017
            android.arch.lifecycle.r r0 = r0.mo8880h()
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0019
        L_0x0017:
            java.lang.String r0 = ""
        L_0x0019:
            r9.f9976c = r0
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r9.f9975a
            if (r0 == 0) goto L_0x002d
            android.arch.lifecycle.r r0 = r0.mo8881i()
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x002f
        L_0x002d:
            java.lang.String r0 = ""
        L_0x002f:
            r9.f9977d = r0
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r9.f9975a
            r1 = 0
            if (r0 == 0) goto L_0x0048
            android.arch.lifecycle.r r0 = r0.mo8878f()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.live.broadcast.api.model.Game r0 = (com.bytedance.android.live.broadcast.api.model.Game) r0
            if (r0 == 0) goto L_0x0048
            long r3 = r0.gameId
            goto L_0x0049
        L_0x0048:
            r3 = r1
        L_0x0049:
            r9.f9978e = r3
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r9.f9975a
            if (r0 == 0) goto L_0x005d
            android.arch.lifecycle.r r0 = r0.mo8876d()
            if (r0 == 0) goto L_0x005d
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.livesdkapi.depend.model.live.m r0 = (com.bytedance.android.livesdkapi.depend.model.live.C8710m) r0
            if (r0 != 0) goto L_0x005f
        L_0x005d:
            com.bytedance.android.livesdkapi.depend.model.live.m r0 = com.bytedance.android.livesdkapi.depend.model.live.C8710m.VIDEO
        L_0x005f:
            r9.f9979f = r0
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r9.f9975a
            r3 = 0
            if (r0 == 0) goto L_0x0077
            android.arch.lifecycle.r r0 = r0.mo8882j()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.livesdk.chatroom.model.aq r0 = (com.bytedance.android.livesdk.chatroom.model.C5728aq) r0
            if (r0 == 0) goto L_0x0077
            int r0 = r0.f15081a
            goto L_0x0078
        L_0x0077:
            r0 = 0
        L_0x0078:
            r9.f9980g = r0
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r9.f9975a
            if (r0 == 0) goto L_0x0095
            d.f r0 = r0.f9929d
            java.lang.Object r0 = r0.getValue()
            android.arch.lifecycle.r r0 = (android.arch.lifecycle.C0198r) r0
            if (r0 == 0) goto L_0x0095
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0095
            boolean r0 = r0.booleanValue()
            goto L_0x0096
        L_0x0095:
            r0 = 0
        L_0x0096:
            r9.f9981h = r0
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r9.f9975a
            if (r0 == 0) goto L_0x00ae
            d.f r0 = r0.f9930e
            java.lang.Object r0 = r0.getValue()
            android.arch.lifecycle.r r0 = (android.arch.lifecycle.C0198r) r0
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r0 = r0.getValue()
            java.util.HashMap r0 = (java.util.HashMap) r0
            if (r0 != 0) goto L_0x00b3
        L_0x00ae:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L_0x00b3:
            r9.f9984k = r0
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r9.f9975a
            if (r0 == 0) goto L_0x00c6
            com.bytedance.ies.sdk.widgets.NextLiveData r0 = r0.mo8874b()
            if (r0 == 0) goto L_0x00c6
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L_0x00c7
        L_0x00c6:
            r0 = 0
        L_0x00c7:
            r9.f9983j = r0
            com.bytedance.android.livesdkapi.h$b r0 = r10.mo8889b()
            android.content.Context r0 = r0.f24024a
            r9.f9982i = r0
            java.lang.String r0 = r9.f9976c
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String r5 = "event_type"
            java.lang.String r6 = "click"
            r4.put(r5, r6)
            java.lang.String r5 = "event_belong"
            java.lang.String r6 = "live"
            r4.put(r5, r6)
            java.lang.String r5 = "event_page"
            java.lang.String r6 = "live_action"
            r4.put(r5, r6)
            java.lang.String r5 = "event_module"
            java.lang.String r6 = "title"
            r4.put(r5, r6)
            java.lang.String r5 = "live_edit_type"
            java.lang.String r6 = "title"
            r4.put(r5, r6)
            java.lang.String r5 = "title_status"
            if (r0 != 0) goto L_0x0104
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0104:
            int r0 = r0.length()
            if (r0 != 0) goto L_0x010d
            java.lang.String r0 = "off"
            goto L_0x010f
        L_0x010d:
            java.lang.String r0 = "on"
        L_0x010f:
            r4.put(r5, r0)
            com.bytedance.android.livesdk.o.c r0 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
            java.lang.String r5 = "live_edit_features"
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r0.mo14202a(r5, r4, r6)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r4 = "event_type"
            java.lang.String r5 = "click"
            r0.put(r4, r5)
            java.lang.String r4 = "event_belong"
            java.lang.String r5 = "live"
            r0.put(r4, r5)
            java.lang.String r4 = "event_page"
            java.lang.String r5 = "live_action"
            r0.put(r4, r5)
            java.lang.String r4 = "event_module"
            java.lang.String r5 = "action"
            r0.put(r4, r5)
            java.lang.String r4 = "is_beauty"
            java.lang.String r5 = "off"
            r0.put(r4, r5)
            com.bytedance.android.livesdk.o.c r4 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
            java.lang.String r5 = "live_action"
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r4.mo14202a(r5, r0, r6)
            long r4 = java.lang.System.currentTimeMillis()
            com.bytedance.android.live.broadcast.p202d.C3161a.f9195a = r4
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r9.f9975a
            if (r0 == 0) goto L_0x02b5
            com.bytedance.android.livesdk.af.o r4 = new com.bytedance.android.livesdk.af.o
            r4.<init>()
            java.lang.String r5 = "title"
            java.lang.String r6 = r9.f9976c
            com.bytedance.android.livesdk.af.o r4 = r4.mo10399a(r5, r6)
            java.lang.String r5 = "cover_uri"
            java.lang.String r6 = r9.f9977d
            com.bytedance.android.livesdk.af.o r4 = r4.mo10399a(r5, r6)
            java.lang.String r5 = "game"
            long r6 = r9.f9978e
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 == 0) goto L_0x0180
            long r1 = r9.f9978e
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x0182
        L_0x0180:
            java.lang.String r1 = ""
        L_0x0182:
            com.bytedance.android.livesdk.af.o r1 = r4.mo10399a(r5, r1)
            java.lang.String r2 = "tags"
            int r4 = r9.f9980g
            r5 = -1
            if (r4 == r5) goto L_0x0194
            int r4 = r9.f9980g
            java.lang.String r4 = java.lang.String.valueOf(r4)
            goto L_0x0196
        L_0x0194:
            java.lang.String r4 = ""
        L_0x0196:
            com.bytedance.android.livesdk.af.o r1 = r1.mo10399a(r2, r4)
            java.lang.String r2 = "GenerateApiMap()\n       …TagId.toString() else \"\")"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r1.f12568a
            com.bytedance.android.livesdkapi.depend.model.live.m r2 = r9.f9979f
            com.bytedance.android.livesdkapi.depend.model.live.m r4 = com.bytedance.android.livesdkapi.depend.model.live.C8710m.AUDIO
            if (r2 != r4) goto L_0x01b7
            java.lang.String r2 = "map"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r2 = r1
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r4 = "live_audio"
            java.lang.String r5 = "1"
            r2.put(r4, r5)
            goto L_0x01e2
        L_0x01b7:
            com.bytedance.android.livesdkapi.depend.model.live.m r2 = r9.f9979f
            com.bytedance.android.livesdkapi.depend.model.live.m r4 = com.bytedance.android.livesdkapi.depend.model.live.C8710m.THIRD_PARTY
            if (r2 != r4) goto L_0x01cd
            java.lang.String r2 = "map"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r2 = r1
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r4 = "third_party"
            java.lang.String r5 = "1"
            r2.put(r4, r5)
            goto L_0x01e2
        L_0x01cd:
            com.bytedance.android.livesdkapi.depend.model.live.m r2 = r9.f9979f
            com.bytedance.android.livesdkapi.depend.model.live.m r4 = com.bytedance.android.livesdkapi.depend.model.live.C8710m.SCREEN_RECORD
            if (r2 != r4) goto L_0x01e2
            java.lang.String r2 = "map"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r2 = r1
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r4 = "screen_shot"
            java.lang.String r5 = "1"
            r2.put(r4, r5)
        L_0x01e2:
            com.bytedance.android.livesdkapi.h$b r2 = r10.mo8889b()
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r2.f24026c
            java.lang.String r4 = "has_commerce_goods"
            java.lang.Object r2 = r2.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            r4 = 1
            if (r2 == 0) goto L_0x0204
            java.lang.String r5 = "1"
            boolean r5 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r5)
            if (r5 != 0) goto L_0x0203
            java.lang.String r5 = "true"
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r5)
            if (r2 == 0) goto L_0x0204
        L_0x0203:
            r3 = 1
        L_0x0204:
            boolean r2 = r9.f9981h
            if (r2 != 0) goto L_0x0217
            if (r3 == 0) goto L_0x020b
            goto L_0x0217
        L_0x020b:
            com.bytedance.android.livesdkapi.h$b r2 = r10.mo8889b()
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r2.f24026c
            java.lang.String r3 = "has_commerce_goods"
            r2.remove(r3)
            goto L_0x0226
        L_0x0217:
            java.lang.String r2 = "map"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r2 = r1
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "has_commerce_goods"
            java.lang.String r5 = "true"
            r2.put(r3, r5)
        L_0x0226:
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r9.f9984k
            java.util.Map r2 = (java.util.Map) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x0238
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r9.f9984k
            java.util.Map r2 = (java.util.Map) r2
            r1.putAll(r2)
        L_0x0238:
            java.lang.Boolean r2 = r9.f9983j
            if (r2 == 0) goto L_0x0259
            java.lang.Boolean r2 = r9.f9983j
            if (r2 != 0) goto L_0x0243
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0243:
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0259
            java.lang.String r2 = "map"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r2 = r1
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "disable_location_permission"
            java.lang.String r4 = "0"
            r2.put(r3, r4)
            goto L_0x0268
        L_0x0259:
            java.lang.String r2 = "map"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r2 = r1
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "disable_location_permission"
            java.lang.String r4 = "1"
            r2.put(r3, r4)
        L_0x0268:
            com.bytedance.android.livesdkapi.h$b r2 = r10.mo8889b()
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r2.f24026c
            java.util.Map r2 = (java.util.Map) r2
            r1.putAll(r2)
            com.bytedance.android.livesdkapi.h$b r10 = r10.mo8889b()
            java.util.HashMap<java.lang.String, java.lang.String> r10 = r10.f24026c
            r10.clear()
            java.lang.String r10 = "params"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r10)
            com.bytedance.android.live.broadcast.f.c r10 = com.bytedance.android.live.broadcast.p211f.C3395f.m9156f()
            com.bytedance.android.live.broadcast.utils.d r10 = r10.mo8742c()
            com.bytedance.android.live.broadcast.api.BroadcastRoomApi r10 = r10.mo9020c()
            c.a.v r10 = r10.createRoom(r1)
            c.a.ac r1 = p064c.p065a.p093k.C2168a.m6521b()
            c.a.v r10 = r10.mo6529b(r1)
            c.a.ac r1 = p064c.p065a.p066a.p068b.C1667a.m5940a()
            c.a.v r10 = r10.mo6514a(r1)
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel$e r1 = new com.bytedance.android.live.broadcast.preview.StartLiveViewModel$e
            r1.<init>(r0)
            c.a.d.e r1 = (p064c.p065a.p071d.C1710e) r1
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel$f r2 = new com.bytedance.android.live.broadcast.preview.StartLiveViewModel$f
            r2.<init>(r0)
            c.a.d.e r2 = (p064c.p065a.p071d.C1710e) r2
            c.a.b.c r10 = r10.mo6505a(r1, r2)
            r0.f9928c = r10
        L_0x02b5:
            android.content.Context r10 = r9.f9982i
            com.bytedance.android.livesdk.p399o.C8068g.m16014a(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.preview.p219a.p220a.C3499d.mo8890a(com.bytedance.android.livesdkapi.h$a):void");
    }
}
