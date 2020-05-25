package com.p683ss.android.ugc.aweme.share;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback;
import com.p683ss.android.ugc.aweme.share.p2159h.C42037c;
import java.util.List;
import p001a.C0013i;
import p001a.C0027j;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.s */
public final class C42231s {

    /* renamed from: a */
    public static List<String> f106765a;

    /* renamed from: b */
    public static final C42231s f106766b = new C42231s();

    /* renamed from: com.ss.android.ugc.aweme.share.s$a */
    public static final class C42232a implements IProcessCallback<Integer> {

        /* renamed from: a */
        final /* synthetic */ C0027j f106767a;

        C42232a(C0027j jVar) {
            this.f106767a = jVar;
        }

        public final /* synthetic */ void finish(Object obj) {
            this.f106767a.mo47b(Integer.valueOf(((Number) obj).intValue()));
        }
    }

    private C42231s() {
    }

    /* renamed from: a */
    public static final C0013i<Integer> m92665a(String str, String str2) {
        C52711k.m112240b(str, "inFilePath");
        C52711k.m112240b(str2, "outFilePath");
        C0027j jVar = new C0027j();
        AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().processService().muteVideo(str, str2, new C42232a(jVar));
        C0013i<TResult> iVar = jVar.f77a;
        C52711k.m112236a((Object) iVar, "taskCompletionSource.task");
        return iVar;
    }

    /* renamed from: a */
    public static final boolean m92666a(Aweme aweme, String str) {
        boolean z = false;
        if (!(aweme == null || str == null || f106765a == null || aweme.getMusic() == null)) {
            Music music = aweme.getMusic();
            C52711k.m112236a((Object) music, "aweme.music");
            if (music.isMuteShare()) {
                List<String> list = f106765a;
                if (list == null) {
                    C52711k.m112234a();
                }
                String lowerCase = str.toLowerCase();
                C52711k.m112236a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                if (list.contains(lowerCase)) {
                    z = true;
                }
            }
        }
        if (C42037c.m92002a(aweme)) {
            return true;
        }
        return z;
    }
}
