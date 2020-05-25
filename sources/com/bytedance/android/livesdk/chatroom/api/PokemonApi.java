package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.model.C5729ar;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5701j;
import com.bytedance.retrofit2.p831b.C12703e;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface PokemonApi {
    @C12706h(mo23876a = "/hotsoon/pokemon/get_anchor_pokemon_info_with_user/")
    C2201v<C4177d<C5701j>> getPokemonInfo(@C12724z(mo23894a = "anchor_id") long j, @C12724z(mo23894a = "user_id") long j2);

    @C12718t(mo23886a = "/hotsoon/pokemon/send_pokemon_to_anchor/")
    @C12705g
    C2201v<C4177d<C5729ar>> sendPokemon(@C12703e(mo23873a = "anchor_id") long j, @C12703e(mo23873a = "gift_id") long j2, @C12703e(mo23873a = "room_id") long j3);

    @C12706h(mo23876a = "/hotsoon/pokemon/try_to_show_pokemon/")
    C2201v<C4177d<Object>> showPokemonTip(@C12724z(mo23894a = "anchor_id") long j);
}
