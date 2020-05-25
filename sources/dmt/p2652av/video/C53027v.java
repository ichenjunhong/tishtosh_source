package dmt.p2652av.video;

import com.p683ss.android.ugc.aweme.effect.EffectPointModel;
import java.util.List;

/* renamed from: dmt.av.video.v */
public final class C53027v {
    /* renamed from: a */
    public static void m112770a(List<EffectPointModel> list, C52967f<C53026u> fVar) {
        for (int i = 0; i < list.size(); i++) {
            EffectPointModel effectPointModel = (EffectPointModel) list.get(i);
            if (effectPointModel.getType() != 2) {
                C53026u a = C53026u.m112766a(effectPointModel.getResDir(), (long) effectPointModel.getStartPoint());
                a.f131490d = (long) effectPointModel.getUiStartPoint();
                a.f131491e = (long) effectPointModel.getUiEndPoint();
                a.f131494h = effectPointModel.getSelectedColor();
                a.f131496j = effectPointModel.getKey();
                a.f131493g = effectPointModel.isFromEnd();
                a.f131499m = effectPointModel.getCategory();
                a.f131498l = effectPointModel.getDuration();
                a.f131500n = effectPointModel.getExtra();
                fVar.setValue(a);
                C53026u a2 = C53026u.m112765a((long) effectPointModel.getEndPoint());
                a2.f131490d = (long) effectPointModel.getUiStartPoint();
                a2.f131491e = (long) effectPointModel.getUiEndPoint();
                a2.f131493g = effectPointModel.isFromEnd();
                fVar.setValue(a2);
            }
        }
    }
}
