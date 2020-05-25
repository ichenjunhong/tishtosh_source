package com.bytedance.p702im.core.p706c;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.C2240a;
import com.bytedance.p702im.core.internal.C11261a;
import com.bytedance.p702im.core.internal.p710a.C11312m;
import com.bytedance.p702im.core.internal.p710a.C11314o;
import com.bytedance.p702im.core.internal.p710a.C11319r;
import com.bytedance.p702im.core.internal.p718b.p719a.C11328aa;
import com.bytedance.p702im.core.internal.p718b.p719a.C11344ag;
import com.bytedance.p702im.core.internal.p718b.p719a.C11383h;
import com.bytedance.p702im.core.internal.p718b.p719a.C11398m;
import com.bytedance.p702im.core.internal.p718b.p719a.C11409r;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.p722d.C11452a;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.internal.utils.C11462a;
import com.bytedance.p702im.core.internal.utils.C11466d;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.internal.utils.C11468f;
import com.bytedance.p702im.core.internal.utils.C11469g;
import com.bytedance.p702im.core.internal.utils.C11472i;
import com.bytedance.p702im.core.internal.utils.C11498k;
import com.bytedance.p702im.core.internal.utils.C11500m;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p703a.C11169d.C11171b;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.p708d.p709a.C11253b;
import com.bytedance.p702im.core.proto.GetConversationParticipantsReadIndexV3RequestBody;
import com.bytedance.p702im.core.proto.GetMessagesCheckInfoInConversationRequestBody;
import com.bytedance.p702im.core.proto.ParticipantMinIndex;
import com.bytedance.p702im.core.proto.ParticipantReadIndex;
import com.bytedance.p702im.core.proto.RequestBody;
import com.bytedance.p702im.core.proto.RequestBody.Builder;
import com.bytedance.p702im.core.proto.SendMessageRequestBody;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.c.r */
public final class C11213r implements C11203l {

    /* renamed from: a */
    public C11468f f30221a;

    /* renamed from: b */
    public String f30222b;

    /* renamed from: c */
    public int f30223c;

    /* renamed from: d */
    public C11203l f30224d;

    /* renamed from: e */
    public boolean f30225e;

    /* renamed from: f */
    public boolean f30226f;

    /* renamed from: g */
    public boolean f30227g;

    /* renamed from: h */
    public List<Long> f30228h;

    /* renamed from: i */
    public boolean f30229i;

    /* renamed from: j */
    public C11199h f30230j;

    /* renamed from: k */
    public Map<Long, C11240t> f30231k;

    /* renamed from: l */
    private long f30232l;

