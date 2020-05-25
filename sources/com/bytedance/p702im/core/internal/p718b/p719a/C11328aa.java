package com.bytedance.p702im.core.internal.p718b.p719a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.p702im.core.internal.p710a.C11305f;
import com.bytedance.p702im.core.internal.p710a.C11319r;
import com.bytedance.p702im.core.internal.p710a.C11320s;
import com.bytedance.p702im.core.internal.p710a.p711a.C11266d;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.internal.p722d.C11452a;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.internal.utils.C11472i;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p703a.C11169d.C11171b;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p705b.C11175c;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11205n;
import com.bytedance.p702im.core.p706c.C11238s;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.MessageType;
import com.bytedance.p702im.core.proto.ModifyMessagePropertyResponseBody;
import com.bytedance.p702im.core.proto.ModifyMessagePropertyStatus;
import com.bytedance.p702im.core.proto.ModifyPropertyContent;
import com.bytedance.p702im.core.proto.OPERATION_TYPE;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.b.a.aa */
public final class C11328aa extends C11406q<C11238s> {
    public C11328aa() {
        super(IMCMD.SET_MESSAGE_PROPERTY.getValue());
    }

    /* renamed from: a */
    public static boolean m23146a(ModifyMessagePropertyStatus modifyMessagePropertyStatus) {
        if (modifyMessagePropertyStatus == ModifyMessagePropertyStatus.MODIFY_PROPERTY_SUCCESS || modifyMessagePropertyStatus == ModifyMessagePropertyStatus.MODIFY_PROPERTY_REPEAT_REQUEST) {
            return true;
        }
        return false;
    }

    public C11328aa(C11162b<C11238s> bVar) {
        super(IMCMD.SET_MESSAGE_PROPERTY.getValue(), bVar);
    }

