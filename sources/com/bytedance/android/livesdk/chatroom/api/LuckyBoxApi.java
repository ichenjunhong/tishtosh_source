package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C4172a;
import com.bytedance.android.live.network.response.C4176c;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.model.C5707aa;
import com.bytedance.android.livesdk.chatroom.model.C5770y;
import com.bytedance.android.livesdk.chatroom.model.C5772z;
import com.bytedance.android.livesdk.message.model.C7833bh;
import com.bytedance.android.livesdk.message.model.C7860ca;
import com.bytedance.retrofit2.p831b.C12703e;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface LuckyBoxApi {
    @C12706h(mo23876a = "/webcast/luckybox/box/list/")
    C2201v<C4176c<C7833bh>> fetchCurrentList(@C12724z(mo23894a = "room_id") long j);

    @C12706h(mo23876a = "/webcast/luckybox_new/box/list/")
    C2201v<C4172a<C7833bh, C7860ca>> fetchCurrentListV2(@C12724z(mo23894a = "room_id") long j);

    @C12706h(mo23876a = "/webcast/luckybox/rushed/list/")
    C2201v<C4177d<C5770y>> fetchRushedList(@C12724z(mo23894a = "box_id") long j, @C12724z(mo23894a = "room_id") long j2, @C12724z(mo23894a = "box_type") int i);

    @C12706h(mo23876a = "/webcast/luckybox/box/meta/")
    C2201v<C4176c<C5707aa>> fetchTypeList(@C12724z(mo23894a = "room_id") long j);

    @C12718t(mo23886a = "/webcast/luckybox/rush/")
    @C12705g
    C2201v<C4177d<C5772z>> rush(@C12703e(mo23873a = "box_id") long j, @C12703e(mo23873a = "room_id") long j2, @C12703e(mo23873a = "box_type") int i, @C12703e(mo23873a = "send_time") long j3, @C12703e(mo23873a = "delay_time") int i2, @C12703e(mo23873a = "common_label_list") String str);

    @C12718t(mo23886a = "/webcast/luckybox/send/")
    @C12705g
    C2201v<C4177d<Object>> send(@C12703e(mo23873a = "box_meta_id") long j, @C12703e(mo23873a = "room_id") long j2, @C12703e(mo23873a = "box_type") int i, @C12703e(mo23873a = "delay_time") int i2, @C12703e(mo23873a = "enter_source") String str, @C12703e(mo23873a = "request_id") String str2, @C12703e(mo23873a = "common_label_list") String str3);
}
