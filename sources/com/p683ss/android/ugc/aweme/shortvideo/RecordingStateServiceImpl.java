package com.p683ss.android.ugc.aweme.shortvideo;

import com.google.p1057b.p1058a.C17418j;
import com.google.p1057b.p1058a.C17432q;
import com.google.p1057b.p1058a.C17433r;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.port.p2082in.IRecordingStateService;
import com.p683ss.android.ugc.aweme.story.api.IAVStoryService;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.RecordingStateServiceImpl */
public class RecordingStateServiceImpl implements IRecordingStateService {
    private final C17432q<C17418j<IAVStoryService>> mIAVStoryServiceSupplier = C17433r.m42683a(C43228dt.f109323a);

    public boolean isRecording() {
        C17418j jVar = (C17418j) this.mIAVStoryServiceSupplier.get();
        if (jVar.isPresent()) {
            return ((IAVStoryService) jVar.get()).isStoryRecording();
        }
        return false;
    }

    public static IAVStoryService createIAVStoryServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IAVStoryService.class);
        if (a != null) {
            return (IAVStoryService) a;
        }
        return (IAVStoryService) C20302a.m50070a(IAVStoryService.class).mo42947a(new C20310d()).mo42946a().mo42948b();
    }

    public static IRecordingStateService createIRecordingStateServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IRecordingStateService.class);
        if (a != null) {
            return (IRecordingStateService) a;
        }
        if (C27991b.f73490au == null) {
            synchronized (IRecordingStateService.class) {
                if (C27991b.f73490au == null) {
                    C27991b.f73490au = new RecordingStateServiceImpl();
                }
            }
        }
        return (RecordingStateServiceImpl) C27991b.f73490au;
    }
}
