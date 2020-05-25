package com.bytedance.p702im.core.internal.p718b.p719a;

import android.util.Pair;
import com.bytedance.p702im.core.internal.p710a.C11312m;
import com.bytedance.p702im.core.internal.p718b.C11324a;
import com.bytedance.p702im.core.internal.p722d.C11452a;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.internal.utils.C11472i;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.MessageBody;
import com.bytedance.p702im.core.proto.NewMessageNotify;
import com.bytedance.p702im.core.proto.NewMessageNotifyType;
import com.bytedance.p702im.core.proto.ResponseBody;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.b.a.ab */
public final class C11333ab extends C11364b {
    C11333ab() {
        super(IMCMD.NEW_MSG_NOTIFY.getValue());
    }

    /* renamed from: a */
    static void m23159a(String str) {
        C11312m.m23038a();
        C11180b a = C11312m.m23037a(str);
        if (a != null && a.hasMore()) {
            a.setHasMore(false);
            C11312m.m23038a();
            if (C11312m.m23044b(a)) {
                C11182d.m22641a().mo20681f(a);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo21032a(final int i, ResponseBody responseBody) {
        final NewMessageNotify newMessageNotify = responseBody.has_new_message_notify;
        if (newMessageNotify.notify_type == NewMessageNotifyType.PER_USER) {
            int[] iArr = C11165c.m22588a().mo20513b().f30153q;
            if (iArr == null) {
                iArr = C11165c.m22588a().mo20513b().f30152p;
            }
            if (iArr != null) {
                for (int i2 : iArr) {
                    if (i == i2) {
                        C11457e.m23435a(new C11456d<Pair<Pair<C11207p, Boolean>, Pair<Boolean, Boolean>>>() {
                            /* access modifiers changed from: private */
                            /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d9, code lost:
                                r0 = move-exception;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:24:0x00da, code lost:
                                com.bytedance.p702im.core.internal.utils.C11498k.m23543a().mo21120a(r7, r8.next_cursor.longValue());
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:25:0x00eb, code lost:
                                throw r0;
                             */
                            /* JADX WARNING: Failed to process nested try/catch */
                            /* JADX WARNING: Removed duplicated region for block: B:23:0x00d9 A[ExcHandler: all (r0v5 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:5:0x0026] */
                            /* renamed from: b */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public android.util.Pair<android.util.Pair<com.bytedance.p702im.core.p706c.C11207p, java.lang.Boolean>, android.util.Pair<java.lang.Boolean, java.lang.Boolean>> mo20683a() {
                                /*
                                    r15 = this;
                                    com.bytedance.im.core.internal.utils.k r0 = com.bytedance.p702im.core.internal.utils.C11498k.m23543a()
                                    int r1 = r7
                                    long r0 = r0.mo21119a(r1)
                                    com.bytedance.im.core.proto.NewMessageNotify r2 = r8
                                    java.lang.Long r2 = r2.next_cursor
                                    long r2 = r2.longValue()
                                    r4 = 0
                                    int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                                    if (r5 > 0) goto L_0x0018
                                    return r4
                                L_0x0018:
                                    com.bytedance.im.core.proto.NewMessageNotify r2 = r8
                                    java.lang.Long r2 = r2.previous_cursor
                                    long r2 = r2.longValue()
                                    r5 = 1
                                    r6 = 0
                                    int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                                    if (r7 != 0) goto L_0x0110
                                    long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    com.bytedance.im.core.proto.NewMessageNotify r2 = r8     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    com.bytedance.im.core.proto.MessageBody r2 = r2.message     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    android.util.Pair r2 = com.bytedance.p702im.core.internal.p718b.p719a.C11333ab.m23156a(r2, r6, r6)     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0051, all -> 0x00d9 }
                                    r3.<init>()     // Catch:{ Exception -> 0x0051, all -> 0x00d9 }
                                    java.lang.String r7 = "duration"
                                    long r8 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0051, all -> 0x00d9 }
                                    r10 = 0
                                    long r8 = r8 - r0
                                    r3.put(r7, r8)     // Catch:{ Exception -> 0x0051, all -> 0x00d9 }
                                    java.lang.String r0 = "msg_count"
                                    r3.put(r0, r5)     // Catch:{ Exception -> 0x0051, all -> 0x00d9 }
                                    java.lang.String r0 = "msg_source"
                                    r3.put(r0, r6)     // Catch:{ Exception -> 0x0051, all -> 0x00d9 }
                                    java.lang.String r0 = "im_save_msg_list_duration"
                                    com.bytedance.p702im.core.p705b.C11176d.m22637a(r0, r3, r4)     // Catch:{ Exception -> 0x0051, all -> 0x00d9 }
                                L_0x0051:
                                    if (r2 == 0) goto L_0x00ec
                                    java.lang.Object r0 = r2.first     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    if (r0 == 0) goto L_0x00ec
                                    java.lang.Object r0 = r2.first     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    com.bytedance.im.core.c.p r0 = (com.bytedance.p702im.core.p706c.C11207p) r0     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    com.bytedance.p702im.core.internal.p710a.C11312m.m23038a()     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    java.lang.String r1 = r0.getConversationId()     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    com.bytedance.im.core.c.b r7 = com.bytedance.p702im.core.internal.p710a.C11312m.m23037a(r1)     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    if (r7 != 0) goto L_0x008c
                                    android.util.Pair r0 = new android.util.Pair     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    android.util.Pair r1 = new android.util.Pair     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    r1.<init>(r3, r5)     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    r0.<init>(r2, r1)     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    com.bytedance.im.core.internal.utils.k r1 = com.bytedance.p702im.core.internal.utils.C11498k.m23543a()
                                    int r2 = r7
                                    com.bytedance.im.core.proto.NewMessageNotify r3 = r8
                                    java.lang.Long r3 = r3.next_cursor
                                    long r3 = r3.longValue()
                                    r1.mo21120a(r2, r3)
                                    return r0
                                L_0x008c:
                                    com.bytedance.p702im.core.internal.p710a.C11319r.m23086a()     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    java.lang.String r8 = r0.getConversationId()     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    long r9 = r7.getReadIndex()     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                                    com.bytedance.im.core.a.c r1 = com.bytedance.p702im.core.p703a.C11165c.m22588a()     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    com.bytedance.im.core.a.a r1 = r1.f30108c     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    long r13 = r1.mo20490a()     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    long r10 = com.bytedance.p702im.core.internal.p710a.C11319r.m23082a(r8, r9, r11, r13)     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    long r8 = r0.getIndex()     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    long r12 = com.bytedance.p702im.core.internal.utils.C11469g.m23479b(r0)     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    com.bytedance.p702im.core.internal.p718b.p719a.C11333ab.m23158a(r7, r8, r10, r12)     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    android.util.Pair r0 = new android.util.Pair     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    android.util.Pair r1 = new android.util.Pair     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    r1.<init>(r3, r5)     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    r0.<init>(r2, r1)     // Catch:{ Exception -> 0x00ec, all -> 0x00d9 }
                                    com.bytedance.im.core.internal.utils.k r1 = com.bytedance.p702im.core.internal.utils.C11498k.m23543a()
                                    int r2 = r7
                                    com.bytedance.im.core.proto.NewMessageNotify r3 = r8
                                    java.lang.Long r3 = r3.next_cursor
                                    long r3 = r3.longValue()
                                    r1.mo21120a(r2, r3)
                                    return r0
                                L_0x00d9:
                                    r0 = move-exception
                                    com.bytedance.im.core.internal.utils.k r1 = com.bytedance.p702im.core.internal.utils.C11498k.m23543a()
                                    int r2 = r7
                                    com.bytedance.im.core.proto.NewMessageNotify r3 = r8
                                    java.lang.Long r3 = r3.next_cursor
                                    long r3 = r3.longValue()
                                    r1.mo21120a(r2, r3)
                                    throw r0
                                L_0x00ec:
                                    com.bytedance.im.core.internal.utils.k r0 = com.bytedance.p702im.core.internal.utils.C11498k.m23543a()
                                    int r1 = r7
                                    com.bytedance.im.core.proto.NewMessageNotify r2 = r8
                                    java.lang.Long r2 = r2.next_cursor
                                    long r2 = r2.longValue()
                                    r0.mo21120a(r1, r2)
                                    android.util.Pair r0 = new android.util.Pair
                                    android.util.Pair r1 = new android.util.Pair
                                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
                                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
                                    r1.<init>(r2, r3)
                                    r0.<init>(r4, r1)
                                    return r0
                                L_0x0110:
                                    android.util.Pair r0 = new android.util.Pair
                                    android.util.Pair r1 = new android.util.Pair
                                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
                                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
                                    r1.<init>(r2, r3)
                                    r0.<init>(r4, r1)
                                    return r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p702im.core.internal.p718b.p719a.C11333ab.C113341.mo20683a():android.util.Pair");
                            }
                        }, new C11455c<Pair<Pair<C11207p, Boolean>, Pair<Boolean, Boolean>>>() {
                            /* renamed from: a */
                            public final /* synthetic */ void mo20684a(Object obj) {
                                Pair pair = (Pair) obj;
                                if (pair != null) {
                                    if (((Boolean) ((Pair) pair.second).first).booleanValue()) {
                                        if (!(C11165c.m22588a().f30108c.mo20502e() == null || newMessageNotify == null || newMessageNotify.message == null)) {
                                            C11165c.m22588a();
                                        }
                                        C11409r.m23292a();
                                        C11409r.m23295a(i, 2);
                                    } else if (pair.first != null) {
                                        Pair pair2 = (Pair) pair.first;
                                        C11207p pVar = (C11207p) pair2.first;
                                        boolean booleanValue = ((Boolean) pair2.second).booleanValue();
                                        C11180b a = C11182d.m22641a().mo20658a(pVar.getConversationId());
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(pVar);
                                        if (booleanValue) {
                                            C11472i.m23483a().mo20726a((List<C11207p>) arrayList, 0);
                                        } else {
                                            C11472i.m23483a().mo20732e((List<C11207p>) arrayList);
                                        }
                                        C11182d.m22641a().mo20668b(a);
                                        if (booleanValue) {
                                            if (pVar == null || C11182d.m22641a().mo20677d(pVar.getConversationId()) || pVar.isSelf()) {
                                                pVar = null;
                                            }
                                            if (pVar != null) {
                                                C11165c.m22588a().f30108c.mo20496a(Collections.singletonList(pVar));
                                            }
                                        }
                                        if (((Boolean) ((Pair) pair.second).second).booleanValue()) {
                                            new C11387j().mo21049a(i, ((C11207p) pair2.first).getConversationId(), ((C11207p) pair2.first).getConversationShortId(), ((C11207p) pair2.first).getConversationType(), ((C11207p) pair2.first).getCreatedAt());
                                        }
                                        C11324a.m23124a();
                                    } else {
                                        C11324a.m23124a();
                                    }
                                }
                            }
                        }, C11452a.m23426c());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static Pair<C11207p, Boolean> m23156a(MessageBody messageBody, boolean z, int i) {
        return m23157a(messageBody, z, null, i);
    }

    /* renamed from: a */
    static void m23158a(C11180b bVar, long j, long j2, long j3) {
        if (j3 > bVar.getUpdatedTime()) {
            bVar.setUpdatedTime(j3);
        }
        bVar.setLastMessageIndex(j);
        bVar.setUnreadCount(j2);
        C11312m.m23038a();
        if (C11312m.m23044b(bVar)) {
            C11182d.m22641a().mo20681f(bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009a, code lost:
        if (r6.version.longValue() > r7.getVersion()) goto L_0x009e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<com.bytedance.p702im.core.p706c.C11207p, java.lang.Boolean> m23157a(com.bytedance.p702im.core.proto.MessageBody r6, boolean r7, android.util.Pair<java.lang.String, java.lang.String> r8, int r9) {
        /*
            com.bytedance.im.core.a.c r0 = com.bytedance.p702im.core.p703a.C11165c.m22588a()
            com.bytedance.im.core.a.a r0 = r0.f30108c
            if (r0 == 0) goto L_0x0022
            com.bytedance.im.core.a.c r0 = com.bytedance.p702im.core.p703a.C11165c.m22588a()
            com.bytedance.im.core.a.a r0 = r0.f30108c
            com.bytedance.im.core.a.b r0 = r0.mo20502e()
            if (r0 == 0) goto L_0x0022
            com.bytedance.im.core.a.c r0 = com.bytedance.p702im.core.p703a.C11165c.m22588a()
            com.bytedance.im.core.a.a r0 = r0.f30108c
            com.bytedance.im.core.a.b r0 = r0.mo20502e()
            com.bytedance.im.core.proto.MessageBody r6 = r0.mo20511a(r6, r9)
        L_0x0022:
            boolean r9 = com.bytedance.p702im.core.internal.utils.C11469g.m23478a(r6)
            r0 = 0
            if (r9 == 0) goto L_0x00f0
            boolean r9 = com.bytedance.p702im.core.internal.p718b.p719a.C11367e.m23218a(r6)
            if (r9 == 0) goto L_0x0030
            return r0
        L_0x0030:
            boolean r9 = com.bytedance.p702im.core.internal.utils.C11469g.m23480b(r6)
            if (r9 == 0) goto L_0x003a
            com.bytedance.p702im.core.internal.p718b.p719a.C11351aj.m23190a(r6)
            return r0
        L_0x003a:
            java.util.Map<java.lang.String, java.lang.String> r9 = r6.ext
            java.lang.String r1 = ""
            if (r9 == 0) goto L_0x005e
            java.lang.String r2 = "s:client_message_id"
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L_0x005e
            java.lang.String r2 = "s:client_message_id"
            java.lang.Object r2 = r9.get(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x005e
            java.lang.String r1 = "s:client_message_id"
            java.lang.Object r1 = r9.get(r1)
            java.lang.String r1 = (java.lang.String) r1
        L_0x005e:
            if (r9 == 0) goto L_0x009d
            java.lang.String r2 = "s:server_message_id"
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L_0x009d
            java.lang.String r2 = "s:server_message_id"
            java.lang.Object r2 = r9.get(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x009d
            if (r7 == 0) goto L_0x0079
            return r0
        L_0x0079:
            java.lang.String r7 = "s:server_message_id"
            java.lang.Object r7 = r9.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            long r2 = java.lang.Long.parseLong(r7)
            com.bytedance.p702im.core.internal.p710a.C11319r.m23086a()
            com.bytedance.im.core.c.p r7 = com.bytedance.p702im.core.internal.p710a.C11319r.m23083a(r2)
            if (r7 == 0) goto L_0x009d
            java.lang.Long r9 = r6.version
            long r2 = r9.longValue()
            long r4 = r7.getVersion()
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            r7 = r0
        L_0x009e:
            if (r7 != 0) goto L_0x00bb
            boolean r7 = android.text.TextUtils.isEmpty(r1)
            if (r7 == 0) goto L_0x00b4
            com.bytedance.p702im.core.internal.p710a.C11319r.m23086a()
            java.lang.Long r7 = r6.server_message_id
            long r2 = r7.longValue()
            com.bytedance.im.core.c.p r7 = com.bytedance.p702im.core.internal.p710a.C11319r.m23083a(r2)
            goto L_0x00bb
        L_0x00b4:
            com.bytedance.p702im.core.internal.p710a.C11319r.m23086a()
            com.bytedance.im.core.c.p r7 = com.bytedance.p702im.core.internal.p710a.C11319r.m23094d(r1)
        L_0x00bb:
            if (r7 != 0) goto L_0x00bf
            r9 = 1
            goto L_0x00c0
        L_0x00bf:
            r9 = 0
        L_0x00c0:
            com.bytedance.im.core.c.p r6 = com.bytedance.p702im.core.internal.utils.C11464c.m23451a(r1, r7, r6)
            if (r8 == 0) goto L_0x00d1
            java.util.Map r7 = r6.getLocalExt()
            java.lang.Object r1 = r8.first
            java.lang.Object r8 = r8.second
            r7.put(r1, r8)
        L_0x00d1:
            if (r9 == 0) goto L_0x00db
            com.bytedance.p702im.core.internal.p710a.C11319r.m23086a()
            boolean r7 = com.bytedance.p702im.core.internal.p710a.C11319r.m23091b(r6)
            goto L_0x00e3
        L_0x00db:
            com.bytedance.im.core.internal.a.r r7 = com.bytedance.p702im.core.internal.p710a.C11319r.m23086a()
            boolean r7 = r7.mo21021a(r6)
        L_0x00e3:
            if (r7 == 0) goto L_0x00ef
            android.util.Pair r7 = new android.util.Pair
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r9)
            r7.<init>(r6, r8)
            return r7
        L_0x00ef:
            return r0
        L_0x00f0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p702im.core.internal.p718b.p719a.C11333ab.m23157a(com.bytedance.im.core.proto.MessageBody, boolean, android.util.Pair, int):android.util.Pair");
    }
}
