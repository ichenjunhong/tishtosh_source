package com.p683ss.avframework.livestreamv2;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.p683ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import com.p683ss.avframework.buffer.JavaI420Buffer;
import com.p683ss.avframework.buffer.VideoFrame;
import com.p683ss.avframework.buffer.VideoFrame.TextureBuffer;
import com.p683ss.avframework.buffer.VideoFrame.TextureBuffer.Type;
import com.p683ss.avframework.opengl.GlRenderDrawer;
import com.p683ss.avframework.opengl.RendererCommon;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.VideoFrameRender */
public class VideoFrameRender {
    final float[] identityMatrix = new float[16];
    int[] mYuvTexs;

    public VideoFrameRender() {
        Matrix.setIdentityM(this.identityMatrix, 0);
    }

    /* access modifiers changed from: 0000 */
    public void release() {
        if (this.mYuvTexs != null) {
            GLES20.glDeleteTextures(this.mYuvTexs.length, this.mYuvTexs, 0);
            this.mYuvTexs = null;
        }
    }

    public boolean drawFrame(VideoFrame videoFrame, GlRenderDrawer glRenderDrawer, float[] fArr, float[] fArr2, int i, int i2, int i3, int i4) {
        android.graphics.Matrix matrix;
        float[] fArr3;
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        boolean z = videoFrame.getBuffer() instanceof TextureBuffer;
        boolean z2 = videoFrame.getBuffer() instanceof JavaI420Buffer;
        if (z) {
            matrix = ((TextureBuffer) videoFrame.getBuffer()).getTransformMatrix();
        } else if (z2) {
            matrix = new android.graphics.Matrix();
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preScale(1.0f, -1.0f);
            matrix.preTranslate(-0.5f, -0.5f);
        } else {
            matrix = null;
        }
        android.graphics.Matrix matrix2 = matrix;
        Matrix.rotateM(fArr4, 0, (float) videoFrame.getRotation(), 0.0f, 0.0f, 1.0f);
        if (fArr2 != null) {
            Matrix.multiplyMM(fArr4, 0, this.identityMatrix, 0, fArr2, 0);
        }
        if (matrix2 != null) {
            float[] fArr5 = fArr4;
            Matrix.multiplyMM(fArr5, 0, this.identityMatrix, 0, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2), 0);
        }
        if (z) {
            TextureBuffer textureBuffer = (TextureBuffer) videoFrame.getBuffer();
            if (textureBuffer.getType() == Type.OES) {
                return glRenderDrawer.drawOes(textureBuffer.getTextureId(), fArr, fArr4, i, i2, i3, i4);
            }
            return glRenderDrawer.drawRgb(textureBuffer.getTextureId(), fArr, fArr4, i, i2, i3, i4);
        }
        JavaI420Buffer javaI420Buffer = (JavaI420Buffer) videoFrame.getBuffer();
        ByteBuffer[] byteBufferArr = {javaI420Buffer.getDataY(), javaI420Buffer.getDataU(), javaI420Buffer.getDataV()};
        int[] iArr = {javaI420Buffer.getStrideY(), javaI420Buffer.getStrideU(), javaI420Buffer.getStrideV()};
        int[] iArr2 = {javaI420Buffer.getHeight(), javaI420Buffer.getHeight() / 2, javaI420Buffer.getHeight() / 2};
        int[] iArr3 = {33984, 33985, 33986};
        if (this.mYuvTexs == null) {
            this.mYuvTexs = new int[3];
            for (int i5 = 0; i5 < 3; i5++) {
                int[] iArr4 = new int[1];
                GLES20.glGenTextures(1, iArr4, 0);
                GLES20.glActiveTexture(iArr3[i5]);
                GLES20.glBindTexture(3553, iArr4[0]);
                GLES20.glTexParameterf(3553, 10241, 9728.0f);
                GLES20.glTexParameterf(3553, VideoPreloadSizeExperiment.DEFAULT, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i5], iArr2[i5], 0, 6409, 5121, null);
                GLES20.glBindTexture(3553, 0);
                this.mYuvTexs[i5] = iArr4[0];
            }
        }
        for (int i6 = 0; i6 < 3; i6++) {
            GLES20.glActiveTexture(iArr3[i6]);
            GLES20.glBindTexture(3553, this.mYuvTexs[i6]);
            GLES20.glTexSubImage2D(3553, 0, 0, 0, iArr[i6], iArr2[i6], 6409, 5121, byteBufferArr[i6]);
            GLES20.glBindTexture(3553, 0);
        }
        if (fArr == null) {
            fArr3 = this.identityMatrix;
        } else {
            fArr3 = fArr;
        }
        return glRenderDrawer.drawYuv(this.mYuvTexs, fArr3, fArr4, i, i2, i3, i4);
    }
}
