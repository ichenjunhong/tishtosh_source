package com.bytedance.p702im.core.internal.p718b.p719a;

import com.bytedance.p702im.core.internal.p710a.C11312m;
import com.bytedance.p702im.core.internal.p710a.C11319r;
import com.bytedance.p702im.core.internal.p718b.C11324a;
import com.bytedance.p702im.core.internal.utils.C11472i;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11203l;
import com.bytedance.p702im.core.proto.MessageBody;
import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.b.a.e */
final class C11367e {
    @C17952c(mo34828a = "command_type")

    /* renamed from: a */
    private int f30564a;
    @C17952c(mo34828a = "inbox_type")

    /* renamed from: b */
    private int f30565b;
    @C17952c(mo34828a = "conversation_id")

    /* renamed from: c */
    private String f30566c;
    @C17952c(mo34828a = "conversation_type")

    /* renamed from: d */
    private int f30567d;
    @C17952c(mo34828a = "message_id")

    /* renamed from: e */
    private long f30568e;
    @C17952c(mo34828a = "read_index")

    /* renamed from: f */
    private long f30569f;
    @C17952c(mo34828a = "unread_count")

    /* renamed from: g */
    private int f30570g;
    @C17952c(mo34828a = "last_message_index")

    /* renamed from: h */
    private long f30571h;
    @C17952c(mo34828a = "conversation_version")

    /* renamed from: i */
    private long f30572i;
    @C17952c(mo34828a = "group_version")

    /* renamed from: j */
    private long f30573j;
    @C17952c(mo34828a = "added_participant")

    /* renamed from: k */
    private List<Long> f30574k;
    @C17952c(mo34828a = "modified_participant")

    /* renamed from: l */
    private List<Long> f30575l;
    @C17952c(mo34828a = "removed_participant")

    /* renamed from: m */
    private List<Long> f30576m;

