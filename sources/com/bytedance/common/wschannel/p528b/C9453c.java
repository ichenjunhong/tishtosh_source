package com.bytedance.common.wschannel.p528b;

import com.bytedance.common.wschannel.model.Frame;
import com.bytedance.common.wschannel.model.Frame.Builder;
import com.bytedance.common.wschannel.model.Frame.ExtendedEntry;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.model.WsChannelMsg.MsgHeader;
import com.squareup.wire.Wire;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okio.ByteString;

/* renamed from: com.bytedance.common.wschannel.b.c */
final class C9453c implements C9451a {
    C9453c() {
    }

    /* renamed from: a */
    public final WsChannelMsg mo17123a(byte[] bArr) throws IOException {
        Frame frame = (Frame) Frame.ADAPTER.decode(bArr);
        long longValue = ((Long) Wire.get(frame.seqid, Frame.DEFAULT_SEQID)).longValue();
        long longValue2 = ((Long) Wire.get(frame.logid, Frame.DEFAULT_LOGID)).longValue();
        int intValue = ((Integer) Wire.get(frame.service, Frame.DEFAULT_SERVICE)).intValue();
        int intValue2 = ((Integer) Wire.get(frame.method, Frame.DEFAULT_METHOD)).intValue();
        List<ExtendedEntry> list = (List) Wire.get(frame.headers, Collections.emptyList());
        String str = (String) Wire.get(frame.payload_encoding, "");
        String str2 = (String) Wire.get(frame.payload_type, "");
        byte[] byteArray = ((ByteString) Wire.get(frame.payload, Frame.DEFAULT_PAYLOAD)).toByteArray();
        WsChannelMsg wsChannelMsg = new WsChannelMsg();
        wsChannelMsg.f25950c = longValue2;
        wsChannelMsg.f25949b = longValue;
        wsChannelMsg.f25951d = intValue;
        wsChannelMsg.f25952e = intValue2;
        if (list != null && list.size() >= 0) {
            ArrayList arrayList = new ArrayList();
            for (ExtendedEntry extendedEntry : list) {
                MsgHeader msgHeader = new MsgHeader();
                msgHeader.f25959a = (String) Wire.get(extendedEntry.key, "");
                msgHeader.f25960b = (String) Wire.get(extendedEntry.value, "");
                arrayList.add(msgHeader);
            }
            wsChannelMsg.f25953f = arrayList;
        }
        wsChannelMsg.f25954g = str;
        wsChannelMsg.f25955h = str2;
        wsChannelMsg.f25956i = byteArray;
        return wsChannelMsg;
    }

    /* renamed from: a */
    public final byte[] mo17124a(WsChannelMsg wsChannelMsg) {
        ByteString byteString;
        if (wsChannelMsg == null) {
            return null;
        }
        if (wsChannelMsg.mo17289a() != null) {
            byteString = ByteString.m114277of(wsChannelMsg.mo17289a());
        } else {
            byteString = ByteString.EMPTY;
        }
        Builder method = new Builder().logid(Long.valueOf(wsChannelMsg.f25950c)).seqid(Long.valueOf(wsChannelMsg.f25949b)).service(Integer.valueOf(wsChannelMsg.f25951d)).payload_encoding(wsChannelMsg.f25954g).payload_type(wsChannelMsg.f25955h).payload(byteString).method(Integer.valueOf(wsChannelMsg.f25952e));
        List<MsgHeader> list = wsChannelMsg.f25953f;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (MsgHeader msgHeader : list) {
                arrayList.add(new ExtendedEntry.Builder().key(msgHeader.f25959a).value(msgHeader.f25960b).build());
            }
        }
        if (!arrayList.isEmpty()) {
            method.headers(arrayList);
        }
        return Frame.ADAPTER.encode(method.build());
    }
}
