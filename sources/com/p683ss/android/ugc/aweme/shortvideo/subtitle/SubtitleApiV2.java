package com.p683ss.android.ugc.aweme.shortvideo.subtitle;

import p001a.C0013i;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleApiV2 */
public interface SubtitleApiV2 {
    @C53075f(mo110603a = "/aweme/v1/videocaption/query/")
    C0013i<C44860d> query(@C53089t(mo110619a = "task_id") String str);

    @C53075f(mo110603a = "/aweme/v1/videocaption/submit/")
    C0013i<C44860d> submit(@C53089t(mo110619a = "tos_key") String str, @C53089t(mo110619a = "max_lines") int i, @C53089t(mo110619a = "words_per_line") int i2);
}
