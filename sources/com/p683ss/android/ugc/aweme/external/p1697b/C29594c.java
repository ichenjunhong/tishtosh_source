package com.p683ss.android.ugc.aweme.external.p1697b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.StickerDownloadConfig;
import com.p683ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.external.b.c */
public final class C29594c extends C29584b {

    /* renamed from: com.ss.android.ugc.aweme.external.b.c$a */
    public static final class C29595a implements C48705j {

        /* renamed from: a */
        final /* synthetic */ C29594c f77442a;

        /* renamed from: b */
        final /* synthetic */ StickerDownloadConfig f77443b;

        /* renamed from: c */
        final /* synthetic */ RecordConfig f77444c;

        /* renamed from: d */
        final /* synthetic */ Context f77445d;

        /* renamed from: a */
        public final void mo8643a(Effect effect) {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            Effect effect = (Effect) obj;
            C52670a onSuccess = this.f77443b.getOnSuccess();
            if (onSuccess != null) {
                onSuccess.invoke();
            }
            Intent a = C29594c.m69666a(this.f77444c);
            if (effect != null) {
                a.putExtra("reuse_mvtheme_enter", true);
                a.putExtra("extra_bind_mv_id", effect.getEffectId());
                String str = "first_sticker";
                if (effect != null) {
                    a.putExtra(str, effect);
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.os.Parcelable");
                }
            }
            C52670a onSuccess2 = this.f77443b.getOnSuccess();
            if (onSuccess2 != null) {
                onSuccess2.invoke();
            }
            this.f77442a.f77415a.mo50200a((C42482c) null);
            this.f77442a.f77415a.mo87857g();
            VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(this.f77445d, a);
        }

        /* renamed from: a */
        public final void mo8644a(Effect effect, C48649d dVar) {
            C52711k.m112240b(dVar, "e");
            C52671b onFail = this.f77443b.getOnFail();
            if (onFail != null) {
                onFail.invoke(Integer.valueOf(dVar.f122279a));
            }
        }

        C29595a(C29594c cVar, StickerDownloadConfig stickerDownloadConfig, RecordConfig recordConfig, Context context) {
            this.f77442a = cVar;
            this.f77443b = stickerDownloadConfig;
            this.f77444c = recordConfig;
            this.f77445d = context;
        }
    }

    public final void recordActivityResult(Activity activity, int i, int i2, Intent intent) {
    }

    public final void startRecordMV(Context context, RecordConfig recordConfig, StickerDownloadConfig stickerDownloadConfig) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(recordConfig, "config");
        C52711k.m112240b(stickerDownloadConfig, "stickerDownloadConfig");
        if (!TextUtils.isEmpty(stickerDownloadConfig.getStickerId())) {
            m69670a(context, stickerDownloadConfig, new C29595a(this, stickerDownloadConfig, recordConfig, context));
        }
    }
}
