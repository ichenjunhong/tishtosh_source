package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C4176c;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.message.model.C7856by;
import com.bytedance.retrofit2.p831b.C12703e;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12722x;
import p064c.p065a.C2201v;

public interface I18nLuckyBoxApi {
    @C12706h(mo23876a = "/hotsoon/luckymoney/{room_id}/_list/")
    C2201v<C4176c<C7856by>> fetchRedEnvelopeList(@C12722x(mo23891a = "room_id") long j);

    @C12706h(mo23876a = "/hotsoon/luckymoney/{red_packet_id}/_rushed_list/")
    C2201v<C4177d<Object>> fetchRedEnvelopeRushedList(@C12722x(mo23891a = "red_packet_id") long j);

    @C12718t(mo23886a = "/hotsoon/luckymoney/{red_packet_id}/_rush/")
    @C12705g
    C2201v<C4177d<Object>> rush(@C12722x(mo23891a = "red_packet_id") long j, @C12703e(mo23873a = "room_id") long j2, @C12703e(mo23873a = "send_time") int i, @C12703e(mo23873a = "delay_time") int i2, @C12703e(mo23873a = "common_label_list") String str);

    @C12718t(mo23886a = "/hotsoon/luckymoney/{red_packet_id}/_send/")
    @C12705g
    C2201v<C4177d<Object>> send(@C12722x(mo23891a = "red_packet_id") long j, @C12703e(mo23873a = "request_id") String str, @C12703e(mo23873a = "enter_source") String str2, @C12703e(mo23873a = "room_id") long j2, @C12703e(mo23873a = "delay_time") int i, @C12703e(mo23873a = "common_label_list") String str3);
}
