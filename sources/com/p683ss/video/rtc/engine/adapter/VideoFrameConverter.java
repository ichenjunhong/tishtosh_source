package com.p683ss.video.rtc.engine.adapter;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import org.webrtc.JavaI420Buffer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoFrame.I420Buffer;

/* renamed from: com.ss.video.rtc.engine.adapter.VideoFrameConverter */
public class VideoFrameConverter {
    private static int MAX_BYTE_BUFFER_POOL_SIZE = 5;
    private ArrayList<ByteBufferHolder> byteBufferPool = new ArrayList<>();
    private ByteBuffer[] byteBuffers = new ByteBuffer[3];
    final int[] steps = new int[2];
    final int[] strides = new int[3];

    /* renamed from: com.ss.video.rtc.engine.adapter.VideoFrameConverter$ByteBufferHolder */
    protected static class ByteBufferHolder {
        private ByteBuffer byteBuffer;
        public volatile boolean isPending;

        protected ByteBufferHolder() {
        }

        public boolean isPending() {
            return this.isPending;
        }

        public ByteBuffer getByteBuffer() {
            if (this.byteBuffer != null) {
                this.byteBuffer.clear();
            }
            return this.byteBuffer;
        }

        public byte[] getArray() {
            if (this.byteBuffer == null) {
                return null;
            }
            this.byteBuffer.clear();
            return this.byteBuffer.array();
        }

        public void setByteBuffer(ByteBuffer byteBuffer2) {
            this.byteBuffer = byteBuffer2;
        }

        public void setPending(boolean z) {
            this.isPending = z;
        }
    }

    /* renamed from: com.ss.video.rtc.engine.adapter.VideoFrameConverter$I420BufferWrapper */
    static class I420BufferWrapper {
        private I420Buffer i420Buffer;
        private boolean needManualRelease;

        public I420Buffer getBuffer() {
            return this.i420Buffer;
        }

        public void release() {
            if ((this.i420Buffer instanceof JavaI420Buffer) && this.needManualRelease) {
                this.i420Buffer.release();
            }
        }

        public I420BufferWrapper(VideoFrame videoFrame) {
            if (videoFrame.getBuffer() instanceof JavaI420Buffer) {
                this.i420Buffer = (JavaI420Buffer) videoFrame.getBuffer();
                this.needManualRelease = false;
                return;
            }
            this.i420Buffer = videoFrame.getBuffer().toI420();
            this.needManualRelease = true;
            videoFrame.getBuffer().release();
        }
    }

    private ByteBufferHolder getPendingBuffer() {
        Iterator it = this.byteBufferPool.iterator();
        while (it.hasNext()) {
            ByteBufferHolder byteBufferHolder = (ByteBufferHolder) it.next();
            if (!byteBufferHolder.isPending) {
                byteBufferHolder.setPending(true);
                return byteBufferHolder;
            }
        }
        return null;
    }

    public VideoFrameConverter() {
        for (int i = 0; i < MAX_BYTE_BUFFER_POOL_SIZE; i++) {
            this.byteBufferPool.add(new ByteBufferHolder());
        }
    }

    public ByteBufferHolder convert2YUV(VideoFrame videoFrame) {
        ByteBufferHolder pendingBuffer = getPendingBuffer();
        if (pendingBuffer == null) {
            return null;
        }
        int width = videoFrame.getBuffer().getWidth();
        int height = videoFrame.getBuffer().getHeight();
        I420BufferWrapper i420BufferWrapper = new I420BufferWrapper(videoFrame);
        I420Buffer buffer = i420BufferWrapper.getBuffer();
        boolean convertRawYUV2ByteHolder = convertRawYUV2ByteHolder(pendingBuffer, buffer.getDataY(), buffer.getDataU(), buffer.getDataV(), buffer.getStrideY(), buffer.getStrideU(), buffer.getStrideV(), width, height);
        i420BufferWrapper.release();
        if (!convertRawYUV2ByteHolder) {
            return null;
        }
        return pendingBuffer;
    }

    public void checkReuseByteBuffer(int i, ByteBufferHolder byteBufferHolder) {
        if (byteBufferHolder.getByteBuffer() == null || byteBufferHolder.getByteBuffer().capacity() < i) {
            ByteBuffer allocate = ByteBuffer.allocate(i);
            allocate.order(ByteOrder.nativeOrder());
            byteBufferHolder.setByteBuffer(allocate);
        }
    }

    public ByteBuffer convertRawYUV2ByteArray(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5) {
        byte[] bArr4 = bArr2;
        byte[] bArr5 = bArr3;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.order(ByteOrder.nativeOrder());
        allocateDirect.put(bArr);
        allocateDirect.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(bArr4.length);
        allocateDirect2.order(ByteOrder.nativeOrder());
        allocateDirect2.put(bArr4);
        allocateDirect2.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(bArr5.length);
        allocateDirect3.order(ByteOrder.nativeOrder());
        allocateDirect3.put(bArr5);
        allocateDirect3.position(0);
        ByteBuffer allocate = ByteBuffer.allocate(((i4 * i5) * 3) / 2);
        allocate.clear();
        convertRawYUV2ByteArray(allocate.array(), allocateDirect, allocateDirect2, allocateDirect3, i, i2, i3, i4, i5);
        return allocate;
    }

    public boolean convertRawYUV2ByteHolder(ByteBufferHolder byteBufferHolder, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5) {
        ByteBufferHolder byteBufferHolder2 = byteBufferHolder;
        checkReuseByteBuffer(((i4 * i5) * 3) / 2, byteBufferHolder);
        return convertRawYUV2ByteArray(byteBufferHolder.getArray(), byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3, i4, i5);
    }

    private boolean convertRawYUV2ByteArray(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7 = ((i5 * i4) * 3) / 2;
        byteBuffer.clear();
        byteBuffer2.clear();
        byteBuffer3.clear();
        if (bArr == null || i7 > bArr.length) {
            return false;
        }
        this.byteBuffers[0] = byteBuffer;
        this.byteBuffers[1] = byteBuffer2;
        this.byteBuffers[2] = byteBuffer3;
        this.strides[0] = i;
        this.strides[1] = i2;
        this.strides[2] = i3;
        this.steps[0] = i4;
        this.steps[1] = (i4 + 1) / 2;
        int i8 = 0;
        for (int i9 = 0; i9 < this.byteBuffers.length; i9++) {
            ByteBuffer byteBuffer4 = this.byteBuffers[i9];
            int i10 = this.strides[i9];
            if (i9 == 0) {
                i6 = this.steps[0];
            } else {
                i6 = this.steps[1];
            }
            int i11 = i10 - i6;
            if (i10 == i6) {
                int remaining = byteBuffer4.remaining();
                byteBuffer4.get(bArr, i8, remaining);
                i8 += remaining;
            } else {
                while (byteBuffer4.hasRemaining()) {
                    if (byteBuffer4.position() + i6 <= byteBuffer4.capacity()) {
                        byteBuffer4.get(bArr, i8, i6);
                        i8 += i6;
                        if (byteBuffer4.hasRemaining()) {
                            byteBuffer4.position(byteBuffer4.position() + i11);
                        }
                    }
                }
            }
        }
        this.byteBuffers[0] = null;
        this.byteBuffers[1] = null;
        this.byteBuffers[2] = null;
        return true;
    }
}
