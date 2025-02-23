package com.davidnguyen.demo.minio.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;

@Service
@Profile("aws-s3")
public class AwsStorageService implements StorageService {

    @Override
    public void upload(List<MultipartFile> files) {
        //TODO
    }

    @Override
    public InputStream download(String fileName) {
        //TODO
        return null;
    }

    @Override
    public String getURL(String fileName) {
        //TODO
        return "";
    }
}