    /* renamed from: a */
    public final void mo20726a(final List<C11207p> list, int i) {
        if (this.f30226f) {
            if (this.f30229i) {
                C11457e.m23435a(new C11456d<Pair<Boolean, Map<Long, C11240t>>>() {
                    /* renamed from: a */
                    public final /* synthetic */ Object mo20683a() {
                        if (list == null || list.isEmpty()) {
                            return null;
                        }
                        ArrayList<C11207p> arrayList = new ArrayList<>(list);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C11207p pVar = (C11207p) it.next();
                            if (pVar == null || pVar.isSelf() || TextUtils.isEmpty(pVar.getConversationId()) || !pVar.getConversationId().equals(C11213r.this.f30222b)) {
                                it.remove();
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        boolean a = C11213r.this.mo20836a(C11213r.this.f30222b);
                        StringBuilder sb = new StringBuilder("updateReadIndexOnGetOtherMsg before update readIndex mReadStatusMap=");
                        sb.append(C11466d.f30773a.mo34889b(C11213r.this.f30231k));
                        C11467e.m23462a(sb.toString());
                        for (C11207p pVar2 : arrayList) {
                            long index = pVar2.getIndex();
                            long orderIndex = pVar2.getOrderIndex();
                            long sender = pVar2.getSender();
                            C11467e.m23462a(C2240a.m6772a("updateReadIndexOnGetOtherMsg msg content=%s, readIndex=%s, readOrder=%s", new Object[]{pVar2.getLogContent(), String.valueOf(index), String.valueOf(orderIndex)}));
                            C11240t tVar = (C11240t) C11213r.this.f30231k.get(Long.valueOf(sender));
                            if (tVar != null) {
                                if (tVar.mo20874b()) {
                                    C11467e.m23462a(C2240a.m6772a("updateReadIndexOnGetOtherMsg readOrder valid content=%s, readIndex=%s, readOrder=%s, oldParticipantIndexInfo=%s", new Object[]{pVar2.getLogContent(), String.valueOf(index), String.valueOf(orderIndex), C11466d.f30773a.mo34889b(tVar)}));
                                    if (orderIndex > tVar.f30277e) {
                                        tVar.mo20873b(index);
                                        tVar.mo20876c(orderIndex);
                                        C11213r.this.f30231k.put(Long.valueOf(sender), tVar);
                                    }
                                } else {
                                    C11467e.m23462a(C2240a.m6772a("updateReadIndexOnGetOtherMsg readOrder invalid content=%s, readIndex=%s, readOrder=%s, oldParticipantIndexInfo=%s", new Object[]{pVar2.getLogContent(), String.valueOf(index), String.valueOf(orderIndex), C11466d.f30773a.mo34889b(tVar)}));
                                    if (index >= tVar.f30276d) {
                                        tVar.mo20873b(index);
                                        tVar.mo20876c(orderIndex);
                                        C11213r.this.f30231k.put(Long.valueOf(sender), tVar);
                                    }
                                }
                                a = true;
                            }
                        }
                        StringBuilder sb2 = new StringBuilder("updateReadIndexOnGetOtherMsg after update readIndex mReadStatusMap=");
                        sb2.append(C11466d.f30773a.mo34889b(C11213r.this.f30231k));
                        C11467e.m23462a(sb2.toString());
                        return new Pair(Boolean.valueOf(a), C11213r.this.f30231k);
                    }
                }, new C11455c<Pair<Boolean, Map<Long, C11240t>>>() {
                    /* renamed from: a */
                    public final /* synthetic */ void mo20684a(Object obj) {
                        final Pair pair = (Pair) obj;
                        if (pair != null && ((Boolean) pair.first).booleanValue()) {
                            C11457e.m23435a(new C11456d<Boolean>() {
                                /* renamed from: a */
                                public final /* synthetic */ Object mo20683a() {
                                    C11467e.m23462a("updateReadIndexOnGetOtherMsg insertOrUpdateMemberRead");
                                    C11314o.m23063a().mo21018a(C11213r.this.f30222b, (Map) pair.second);
                                    return Boolean.valueOf(true);
                                }
                            }, null, C11452a.m23427d());
                        }
                    }
                }, C11452a.m23427d());
            }
            if (list != null && !list.isEmpty()) {
                this.f30221a.addList(list);
                if (this.f30224d != null) {
                    this.f30224d.mo20726a(list, i);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo20724a(C11207p pVar) {
        if (this.f30221a.remove(pVar) && this.f30224d != null) {
            this.f30224d.mo20724a(pVar);
        }
    }

    /* renamed from: a */
    public final void mo20727a(boolean z) {
        this.f30221a.clear();
        if (z && this.f30224d != null) {
            this.f30224d.mo20727a(true);
        }
    }

    /* renamed from: a */
    public final void mo20725a(C11207p pVar, Map<String, List<C11205n>> map, Map<String, List<C11205n>> map2) {
        if (this.f30224d != null) {
            this.f30224d.mo20725a(pVar, map, map2);
        }
    }

    /* renamed from: a */
    public final void mo20834a(final C11207p pVar, boolean z, final C11162b<Pair<List<Long>, List<Long>>> bVar) {
        if (pVar == null || !pVar.isSelf() || pVar.isDeleted() || !C11469g.m23481c(pVar) || TextUtils.isEmpty(pVar.getConversationId()) || !pVar.getConversationId().equals(this.f30222b) || !pVar.isSuccessOrNormal() || !this.f30229i) {
            bVar.mo20508a(C11202k.m22730a(C11447f.m23381a(-1015)));
            return;
        }
        if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f30232l < 2000) {
                C11467e.m23462a("getMessageReadStatusAsync net request too often, smaller than 2s, return local data");
                mo20838b(pVar, bVar);
            } else {
                C11467e.m23462a("getMessageReadStatusAsync net request");
                this.f30232l = currentTimeMillis;
                C11182d.m22641a();
                String conversationId = pVar.getConversationId();
                C112338 r0 = new C11162b<List<ParticipantReadIndex>>() {
                    /* renamed from: a */
                    public final void mo20508a(C11202k kVar) {
                        C11213r.this.mo20838b(pVar, bVar);
                    }

                    /* renamed from: a */
                    public final /* synthetic */ void mo20506a(Object obj) {
                        final List list = (List) obj;
                        C11457e.m23435a(new C11456d<Pair<Boolean, Map<Long, C11240t>>>() {
                            /* renamed from: a */
                            public final /* synthetic */ Object mo20683a() {
                                Object obj;
                                long j;
                                long j2;
                                C11213r rVar = C11213r.this;
                                String conversationId = pVar.getConversationId();
                                List list = list;
                                char c = 0;
                                if (TextUtils.isEmpty(conversationId)) {
                                    obj = null;
                                } else {
                                    boolean a = rVar.mo20836a(conversationId);
                                    if (rVar.f30231k != null && !rVar.f30231k.isEmpty() && list != null && !list.isEmpty()) {
                                        int size = list.size();
                                        boolean z = a;
                                        int i = 0;
                                        while (i < size) {
                                            ParticipantReadIndex participantReadIndex = (ParticipantReadIndex) list.get(i);
                                            if (participantReadIndex != null) {
                                                long j3 = 0;
                                                if (participantReadIndex.user_id != null) {
                                                    j = participantReadIndex.user_id.longValue();
                                                } else {
                                                    j = 0;
                                                }
                                                if (participantReadIndex.index != null) {
                                                    j2 = participantReadIndex.index.longValue();
                                                } else {
                                                    j2 = 0;
                                                }
                                                C11319r.m23086a();
                                                C11207p a2 = C11319r.m23085a(conversationId, j2);
                                                if (a2 != null) {
                                                    j3 = a2.getOrderIndex();
                                                }
                                                C11240t tVar = (C11240t) rVar.f30231k.get(Long.valueOf(j));
                                                if (tVar != null) {
                                                    if (a2 != null) {
                                                        Object[] objArr = new Object[3];
                                                        objArr[c] = String.valueOf(j2);
                                                        objArr[1] = String.valueOf(j3);
                                                        objArr[2] = C11466d.f30773a.mo34889b(tVar);
                                                        C11467e.m23462a(C2240a.m6772a("updateReadIndex found msg by readIndex=%s, readOrder=%s, mapIndexInfo=%s", objArr));
                                                        if (j3 > tVar.f30277e) {
                                                            tVar.mo20873b(j2);
                                                            tVar.mo20876c(j3);
                                                        }
                                                    } else {
                                                        C11467e.m23462a(C2240a.m6772a("updateReadIndex not found msg by readIndex=%s, mapIndexInfo=%s", new Object[]{String.valueOf(j2), C11466d.f30773a.mo34889b(tVar)}));
                                                        if (j2 > tVar.f30276d) {
                                                            tVar.mo20873b(j2);
                                                            tVar.mo20871a();
                                                        }
                                                    }
                                                    z = true;
                                                }
                                            }
                                            i++;
                                            c = 0;
                                        }
                                        a = z;
                                    }
                                    obj = new Pair(Boolean.valueOf(a), rVar.f30231k);
                                }
                                C11467e.m23462a(C2240a.m6772a("getMessageReadStatusAsync after updateReadIndex result=%s", new Object[]{C11466d.f30773a.mo34889b(obj)}));
                                return obj;
                            }
                        }, new C11455c<Pair<Boolean, Map<Long, C11240t>>>() {
                            /* renamed from: a */
                            public final /* synthetic */ void mo20684a(Object obj) {
                                boolean z;
                                Pair pair = (Pair) obj;
                                if (pair != null) {
                                    final Map map = (Map) pair.second;
                                    if (map != null && !map.isEmpty()) {
                                        Iterator it = map.entrySet().iterator();
                                        while (true) {
                                            z = true;
                                            boolean z2 = false;
                                            if (!it.hasNext()) {
                                                z = false;
                                                break;
                                            }
                                            Entry entry = (Entry) it.next();
                                            if (!(entry == null || entry.getValue() == null)) {
                                                if (((C11240t) entry.getValue()).f30275c < 0) {
                                                    z2 = true;
                                                }
                                                if (z2) {
                                                    break;
                                                }
                                            }
                                        }
                                        if (z) {
                                            C11467e.m23462a("getMessageReadStatusAsync needRequestMinIndex");
                                            C11213r.this.mo20835a(pVar.getConversationId(), pVar, bVar);
                                        } else {
                                            Pair a = C11213r.this.mo20832a(pVar, map);
                                            if (bVar != null) {
                                                bVar.mo20506a(a);
                                            }
                                        }
                                    } else if (bVar != null) {
                                        bVar.mo20506a(new Pair(Collections.emptyList(), Collections.emptyList()));
                                    }
                                    if (((Boolean) pair.first).booleanValue()) {
                                        C11457e.m23435a(new C11456d<Boolean>() {
                                            /* renamed from: a */
                                            public final /* synthetic */ Object mo20683a() {
                                                C11467e.m23462a("getReadStatusAsync insertOrUpdateMemberRead");
                                                return Boolean.valueOf(C11314o.m23063a().mo21018a(pVar.getConversationId(), map));
                                            }
                                        }, null, C11452a.m23427d());
                                    }
                                    return;
                                }
                                if (bVar != null) {
                                    bVar.mo20508a(C11202k.m22730a(C11447f.m23381a(-9999)));
                                }
                            }
                        }, C11452a.m23427d());
                    }
                };
                C11409r.m23292a();
                C11398m mVar = new C11398m(r0);
                C11180b a = C11182d.m22641a().mo20658a(conversationId);
                if (a == null || a.isLocal()) {
                    mVar.mo21058b(C11447f.m23381a(-1017));
                } else {
                    RequestBody build = new Builder().participants_read_index_body(new GetConversationParticipantsReadIndexV3RequestBody.Builder().conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).conversation_id(a.getConversationId()).build()).build();
                    mVar.mo21053a(a.getInboxType(), build, null, a);
                }
            }
        } else {
            mo20838b(pVar, bVar);
        }
    }

    /* renamed from: a */
    public final void mo20835a(final String str, final C11207p pVar, final C11162b<Pair<List<Long>, List<Long>>> bVar) {
        C11182d.m22641a();
        C11182d.m22645b(str, new C11162b<List<ParticipantMinIndex>>() {
            /* renamed from: a */
            public final void mo20508a(C11202k kVar) {
                C11213r.this.mo20838b(pVar, bVar);
            }

            /* renamed from: a */
            public final /* synthetic */ void mo20506a(Object obj) {
                final List list = (List) obj;
                C11457e.m23435a(new C11456d<Pair<Boolean, Map<Long, C11240t>>>() {
                    /* renamed from: a */
                    public final /* synthetic */ Object mo20683a() {
                        Object obj;
                        long j;
                        long j2;
                        C11213r rVar = C11213r.this;
                        String str = str;
                        List list = list;
                        if (TextUtils.isEmpty(str)) {
                            obj = null;
                        } else {
                            boolean a = rVar.mo20836a(str);
                            if (rVar.f30231k != null && !rVar.f30231k.isEmpty()) {
                                HashSet hashSet = new HashSet();
                                if (list != null && !list.isEmpty()) {
                                    int size = list.size();
                                    boolean z = a;
                                    for (int i = 0; i < size; i++) {
                                        ParticipantMinIndex participantMinIndex = (ParticipantMinIndex) list.get(i);
                                        if (participantMinIndex != null) {
                                            if (participantMinIndex.user_id != null) {
                                                j = participantMinIndex.user_id.longValue();
                                            } else {
                                                j = 0;
                                            }
                                            if (participantMinIndex.index != null) {
                                                j2 = participantMinIndex.index.longValue();
                                            } else {
                                                j2 = Long.MIN_VALUE;
                                            }
                                            hashSet.add(Long.valueOf(j));
                                            if (rVar.f30231k.get(Long.valueOf(j)) != null && j2 > ((C11240t) rVar.f30231k.get(Long.valueOf(j))).f30275c) {
                                                ((C11240t) rVar.f30231k.get(Long.valueOf(j))).mo20872a(j2);
                                                z = true;
                                            }
                                        }
                                    }
                                    a = z;
                                }
                            }
                            obj = new Pair(Boolean.valueOf(a), rVar.f30231k);
                        }
                        C11467e.m23462a(C2240a.m6772a("requestUpdateMinIndexAndCallback afterUpdateMinIndex result=%s", new Object[]{C11466d.f30773a.mo34889b(obj)}));
                        return obj;
                    }
                }, new C11455c<Pair<Boolean, Map<Long, C11240t>>>() {
                    /* renamed from: a */
                    public final /* synthetic */ void mo20684a(Object obj) {
                        Pair pair = (Pair) obj;
                        if (pair != null) {
                            final Map map = (Map) pair.second;
                            if (map == null || map.isEmpty()) {
                                C11467e.m23462a("requestUpdateMinIndexAndCallback result empty");
                                if (bVar != null) {
                                    bVar.mo20506a(new Pair(Collections.emptyList(), Collections.emptyList()));
                                }
                            } else {
                                Pair a = C11213r.this.mo20832a(pVar, map);
                                if (bVar != null) {
                                    bVar.mo20506a(a);
                                }
                            }
                            if (((Boolean) pair.first).booleanValue()) {
                                C11457e.m23435a(new C11456d<Boolean>() {
                                    /* renamed from: a */
                                    public final /* synthetic */ Object mo20683a() {
                                        C11467e.m23462a("requestUpdateMinIndexAndCallback insertOrUpdateMemberRead");
                                        return Boolean.valueOf(C11314o.m23063a().mo21018a(str, map));
                                    }
                                }, null, C11452a.m23427d());
                            }
                            return;
                        }
                        if (bVar != null) {
                            bVar.mo20508a(C11202k.m22730a(C11447f.m23381a(-9999)));
                        }
                    }
                }, C11452a.m23427d());
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo20836a(java.lang.String r14) {
        /*
            r13 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            r1 = 0
            if (r0 != 0) goto L_0x0182
            java.util.HashSet r0 = new java.util.HashSet
            com.bytedance.p702im.core.internal.p710a.C11313n.m23051a()
            java.util.List r2 = com.bytedance.p702im.core.internal.p710a.C11313n.m23052a(r14)
            r0.<init>(r2)
            com.bytedance.p702im.core.internal.p710a.C11312m.m23038a()
            com.bytedance.im.core.c.b r2 = com.bytedance.p702im.core.internal.p710a.C11312m.m23037a(r14)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Map<java.lang.Long, com.bytedance.im.core.c.t> r3 = r13.f30231k
            r4 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0038
            java.util.Map<java.lang.Long, com.bytedance.im.core.c.t> r3 = r13.f30231k
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x00bf
        L_0x0038:
            com.bytedance.im.core.internal.a.o r3 = com.bytedance.p702im.core.internal.p710a.C11314o.m23063a()
            java.util.Map<java.lang.Long, com.bytedance.im.core.c.t> r7 = r13.f30231k
            java.util.Map r3 = r3.mo21019b(r14, r7)
            r13.f30231k = r3
            java.lang.String r3 = "loadIndexInfoFromMemberAndReadDB after load from read DB result=%s"
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.google.gson.f r8 = com.bytedance.p702im.core.internal.utils.C11466d.f30773a
            java.util.Map<java.lang.Long, com.bytedance.im.core.c.t> r9 = r13.f30231k
            java.lang.String r8 = r8.mo34889b(r9)
            r7[r1] = r8
            java.lang.String r3 = com.C2240a.m6772a(r3, r7)
            com.bytedance.p702im.core.internal.utils.C11467e.m23462a(r3)
            java.util.Map<java.lang.Long, com.bytedance.im.core.c.t> r3 = r13.f30231k
            if (r3 == 0) goto L_0x0065
            java.util.Map<java.lang.Long, com.bytedance.im.core.c.t> r3 = r13.f30231k
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x00bf
        L_0x0065:
            java.util.Map<java.lang.Long, com.bytedance.im.core.c.t> r3 = r13.f30231k
            if (r3 != 0) goto L_0x0070
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r13.f30231k = r3
        L_0x0070:
            java.util.Iterator r3 = r0.iterator()
        L_0x0074:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x00a0
            java.lang.Object r7 = r3.next()
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 == 0) goto L_0x0074
            com.bytedance.im.core.c.t r8 = new com.bytedance.im.core.c.t
            r8.<init>()
            r8.f30273a = r14
            long r9 = r7.longValue()
            r8.f30274b = r9
            r9 = -1
            r8.mo20872a(r9)
            r8.mo20873b(r4)
            r8.mo20871a()
            java.util.Map<java.lang.Long, com.bytedance.im.core.c.t> r9 = r13.f30231k
            r9.put(r7, r8)
            goto L_0x0074
        L_0x00a0:
            java.lang.String r3 = "loadIndexInfoFromMemberAndReadDB after load from member DB result=%s"
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.google.gson.f r8 = com.bytedance.p702im.core.internal.utils.C11466d.f30773a
            java.util.Map<java.lang.Long, com.bytedance.im.core.c.t> r9 = r13.f30231k
            java.lang.String r8 = r8.mo34889b(r9)
            r7[r1] = r8
            java.lang.String r3 = com.C2240a.m6772a(r3, r7)
            com.bytedance.p702im.core.internal.utils.C11467e.m23462a(r3)
            java.util.Map<java.lang.Long, com.bytedance.im.core.c.t> r3 = r13.f30231k
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x00bf
            r3 = 1
            goto L_0x00c0
        L_0x00bf:
            r3 = 0
        L_0x00c0:
            java.util.Map<java.lang.Long, com.bytedance.im.core.c.t> r7 = r13.f30231k
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x0183
            java.util.Map<java.lang.Long, com.bytedance.im.core.c.t> r7 = r13.f30231k
            java.util.Set r7 = r7.keySet()
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>(r0)
            r8.addAll(r7)
            r8.removeAll(r7)
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>(r0)
            r9.addAll(r7)
            r9.removeAll(r0)
            java.util.Map<java.lang.Long, com.bytedance.im.core.c.t> r0 = r13.f30231k
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x00ee:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0111
            java.lang.Object r7 = r0.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            if (r7 == 0) goto L_0x00ee
            java.lang.Object r10 = r7.getKey()
            if (r10 == 0) goto L_0x00ee
            java.lang.Object r7 = r7.getKey()
            boolean r7 = r9.contains(r7)
            if (r7 == 0) goto L_0x00ee
            r0.remove()
            r3 = 1
            goto L_0x00ee
        L_0x0111:
            java.lang.String r0 = "loadIndexInfoFromMemberAndReadDB after remove not in member DB result=%s"
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.google.gson.f r9 = com.bytedance.p702im.core.internal.utils.C11466d.f30773a
            java.util.Map<java.lang.Long, com.bytedance.im.core.c.t> r10 = r13.f30231k
            java.lang.String r9 = r9.mo34889b(r10)
            r7[r1] = r9
            java.lang.String r0 = com.C2240a.m6772a(r0, r7)
            com.bytedance.p702im.core.internal.utils.C11467e.m23462a(r0)
            java.util.Iterator r0 = r8.iterator()
        L_0x012a:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x016c
            java.lang.Object r7 = r0.next()
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 == 0) goto L_0x012a
            com.bytedance.im.core.c.t r8 = new com.bytedance.im.core.c.t
            r8.<init>()
            r8.f30273a = r14
            long r9 = r7.longValue()
            r8.f30274b = r9
            if (r2 == 0) goto L_0x015b
            long r9 = r2.getLastMessageIndex()
            long r11 = r2.getReadIndex()
            long r9 = java.lang.Math.max(r9, r11)
            r11 = 1
            long r9 = r9 + r11
            long r9 = -r9
            r8.mo20872a(r9)
            goto L_0x0160
        L_0x015b:
            r9 = -9223372036854775808
            r8.mo20872a(r9)
        L_0x0160:
            r8.mo20873b(r4)
            r8.mo20871a()
            java.util.Map<java.lang.Long, com.bytedance.im.core.c.t> r9 = r13.f30231k
            r9.put(r7, r8)
            goto L_0x012a
        L_0x016c:
            java.lang.String r14 = "loadIndexInfoFromMemberAndReadDB after insert from member DB result=%s"
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.google.gson.f r2 = com.bytedance.p702im.core.internal.utils.C11466d.f30773a
            java.util.Map<java.lang.Long, com.bytedance.im.core.c.t> r4 = r13.f30231k
            java.lang.String r2 = r2.mo34889b(r4)
            r0[r1] = r2
            java.lang.String r14 = com.C2240a.m6772a(r14, r0)
            com.bytedance.p702im.core.internal.utils.C11467e.m23462a(r14)
            goto L_0x0183
        L_0x0182:
            r3 = 0
        L_0x0183:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p702im.core.p706c.C11213r.mo20836a(java.lang.String):boolean");
    }

    /* renamed from: b */
    public final List<C11207p> mo20837b() {
        return new ArrayList(this.f30221a);
    }

    /* renamed from: a */
    public final void mo20833a() {
        if (C11182d.m22641a().mo20658a(this.f30222b) == null) {
            mo20731d(null);
            return;
        }
        C11500m.m23559a();
        if (!this.f30227g) {
            this.f30227g = true;
            C11457e.m23434a(new C11456d<List<C11207p>>() {
                /* access modifiers changed from: private */
                /* renamed from: b */
                public List<C11207p> mo20683a() {
                    C11207p pVar;
                    C11213r rVar = C11213r.this;
                    if (rVar.f30221a.isEmpty()) {
                        pVar = null;
                    } else {
                        pVar = (C11207p) rVar.f30221a.get(rVar.f30221a.size() - 1);
                    }
                    if (pVar == null) {
                        return null;
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    C11319r.m23086a();
                    List<C11207p> a = C11319r.m23088a(C11213r.this.f30222b, pVar.getIndex(), C11213r.this.f30223c, (int[]) null);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                        C11176d.m22637a("im_load_more_msg_duration", jSONObject, (JSONObject) null);
                    } catch (Exception unused) {
                    }
                    return a;
                }
            }, new C11455c<List<C11207p>>() {
                /* renamed from: a */
                public final /* synthetic */ void mo20684a(Object obj) {
                    List list = (List) obj;
                    C11213r.this.f30227g = false;
                    if (list == null || list.size() < C11213r.this.f30223c) {
                        C11409r.m23292a();
                        C11409r.m23299a(C11213r.this.f30222b);
                    }
                    C11213r.this.mo20731d(list);
                }
            });
        }
    }

    public C11213r(String str) {
        this(str, true);
    }

    /* renamed from: c */
    public static void m22771c(C11207p pVar) {
        C11409r.m23292a();
        new C11383h().mo21047a(pVar, false);
    }

    /* renamed from: d */
    public static void m22772d(final C11207p pVar) {
        C11457e.m23434a(new C11456d<Pair<C11180b, C11207p>>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo20683a() {
                boolean a = C11319r.m23086a().mo21021a(pVar);
                C11312m.m23038a();
                C11180b a2 = C11312m.m23037a(pVar.getConversationId());
                if (a2 != null) {
                    C11319r.m23086a();
                    a2.setUnreadCount(C11319r.m23082a(a2.getConversationId(), a2.getReadIndex(), Long.MAX_VALUE, C11165c.m22588a().f30108c.mo20490a()));
                    a2.setUpdatedTime(Math.max(a2.getUpdatedTime(), pVar.getCreatedAt()));
                    a2.setLastMessageIndex(Math.max(a2.getLastMessageIndex(), pVar.getIndex()));
                    C11312m.m23038a();
                    C11312m.m23044b(a2);
                }
                if (a) {
                    return new Pair(a2, pVar);
                }
                return null;
            }
        }, new C11455c<Pair<C11180b, C11207p>>(null) {
            /* renamed from: a */
            public final /* synthetic */ void mo20684a(Object obj) {
                Pair pair = (Pair) obj;
                int i = -3001;
                if (pair != null) {
                    if (pair.first != null) {
                        C11182d.m22641a().mo20668b((C11180b) pair.first);
                    }
                    if (null != null) {
                        null.mo20506a(pVar);
                    }
                } else {
                    pVar.setMsgStatus(3);
                    if (null != null) {
                        null.mo20508a(C11202k.m22730a(C11447f.m23381a(-3001)));
                    }
                }
                C11472i a = C11472i.m23483a();
                if (pair != null) {
                    i = C11171b.f30118a;
                }
                a.mo20728b(i, pVar);
            }
        });
    }

    /* renamed from: e */
    public static void m22773e(final C11207p pVar) {
        C11457e.m23434a(new C11456d<C11207p>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo20683a() {
                if (C11319r.m23086a().mo21021a(pVar)) {
                    return pVar;
                }
                return null;
            }
        }, new C11455c<C11207p>(null) {
            /* renamed from: a */
            public final /* synthetic */ void mo20684a(Object obj) {
                C11207p pVar = (C11207p) obj;
                if (pVar != null) {
                    C11472i.m23483a().mo20732e(Collections.singletonList(pVar));
                    if (null != null) {
                        null.mo20506a(pVar);
                    }
                } else if (null != null) {
                    null.mo20508a(C11202k.m22730a(C11447f.m23381a(-3001)));
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo20729b(C11207p pVar) {
        if (pVar != null && this.f30224d != null) {
            this.f30221a.update(pVar);
            this.f30224d.mo20729b(pVar);
        }
    }

    /* renamed from: c */
    public final void mo20730c(List<C11207p> list) {
        if (this.f30224d != null) {
            this.f30224d.mo20730c(list);
        }
        C11457e.m23434a(new C11456d() {
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x006a */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object mo20683a() {
                /*
                    r12 = this;
                    com.bytedance.im.core.c.r r0 = com.bytedance.p702im.core.p706c.C11213r.this     // Catch:{ Exception -> 0x00a0 }
                    com.bytedance.im.core.a.c r1 = com.bytedance.p702im.core.p703a.C11165c.m22588a()     // Catch:{ Exception -> 0x00a0 }
                    com.bytedance.im.core.b.a r1 = r1.f30109d     // Catch:{ Exception -> 0x00a0 }
                    if (r1 == 0) goto L_0x00a0
                    com.bytedance.im.core.internal.utils.f r1 = r0.f30221a     // Catch:{ Exception -> 0x00a0 }
                    r2 = 2
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L_0x0052
                    int r5 = r1.size()     // Catch:{ Exception -> 0x00a0 }
                    if (r5 > 0) goto L_0x0018
                    goto L_0x0052
                L_0x0018:
                    java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x00a0 }
                    r5.<init>(r1)     // Catch:{ Exception -> 0x00a0 }
                    com.bytedance.im.core.c.r$7 r1 = new com.bytedance.im.core.c.r$7     // Catch:{ Exception -> 0x00a0 }
                    r1.<init>()     // Catch:{ Exception -> 0x00a0 }
                    java.util.Collections.sort(r5, r1)     // Catch:{ Exception -> 0x00a0 }
                    r0 = 0
                    java.util.Iterator r6 = r5.iterator()     // Catch:{ Exception -> 0x00a0 }
                    r7 = 0
                L_0x002c:
                    boolean r8 = r6.hasNext()     // Catch:{ Exception -> 0x00a0 }
                    if (r8 == 0) goto L_0x0047
                    java.lang.Object r8 = r6.next()     // Catch:{ Exception -> 0x00a0 }
                    com.bytedance.im.core.c.p r8 = (com.bytedance.p702im.core.p706c.C11207p) r8     // Catch:{ Exception -> 0x00a0 }
                    long r9 = r8.getIndex()     // Catch:{ Exception -> 0x00a0 }
                    int r11 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
                    if (r11 <= 0) goto L_0x0042
                    int r7 = r7 + 1
                L_0x0042:
                    long r0 = r8.getIndex()     // Catch:{ Exception -> 0x00a0 }
                    goto L_0x002c
                L_0x0047:
                    int[] r0 = new int[r2]     // Catch:{ Exception -> 0x00a0 }
                    int r1 = r5.size()     // Catch:{ Exception -> 0x00a0 }
                    r0[r4] = r1     // Catch:{ Exception -> 0x00a0 }
                    r0[r3] = r7     // Catch:{ Exception -> 0x00a0 }
                    goto L_0x0057
                L_0x0052:
                    int[] r0 = new int[r2]     // Catch:{ Exception -> 0x00a0 }
                    r0 = {0, 0} // fill-array     // Catch:{ Exception -> 0x00a0 }
                L_0x0057:
                    org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x00a0 }
                    r1.<init>()     // Catch:{ Exception -> 0x00a0 }
                    java.lang.String r2 = "receive_no"
                    r5 = r0[r4]     // Catch:{ JSONException -> 0x006a }
                    r1.put(r2, r5)     // Catch:{ JSONException -> 0x006a }
                    java.lang.String r2 = "disordered_no"
                    r5 = r0[r3]     // Catch:{ JSONException -> 0x006a }
                    r1.put(r2, r5)     // Catch:{ JSONException -> 0x006a }
                L_0x006a:
                    com.bytedance.im.core.a.c r2 = com.bytedance.p702im.core.p703a.C11165c.m22588a()     // Catch:{ Exception -> 0x00a0 }
                    com.bytedance.im.core.b.a r2 = r2.f30109d     // Catch:{ Exception -> 0x00a0 }
                    java.lang.String r5 = "sdk_enter_chat"
                    r2.mo20520a(r5, r1)     // Catch:{ Exception -> 0x00a0 }
                    com.bytedance.im.core.b.c r1 = com.bytedance.p702im.core.p705b.C11175c.m22624a()     // Catch:{ Exception -> 0x00a0 }
                    java.lang.String r2 = "message_data_source"
                    com.bytedance.im.core.b.c r1 = r1.mo20526a(r2)     // Catch:{ Exception -> 0x00a0 }
                    java.lang.String r2 = "wrong_order"
                    com.bytedance.im.core.b.c r1 = r1.mo20528b(r2)     // Catch:{ Exception -> 0x00a0 }
                    java.lang.String r2 = "total_count"
                    r4 = r0[r4]     // Catch:{ Exception -> 0x00a0 }
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x00a0 }
                    com.bytedance.im.core.b.c r1 = r1.mo20527a(r2, r4)     // Catch:{ Exception -> 0x00a0 }
                    java.lang.String r2 = "count"
                    r0 = r0[r3]     // Catch:{ Exception -> 0x00a0 }
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00a0 }
                    com.bytedance.im.core.b.c r0 = r1.mo20527a(r2, r0)     // Catch:{ Exception -> 0x00a0 }
                    r0.mo20530b()     // Catch:{ Exception -> 0x00a0 }
                L_0x00a0:
                    r0 = 0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p702im.core.p706c.C11213r.C112316.mo20683a():java.lang.Object");
            }
        }, null);
    }

    /* renamed from: d */
    public final void mo20731d(List<C11207p> list) {
        if (list != null && !list.isEmpty()) {
            this.f30221a.appendList(list);
        }
        if (this.f30224d != null) {
            this.f30224d.mo20731d(list);
        }
    }

    /* renamed from: e */
    public final void mo20732e(List<C11207p> list) {
        if (list != null && !list.isEmpty()) {
            this.f30221a.updateList(list);
            if (this.f30224d != null) {
                this.f30224d.mo20732e(list);
            }
        }
    }

    /* renamed from: f */
    public final void mo20733f(List<C11241u> list) {
        if (list != null && !list.isEmpty() && this.f30224d != null) {
            this.f30224d.mo20733f(list);
        }
    }

    private C11213r(String str, boolean z) {
        this(str, true, false);
    }

    /* renamed from: a */
    public static void m22769a(C11207p pVar, boolean z) {
        C11409r.m23292a();
        new C11383h(null).mo21047a(pVar, true);
    }

    /* renamed from: a */
    public static void m22770a(C11238s sVar, C11162b<C11238s> bVar) {
        C11409r.m23292a();
        new C11328aa(bVar).mo21030a(sVar);
    }

    /* renamed from: a */
    public static void m22768a(C11207p pVar, C11162b<C11207p> bVar) {
        C11409r.m23292a();
        C11344ag agVar = new C11344ag(bVar);
        if (pVar == null) {
            agVar.mo21058b(C11447f.m23381a(-1015));
            return;
        }
        pVar.setMsgStatus(1);
        C11457e.m23435a(new C11456d<Pair<C11180b, C11207p>>(pVar) {

            /* renamed from: a */
            final /* synthetic */ C11207p f30530a;

            /* access modifiers changed from: private */
            /* renamed from: b */
            public Pair<C11180b, C11207p> mo20683a() {
                long uptimeMillis = SystemClock.uptimeMillis();
                boolean a = C11319r.m23086a().mo21021a(this.f30530a);
                C11312m.m23038a();
                C11180b a2 = C11312m.m23037a(this.f30530a.getConversationId());
                if (a2 != null) {
                    a2.setUpdatedTime(Math.max(a2.getUpdatedTime(), this.f30530a.getCreatedAt()));
                    a2.setLastMessageIndex(Math.max(a2.getLastMessageIndex(), this.f30530a.getIndex()));
                    C11312m.m23038a();
                    C11312m.m23044b(a2);
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                    C11176d.m22637a("im_save_msg_duration", jSONObject, (JSONObject) null);
                } catch (Exception unused) {
                }
                if (a) {
                    return new Pair<>(a2, this.f30530a);
                }
                return null;
            }

            {
                this.f30530a = r2;
            }
        }, new C11455c<Pair<C11180b, C11207p>>(pVar) {

            /* renamed from: a */
            final /* synthetic */ C11207p f30532a;

            /* renamed from: a */
            public final /* synthetic */ void mo20684a(Object obj) {
                Pair pair = (Pair) obj;
                int i = -3001;
                if (pair == null || pair.first == null) {
                    this.f30532a.setMsgStatus(3);
                    C11344ag.this.mo21058b(C11447f.m23381a(-3001));
                } else {
                    C11182d.m22641a().mo20668b((C11180b) pair.first);
                    C11344ag agVar = C11344ag.this;
                    C11207p pVar = (C11207p) pair.second;
                    C11180b a = C11182d.m22641a().mo20658a(pVar.getConversationId());
                    if (C11165c.m22588a().mo20513b().f30159w) {
                        pVar = C11462a.m23439a(pVar);
                    }
                    SendMessageRequestBody.Builder builder = new SendMessageRequestBody.Builder();
                    List mentionIds = pVar.getMentionIds();
                    if (mentionIds != null) {
                        builder.mentioned_users(mentionIds);
                    }
                    RequestBody build = new Builder().send_message_body(builder.conversation_id(pVar.getConversationId()).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).content(pVar.getContent()).ext(pVar.getExt()).message_type(Integer.valueOf(pVar.getMsgType())).ticket(a.getTicket()).client_message_id(pVar.getUuid()).build()).build();
                    agVar.mo21053a(a.getInboxType(), build, null, pVar);
                }
                C11472i a2 = C11472i.m23483a();
                if (pair != null) {
                    i = C11171b.f30118a;
                }
                a2.mo20721a(i, this.f30532a);
            }

            {
                this.f30532a = r2;
            }
        }, C11452a.m23425b());
    }

    /* renamed from: b */
    public final void mo20728b(int i, C11207p pVar) {
        if (this.f30226f) {
            if (pVar != null) {
                this.f30221a.add(pVar);
                if (this.f30221a.size() > 3000) {
                    this.f30221a = new C11468f(this.f30221a.subList(0, 3000));
                }
            }
            if (this.f30224d != null) {
                this.f30224d.mo20728b(i, pVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo20838b(final C11207p pVar, final C11162b<Pair<List<Long>, List<Long>>> bVar) {
        C11457e.m23435a(new C11456d<Map<Long, C11240t>>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo20683a() {
                if (pVar == null || !pVar.isSelf() || pVar.isDeleted() || !C11469g.m23481c(pVar) || TextUtils.isEmpty(pVar.getConversationId()) || !pVar.getConversationId().equals(C11213r.this.f30222b)) {
                    return null;
                }
                if (C11213r.this.f30231k == null || C11213r.this.f30231k.isEmpty()) {
                    C11213r.this.f30231k = C11314o.m23063a().mo21019b(pVar.getConversationId(), C11213r.this.f30231k);
                    C11467e.m23462a(C2240a.m6772a("getReadAndAllByLocal after loadIndexInfoToMap result=%s", new Object[]{C11466d.f30773a.mo34889b(C11213r.this.f30231k)}));
                }
                return C11213r.this.f30231k;
            }
        }, new C11455c<Map<Long, C11240t>>() {
            /* renamed from: a */
            public final /* synthetic */ void mo20684a(Object obj) {
                Map map = (Map) obj;
                if (map != null && !map.isEmpty()) {
                    Pair a = C11213r.this.mo20832a(pVar, map);
                    if (bVar != null) {
                        bVar.mo20506a(a);
                    }
                } else if (bVar != null) {
                    bVar.mo20506a(new Pair(Collections.emptyList(), Collections.emptyList()));
                }
            }
        }, C11452a.m23427d());
    }

    /* renamed from: a */
    public final void mo20721a(int i, C11207p pVar) {
        if (this.f30226f) {
            if (pVar != null && i == C11171b.f30118a) {
                this.f30221a.add(pVar);
                if (this.f30221a.size() > 3000) {
                    this.f30221a = new C11468f(this.f30221a.subList(0, 3000));
                }
            }
            if (this.f30224d != null) {
                this.f30224d.mo20721a(i, pVar);
            }
        }
    }

    /* renamed from: a */
    public final Pair<List<Long>, List<Long>> mo20832a(C11207p pVar, Map<Long, C11240t> map) {
        String str;
        Object obj;
        Object obj2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (pVar != null && !TextUtils.isEmpty(pVar.getConversationId()) && pVar.getConversationId().equals(this.f30222b) && map != null && !map.isEmpty()) {
            for (Entry entry : map.entrySet()) {
                if (!(entry == null || entry.getValue() == null || ((C11240t) entry.getValue()).f30274b == C11165c.m22588a().f30108c.mo20490a() || Math.abs(((C11240t) entry.getValue()).f30275c) > pVar.getIndex())) {
                    arrayList2.add(Long.valueOf(((C11240t) entry.getValue()).f30274b));
                    if (!pVar.isIndexLocal() && (((C11240t) entry.getValue()).f30277e >= pVar.getOrderIndex() || (((C11240t) entry.getValue()).f30276d >= pVar.getIndex() && !((C11240t) entry.getValue()).mo20874b()))) {
                        arrayList.add(Long.valueOf(((C11240t) entry.getValue()).f30274b));
                    }
                }
            }
        }
        Pair<List<Long>, List<Long>> pair = new Pair<>(arrayList, arrayList2);
        String str2 = "getReadAndAllMemberIds selfMsg content=%s, index=%s, order=%s, readStatusMap=%s, resultPair=%s";
        Object[] objArr = new Object[5];
        if (pVar != null) {
            str = pVar.getLogContent();
        } else {
            str = TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        objArr[0] = str;
        if (pVar != null) {
            obj = Long.valueOf(pVar.getIndex());
        } else {
            obj = TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        objArr[1] = obj;
        if (pVar != null) {
            obj2 = Long.valueOf(pVar.getOrderIndex());
        } else {
            obj2 = TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        objArr[2] = obj2;
        objArr[3] = C11466d.f30773a.mo34889b(map);
        objArr[4] = C11466d.f30773a.mo34889b(pair);
        C11467e.m23462a(C2240a.m6772a(str2, objArr));
        return pair;
    }

    /* renamed from: a */
    public final void mo20722a(int i, C11238s sVar) {
        if (this.f30224d != null) {
            this.f30224d.mo20722a(i, sVar);
        }
    }

    /* renamed from: a */
    public final void mo20723a(int i, C11241u uVar) {
        if (uVar != null && this.f30224d != null) {
            this.f30224d.mo20723a(i, uVar);
        }
    }

    public C11213r(String str, boolean z, boolean z2) {
        this.f30221a = new C11468f();
        this.f30223c = 50;
        this.f30225e = true;
        this.f30226f = true;
        this.f30228h = new ArrayList();
        this.f30229i = false;
        this.f30231k = new HashMap();
        this.f30232l = 0;
        this.f30222b = str;
        this.f30225e = z;
        this.f30229i = z2;
        if (this.f30229i) {
            C11467e.m23462a("MessageModel enter conversation request minIndex");
            mo20835a(this.f30222b, (C11207p) null, null);
            this.f30230j = new C11199h() {
                /* renamed from: f */
                public final void mo20719f(C11180b bVar) {
                    if (bVar != null && !TextUtils.isEmpty(bVar.getConversationId()) && bVar.getConversationId().equals(C11213r.this.f30222b)) {
                        C11467e.m23462a("MessageModel onMemberChange");
                        C11213r.this.mo20835a(C11213r.this.f30222b, (C11207p) null, null);
                    }
                }
            };
        }
        if (!TextUtils.isEmpty(str) && C11261a.m22866b()) {
            C11180b a = C11182d.m22641a().mo20658a(str);
            if (a != null && !a.isDissolved() && a.isMember()) {
                long currentTimeMillis = System.currentTimeMillis();
                SharedPreferences sharedPreferences = C11498k.m23543a().f30838a;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("_check_time");
                if (currentTimeMillis - sharedPreferences.getLong(sb.toString(), 0) > C11261a.m22867c()) {
                    Editor edit = C11498k.m23543a().f30838a.edit();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append("_check_time");
                    edit.putLong(sb2.toString(), currentTimeMillis).commit();
                    C11452a.m23426c().execute(new Runnable(str) {

                        /* renamed from: a */
                        final /* synthetic */ String f30305a;

                        public final void run() {
                            C11319r.m23086a();
                            long g = C11319r.m23097g(this.f30305a);
                            C11253b bVar = new C11253b();
                            String str = this.f30305a;
                            long j = C11261a.f30331e;
                            int i = C11261a.f30332f;
                            if (!TextUtils.isEmpty(str)) {
                                C11180b a = C11182d.m22641a().mo20658a(str);
                                if (a != null) {
                                    bVar.f30309a = j;
                                    bVar.mo21053a(a.getInboxType(), new Builder().get_messages_checkinfo_in_conversation_body(new GetMessagesCheckInfoInConversationRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).cursor_reverse_begin(Long.valueOf(j)).cursor_reverse_end(Long.valueOf(g)).expect_msg_total_count(Integer.valueOf(i)).build()).build(), null, str);
                                }
                            }
                        }

                        {
                            this.f30305a = r1;
                        }
                    });
                }
            }
        }
    }
}
