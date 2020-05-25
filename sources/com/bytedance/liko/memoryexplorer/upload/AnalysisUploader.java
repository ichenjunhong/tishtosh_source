package com.bytedance.liko.memoryexplorer.upload;

import com.alibaba.fastjson.JSON;
import com.bytedance.liko.memoryexplorer.MemoryConfig;
import com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult;
import com.bytedance.liko.memoryexplorer.report.model.UploadData;
import com.bytedance.liko.memoryexplorer.report.model.UploadHeader;
import com.bytedance.liko.memoryexplorer.report.model.UploadModel;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import okhttp3.C53498ab;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53500ac;
import okhttp3.C53504ad;
import okhttp3.C53524e;
import okhttp3.C53526f;
import okhttp3.C53678w;
import okhttp3.C53682y;

public class AnalysisUploader {
    private static UploadHeader assembleHeader(MemoryConfig memoryConfig) {
        UploadHeader uploadHeader = new UploadHeader();
        uploadHeader.aid = memoryConfig.aid;
        uploadHeader.channel = memoryConfig.channel;
        uploadHeader.device_id = memoryConfig.device_id;
        uploadHeader.app_version = memoryConfig.app_version;
        uploadHeader.update_version_code = memoryConfig.update_versioncode;
        uploadHeader.current_update_version_code = memoryConfig.update_versioncode;
        uploadHeader.os_version = memoryConfig.os_version;
        uploadHeader.os_api = memoryConfig.os_api;
        uploadHeader.device_model = memoryConfig.device_model;
        uploadHeader.device_brand = memoryConfig.device_brand;
        uploadHeader.device_manufacturer = memoryConfig.device_manufacturer;
        uploadHeader.process_name = memoryConfig.packageName;
        uploadHeader.version_name = memoryConfig.versionName;
        uploadHeader.version_code = memoryConfig.versioncode;
        uploadHeader.region = memoryConfig.region;
        return uploadHeader;
    }

    public static void uploadAnalysis(MemoryConfig memoryConfig, ExplorerAnalysisResult explorerAnalysisResult) {
        System.out.println("start uploadAnalysis");
        uploadToSlardar(explorerAnalysisResult, memoryConfig);
    }

    private static UploadModel assembleUploadModel(ExplorerAnalysisResult explorerAnalysisResult, MemoryConfig memoryConfig) {
        UploadHeader assembleHeader = assembleHeader(memoryConfig);
        List<UploadData> assembleData = assembleData(explorerAnalysisResult, memoryConfig);
        UploadModel uploadModel = new UploadModel();
        uploadModel.data = assembleData;
        uploadModel.header = assembleHeader;
        return uploadModel;
    }

    private static List<UploadData> assembleData(ExplorerAnalysisResult explorerAnalysisResult, MemoryConfig memoryConfig) {
        ArrayList arrayList = new ArrayList(1);
        UploadData uploadData = new UploadData();
        uploadData.memory_object = explorerAnalysisResult;
        if (!"local_test".equals(memoryConfig.channel)) {
            uploadData.memory_object.type = "oom";
        }
        arrayList.add(uploadData);
        return arrayList;
    }

    private static void uploadToSlardar(ExplorerAnalysisResult explorerAnalysisResult, MemoryConfig memoryConfig) {
        UploadModel assembleUploadModel = assembleUploadModel(explorerAnalysisResult, memoryConfig);
        if (memoryConfig.uploadToSlardar) {
            C53678w a = C53678w.m114225a("application/json; charset=utf-8");
            C53682y yVar = new C53682y();
            C53498ab c = new C53499a().mo111262a(memoryConfig.SERVERURL).mo111265a(C53500ac.create(a, JSON.toJSONString(assembleUploadModel))).mo111272c();
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append(memoryConfig.SERVERURL);
            sb.append("\n");
            printStream.println(sb.toString());
            yVar.mo111325a(c).mo111246a(new C53526f() {
                public final void onFailure(C53524e eVar, IOException iOException) {
                    System.out.println(iOException.toString());
                }

                public final void onResponse(C53524e eVar, C53504ad adVar) {
                    System.out.println(adVar.toString());
                    adVar.close();
                }
            });
        }
    }
}
