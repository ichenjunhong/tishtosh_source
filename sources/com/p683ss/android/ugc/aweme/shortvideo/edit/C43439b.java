package com.p683ss.android.ugc.aweme.shortvideo.edit;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24432c.C24433a;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24434d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.C52907ac;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.b */
public final class C43439b implements C52907ac {
    /* renamed from: a */
    public static void m95211a(Activity activity, int i, C52671b<? super C24434d, C52860x> bVar, C52670a<C52860x> aVar) {
        C39630m.m88234a().mo58604b().mo80572a(activity, OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, C24433a.m59808a(activity.getString(R.string.zr), 0, false, null, "", ""), bVar, aVar);
    }

    /* renamed from: a */
    public final void mo88373a(Activity activity, int i, String str, String str2, String str3, boolean z, String str4, String str5, C52671b<? super C24434d, C52860x> bVar, C52670a<C52860x> aVar) {
        mo88374a(activity, OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, str, str2, str3, z, str4, str5, false, false, bVar, aVar);
    }

    /* renamed from: a */
    public final void mo88374a(Activity activity, int i, String str, String str2, String str3, boolean z, String str4, String str5, boolean z2, boolean z3, C52671b<? super C24434d, C52860x> bVar, C52670a<C52860x> aVar) {
        String str6 = str3;
        Bundle bundle = new Bundle();
        if (C43214dh.m94817a().f109287b.size() > 0) {
            bundle.putString("challenge", ((AVChallenge) C43214dh.m94817a().f109287b.get(0)).cid);
        } else if (str6 != null) {
            bundle.putString("challenge", str3);
        }
        if (!TextUtils.isEmpty(str)) {
            String str7 = str;
            bundle.putString("first_sticker_music_ids", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            String str8 = str2;
            bundle.putString("first_sticker_id", str2);
        }
        bundle.putBoolean("has_lyric", z2);
        bundle.putBoolean("show_lyric_tip", z3);
        Activity activity2 = activity;
        C39630m.m88234a().mo58604b().mo80572a(activity, i, C24433a.m59808a(activity.getString(R.string.zr), 0, z, bundle, str4, str5), bVar, aVar);
    }
}
