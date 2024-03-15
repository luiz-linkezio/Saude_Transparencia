package com.jr.saudeapi.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
    boolean hasCsvFormat(MultipartFile file);

    void processAndSaveData(MultipartFile file);
}
