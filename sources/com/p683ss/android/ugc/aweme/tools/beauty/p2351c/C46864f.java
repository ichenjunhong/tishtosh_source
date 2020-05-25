package com.p683ss.android.ugc.aweme.tools.beauty.p2351c;

import com.bytedance.keva.Keva;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.p683ss.android.ugc.aweme.tools.beauty.C46814a;
import com.p683ss.android.ugc.aweme.tools.beauty.service.C46897e;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.c.f */
public final class C46864f implements C46897e {

    /* renamed from: b */
    public static final Keva f118403b;

    /* renamed from: c */
    public static final C46865a f118404c = new C46865a(null);

    /* renamed from: a */
    public final String f118405a;

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.c.f$a */
    public static final class C46865a {
        private C46865a() {
        }

        public /* synthetic */ C46865a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.c.f$b */
    public static final class C46866b extends C17956a<List<BeautyCategory>> {
        C46866b() {
        }
    }

    /* renamed from: a */
    public final void mo94126a(boolean z) {
        if (z) {
            Keva keva = f118403b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f118405a);
            sb.append("key_need_face_detect");
            if (!keva.getBoolean(sb.toString(), false)) {
                Keva keva2 = f118403b;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f118405a);
                sb2.append("key_need_face_detect");
                keva2.storeBoolean(sb2.toString(), true);
            }
        }
    }

    static {
        Keva repo = Keva.getRepo("ulike_repo");
        C52711k.m112236a((Object) repo, "Keva.getRepo(KEVA_ULIKE_REPO)");
        f118403b = repo;
    }

    /* renamed from: b */
    public final int mo94127b() {
        Keva keva = f118403b;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f118405a);
        sb.append("key_detect_female_count");
        return keva.getInt(sb.toString(), 0);
    }

    /* renamed from: a */
    public final List<BeautyCategory> mo94120a() {
        Keva keva = f118403b;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f118405a);
        sb.append("key_beauty_panel_data");
        try {
            return (List) C39629l.m88232a().mo58566D().mo34885a(keva.getString(sb.toString(), null), new C46866b().f49843c);
        } catch (Exception unused) {
            return null;
        }
    }

    public C46864f(String str) {
        C52711k.m112240b(str, "key");
        this.f118405a = str;
    }

    /* renamed from: a */
    public final void mo94121a(int i) {
        Keva keva = f118403b;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f118405a);
        sb.append("key_detect_female_count");
        keva.storeInt(sb.toString(), i);
    }

    /* renamed from: a */
    public final String mo94118a(C46814a aVar) {
        C52711k.m112240b(aVar, "gender");
        Keva keva = f118403b;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f118405a);
        sb.append(aVar.getFlag());
        sb.append("_key_selected_category");
        return keva.getString(sb.toString(), null);
    }

    /* renamed from: a */
    public final void mo94125a(List<BeautyCategory> list) {
        C52711k.m112240b(list, "response");
        Keva keva = f118403b;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f118405a);
        sb.append("key_beauty_panel_data");
        keva.storeString(sb.toString(), C39629l.m88232a().mo58566D().mo34889b(list));
    }

    /* renamed from: b */
    public final String mo94129b(C46814a aVar, String str) {
        C52711k.m112240b(aVar, "gender");
        Keva keva = f118403b;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f118405a);
        sb.append(aVar.getFlag());
        sb.append("_key_selected_beauty_");
        sb.append(str);
        return keva.getString(sb.toString(), null);
    }

    /* renamed from: b */
    public final void mo94130b(ComposerBeauty composerBeauty, C46814a aVar) {
        C52711k.m112240b(composerBeauty, "composerBeauty");
        C52711k.m112240b(aVar, "gender");
        if (composerBeauty.getExtra().getDisableCache()) {
            Keva keva = f118403b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f118405a);
            sb.append(aVar.getFlag());
            sb.append("_key_selected_album_");
            sb.append(composerBeauty.getCategoryId());
            sb.append('_');
            sb.append(composerBeauty.getParentId());
            keva.storeString(sb.toString(), "-1");
            return;
        }
        Keva keva2 = f118403b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f118405a);
        sb2.append(aVar.getFlag());
        sb2.append("_key_selected_album_");
        sb2.append(composerBeauty.getCategoryId());
        sb2.append('_');
        sb2.append(composerBeauty.getParentId());
        keva2.storeString(sb2.toString(), composerBeauty.getEffect().getEffectId());
    }

    /* renamed from: a */
    public final void mo94122a(ComposerBeauty composerBeauty, C46814a aVar) {
        C52711k.m112240b(composerBeauty, "composerBeauty");
        C52711k.m112240b(aVar, "gender");
        if (composerBeauty.getExtra().getDisableCache()) {
            Keva keva = f118403b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f118405a);
            sb.append(aVar.getFlag());
            sb.append("_key_selected_beauty_");
            sb.append(composerBeauty.getCategoryId());
            keva.storeString(sb.toString(), "-1");
            return;
        }
        Keva keva2 = f118403b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f118405a);
        sb2.append(aVar.getFlag());
        sb2.append("_key_selected_beauty_");
        sb2.append(composerBeauty.getCategoryId());
        keva2.storeString(sb2.toString(), composerBeauty.getEffect().getEffectId());
    }

    /* renamed from: a */
    public final void mo94124a(C46814a aVar, String str) {
        C52711k.m112240b(aVar, "gender");
        Keva keva = f118403b;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f118405a);
        sb.append(aVar.getFlag());
        sb.append("_key_selected_category");
        keva.storeString(sb.toString(), str);
    }

    /* renamed from: a */
    public final String mo94119a(C46814a aVar, String str, String str2) {
        C52711k.m112240b(aVar, "gender");
        Keva keva = f118403b;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f118405a);
        sb.append(aVar.getFlag());
        sb.append("_key_selected_album_");
        sb.append(str);
        sb.append('_');
        sb.append(str2);
        return keva.getString(sb.toString(), null);
    }

    /* renamed from: b */
    public final int mo94128b(ComposerBeauty composerBeauty, C46814a aVar, String str, int i) {
        C52711k.m112240b(composerBeauty, "composerBeauty");
        C52711k.m112240b(aVar, "gender");
        Keva keva = f118403b;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f118405a);
        sb.append(aVar.getFlag());
        sb.append("_composer_beauty_manual_");
        sb.append(composerBeauty.getCategoryId());
        sb.append('_');
        sb.append(composerBeauty.getParentId());
        sb.append('_');
        sb.append(composerBeauty.getEffect().getEffectId());
        sb.append('_');
        sb.append(str);
        return keva.getInt(sb.toString(), i);
    }

    /* renamed from: a */
    public final void mo94123a(ComposerBeauty composerBeauty, C46814a aVar, String str, int i) {
        C52711k.m112240b(composerBeauty, "composerBeauty");
        C52711k.m112240b(aVar, "gender");
        Keva keva = f118403b;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f118405a);
        sb.append(aVar.getFlag());
        sb.append("_composer_beauty_manual_");
        sb.append(composerBeauty.getCategoryId());
        sb.append('_');
        sb.append(composerBeauty.getParentId());
        sb.append('_');
        sb.append(composerBeauty.getEffect().getEffectId());
        sb.append('_');
        sb.append(str);
        keva.storeInt(sb.toString(), i);
    }
}
