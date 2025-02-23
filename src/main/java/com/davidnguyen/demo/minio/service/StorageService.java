package com.davidnguyen.demo.minio.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;

@Service
public interface StorageService {
    void upload(List<MultipartFile> files);
    InputStream download(String fileName);
    String getURL(String fileName);
}
