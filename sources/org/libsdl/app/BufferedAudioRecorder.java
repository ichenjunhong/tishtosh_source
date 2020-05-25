package org.libsdl.app;

import android.media.AudioRecord;
import com.p683ss.android.medialib.p1179a.C19218a;
import com.p683ss.android.medialib.presenter.C19361d.C19374a;
import com.p683ss.android.ttve.monitor.C20114g;
import com.p683ss.android.vesdk.C50792y;

public class BufferedAudioRecorder {
    protected static int channelConfigOffset = -1;
    protected static int[] channelConfigSuggested = {12, 16, 1};
    protected static int sampleRateOffset = -1;
    protected static int[] sampleRateSuggested = {44100, 8000, 11025, 16000, 22050};
    AudioRecord audio;
    final int audioFormat = 2;
    int audioSource = 1;
    int bufferSizeInBytes;
    int channelConfig = -1;
    private final int encodeChannels;
    private final int encodeSampleRate;
    boolean isRecording;
    boolean isStopPCMCallback;
    boolean isStopped;
    public long mAudioRecordStartTime;
    C19218a mProcessThread;
    public C19374a mStateCallback;
    AudioRecorderInterfaceExt presenter;
    int sampleRateInHz = -1;

    class AudioRecorderRunnable implements Runnable {
        private double speed;
        boolean startFeeding;

