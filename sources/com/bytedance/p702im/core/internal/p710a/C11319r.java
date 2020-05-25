package com.bytedance.p702im.core.internal.p710a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.p702im.core.internal.p710a.p711a.C11266d;
import com.bytedance.p702im.core.internal.p710a.p712b.C11269a;
import com.bytedance.p702im.core.internal.p710a.p712b.C11270b;
import com.bytedance.p702im.core.internal.p710a.p713c.C11287b;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.p706c.C11207p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.a.r */
public class C11319r {

    /* renamed from: a */
    private static C11319r f30468a;

    private C11319r() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0363, code lost:
        if (r4 > 0) goto L_0x0365;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0367 A[SYNTHETIC, Splitter:B:58:0x0367] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo21021a(com.bytedance.p702im.core.p706c.C11207p r17) {
        /*
            r16 = this;
            r1 = r17
            r2 = 0
            if (r1 == 0) goto L_0x03f1
            boolean r3 = r17.invalid()
            if (r3 == 0) goto L_0x000d
            goto L_0x03f1
        L_0x000d:
            java.lang.String r4 = r17.getUuid()     // Catch:{ Exception -> 0x03da, all -> 0x03d5 }
            long r4 = m23100k(r4)     // Catch:{ Exception -> 0x03da, all -> 0x03d5 }
            long r6 = r17.getRowId()     // Catch:{ Exception -> 0x03da, all -> 0x03d5 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x002d
            r1.setRowId(r4)     // Catch:{ Exception -> 0x0028, all -> 0x0023 }
            goto L_0x002d
        L_0x0023:
            r0 = move-exception
            r1 = r0
            r3 = 0
            goto L_0x03ed
        L_0x0028:
            r0 = move-exception
            r1 = r0
            r3 = 0
            goto L_0x03de
        L_0x002d:
            com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22878a()     // Catch:{ Exception -> 0x03da, all -> 0x03d5 }
            java.lang.String r6 = r17.getUuid()     // Catch:{ Exception -> 0x03da, all -> 0x03d5 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03da, all -> 0x03d5 }
            r7.<init>()     // Catch:{ Exception -> 0x03da, all -> 0x03d5 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03da, all -> 0x03d5 }
            r10.<init>()     // Catch:{ Exception -> 0x03da, all -> 0x03d5 }
            r11 = 1
            int r12 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r12 <= 0) goto L_0x0094
            java.lang.String r10 = " update msg set "
            r7.append(r10)     // Catch:{ Exception -> 0x0028, all -> 0x0023 }
            com.bytedance.im.core.internal.a.f[] r10 = com.bytedance.p702im.core.internal.p710a.C11305f.values()     // Catch:{ Exception -> 0x0028, all -> 0x0023 }
            int r12 = r10.length     // Catch:{ Exception -> 0x0028, all -> 0x0023 }
            r13 = 0
        L_0x004e:
            if (r13 >= r12) goto L_0x0069
            r14 = r10[r13]     // Catch:{ Exception -> 0x0028, all -> 0x0023 }
            java.lang.String r15 = "msg_uuid"
            java.lang.String r3 = r14.key     // Catch:{ Exception -> 0x0028, all -> 0x0023 }
            boolean r3 = r15.equals(r3)     // Catch:{ Exception -> 0x0028, all -> 0x0023 }
            if (r3 != 0) goto L_0x0066
            java.lang.String r3 = r14.key     // Catch:{ Exception -> 0x0028, all -> 0x0023 }
            r7.append(r3)     // Catch:{ Exception -> 0x0028, all -> 0x0023 }
            java.lang.String r3 = "=?,"
            r7.append(r3)     // Catch:{ Exception -> 0x0028, all -> 0x0023 }
        L_0x0066:
            int r13 = r13 + 1
            goto L_0x004e
        L_0x0069:
            java.lang.String r3 = r7.toString()     // Catch:{ Exception -> 0x0028, all -> 0x0023 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0028, all -> 0x0023 }
            r7.<init>()     // Catch:{ Exception -> 0x0028, all -> 0x0023 }
            int r10 = r3.length()     // Catch:{ Exception -> 0x0028, all -> 0x0023 }
            int r10 = r10 - r11
            java.lang.String r3 = r3.substring(r2, r10)     // Catch:{ Exception -> 0x0028, all -> 0x0023 }
            r7.append(r3)     // Catch:{ Exception -> 0x0028, all -> 0x0023 }
            java.lang.String r3 = " where msg_uuid='"
            r7.append(r3)     // Catch:{ Exception -> 0x0028, all -> 0x0023 }
            java.lang.String r3 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r6)     // Catch:{ Exception -> 0x0028, all -> 0x0023 }
            r7.append(r3)     // Catch:{ Exception -> 0x0028, all -> 0x0023 }
            java.lang.String r3 = "'"
            r7.append(r3)     // Catch:{ Exception -> 0x0028, all -> 0x0023 }
            java.lang.String r3 = r7.toString()     // Catch:{ Exception -> 0x0028, all -> 0x0023 }
            goto L_0x00e8
        L_0x0094:
            java.lang.String r3 = " insert into msg("
            r7.append(r3)     // Catch:{ Exception -> 0x03da, all -> 0x03d5 }
            com.bytedance.im.core.internal.a.f[] r3 = com.bytedance.p702im.core.internal.p710a.C11305f.values()     // Catch:{ Exception -> 0x03da, all -> 0x03d5 }
            int r6 = r3.length     // Catch:{ Exception -> 0x03da, all -> 0x03d5 }
            r12 = 0
        L_0x009f:
            if (r12 >= r6) goto L_0x00b5
            r13 = r3[r12]     // Catch:{ Exception -> 0x0028, all -> 0x0023 }
            java.lang.String r13 = r13.key     // Catch:{ Exception -> 0x0028, all -> 0x0023 }
            r7.append(r13)     // Catch:{ Exception -> 0x0028, all -> 0x0023 }
            java.lang.String r13 = ","
            r7.append(r13)     // Catch:{ Exception -> 0x0028, all -> 0x0023 }
            java.lang.String r13 = "?,"
            r10.append(r13)     // Catch:{ Exception -> 0x0028, all -> 0x0023 }
            int r12 = r12 + 1
            goto L_0x009f
        L_0x00b5:
            java.lang.String r3 = r7.toString()     // Catch:{ Exception -> 0x03da, all -> 0x03d5 }
            java.lang.String r6 = r10.toString()     // Catch:{ Exception -> 0x03da, all -> 0x03d5 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03da, all -> 0x03d5 }
            r7.<init>()     // Catch:{ Exception -> 0x03da, all -> 0x03d5 }
            int r10 = r3.length()     // Catch:{ Exception -> 0x03da, all -> 0x03d5 }
            int r10 = r10 - r11
            java.lang.String r3 = r3.substring(r2, r10)     // Catch:{ Exception -> 0x03da, all -> 0x03d5 }
            r7.append(r3)     // Catch:{ Exception -> 0x03da, all -> 0x03d5 }
            java.lang.String r3 = ") values ("
            r7.append(r3)     // Catch:{ Exception -> 0x03da, all -> 0x03d5 }
            int r3 = r6.length()     // Catch:{ Exception -> 0x03da, all -> 0x03d5 }
            int r3 = r3 - r11
            java.lang.String r3 = r6.substring(r2, r3)     // Catch:{ Exception -> 0x03da, all -> 0x03d5 }
            r7.append(r3)     // Catch:{ Exception -> 0x03da, all -> 0x03d5 }
            java.lang.String r3 = ");"
            r7.append(r3)     // Catch:{ Exception -> 0x03da, all -> 0x03d5 }
            java.lang.String r3 = r7.toString()     // Catch:{ Exception -> 0x03da, all -> 0x03d5 }
        L_0x00e8:
            com.bytedance.im.core.internal.a.c.f r3 = com.bytedance.p702im.core.internal.p710a.p711a.C11266d.m22884d(r3)     // Catch:{ Exception -> 0x03da, all -> 0x03d5 }
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0224
            if (r3 == 0) goto L_0x0219
            if (r1 != 0) goto L_0x00f6
            goto L_0x0219
        L_0x00f6:
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_SERVER_ID     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r2
            long r5 = r17.getMsgId()     // Catch:{ Exception -> 0x0215 }
            r3.mo21010a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_CONVERSATION_ID     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r2
            java.lang.String r5 = r17.getConversationId()     // Catch:{ Exception -> 0x0215 }
            java.lang.String r5 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r5)     // Catch:{ Exception -> 0x0215 }
            r3.mo21011a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_CONVERSATION_SHORT_ID     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r2
            long r5 = r17.getConversationShortId()     // Catch:{ Exception -> 0x0215 }
            r3.mo21010a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_CONVERSATION_TYPE     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r2
            int r5 = r17.getConversationType()     // Catch:{ Exception -> 0x0215 }
            long r5 = (long) r5     // Catch:{ Exception -> 0x0215 }
            r3.mo21010a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_MSG_TYPE     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r2
            int r5 = r17.getMsgType()     // Catch:{ Exception -> 0x0215 }
            long r5 = (long) r5     // Catch:{ Exception -> 0x0215 }
            r3.mo21010a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_INNER_INDEX     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r2
            long r5 = r17.getIndex()     // Catch:{ Exception -> 0x0215 }
            r3.mo21010a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_ORDER_INDEX     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r2
            long r5 = r17.getOrderIndex()     // Catch:{ Exception -> 0x0215 }
            r3.mo21010a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_STATUS     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r2
            int r5 = r17.getMsgStatus()     // Catch:{ Exception -> 0x0215 }
            long r5 = (long) r5     // Catch:{ Exception -> 0x0215 }
            r3.mo21010a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_NET_STATUS     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r2
            int r5 = r17.getSvrStatus()     // Catch:{ Exception -> 0x0215 }
            long r5 = (long) r5     // Catch:{ Exception -> 0x0215 }
            r3.mo21010a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_VERSION     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r2
            long r5 = r17.getVersion()     // Catch:{ Exception -> 0x0215 }
            r3.mo21010a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_DELETED     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r2
            int r5 = r17.getDeleted()     // Catch:{ Exception -> 0x0215 }
            long r5 = (long) r5     // Catch:{ Exception -> 0x0215 }
            r3.mo21010a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_CREATE_TIME     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r2
            long r5 = r17.getCreatedAt()     // Catch:{ Exception -> 0x0215 }
            r3.mo21010a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_SENDER     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r2
            long r5 = r17.getSender()     // Catch:{ Exception -> 0x0215 }
            r3.mo21010a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_CONTENT     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r2
            java.lang.String r5 = r17.getContent()     // Catch:{ Exception -> 0x0215 }
            java.lang.String r5 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r5)     // Catch:{ Exception -> 0x0215 }
            r3.mo21011a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_EXT     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r2
            java.lang.String r5 = r17.getExtStr()     // Catch:{ Exception -> 0x0215 }
            java.lang.String r5 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r5)     // Catch:{ Exception -> 0x0215 }
            r3.mo21011a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_LOCAL_INFO     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r2
            java.lang.String r5 = r17.getLocalExtStr()     // Catch:{ Exception -> 0x0215 }
            java.lang.String r5 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r5)     // Catch:{ Exception -> 0x0215 }
            r3.mo21011a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_READ_STATUS     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r2
            int r5 = r17.getReadStatus()     // Catch:{ Exception -> 0x0215 }
            long r5 = (long) r5     // Catch:{ Exception -> 0x0215 }
            r3.mo21010a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_SEC_SENDER     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r2
            java.lang.String r5 = r17.getSecSender()     // Catch:{ Exception -> 0x0215 }
            r3.mo21011a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_PROPERTY_LIST     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r2
            java.lang.String r5 = ""
            r3.mo21011a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            goto L_0x0219
        L_0x0215:
            r0 = move-exception
            r1 = r0
            goto L_0x03de
        L_0x0219:
            int r4 = r3.mo21009a()     // Catch:{ Exception -> 0x0215 }
            if (r4 <= 0) goto L_0x0221
            goto L_0x0365
        L_0x0221:
            r11 = 0
            goto L_0x0365
        L_0x0224:
            if (r3 == 0) goto L_0x035a
            if (r1 != 0) goto L_0x022a
            goto L_0x035a
        L_0x022a:
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_MSG_ID     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r11
            java.lang.String r5 = r17.getUuid()     // Catch:{ Exception -> 0x0215 }
            java.lang.String r5 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r5)     // Catch:{ Exception -> 0x0215 }
            r3.mo21011a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_SERVER_ID     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r11
            long r5 = r17.getMsgId()     // Catch:{ Exception -> 0x0215 }
            r3.mo21010a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_CONVERSATION_ID     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r11
            java.lang.String r5 = r17.getConversationId()     // Catch:{ Exception -> 0x0215 }
            java.lang.String r5 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r5)     // Catch:{ Exception -> 0x0215 }
            r3.mo21011a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_CONVERSATION_SHORT_ID     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r11
            long r5 = r17.getConversationShortId()     // Catch:{ Exception -> 0x0215 }
            r3.mo21010a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_CONVERSATION_TYPE     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r11
            int r5 = r17.getConversationType()     // Catch:{ Exception -> 0x0215 }
            long r5 = (long) r5     // Catch:{ Exception -> 0x0215 }
            r3.mo21010a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_MSG_TYPE     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r11
            int r5 = r17.getMsgType()     // Catch:{ Exception -> 0x0215 }
            long r5 = (long) r5     // Catch:{ Exception -> 0x0215 }
            r3.mo21010a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_INNER_INDEX     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r11
            long r5 = r17.getIndex()     // Catch:{ Exception -> 0x0215 }
            r3.mo21010a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_ORDER_INDEX     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r11
            long r5 = r17.getOrderIndex()     // Catch:{ Exception -> 0x0215 }
            r3.mo21010a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_STATUS     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r11
            int r5 = r17.getMsgStatus()     // Catch:{ Exception -> 0x0215 }
            long r5 = (long) r5     // Catch:{ Exception -> 0x0215 }
            r3.mo21010a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_NET_STATUS     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r11
            int r5 = r17.getSvrStatus()     // Catch:{ Exception -> 0x0215 }
            long r5 = (long) r5     // Catch:{ Exception -> 0x0215 }
            r3.mo21010a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_VERSION     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r11
            long r5 = r17.getVersion()     // Catch:{ Exception -> 0x0215 }
            r3.mo21010a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_DELETED     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r11
            int r5 = r17.getDeleted()     // Catch:{ Exception -> 0x0215 }
            long r5 = (long) r5     // Catch:{ Exception -> 0x0215 }
            r3.mo21010a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_CREATE_TIME     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r11
            long r5 = r17.getCreatedAt()     // Catch:{ Exception -> 0x0215 }
            r3.mo21010a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_SENDER     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r11
            long r5 = r17.getSender()     // Catch:{ Exception -> 0x0215 }
            r3.mo21010a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_CONTENT     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r11
            java.lang.String r5 = r17.getContent()     // Catch:{ Exception -> 0x0215 }
            java.lang.String r5 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r5)     // Catch:{ Exception -> 0x0215 }
            r3.mo21011a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_EXT     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r11
            java.lang.String r5 = r17.getExtStr()     // Catch:{ Exception -> 0x0215 }
            java.lang.String r5 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r5)     // Catch:{ Exception -> 0x0215 }
            r3.mo21011a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_LOCAL_INFO     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r11
            java.lang.String r5 = r17.getLocalExtStr()     // Catch:{ Exception -> 0x0215 }
            java.lang.String r5 = com.bytedance.p702im.core.internal.p710a.C11323v.m23121a(r5)     // Catch:{ Exception -> 0x0215 }
            r3.mo21011a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_READ_STATUS     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r11
            int r5 = r17.getReadStatus()     // Catch:{ Exception -> 0x0215 }
            long r5 = (long) r5     // Catch:{ Exception -> 0x0215 }
            r3.mo21010a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_SEC_SENDER     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r11
            java.lang.String r5 = r17.getSecSender()     // Catch:{ Exception -> 0x0215 }
            r3.mo21011a(r4, r5)     // Catch:{ Exception -> 0x0215 }
            com.bytedance.im.core.internal.a.f r4 = com.bytedance.p702im.core.internal.p710a.C11305f.COLUMN_PROPERTY_LIST     // Catch:{ Exception -> 0x0215 }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x0215 }
            int r4 = r4 + r11
            java.lang.String r5 = ""
            r3.mo21011a(r4, r5)     // Catch:{ Exception -> 0x0215 }
        L_0x035a:
            long r4 = r3.mo21012b()     // Catch:{ Exception -> 0x0215 }
            r1.setRowId(r4)     // Catch:{ Exception -> 0x0215 }
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0221
        L_0x0365:
            if (r11 == 0) goto L_0x03bd
            int r4 = r17.getDeleted()     // Catch:{ Exception -> 0x03ba }
            if (r4 != 0) goto L_0x0375
            com.bytedance.im.core.internal.a.b.b r4 = com.bytedance.p702im.core.internal.p710a.p712b.C11270b.m22889a()     // Catch:{ Exception -> 0x03ba }
            r4.mo20965a(r2, r1)     // Catch:{ Exception -> 0x03ba }
            goto L_0x03ab
        L_0x0375:
            com.bytedance.im.core.internal.a.b.b r2 = com.bytedance.p702im.core.internal.p710a.p712b.C11270b.m22889a()     // Catch:{ Exception -> 0x03ba }
            boolean r4 = com.bytedance.p702im.core.internal.p710a.p712b.C11270b.m22893c()     // Catch:{ Exception -> 0x03ba }
            if (r4 == 0) goto L_0x03ab
            if (r1 != 0) goto L_0x0382
            goto L_0x03ab
        L_0x0382:
            com.bytedance.im.core.internal.a.b.b$a r4 = new com.bytedance.im.core.internal.a.b.b$a     // Catch:{ Exception -> 0x03ba }
            r5 = 0
            r4.<init>()     // Catch:{ Exception -> 0x03ba }
            java.util.List r5 = com.bytedance.p702im.core.internal.p710a.p712b.C11270b.m22890a(r17)     // Catch:{ Exception -> 0x03ba }
            r4.f30357a = r5     // Catch:{ Exception -> 0x03ba }
            java.util.List<com.bytedance.im.core.c.a.a> r5 = r4.f30357a     // Catch:{ Exception -> 0x03ba }
            if (r5 == 0) goto L_0x03ab
            java.util.List<com.bytedance.im.core.c.a.a> r5 = r4.f30357a     // Catch:{ Exception -> 0x03ba }
            boolean r5 = r5.isEmpty()     // Catch:{ Exception -> 0x03ba }
            if (r5 == 0) goto L_0x039b
            goto L_0x03ab
        L_0x039b:
            android.os.Message r5 = new android.os.Message     // Catch:{ Exception -> 0x03ba }
            r5.<init>()     // Catch:{ Exception -> 0x03ba }
            r6 = 103(0x67, float:1.44E-43)
            r5.what = r6     // Catch:{ Exception -> 0x03ba }
            r5.obj = r4     // Catch:{ Exception -> 0x03ba }
            com.bytedance.im.core.internal.utils.n r2 = r2.f30356a     // Catch:{ Exception -> 0x03ba }
            r2.sendMessage(r5)     // Catch:{ Exception -> 0x03ba }
        L_0x03ab:
            com.bytedance.im.core.internal.a.q r2 = com.bytedance.p702im.core.internal.p710a.C11318q.m23074a()     // Catch:{ Exception -> 0x03ba }
            r2.mo21020a(r1)     // Catch:{ Exception -> 0x03ba }
            com.bytedance.im.core.internal.a.s r2 = com.bytedance.p702im.core.internal.p710a.C11320s.m23105a()     // Catch:{ Exception -> 0x03ba }
            r2.mo21026b(r1)     // Catch:{ Exception -> 0x03ba }
            goto L_0x03bd
        L_0x03ba:
            r0 = move-exception
            r1 = r0
            goto L_0x03df
        L_0x03bd:
            if (r11 == 0) goto L_0x03e7
            java.util.List r2 = r17.getAttachments()     // Catch:{ Exception -> 0x03ba }
            if (r2 == 0) goto L_0x03e7
            com.bytedance.im.core.internal.a.k r2 = com.bytedance.p702im.core.internal.p710a.C11310k.m23026a()     // Catch:{ Exception -> 0x03ba }
            java.util.List r1 = r17.getAttachments()     // Catch:{ Exception -> 0x03ba }
            boolean r1 = r2.mo21017b(r1)     // Catch:{ Exception -> 0x03ba }
            com.bytedance.p702im.core.internal.p710a.C11323v.m23123a(r3)
            return r1
        L_0x03d5:
            r0 = move-exception
            r5 = 0
            r1 = r0
            r3 = r5
            goto L_0x03ed
        L_0x03da:
            r0 = move-exception
            r5 = 0
            r1 = r0
            r3 = r5
        L_0x03de:
            r11 = 0
        L_0x03df:
            java.lang.String r2 = "updateMessage"
            com.bytedance.p702im.core.internal.utils.C11467e.m23465a(r2, r1)     // Catch:{ all -> 0x03eb }
            com.bytedance.p702im.core.p705b.C11176d.m22632a(r1)     // Catch:{ all -> 0x03eb }
        L_0x03e7:
            com.bytedance.p702im.core.internal.p710a.C11323v.m23123a(r3)
            return r11
        L_0x03eb:
            r0 = move-exception
            r1 = r0
        L_0x03ed:
            com.bytedance.p702im.core.internal.p710a.C11323v.m23123a(r3)
            throw r1
        L_0x03f1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p702im.core.internal.p710a.C11319r.mo21021a(com.bytedance.im.core.c.p):boolean");
    }

    /* renamed from: a */
    public static List<C11207p> m23089a(List<String> list, long j) {
        C11287b bVar = null;
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            StringBuilder sb = new StringBuilder("select rowid,* from msg where ");
            sb.append(C11305f.COLUMN_MSG_ID.key);
            sb.append(" in ('");
            sb.append(C11322u.m23120a(list, "','"));
            sb.append("')  AND ");
            sb.append(C11305f.COLUMN_DELETED.key);
            sb.append("=? AND ");
            sb.append(C11305f.COLUMN_NET_STATUS.key);
            sb.append("=? AND ");
            sb.append(C11305f.COLUMN_INNER_INDEX.key);
            sb.append(">? order by ");
            sb.append(C11305f.COLUMN_ORDER_INDEX.key);
            sb.append(" desc, ");
            sb.append(C11305f.COLUMN_CREATE_TIME.key);
            sb.append(" desc");
            String sb2 = sb.toString();
            C11266d.m22878a();
            C11287b a = C11266d.m22879a(sb2, new String[]{"0", "0", String.valueOf(j)});
            while (a.mo20994d()) {
                try {
                    arrayList.add(m23084a(a));
                } catch (Exception e) {
                    e = e;
                    bVar = a;
                    try {
                        C11467e.m23465a("initMessageList", (Throwable) e);
                        C11176d.m22632a(e);
                        C11323v.m23122a(bVar);
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        C11323v.m23122a(bVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar = a;
                    C11323v.m23122a(bVar);
                    throw th;
                }
            }
            C11323v.m23122a(a);
        } catch (Exception e2) {
            e = e2;
            C11467e.m23465a("initMessageList", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: a */
    public static C11207p m23085a(String str, long j) {
        C11287b bVar;
        C11287b bVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C11266d.m22878a();
            StringBuilder sb = new StringBuilder("select rowid,* from msg where ");
            sb.append(C11305f.COLUMN_CONVERSATION_ID.key);
            sb.append("=? AND ");
            sb.append(C11305f.COLUMN_DELETED.key);
            sb.append("=? AND ");
            sb.append(C11305f.COLUMN_NET_STATUS.key);
            sb.append("=? AND ");
            sb.append(C11305f.COLUMN_INNER_INDEX.key);
            sb.append("=? order by ");
            sb.append(C11305f.COLUMN_ORDER_INDEX.key);
            sb.append(" desc, ");
            sb.append(C11305f.COLUMN_CREATE_TIME.key);
            sb.append(" desc limit 1");
            bVar = C11266d.m22879a(sb.toString(), new String[]{str, "0", "0", String.valueOf(j)});
            try {
                if (bVar.mo20993c()) {
                    C11207p a = m23084a(bVar);
                    C11323v.m23122a(bVar);
                    return a;
                }
            } catch (Exception e) {
                e = e;
                try {
                    C11467e.m23465a("getMsgByMsgIndex", (Throwable) e);
                    C11176d.m22632a(e);
                    C11323v.m23122a(bVar);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    C11323v.m23122a(bVar2);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            bVar = null;
            C11467e.m23465a("getMsgByMsgIndex", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C11323v.m23122a(bVar2);
            throw th;
        }
        C11323v.m23122a(bVar);
        return null;
    }

    /* renamed from: a */
    public static List<C11207p> m23087a(String str, int i, int[] iArr) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        if (i <= 0) {
            i = 20;
        }
        C11287b bVar = null;
        ArrayList arrayList = new ArrayList();
        try {
            StringBuilder sb = new StringBuilder("select rowid,* from msg where ");
            sb.append(C11305f.COLUMN_CONVERSATION_ID.key);
            sb.append("=? AND ");
            sb.append(C11305f.COLUMN_DELETED.key);
            sb.append("=? AND ");
            sb.append(C11305f.COLUMN_NET_STATUS.key);
            sb.append("=?");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(" order by ");
            sb3.append(C11305f.COLUMN_ORDER_INDEX.key);
            sb3.append(" desc, ");
            sb3.append(C11305f.COLUMN_CREATE_TIME.key);
            sb3.append(" desc limit ");
            sb3.append(i);
            String sb4 = sb3.toString();
            C11266d.m22878a();
            C11287b a = C11266d.m22879a(sb4, new String[]{str, "0", "0"});
            while (a.mo20994d()) {
                try {
                    arrayList.add(m23084a(a));
                } catch (Exception e) {
                    e = e;
                    bVar = a;
                    try {
                        C11467e.m23465a("initMessageList", (Throwable) e);
                        C11176d.m22632a(e);
                        C11323v.m23122a(bVar);
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        C11323v.m23122a(bVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar = a;
                    C11323v.m23122a(bVar);
                    throw th;
                }
            }
            C11323v.m23122a(a);
        } catch (Exception e2) {
            e = e2;
            C11467e.m23465a("initMessageList", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<C11207p> m23088a(String str, long j, int i, int[] iArr) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        if (i <= 0) {
            i = 20;
        }
        C11287b bVar = null;
        ArrayList arrayList = new ArrayList();
        try {
            StringBuilder sb = new StringBuilder("select rowid,* from msg where ");
            sb.append(C11305f.COLUMN_CONVERSATION_ID.key);
            sb.append("=? AND ");
            sb.append(C11305f.COLUMN_DELETED.key);
            sb.append("=? AND ");
            sb.append(C11305f.COLUMN_NET_STATUS.key);
            sb.append("=? AND ");
            sb.append(C11305f.COLUMN_INNER_INDEX.key);
            sb.append("<?");
            String sb2 = sb.toString();
            if (iArr != null && iArr.length > 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("(");
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    sb3.append(iArr[i2]);
                    if (i2 < iArr.length - 1) {
                        sb3.append(",");
                    }
                }
                sb3.append(")");
                StringBuilder sb4 = new StringBuilder();
                sb4.append(sb2);
                sb4.append(" AND ");
                sb4.append(C11305f.COLUMN_MSG_TYPE.key);
                sb4.append(" IN ");
                sb4.append(sb3.toString());
                sb2 = sb4.toString();
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb2);
            sb5.append(" order by ");
            sb5.append(C11305f.COLUMN_ORDER_INDEX.key);
            sb5.append(" desc, ");
            sb5.append(C11305f.COLUMN_CREATE_TIME.key);
            sb5.append(" desc limit ");
            sb5.append(i);
            String sb6 = sb5.toString();
            C11266d.m22878a();
            C11287b a = C11266d.m22879a(sb6, new String[]{str, "0", "0", String.valueOf(j)});
            while (a.mo20994d()) {
                try {
                    arrayList.add(m23084a(a));
                } catch (Exception e) {
                    bVar = a;
                    e = e;
                    try {
                        C11467e.m23465a("queryOlderMessageList", (Throwable) e);
                        C11176d.m22632a(e);
                        C11323v.m23122a(bVar);
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        C11323v.m23122a(bVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    bVar = a;
                    th = th2;
                    C11323v.m23122a(bVar);
                    throw th;
                }
            }
            C11323v.m23122a(a);
        } catch (Exception e2) {
            e = e2;
            C11467e.m23465a("queryOlderMessageList", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: a */
    public static C11319r m23086a() {
        if (f30468a == null) {
            synchronized (C11319r.class) {
                if (f30468a == null) {
                    f30468a = new C11319r();
                }
            }
        }
        return f30468a;
    }

    /* renamed from: b */
    public static String m23090b() {
        C11305f[] values;
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS msg(");
        for (C11305f fVar : C11305f.values()) {
            sb.append(fVar.key);
            sb.append(" ");
            sb.append(fVar.type);
            sb.append(",");
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2.substring(0, sb2.length() - 1));
        sb3.append(");");
        return sb3.toString();
    }

    /* renamed from: h */
    public final long mo21022h(String str) {
        C11207p l = m23101l(str);
        if (l != null) {
            return l.getIndex();
        }
        return 0;
    }

    /* renamed from: c */
    public static boolean m23093c(String str) {
        C11266d.m22878a();
        StringBuilder sb = new StringBuilder();
        sb.append(C11305f.COLUMN_CONVERSATION_ID.key);
        sb.append("=?");
        boolean a = C11266d.m22882a("msg", sb.toString(), new String[]{str});
        if (a) {
            C11318q.m23074a();
            C11318q.m23078b(str);
            C11320s.m23105a();
            C11320s.m23107a(str);
            C11270b.m22889a().mo20963a(str, C11269a.COLUMN_CONVERSATION_ID.key, 2);
        }
        return a;
    }

    /* renamed from: d */
    public static C11207p m23094d(String str) {
        C11287b bVar;
        C11287b bVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C11266d.m22878a();
            StringBuilder sb = new StringBuilder("select rowid,* from msg where ");
            sb.append(C11305f.COLUMN_MSG_ID.key);
            sb.append("=?");
            bVar = C11266d.m22879a(sb.toString(), new String[]{str});
            try {
                if (bVar.mo20993c()) {
                    C11207p a = m23084a(bVar);
                    C11323v.m23122a(bVar);
                    return a;
                }
            } catch (Exception e) {
                e = e;
                try {
                    C11467e.m23465a("getMsg", (Throwable) e);
                    C11176d.m22632a(e);
                    C11323v.m23122a(bVar);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    C11323v.m23122a(bVar2);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            bVar = null;
            C11467e.m23465a("getMsg", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C11323v.m23122a(bVar2);
            throw th;
        }
        C11323v.m23122a(bVar);
        return null;
    }

    /* renamed from: e */
    public static boolean m23095e(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C11287b bVar = null;
        try {
            C11266d.m22878a();
            StringBuilder sb = new StringBuilder("select * from msg where ");
            sb.append(C11305f.COLUMN_MSG_ID.key);
            sb.append("=?");
            C11287b a = C11266d.m22879a(sb.toString(), new String[]{str});
            if (a != null) {
                try {
                    if (a.mo20990b() > 0) {
                        z = true;
                    }
                } catch (Exception e) {
                    Exception exc = e;
                    bVar = a;
                    e = exc;
                    try {
                        C11467e.m23465a("getMsg", (Throwable) e);
                        C11176d.m22632a(e);
                        C11323v.m23122a(bVar);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        C11323v.m23122a(bVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    bVar = a;
                    th = th3;
                    C11323v.m23122a(bVar);
                    throw th;
                }
            }
            C11323v.m23122a(a);
            return z;
        } catch (Exception e2) {
            e = e2;
            C11467e.m23465a("getMsg", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return false;
        }
    }

    /* renamed from: f */
    public static C11207p m23096f(String str) {
        C11287b bVar;
        C11287b bVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C11266d.m22878a();
            StringBuilder sb = new StringBuilder("select rowid,* from msg where ");
            sb.append(C11305f.COLUMN_CONVERSATION_ID.key);
            sb.append("=? order by ");
            sb.append(C11305f.COLUMN_INNER_INDEX.key);
            sb.append(" asc, ");
            sb.append(C11305f.COLUMN_CREATE_TIME.key);
            sb.append(" asc limit 1");
            bVar = C11266d.m22879a(sb.toString(), new String[]{str});
            try {
                if (bVar.mo20993c()) {
                    C11207p a = m23084a(bVar);
                    C11323v.m23122a(bVar);
                    return a;
                }
            } catch (Exception e) {
                e = e;
                try {
                    C11467e.m23465a("getOldestMsg", (Throwable) e);
                    C11176d.m22632a(e);
                    C11323v.m23122a(bVar);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    C11323v.m23122a(bVar2);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            bVar = null;
            C11467e.m23465a("getOldestMsg", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C11323v.m23122a(bVar2);
            throw th;
        }
        C11323v.m23122a(bVar);
        return null;
    }

    /* renamed from: j */
    public static boolean m23099j(String str) {
        StringBuilder sb = new StringBuilder("update msg set ");
        sb.append(C11305f.COLUMN_READ_STATUS.key);
        sb.append("=1");
        sb.append(" where ");
        sb.append(C11305f.COLUMN_CONVERSATION_ID.key);
        sb.append("='");
        sb.append(str);
        sb.append("' AND ");
        sb.append(C11305f.COLUMN_INNER_INDEX.key);
        sb.append("='0'");
        String sb2 = sb.toString();
        C11266d.m22878a();
        return C11266d.m22883c(sb2);
    }

    /* renamed from: k */
    private static long m23100k(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        C11287b bVar = null;
        try {
            C11266d.m22878a();
            StringBuilder sb = new StringBuilder("select rowid from msg where ");
            sb.append(C11305f.COLUMN_MSG_ID.key);
            sb.append("=?");
            C11287b a = C11266d.m22879a(sb.toString(), new String[]{str});
            if (a != null) {
                try {
                    if (a.mo20993c()) {
                        long b = a.mo20991b(a.mo20988a("rowid"));
                        C11323v.m23122a(a);
                        return b;
                    }
                } catch (Exception e) {
                    Exception exc = e;
                    bVar = a;
                    e = exc;
                    try {
                        C11467e.m23465a("getRowid", (Throwable) e);
                        C11176d.m22632a(e);
                        C11323v.m23122a(bVar);
                        return -1;
                    } catch (Throwable th) {
                        th = th;
                        C11323v.m23122a(bVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    bVar = a;
                    th = th3;
                    C11323v.m23122a(bVar);
                    throw th;
                }
            }
            C11323v.m23122a(a);
        } catch (Exception e2) {
            e = e2;
            C11467e.m23465a("getRowid", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return -1;
        }
        return -1;
    }

    /* renamed from: l */
    private static C11207p m23101l(String str) {
        C11287b bVar;
        C11287b bVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C11266d.m22878a();
            StringBuilder sb = new StringBuilder("select rowid,* from msg where ");
            sb.append(C11305f.COLUMN_CONVERSATION_ID.key);
            sb.append("=? order by ");
            sb.append(C11305f.COLUMN_ORDER_INDEX.key);
            sb.append(" desc, ");
            sb.append(C11305f.COLUMN_CREATE_TIME.key);
            sb.append(" desc limit 1");
            bVar = C11266d.m22879a(sb.toString(), new String[]{str});
            try {
                if (bVar.mo20993c()) {
                    C11207p a = m23084a(bVar);
                    C11323v.m23122a(bVar);
                    return a;
                }
            } catch (Exception e) {
                e = e;
                try {
                    C11467e.m23465a("getLastMsg", (Throwable) e);
                    C11176d.m22632a(e);
                    C11323v.m23122a(bVar);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    C11323v.m23122a(bVar2);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            bVar = null;
            C11467e.m23465a("getLastMsg", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C11323v.m23122a(bVar2);
            throw th;
        }
        C11323v.m23122a(bVar);
        return null;
    }

    /* renamed from: a */
    public static long m23081a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        C11287b bVar = null;
        try {
            C11266d.m22878a();
            StringBuilder sb = new StringBuilder("select ");
            sb.append(C11305f.COLUMN_SERVER_ID.key);
            sb.append(" from msg");
            sb.append(" where ");
            sb.append(C11305f.COLUMN_MSG_ID.key);
            sb.append("=?");
            C11287b a = C11266d.m22879a(sb.toString(), new String[]{str});
            if (a != null) {
                try {
                    if (a.mo20993c()) {
                        long b = a.mo20991b(a.mo20988a(C11305f.COLUMN_SERVER_ID.key));
                        C11323v.m23122a(a);
                        return b;
                    }
                } catch (Exception e) {
                    Exception exc = e;
                    bVar = a;
                    e = exc;
                    try {
                        C11467e.m23465a("getMsgServerId", (Throwable) e);
                        C11176d.m22632a(e);
                        C11323v.m23122a(bVar);
                        return 0;
                    } catch (Throwable th) {
                        th = th;
                        C11323v.m23122a(bVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    bVar = a;
                    th = th3;
                    C11323v.m23122a(bVar);
                    throw th;
                }
            }
            C11323v.m23122a(a);
        } catch (Exception e2) {
            e = e2;
            C11467e.m23465a("getMsgServerId", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return 0;
        }
        return 0;
    }

    /* renamed from: b */
    public static boolean m23092b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C11266d.m22878a();
        StringBuilder sb = new StringBuilder("update msg set ");
        sb.append(C11305f.COLUMN_DELETED.key);
        sb.append("=1");
        sb.append(" where ");
        sb.append(C11305f.COLUMN_MSG_ID.key);
        sb.append("=\"");
        sb.append(str);
        sb.append("\"");
        boolean c = C11266d.m22883c(sb.toString());
        if (c) {
            C11318q.m23074a();
            C11318q.m23076a(str);
            C11270b.m22889a().mo20962a(str, C11269a.COLUMN_MESSAGE_UUID.key);
        }
        return c;
    }

    /* renamed from: g */
    public static long m23097g(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        C11287b bVar = null;
        try {
            C11266d.m22878a();
            StringBuilder sb = new StringBuilder("select ");
            sb.append(C11305f.COLUMN_INNER_INDEX.key);
            sb.append(" from msg");
            sb.append(" where ");
            sb.append(C11305f.COLUMN_CONVERSATION_ID.key);
            sb.append("=? order by ");
            sb.append(C11305f.COLUMN_INNER_INDEX.key);
            sb.append(" asc, ");
            sb.append(C11305f.COLUMN_CREATE_TIME.key);
            sb.append(" asc limit 1");
            C11287b a = C11266d.m22879a(sb.toString(), new String[]{str});
            try {
                if (a.mo20993c()) {
                    long b = a.mo20991b(a.mo20988a(C11305f.COLUMN_INNER_INDEX.key));
                    C11323v.m23122a(a);
                    return b;
                }
                C11323v.m23122a(a);
                return 0;
            } catch (Exception e) {
                Exception exc = e;
                bVar = a;
                e = exc;
                try {
                    C11467e.m23465a("getOldestIndex", (Throwable) e);
                    C11176d.m22632a(e);
                    C11323v.m23122a(bVar);
                    return 0;
                } catch (Throwable th) {
                    th = th;
                    C11323v.m23122a(bVar);
                    throw th;
                }
            } catch (Throwable th2) {
                Throwable th3 = th2;
                bVar = a;
                th = th3;
                C11323v.m23122a(bVar);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C11467e.m23465a("getOldestIndex", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return 0;
        }
    }

    /* renamed from: i */
    public static C11207p m23098i(String str) {
        C11287b bVar;
        C11287b bVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C11266d.m22878a();
            StringBuilder sb = new StringBuilder("select rowid,* from msg where ");
            sb.append(C11305f.COLUMN_CONVERSATION_ID.key);
            sb.append("=? AND ");
            sb.append(C11305f.COLUMN_DELETED.key);
            sb.append("=? AND ");
            sb.append(C11305f.COLUMN_NET_STATUS.key);
            sb.append("=? order by ");
            sb.append(C11305f.COLUMN_ORDER_INDEX.key);
            sb.append(" desc, ");
            sb.append(C11305f.COLUMN_CREATE_TIME.key);
            sb.append(" desc limit 1");
            bVar = C11266d.m22879a(sb.toString(), new String[]{str, "0", "0"});
            try {
                if (bVar.mo20993c()) {
                    C11207p a = m23084a(bVar);
                    C11323v.m23122a(bVar);
                    return a;
                }
            } catch (Exception e) {
                e = e;
                try {
                    C11467e.m23465a("getLastShowMsg", (Throwable) e);
                    C11176d.m22632a(e);
                    C11323v.m23122a(bVar);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    C11323v.m23122a(bVar2);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            bVar = null;
            C11467e.m23465a("getLastShowMsg", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C11323v.m23122a(bVar2);
            throw th;
        }
        C11323v.m23122a(bVar);
        return null;
    }

    /* renamed from: b */
    public static boolean m23091b(C11207p pVar) {
        boolean z = false;
        if (pVar == null || pVar.invalid()) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(C11305f.COLUMN_MSG_ID.key, pVar.getUuid());
        contentValues.put(C11305f.COLUMN_SERVER_ID.key, Long.valueOf(pVar.getMsgId()));
        contentValues.put(C11305f.COLUMN_CONVERSATION_ID.key, pVar.getConversationId());
        contentValues.put(C11305f.COLUMN_CONVERSATION_SHORT_ID.key, Long.valueOf(pVar.getConversationShortId()));
        contentValues.put(C11305f.COLUMN_CONVERSATION_TYPE.key, Integer.valueOf(pVar.getConversationType()));
        contentValues.put(C11305f.COLUMN_MSG_TYPE.key, Integer.valueOf(pVar.getMsgType()));
        contentValues.put(C11305f.COLUMN_INNER_INDEX.key, Long.valueOf(pVar.getIndex()));
        contentValues.put(C11305f.COLUMN_ORDER_INDEX.key, Long.valueOf(pVar.getOrderIndex()));
        contentValues.put(C11305f.COLUMN_STATUS.key, Integer.valueOf(pVar.getMsgStatus()));
        contentValues.put(C11305f.COLUMN_NET_STATUS.key, Integer.valueOf(pVar.getSvrStatus()));
        contentValues.put(C11305f.COLUMN_VERSION.key, Long.valueOf(pVar.getVersion()));
        contentValues.put(C11305f.COLUMN_DELETED.key, Integer.valueOf(pVar.getDeleted()));
        contentValues.put(C11305f.COLUMN_CREATE_TIME.key, Long.valueOf(pVar.getCreatedAt()));
        contentValues.put(C11305f.COLUMN_SENDER.key, Long.valueOf(pVar.getSender()));
        contentValues.put(C11305f.COLUMN_CONTENT.key, pVar.getContent());
        contentValues.put(C11305f.COLUMN_EXT.key, pVar.getExtStr());
        contentValues.put(C11305f.COLUMN_LOCAL_INFO.key, pVar.getLocalExtStr());
        contentValues.put(C11305f.COLUMN_READ_STATUS.key, Integer.valueOf(pVar.getReadStatus()));
        contentValues.put(C11305f.COLUMN_SEC_SENDER.key, pVar.getSecSender());
        contentValues.put(C11305f.COLUMN_PROPERTY_LIST.key, "");
        C11266d.m22878a();
        long a = C11266d.m22877a("msg", (String) null, contentValues);
        pVar.setRowId(a);
        C11318q.m23074a().mo21020a(pVar);
        if (a >= 0) {
            z = true;
        }
        if (z && pVar.getDeleted() == 0) {
            C11270b.m22889a().mo20965a(true, (Object) pVar);
        }
        C11320s.m23105a().mo21026b(pVar);
        if (!z || pVar.getAttachments() == null) {
            return z;
        }
        C11310k.m23026a();
        return C11310k.m23028a(pVar.getAttachments());
    }

    /* renamed from: a */
    public static C11207p m23083a(long j) {
        C11287b bVar;
        C11287b bVar2 = null;
        try {
            C11266d.m22878a();
            StringBuilder sb = new StringBuilder("select rowid,* from msg where ");
            sb.append(C11305f.COLUMN_SERVER_ID.key);
            sb.append("=?");
            bVar = C11266d.m22879a(sb.toString(), new String[]{String.valueOf(j)});
            try {
                if (bVar.mo20993c()) {
                    C11207p a = m23084a(bVar);
                    C11323v.m23122a(bVar);
                    return a;
                }
            } catch (Exception e) {
                e = e;
                try {
                    C11467e.m23465a("getMsg", (Throwable) e);
                    C11176d.m22632a(e);
                    C11323v.m23122a(bVar);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    C11323v.m23122a(bVar2);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            bVar = null;
            C11467e.m23465a("getMsg", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C11323v.m23122a(bVar2);
            throw th;
        }
        C11323v.m23122a(bVar);
        return null;
    }

    /* renamed from: a */
    private static C11207p m23084a(C11287b bVar) {
        if (bVar == null) {
            return null;
        }
        C11207p pVar = new C11207p();
        pVar.setRowId(bVar.mo20991b(bVar.mo20988a("rowid")));
        pVar.setUuid(bVar.mo20992c(bVar.mo20988a(C11305f.COLUMN_MSG_ID.key)));
        pVar.setMsgId(bVar.mo20991b(bVar.mo20988a(C11305f.COLUMN_SERVER_ID.key)));
        pVar.setConversationId(bVar.mo20992c(bVar.mo20988a(C11305f.COLUMN_CONVERSATION_ID.key)));
        pVar.setConversationShortId(bVar.mo20991b(bVar.mo20988a(C11305f.COLUMN_CONVERSATION_SHORT_ID.key)));
        pVar.setConversationType(bVar.mo20987a(bVar.mo20988a(C11305f.COLUMN_CONVERSATION_TYPE.key)));
        pVar.setMsgType(bVar.mo20987a(bVar.mo20988a(C11305f.COLUMN_MSG_TYPE.key)));
        pVar.setIndex(bVar.mo20991b(bVar.mo20988a(C11305f.COLUMN_INNER_INDEX.key)));
        pVar.setOrderIndex(bVar.mo20991b(bVar.mo20988a(C11305f.COLUMN_ORDER_INDEX.key)));
        pVar.setMsgStatus(bVar.mo20987a(bVar.mo20988a(C11305f.COLUMN_STATUS.key)));
        pVar.setSvrStatus(bVar.mo20987a(bVar.mo20988a(C11305f.COLUMN_NET_STATUS.key)));
        pVar.setVersion(bVar.mo20991b(bVar.mo20988a(C11305f.COLUMN_VERSION.key)));
        pVar.setDeleted(bVar.mo20987a(bVar.mo20988a(C11305f.COLUMN_DELETED.key)));
        pVar.setCreatedAt(bVar.mo20991b(bVar.mo20988a(C11305f.COLUMN_CREATE_TIME.key)));
        pVar.setSender(bVar.mo20991b(bVar.mo20988a(C11305f.COLUMN_SENDER.key)));
        pVar.setContent(bVar.mo20992c(bVar.mo20988a(C11305f.COLUMN_CONTENT.key)));
        pVar.setExtStr(bVar.mo20992c(bVar.mo20988a(C11305f.COLUMN_EXT.key)));
        pVar.setLocalExtStr(bVar.mo20992c(bVar.mo20988a(C11305f.COLUMN_LOCAL_INFO.key)));
        pVar.setReadStatus(bVar.mo20987a(bVar.mo20988a(C11305f.COLUMN_READ_STATUS.key)));
        C11310k.m23026a();
        pVar.setAttachments(C11310k.m23027a(pVar.getUuid()));
        pVar.setSecSender(bVar.mo20992c(bVar.mo20988a(C11305f.COLUMN_SEC_SENDER.key)));
        C11320s.m23105a().mo21025a(pVar);
        return pVar;
    }

    /* renamed from: a */
    public static int m23080a(String str, long j, long j2) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        C11287b bVar = null;
        try {
            StringBuilder sb = new StringBuilder("select * from msg where ");
            sb.append(C11305f.COLUMN_CONVERSATION_ID.key);
            sb.append("=? AND ");
            sb.append(C11305f.COLUMN_INNER_INDEX.key);
            sb.append("<=? AND ");
            sb.append(C11305f.COLUMN_INNER_INDEX.key);
            sb.append(">=?");
            String sb2 = sb.toString();
            C11266d.m22878a();
            C11287b a = C11266d.m22879a(sb2, new String[]{str, String.valueOf(j2), String.valueOf(j)});
            try {
                int b = a.mo20990b();
                C11323v.m23122a(a);
                return b;
            } catch (Exception e) {
                e = e;
                bVar = a;
                try {
                    C11467e.m23465a("computeMsgCount", (Throwable) e);
                    C11176d.m22632a(e);
                    C11323v.m23122a(bVar);
                    return -1;
                } catch (Throwable th) {
                    th = th;
                    C11323v.m23122a(bVar);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bVar = a;
                C11323v.m23122a(bVar);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C11467e.m23465a("computeMsgCount", (Throwable) e);
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return -1;
        }
    }

    /* renamed from: a */
    public static long m23082a(String str, long j, long j2, long j3) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        C11287b bVar = null;
        try {
            StringBuilder sb = new StringBuilder("select * from msg where ");
            sb.append(C11305f.COLUMN_CONVERSATION_ID.key);
            sb.append("=? AND ");
            sb.append(C11305f.COLUMN_DELETED.key);
            sb.append("=? AND (");
            sb.append(C11305f.COLUMN_INNER_INDEX.key);
            sb.append("<=? AND ");
            sb.append(C11305f.COLUMN_INNER_INDEX.key);
            sb.append(">? OR ");
            sb.append(C11305f.COLUMN_INNER_INDEX.key);
            sb.append("='0') AND ");
            sb.append(C11305f.COLUMN_SENDER.key);
            sb.append("!=? AND ");
            sb.append(C11305f.COLUMN_NET_STATUS.key);
            sb.append("=? AND ");
            sb.append(C11305f.COLUMN_READ_STATUS.key);
            sb.append("=?");
            String sb2 = sb.toString();
            C11266d.m22878a();
            C11287b a = C11266d.m22879a(sb2, new String[]{str, "0", String.valueOf(j2), String.valueOf(j), String.valueOf(j3), "0", "0"});
            try {
                long b = (long) a.mo20990b();
                C11323v.m23122a(a);
                return b;
            } catch (Exception e) {
                e = e;
                bVar = a;
                try {
                    C11467e.m23472d("computeUnreadMsgCount");
                    C11176d.m22632a(e);
                    C11323v.m23122a(bVar);
                    return 0;
                } catch (Throwable th) {
                    th = th;
                    C11323v.m23122a(bVar);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bVar = a;
                C11323v.m23122a(bVar);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C11467e.m23472d("computeUnreadMsgCount");
            C11176d.m22632a(e);
            C11323v.m23122a(bVar);
            return 0;
        }
    }
}