    /* renamed from: a */
    public final void mo21030a(final C11238s sVar) {
        if (sVar == null || sVar.invalid()) {
            mo21029a(-1015, sVar);
            return;
        }
        sVar.setMsgType(MessageType.MESSAGE_TYPE_UPDATE_MESSAGE_PROPERTY.getValue());
        C11457e.m23435a(new C11456d<Boolean>() {
            /* access modifiers changed from: private */
            /* JADX WARNING: Removed duplicated region for block: B:40:0x010c  */
            /* JADX WARNING: Removed duplicated region for block: B:57:0x0012 A[SYNTHETIC] */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Boolean mo20683a() {
                /*
                    r13 = this;
                    com.bytedance.im.core.c.s r0 = r3
                    java.util.List r0 = com.bytedance.p702im.core.internal.p718b.p719a.C11328aa.m23147b(r0)
                    r1 = 0
                    if (r0 != 0) goto L_0x000e
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                    return r0
                L_0x000e:
                    java.util.Iterator r0 = r0.iterator()
                L_0x0012:
                    boolean r2 = r0.hasNext()
                    r3 = 0
                    r4 = 1
                    if (r2 == 0) goto L_0x0113
                    java.lang.Object r2 = r0.next()
                    com.bytedance.im.core.c.n r2 = (com.bytedance.p702im.core.p706c.C11205n) r2
                    com.bytedance.im.core.internal.a.s r5 = com.bytedance.p702im.core.internal.p710a.C11320s.m23105a()
                    r6 = 4
                    if (r2 == 0) goto L_0x0108
                    java.lang.String r7 = r2.msgUuid
                    boolean r7 = android.text.TextUtils.isEmpty(r7)
                    if (r7 == 0) goto L_0x0031
                    goto L_0x0108
                L_0x0031:
                    r2.status = r4
                    java.lang.String r7 = "IMMsgPropertyDao.updatePropertySending"
                    com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22878a()
                    com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22880a(r7)
                    java.lang.String r8 = r2.msgUuid
                    java.lang.String r9 = r2.key
                    java.lang.String r10 = r2.idempotent_id
                    com.bytedance.im.core.c.n r5 = r5.mo21024a(r8, r9, r10)
                    if (r5 != 0) goto L_0x007d
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007b }
                    java.lang.String r5 = "insert or ignore into msg_property_new values("
                    r4.<init>(r5)     // Catch:{ Exception -> 0x007b }
                    java.lang.String r5 = com.bytedance.p702im.core.internal.p710a.C11320s.m23111d()     // Catch:{ Exception -> 0x007b }
                    r4.append(r5)     // Catch:{ Exception -> 0x007b }
                    java.lang.String r5 = ")"
                    r4.append(r5)     // Catch:{ Exception -> 0x007b }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x007b }
                    com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22878a()     // Catch:{ Exception -> 0x007b }
                    com.bytedance.im.core.internal.a.c.f r4 = com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22884d(r4)     // Catch:{ Exception -> 0x007b }
                    com.bytedance.p702im.core.internal.p710a.C11320s.m23106a(r4, r2)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                    r4.mo21012b()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
                    r3 = r4
                    goto L_0x00ea
                L_0x006e:
                    r0 = move-exception
                    r3 = r4
                    goto L_0x0104
                L_0x0072:
                    r3 = move-exception
                    r12 = r4
                    r4 = r3
                    r3 = r12
                    goto L_0x00f2
                L_0x0078:
                    r0 = move-exception
                    goto L_0x0104
                L_0x007b:
                    r4 = move-exception
                    goto L_0x00f2
                L_0x007d:
                    int r8 = r5.status     // Catch:{ Exception -> 0x007b }
                    if (r8 == r4) goto L_0x0085
                    int r5 = r5.status     // Catch:{ Exception -> 0x007b }
                    if (r5 != r6) goto L_0x0087
                L_0x0085:
                    r2.status = r6     // Catch:{ Exception -> 0x007b }
                L_0x0087:
                    android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ Exception -> 0x007b }
                    r5.<init>()     // Catch:{ Exception -> 0x007b }
                    com.bytedance.im.core.internal.a.g r8 = com.bytedance.p702im.core.internal.p710a.C11306g.COLUMN_SENDER     // Catch:{ Exception -> 0x007b }
                    java.lang.String r8 = r8.key     // Catch:{ Exception -> 0x007b }
                    java.lang.Long r9 = r2.uid     // Catch:{ Exception -> 0x007b }
                    r5.put(r8, r9)     // Catch:{ Exception -> 0x007b }
                    com.bytedance.im.core.internal.a.g r8 = com.bytedance.p702im.core.internal.p710a.C11306g.COLUMN_SENDER_SEC     // Catch:{ Exception -> 0x007b }
                    java.lang.String r8 = r8.key     // Catch:{ Exception -> 0x007b }
                    java.lang.String r9 = r2.sec_uid     // Catch:{ Exception -> 0x007b }
                    r5.put(r8, r9)     // Catch:{ Exception -> 0x007b }
                    com.bytedance.im.core.internal.a.g r8 = com.bytedance.p702im.core.internal.p710a.C11306g.COLUMN_VALUE     // Catch:{ Exception -> 0x007b }
                    java.lang.String r8 = r8.key     // Catch:{ Exception -> 0x007b }
                    java.lang.String r9 = r2.value     // Catch:{ Exception -> 0x007b }
                    r5.put(r8, r9)     // Catch:{ Exception -> 0x007b }
                    com.bytedance.im.core.internal.a.g r8 = com.bytedance.p702im.core.internal.p710a.C11306g.COLUMN_DELETED     // Catch:{ Exception -> 0x007b }
                    java.lang.String r8 = r8.key     // Catch:{ Exception -> 0x007b }
                    int r9 = r2.deleted     // Catch:{ Exception -> 0x007b }
                    java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x007b }
                    r5.put(r8, r9)     // Catch:{ Exception -> 0x007b }
                    com.bytedance.im.core.internal.a.g r8 = com.bytedance.p702im.core.internal.p710a.C11306g.COLUMN_VERSION     // Catch:{ Exception -> 0x007b }
                    java.lang.String r8 = r8.key     // Catch:{ Exception -> 0x007b }
                    long r9 = r2.version     // Catch:{ Exception -> 0x007b }
                    java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x007b }
                    r5.put(r8, r9)     // Catch:{ Exception -> 0x007b }
                    com.bytedance.im.core.internal.a.g r8 = com.bytedance.p702im.core.internal.p710a.C11306g.COLUMN_STATUS     // Catch:{ Exception -> 0x007b }
                    java.lang.String r8 = r8.key     // Catch:{ Exception -> 0x007b }
                    int r9 = r2.status     // Catch:{ Exception -> 0x007b }
                    java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x007b }
                    r5.put(r8, r9)     // Catch:{ Exception -> 0x007b }
                    com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22878a()     // Catch:{ Exception -> 0x007b }
                    java.lang.String r8 = "msg_property_new"
                    java.lang.String r9 = com.bytedance.p702im.core.internal.p710a.C11320s.m23110c()     // Catch:{ Exception -> 0x007b }
                    r10 = 3
                    java.lang.String[] r10 = new java.lang.String[r10]     // Catch:{ Exception -> 0x007b }
                    java.lang.String r11 = r2.msgUuid     // Catch:{ Exception -> 0x007b }
                    r10[r1] = r11     // Catch:{ Exception -> 0x007b }
                    java.lang.String r11 = r2.key     // Catch:{ Exception -> 0x007b }
                    r10[r4] = r11     // Catch:{ Exception -> 0x007b }
                    r4 = 2
                    java.lang.String r11 = r2.idempotent_id     // Catch:{ Exception -> 0x007b }
                    r10[r4] = r11     // Catch:{ Exception -> 0x007b }
                    com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22876a(r8, r5, r9, r10)     // Catch:{ Exception -> 0x007b }
                L_0x00ea:
                    com.bytedance.im.core.internal.a.a.d r4 = com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22878a()     // Catch:{ Exception -> 0x007b }
                    r4.mo20960b(r7)     // Catch:{ Exception -> 0x007b }
                    goto L_0x0100
                L_0x00f2:
                    java.lang.String r5 = "IMMsgPropertyDao-updatePropertySending"
                    com.bytedance.p702im.core.internal.utils.C11467e.m23465a(r5, r4)     // Catch:{ all -> 0x0078 }
                    com.bytedance.p702im.core.p705b.C11176d.m22632a(r4)     // Catch:{ all -> 0x0078 }
                    com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22878a()     // Catch:{ all -> 0x0078 }
                    com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22881a(r7, r1)     // Catch:{ all -> 0x0078 }
                L_0x0100:
                    com.bytedance.p702im.core.internal.p710a.C11323v.m23123a(r3)
                    goto L_0x0108
                L_0x0104:
                    com.bytedance.p702im.core.internal.p710a.C11323v.m23123a(r3)
                    throw r0
                L_0x0108:
                    int r3 = r2.status
                    if (r3 != r6) goto L_0x0012
                    com.bytedance.im.core.c.s r3 = r3
                    r3.removePropertyContent(r2)
                    goto L_0x0012
                L_0x0113:
                    com.bytedance.im.core.c.s r0 = r3
                    boolean r0 = r0.getMute()
                    if (r0 != 0) goto L_0x0136
                    com.bytedance.p702im.core.internal.p710a.C11319r.m23086a()
                    com.bytedance.im.core.c.s r0 = r3
                    java.lang.String r0 = r0.getClientMessageId()
                    com.bytedance.im.core.c.p r0 = com.bytedance.p702im.core.internal.p710a.C11319r.m23094d(r0)
                    if (r0 == 0) goto L_0x0136
                    com.bytedance.im.core.internal.b.a.r r2 = com.bytedance.p702im.core.internal.p718b.p719a.C11409r.m23292a()
                    com.bytedance.im.core.internal.b.a.aa$3$1 r5 = new com.bytedance.im.core.internal.b.a.aa$3$1
                    r5.<init>(r0)
                    r2.mo21062a(r5)
                L_0x0136:
                    com.bytedance.im.core.internal.b.a.aa r0 = com.bytedance.p702im.core.internal.p718b.p719a.C11328aa.this
                    com.bytedance.im.core.c.s r2 = r3
                    if (r2 == 0) goto L_0x01bf
                    java.util.List r5 = r2.getPropertyContentList()
                    if (r5 == 0) goto L_0x01bf
                    java.util.List r5 = r2.getPropertyContentList()
                    boolean r5 = r5.isEmpty()
                    if (r5 == 0) goto L_0x014d
                    goto L_0x01bf
                L_0x014d:
                    com.bytedance.im.core.proto.ModifyPropertyBody$Builder r5 = new com.bytedance.im.core.proto.ModifyPropertyBody$Builder
                    r5.<init>()
                    java.lang.String r6 = r2.getConversationId()
                    com.bytedance.im.core.proto.ModifyPropertyBody$Builder r5 = r5.conversation_id(r6)
                    int r6 = r2.getConversationType()
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                    com.bytedance.im.core.proto.ModifyPropertyBody$Builder r5 = r5.conversation_type(r6)
                    long r6 = r2.getConversationShortId()
                    java.lang.Long r6 = java.lang.Long.valueOf(r6)
                    com.bytedance.im.core.proto.ModifyPropertyBody$Builder r5 = r5.conversation_short_id(r6)
                    long r6 = r2.getServerMessageId()
                    java.lang.Long r6 = java.lang.Long.valueOf(r6)
                    com.bytedance.im.core.proto.ModifyPropertyBody$Builder r5 = r5.server_message_id(r6)
                    java.lang.String r6 = r2.getClientMessageId()
                    com.bytedance.im.core.proto.ModifyPropertyBody$Builder r5 = r5.client_message_id(r6)
                    java.util.List r6 = r2.getPropertyContentList()
                    com.bytedance.im.core.proto.ModifyPropertyBody$Builder r5 = r5.modify_property_content(r6)
                    com.bytedance.im.core.proto.ModifyPropertyBody r5 = r5.build()
                    com.bytedance.im.core.proto.ModifyMessagePropertyRequestBody$Builder r6 = new com.bytedance.im.core.proto.ModifyMessagePropertyRequestBody$Builder
                    r6.<init>()
                    com.bytedance.im.core.proto.ModifyMessagePropertyRequestBody$Builder r5 = r6.property_list(r5)
                    java.lang.String r6 = r2.getTicket()
                    com.bytedance.im.core.proto.ModifyMessagePropertyRequestBody$Builder r5 = r5.ticket(r6)
                    com.bytedance.im.core.proto.ModifyMessagePropertyRequestBody r5 = r5.build()
                    com.bytedance.im.core.proto.RequestBody$Builder r6 = new com.bytedance.im.core.proto.RequestBody$Builder
                    r6.<init>()
                    com.bytedance.im.core.proto.RequestBody$Builder r5 = r6.modify_message_property_body(r5)
                    com.bytedance.im.core.proto.RequestBody r5 = r5.build()
                    int r6 = r2.getInboxType()
                    java.lang.Object[] r7 = new java.lang.Object[r4]
                    r7[r1] = r2
                    r0.mo21053a(r6, r5, r3, r7)
                L_0x01bf:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p702im.core.internal.p718b.p719a.C11328aa.C113313.mo20683a():java.lang.Boolean");
            }
        }, null, C11452a.m23428e());
    }

    /* renamed from: b */
    public static List<C11205n> m23147b(C11238s sVar) {
        if (sVar == null) {
            return null;
        }
        List<ModifyPropertyContent> propertyContentList = sVar.getPropertyContentList();
        if (propertyContentList == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ModifyPropertyContent modifyPropertyContent : propertyContentList) {
            if (modifyPropertyContent.operation != null) {
                C11205n nVar = new C11205n();
                nVar.msgUuid = sVar.getClientMessageId();
                nVar.conversationId = sVar.getConversationId();
                nVar.uid = Long.valueOf(C11165c.m22588a().f30108c.mo20490a());
                nVar.sec_uid = C11165c.m22588a().f30108c.mo20505h();
                nVar.idempotent_id = modifyPropertyContent.idempotent_id;
                nVar.key = modifyPropertyContent.key;
                nVar.value = modifyPropertyContent.value;
                nVar.status = 1;
                nVar.create_time = Long.valueOf(System.currentTimeMillis());
                if (modifyPropertyContent.operation.getValue() == OPERATION_TYPE.ADD_PROPERTY_ITEM.getValue()) {
                    nVar.deleted = 0;
                } else if (modifyPropertyContent.operation.getValue() == OPERATION_TYPE.REMOVE_PROPERTY_ITEM.getValue()) {
                    nVar.deleted = 1;
                }
                arrayList.add(nVar);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20947a(C11447f fVar) {
        if (fVar == null || !fVar.mo21093g() || fVar.f30732g == null || fVar.f30732g.body == null || fVar.f30732g.body.modify_message_property_body == null || !m23146a(fVar.f30732g.body.modify_message_property_body.status)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo21029a(int i, C11238s sVar) {
        if (sVar == null || !sVar.getMute()) {
            mo21058b(C11447f.m23381a(i));
            C11472i.m23483a().mo20722a(i, sVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20946a(final C11447f fVar, Runnable runnable) {
        if (fVar != null && fVar.f30730e != null) {
            final C11238s sVar = (C11238s) fVar.f30730e[0];
            if (sVar != null) {
                final boolean a = mo20947a(fVar);
                C11457e.m23435a(new C11456d<C11238s>() {
                    /* renamed from: a */
                    public final /* synthetic */ Object mo20683a() {
                        long j;
                        ModifyMessagePropertyStatus modifyMessagePropertyStatus = ModifyMessagePropertyStatus.MODIFY_PROPERTY_INTERNAL_ERROR;
                        if (fVar.f30732g == null || fVar.f30732g.body == null || fVar.f30732g.body.modify_message_property_body == null) {
                            j = 0;
                        } else {
                            ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody = fVar.f30732g.body.modify_message_property_body;
                            ModifyMessagePropertyStatus modifyMessagePropertyStatus2 = modifyMessagePropertyResponseBody.status;
                            if (modifyMessagePropertyResponseBody.version == null) {
                                j = 0;
                            } else {
                                j = modifyMessagePropertyResponseBody.version.longValue();
                            }
                            modifyMessagePropertyStatus = modifyMessagePropertyStatus2;
                        }
                        sVar.setModifyMsgPropertyStatus(modifyMessagePropertyStatus);
                        C11175c.m22624a().mo20526a("core").mo20528b("message_set_property_insert").mo20527a("duration", Long.valueOf(SystemClock.uptimeMillis() - fVar.f30735j)).mo20527a("conversation_id", sVar.getConversationId()).mo20527a(CustomActionPushReceiver.f104056a, Integer.valueOf(sVar.getMsgType())).mo20527a("message_uuid", sVar.getClientMessageId()).mo20530b();
                        C11238s copy = sVar.copy();
                        copy.setPropertyContentList(null);
                        List<C11205n> b = C11328aa.m23147b(sVar);
                        if (b != null) {
                            for (C11205n a : b) {
                                C11205n a2 = C11320s.m23105a().mo21023a(a, a);
                                if (a2 != null) {
                                    copy.addPropertyContent(a2);
                                }
                            }
                            if (j > 0) {
                                C11319r.m23086a();
                                String clientMessageId = sVar.getClientMessageId();
                                if (!TextUtils.isEmpty(clientMessageId) && j > 0) {
                                    C11266d.m22878a();
                                    StringBuilder sb = new StringBuilder("update msg set ");
                                    sb.append(C11305f.COLUMN_VERSION.key);
                                    sb.append("=");
                                    sb.append(j);
                                    sb.append(" where ");
                                    sb.append(C11305f.COLUMN_MSG_ID.key);
                                    sb.append("='");
                                    sb.append(clientMessageId);
                                    sb.append("'");
                                    C11266d.m22883c(sb.toString());
                                }
                            }
                        }
                        if (copy.getPropertyContentList() != null) {
                            copy.setMute(false);
                            C11328aa.this.mo21030a(copy);
                        }
                        return sVar;
                    }
                }, new C11455c<C11238s>() {
                    /* renamed from: a */
                    public final /* synthetic */ void mo20684a(Object obj) {
                        C11238s sVar = (C11238s) obj;
                        if (C11328aa.m23146a(sVar.getModifyMsgPropertyStatus())) {
                            C11328aa aaVar = C11328aa.this;
                            C11238s sVar2 = sVar;
                            if (sVar2 == null || !sVar2.getMute()) {
                                aaVar.mo21055a(sVar2);
                                C11472i.m23483a().mo20722a(C11171b.f30118a, sVar2);
                            }
                        } else {
                            C11328aa.this.mo21029a(-1010, sVar);
                        }
                        C11176d.m22630a(fVar, a).mo20527a("conversation_id", sVar.getConversationId()).mo20527a(CustomActionPushReceiver.f104056a, Integer.valueOf(sVar.getMsgType())).mo20527a("message_uuid", sVar.getClientMessageId()).mo20530b();
                    }
                }, C11452a.m23424a());
            }
        }
    }
}
