package com.p683ss.avframework.livestreamv2.filter;

import android.os.Handler;
import com.p683ss.avframework.engine.AudioDeviceModule;
import com.p683ss.avframework.engine.AudioDeviceModule.AudioRenderSink;
import com.p683ss.avframework.engine.Receiver;
import com.p683ss.avframework.livestreamv2.LiveStreamBuilder;
import com.p683ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor.Callback;
import com.p683ss.avframework.utils.AVLog;
import com.p683ss.avframework.utils.TEBundle;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.filter.LiveCoreKaraokFilter */
public class LiveCoreKaraokFilter extends IAudioFilterManager {
    private final String TAG = "LiveCoreKaraokFilter";
    public AudioDeviceModule mAudioDeviceModule;
    private AudioRenderSink mAudioRenderSink;
    private float mBGMAGC = 1.0f;
    private String mBGMFile;
    private Callback mCallback;
    private final int mChannel;
    private boolean mEchoEnable = false;
    private Object mFence = new Object();
    private final Handler mHandler;
    private boolean mLoopPlayer = true;
    private boolean mNeedMixer = false;
    private boolean mNeedOrigin = true;
    private boolean mNeedReceiver;
    boolean mNeedReportEnd = false;
    private boolean mPause = false;
    private long mPlayerProgressMs = 0;
    private ByteBuffer mReadAudioBuffer;
    private Receiver mReceiver;
    private final int mSampleHz;
    private TEBundle mStreamInfo;
    private long mTotalDurationMs;
    private float mVoice = 0.5f;
    private float mVoiceEq = 0.75f;

    public boolean isDummy() {
        return false;
    }

    public String name() {
        return "LiveCoreKaraokFilter";
    }

    public void pause() {
        this.mPause = true;
    }

    public void resume() {
        this.mPause = false;
    }

    public void setAudioEq(Object obj) {
    }

    public void setAudioReverb(Object obj) {
    }

    public void setBGMMusic(String str, long j) {
    }

    public void setDRCEnable(boolean z) {
    }

    public void setMusicPitch(int i) {
    }

    public void onPause() {
        AudioDeviceModule.setMode(0);
    }

    public TEBundle getStreamInfo() {
        TEBundle tEBundle = this.mStreamInfo;
        if (tEBundle != null) {
            return tEBundle.copy();
        }
        return null;
    }

