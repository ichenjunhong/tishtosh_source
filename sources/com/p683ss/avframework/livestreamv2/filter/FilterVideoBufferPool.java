package com.p683ss.avframework.livestreamv2.filter;

import com.p683ss.avframework.buffer.GlTextureFrameBuffer;
import com.p683ss.avframework.buffer.VideoFrame.IExtraData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.avframework.livestreamv2.filter.FilterVideoBufferPool */
public class FilterVideoBufferPool {
    private final int mMaxSize;
    private List<Recycle> mPools = new ArrayList();

    /* renamed from: com.ss.avframework.livestreamv2.filter.FilterVideoBufferPool$Recycle */
    public static class Recycle implements Runnable {
        private AtomicInteger mAtomicInteger = new AtomicInteger(0);
        private IExtraData mExtraData;
        private GlTextureFrameBuffer mTextureBuffer;

        public GlTextureFrameBuffer getBuffer() {
            return this.mTextureBuffer;
        }

        public IExtraData getExtraData() {
            return this.mExtraData;
        }

        public void release() {
            this.mTextureBuffer = null;
        }

        public void run() {
            decRef();
        }

        public void addRef() {
            this.mAtomicInteger.incrementAndGet();
        }

        public void decRef() {
            this.mAtomicInteger.decrementAndGet();
        }

        public int getRefCounts() {
            return this.mAtomicInteger.get();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("tex:");
            sb.append(this.mTextureBuffer.getTextureId());
            sb.append(",fb:");
            sb.append(this.mTextureBuffer.getFrameBufferId());
            sb.append(",w:");
            sb.append(this.mTextureBuffer.getWidth());
            sb.append(",h:");
            sb.append(this.mTextureBuffer.getHeight());
            return sb.toString();
        }

        public void setExtrData(IExtraData iExtraData) {
            this.mExtraData = iExtraData;
        }

        public Recycle(GlTextureFrameBuffer glTextureFrameBuffer) {
            this.mTextureBuffer = glTextureFrameBuffer;
        }

        public void setSize(int i, int i2) {
            if (this.mTextureBuffer != null) {
                this.mTextureBuffer.setSize(i, i2);
            }
        }
    }

    public int size() {
        return this.mPools.size();
    }

    private Recycle getRecycle() {
        for (Recycle recycle : this.mPools) {
            if (recycle.getRefCounts() == 0) {
                return recycle;
            }
        }
        return null;
    }

    public Recycle pop() {
        if (this.mPools.size() > 0) {
            return (Recycle) this.mPools.remove(0);
        }
        return null;
    }

    private void add(Recycle recycle) {
        this.mPools.add(recycle);
    }

    public FilterVideoBufferPool(int i) {
        this.mMaxSize = i;
    }

    public synchronized Recycle getBuffer(int i, int i2) {
        Recycle recycle;
        recycle = getRecycle();
        if (recycle == null && this.mPools.size() < this.mMaxSize) {
            GlTextureFrameBuffer glTextureFrameBuffer = new GlTextureFrameBuffer(6408);
            Recycle recycle2 = new Recycle(glTextureFrameBuffer);
            add(recycle2);
            glTextureFrameBuffer.setSize(i, i2);
            recycle = recycle2;
        }
        if (recycle != null) {
            recycle.addRef();
        }
        return recycle;
    }
}
