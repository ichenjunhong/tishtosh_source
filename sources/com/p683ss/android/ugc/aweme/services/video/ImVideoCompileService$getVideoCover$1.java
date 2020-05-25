package com.p683ss.android.ugc.aweme.services.video;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.p683ss.android.vesdk.C50753r;
import com.p683ss.android.vesdk.VEUtils;
import java.nio.ByteBuffer;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.video.ImVideoCompileService$getVideoCover$1 */
final class ImVideoCompileService$getVideoCover$1<T> implements C2205y<T> {
    final /* synthetic */ int $maxHeight;
    final /* synthetic */ int $maxWidth;
    final /* synthetic */ String $videoFilePath;
    final /* synthetic */ ImVideoCompileService this$0;

    ImVideoCompileService$getVideoCover$1(ImVideoCompileService imVideoCompileService, String str, int i, int i2) {
        this.this$0 = imVideoCompileService;
        this.$videoFilePath = str;
        this.$maxWidth = i;
        this.$maxHeight = i2;
    }

    public final void subscribe(final C2204x<String> xVar) {
        C52711k.m112240b(xVar, "emitter");
        VEUtils.getVideoFrames(this.$videoFilePath, new int[]{0}, new C50753r(this) {
            final /* synthetic */ ImVideoCompileService$getVideoCover$1 this$0;

            {
                this.this$0 = r1;
            }

            public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
                C52711k.m112240b(byteBuffer, "byteBuffer");
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
                createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(byteBuffer.array()));
                if (createBitmap != null) {
                    this.this$0.this$0.scaleBitmap(createBitmap, this.this$0.$maxWidth, this.this$0.$maxHeight);
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.this$0.$videoFilePath);
                    sb.append("_video_cover");
                    String sb2 = sb.toString();
                    this.this$0.this$0.saveBitmapToLocal(createBitmap, sb2);
                    ImVideoCompileService imVideoCompileService = this.this$0.this$0;
                    C2204x xVar = xVar;
                    C52711k.m112236a((Object) xVar, "emitter");
                    imVideoCompileService.safeOnSingleNext(xVar, sb2);
                } else {
                    ImVideoCompileService imVideoCompileService2 = this.this$0.this$0;
                    C2204x xVar2 = xVar;
                    C52711k.m112236a((Object) xVar2, "emitter");
                    imVideoCompileService2.safeOnSingleNext(xVar2, "");
                }
                return false;
            }
        });
    }
}
