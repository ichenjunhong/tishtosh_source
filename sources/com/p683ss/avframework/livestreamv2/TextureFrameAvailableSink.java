package com.p683ss.avframework.livestreamv2;

import android.graphics.Matrix;
import com.p683ss.avframework.buffer.VideoFrame;
import com.p683ss.avframework.buffer.VideoFrame.IExtraData;
import com.p683ss.avframework.buffer.VideoFrame.TextureBuffer;
import com.p683ss.avframework.buffer.VideoFrame.TextureBuffer.Type;
import com.p683ss.avframework.engine.VideoSink;
import com.p683ss.avframework.livestreamv2.ILiveStream.ITextureFrameAvailableListener;
import com.p683ss.avframework.opengl.RendererCommon;
import com.p683ss.avframework.utils.AVLog;
import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.ss.avframework.livestreamv2.TextureFrameAvailableSink */
public class TextureFrameAvailableSink extends VideoSink {
    private EGLContext mEGLContext11;
    private ByteBuffer mExtraBuffer;
    private int mHeight;
    private ITextureFrameAvailableListener mListener;
    private int mWidth;

    public void OnDiscardedFrame() {
    }

    public void setListener(ITextureFrameAvailableListener iTextureFrameAvailableListener) {
        this.mListener = iTextureFrameAvailableListener;
    }

    public void onFrame(VideoFrame videoFrame) {
        boolean z;
        int i;
        ByteBuffer byteBuffer;
        int i2;
        ITextureFrameAvailableListener iTextureFrameAvailableListener = this.mListener;
        if (iTextureFrameAvailableListener != null) {
            if (this.mEGLContext11 == null) {
                EGL egl = EGLContext.getEGL();
                if (egl instanceof EGL10) {
                    this.mEGLContext11 = ((EGL10) egl).eglGetCurrentContext();
                }
            }
            int rotatedWidth = videoFrame.getRotatedWidth();
            int rotatedHeight = videoFrame.getRotatedHeight();
            if (videoFrame == null || !(videoFrame.getBuffer() instanceof TextureBuffer)) {
                AVLog.m110008e("TextureFrameAvailableSink", "Unsupport format");
                return;
            }
            TextureBuffer textureBuffer = (TextureBuffer) videoFrame.getBuffer();
            Matrix transformMatrix = textureBuffer.getTransformMatrix();
            if (videoFrame.getRotation() != 0) {
                Matrix matrix = new Matrix();
                matrix.reset();
                matrix.preTranslate(0.5f, 0.5f);
                matrix.preRotate((float) (-videoFrame.getRotation()));
                matrix.preTranslate(-0.5f, -0.5f);
                if (transformMatrix != null) {
                    matrix.preConcat(transformMatrix);
                }
                transformMatrix = matrix;
            }
            float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(transformMatrix);
            int textureId = textureBuffer.getTextureId();
            if (textureBuffer.getType() == Type.OES) {
                z = true;
            } else {
                z = false;
            }
            IExtraData extraData = videoFrame.getExtraData();
            if (extraData != null) {
                if (this.mExtraBuffer == null) {
                    i2 = extraData.peekParcelSize();
                } else {
                    int readParcel = extraData.readParcel(this.mExtraBuffer);
                    if (readParcel < 0) {
                        int peekParcelSize = extraData.peekParcelSize();
                        if (this.mExtraBuffer.capacity() > peekParcelSize) {
                            StringBuilder sb = new StringBuilder("Read parcel error. extraBuffer ");
                            sb.append(peekParcelSize);
                            sb.append(" VS ");
                            sb.append(this.mExtraBuffer.capacity());
                            AVLog.ioe("TextureFrameAvailableSink", sb.toString());
                        } else {
                            i2 = peekParcelSize;
                        }
                    }
                    i = readParcel;
                }
                this.mExtraBuffer = ByteBuffer.allocateDirect(i2);
                i = extraData.readParcel(this.mExtraBuffer);
            } else {
                i = 0;
            }
            if (i > 0) {
                this.mExtraBuffer.position(0);
                this.mExtraBuffer.limit(i);
                byteBuffer = this.mExtraBuffer.slice();
            } else {
                byteBuffer = null;
            }
            iTextureFrameAvailableListener.onTextureFrameAvailable(this.mEGLContext11, textureId, z, rotatedWidth, rotatedHeight, videoFrame.getTimestampNs(), convertMatrixFromAndroidGraphicsMatrix, byteBuffer);
        }
    }

    protected TextureFrameAvailableSink(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
    }
}
