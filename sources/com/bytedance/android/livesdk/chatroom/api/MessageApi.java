package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.p173d.p174a.p175a.C2890d.C2892b;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.p831b.C12704f;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12722x;
import com.bytedance.retrofit2.p831b.C12724z;
import java.util.Map;

public interface MessageApi {
    @C12718t(mo23886a = "/webcast/room/{room_id}/_fetch_message_polling/")
    @C12705g
    C12690b<C2892b> fetchMessagePbByteArraySource(@C12722x(mo23891a = "room_id") long j, @C12704f Map<String, String> map, @C12724z(mo23894a = "keep_method") String str);
}