    C11367e() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0177, code lost:
        if (r14.removeMentionMessage(r1.getUuid()) != false) goto L_0x0179;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0285 A[Catch:{ Exception -> 0x0336 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02a2 A[Catch:{ Exception -> 0x0336 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02dc A[Catch:{ Exception -> 0x0336 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x017c A[Catch:{ Exception -> 0x020d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m23218a(com.bytedance.p702im.core.proto.MessageBody r14) {
        /*
            java.lang.Integer r0 = r14.message_type
            int r0 = r0.intValue()
            com.bytedance.im.core.proto.MessageType r1 = com.bytedance.p702im.core.proto.MessageType.MESSAGE_TYPE_COMMAND
            int r1 = r1.getValue()
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L_0x0214
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x020d }
            java.lang.String r1 = r14.content     // Catch:{ Exception -> 0x020d }
            r0.<init>(r1)     // Catch:{ Exception -> 0x020d }
            com.google.gson.f r1 = com.bytedance.p702im.core.internal.utils.C11466d.f30773a     // Catch:{ Exception -> 0x020d }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x020d }
            java.lang.Class<com.bytedance.im.core.internal.b.a.e> r5 = com.bytedance.p702im.core.internal.p718b.p719a.C11367e.class
            java.lang.Object r0 = r1.mo34884a(r0, r5)     // Catch:{ Exception -> 0x020d }
            com.bytedance.im.core.internal.b.a.e r0 = (com.bytedance.p702im.core.internal.p718b.p719a.C11367e) r0     // Catch:{ Exception -> 0x020d }
            int r1 = r0.f30564a     // Catch:{ Exception -> 0x020d }
            switch(r1) {
                case 1: goto L_0x018a;
                case 2: goto L_0x011f;
                case 3: goto L_0x00f6;
                case 4: goto L_0x00f1;
                case 5: goto L_0x002b;
                case 6: goto L_0x00cb;
                case 7: goto L_0x003b;
                case 8: goto L_0x0034;
                case 9: goto L_0x002d;
                default: goto L_0x002b;
            }     // Catch:{ Exception -> 0x020d }
        L_0x002b:
            goto L_0x0213
        L_0x002d:
            java.lang.String r14 = r0.f30566c     // Catch:{ Exception -> 0x020d }
            m23217a(r14, r4)     // Catch:{ Exception -> 0x020d }
            goto L_0x0213
        L_0x0034:
            java.lang.String r14 = r0.f30566c     // Catch:{ Exception -> 0x020d }
            com.bytedance.p702im.core.internal.p718b.p719a.C11333ab.m23159a(r14)     // Catch:{ Exception -> 0x020d }
            goto L_0x0213
        L_0x003b:
            if (r0 == 0) goto L_0x0059
            java.util.List<java.lang.Long> r1 = r0.f30576m     // Catch:{ Exception -> 0x020d }
            if (r1 == 0) goto L_0x0059
            java.util.List<java.lang.Long> r1 = r0.f30576m     // Catch:{ Exception -> 0x020d }
            com.bytedance.im.core.a.c r5 = com.bytedance.p702im.core.p703a.C11165c.m22588a()     // Catch:{ Exception -> 0x020d }
            com.bytedance.im.core.a.a r5 = r5.f30108c     // Catch:{ Exception -> 0x020d }
            long r5 = r5.mo20490a()     // Catch:{ Exception -> 0x020d }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x020d }
            boolean r1 = r1.contains(r5)     // Catch:{ Exception -> 0x020d }
            if (r1 == 0) goto L_0x0059
            r1 = 1
            goto L_0x005a
        L_0x0059:
            r1 = 0
        L_0x005a:
            if (r0 == 0) goto L_0x009f
            java.lang.String r5 = r0.f30566c     // Catch:{ Exception -> 0x020d }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x020d }
            if (r5 != 0) goto L_0x009f
            com.bytedance.p702im.core.internal.p710a.C11312m.m23038a()     // Catch:{ Exception -> 0x020d }
            java.lang.String r2 = r0.f30566c     // Catch:{ Exception -> 0x020d }
            com.bytedance.im.core.c.b r2 = com.bytedance.p702im.core.internal.p710a.C11312m.m23037a(r2)     // Catch:{ Exception -> 0x020d }
            java.util.List<java.lang.Long> r5 = r0.f30576m     // Catch:{ Exception -> 0x020d }
            if (r5 == 0) goto L_0x009f
            java.util.List<java.lang.Long> r5 = r0.f30576m     // Catch:{ Exception -> 0x020d }
            int r5 = r5.size()     // Catch:{ Exception -> 0x020d }
            if (r5 <= 0) goto L_0x009f
            com.bytedance.p702im.core.internal.p710a.C11313n.m23051a()     // Catch:{ Exception -> 0x020d }
            java.lang.String r5 = r0.f30566c     // Catch:{ Exception -> 0x020d }
            java.util.List<java.lang.Long> r6 = r0.f30576m     // Catch:{ Exception -> 0x020d }
            int r5 = com.bytedance.p702im.core.internal.p710a.C11313n.m23059c(r5, r6)     // Catch:{ Exception -> 0x020d }
            if (r2 == 0) goto L_0x009f
            if (r5 <= 0) goto L_0x009f
            int r6 = r2.getMemberCount()     // Catch:{ Exception -> 0x020d }
            int r6 = r6 - r5
            int r5 = java.lang.Math.max(r3, r6)     // Catch:{ Exception -> 0x020d }
            r2.setMemberCount(r5)     // Catch:{ Exception -> 0x020d }
            if (r1 == 0) goto L_0x0099
            r2.setIsMember(r3)     // Catch:{ Exception -> 0x020d }
        L_0x0099:
            com.bytedance.p702im.core.internal.p710a.C11312m.m23038a()     // Catch:{ Exception -> 0x020d }
            com.bytedance.p702im.core.internal.p710a.C11312m.m23044b(r2)     // Catch:{ Exception -> 0x020d }
        L_0x009f:
            if (r1 == 0) goto L_0x00bf
            if (r2 == 0) goto L_0x00af
            com.bytedance.im.core.internal.b.a.r r14 = com.bytedance.p702im.core.internal.p718b.p719a.C11409r.m23292a()     // Catch:{ Exception -> 0x020d }
            com.bytedance.im.core.internal.b.a.e$6 r0 = new com.bytedance.im.core.internal.b.a.e$6     // Catch:{ Exception -> 0x020d }
            r0.<init>(r2)     // Catch:{ Exception -> 0x020d }
            r14.mo21062a(r0)     // Catch:{ Exception -> 0x020d }
        L_0x00af:
            if (r2 == 0) goto L_0x0213
            com.bytedance.im.core.internal.b.a.r r14 = com.bytedance.p702im.core.internal.p718b.p719a.C11409r.m23292a()     // Catch:{ Exception -> 0x020d }
            com.bytedance.im.core.internal.b.a.e$7 r0 = new com.bytedance.im.core.internal.b.a.e$7     // Catch:{ Exception -> 0x020d }
            r0.<init>(r2)     // Catch:{ Exception -> 0x020d }
            r14.mo21062a(r0)     // Catch:{ Exception -> 0x020d }
            goto L_0x0213
        L_0x00bf:
            m23216a(r0, r14, r4)     // Catch:{ Exception -> 0x020d }
            com.bytedance.im.core.internal.utils.i r14 = com.bytedance.p702im.core.internal.utils.C11472i.m23483a()     // Catch:{ Exception -> 0x020d }
            r14.mo20719f(r2)     // Catch:{ Exception -> 0x020d }
            goto L_0x0213
        L_0x00cb:
            com.bytedance.p702im.core.internal.p710a.C11312m.m23038a()     // Catch:{ Exception -> 0x020d }
            java.lang.String r1 = r0.f30566c     // Catch:{ Exception -> 0x020d }
            com.bytedance.im.core.c.b r1 = com.bytedance.p702im.core.internal.p710a.C11312m.m23037a(r1)     // Catch:{ Exception -> 0x020d }
            if (r1 == 0) goto L_0x0213
            com.bytedance.im.core.c.c r2 = r1.getCoreInfo()     // Catch:{ Exception -> 0x020d }
            if (r2 == 0) goto L_0x0213
            com.bytedance.im.core.c.c r1 = r1.getCoreInfo()     // Catch:{ Exception -> 0x020d }
            long r1 = r1.getVersion()     // Catch:{ Exception -> 0x020d }
            long r5 = r0.f30573j     // Catch:{ Exception -> 0x020d }
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0213
            int r0 = r0.f30565b     // Catch:{ Exception -> 0x020d }
            com.bytedance.p702im.core.internal.p718b.C11324a.m23126a(r0, r14)     // Catch:{ Exception -> 0x020d }
            goto L_0x0213
        L_0x00f1:
            m23216a(r0, r14, r3)     // Catch:{ Exception -> 0x020d }
            goto L_0x0213
        L_0x00f6:
            com.bytedance.p702im.core.internal.p710a.C11312m.m23038a()     // Catch:{ Exception -> 0x020d }
            java.lang.String r14 = r0.f30566c     // Catch:{ Exception -> 0x020d }
            com.bytedance.im.core.c.b r14 = com.bytedance.p702im.core.internal.p710a.C11312m.m23037a(r14)     // Catch:{ Exception -> 0x020d }
            if (r14 == 0) goto L_0x0116
            com.bytedance.p702im.core.internal.p710a.C11312m.m23038a()     // Catch:{ Exception -> 0x020d }
            boolean r1 = com.bytedance.p702im.core.internal.p710a.C11312m.m23046c(r14)     // Catch:{ Exception -> 0x020d }
            if (r1 == 0) goto L_0x0116
            com.bytedance.im.core.internal.b.a.r r1 = com.bytedance.p702im.core.internal.p718b.p719a.C11409r.m23292a()     // Catch:{ Exception -> 0x020d }
            com.bytedance.im.core.internal.b.a.e$4 r2 = new com.bytedance.im.core.internal.b.a.e$4     // Catch:{ Exception -> 0x020d }
            r2.<init>(r14)     // Catch:{ Exception -> 0x020d }
            r1.mo21062a(r2)     // Catch:{ Exception -> 0x020d }
        L_0x0116:
            int r14 = r0.f30565b     // Catch:{ Exception -> 0x020d }
            java.lang.String r0 = r0.f30566c     // Catch:{ Exception -> 0x020d }
            com.bytedance.p702im.core.internal.p718b.C11324a.m23127a(r14, r0)     // Catch:{ Exception -> 0x020d }
            goto L_0x0213
        L_0x011f:
            com.bytedance.im.core.c.d r14 = com.bytedance.p702im.core.p706c.C11182d.m22641a()     // Catch:{ Exception -> 0x020d }
            java.lang.String r1 = r0.f30566c     // Catch:{ Exception -> 0x020d }
            com.bytedance.im.core.c.b r14 = r14.mo20658a(r1)     // Catch:{ Exception -> 0x020d }
            if (r14 == 0) goto L_0x0213
            com.bytedance.im.core.c.p r1 = r14.getLastMessage()     // Catch:{ Exception -> 0x020d }
            if (r1 != 0) goto L_0x0133
            goto L_0x0213
        L_0x0133:
            com.bytedance.p702im.core.internal.p710a.C11319r.m23086a()     // Catch:{ Exception -> 0x020d }
            long r1 = r0.f30568e     // Catch:{ Exception -> 0x020d }
            com.bytedance.im.core.c.p r1 = com.bytedance.p702im.core.internal.p710a.C11319r.m23083a(r1)     // Catch:{ Exception -> 0x020d }
            if (r1 == 0) goto L_0x0213
            r1.setDeleted(r4)     // Catch:{ Exception -> 0x020d }
            com.bytedance.im.core.c.p r2 = r14.getLastMessage()     // Catch:{ Exception -> 0x020d }
            com.bytedance.p702im.core.internal.p710a.C11319r.m23086a()     // Catch:{ Exception -> 0x020d }
            java.lang.String r5 = r1.getUuid()     // Catch:{ Exception -> 0x020d }
            boolean r5 = com.bytedance.p702im.core.internal.p710a.C11319r.m23092b(r5)     // Catch:{ Exception -> 0x020d }
            if (r5 == 0) goto L_0x016d
            java.lang.String r2 = r2.getUuid()     // Catch:{ Exception -> 0x020d }
            java.lang.String r6 = r1.getUuid()     // Catch:{ Exception -> 0x020d }
            boolean r2 = r2.equals(r6)     // Catch:{ Exception -> 0x020d }
            if (r2 == 0) goto L_0x016d
            com.bytedance.p702im.core.internal.p710a.C11319r.m23086a()     // Catch:{ Exception -> 0x020d }
            java.lang.String r0 = r0.f30566c     // Catch:{ Exception -> 0x020d }
            com.bytedance.im.core.c.p r0 = com.bytedance.p702im.core.internal.p710a.C11319r.m23098i(r0)     // Catch:{ Exception -> 0x020d }
            r14.setLastMessage(r0)     // Catch:{ Exception -> 0x020d }
            goto L_0x0179
        L_0x016d:
            if (r5 == 0) goto L_0x017a
            java.lang.String r0 = r1.getUuid()     // Catch:{ Exception -> 0x020d }
            boolean r0 = r14.removeMentionMessage(r0)     // Catch:{ Exception -> 0x020d }
            if (r0 == 0) goto L_0x017a
        L_0x0179:
            r3 = 1
        L_0x017a:
            if (r5 == 0) goto L_0x0213
            com.bytedance.im.core.internal.b.a.r r0 = com.bytedance.p702im.core.internal.p718b.p719a.C11409r.m23292a()     // Catch:{ Exception -> 0x020d }
            com.bytedance.im.core.internal.b.a.e$3 r2 = new com.bytedance.im.core.internal.b.a.e$3     // Catch:{ Exception -> 0x020d }
            r2.<init>(r1, r3, r14)     // Catch:{ Exception -> 0x020d }
            r0.mo21062a(r2)     // Catch:{ Exception -> 0x020d }
            goto L_0x0213
        L_0x018a:
            com.bytedance.p702im.core.internal.p710a.C11312m.m23038a()     // Catch:{ Exception -> 0x020d }
            java.lang.String r14 = r0.f30566c     // Catch:{ Exception -> 0x020d }
            com.bytedance.im.core.c.b r14 = com.bytedance.p702im.core.internal.p710a.C11312m.m23037a(r14)     // Catch:{ Exception -> 0x020d }
            if (r14 == 0) goto L_0x0213
            long r5 = r0.f30569f     // Catch:{ Exception -> 0x020d }
            long r7 = r14.getReadIndex()     // Catch:{ Exception -> 0x020d }
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x0213
            long r5 = r14.getUnreadCount()     // Catch:{ Exception -> 0x020d }
            com.bytedance.p702im.core.internal.p710a.C11319r.m23086a()     // Catch:{ Exception -> 0x020d }
            java.lang.String r7 = r14.getConversationId()     // Catch:{ Exception -> 0x020d }
            long r8 = r14.getReadIndex()     // Catch:{ Exception -> 0x020d }
            long r10 = r0.f30569f     // Catch:{ Exception -> 0x020d }
            com.bytedance.im.core.a.c r1 = com.bytedance.p702im.core.p703a.C11165c.m22588a()     // Catch:{ Exception -> 0x020d }
            com.bytedance.im.core.a.a r1 = r1.f30108c     // Catch:{ Exception -> 0x020d }
            long r12 = r1.mo20490a()     // Catch:{ Exception -> 0x020d }
            long r7 = com.bytedance.p702im.core.internal.p710a.C11319r.m23082a(r7, r8, r10, r12)     // Catch:{ Exception -> 0x020d }
            r1 = 0
            long r5 = r5 - r7
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 < 0) goto L_0x01c8
            r9 = r5
            goto L_0x01c9
        L_0x01c8:
            r9 = r7
        L_0x01c9:
            r14.setUnreadCount(r9)     // Catch:{ Exception -> 0x020d }
            long r9 = r0.f30569f     // Catch:{ Exception -> 0x020d }
            r14.setReadIndex(r9)     // Catch:{ Exception -> 0x020d }
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x01e1
            com.bytedance.p702im.core.internal.p710a.C11318q.m23074a()     // Catch:{ Exception -> 0x020d }
            java.lang.String r1 = r0.f30566c     // Catch:{ Exception -> 0x020d }
            com.bytedance.p702im.core.internal.p710a.C11318q.m23078b(r1)     // Catch:{ Exception -> 0x020d }
            r14.setMentionMessages(r2)     // Catch:{ Exception -> 0x020d }
            goto L_0x01ef
        L_0x01e1:
            com.bytedance.p702im.core.internal.p710a.C11318q.m23074a()     // Catch:{ Exception -> 0x020d }
            java.lang.String r1 = r0.f30566c     // Catch:{ Exception -> 0x020d }
            long r2 = r0.f30569f     // Catch:{ Exception -> 0x020d }
            java.util.List r1 = com.bytedance.p702im.core.internal.p710a.C11318q.m23075a(r1, r2)     // Catch:{ Exception -> 0x020d }
            r14.setMentionMessages(r1)     // Catch:{ Exception -> 0x020d }
        L_0x01ef:
            com.bytedance.p702im.core.internal.p710a.C11312m.m23038a()     // Catch:{ Exception -> 0x020d }
            boolean r1 = com.bytedance.p702im.core.internal.p710a.C11312m.m23044b(r14)     // Catch:{ Exception -> 0x020d }
            if (r1 == 0) goto L_0x0213
            com.bytedance.p702im.core.internal.p710a.C11319r.m23086a()     // Catch:{ Exception -> 0x020d }
            java.lang.String r0 = r0.f30566c     // Catch:{ Exception -> 0x020d }
            com.bytedance.p702im.core.internal.p710a.C11319r.m23099j(r0)     // Catch:{ Exception -> 0x020d }
            com.bytedance.im.core.internal.b.a.r r0 = com.bytedance.p702im.core.internal.p718b.p719a.C11409r.m23292a()     // Catch:{ Exception -> 0x020d }
            com.bytedance.im.core.internal.b.a.e$2 r1 = new com.bytedance.im.core.internal.b.a.e$2     // Catch:{ Exception -> 0x020d }
            r1.<init>(r14)     // Catch:{ Exception -> 0x020d }
            r0.mo21062a(r1)     // Catch:{ Exception -> 0x020d }
            goto L_0x0213
        L_0x020d:
            r14 = move-exception
            java.lang.String r0 = "handle command"
            com.bytedance.p702im.core.internal.utils.C11467e.m23465a(r0, r14)
        L_0x0213:
            return r4
        L_0x0214:
            java.lang.Integer r0 = r14.message_type
            int r0 = r0.intValue()
            com.bytedance.im.core.proto.MessageType r1 = com.bytedance.p702im.core.proto.MessageType.MESSAGE_TYPE_UPDATE_MESSAGE_EXT
            int r1 = r1.getValue()
            if (r0 != r1) goto L_0x033d
            java.util.Map<java.lang.String, java.lang.String> r0 = r14.ext     // Catch:{ Exception -> 0x0336 }
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0246
            java.lang.String r5 = "s:client_message_id"
            boolean r5 = r0.containsKey(r5)     // Catch:{ Exception -> 0x0336 }
            if (r5 == 0) goto L_0x0246
            java.lang.String r5 = "s:client_message_id"
            java.lang.Object r5 = r0.get(r5)     // Catch:{ Exception -> 0x0336 }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Exception -> 0x0336 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0336 }
            if (r5 != 0) goto L_0x0246
            java.lang.String r1 = "s:client_message_id"
            java.lang.Object r1 = r0.get(r1)     // Catch:{ Exception -> 0x0336 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0336 }
        L_0x0246:
            if (r0 == 0) goto L_0x0282
            java.lang.String r5 = "s:server_message_id"
            boolean r5 = r0.containsKey(r5)     // Catch:{ Exception -> 0x0336 }
            if (r5 == 0) goto L_0x0282
            java.lang.String r5 = "s:server_message_id"
            java.lang.Object r5 = r0.get(r5)     // Catch:{ Exception -> 0x0336 }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Exception -> 0x0336 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0336 }
            if (r5 != 0) goto L_0x0282
            java.lang.String r5 = "s:server_message_id"
            java.lang.Object r0 = r0.get(r5)     // Catch:{ Exception -> 0x0336 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0336 }
            long r5 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0336 }
            com.bytedance.p702im.core.internal.p710a.C11319r.m23086a()     // Catch:{ Exception -> 0x0336 }
            com.bytedance.im.core.c.p r0 = com.bytedance.p702im.core.internal.p710a.C11319r.m23083a(r5)     // Catch:{ Exception -> 0x0336 }
            if (r0 == 0) goto L_0x0282
            java.lang.Long r5 = r14.version     // Catch:{ Exception -> 0x0336 }
            long r5 = r5.longValue()     // Catch:{ Exception -> 0x0336 }
            long r7 = r0.getVersion()     // Catch:{ Exception -> 0x0336 }
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0282
            goto L_0x0283
        L_0x0282:
            r0 = r2
        L_0x0283:
            if (r0 != 0) goto L_0x02a0
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0336 }
            if (r0 == 0) goto L_0x0299
            com.bytedance.p702im.core.internal.p710a.C11319r.m23086a()     // Catch:{ Exception -> 0x0336 }
            java.lang.Long r0 = r14.server_message_id     // Catch:{ Exception -> 0x0336 }
            long r5 = r0.longValue()     // Catch:{ Exception -> 0x0336 }
            com.bytedance.im.core.c.p r0 = com.bytedance.p702im.core.internal.p710a.C11319r.m23083a(r5)     // Catch:{ Exception -> 0x0336 }
            goto L_0x02a0
        L_0x0299:
            com.bytedance.p702im.core.internal.p710a.C11319r.m23086a()     // Catch:{ Exception -> 0x0336 }
            com.bytedance.im.core.c.p r0 = com.bytedance.p702im.core.internal.p710a.C11319r.m23094d(r1)     // Catch:{ Exception -> 0x0336 }
        L_0x02a0:
            if (r0 == 0) goto L_0x033c
            com.bytedance.im.core.c.p r14 = com.bytedance.p702im.core.internal.utils.C11464c.m23452a(r1, r0, r14, r4)     // Catch:{ Exception -> 0x0336 }
            com.bytedance.im.core.internal.a.r r0 = com.bytedance.p702im.core.internal.p710a.C11319r.m23086a()     // Catch:{ Exception -> 0x0336 }
            boolean r0 = r0.mo21021a(r14)     // Catch:{ Exception -> 0x0336 }
            if (r0 == 0) goto L_0x033c
            boolean r0 = r14.isRecalled()     // Catch:{ Exception -> 0x0336 }
            if (r0 == 0) goto L_0x02ce
            java.util.List r0 = r14.getMentionIds()     // Catch:{ Exception -> 0x0336 }
            if (r0 == 0) goto L_0x02ce
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x0336 }
            if (r0 != 0) goto L_0x02ce
            com.bytedance.p702im.core.internal.p710a.C11318q.m23074a()     // Catch:{ Exception -> 0x0336 }
            java.lang.String r0 = r14.getUuid()     // Catch:{ Exception -> 0x0336 }
            boolean r0 = com.bytedance.p702im.core.internal.p710a.C11318q.m23076a(r0)     // Catch:{ Exception -> 0x0336 }
            goto L_0x02cf
        L_0x02ce:
            r0 = 0
        L_0x02cf:
            com.bytedance.p702im.core.internal.p710a.C11312m.m23038a()     // Catch:{ Exception -> 0x0336 }
            java.lang.String r1 = r14.getConversationId()     // Catch:{ Exception -> 0x0336 }
            com.bytedance.im.core.c.b r1 = com.bytedance.p702im.core.internal.p710a.C11312m.m23037a(r1)     // Catch:{ Exception -> 0x0336 }
            if (r1 == 0) goto L_0x033c
            com.bytedance.im.core.c.p r2 = r1.getLastMessage()     // Catch:{ Exception -> 0x0336 }
            if (r2 != 0) goto L_0x02e3
            goto L_0x033c
        L_0x02e3:
            com.bytedance.p702im.core.internal.p710a.C11319r.m23086a()     // Catch:{ Exception -> 0x0336 }
            java.lang.String r5 = r14.getConversationId()     // Catch:{ Exception -> 0x0336 }
            long r6 = r1.getReadIndex()     // Catch:{ Exception -> 0x0336 }
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            com.bytedance.im.core.a.c r2 = com.bytedance.p702im.core.p703a.C11165c.m22588a()     // Catch:{ Exception -> 0x0336 }
            com.bytedance.im.core.a.a r2 = r2.f30108c     // Catch:{ Exception -> 0x0336 }
            long r10 = r2.mo20490a()     // Catch:{ Exception -> 0x0336 }
            long r5 = com.bytedance.p702im.core.internal.p710a.C11319r.m23082a(r5, r6, r8, r10)     // Catch:{ Exception -> 0x0336 }
            long r7 = r1.getUnreadCount()     // Catch:{ Exception -> 0x0336 }
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x030a
            r3 = 1
        L_0x030a:
            r1.setUnreadCount(r5)     // Catch:{ Exception -> 0x0336 }
            java.lang.String r2 = r14.getUuid()     // Catch:{ Exception -> 0x0336 }
            com.bytedance.im.core.c.p r5 = r1.getLastMessage()     // Catch:{ Exception -> 0x0336 }
            java.lang.String r5 = r5.getUuid()     // Catch:{ Exception -> 0x0336 }
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x0336 }
            if (r2 == 0) goto L_0x0323
            r1.setLastMessage(r14)     // Catch:{ Exception -> 0x0336 }
            r3 = 1
        L_0x0323:
            com.bytedance.p702im.core.internal.p710a.C11312m.m23038a()     // Catch:{ Exception -> 0x0336 }
            com.bytedance.p702im.core.internal.p710a.C11312m.m23044b(r1)     // Catch:{ Exception -> 0x0336 }
            com.bytedance.im.core.internal.b.a.r r2 = com.bytedance.p702im.core.internal.p718b.p719a.C11409r.m23292a()     // Catch:{ Exception -> 0x0336 }
            com.bytedance.im.core.internal.b.a.e$1 r5 = new com.bytedance.im.core.internal.b.a.e$1     // Catch:{ Exception -> 0x0336 }
            r5.<init>(r14, r3, r0, r1)     // Catch:{ Exception -> 0x0336 }
            r2.mo21062a(r5)     // Catch:{ Exception -> 0x0336 }
            goto L_0x033c
        L_0x0336:
            r14 = move-exception
            java.lang.String r0 = "handle update"
            com.bytedance.p702im.core.internal.utils.C11467e.m23465a(r0, r14)
        L_0x033c:
            return r4
        L_0x033d:
            java.lang.Integer r0 = r14.message_type
            int r0 = r0.intValue()
            com.bytedance.im.core.proto.MessageType r1 = com.bytedance.p702im.core.proto.MessageType.MESSAGE_TYPE_MODE_CHANGE
            int r1 = r1.getValue()
            if (r0 != r1) goto L_0x0351
            java.lang.String r14 = r14.conversation_id
            m23217a(r14, r3)
            return r4
        L_0x0351:
            java.lang.Integer r0 = r14.message_type
            int r0 = r0.intValue()
            com.bytedance.im.core.proto.MessageType r1 = com.bytedance.p702im.core.proto.MessageType.MESSAGE_TYPE_CONVERSATION_DESTROY
            int r1 = r1.getValue()
            if (r0 != r1) goto L_0x03c7
            com.bytedance.p702im.core.internal.p710a.C11312m.m23038a()
            java.lang.String r0 = r14.conversation_id
            com.bytedance.im.core.c.b r0 = com.bytedance.p702im.core.internal.p710a.C11312m.m23037a(r0)
            if (r0 == 0) goto L_0x03c6
            com.bytedance.p702im.core.internal.p710a.C11312m.m23038a()
            java.lang.String r1 = r0.getConversationId()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0378
            goto L_0x03ae
        L_0x0378:
            com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22878a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "update conversation_list set "
            r2.<init>(r3)
            com.bytedance.im.core.internal.a.b r3 = com.bytedance.p702im.core.internal.p710a.C11268b.COLUMN_STATUS
            java.lang.String r3 = r3.key
            r2.append(r3)
            java.lang.String r3 = "=1"
            r2.append(r3)
            java.lang.String r3 = " where "
            r2.append(r3)
            com.bytedance.im.core.internal.a.b r3 = com.bytedance.p702im.core.internal.p710a.C11268b.COLUMN_ID
            java.lang.String r3 = r3.key
            r2.append(r3)
            java.lang.String r3 = "=\""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22883c(r1)
        L_0x03ae:
            r0.setStatus(r4)
            com.bytedance.im.core.internal.b.a.r r1 = com.bytedance.p702im.core.internal.p718b.p719a.C11409r.m23292a()
            com.bytedance.im.core.internal.b.a.e$8 r2 = new com.bytedance.im.core.internal.b.a.e$8
            r2.<init>(r0)
            r1.mo21062a(r2)
            int r0 = r0.getInboxType()
            java.lang.String r14 = r14.conversation_id
            com.bytedance.p702im.core.internal.p718b.C11324a.m23127a(r0, r14)
        L_0x03c6:
            return r4
        L_0x03c7:
            java.lang.Integer r0 = r14.message_type
            int r0 = r0.intValue()
            com.bytedance.im.core.proto.MessageType r1 = com.bytedance.p702im.core.proto.MessageType.MESSAGE_TYPE_UPDATE_MESSAGE_PROPERTY
            int r1 = r1.getValue()
            if (r0 != r1) goto L_0x049b
            java.util.Map<java.lang.String, java.lang.String> r0 = r14.ext     // Catch:{ Throwable -> 0x0494 }
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x03f9
            java.lang.String r3 = "s:client_message_id"
            boolean r3 = r0.containsKey(r3)     // Catch:{ Throwable -> 0x0494 }
            if (r3 == 0) goto L_0x03f9
            java.lang.String r3 = "s:client_message_id"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ Throwable -> 0x0494 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Throwable -> 0x0494 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x0494 }
            if (r3 != 0) goto L_0x03f9
            java.lang.String r1 = "s:client_message_id"
            java.lang.Object r1 = r0.get(r1)     // Catch:{ Throwable -> 0x0494 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x0494 }
        L_0x03f9:
            if (r0 == 0) goto L_0x049a
            java.lang.String r3 = "s:server_message_id"
            boolean r3 = r0.containsKey(r3)     // Catch:{ Throwable -> 0x0494 }
            if (r3 == 0) goto L_0x049a
            java.lang.String r3 = "s:server_message_id"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ Throwable -> 0x0494 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Throwable -> 0x0494 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x0494 }
            if (r3 != 0) goto L_0x049a
            java.lang.String r3 = "s:server_message_id"
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Throwable -> 0x0494 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x0494 }
            long r5 = java.lang.Long.parseLong(r0)     // Catch:{ Throwable -> 0x0494 }
            com.bytedance.p702im.core.internal.p710a.C11319r.m23086a()     // Catch:{ Throwable -> 0x0494 }
            com.bytedance.im.core.c.p r0 = com.bytedance.p702im.core.internal.p710a.C11319r.m23083a(r5)     // Catch:{ Throwable -> 0x0494 }
            if (r0 == 0) goto L_0x0435
            java.lang.Long r3 = r14.version     // Catch:{ Throwable -> 0x0494 }
            long r5 = r3.longValue()     // Catch:{ Throwable -> 0x0494 }
            long r7 = r0.getVersion()     // Catch:{ Throwable -> 0x0494 }
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x0435
            goto L_0x0436
        L_0x0435:
            r0 = r2
        L_0x0436:
            if (r0 != 0) goto L_0x0453
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x0494 }
            if (r0 == 0) goto L_0x044c
            com.bytedance.p702im.core.internal.p710a.C11319r.m23086a()     // Catch:{ Throwable -> 0x0494 }
            java.lang.Long r0 = r14.server_message_id     // Catch:{ Throwable -> 0x0494 }
            long r2 = r0.longValue()     // Catch:{ Throwable -> 0x0494 }
            com.bytedance.im.core.c.p r0 = com.bytedance.p702im.core.internal.p710a.C11319r.m23083a(r2)     // Catch:{ Throwable -> 0x0494 }
            goto L_0x0453
        L_0x044c:
            com.bytedance.p702im.core.internal.p710a.C11319r.m23086a()     // Catch:{ Throwable -> 0x0494 }
            com.bytedance.im.core.c.p r0 = com.bytedance.p702im.core.internal.p710a.C11319r.m23094d(r1)     // Catch:{ Throwable -> 0x0494 }
        L_0x0453:
            if (r0 == 0) goto L_0x049a
            java.lang.Long r2 = r14.version     // Catch:{ Throwable -> 0x0494 }
            long r2 = r2.longValue()     // Catch:{ Throwable -> 0x0494 }
            long r5 = r0.getVersion()     // Catch:{ Throwable -> 0x0494 }
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x049a
            java.util.Map r2 = r0.getPropertyItemListMap()     // Catch:{ Throwable -> 0x0494 }
            com.bytedance.im.core.c.p r14 = com.bytedance.p702im.core.internal.utils.C11464c.m23452a(r1, r0, r14, r4)     // Catch:{ Throwable -> 0x0494 }
            com.bytedance.im.core.internal.a.r r0 = com.bytedance.p702im.core.internal.p710a.C11319r.m23086a()     // Catch:{ Throwable -> 0x0494 }
            boolean r0 = r0.mo21021a(r14)     // Catch:{ Throwable -> 0x0494 }
            if (r0 == 0) goto L_0x049a
            com.bytedance.p702im.core.internal.p710a.C11312m.m23038a()     // Catch:{ Throwable -> 0x0494 }
            java.lang.String r0 = r14.getConversationId()     // Catch:{ Throwable -> 0x0494 }
            com.bytedance.im.core.c.b r0 = com.bytedance.p702im.core.internal.p710a.C11312m.m23037a(r0)     // Catch:{ Throwable -> 0x0494 }
            com.bytedance.im.core.c.d r1 = com.bytedance.p702im.core.p706c.C11182d.m22641a()     // Catch:{ Throwable -> 0x0494 }
            r1.mo20681f(r0)     // Catch:{ Throwable -> 0x0494 }
            com.bytedance.im.core.internal.b.a.r r1 = com.bytedance.p702im.core.internal.p718b.p719a.C11409r.m23292a()     // Catch:{ Throwable -> 0x0494 }
            com.bytedance.im.core.internal.b.a.e$9 r3 = new com.bytedance.im.core.internal.b.a.e$9     // Catch:{ Throwable -> 0x0494 }
            r3.<init>(r14, r2, r0)     // Catch:{ Throwable -> 0x0494 }
            r1.mo21062a(r3)     // Catch:{ Throwable -> 0x0494 }
            goto L_0x049a
        L_0x0494:
            r14 = move-exception
            java.lang.String r0 = "handle handleUpdateProperty"
            com.bytedance.p702im.core.internal.utils.C11467e.m23465a(r0, r14)
        L_0x049a:
            return r4
        L_0x049b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p702im.core.internal.p718b.p719a.C11367e.m23218a(com.bytedance.im.core.proto.MessageBody):boolean");
    }

    /* renamed from: a */
    private static void m23217a(final String str, final boolean z) {
        C11319r.m23086a();
        C11319r.m23093c(str);
        C11409r.m23292a().mo21062a((Runnable) new Runnable() {
            public final void run() {
                C11472i a = C11472i.m23483a();
                a.mo21114a(str, (C11496a<C11203l>) new C11496a<C11203l>(z) {

                    /* renamed from: a */
                    final /* synthetic */ boolean f30834a;

                    /* renamed from: a */
                    public final /* bridge */ /* synthetic */ void mo21118a(Object obj) {
                        ((C11203l) obj).mo20727a(this.f30834a);
                    }

                    {
                        this.f30834a = r2;
                    }
                });
            }
        });
    }

    /* renamed from: a */
    private static void m23216a(C11367e eVar, MessageBody messageBody, boolean z) {
        C11312m.m23038a();
        C11180b a = C11312m.m23037a(eVar.f30566c);
        if (a == null) {
            return;
        }
        if ((a.getSettingInfo() != null && a.getSettingInfo().getVersion() < eVar.f30572i) || z) {
            C11324a.m23126a(eVar.f30565b, messageBody);
        }
    }
}
