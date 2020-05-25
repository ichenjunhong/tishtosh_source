package com.p683ss.android.ugc.aweme.tools.live.sticker;

import android.support.p030v4.app.C0654k;
import android.support.p043v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import com.google.p1057b.p1058a.C17432q;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.framework.services.IStickerService.FaceSticker;
import com.p683ss.android.ugc.aweme.sticker.IStickerViewService;
import com.p683ss.android.ugc.aweme.sticker.IStickerViewService.C45803a;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45861d;
import com.p683ss.android.ugc.aweme.sticker.p2284h.C45892a;
import com.p683ss.android.ugc.aweme.sticker.panel.C46254o;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.StickerViewServiceImpl */
public class StickerViewServiceImpl implements IStickerViewService {
    private C47081b liveStickerModule;
    private C17432q<C45892a> processorSupplier;

    public String getFaceTrackPath() {
        return "face_track.model";
    }

    public boolean isShowStickerView() {
        if (this.liveStickerModule == null || !C45861d.m99711c(this.liveStickerModule)) {
            return false;
        }
        return true;
    }

    public void release() {
        if (this.liveStickerModule != null) {
            this.liveStickerModule.mo94372f();
            this.liveStickerModule = null;
        }
    }

    public void hideStickerView() {
        if (this.liveStickerModule != null) {
            C47081b bVar = this.liveStickerModule;
            C52711k.m112240b(bVar, "$this$hideStickerView");
            C46254o c = bVar.mo93006c();
            if (c != null) {
                c.mo92778e();
            }
        }
    }

    public static IStickerViewService createIStickerViewServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IStickerViewService.class);
        if (a != null) {
            return (IStickerViewService) a;
        }
        if (C27991b.f73502bf == null) {
            synchronized (IStickerViewService.class) {
                if (C27991b.f73502bf == null) {
                    C27991b.f73502bf = new StickerViewServiceImpl();
                }
            }
        }
        return (StickerViewServiceImpl) C27991b.f73502bf;
    }

    public String getStickerFilePath(FaceSticker faceSticker) {
        return faceSticker.localPath;
    }

    public void setPixelLoopStickerPresenterSupplier(C17432q<C45892a> qVar) {
        this.processorSupplier = qVar;
        if (this.liveStickerModule != null) {
            this.liveStickerModule.mo94371a(qVar);
        }
    }

    public void showStickerView(AppCompatActivity appCompatActivity, String str, FrameLayout frameLayout, C45803a aVar) {
        showStickerView(appCompatActivity, appCompatActivity.getSupportFragmentManager(), str, frameLayout, aVar);
    }

    public void showStickerView(AppCompatActivity appCompatActivity, C0654k kVar, String str, FrameLayout frameLayout, C45803a aVar) {
        initLiveModuleIfNeeded(appCompatActivity, kVar, str, frameLayout, aVar);
        if (this.liveStickerModule != null) {
            C47081b bVar = this.liveStickerModule;
            C52711k.m112240b(bVar, "$this$showStickerView");
            C46254o c = bVar.mo93006c();
            if (c != null) {
                c.mo92777d();
            }
        }
    }

    private void initLiveModuleIfNeeded(AppCompatActivity appCompatActivity, C0654k kVar, String str, FrameLayout frameLayout, C45803a aVar) {
        if (!(this.liveStickerModule != null && this.liveStickerModule.f118885j == appCompatActivity && this.liveStickerModule.f118887l.equals(str) && this.liveStickerModule.f118888m == kVar && this.liveStickerModule.f118886k == frameLayout)) {
            if (this.liveStickerModule != null) {
                this.liveStickerModule.mo94372f();
            }
            C47081b bVar = new C47081b(appCompatActivity, frameLayout, str, kVar, aVar);
            this.liveStickerModule = bVar;
            if (this.processorSupplier != null) {
                this.liveStickerModule.mo94371a(this.processorSupplier);
            }
        }
        if (aVar != null) {
            this.liveStickerModule.f118889n = aVar;
        }
    }

    public void addStickersWithModel(AppCompatActivity appCompatActivity, FrameLayout frameLayout, List<Effect> list, boolean z, boolean z2, String str) {
        List<Effect> list2;
        List<Effect> list3 = list;
        initLiveModuleIfNeeded(appCompatActivity, appCompatActivity.getSupportFragmentManager(), str, frameLayout, null);
        C47081b bVar = this.liveStickerModule;
        C52711k.m112240b(list, "effects");
        if (!list3.isEmpty()) {
            list2 = list3;
        } else {
            list2 = null;
        }
        if (list2 != null) {
            C45861d.m99709a(bVar, list, z, z2, null, null, 0, 56, null);
        }
    }
}
