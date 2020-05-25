package com.bytedance.android.livesdk.chatroom.interact.p317f;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.p310f.C5217f;
import com.bytedance.android.livesdk.p279af.C4568ah;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.video.rtc.interact.model.CommonType.VideoQuality;
import com.p683ss.video.rtc.interact.model.MixStreamInfo;
import com.p683ss.video.rtc.interact.model.Region;
import com.p683ss.video.rtc.interact.model.TalkingState;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.f.c */
public final class C5375c extends C5372a {

    /* renamed from: b */
    public boolean f14319b = true;

    /* renamed from: c */
    public boolean f14320c = true;

    /* renamed from: d */
    private double f14321d;

    /* renamed from: e */
    private double f14322e;

    public C5375c(VideoQuality videoQuality) {
        int width = videoQuality.getWidth();
        int height = videoQuality.getHeight();
        double d = (double) ((((float) width) * 1.0f) / 360.0f);
        Double.isNaN(d);
        double d2 = 108.0d * d;
        double d3 = (double) height;
        Double.isNaN(d3);
        this.f14321d = d2 / d3;
        Double.isNaN(d);
        double d4 = d * 260.0d;
        Double.isNaN(d3);
        this.f14322e = d4 / d3;
    }

    public final MixStreamInfo mixStream(int i, int i2, String str, List<String> list, List<TalkingState> list2) {
        boolean z;
        int i3 = LinkCrossRoomDataHolder.m11103a().f12624o;
        long b = TTLiveSDKContext.getHostService().mo10315h().mo14529b();
        if (list.size() <= 0 || LinkCrossRoomDataHolder.m11103a().f12617h > 0) {
            List<String> list3 = list;
        } else {
            LinkCrossRoomDataHolder.m11103a().f12617h = C4568ah.m10970b((String) list.get(0));
        }
        int i4 = LinkCrossRoomDataHolder.m11103a().f12617h;
        long j = LinkCrossRoomDataHolder.m11103a().f12614e;
        ArrayList arrayList = new ArrayList();
        if (list.size() <= 0 || i4 <= 0 || i4 == C4568ah.m10970b(str)) {
            z = true;
        } else {
            Region region = new Region();
            z = true;
            region.mediaType(1).size(0.5d, this.f14322e).position(0.5d, this.f14321d).interactId(String.valueOf(i4)).userId(j).status(this.f14320c ^ true ? 1 : 0);
            arrayList.add(region);
        }
        Region region2 = new Region();
        region2.mediaType(z ? 1 : 0).interactId(String.valueOf(i3)).userId(b).status(this.f14319b ^ z ? 1 : 0).writeToSei(false);
        if (list.size() <= 0) {
            region2.size(1.0d, 1.0d).position(ProfileUiInitOptimizeEnterThreshold.DEFAULT, ProfileUiInitOptimizeEnterThreshold.DEFAULT);
        } else {
            region2.size(0.5d, this.f14322e).position(ProfileUiInitOptimizeEnterThreshold.DEFAULT, this.f14321d);
        }
        arrayList.add(region2);
        MixStreamInfo mixStreamInfo = new MixStreamInfo();
        mixStreamInfo.setRegions(arrayList);
        mixStreamInfo.setAppData(C5217f.m11833a(this.f14311a, (List<Region>) arrayList, i, i2, list2));
        return mixStreamInfo;
    }
}
