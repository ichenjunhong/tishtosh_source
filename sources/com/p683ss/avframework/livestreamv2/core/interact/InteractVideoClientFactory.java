package com.p683ss.avframework.livestreamv2.core.interact;

import com.p683ss.avframework.effect.EffectWrapper.AlgorithmResult;
import com.p683ss.avframework.livestreamv2.core.InteractEngine;
import com.p683ss.avframework.livestreamv2.core.LiveCore.ILiveCoreTextureFrameAvailableListener;
import com.p683ss.avframework.opengl.GLThreadManager;
import com.p683ss.avframework.utils.AVLog;
import com.p683ss.video.rtc.interact.video.VideoClient;
import com.p683ss.video.rtc.interact.video.VideoClientFactory;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.InteractVideoClientFactory */
class InteractVideoClientFactory implements ILiveCoreTextureFrameAvailableListener, VideoClientFactory {
    private String TAG = "InteractVideoClientFactory";
    private InteractEngine mEngine;
    private ByteBuffer mSeiBuffer;
    private List<String> mSeiList = new ArrayList();
    private ArrayList<ILiveCoreTextureFrameAvailableListener> mVideoClients = new ArrayList<>();

    private int peekSeiSize() {
        int size;
        synchronized (this.mSeiList) {
            size = this.mSeiList.size();
        }
        return size;
    }

    private String popSei() {
        String str;
        synchronized (this.mSeiList) {
            if (!this.mSeiList.isEmpty()) {
                str = (String) this.mSeiList.remove(0);
            } else {
                str = null;
            }
        }
        return str;
    }

    public VideoClient create() {
        InteractVideoClient interactVideoClient;
        AVLog.m110007d(this.TAG, "Create video client ");
        synchronized (this.mVideoClients) {
            if (this.mVideoClients.isEmpty()) {
                this.mEngine.addTextureFrameAvailableListener(this);
            }
            interactVideoClient = new InteractVideoClient();
            this.mVideoClients.add(interactVideoClient);
        }
        return interactVideoClient;
    }

    private ByteBuffer getExtraSei() {
        String popSei = popSei();
        if (popSei != null) {
            if (this.mSeiBuffer == null) {
                this.mSeiBuffer = ByteBuffer.allocateDirect(popSei.length() + 16);
            }
            int i = 3;
            int i2 = 0;
            while (true) {
                int i3 = i - 1;
                if (i <= 0) {
                    break;
                }
                i2 = AlgorithmResult.buildBufferFromString(popSei, this.mSeiBuffer);
                if (i2 != 0) {
                    break;
                }
                this.mSeiBuffer = ByteBuffer.allocateDirect(this.mSeiBuffer.capacity() * 2);
                i = i3;
            }
            if (i2 > 0) {
                this.mSeiBuffer.position(0);
                this.mSeiBuffer.limit(i2);
                return this.mSeiBuffer.slice();
            }
        }
        return null;
    }

    public InteractVideoClientFactory(InteractEngine interactEngine) {
        this.mEngine = interactEngine;
    }

    private void pushSei(String str) {
        synchronized (this.mSeiList) {
            this.mSeiList.add(str);
            if (this.mSeiList.size() > 30) {
                AVLog.m110008e(this.TAG, "SEI buffer overflow with drop old sei...");
                this.mSeiList.remove(0);
            }
        }
    }

    public void destroy(VideoClient videoClient) {
        AVLog.m110007d(this.TAG, "Destroy video client ");
        synchronized (this.mVideoClients) {
            this.mVideoClients.remove((InteractVideoClient) videoClient);
            if (this.mVideoClients.isEmpty()) {
                this.mEngine.addTextureFrameAvailableListener(this);
                this.mEngine.removeTextureFrameAvailableListener(this);
            }
        }
    }

    public void needSaveSei(String str, Object obj) {
        int size;
        synchronized (this.mVideoClients) {
            size = this.mVideoClients.size();
        }
        if (size <= 0 || !(obj instanceof JSONObject)) {
            String str2 = this.TAG;
            StringBuilder sb = new StringBuilder("Ignore sei size ");
            sb.append(size);
            sb.append(" is json ");
            sb.append(obj instanceof JSONObject);
            AVLog.logToIODevice2(6, str2, sb.toString(), null, "sei-json", 1000);
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str, (JSONObject) obj);
                pushSei(jSONObject.toString());
            } catch (JSONException e) {
                AVLog.ioe(this.TAG, "Saving sei failed. ", e);
            }
        }
    }

    public void onTextureFrameAvailable(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, ByteBuffer byteBuffer) {
        onTextureFrameAvailable(GLThreadManager.getEGLContext(), i, z, i2, i3, j, fArr, byteBuffer);
    }

    public void onTextureFrameAvailable(android.opengl.EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        if (byteBuffer != null || peekSeiSize() <= 0) {
            byteBuffer2 = byteBuffer;
        } else {
            byteBuffer2 = getExtraSei();
        }
        synchronized (this.mVideoClients) {
            Iterator it = this.mVideoClients.iterator();
            while (it.hasNext()) {
                ((ILiveCoreTextureFrameAvailableListener) it.next()).onTextureFrameAvailable(eGLContext, i, z, i2, i3, j, fArr, byteBuffer2);
            }
        }
    }
}