    public void onResume() {
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null && audioDeviceModule.isPlayer()) {
            AudioDeviceModule.setMode(3);
        }
    }

    public synchronized void release() {
        AVLog.iod("LiveCoreKaraokFilter", "release karaoke.");
        setEnable(false);
        this.mNeedReceiver = false;
        if (this.mReceiver != null) {
            this.mReceiver.closeStream();
            this.mReceiver.release();
            this.mReceiver = null;
        }
        if (this.mAudioRenderSink != null) {
            this.mAudioRenderSink.release();
            this.mAudioRenderSink = null;
        }
        this.mAudioDeviceModule = null;
        super.release();
    }

    public void setBGMProgressListener(Callback callback) {
        this.mCallback = callback;
    }

    public void setBGMVolume(float f) {
        this.mBGMAGC = f;
    }

    public void setVoiceVolume(float f) {
        this.mVoice = f;
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null) {
            audioDeviceModule.setMicVolume(this.mVoice);
        }
    }

    public void setLoopEnable(boolean z) {
        int i;
        this.mLoopPlayer = z;
        Receiver receiver = this.mReceiver;
        if (receiver != null) {
            TEBundle option = receiver.getOption();
            String str = "decode_stream_loop";
            if (z) {
                i = -1;
            } else {
                i = 1;
            }
            option.setInt(str, i);
            receiver.setOption(option);
            option.release();
        }
    }

    public void setMixerEnable(boolean z) {
        this.mNeedMixer = z;
        StringBuilder sb = new StringBuilder(" setMix ");
        sb.append(z);
        AVLog.iod("LiveCoreKaraokFilter", sb.toString());
    }

    public void setOriginEnable(boolean z) {
        this.mNeedOrigin = z;
        Receiver receiver = this.mReceiver;
        if (receiver != null) {
            TEBundle option = receiver.getOption();
            option.setBool("receiver_enable_origin_audio", this.mNeedOrigin);
            receiver.setOption(option);
            option.release();
        }
    }

    public void setBGMMusic(String str) {
        this.mNeedReceiver = true;
        this.mBGMFile = str;
        StringBuilder sb = new StringBuilder("setBGMFile ");
        sb.append(str);
        AVLog.iod("LiveCoreKaraokFilter", sb.toString());
        createReceiver(this.mSampleHz, this.mChannel, this.mSampleHz / 100);
    }

    public void setEchoMode(boolean z) {
        this.mEchoEnable = z;
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null) {
            if (z) {
                audioDeviceModule.enableBuiltInAEC(false);
            } else {
                audioDeviceModule.enableBuiltInAEC(true);
            }
            audioDeviceModule.enableEchoMode(z);
        }
        StringBuilder sb = new StringBuilder("setEchoMode ");
        sb.append(z);
        AVLog.iod("LiveCoreKaraokFilter", sb.toString());
    }

    public void setEnable(boolean z) {
        super.setEnable(z);
        if (z) {
            setVoiceVolume(this.mVoice);
        } else {
            AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
            if (audioDeviceModule != null) {
                audioDeviceModule.setMicVolume(1.0f);
            }
        }
        if (z) {
            if (!this.mAudioDeviceModule.isPlayer()) {
                this.mHandler.post(new Runnable() {
                    public void run() {
                        AudioDeviceModule audioDeviceModule = LiveCoreKaraokFilter.this.mAudioDeviceModule;
                        if (audioDeviceModule != null && !audioDeviceModule.isPlayer()) {
                            StringBuilder sb = new StringBuilder("startPlayer adm ");
                            sb.append(audioDeviceModule);
                            AVLog.iod("LiveCoreKaraokFilter", sb.toString());
                            audioDeviceModule.startPlayer();
                        }
                    }
                });
            } else {
                int mode = AudioDeviceModule.getMode();
                if (mode != 3) {
                    AudioDeviceModule.setMode(mode);
                }
            }
        }
        StringBuilder sb = new StringBuilder("setEnable ");
        sb.append(z);
        sb.append(" adm ");
        sb.append(this.mAudioDeviceModule);
        sb.append(" voice ");
        sb.append(this.mVoice);
        AVLog.iod("LiveCoreKaraokFilter", sb.toString());
    }

    public LiveCoreKaraokFilter(AudioDeviceModule audioDeviceModule, Handler handler, LiveStreamBuilder liveStreamBuilder) {
        this.mSampleHz = liveStreamBuilder.getAudioSampleHZ();
        this.mChannel = liveStreamBuilder.getAudioChannel();
        this.mAudioDeviceModule = audioDeviceModule;
        this.mAudioRenderSink = audioDeviceModule.createRenderSink();
        this.mNeedReceiver = true;
        this.mHandler = handler;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00aa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ac, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void createReceiver(int r5, int r6, int r7) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.mFence
            monitor-enter(r0)
            boolean r1 = r4.mNeedReceiver     // Catch:{ all -> 0x00ad }
            if (r1 == 0) goto L_0x00ab
            java.lang.String r1 = r4.mBGMFile     // Catch:{ all -> 0x00ad }
            if (r1 != 0) goto L_0x000d
            goto L_0x00ab
        L_0x000d:
            r1 = 0
            r4.mPlayerProgressMs = r1     // Catch:{ all -> 0x00ad }
            com.ss.avframework.engine.Receiver r1 = r4.mReceiver     // Catch:{ all -> 0x00ad }
            r2 = 0
            if (r1 == 0) goto L_0x0022
            com.ss.avframework.engine.Receiver r1 = r4.mReceiver     // Catch:{ all -> 0x00ad }
            r1.closeStream()     // Catch:{ all -> 0x00ad }
            com.ss.avframework.engine.Receiver r1 = r4.mReceiver     // Catch:{ all -> 0x00ad }
            r1.release()     // Catch:{ all -> 0x00ad }
            r4.mReceiver = r2     // Catch:{ all -> 0x00ad }
        L_0x0022:
            r1 = 0
            r4.mNeedReceiver = r1     // Catch:{ all -> 0x00ad }
            com.ss.avframework.receiver.NativeReceiver r1 = new com.ss.avframework.receiver.NativeReceiver     // Catch:{ all -> 0x00ad }
            r1.<init>(r2, r2)     // Catch:{ all -> 0x00ad }
            r4.mReceiver = r1     // Catch:{ all -> 0x00ad }
            com.ss.avframework.engine.Receiver r1 = r4.mReceiver     // Catch:{ all -> 0x00ad }
            com.ss.avframework.utils.TEBundle r1 = r1.getOption()     // Catch:{ all -> 0x00ad }
            java.lang.String r3 = "decode_stream_audio_channel"
            r1.setInt(r3, r6)     // Catch:{ all -> 0x00ad }
            java.lang.String r3 = "decode_stream_audio_sample"
            r1.setInt(r3, r5)     // Catch:{ all -> 0x00ad }
            java.lang.String r5 = "decode_stream_loop"
            boolean r3 = r4.mLoopPlayer     // Catch:{ all -> 0x00ad }
            if (r3 == 0) goto L_0x0044
            r3 = -1
            goto L_0x0045
        L_0x0044:
            r3 = 1
        L_0x0045:
            r1.setInt(r5, r3)     // Catch:{ all -> 0x00ad }
            java.lang.String r5 = "enable_origin_audio"
            boolean r3 = r4.mNeedOrigin     // Catch:{ all -> 0x00ad }
            r1.setBool(r5, r3)     // Catch:{ all -> 0x00ad }
            com.ss.avframework.engine.Receiver r5 = r4.mReceiver     // Catch:{ all -> 0x00ad }
            r5.setOption(r1)     // Catch:{ all -> 0x00ad }
            r1.release()     // Catch:{ all -> 0x00ad }
            com.ss.avframework.engine.Receiver r5 = r4.mReceiver     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = r4.mBGMFile     // Catch:{ all -> 0x00ad }
            int r5 = r5.openStream(r1)     // Catch:{ all -> 0x00ad }
            if (r5 == 0) goto L_0x006e
            com.ss.avframework.engine.Receiver r5 = r4.mReceiver     // Catch:{ all -> 0x00ad }
            r5.closeStream()     // Catch:{ all -> 0x00ad }
            com.ss.avframework.engine.Receiver r5 = r4.mReceiver     // Catch:{ all -> 0x00ad }
            r5.release()     // Catch:{ all -> 0x00ad }
            r4.mReceiver = r2     // Catch:{ all -> 0x00ad }
            goto L_0x00a9
        L_0x006e:
            java.nio.ByteBuffer r5 = r4.mReadAudioBuffer     // Catch:{ all -> 0x00ad }
            if (r5 != 0) goto L_0x007c
            int r7 = r7 * 2
            int r7 = r7 * r6
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r7)     // Catch:{ all -> 0x00ad }
            r4.mReadAudioBuffer = r5     // Catch:{ all -> 0x00ad }
        L_0x007c:
            com.ss.avframework.utils.TEBundle r5 = r4.mStreamInfo     // Catch:{ all -> 0x00ad }
            if (r5 == 0) goto L_0x0086
            com.ss.avframework.utils.TEBundle r5 = r4.mStreamInfo     // Catch:{ all -> 0x00ad }
            r5.clear()     // Catch:{ all -> 0x00ad }
            goto L_0x008d
        L_0x0086:
            com.ss.avframework.utils.TEBundle r5 = new com.ss.avframework.utils.TEBundle     // Catch:{ all -> 0x00ad }
            r5.<init>()     // Catch:{ all -> 0x00ad }
            r4.mStreamInfo = r5     // Catch:{ all -> 0x00ad }
        L_0x008d:
            com.ss.avframework.engine.Receiver r5 = r4.mReceiver     // Catch:{ all -> 0x00ad }
            com.ss.avframework.utils.TEBundle r6 = r4.mStreamInfo     // Catch:{ all -> 0x00ad }
            r5.getStreamInfo(r6)     // Catch:{ all -> 0x00ad }
            com.ss.avframework.utils.TEBundle r5 = r4.mStreamInfo     // Catch:{ all -> 0x00ad }
            java.lang.String r6 = "receiver_total_duration"
            long r5 = r5.getLong(r6)     // Catch:{ all -> 0x00ad }
            r4.mTotalDurationMs = r5     // Catch:{ all -> 0x00ad }
            java.lang.String r5 = "LiveCoreKaraokFilter"
            com.ss.avframework.utils.TEBundle r6 = r4.mStreamInfo     // Catch:{ all -> 0x00ad }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00ad }
            com.p683ss.avframework.utils.AVLog.iod(r5, r6)     // Catch:{ all -> 0x00ad }
        L_0x00a9:
            monitor-exit(r0)     // Catch:{ all -> 0x00ad }
            return
        L_0x00ab:
            monitor-exit(r0)     // Catch:{ all -> 0x00ad }
            return
        L_0x00ad:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ad }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.avframework.livestreamv2.filter.LiveCoreKaraokFilter.createReceiver(int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x009a, code lost:
        return r16;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002c A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x002e A[SYNTHETIC, Splitter:B:24:0x002e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.nio.Buffer process(java.nio.Buffer r16, int r17, int r18, int r19, long r20) {
        /*
            r15 = this;
            r1 = r15
            r9 = r18
            r10 = r19
            monitor-enter(r15)
            boolean r2 = r1.mEnable     // Catch:{ all -> 0x009e }
            if (r2 != 0) goto L_0x000c
            monitor-exit(r15)
            return r16
        L_0x000c:
            int r2 = r1.mSampleHz     // Catch:{ all -> 0x009e }
            r3 = 1
            if (r2 != r9) goto L_0x0015
            int r2 = r1.mChannel     // Catch:{ all -> 0x009e }
            if (r10 == r2) goto L_0x0017
        L_0x0015:
            r1.mNeedReceiver = r3     // Catch:{ all -> 0x009e }
        L_0x0017:
            com.ss.avframework.engine.Receiver r2 = r1.mReceiver     // Catch:{ all -> 0x009e }
            if (r2 == 0) goto L_0x0023
            boolean r2 = r1.mNeedReceiver     // Catch:{ all -> 0x009e }
            if (r2 == 0) goto L_0x0020
            goto L_0x0023
        L_0x0020:
            r11 = r17
            goto L_0x0028
        L_0x0023:
            r11 = r17
            r15.createReceiver(r9, r10, r11)     // Catch:{ all -> 0x009e }
        L_0x0028:
            boolean r2 = r1.mPause     // Catch:{ all -> 0x009e }
            if (r2 == 0) goto L_0x002e
            monitor-exit(r15)
            return r16
        L_0x002e:
            java.lang.Object r2 = r1.mFence     // Catch:{ all -> 0x009e }
            monitor-enter(r2)     // Catch:{ all -> 0x009e }
            com.ss.avframework.engine.Receiver r4 = r1.mReceiver     // Catch:{ all -> 0x009b }
            r12 = 0
            if (r4 == 0) goto L_0x0049
            com.ss.avframework.engine.AudioDeviceModule$AudioRenderSink r4 = r1.mAudioRenderSink     // Catch:{ all -> 0x009b }
            if (r4 == 0) goto L_0x0049
            com.ss.avframework.engine.Receiver r4 = r1.mReceiver     // Catch:{ all -> 0x009b }
            java.nio.ByteBuffer r5 = r1.mReadAudioBuffer     // Catch:{ all -> 0x009b }
            int r4 = r4.readAudioBuffer(r5)     // Catch:{ all -> 0x009b }
            if (r4 != 0) goto L_0x0046
            r4 = 1
            goto L_0x0047
        L_0x0046:
            r4 = 0
        L_0x0047:
            r13 = r4
            goto L_0x004a
        L_0x0049:
            r13 = 0
        L_0x004a:
            monitor-exit(r2)     // Catch:{ all -> 0x009b }
            com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor$Callback r14 = r1.mCallback     // Catch:{ all -> 0x009e }
            if (r13 == 0) goto L_0x008c
            long r4 = r1.mPlayerProgressMs     // Catch:{ all -> 0x009e }
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x005e
            if (r14 == 0) goto L_0x005e
            r14.start()     // Catch:{ all -> 0x009e }
            r1.mNeedReportEnd = r3     // Catch:{ all -> 0x009e }
        L_0x005e:
            long r2 = r1.mPlayerProgressMs     // Catch:{ all -> 0x009e }
            r4 = 10
            long r2 = r2 + r4
            r1.mPlayerProgressMs = r2     // Catch:{ all -> 0x009e }
            if (r14 == 0) goto L_0x006c
            long r2 = r1.mPlayerProgressMs     // Catch:{ all -> 0x009e }
            r14.onProgress(r2)     // Catch:{ all -> 0x009e }
        L_0x006c:
            java.nio.ByteBuffer r3 = r1.mReadAudioBuffer     // Catch:{ all -> 0x009e }
            float r4 = r1.mBGMAGC     // Catch:{ all -> 0x009e }
            float r5 = r1.mVoiceEq     // Catch:{ all -> 0x009e }
            boolean r8 = r1.mNeedMixer     // Catch:{ all -> 0x009e }
            r2 = r16
            r6 = r17
            r7 = r19
            com.p683ss.avframework.engine.Receiver.nativeMixer(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x009e }
            com.ss.avframework.engine.AudioDeviceModule$AudioRenderSink r2 = r1.mAudioRenderSink     // Catch:{ all -> 0x009e }
            java.nio.ByteBuffer r3 = r1.mReadAudioBuffer     // Catch:{ all -> 0x009e }
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r2.onData(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x009e }
        L_0x008c:
            if (r13 != 0) goto L_0x0099
            boolean r2 = r1.mNeedReportEnd     // Catch:{ all -> 0x009e }
            if (r2 == 0) goto L_0x0099
            if (r14 == 0) goto L_0x0099
            r14.stop()     // Catch:{ all -> 0x009e }
            r1.mNeedReportEnd = r12     // Catch:{ all -> 0x009e }
        L_0x0099:
            monitor-exit(r15)
            return r16
        L_0x009b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x009b }
            throw r0     // Catch:{ all -> 0x009e }
        L_0x009e:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.avframework.livestreamv2.filter.LiveCoreKaraokFilter.process(java.nio.Buffer, int, int, int, long):java.nio.Buffer");
    }
}
