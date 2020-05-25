package com.p683ss.android.ugc.aweme.sticker.p2281e;

import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.sticker.e.c */
public interface C45872c {

    /* renamed from: com.ss.android.ugc.aweme.sticker.e.c$a */
    public static class C45873a {

        /* renamed from: a */
        public C45874b f115893a;

        /* renamed from: a */
        public final void mo92472a(Effect effect) {
            if (this.f115893a != null) {
                this.f115893a.mo92251a(effect);
            }
        }

        /* renamed from: a */
        public final void mo92473a(Effect effect, int i) {
            if (this.f115893a != null) {
                this.f115893a.mo92252a(effect, i);
            }
        }

        /* renamed from: a */
        public final void mo92474a(Effect effect, C48649d dVar) {
            if (this.f115893a != null) {
                this.f115893a.mo92253a(effect, dVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.e.c$b */
    public interface C45874b {
        /* renamed from: a */
        void mo92251a(Effect effect);

        /* renamed from: a */
        void mo92252a(Effect effect, int i);

        /* renamed from: a */
        void mo92253a(Effect effect, C48649d dVar);

        /* renamed from: b */
        void mo92254b(Effect effect);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.e.c$c */
    public interface C45875c {
        /* renamed from: a */
        void mo92255a();

        /* renamed from: b */
        void mo92256b();
    }

    /* renamed from: a */
    void mo92468a(StickerWrapper stickerWrapper);

    /* renamed from: a */
    void mo92469a(StickerWrapper stickerWrapper, C45874b bVar);

    /* renamed from: a */
    void mo92470a(String str, String str2, C48705j jVar);

    /* renamed from: a */
    void mo92471a(String str, Map<String, String> map, C48705j jVar);
}
