package com.p683ss.ttvideoengine.debug;

import android.content.Context;
import android.os.Environment;
import android.os.Process;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Thread.State;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.ss.ttvideoengine.debug.LogCatHelper */
public class LogCatHelper {
    private static LogCatHelper INSTANCE;
    private static String PATH_LOGCAT;
    private LogDumper mLogDumper;
    public int mLogNum;
    private int mPId = Process.myPid();

    /* renamed from: com.ss.ttvideoengine.debug.LogCatHelper$LogDumper */
    class LogDumper extends Thread {
        String cmds;
        private Process logcatProc;
        private String mPID;
        private BufferedReader mReader;
        private boolean mRunning = true;
        private FileOutputStream out;

        public void stopLogs() {
            this.mRunning = false;
        }

        public void run() {
            try {
                this.logcatProc = Runtime.getRuntime().exec(this.cmds);
                this.mReader = new BufferedReader(new InputStreamReader(this.logcatProc.getInputStream()), PreloadTask.BYTE_UNIT_NUMBER);
                while (this.mRunning) {
                    String readLine = this.mReader.readLine();
                    if (readLine == null || !this.mRunning) {
                        break;
                    } else if (!(readLine.length() == 0 || this.out == null || !readLine.contains(this.mPID))) {
                        FileOutputStream fileOutputStream = this.out;
                        StringBuilder sb = new StringBuilder();
                        sb.append(readLine);
                        sb.append("\n");
                        fileOutputStream.write(sb.toString().getBytes());
                    }
                }
                if (this.logcatProc != null) {
                    this.logcatProc.destroy();
                    this.logcatProc = null;
                }
                if (this.mReader != null) {
                    try {
                        this.mReader.close();
                        this.mReader = null;
                    } catch (IOException unused) {
                    }
                }
                if (this.out != null) {
                    try {
                        this.out.close();
                    } catch (IOException unused2) {
                    }
                    this.out = null;
                }
            } catch (IOException unused3) {
                if (this.logcatProc != null) {
                    this.logcatProc.destroy();
                    this.logcatProc = null;
                }
                if (this.mReader != null) {
                    try {
                        this.mReader.close();
                        this.mReader = null;
                    } catch (IOException unused4) {
                    }
                }
                if (this.out != null) {
                    try {
                        this.out.close();
                    } catch (IOException unused5) {
                    }
                    this.out = null;
                }
            } catch (Throwable th) {
                if (this.logcatProc != null) {
                    this.logcatProc.destroy();
                    this.logcatProc = null;
                }
                if (this.mReader != null) {
                    try {
                        this.mReader.close();
                        this.mReader = null;
                    } catch (IOException unused6) {
                    }
                }
                if (this.out != null) {
                    try {
                        this.out.close();
                    } catch (IOException unused7) {
                    }
                    this.out = null;
                }
                throw th;
            }
        }

        public LogDumper(String str, String str2) {
            this.mPID = str;
            try {
                r4.mLogNum++;
                StringBuilder sb = new StringBuilder("log-");
                sb.append(LogCatHelper.this.getFileName());
                this.out = new FileOutputStream(new File(str2, sb.toString()));
            } catch (FileNotFoundException unused) {
            }
            this.cmds = "logcat -s TTVideoEngineLog";
        }
    }

    public void stop() {
        if (this.mLogDumper != null) {
            this.mLogDumper.stopLogs();
            this.mLogDumper = null;
        }
    }

    public String getFileName() {
        String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
        StringBuilder sb = new StringBuilder();
        sb.append(format);
        StringBuilder sb2 = new StringBuilder("_");
        sb2.append(this.mLogNum);
        sb2.append(".log");
        sb.append(sb2.toString());
        return sb.toString();
    }

    public void start() {
        if (this.mLogDumper == null) {
            this.mLogDumper = new LogDumper(String.valueOf(this.mPId), PATH_LOGCAT);
        }
        if (this.mLogDumper.getState().equals(State.NEW)) {
            this.mLogDumper.start();
        }
    }

    private LogCatHelper(Context context) {
        init(context);
    }

    public static LogCatHelper getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (LogCatHelper.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LogCatHelper(context);
                }
            }
        }
        return INSTANCE;
    }

    public void init(Context context) {
        if (Environment.getExternalStorageState().equals("mounted")) {
            StringBuilder sb = new StringBuilder();
            sb.append(Environment.getExternalStorageDirectory().getAbsolutePath());
            sb.append(File.separator);
            sb.append("videoengine_debug");
            PATH_LOGCAT = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getFilesDir().getAbsolutePath());
            sb2.append(File.separator);
            PATH_LOGCAT = sb2.toString();
        }
        File file = new File(PATH_LOGCAT);
        if (!file.exists()) {
            file.mkdirs();
        }
    }
}
