package com.p683ss.android.ugc.aweme.tools.music.p2366e;

import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.tools.music.e.d */
public final class C47200d {

    /* renamed from: a */
    public static final C47201a f119157a = new C47201a(null);

    /* renamed from: com.ss.android.ugc.aweme.tools.music.e.d$a */
    public static final class C47201a {
        private C47201a() {
        }

        public /* synthetic */ C47201a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static List<MusicModel> m102459a(List<? extends Music> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Music music : list) {
                if (music != null) {
                    arrayList.add(music.convertToMusicModel());
                }
            }
            return arrayList;
        }
    }
}
