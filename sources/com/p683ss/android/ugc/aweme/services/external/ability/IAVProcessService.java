package com.p683ss.android.ugc.aweme.services.external.ability;

import android.graphics.Bitmap;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVProcessService */
public interface IAVProcessService {

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVProcessService$CompileParam */
    public static final class CompileParam {
        private final String rawVideoPath;
        private int videoHeight;
        private int videoWidth;

        public final String getRawVideoPath() {
            return this.rawVideoPath;
        }

        public final int getVideoHeight() {
            return this.videoHeight;
        }

        public final int getVideoWidth() {
            return this.videoWidth;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CompileParam{rawVideoPath=");
            sb.append(this.rawVideoPath);
            sb.append(", videoWidth=");
            sb.append(this.videoWidth);
            sb.append(", videoHeight=");
            sb.append(this.videoHeight);
            sb.append('}');
            return sb.toString();
        }

        public final void setVideoHeight(int i) {
            this.videoHeight = i;
        }

        public final void setVideoWidth(int i) {
            this.videoWidth = i;
        }

        public CompileParam(String str, int i, int i2) {
            C52711k.m112240b(str, "rawVideoPath");
            this.rawVideoPath = str;
            this.videoWidth = i;
            this.videoHeight = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVProcessService$CompileResult */
    public static final class CompileResult {
        private String checkPic;
        private String thumbnailPath;
        private int videoHeight = -1;
        private String videoMd5;
        private String videoPath;
        private int videoWidth = -1;

        public final String getCheckPic() {
            return this.checkPic;
        }

        public final String getThumbnailPath() {
            return this.thumbnailPath;
        }

        public final int getVideoHeight() {
            return this.videoHeight;
        }

        public final String getVideoMd5() {
            return this.videoMd5;
        }

        public final String getVideoPath() {
            return this.videoPath;
        }

        public final int getVideoWidth() {
            return this.videoWidth;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CompileResult{videoPath=");
            sb.append(this.videoPath);
            sb.append(", videoMd5=");
            sb.append(this.videoMd5);
            sb.append(", checkPic=");
            sb.append(this.checkPic);
            sb.append(", thumbnailPath=");
            sb.append(this.thumbnailPath);
            sb.append(", width=");
            sb.append(this.videoWidth);
            sb.append(", height=");
            sb.append(this.videoHeight);
            sb.append('}');
            return sb.toString();
        }

        public final void setCheckPic(String str) {
            this.checkPic = str;
        }

        public final void setThumbnailPath(String str) {
            this.thumbnailPath = str;
        }

        public final void setVideoHeight(int i) {
            this.videoHeight = i;
        }

        public final void setVideoMd5(String str) {
            this.videoMd5 = str;
        }

        public final void setVideoPath(String str) {
            this.videoPath = str;
        }

        public final void setVideoWidth(int i) {
            this.videoWidth = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVProcessService$IProcessCallback */
    public interface IProcessCallback<T> {
        void finish(T t);
    }

    void addWaterMark(Bitmap bitmap, IProcessCallback<Bitmap> iProcessCallback);

    void compileVideo(CompileParam compileParam, C52671b<? super CompileResult, C52860x> bVar, C52671b<? super Throwable, C52860x> bVar2);

    void compressPhoto(String str, Integer num, Integer num2, IProcessCallback<String> iProcessCallback);

    void createWaterMarkImages(int i, int i2, String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3, IProcessCallback<String[]> iProcessCallback);

    void createWaterMarkImages(String str, String str2, String str3, String str4, boolean z, IProcessCallback<String[]> iProcessCallback);

    void muteVideo(String str, String str2, IProcessCallback<Integer> iProcessCallback);

    void remuxVideo(String str, String str2, IProcessCallback<Integer> iProcessCallback);

    void savePhoto(PhotoContext photoContext, boolean z, IProcessCallback<PhotoContext> iProcessCallback);

    void savePhoto(String str, String str2, boolean z, IProcessCallback<Boolean> iProcessCallback);
}
