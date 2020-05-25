package com.bytedance.android.livesdk.blockword;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.blockword.p286a.C4670b;
import com.bytedance.android.livesdk.blockword.p286a.C4671c;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface BlockWordApi {
    @C12706h(mo23876a = "/webcast/room/add_sensitive_word/")
    C2201v<C4177d<C4670b>> addBlockWord(@C12724z(mo23894a = "word") String str);

    @C12706h(mo23876a = "/webcast/room/del_sensitive_word/")
    C2201v<C4177d<Object>> deleteBlockWord(@C12724z(mo23894a = "word_id") int i);

    @C12706h(mo23876a = "/webcast/room/get_sensitive_word/")
    C2201v<C4177d<C4671c>> getBlockWord();
}