        public void run() {
            byte[] bArr = new byte[BufferedAudioRecorder.this.bufferSizeInBytes];
            BufferedAudioRecorder.this.isStopped = false;
            BufferedAudioRecorder.this.isStopPCMCallback = false;
            BufferedAudioRecorder.this.mProcessThread = new C19218a(BufferedAudioRecorder.this.presenter, BufferedAudioRecorder.this.presenter);
            C19218a aVar = BufferedAudioRecorder.this.mProcessThread;
            StringBuilder sb = new StringBuilder();
            sb.append(C50792y.m109908a());
            sb.append(": ");
            sb.append(C50792y.m109912c());
            C50792y.m109909a("AudioDataProcessThread", sb.toString());
            synchronized (aVar.f53003b) {
                if (aVar.f53005d) {
                    C50792y.m109913c("AudioDataProcessThread", "thread already running");
                } else {
                    aVar.f53005d = true;
                    new Thread(aVar, "AudioDataProcessThread").start();
                    while (!aVar.f53004c) {
                        try {
                            aVar.f53003b.wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
            if (this.startFeeding) {
                BufferedAudioRecorder.this.mProcessThread.mo39599a(BufferedAudioRecorder.this.sampleRateInHz, BufferedAudioRecorder.this.getChannelCount(BufferedAudioRecorder.this.channelConfig), this.speed);
            }
            try {
                if (BufferedAudioRecorder.this.audio != null && BufferedAudioRecorder.this.audio.getState() != 0) {
                    BufferedAudioRecorder.this.audio.startRecording();
                    if (BufferedAudioRecorder.this.audio == null || BufferedAudioRecorder.this.audio.getRecordingState() == 3) {
                        if (BufferedAudioRecorder.this.mStateCallback != null) {
                            BufferedAudioRecorder.this.mStateCallback.mo40418a(3);
                        }
                        int i = 0;
                        boolean z = false;
                        while (BufferedAudioRecorder.this.isRecording) {
                            if (BufferedAudioRecorder.this.audio != null) {
                                i = BufferedAudioRecorder.this.audio.read(bArr, 0, BufferedAudioRecorder.this.bufferSizeInBytes);
                            }
                            if (-3 == i) {
                                StringBuilder sb2 = new StringBuilder("bad audio buffer len ");
                                sb2.append(i);
                                C50792y.m109914d("BufferedAudioRecorder", sb2.toString());
                            } else if (i > 0) {
                                if (BufferedAudioRecorder.this.mAudioRecordStartTime != 0) {
                                    C20114g.m49645a(0, "te_record_audio_first_frame", System.currentTimeMillis() - BufferedAudioRecorder.this.mAudioRecordStartTime);
                                    BufferedAudioRecorder.this.mAudioRecordStartTime = 0;
                                }
                                try {
                                    if (BufferedAudioRecorder.this.isRecording && !BufferedAudioRecorder.this.isStopPCMCallback) {
                                        BufferedAudioRecorder.this.presenter.addPCMData(bArr, i);
                                    }
                                    if (BufferedAudioRecorder.this.mProcessThread.mo39601a() && !BufferedAudioRecorder.this.isStopped) {
                                        BufferedAudioRecorder.this.mProcessThread.mo39600a(bArr, i);
                                    }
                                } catch (Exception unused2) {
                                }
                            } else {
                                if (!(BufferedAudioRecorder.this.audio == null || BufferedAudioRecorder.this.audio.getRecordingState() == 3 || z)) {
                                    BufferedAudioRecorder.this.presenter.recordStatus(false);
                                    z = true;
                                }
                                Thread.sleep(50);
                            }
                        }
                        return;
                    }
                    if (BufferedAudioRecorder.this.mStateCallback != null) {
                        BufferedAudioRecorder.this.mStateCallback.mo40418a(-603);
                    }
                    BufferedAudioRecorder.this.presenter.recordStatus(false);
                    StringBuilder sb3 = new StringBuilder("audio starRecording failed! Stop immediately! cur status ");
                    sb3.append(BufferedAudioRecorder.this.audio.getRecordingState());
                    C50792y.m109914d("BufferedAudioRecorder", sb3.toString());
                    BufferedAudioRecorder.this.unInit();
                }
            } catch (Exception e) {
                try {
                    if (BufferedAudioRecorder.this.audio != null) {
                        BufferedAudioRecorder.this.audio.release();
                    }
                } catch (Exception unused3) {
                }
                BufferedAudioRecorder.this.audio = null;
                StringBuilder sb4 = new StringBuilder("audio recording failed!");
                sb4.append(e);
                C50792y.m109914d("BufferedAudioRecorder", sb4.toString());
            }
        }

        public AudioRecorderRunnable(double d, boolean z) {
            this.speed = d;
            this.startFeeding = z;
        }
    }

    public int getChannelCount(int i) {
        return 16 == i ? 1 : 2;
    }

    public void markRecordStop() {
        synchronized (this) {
            this.isStopped = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r0.f53009h = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void discard() {
        /*
            r3 = this;
            com.ss.android.medialib.a.a r0 = r3.mProcessThread
            if (r0 == 0) goto L_0x0017
            com.ss.android.medialib.a.a r0 = r3.mProcessThread
            java.lang.Object r1 = r0.f53003b
            monitor-enter(r1)
            boolean r2 = r0.f53004c     // Catch:{ all -> 0x0014 }
            if (r2 != 0) goto L_0x000f
            monitor-exit(r1)     // Catch:{ all -> 0x0014 }
            return
        L_0x000f:
            monitor-exit(r1)     // Catch:{ all -> 0x0014 }
            r1 = 1
            r0.f53009h = r1
            goto L_0x0017
        L_0x0014:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0014 }
            throw r0
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.libsdl.app.BufferedAudioRecorder.discard():void");
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        if (this.audio != null) {
            try {
                if (this.audio.getState() != 0) {
                    this.audio.stop();
                }
                this.audio.release();
            } catch (Exception unused) {
            }
            this.audio = null;
        }
        super.finalize();
    }

    public synchronized boolean isProcessing() {
        boolean z;
        if (this.mProcessThread == null || !this.mProcessThread.mo39601a()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    public void unInit() {
        if (this.isRecording) {
            stopRecording();
        }
        synchronized (this) {
            if (this.audio != null) {
                try {
                    if (!(this.audio.getState() == 0 || this.audio.getRecordingState() == 1)) {
                        this.audio.stop();
                    }
                    this.audio.release();
                } catch (Exception unused) {
                }
                this.audio = null;
            }
        }
        C50792y.m109909a("BufferedAudioRecorder", "unInit()");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        if (r0.f53010i == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void waitUtilAudioProcessDone() {
        /*
            r5 = this;
            com.ss.android.medialib.a.a r0 = r5.mProcessThread
            if (r0 == 0) goto L_0x0037
            com.ss.android.medialib.a.a r0 = r5.mProcessThread
            java.lang.Object r1 = r0.f53011j
            monitor-enter(r1)
            java.lang.Object r2 = r0.f53003b     // Catch:{ all -> 0x0034 }
            monitor-enter(r2)     // Catch:{ all -> 0x0034 }
            com.ss.android.medialib.a.a$b r3 = r0.f53002a     // Catch:{ all -> 0x0031 }
            r4 = 1
            boolean r3 = r3.hasMessages(r4)     // Catch:{ all -> 0x0031 }
            monitor-exit(r2)     // Catch:{ all -> 0x0031 }
            if (r3 != 0) goto L_0x001a
            boolean r2 = r0.f53010i     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x002f
        L_0x001a:
            java.lang.String r2 = "AudioDataProcessThread"
            java.lang.String r3 = "waiting audio process start"
            com.p683ss.android.medialib.p1180b.C19226c.m46859a(r2, r3)     // Catch:{ all -> 0x0034 }
            java.lang.Object r0 = r0.f53011j     // Catch:{ InterruptedException -> 0x0028 }
            r2 = 5000(0x1388, double:2.4703E-320)
            r0.wait(r2)     // Catch:{ InterruptedException -> 0x0028 }
        L_0x0028:
            java.lang.String r0 = "AudioDataProcessThread"
            java.lang.String r2 = "waiting audio process done"
            com.p683ss.android.medialib.p1180b.C19226c.m46859a(r0, r2)     // Catch:{ all -> 0x0034 }
        L_0x002f:
            monitor-exit(r1)     // Catch:{ all -> 0x0034 }
            return
        L_0x0031:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0031 }
            throw r0     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0034 }
            throw r0
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.libsdl.app.BufferedAudioRecorder.waitUtilAudioProcessDone():void");
    }

    public boolean stopFeeding() {
        C50792y.m109909a("BufferedAudioRecorder", "stopFeeding() called");
        if (this.isRecording && this.audio == null) {
            C50792y.m109914d("BufferedAudioRecorder", "stopFeeding: 状态异常，重置状态");
            this.isRecording = false;
            this.isStopped = true;
            if (this.mProcessThread != null) {
                this.mProcessThread.mo39602b();
            }
            return false;
        } else if (!this.isRecording || this.mProcessThread == null) {
            C50792y.m109914d("BufferedAudioRecorder", "stopFeeding 失败，请先调用startRecording");
            return false;
        } else if (!this.mProcessThread.mo39601a()) {
            C50792y.m109914d("BufferedAudioRecorder", "stopFeeding 失败，请先startFeeding再stopFeeding");
            return false;
        } else {
            C19218a aVar = this.mProcessThread;
            C50792y.m109913c("AudioDataProcessThread", "stopFeeding");
            synchronized (aVar.f53003b) {
                if (!aVar.f53004c) {
                    C50792y.m109913c("AudioDataProcessThread", "startFeeding not ready");
                } else {
                    aVar.f53002a.sendMessage(aVar.f53002a.obtainMessage(1));
                }
            }
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        com.p683ss.android.ttve.monitor.C20114g.m49645a(0, "te_record_audio_stop_record_time", java.lang.System.currentTimeMillis() - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean stopRecording() {
        /*
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()
            monitor-enter(r7)
            boolean r2 = r7.isRecording     // Catch:{ all -> 0x0045 }
            r3 = 0
            if (r2 != 0) goto L_0x000c
            monitor-exit(r7)     // Catch:{ all -> 0x0045 }
            return r3
        L_0x000c:
            r7.isRecording = r3     // Catch:{ all -> 0x0045 }
            android.media.AudioRecord r2 = r7.audio     // Catch:{ all -> 0x0045 }
            r4 = 1
            if (r2 == 0) goto L_0x0029
            android.media.AudioRecord r2 = r7.audio     // Catch:{ all -> 0x0045 }
            int r2 = r2.getState()     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0030
            android.media.AudioRecord r2 = r7.audio     // Catch:{ all -> 0x0045 }
            int r2 = r2.getRecordingState()     // Catch:{ all -> 0x0045 }
            if (r2 == r4) goto L_0x0030
            android.media.AudioRecord r2 = r7.audio     // Catch:{ all -> 0x0045 }
            r2.stop()     // Catch:{ all -> 0x0045 }
            goto L_0x0030
        L_0x0029:
            java.lang.String r2 = "BufferedAudioRecorder"
            java.lang.String r5 = "未启动音频模块但调用stopRecording"
            com.p683ss.android.vesdk.C50792y.m109914d(r2, r5)     // Catch:{ all -> 0x0045 }
        L_0x0030:
            com.ss.android.medialib.a.a r2 = r7.mProcessThread     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0039
            com.ss.android.medialib.a.a r2 = r7.mProcessThread     // Catch:{ all -> 0x0045 }
            r2.mo39602b()     // Catch:{ all -> 0x0045 }
        L_0x0039:
            monitor-exit(r7)     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = "te_record_audio_stop_record_time"
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r0
            com.p683ss.android.ttve.monitor.C20114g.m49645a(r3, r2, r5)
            return r4
        L_0x0045:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0045 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.libsdl.app.BufferedAudioRecorder.stopRecording():boolean");
    }

    public void setAudioRecordStateCallack(C19374a aVar) {
        this.mStateCallback = aVar;
    }

    public void stopPCMCallback(boolean z) {
        synchronized (this) {
            this.isStopPCMCallback = z;
        }
    }

    public boolean startFeeding(double d) {
        StringBuilder sb = new StringBuilder("startFeeding() called with: speed = [");
        sb.append(d);
        sb.append("]");
        C50792y.m109909a("BufferedAudioRecorder", sb.toString());
        if (!this.isRecording || this.mProcessThread == null) {
            C50792y.m109913c("BufferedAudioRecorder", "startFeeding 录音未启动，将先启动startRecording");
            startRecording(d, true);
            return true;
        } else if (this.mProcessThread.mo39601a()) {
            C50792y.m109913c("BufferedAudioRecorder", "startFeeding 失败，已经调用过一次了");
            return false;
        } else {
            this.isStopped = false;
            this.isStopPCMCallback = false;
            this.mProcessThread.mo39599a(this.sampleRateInHz, getChannelCount(this.channelConfig), d);
            return true;
        }
    }

    public void init(int i) {
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        this.audioSource = i;
        if (this.audio != null) {
            C50792y.m109914d("BufferedAudioRecorder", "second time audio init(), skip");
            return;
        }
        int i6 = 2;
        int i7 = -1;
        try {
            if (!(channelConfigOffset == -1 || sampleRateOffset == -1)) {
                this.channelConfig = channelConfigSuggested[channelConfigOffset];
                this.sampleRateInHz = sampleRateSuggested[sampleRateOffset];
                this.bufferSizeInBytes = AudioRecord.getMinBufferSize(this.sampleRateInHz, this.channelConfig, 2);
                AudioRecord audioRecord = new AudioRecord(i, this.sampleRateInHz, this.channelConfig, 2, this.bufferSizeInBytes);
                this.audio = audioRecord;
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("使用预设配置");
            sb.append(channelConfigOffset);
            sb.append(",");
            sb.append(sampleRateOffset);
            sb.append("实例化audio recorder失败，重新测试配置。");
            sb.append(e);
            C50792y.m109914d("BufferedAudioRecorder", sb.toString());
            this.audio = null;
            this.presenter.lackPermission();
        }
        int i8 = 1;
        if (this.audio == null) {
            channelConfigOffset = -1;
            int[] iArr2 = channelConfigSuggested;
            int length = iArr2.length;
            int i9 = 0;
            boolean z = false;
            while (i9 < length) {
                this.channelConfig = iArr2[i9];
                channelConfigOffset++;
                sampleRateOffset = i7;
                int[] iArr3 = sampleRateSuggested;
                int length2 = iArr3.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        i2 = i9;
                        break;
                    }
                    int i11 = iArr3[i10];
                    sampleRateOffset++;
                    try {
                        this.bufferSizeInBytes = AudioRecord.getMinBufferSize(i11, this.channelConfig, i6);
                        StringBuilder sb2 = new StringBuilder("试用hz ");
                        sb2.append(i11);
                        sb2.append(" ");
                        sb2.append(this.channelConfig);
                        sb2.append(" 2");
                        C50792y.m109914d("BufferedAudioRecorder", sb2.toString());
                        if (this.bufferSizeInBytes > 0) {
                            this.sampleRateInHz = i11;
                            int i12 = this.channelConfig;
                            r2 = r2;
                            i5 = i11;
                            i3 = i10;
                            i4 = length2;
                            int i13 = i12;
                            iArr = iArr3;
                            i2 = i9;
                            try {
                                AudioRecord audioRecord2 = new AudioRecord(i, this.sampleRateInHz, i13, 2, this.bufferSizeInBytes);
                                this.audio = audioRecord2;
                                z = true;
                                break;
                            } catch (Exception e2) {
                                e = e2;
                                this.sampleRateInHz = 0;
                                this.audio = null;
                                StringBuilder sb3 = new StringBuilder("apply audio record sample rate ");
                                sb3.append(i5);
                                sb3.append(" failed: ");
                                sb3.append(e.getMessage());
                                C50792y.m109914d("BufferedAudioRecorder", sb3.toString());
                                sampleRateOffset++;
                                i10 = i3 + 1;
                                length2 = i4;
                                i9 = i2;
                                iArr3 = iArr;
                                i6 = 2;
                            }
                        } else {
                            int i14 = i11;
                            i3 = i10;
                            i4 = length2;
                            iArr = iArr3;
                            i2 = i9;
                            sampleRateOffset++;
                            i10 = i3 + 1;
                            length2 = i4;
                            i9 = i2;
                            iArr3 = iArr;
                            i6 = 2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        i5 = i11;
                        i3 = i10;
                        i4 = length2;
                        iArr = iArr3;
                        i2 = i9;
                        this.sampleRateInHz = 0;
                        this.audio = null;
                        StringBuilder sb32 = new StringBuilder("apply audio record sample rate ");
                        sb32.append(i5);
                        sb32.append(" failed: ");
                        sb32.append(e.getMessage());
                        C50792y.m109914d("BufferedAudioRecorder", sb32.toString());
                        sampleRateOffset++;
                        i10 = i3 + 1;
                        length2 = i4;
                        i9 = i2;
                        iArr3 = iArr;
                        i6 = 2;
                    }
                }
                if (z) {
                    break;
                }
                i9 = i2 + 1;
                i6 = 2;
                i7 = -1;
            }
        }
        if (this.sampleRateInHz <= 0) {
            StringBuilder sb4 = new StringBuilder("!Init audio recorder failed, hz ");
            sb4.append(this.sampleRateInHz);
            C50792y.m109914d("BufferedAudioRecorder", sb4.toString());
            return;
        }
        if (this.channelConfig != 16) {
            i8 = 2;
        }
        this.presenter.initAudioConfig(this.sampleRateInHz, i8, this.encodeSampleRate, this.encodeChannels);
        StringBuilder sb5 = new StringBuilder("Init audio recorder succeed, apply audio record sample rate ");
        sb5.append(this.sampleRateInHz);
        sb5.append(" channels ");
        sb5.append(i8);
        sb5.append(" buffer ");
        sb5.append(this.bufferSizeInBytes);
        sb5.append(" state ");
        sb5.append(this.audio.getState());
        sb5.append(" encodeSampleRate ");
        sb5.append(this.encodeSampleRate);
        sb5.append(" encodeChannels ");
        sb5.append(this.encodeChannels);
        C50792y.m109909a("BufferedAudioRecorder", sb5.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        new java.lang.Thread(new org.libsdl.app.BufferedAudioRecorder.AudioRecorderRunnable(r4, r5, r7)).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        java.lang.Runtime.getRuntime().gc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        java.lang.Thread.sleep(100);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        java.lang.System.runFinalization();
        new java.lang.Thread(new org.libsdl.app.BufferedAudioRecorder.AudioRecorderRunnable(r4, r5, r7)).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startRecording(double r5, boolean r7) {
        /*
            r4 = this;
            java.lang.String r0 = "BufferedAudioRecorder"
            java.lang.String r1 = "startRecording() called"
            com.p683ss.android.vesdk.C50792y.m109909a(r0, r1)
            long r0 = java.lang.System.currentTimeMillis()
            r4.mAudioRecordStartTime = r0
            monitor-enter(r4)
            boolean r0 = r4.isRecording     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = "BufferedAudioRecorder"
            java.lang.String r1 = "recorder is started"
            com.p683ss.android.vesdk.C50792y.m109913c(r0, r1)     // Catch:{ all -> 0x0072 }
            if (r7 == 0) goto L_0x001e
            r4.startFeeding(r5)     // Catch:{ all -> 0x0072 }
        L_0x001e:
            monitor-exit(r4)     // Catch:{ all -> 0x0072 }
            return
        L_0x0020:
            android.media.AudioRecord r0 = r4.audio     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x0036
            int r0 = r4.audioSource     // Catch:{ all -> 0x0072 }
            r4.init(r0)     // Catch:{ all -> 0x0072 }
            android.media.AudioRecord r0 = r4.audio     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x0036
            java.lang.String r5 = "BufferedAudioRecorder"
            java.lang.String r6 = "recorder is null"
            com.p683ss.android.vesdk.C50792y.m109914d(r5, r6)     // Catch:{ all -> 0x0072 }
            monitor-exit(r4)     // Catch:{ all -> 0x0072 }
            return
        L_0x0036:
            r0 = 1
            r4.isRecording = r0     // Catch:{ all -> 0x0072 }
            monitor-exit(r4)     // Catch:{ all -> 0x0072 }
            java.lang.Thread r0 = new java.lang.Thread     // Catch:{ OutOfMemoryError -> 0x0048 }
            org.libsdl.app.BufferedAudioRecorder$AudioRecorderRunnable r1 = new org.libsdl.app.BufferedAudioRecorder$AudioRecorderRunnable     // Catch:{ OutOfMemoryError -> 0x0048 }
            r1.<init>(r5, r7)     // Catch:{ OutOfMemoryError -> 0x0048 }
            r0.<init>(r1)     // Catch:{ OutOfMemoryError -> 0x0048 }
            r0.start()     // Catch:{ OutOfMemoryError -> 0x0048 }
            goto L_0x0064
        L_0x0048:
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            r0.gc()
            r0 = 100
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0054 }
        L_0x0054:
            java.lang.System.runFinalization()
            java.lang.Thread r0 = new java.lang.Thread
            org.libsdl.app.BufferedAudioRecorder$AudioRecorderRunnable r1 = new org.libsdl.app.BufferedAudioRecorder$AudioRecorderRunnable
            r1.<init>(r5, r7)
            r0.<init>(r1)
            r0.start()
        L_0x0064:
            r5 = 0
            java.lang.String r6 = "te_record_audio_start_record_time"
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.mAudioRecordStartTime
            long r0 = r0 - r2
            com.p683ss.android.ttve.monitor.C20114g.m49645a(r5, r6, r0)
            return
        L_0x0072:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0072 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.libsdl.app.BufferedAudioRecorder.startRecording(double, boolean):void");
    }

    public BufferedAudioRecorder(AudioRecorderInterfaceExt audioRecorderInterfaceExt, int i, int i2) {
        this.presenter = audioRecorderInterfaceExt;
        this.encodeSampleRate = i;
        this.encodeChannels = i2;
    }
}
